**Table of content:**
 - [Amazon EC2](#ec-2)
 
#### Amazon EBS (Amazon Elastic Block Store):
  - Amazon EBS provides persistent block storage volumes that you can attach to your Amazon EC2 instances.
  - High available and can replicate with in the same AZs,low cost ,Max volume 16TB
  - Volume types:
      - General Purpose(GP2)
      - Provisioned IOPS(io1) - low latency
      - Throughput Optimized(st1) - throughput-intensive workloads
      - Cold HDD -> Lowest cost as less frequently accessed workloads
  - snapshots,encryption etc other features
#### Amazon VPC (Virtual Private Network)
  - Amazon VPC allows you to create a virtual network in the AWS cloud that closely resembles a traditional network
  - Control over IP addressing, subnet creation, route tables, and network gateways
  - Connect them securely to your own data center or other cloud resources
#### Amazon	DynamoDB
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
  - AWS provides  defines a JSON based templetaing language that can be used to describe all the AWS resources that are necessary for a workload.
  - Process
      - Create or use an existing template
      - Save locally or in S3 bucket
      - Use AWS CloudFormation to create a stack based on your template
      - Then CF constructs and configures the specified stack resources
  #### AWS CloudTrail
  - Records AWS api call  like idenitity,time,souce IP Address,request parameter,response
  #### AWS Config
  - Capabilities	enable	compliance	auditing, security	analysis,	resource	change	tracking,	and	troubleshooting
  - AWS	Config	is	a	fully	managed	service	that	provides	organizations	with	an	AWS	resource inventory,	configuration	history,	and	configuration	change	notifications	to	enable	security and	governance.
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
- Region : AWS clusters	data	centers
- AVR(Avalablity Zone) : In AWS, a Region typically consists of multiple Availability Zones, and each Availability Zone contains one or more data centers.
- Hybrid Deployment Model :an	environment	that	extends	an	existing	on-premises infrastructure	into	the	cloud	to	connect	cloud	resources	to	internal	systems
- Auto Scaling : Auto Scaling is the AWS service that can help your company dynamically match the required compute capacity to the spike in traffic during flash sales. It automatically adjusts the number of EC2 instances in your application based on the current demand, ensuring that you have the right amount of resources to handle the traffic.
- Amazon Galcier : Amazon Glacier, now part of Amazon S3 Glacier, is a storage service designed for long-term data archiving and backup. It provides secure, durable, and extremely low-cost storage, making it ideal for data that is infrequently accessed and for which retrieval times of several hours are acceptable. This service is not suitable for handling dynamic traffic spikes, such as those experienced during flash sales on an e-commerce website.
  
------- ----- ----- ----- ------ ----- ------ ****** ***** ****** ----- ----- ----- ------ ----- ----- ---- ---- ----

### Amazon	Simple	Storage	Service (Amazon	S3) - High Durable and Scalable Object Storage
  -  S3 is Object Storage Not a block/File Storage
  -  Block	storage	operates	at	a	lower	level—the	raw	storage	device	level—and	manages	data	as	a set	of	numbered,	fixed-size	blocks.	File	storage	operates	at	a	higher	level—the	operating system	level—and	manages	data	as	a	named	hierarchy	of	files	and	folders
  -  Like SAN or NAS , S3 is independent of Servers, can easily accessed using Internet
  -  Object contains  both Data and Meta Data,resides inside a container called "Bucket"
  -  Bucket can hold unlimited amount of data but  cann't have a sub-bucket.
  -  Each Object can identified user-specified key called file name
  -  Important - can not mount a bucket/open an object/install OS or run a data base on S3
  -  if	your	request	rate	grows	steadily,	Amazon	S3	automatically	partitions	buckets
  -  NAS - File storage (Using RAID) Where SAN (faster) Block Storage connected to network using fibernet
  -  The	Amazon	EBS	service	provides	block	level	storage	for	Amazon Elastic	Compute	Cloud	(Amazon	EC2)	instances.	Amazon	Elastic	File	System	(AWS	EFS) provides	network-attached	shared	file	storage	(NAS	storage)	using	the	NFS	v4	protocol.
  -  #### Buckets
      - Buckets	form	the	top-level	namespace	for	Amazon	S3
      - bucket	names	are	global.	This	means	that	your	bucket	names	must	be	unique	across	all	AWS accounts,	much	like	Domain	Name	System	(DNS)	domain	names.
      - Bucket	names	can	contain	up	to	63	lowercase	letters,	numbers,	hyphens,	and periods.
      - you	can	have	up	to	100	per	account	by default.
  - #### Objects
      - Object stored in Amazon S3 belongs to one AWS Region only.
      - If you need to replicate objects across AWS Regions for redundancy or compliance reasons, you can set up Cross-Region Replication (CRR).
      - The URL for accessing an object in S3 includes the Region name as part of the endpoint. For example:
          https://s3.Region.amazonaws.com/bucket-name/object-key
        Here, Region is replaced with the actual AWS Region where the object is stored.
      - Each	object	consists	of	data	(the	file	itself)	and	metadata	(data	about	the	file)
      - Amazon	S3	doesn’t	know	or	care	what	type	of	data	you are	storing,	and	the	service	doesn’t	act	differently	for	text	data	versus	binary	data.
      - Two	types	of	metadata:	system	metadata	and	user	metadata.
      - System metadata	is	created	and	used	by	Amazon	S3	itself,	and	it	includes	things	like	the	date	last modified,	object	size,	MD5	digest,	and	HTTP	Content-Type
  - #### Keys
      - Keys	must	be	unique	within	a	single	bucket,	but	different	buckets	can	contain	objects	with the	same	key,1024 UTF-8
      - The	combination	of	bucket,	key,	and	optional	version	ID	uniquely	identifies	an Amazon	S3	object.
      - The	key	or	filename	is	the	string
fee/fi/fo/fum/jack.doc.	A	key	may	contain	delimiter	characters	like	slashes	or	backslashes to	help	you	name	and	logically	organize	your	Amazon	S3	objects . Here it looks like fee then fi then fo ,but in reality it's flat in nature.
     - To store	non-critical	or	easily	reproducible	derived	data,you	can	choose	to	use	Reduced Redundancy	Storage	(RRS)	at	a	lower	cost. RRS 99.99% with low cost.
   - #### Data Consistency
     - Eventual Consistent : means	that	if	you	PUT	new	data	to	an	existing	key,	a	subsequent	GET might	return	the	old	data
     - You	will	get	the	new	data	or	the	old	data,	but	never	an inconsistent	mix	of	data.
  - #### Access Control
      - Coarse Grained Access Control  Using Amazon S3 Access Control Lists (ACLs)
      - Fine Grained Access Control Using IAM,  S3 Bucket Policies,Query String Authentication etc.
  - #### Amazon S3 Advanced Features


<!-- EC2 Start -->
 <a id="ec-2"></a>
 ### Amazon Elastic Compute Cloud
 Hello world content goes here
  
    
