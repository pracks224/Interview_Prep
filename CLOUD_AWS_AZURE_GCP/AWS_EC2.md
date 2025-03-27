#### How does Autoscaling works in AWS?

- Autosclaing number active EC2 instancess dynamically based on the defined policies,
- Ensures High Availabity and cost efficiencies by sclaing up during spike and down during low traffic

- Scaling policy types like Dynamic Scaling which watches the Cloudwatch metrics like CPU usages,memory or custom metrics
- Another policy like scheduling Scaling, Precitive scaling etc
- Auto Scaling Group (ASG): A logical group of EC2 instances managed together.
- This ensures .... Cost-Effective: Only pay for what you use.

#### How would you troubleshoot an EC2 instance that is not reachable?

- Check EC2 instance status using aws ec2 describe-instance status
- Can SSH into EC2 instances
- Check Security groups for inbound rules
- Check key pair and SSH configurations -ensure correct permissions are there.
- Check health logs

##### This is imporatnt

Stop, Recover, or Restore EC2 Instance
🔹 If the instance is stuck (kernel panic, boot issues, etc.):
Create a new temporary EC2 instance in the same VPC.

Detach the root volume of the problematic instance.

Attach the volume to the temporary EC2 instance.

Mount the volume and fix issues (corrupt files, logs, permissions).

Reattach the volume to the original EC2 instance.

🔹 If still not working, restore from a snapshot.
