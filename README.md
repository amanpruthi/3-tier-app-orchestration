# 3-tier-app-orchestration
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




export AWS_ACCESS_KEY_ID='AKIASHKBS22JW2R5AA42'
export AWS_SECRET_ACCESS_KEY='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'
export PYTHONPATH=/usr/local/lib/python2.7/site-packages
git clone git://github.com/boto/boto.git
cd boto
sudo python setup.py install
sudo easy_install pip
pip install ansible
pip install boto3 
ansible -i ./inventory/ec2.py --limit "tag_App_BE" -m ping all
