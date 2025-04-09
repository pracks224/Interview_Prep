1. “When you make healthy choices, self-discipline is strengthened; on the other hand, making unhealthy choices diminishes self-discipline. If you find it difficult to say no to sweet treats, you can’t stick to an exercise routine”-The Power of Discipline: Walter, Daniel

2. “Consistency builds momentum and that’s how dreams become a reality. When you are aware of what discipline demands, you are more likely to choose to do the right thing.”

3. “The Sunk Cost Fallacy”

   People fall into the sunk cost fallacy when they make decisions that are influenced by past investments (which cannot be recovered) rather than by rational evaluation of the current situation. Like watching bad movie after pay for the movie ticket

4. ### Sample Introduction

I am a Technical Manager with over 15 years of experience in full-stack Java/nodejs development, specializing in microservices architecture, cloud solutions, and enterprise application management. Currently leading teams at HCL, I have a proven track record of driving digital transformation, optimizing IT operations, and delivering scalable solutions. My expertise spans application architecture, cloud administration (AWS/Azure/GCP), and end-to-end project management. I am passionate about leveraging technology to enhance business efficiency and am eager to contribute my skills especially retail and e-commerce digital initiatives.

### Responsibilities Of a Technical Manager

What a Technical Managers responsibility:
* Techincal Responsibility
     - Systems & Infrastructure Management - ensure smooth runnings of servers network db etch
     - Incident & Problem Management - 
     - IT Service Management (ITSM)
     - Monitoring & Alerting
     - Security & Compliance - Ensure endpoint security, patch management, access control, and audit trails.
* Team and Vendor Managemeny
* Process and stratergy
  - Service Improvement
  - Change & Release Management
  - Business Continuity & Disaster Recovery - chaos engineering with Chaos Mesh or Gremlin
* Reporting and Communication
     - Stakeholder Communication
     - IT Operations Reporting
 
### 2 Describe a time you led a high-pressure release with multiple teams.

-  You can highlight about the KYC update and premium change deadline increased the spike, so we have gone for the event based design
-  One of the key real-time sync challenges we handled was during claim status changes. Our old system used batch syncs which delayed updates to customer apps by up to 30 minutes. We moved to an event-driven architecture using Kafka, where claim events were consumed and reflected in all channels — reducing sync time to under 3 seconds.
-  Customer KYC Sync Across Systems
-   When a customer uploads KYC (PAN, Aadhaar, etc.), the update needs to reflect across:
     * CRM
     * Customer portal
     * Underwriting systems
     * Regulatory reporting systems (e.g., IRDAI audit logs)
- Real-Time Sync Issue:
  * If one system (e.g., CRM) updates but others lag behind, underwriters may reject or delay policies.
  * Also causes duplicate verification calls/email
- Pricing Rule Changes - Quote engine full cycle of deployment

  What I did for this ::

  - Situation:
Last year at HCL, I led a high-pressure release for a critical feature — a real-time inventory sync system for a large retail client. This was tied to a major marketing event, so any delay or bug could affect customer trust and revenue.

- Task:
I was responsible for coordinating the release across four teams: frontend (React), backend (Java microservices), DevOps, and QA. We had to deliver within two weeks, and integrate with external vendors’ APIs — all while maintaining uptime and rollback readiness.

- Action:
I kicked off daily standups across teams and used a shared release board to track dependencies. I proactively identified a bottleneck in API rate limits from a third-party warehouse system and worked with DevOps to implement a rate-limiting proxy with Redis.
I also created a blue-green deployment strategy with rollback hooks and ran a pre-prod simulation under load using JMeter and AppDynamics to profile performance.
To reduce QA bottlenecks, I introduced automated test gates in our Jenkins pipeline and arranged parallel validation for critical paths.

- Result:
The release went live on time with zero downtime, and post-release metrics showed a 40% reduction in inventory sync latency. Leadership recognized it as a model rollout process, and we reused the same blueprint for future releases.

