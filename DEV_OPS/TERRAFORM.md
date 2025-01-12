# BASIC CONCEPTS

## Questions

1. What is IAC (Infrastructure as Code) ?
2. What is Terraform, and why is it used in DevOps?
3. How does Terraform differ from other infrastructure as code (IaC) tools like Ansible or CloudFormation?
4. What are Terraform's main components?
   5 . What is Terraform, and why is it used?
5. How does Terraform differ from other infrastructure as code (IaC) tools like Ansible or CloudFormation?
6. What is a Terraform provider?
7. What are some commonly used Terraform providers?
8. Explain the difference between terraform init, terraform plan, terraform apply, and terraform destroy.

## Terraform Configuration and State

1. What is a Terraform configuration file?
2. What is a Terraform state file, and why is it important?
3. What is the purpose of the .terraform.lock.hcl file?
4. How can you store the Terraform state file remotely? Why would you do so?
5. What is the difference between local and remote backends?

## Terraform Syntax and Components

1. What are Terraform resources? Give an example.
2. What is a module in Terraform?
3. What are variables and outputs in Terraform?
4. What is the use of terraform.tfvars?
5. Explain how to use data blocks in Terraform.

## Terraform Commands and Workflow

1. What does the terraform refresh command do?
2. How do you handle secrets in Terraform?
3. What happens when you run terraform plan?
4. Can you explain the difference between terraform apply and terraform destroy?
5. What is the purpose of terraform import?

## State Management and Locking

1. How can you manage state file conflicts in a team environment?
2. What is state locking in Terraform? How does it work?
3. How can you split your Terraform configurations to manage different environments like dev, staging, and prod?
4. What happens if the state file gets corrupted?
5. How do you upgrade your Terraform state when you update a provider version?

## Terraform Best Practices

1. How can you ensure that your Terraform configurations are reusable?
2. What are the best practices for organizing Terraform files?
3. How can you automate Terraform workflows using CI/CD pipelines?
4. What is drift in Terraform, and how do you handle it?
5. How can you test your Terraform code?

## Debugging and Troubleshooting

1. How do you debug issues with Terraform?
2. What does the TF_LOG environment variable do?
3. How do you resolve dependency issues in Terraform?
4. What happens if a resource creation fails during terraform apply?
5. How do you rollback changes in Terraform?

## Advanced Topics for Beginners

1. What is the purpose of Terraform workspaces?
2. How do you define dependencies between resources in Terraform?
3. What is a for_each loop in Terraform, and how is it used?
4. What are lifecycle hooks in Terraform, and how are they implemented?
5. Explain the difference between count and for_each in Terraform.

## Terraform Cloud and Enterprise

1. What is Terraform Cloud, and how does it differ from Terraform CLI?
2. How can you secure and share modules in a team using Terraform Cloud?
3. What is Sentinel in Terraform Enterprise?
4. Explain the workflow of running Terraform in a multi-team environment.

## Hands-On Scenarios

1. How would you write a Terraform configuration to create an EC2 instance in AWS?
2. What steps would you take to migrate an existing infrastructure to Terraform?
3. How do you use Terraform to deploy a simple Kubernetes cluster?
4. How do you handle Terraform state when working in a collaborative environment?
5. What are the steps to create a reusable Terraform module?
6. How do you ensure that sensitive data is not exposed in Terraform configurations?

# DETAILS

## IAC Framework examples

- IAC is nothing but codify the infrastrcuture provision automatically.
- IAC using simple shell script we can do but needs programming understanding etc thats where tools like Terraform,Ansible etc came into picture.
- Ansible,CloudFormation,Terraform,Vagrant,Puppet,Hashicorp Packer, Saltstack etc.

## Types of IAC tools

- Configuration Management - Ansible, Chef,Puppet,Saltstack.
- Server Templating - Docker,Packer,Vagrant
- Provisioning Tools - Terraform,CloudFormation

# TERRAFORM

- Its an infrastructure provisioning tool
- It's an opensource tool by hashicorp
- Advantages of it it can deploy into multiple platforms including private and public clouds like AWS,Azure,GCP etc
- TF managages all these platform using the providers. Providers manages third party tools using their APIs

- TF supports 100 of providers.
- TF supports using HCL, Hashicorp configuartion language
- HCL is declarative language
- TF three phases - init,plan and apply phase
- Anything manages TF are resouces. Resources could be db server, cloud,
