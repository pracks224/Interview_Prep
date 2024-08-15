### [Spring Security](https://medium.com/@a.zagarella/spring-security-basic-authentication-and-role-based-authorization-04fa626f961a)

1.  What are some essential features of Spring Security?
2.  What is Spring security authentication and authorization?
3.  What do you mean by basic authentication?
4.  What do you mean by digest authentication?
5.  What do you mean by session management in Spring Security?
6.  Explain SecurityContext and SecurityContext Holder in Spring security.
7.  Explain spring security OAuth2.
8.  What do you mean by OAuth2 Authorization code grant type?
9.  What is method security and why do we need it?
10. What do you mean by HASHING in spring security?
11. Explain salting and its usage.
12. What is PasswordEncoder?
13. Explain AbstractSecurityInterceptor in spring security?
14. Is security a cross-cutting concern?
15. What is SpEL (Spring Expression Language)?
16. Name security annotations that are allowed to use SpEL.
17. Explain what is AuthenticationManager in Spring security.
18. Explain what is ProviderManager in Spring security.
19. What is JWT?
20. What is Spring Security Filter Chain?
21. Explain how the security filter chain works.
22. Name some predefined filters used in spring security and write their functions.
23. What do you mean by principal in Spring security?
24. Can you explain what is DelegatingFilterProxy in spring security?
25. Can you explain what is FilterChainProxy in spring security?
26. What is the intercept-url pattern and why do we need it?
27. Does order matter in the intercept-url pattern? If yes, then in which order should we write it?
28. State the difference between ROLE_USER and ROLE_ANONYMOUS in a spring intercept-url configuration.
29. State the difference between @PreAuthorize and @Secured in Spring security.
30. State the difference between @Secured and @RolesAllowed.

#### Digest Authentication

Digest Authentication is an authentication protocol that enhances security over basic authentication by hashing credentials before transmission. It is used to authenticate users when accessing web resources by sending a hashed value (digest) of the user's credentials instead of transmitting the credentials (username and password) directly over the network.

- The server sends a challenge (a unique value known as a nonce) to the client.
- The client combines the user's credentials (username and password) with the nonce and applies a hashing algorithm (usually MD5) to create a digest.
- This digest, along with other relevant information (like username and nonce), is sent back to the server.

### @Secured and @RolesAllowed:

1. Annotation Source and Specification
   @Secured: This annotation is part of Spring Security and is specific to the Spring framework. It's not a standard Java EE annotation.
   @RolesAllowed: This annotation is part of the Java EE (JSR-250) specification and can be used in any Java EE-compliant environment, including Spring.
2. Role Prefix Requirement
   @Secured: Roles used with @Secured often require the ROLE* prefix (e.g., @Secured("ROLE_ADMIN")). This is because Spring Security typically expects roles to follow this convention.
   @RolesAllowed: There is no requirement for the ROLE* prefix in @RolesAllowed. You can define roles without this prefix (e.g., @RolesAllowed("ADMIN")), but Spring Security can be configured to expect it.
3. Array of Roles
   @Secured: Accepts a list of roles but doesn't allow combining them with logical operators. All roles in the list are required.
   @RolesAllowed: Accepts an array of roles, any of which can grant access (logical OR operation).
4. Security Configuration
   @Secured: To use @Secured, you need to enable method security using @EnableGlobalMethodSecurity(securedEnabled = true) in your Spring Security configuration.
   @RolesAllowed: To use @RolesAllowed, you need to enable JSR-250 annotations using @EnableGlobalMethodSecurity(jsr250Enabled = true).
5. Flexibility
   @Secured: Provides more flexibility within Spring Security, allowing you to use other Spring-specific features.
   @RolesAllowed: More standardized and portable, but slightly less flexible within the Spring ecosystem compared to @Secured.
6. Use Cases
   @Secured: Preferred in Spring-only projects where you want to leverage Spring Security’s full power.
   @RolesAllowed: Useful in projects that require compatibility with Java EE standards or where the same codebase might be deployed in both Spring and Java EE environments.
7. Combination with Other Security Annotations
   @Secured: Can be easily combined with other Spring Security annotations like @PreAuthorize or @PostAuthorize.
   @RolesAllowed: Generally used on its own, focusing on role-based access rather than complex authorization expressions.
   In summary, while both annotations serve a similar purpose in controlling access based on user roles, @Secured is more tightly integrated with Spring Security and offers more flexibility, while @RolesAllowed is a standardized annotation that is more portable across different Java EE environments.

### @preAuthorize Vs @postAuthorize

@PreAuthorize and @PostAuthorize are annotations in Spring Security used for method-level security, but they serve different purposes. Here’s an explanation with a scenario:

1. @PreAuthorize
   Purpose: @PreAuthorize is used to check authorization before a method is executed. It determines whether the method should be allowed to execute based on the provided security expression.

Use Case: You want to verify that a user has the necessary permissions before accessing a resource or performing an action.

Scenario:
Let's say you have a service that allows users to view employee details, but only if they have the ROLE_MANAGER authority.

2. @PostAuthorize
   Purpose: @PostAuthorize is used to check authorization after the method has executed. It allows you to perform checks on the returned value and determine if the result should be returned to the user.

Use Case: You want to allow the method execution but restrict access to the returned data based on the security context.

Scenario:
Suppose you want to allow any user to request employee details, but after fetching the data, you want to ensure that only managers can see the details of employees who report to them.

Key Differences:
Timing:
@PreAuthorize: Authorization check occurs before method execution.
@PostAuthorize: Authorization check occurs after method execution.
Scenarios:
@PreAuthorize: Ideal for preventing method execution if the user lacks required permissions.
@PostAuthorize: Useful when the method execution is allowed, but access to the result should be conditionally controlled.
Summary:
Use @PreAuthorize when you want to block the execution of a method based on the user’s role or permissions.
Use @PostAuthorize when you want to allow the method to run but restrict access to the returned data based on the user’s role or permissions.

### Authentication Manager

- In Spring Security, the AuthenticationManager is a core component responsible for processing authentication requests. It acts as the central interface for authenticating users based on credentials provided (e.g., username and password) and returning an Authentication object upon successful authentication. Here’s a detailed explanation:

- Key Responsibilities:

  - Authenticate Users: The AuthenticationManager takes an Authentication object containing credentials (e.g., username and password) and attempts to authenticate it.
  - Return Authentication Object: If the authentication is successful, it returns a fully populated Authentication object containing the user's details, including roles and authorities.
  - Throw Exceptions: If authentication fails (e.g., invalid credentials), the AuthenticationManager throws an AuthenticationException.

  Common Implementation:
  The most commonly used implementation of AuthenticationManager in Spring Security is ProviderManager, which delegates to a list of AuthenticationProvider instances.
  Example Scenario:
  Consider a simple scenario where users log in with a username and password:

A user submits their credentials (username and password) through a login form.
Spring Security's filter intercepts the request and creates an Authentication token.
The AuthenticationManager receives this token and delegates the authentication process to a configured AuthenticationProvider (e.g., DaoAuthenticationProvider for username/password authentication).
The AuthenticationProvider validates the credentials (e.g., by checking them against a database).
If successful, the AuthenticationManager returns an authenticated Authentication object, granting access to the application.
If unsuccessful, an exception is thrown, and the user is denied access.

#### Explain this code

```
http
            .authorizeRequests()
                .anyRequest().authenticated()
                .and()
            .oauth2Login()
                .and()
            .oauth2ResourceServer()
                .jwt();
```

1. http.authorizeRequests()
   Purpose: Configures authorization for incoming HTTP requests.
   Details: This method is used to define the access rules for different URLs in the application.
2. .anyRequest().authenticated()
   Purpose: Specifies that any request to the application must be authenticated.
   Details: This means that every request requires the user to be authenticated. If a request is made without authentication, the user is redirected to an OAuth2 login page (since oauth2Login() is configured) or, if it's an API request, it will expect a valid JWT token.
3. .and()
   Purpose: Chains additional configuration options.
   Details: The and() method is used to continue configuring the HttpSecurity object after setting up authorization rules.
4. .oauth2Login()
   Purpose: Enables OAuth2 login for the application.

Details: This method configures the application to use OAuth2 login, which typically involves redirecting the user to an external OAuth2 provider (e.g., Google, Facebook, or a corporate identity provider) for authentication. After successful authentication, the user is redirected back to the application with an authorization code that is exchanged for an access token.

OAuth2 Authentication Flow: When a user accesses a protected resource, they are redirected to the OAuth2 provider for login. Upon successful authentication, the provider returns an authorization code, which the application exchanges for an access token and optionally a refresh token. The access token is used to authenticate the user in the application. 5. .and()
Purpose: Continues the configuration for further settings.
Details: The and() method allows for chaining additional configurations after enabling OAuth2 login. 6. .oauth2ResourceServer()
Purpose: Configures the application to act as an OAuth2 resource server.
Details: This method enables the application to protect its resources (APIs) using OAuth2 tokens. It expects incoming requests to have a valid JWT in the Authorization header to grant access to the APIs. 7. .jwt()
Purpose: Configures the application to validate JWT tokens.

Details: This method tells Spring Security to expect JWT tokens for authentication in API requests. The application will validate the JWT token’s signature, expiration, and claims before allowing access to protected resources.

JWT Token Validation: When a request is made to the application, Spring Security will extract the JWT token from the Authorization header, validate it, and then use the information in the token (such as the user’s identity and roles) to authorize the request.

Explain this Code

```
http
    .authorizeRequests()
        .anyRequest().authenticated()
        .and()
    .formLogin()
        .and()
    .httpBasic();

```

1. http.authorizeRequests()
   Purpose: Configures authorization for incoming HTTP requests.
   Details: This is the starting point for defining which requests require authentication and what kind of access (e.g., role-based) is required.
2. .anyRequest().authenticated()
   Purpose: Specifies that any request to the application must be authenticated.
   Details: This means that every single request to the server must come from an authenticated user, regardless of the URL or HTTP method. If a user is not authenticated, they will be redirected to a login page (in the case of form-based login) or prompted for basic authentication credentials.
3. .and()
   Purpose: Chains additional configuration options.
   Details: The and() method is used to continue configuring the HttpSecurity object after setting up authorization rules.
4. .formLogin()
   Purpose: Configures form-based authentication.
   Details: This enables a default login form provided by Spring Security. When an unauthenticated user tries to access a secured page, they are redirected to this login form. Once the user submits valid credentials, they are authenticated, and access is granted.
5. .and()
   Purpose: Chains further configuration settings.
   Details: Continues the configuration to add another authentication method.
6. .httpBasic()
   Purpose: Configures HTTP Basic authentication.
   Details: This enables basic authentication, where the user is prompted to enter a username and password via a browser's built-in dialog box. The credentials are then sent in the Authorization header as a Base64-encoded string. This is a simpler and less user-friendly approach compared to form login, but it can be useful for APIs or internal tools.
