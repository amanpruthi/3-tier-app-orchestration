# 3-tier-app-orchestration || Still Building 
3-tier-app-orchestration


##  Orchestrate a 3 tier app 

* Bring up 3 ec2 instances in aws with proper security group and subnet configuration. 
* use ansible to orchestrate DB,FE and BE.        
* create load balancer and target groups for 
* move FE to private subnet 

* create ansible roles 
cloudformation 
BE 
FE
DB 



## second alternative 
* Bring up 3 ec2 instances in aws with proper security group and subnet configuration.
* Setup kubernetes cluster using ansible .
* Deploy images on the 3 kubernetes pods using kubernetes .


## Commands to run 
* Please have your aws keys in the ansible vault before running the below command or have them exported on the environment 
ansible-playbook -i localhost --tags "create"  --vault-password-file ~/.vaultPassword cloudFormationOperations.yml

* The below command uses dynamic inventory and then we orchestrate on it based on the EC2_tags
ansible-playbook  -i ./inventory/creds.sh  --vault-password-file ~/.vaultPassword setupApp.yml


