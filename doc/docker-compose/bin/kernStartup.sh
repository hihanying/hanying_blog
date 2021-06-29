#!/usr/bin/env bash

echo '=====开始安装应寒博客环境====='

echo '=====开始运行mysql====='
docker-compose -f ../yaml/mysql.yml up -d
echo '=====mysql正在进行初始化====='
./wait-for-it.sh http://localhost:3306 --timeout=60  -- echo "=====mysql已经准备就绪====="

echo '=====开始部署portainer可视化工具====='
#docker-compose -f ../yaml/portainer.yml up -d

echo '=====开始运行nacos====='
docker-compose -f ../yaml/nacos.yml up -d
echo '=====nacos正在进行初始化,请等待...====='
./wait-for-it.sh http://localhost:8848 --timeout=60  -- echo "=====nacos已经准备就绪====="

echo '=====开始运行rabbitmq====='
docker-compose -f ../yaml/rabbitmq.yml up -d

echo '=====开始运行redis====='
docker-compose -f ../yaml/redis.yml up -d

echo '=====开始部署hanying_data====='
docker-compose -f ../yaml/hanying_data.yml up -d


echo '======================'
echo '=====开始运行后台====='
echo '======================'

echo '=====开始运行hanying_gateway====='
docker-compose -f ../yaml/hanying_gateway.yml up -d

echo '=====开始运行hanying_admin====='
docker-compose -f ../yaml/hanying_admin.yml up -d

echo '=====开始运行hanying_picture====='
docker-compose -f ../yaml/hanying_picture.yml up -d

echo '=====开始运行hanying_sms====='
docker-compose -f ../yaml/hanying_sms.yml up -d

echo '=====开始运行hanying_web====='
docker-compose -f ../yaml/hanying_web.yml up -d

echo '执行完成 日志目录: ./log'


echo '======================'
echo '=====开始运行前台====='
echo '======================'

echo '=====开始运行vue_hanying_admin====='
docker-compose -f ../yaml/vue_hanying_admin.yml up -d


echo '=====开始运行vue_hanying_web====='
docker-compose -f ../yaml/vue_hanying_web.yml up -d

echo '================================================================='
echo '=====【微服务启动需要耗费一定时间，请到Nacos中查看启动情况】====='
echo '================================================================='
