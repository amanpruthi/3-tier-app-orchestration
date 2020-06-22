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


## issues to fix :
* elastic Ips should be hardcoded for jumpbox 
* meaningful names 





ansible-playbook -i localhost --tags "create"  --vault-password-file ~/.vaultPassword cloudFormationOperations.yml

ansible-playbook  -i ./inventory/ec2.py --vault-password-file ~/.vaultPassword setupApp.yml



