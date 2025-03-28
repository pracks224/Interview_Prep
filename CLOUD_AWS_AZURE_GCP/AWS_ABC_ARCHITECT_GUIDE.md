**Table of content:**

- [Introduction](#ec-1)
- [Amazon EC2](#ec-2)
- [Amazon EBS](#eb-s)
- [Amazon VPC](#vp-c)
  - [Understand CIDR](#cid-r)
  - [Components Of VPC](#comp-vpc)
- [Elastic Network Interface](#enI)
- [AWS Beanstalk](./AWS_BeanStalk.md)
- [AWS SNS](./AWS_SNS.md)
- [AWS SQS](./AWS_SQS.md)
- [AWS DevOps](./AWS_DEVOPS.md)
  - [ECS](./AWS_DEVOPS.md)
  - [EKS](./AWS_DEVOPS.md)
  - [Fargate](./AWS_DEVOPS.md)
  - [ECR](./AWS_DEVOPS.md)
- [AWS Disater Recovery](#recovery)
- [AWS Lambda](./AWS_Lambd.md)
- [AWS Farget](#farget)

### What is the difference between Security Groups and Network ACLs? Detail Under standing needed. SGs like firewal for EC2,NACLs at subnet levels

#### How do you design a highly available and fault-tolerant architecture in AWS?

- Use multiple Availability Zones (AZs) and Regions.
- Deploy Auto Scaling Groups to ensure scalability.
- Implement Elastic Load Balancers (ELB) for traffic distribution.
- Use RDS Multi-AZ Deployment for databases.
- Replicate data using S3 Cross-Region Replication.

<a id="eb-1"></a>

#### What is AWS and why is it used?

- Its a cloud computing platform,provides on demand services as compute power,storage,databases etc.
- It eliminates the need of physical server

#### Virtual machine vs Conatiner

- VM has its own OS running on a hypervisor where as container uses the host os
- Large file (GBs) and container is Light weight
- Running multiple OSs,legacy apps where as Container for microservices,cloude native apps etc
- Storng Islolation in VM ,emulates the hardwar but container has weak isolation

#### What is AWS and why is it used?

- Compute - EC2, Lambda
- Storage - S3,EBS,EFS
- Database - RDS, DynamoDB
- Networking - VPC,Route 53, CloudFront

#### What is EC2 ?

- EC2 is IAAS provides virtualized resources, which the user has full control.
- Provides servers,networking,storage etc. The patch and all controlled by administrators
- Elastic Bean stalk is PAAS where it has fully managed environment, user has to focus on applicatin code only.

#### What is S3 and When used?

- Object storage, used for back up ,storage,hosting websites, big data analytics

#### What is IAM, and why is it important?

- This is security as service, allows securely accessing the AwS services
- Like AWS IAM, Azure has AD, Google has IAM

<a id="eb-s"></a>

#### Amazon EBS (Amazon Elastic Block Store):

- Amazon EBS provides persistent block storage volumes that you can attach to your Amazon EC2 instances.
- High available and can replicate with in the same AZs,low cost ,Max volume 16TB
- Volume types:
  - General Purpose(GP2)
  - Provisioned IOPS(io1) - low latency
  - Throughput Optimized(st1) - throughput-intensive workloads
  - Cold HDD -> Lowest cost as less frequently accessed workloads
- snapshots,encryption etc other features

#### Amazon DynamoDB

- First,Flexible No SQL DB
- It Supports both document and Key-value data model
- DynamoDB gives you the ability to auto-scale by tracking how close your usage is to the upper bounds. Auto Shrading feature
- Access Control Data with out bottleneck,As data gets more specific and personal, it becomes more important to have effective access control.
- DynamoDB isn’t always the easiest database to use when it comes to analytics.
- Use Case for DynamoDB
  - Duolingo ,learing site which mainly used by users for preparing for test and exam
  - MLB (Major league Baseball) stores the all the infor of the ball per sec wise to be used by doppler system
- Indexing is expensive, Complex querying,analytics not supported

#### Amazon Redshift

- Fast,Fully Managed DBMS
- Deliver Fast Query Performance
- Automate the tasks associated with provisioning,configuring and monitoring a cloud data warehourse

#### Amazon ElasticCache

- in-memory cache of the cloud
- supports Memcached and Redis cache engines

#### Amazon CloudFront

- Amazon CloudFront is a content delivery network (CDN) service that helps speed up the distribution of static and dynamic web content, such as image files, to end users around the world with low latency and high transfer speeds. It caches content at edge locations globally, ensuring faster delivery to users by serving content from a location that is geographically closer to them.

### AWS Management Tools

#### Amazon Cloudwatch

- Monitoring service for cloud resources
- Collect and track metrics,collect and monitor log files, and set alarms.
- Amazon CloudWatch is the AWS Cloud service that allows organizations to gain system-wide visibility into resource utilization, application performance, and operational health. It provides monitoring for AWS cloud resources and applications, offering insights through metrics, logs, and alarms.

#### Amazon CloudFormation

- It gives developers and systems administrators an effective way to create and manage a collection of related AWS resources
- AWS provides defines a JSON based templetaing language that can be used to describe all the AWS resources that are necessary for a workload.
- Process
  - Create or use an existing template
  - Save locally or in S3 bucket
  - Use AWS CloudFormation to create a stack based on your template
  - Then CF constructs and configures the specified stack resources

#### AWS CloudTrail

- Records AWS api call like idenitity,time,souce IP Address,request parameter,response

#### AWS Config

- Capabilities enable compliance auditing, security analysis, resource change tracking, and troubleshooting
- AWS Config is a fully managed service that provides organizations with an AWS resource inventory, configuration history, and configuration change notifications to enable security and governance.

### Security and Identity

#### AWS Idenitity and Access Management (IAM)

#### AWS Key Managent Service(KMS)

#### AWS Directory Service

#### AWS Certificate Manager

#### AWS Web Application Firewall (WAF)

### Applicatition Services

#### Amazon API Gateway

#### Amazon Elastic Transcoder

#### Amazon Simple Notification Service (Amazon SNS)

#### Amazon Simple Email Service (Amazon SES)

#### Amazon Simple Workflow Service (Amazon SWF)

#### Amazon Simple Queue Service (Amazon SQS)

### Key Terms

- Global Infrastrcuture
- Region : AWS clusters data centers
- AVR(Avalablity Zone) : In AWS, a Region typically consists of multiple Availability Zones, and each Availability Zone contains one or more data centers.
- Hybrid Deployment Model :an environment that extends an existing on-premises infrastructure into the cloud to connect cloud resources to internal systems
- Auto Scaling : Auto Scaling is the AWS service that can help your company dynamically match the required compute capacity to the spike in traffic during flash sales. It automatically adjusts the number of EC2 instances in your application based on the current demand, ensuring that you have the right amount of resources to handle the traffic.
- Amazon Galcier : Amazon Glacier, now part of Amazon S3 Glacier, is a storage service designed for long-term data archiving and backup. It provides secure, durable, and extremely low-cost storage, making it ideal for data that is infrequently accessed and for which retrieval times of several hours are acceptable. This service is not suitable for handling dynamic traffic spikes, such as those experienced during flash sales on an e-commerce website.

------- ----- ----- ----- ------ ----- ------ **\*\*** **\*** **\*\*** ----- ----- ----- ------ ----- ----- ---- ---- ----

### Amazon Simple Storage Service (Amazon S3) - High Durable and Scalable Object Storage

- S3 is Object Storage Not a block/File Storage
- Block storage operates at a lower level—the raw storage device level—and manages data as a set of numbered, fixed-size blocks. File storage operates at a higher level—the operating system level—and manages data as a named hierarchy of files and folders
- Like SAN or NAS , S3 is independent of Servers, can easily accessed using Internet
- Object contains both Data and Meta Data,resides inside a container called "Bucket"
- Bucket can hold unlimited amount of data but cann't have a sub-bucket.
- Each Object can identified user-specified key called file name
- Important - can not mount a bucket/open an object/install OS or run a data base on S3
- if your request rate grows steadily, Amazon S3 automatically partitions buckets
- NAS - File storage (Using RAID) Where SAN (faster) Block Storage connected to network using fibernet
- The Amazon EBS service provides block level storage for Amazon Elastic Compute Cloud (Amazon EC2) instances. Amazon Elastic File System (AWS EFS) provides network-attached shared file storage (NAS storage) using the NFS v4 protocol.
- #### Buckets
  - Buckets form the top-level namespace for Amazon S3
  - bucket names are global. This means that your bucket names must be unique across all AWS accounts, much like Domain Name System (DNS) domain names.
  - Bucket names can contain up to 63 lowercase letters, numbers, hyphens, and periods.
  - you can have up to 100 per account by default.
- #### Objects
  - Object stored in Amazon S3 belongs to one AWS Region only.
  - If you need to replicate objects across AWS Regions for redundancy or compliance reasons, you can set up Cross-Region Replication (CRR).
  - The URL for accessing an object in S3 includes the Region name as part of the endpoint. For example:
    https://s3.Region.amazonaws.com/bucket-name/object-key
    Here, Region is replaced with the actual AWS Region where the object is stored.
  - Each object consists of data (the file itself) and metadata (data about the file)
  - Amazon S3 doesn’t know or care what type of data you are storing, and the service doesn’t act differently for text data versus binary data.
  - Two types of metadata: system metadata and user metadata.
  - System metadata is created and used by Amazon S3 itself, and it includes things like the date last modified, object size, MD5 digest, and HTTP Content-Type
- #### Keys
        - Keys	must	be	unique	within	a	single	bucket,	but	different	buckets	can	contain	objects	with the	same	key,1024 UTF-8
        - The	combination	of	bucket,	key,	and	optional	version	ID	uniquely	identifies	an Amazon	S3	object.
        - The	key	or	filename	is	the	string
  fee/fi/fo/fum/jack.doc. A key may contain delimiter characters like slashes or backslashes to help you name and logically organize your Amazon S3 objects . Here it looks like fee then fi then fo ,but in reality it's flat in nature. - To store non-critical or easily reproducible derived data,you can choose to use Reduced Redundancy Storage (RRS) at a lower cost. RRS 99.99% with low cost.
- #### Data Consistency
  - Eventual Consistent : means that if you PUT new data to an existing key, a subsequent GET might return the old data
  - You will get the new data or the old data, but never an inconsistent mix of data.
- #### Access Control
  - Coarse Grained Access Control Using Amazon S3 Access Control Lists (ACLs)
  - Fine Grained Access Control Using IAM, S3 Bucket Policies,Query String Authentication etc.
- #### Amazon S3 Advanced Features

<!-- EC2 Start -->

<a id="ec-2"></a>

### Amazon Elastic Compute Cloud

- EC2 allows to acquire compute through the launching of virtual servers called Intances

<!-- VPC Start -->

<a id="vp-c"></a>

### Amazon Virtual Private Cloud

- VPC is custom-defined virtual network with in the AWS cloud
- To understand VPC better, need to understand CIDR block and subnet (Classless Inter Domain Routing)
- Subnetting involves splitting an IP address space into multiple smaller networks
  <a id="cid-r"></a>

#### Understand CIDR notation

- In CIDR notation, the number after the slash (/) indicates the number of bits used for the network prefix.
  The remaining bits are used for host addresses within the network.
  For the CIDR block 10.1.0.0/16:

  The /16 indicates that the first 16 bits are the network prefix.
  The remaining 16 bits are used for host addresses.

  ##### Calculating the IP Range

  To calculate the IP range for 10.1.0.0/16:

  - Network Prefix: The first 16 bits (10.1 in decimal notation) are fixed.
  - Host Addresses: The remaining 16 bits can vary.
  - The range starts from 10.1.0.0.
  - The range ends at 10.1.255.255.
    Therefore, the IP range for 10.1.0.0/16 is from 10.1.0.0 to 10.1.255.255, which includes 65,536 IP addresses (2^16).
    ##### Why do Subnetting required ?
    - ### One of the many reason
      - #### Migration and Expansion:
        - If you are migrating applications from another cloud provider or expanding your existing network, you might need to use a specific IP address range to maintain consistency and compatibility.
    - #### Avoiding IP Conflicts with On-Premises Networks:
    - #### Compliance and Regulatory Requirements:
    - #### Control Over Network Design:
      - Custom IP ranges allow you to have granular control over your network layout. You can allocate IP addresses in a way that optimizes network performance, management, and scalability. For example, you might reserve specific IP ranges for different environments such as development, testing, and production.

<a id="comp-vpc"></a>

#### Components of VPC

- ##### Subnets , Route Table, Secuirty Groups, Network AccessLists(ACLs)
- Optional components like Internet Gateways,Elastic IP addresses,Virtual Provate Gateways etc.

#### Subnets :

- A subnet is segment of VPC,where we can launch EC2 instances, RDS etc
- The smallest subnet we can creat of /28 means 28 bits for network and 4 bits for host ,hence 2^4 = 16 IP address
- Out of 16 ,AWS reserves First 4 and last one for internal networking purposes.
- Subnets reside in one AZs, One AZs(Availabity Zone) can have multiple subnets.
- Types of Subnets :
  - Public: Associated route table directs the subnet's traffic to the Amzon VPC's IGW
  - Private: Associated route table does not directs the subnet's traffic to the Amzon VPC's IGW
  - VPN-Only: Associated route table directs the subnet's traffic to the Amzon VPC's VPG .Does not have a route to the IGW.
    Subnet is always private and never routable to internet.

#### IGW (Internet Gateway):

- IGW allows to communicate between instances inside vpc with internet
- Basically, the primary task of it is network transalation
  E.G. An Amazon VPC with an address space of 10.0.0.0/16, one subnet with an address range of 10.0.0.0/24, a route table, an attached IGW, and a single Amazon EC2 instance with a private IP address and an EIP address. The route table contains two routes: the local route that permits inter-VPC communication and a route that sends all non-local traffic to the IGW (igw-id). Note that the Amazon EC2 instance has a public IP address (EIP = 198.51.100.2); this instance can be accessed from the Internet, and traffic may originate and return to this instance.

  [More](./AWS_VPC.md)

#### Elastic IP Addresses (EIPs) :

- An Elastic IP Addresses (EIP) is a static, public IP address in the pool for the region that you can allocate to your account (pull from the pool) and release (return to the pool)
- EIP specific to a region , first assign an EIP to VPC and then assign to an instance.
- EIP associated to a particular AWS account ,until you explicitly release them.

<a id="enI"></a>

#### ELastic Network Interfaces

- It's Virtual Network Card for AWS Ec2
- VNC is a software based network interface that enables the virtual machines to connect to network,functioning like physcical netwrk card. Like network communication,Internet access,Resource sharing,Cloud services,Security etc.
- ENIs are avialble on VPC and explicitly associated to subnet creation.
- Helps creating DUAL-HOMED Instances with different workloads.
- A dual-homed instance has two (or more) network interfaces (ENIs), each connected to a different subnet. This setup is used to isolate traffic for different purposes, improving security, and network management.
- ##### Use Cases and Benefits
  1.Network Segregation:

Example: You can have one ENI connected to a public subnet and another ENI connected to a private subnet.
Benefit: This allows you to separate public-facing traffic (e.g., web server requests) from internal traffic (e.g., database queries), enhancing security and performance.

2.High Availability and Redundancy:

Example: An instance with ENIs in different subnets can maintain connectivity even if one subnet becomes unavailable.
Benefit: This improves fault tolerance and reliability for critical applications.

#### End Points

- A VPC endpoint in AWS allows you to privately connect your VPC to supported AWS services and VPC endpoint services powered by PrivateLink, without requiring an internet gateway, NAT device, VPN connection, or AWS Direct Connect connection.
- ##### Benefits of VPC Endpoints
  - No Data Transfer Charges: Traffic between your VPC and the service does not incur data transfer charges, unlike internet-bound traffic.
  - Low Latency and Highly Available
  - Enhanced Security - Private Connectivity
  - How to create and VPC Endpoints ????

#### Peering

- An Amazon VPC peering connection is a networking connection between two Amazon VPCs that enables instances in either Amazon VPC to communicate with each other as if they are within the same network. More to discuss.
- VPC peering connections do not support transitive routing . Why VPC Peering Doesn't Support Transitive Routing ?

============= ========= =========== ======= ========= ========= ======== ======== =========== ===========
<a id="recovery"></a>

#### How would you implement a disater recovery solution in AWS using RDS,EC2 and S3

Following steps :

- A.Create a RDS instance in primary regiona and automatic backups to Amazon S3.
- B.Create EC2 instance in the primary region
- C. Create Bucket to store the automatic backups
- D. Create a RDS instance in a secondary region and configure the replica of the primary
- E. Set up EC2 in a secondary region and insatll the necesary software to access the S3
- F. Use S3 versioning and object life cycle for management of policies to retain back ups
- G. Regulary test failover,if fails traffic will move to the other region etc
- H. Cloudwatch to monitor the RDS ,EC2 Instances etc.
- ##### Automate Backups:
  Use AWS Backup to automate regular backups of critical data across AWS services such as RDS, EBS, and S3, ensuring data is securely stored and easily recoverable.

##### Cross-Region Replication:

Implement cross-region replication for S3 buckets, RDS instances, and DynamoDB tables to ensure data redundancy and availability in a different geographical location.

##### Use Multi-AZ Deployments:

Configure Multi-AZ (Availability Zone) deployments for critical services like RDS and Elasticsearch to provide automatic failover and high availability within a region.

##### Infrastructure as Code:

Utilize AWS CloudFormation or Terraform to define and version your infrastructure, allowing for quick and consistent environment recreation in another region during a disaster.

<a id="farget"></a>

#### Amazon Farget:

- Why Farget if EC2 and EKS .
- Farget is serverless,AWS manages the infrastructure automatically where as EC2 requires manual managements
- Farget is pay as you use where as EC2 pay as teh instance uptime
- Fargate: Best for stateless, serverless microservices, or applications requiring minimal infrastructure management.
  EC2: Ideal for high-performance, stateful, or custom infrastructure workloads.
- Important Farget is not suitable for workloads needing persistent storage
- Why its called serverless becoz no need to provison the server separately
- Fargate: Uses the awsvpc networking mode, assigning each task a unique ENI (Elastic Network Interface) with a private IP. This provides enhanced network isolation and security. What is this AWSVPC and Bridge mode?
