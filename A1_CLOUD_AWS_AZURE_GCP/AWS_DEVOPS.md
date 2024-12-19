#### Introduction

- Devops is a methodology ,set of practices to ensure faster delivery of software deployments
- It is the process of integrating Developers and Operations teams in order to improve collaboration and prodcutvity.
- It comprises of Workflow Automation,Continous Monitoring of Performance and Enahnced Collaborations.
- ##### Why Devops On Cloud is needed?
  - Brings the product at a faster rate to market
  - Reduction of cloud complexity and mantainace of servers
  - Increased Secuirty
  - Elimination of DownTime
  - Increased Scalabiliy.

#### What is CICD Pipeline

- A CICD Pipeline is a sereis of steps that must be performed before the release of the new product to market.

- Build Stage, Test Stage,Deploy Stage

#### What are the components of AWS Devops

- AWS Codecommit
- AWS Codepipeline
  It is a combination of continus integration and delivery service for quicker and more reliable infrastructure.
- AWS Codebuild
- AWS CodeDeploye
- AWS CodeStar

#### Can you describe the process of setting up a continous delivery pipeline in AWS using codepipeline and CodeBuild

- AWS CodePipeline and CodeBuild used for continous delivery purpose
- Broken down into the following steps :
  - Store the code in the repository like AWS CodeCommit. AWS codecommit can work with git repository also using bi directional sync
  - CodeBuild is to compile the source code and generate the artifacts etc
  - Code pipeline orchestarte the delivery pipeline . It has the following stages
    A.Build Stage - Generates the building artifacts
    B.Test Stage - run the automated tests on the build artifacts
    C.Deploy Stage - deploy the build artifacts to a testing or production env.
  - Set up a trigger for every code commit

### Where are Docker Image stored?

- Docker images are stores in docker repositories
- Like dockerhub (public repository)
- Amazon ECR (Private Repository)
- Amazon has its own public repository called Amazon Public Gallery

### How to start with Docker 

- Docker File -> Build to form a Docker Image (Push to docker repositories) ->  Pull the docker image to become docker conatiner

ECS - Elastic Container Service
EKS - Elastic Kubernetes Service
Fargate - Amazon's own Serverless container platform
ECR - Store containet images.

- Docker Containers generally run on EC2 instances

### Deep dive into ECS

- 
