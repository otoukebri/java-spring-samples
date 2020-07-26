sudo rabbitmqctl add_vhost /my-rabbit-host
sudo rabbitmqctl add_user ous ous
sudo rabbitmqctl set_permissions -p /my-rabbit-host ous ".*" ".*" ".*"
rabbitmqctl set_user_tags ous administrator


sudo rabbitmq-plugins enable rabbitmq_management


#stop service
sudo rabbitmqctl stop

#status
sudo rabbitmqctl status

#start service
sudo invoke-rc.d rabbitmq-server start
