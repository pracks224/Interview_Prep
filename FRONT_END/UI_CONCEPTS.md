**Table of content:**

- [React](#react)
- [Angular](#angular)
- [Micro-Front-End](#micro-front-end)
  - [Module Federation](#module-federation)
  - [Angular Element](#angular-element)

<a id="micro-front-end"></a>

#### Micro Front End (MF)

[more details](https://newsletter.systemdesign.one/p/micro-frontends)
[all materials](https://github.com/billyjov/microfrontend-resources?tab=readme-ov-file)

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

- User ==> Container App Server ====> Calls the Micro Front End Servers
- A separate server can be set up to render Micro Frontends. And a container app server can be installed to interact with relevant Micro Frontend servers on demand.
- Also each Micro Frontend should get an independent deployment pipeline. Because it reduces the scope and the associated risk.
- There are 2 ways to organize Micro Frontend code:
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

<a id="micro-front-end"></a>

#### Module Federation

- Module Federation is a feature introduced in Webpack 5 that allows multiple independent applications to share code and dependencies at runtime.
- This concept is particularly useful in micro-frontend architectures, where different parts of a web application can be developed, deployed, and updated independently.
- One app (remote app) exposes the module and host application access the remote app.

<a id="angular"></a>

## Angular

#### What is Component ?

##### Ans :

#### Observables

- Observables represent streams of data over time — like a sequence of events, async data, or multiple values.
- They can emit zero or more values, either synchronously or asynchronously.
- Observers subscribe to these streams to react to emitted data or events.

### How do you optimize Angular app performance?

#### Ans :

- Use webworkers for heavy tasks, Move heavy computations to background threads.
- Debounce Input Events; Don’t hit API on every keystroke
- Use Production Build, Always build with --prod for minified, tree-shaken bundles. Tree Shaking & Lazy Imports .
- You might import a big library like this:
  ``` import { add, subtract, multiply } from 'math-lib'; ```
  But if you only use add, tree shaking will remove subtract and multiply from the final bundle.
  Angular uses Webpack and Terser for tree shaking during a production build
- Use OnPush Change Detection,Prevents unnecessary checks across the component tree.
  ```
  @Component({ changeDetection: ChangeDetectionStrategy.OnPush})
  ```

- Use Lazy Loading , reduces the size of the main module
  ```
  const routes: Routes = [
  { path: 'admin', loadChildren: () => import('./admin/admin.module').then(m => m.AdminModule) }];
  ```

- Avoid Unnecessary *ngIf and Loops.Use trackBy in *ngFor to avoid DOM re-creation
  ``` <li *ngFor="let item of items; trackBy: trackByFn">{{ item.name }}</li> ```

### Q. Explain a scenario where you improved the performance of an Angular application.
### Q. how you would communicate between sibling components that do not have a direct parent-child relationship.

Ans:
- You have two components:
- <ComponentA> — sends data and <ComponentB> — receives and reacts to that data
- They are siblings under the same parent but don't talk directly.
- Create a Shared Service ,then use it send data in COmponentA and read data in ComponentB
-  ```
   import { Injectable } from '@angular/core';
    import { Subject } from 'rxjs';

    @Injectable({ providedIn: 'root' })
    export class CommunicationService {
    private dataSubject = new Subject<string>();
    data$ = this.dataSubject.asObservable();

    sendData(data: string) {
    this.dataSubject.next(data);
    }
    }

   ```
