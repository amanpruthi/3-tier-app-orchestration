#!/usr/bin/env bash
cd "$(dirname $0)/.."
credentials=$(ansible localhost --inventory='localhost,' --vault-password-file ~/.vaultPassword --connection=local --extra-vars=@vars/vault.yml -m debug -a 'msg="{{ aws_access_key }}:{{ aws_secret_key }}"'| tr -d ' ' | grep '"msg":' | cut -d'"' -f4)
export AWS_ACCESS_KEY_ID=$(echo $credentials | cut -d: -f1)
export AWS_SECRET_ACCESS_KEY=$(echo $credentials | cut -d: -f2)
export EC2_INI_PATH="$(dirname $0)/inventory/ec2.ini"
/usr/bin/python  inventory/ec2.py
