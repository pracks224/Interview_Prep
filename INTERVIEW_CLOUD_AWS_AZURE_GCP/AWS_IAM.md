### IAM
- It is powerful service that allow how to control AWS infrastructure by user/program/applications
- It is not the idenity store or Authorization inside your application,IAM just assign the permissions to manipulate the AWS infrastructure.
#### Principals
- It is an IAM entity that is allowed to interact with AWS resources.
- Three types of principals : Root users,IAM users,and roles/temprary tokens.
  * ###### Root User :
    - The first single sign on principal
    - It has access to all the resources
    - It creates the first IAM user,
    - To do everydays task or any administrative task,we should not use root user
      
  * ###### IAM User :
    - These are persistent identities to represent individual user or applications
     - Users can be created by principals with Administrative privleges through  Management consoles,CLI or SDKs
  
  * ###### Roles/Temporary Security Tokens :
     - To grant specific privleges to specific actors for a set of duartion of time.
     - AWS provides a temporary token from the AWS security Token services. Life time of the token from 15 mins to 36 hours.
     - Using IAM roles for EC2,it removes the need to store the credentials in a config file.
  - ##### Use Case -2 (cross account access):
    Another common use case for IAM roles is to grant access to AWS resources to IAM users in other AWS accounts.
    This is highly recommended as a best practise, as opposed to distributing access keys
  - ##### Use Case -1 (API to access S3):
  - ###### Accessing S3 with an IAM Role:
       + Create an IAM Role:
         In the AWS Management Console, navigate to the IAM service.
         Create a new role, selecting "AWS service" as the trusted entity, and choose "EC2" as the use case.
         Attach a policy that grants the necessary permissions to access the S3 bucket (e.g., AmazonS3ReadOnlyAccess or a custom policy).

       + Launch an EC2 Instance with the IAM Role:
         When launching an EC2 instance, under the "Configure Instance" step, select the IAM role you created in the "IAM role" dropdown.
       
       + Access S3 from the EC2 Instance:
         Use an AWS SDK (e.g., Boto3 for Python) in your application code. The SDK will automatically use the IAM role assigned to the 
         instance to obtain temporary credentials.     
  - ###### Accessing S3 without an IAM Role:
     + Create IAM User:
       In the AWS Management Console, navigate to the IAM service.
       Create a new IAM user and attach a policy that grants the necessary permissions to access the S3 bucket.
       Generate an access key (Access Key ID and Secret Access Key) for the IAM user.
     +  Store Access Keys Securely: Store the access keys securely, avoiding hard-coding them in your application code.
     +  Access S3 Using the Access Keys:
        Configure the AWS SDK to use the IAM user's access keys.
            
    
          
            
