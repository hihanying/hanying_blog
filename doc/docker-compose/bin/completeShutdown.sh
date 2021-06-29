#!/usr/bin/env bash

echo '=====开始结束运行应寒博客服务====='

echo '=====结束运行portainer可视化工具====='
docker-compose -f ../yaml/portainer.yml down

echo '=====结束运行mysql====='
docker-compose -f ../yaml/mysql.yml down

echo '=====结束运行nacos====='
docker-compose -f ../yaml/nacos.yml down

echo '=====结束运行rabbitmq====='
docker-compose -f ../yaml/rabbitmq.yml down

echo '=====结束运行redis====='
docker-compose -f ../yaml/redis.yml down

echo '=====结束运行hanying_data====='
docker-compose -f ../yaml/hanying_data.yml down

echo '=====结束运行zipkin====='
docker-compose -f ../yaml/zipkin.yml down

echo '=====结束运行sentinel====='
docker-compose -f ../yaml/sentinel.yml down

echo '=====结束运行ELK====='
docker-compose -f ../yaml/elk.yml down


echo '=========================='
echo '=====结束后台服务运行====='
echo '=========================='

echo '=====结束运行hanying_admin====='
docker-compose -f ../yaml/hanying_admin.yml down

echo '=====结束运行hanying_picture====='
docker-compose -f ../yaml/hanying_picture.yml down

echo '=====结束运行hanying_sms====='
docker-compose -f ../yaml/hanying_sms.yml down

echo '=====结束运行hanying_web====='
docker-compose -f ../yaml/hanying_web.yml down

echo '=====结束运行hanying_search====='
docker-compose -f ../yaml/hanying_search.yml down

echo '=====结束运行hanying_monitor====='
docker-compose -f ../yaml/hanying_monitor.yml down

echo '=====结束运行hanying_gateway====='
docker-compose -f ../yaml/hanying_gateway.yml down

echo '=========================='
echo '=====结束前台服务运行====='
echo '=========================='

echo '=====结束运行vue_hanying_admin====='
docker-compose -f ../yaml/vue_hanying_admin.yml down


echo '=====结束运行vue_hanying_web====='
docker-compose -f ../yaml/vue_hanying_web.yml down

echo '=============================='
echo '=====所有服务已经结束运行====='
echo '=============================='