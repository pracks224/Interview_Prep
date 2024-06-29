**Table of content:**

- [React](#react)
- [Angular](#angular)
- [Micro-Front-End](#micro-front-end)

<a id="micro-front-end"></a>

#### Micro Front End (MF)

[more details](https://newsletter.systemdesign.one/p/micro-frontends)

#### What is MF?

It's the extension of Micro service, Domain driven and can independently deployed
Technology agnostic ,apps can be built on differnt framewroks like angular,react,vue etc 

#### When to use Micro Front End?

- Medium to Large web project, productivit first and handle few overheads .
- Must have automation ready

#### Advantages of Microfront End

- Small project, now also single page and server side rendering always a good option 3.<a id="3"></a>
  The advantages of Micro Frontends are:
- Fast delivery due to isolated deployments
- Fast development cycle due to flexible tech stack and simple codebase
- Improved maintainability and testability due to a small codebase
- Scalable development due to autonomous teams
- Low initial load time because Micro Frontends get loaded on demand
- High reliability because modules are independent
- A low entry barrier for new developers due to small codebase and bounded context
- A decoupled system due to distributed architecture
- Low coupling due to explicit data flow between different parts of the application
- Easy rollback with a version switch
- Faster product feedback via incremental upgrades on the parts of the app
- Easy to update or rewrite parts of the Frontend
- Easy to experiment with new technology in an isolated way

#### Dis-advantages of Microfrontend   

The disadvantages of Micro Frontends are:

- Increased complexity due to operational overhead

- Extra work to maintain a consistent user experience

- High pushback from stakeholders to have visual consistency

- Potential distributed monolith problem due to changing needs

- Increased load time when the user navigates across the app. Because relevant Micro Frontend needs to be loaded

- High bandwidth usage due to duplicate dependencies in Micro Frontends

- Fragmented ways of work due to increased team autonomy

- Increased operational and governance complexity due to many repositories, tools, and deployment pipelines.

  #### MF Frameworks ?
- Luigi
- Bit
- Frint.js
- Open Components
  #### How to implement Microfontend?

-  User ==> Container App Server ====> Calls the Micro Front End Servers
-  A separate server can be set up to render Micro Frontends. And a container app server can be installed to interact with relevant Micro Frontend servers on demand.
-  Also each Micro Frontend should get an independent deployment pipeline. Because it reduces the scope and the associated risk.
-  There are 2 ways to organize Micro Frontend code:
    - Mono Repo : Uses a single repository to share code and libraries.
    - Poly Repo : Gives one repository per Micro Frontend. It keeps the code base independent.
- 2 types of Micro Frontends based on composition Build Time & Run Time
  
##### Micro Frontend Build Time Integration
Micro Frontend gets published as a package. And container application includes it as a dependency.

But this approach creates coupling at the release stage. Put another way, a change in any Micro Frontend needs a release of every Micro Frontend.

So it's better to avoid build-time integration.
```
{
  "name": "@frontend/container",
  "version": "2.7.1",
  "description": "A micro frontends app",
  "dependencies": {
    "@frontend/micro-app-1": "^3.1.9",
    "@frontend/micro-app-2": "^8.2.1",
  }
}
```
##### Micro Frontend Runtime Integration
The composition occurs at runtime and the Micro Frontend can be updated on a browser refresh.

The different ways to set up runtime integration are: A .iframes B.JavaScript C.Web Components

#### Communication Between Micro Frontends : 

Micro Frontends shouldn't share their state but communicate via messages or events. Besides communication between Micro Frontends should be kept minimal to prevent coupling.

The ways Micro Frontends could communicate with each other are:

Custom events

Passing callbacks

Routing by using the address bar as a communication mechanism

Web workers
