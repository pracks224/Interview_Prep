**Table of content:**

#### Iteration 1

- [GIT](#git)
- [DEVOPS](#devops)
- [SONARCUBE](#sonarcube)

<a id="git"></a>

#### Git workflow

- Feature Branch -> Commit the changes ->push the feature branch to remote repo ->create PR to merge to development branch

<a id="devops"></a>

- ##### 1.What is Continuous Integration, and why is it important in DevOps?
- ##### 2.What is Continuous Delivery, and how does it differ from Continuous Deployment?
- ##### 3.What is Infrastructure as Code (IaC), and how does it benefit DevOps?
- ##### 4.Can you explain the concept of “Continuous Feedback” in DevOps?
- ##### 5.Can you explain how you use Docker in your projects?
- ##### 6.How familiar are you with Kubernetes?
- ##### 7.Can you walk us through your CI/CD pipeline? (Very Important)

1. CI continous merge code to feature to central repostory,and then automated build tests are run. Helps to mitigate integration error early.

2. CD continous delivery is a software development practise where code changes are automatically built,tested,and prepared for deployment.
   Continou deployment is the extension of CD where automatically deployed to prod with out manual interventions

3. IaC is devops practise where infrastructure managed and provisoned as code not manual process. Basically machine readable configuration files.
   Example : Terraform, AWS Cloud formation,Ansible,Puppet,Chef,SaltStack,Vagrant,Helm,Kubernetes,Packer

   Each of these tools plays a unique role in the IaC ecosystem, enabling you to automate and manage infrastructure more efficiently:

   - Terraform and AWS CloudFormation: Focus on provisioning and managing cloud infrastructure.
   - Ansible, Puppet, Chef, and SaltStack: Focus on configuration management and automation.
   - Kubernetes and Helm: Focus on container orchestration and management.
   - Vagrant: Focuses on creating reproducible development environments.
   - Packer: Focuses on creating machine images for various platforms.

4. Continuous Feedback is a DevOps practice where feedback is continuously collected and incorporated into the development process. This feedback can come from various sources, such as customers, end-users, and even the operations team.

5. Docker used for creating container for my service or application ,deploy my services .
   Docker to manage my application’s configuration and dependencies, ensuring that my application runs consistently across development, testing, and production environments.

6. Yes, I have been using it since last 2 years. Faimilar with setting and managing clusters, deployment of applications and scaling resources.
   - In a recent project, I used Kubernetes to manage the deployment and scaling of a microservices-based application. I created a Kubernetes cluster on AWS, and used it to deploy multiple pods, each containing a different service.

- Highly avaiable service by creating replicasets and auto scaling
- Createted K8 Cluster in AWS
- Networking for communication between services inside the cluster.
- Additionally, I also have experience with using Kubernetes for continuous integration and delivery.

7. Jenkins Pipeline Script (Jenkinsfile) which contains all the steps.
   - A.Source Code Management:(GitHub,BitBucket,GitLab etc) - Commit the code - Commit triggers a webhook to initiate the CI pipeline
   - B.Continuous Integration : Tools Jenkins(or other CI tools like Travis,CircleCI,GitLab etc)
     - Build Stage => Checkout code,Comile code,Run Test cases -
     - Build Docker Image => Dockerize application (Docker build )
     - Push Docket Image => Push the docker imahe to DockerHub or AWS ECR
   - C.Continuous Deployment : Jenkin, Kubernetes,Helm,
   - D.Approval & Manual Review
   - E.Deploy to Production
   - F.Monitoring & Logging : Promethus ,Grafan,eLK stack etc
     Use Prometheus to collect metrics from your Kubernetes clusters.
     Use Grafana to visualize the metrics and set up dashboards and alerts.
     Log Aggregation using ELK

A. [ANSIBLE IN DETAILS](https://github.com/pracks224/Interview_Prep/blob/main/CICD/ansible_in_details.txt)

[Blue Green Deployment Vs Rolling Deployment](https://medium.com/@navya.cloudops/devops-zero-to-hero-day-20-deployment-strategies-e6712b4801e4)

Q.1) [What is docker? Familiarize the concept of docker and containerization. Understand the difference between docker and traditional virtulization.]()

Q.2) [Docker Components: Learn about the key components of Docker, including Docker Engine, Docker Images, Docker Containers, Dockerfile, and Docker Registry.]()

Q.3) [Steps to Dockerizing an Application .]()

Q.4) [How to build a docker Image using dockerfile with example](https://github.com/pracks224/Interview_Prep/blob/main/CICD/Docker_Zero_To_Hero)

Q.5) [Docker container communication between ?](https://github.com/pracks224/Interview_Prep/blob/main/CICD/Docker_Zero_To_Hero)

Q.6) [Docker build vs Docker run](https://github.com/pracks224/Interview_Prep/blob/main/CICD/Docker_Zero_To_Hero)

Q.7) [Docker CMD Vs RUN Vs ENTRYPOINT](https://github.com/pracks224/Interview_Prep/blob/main/CICD/Docker_Zero_To_Hero)

Q.8) [Frequently used Docker Commands](https://github.com/pracks224/Interview_Prep/blob/main/CICD/Docker_Zero_To_Hero)

Q.9) [Building & deploying containers & orchestrating them with Kubernetes](https://github.com/pracks224/Interview_Prep/blob/main/CICD/Kubernetes_In_Details)
