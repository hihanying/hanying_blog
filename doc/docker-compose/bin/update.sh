#!/usr/bin/env bash

echo '=====开始更新应寒博客镜像====='

echo '=====开始关闭运行的容器====='
sh kernShutdown.sh

echo '=====开始更新hanying-gateway====='
docker pull registry.cn-shenzhen.aliyuncs.com/hyblog/hanying_gateway

echo '=====开始更新hanying-admin====='
docker pull registry.cn-shenzhen.aliyuncs.com/hyblog/hanying_admin

echo '=====开始更新hanying-web====='
docker pull registry.cn-shenzhen.aliyuncs.com/hyblog/hanying_web

echo '=====开始更新hanying-sms====='
docker pull registry.cn-shenzhen.aliyuncs.com/hyblog/hanying_sms

echo '=====开始更新hanying-picture====='
docker pull registry.cn-shenzhen.aliyuncs.com/hyblog/hanying_picture

echo '=====开始更新vue_hanying_admin====='
docker pull registry.cn-shenzhen.aliyuncs.com/hyblog/vue_hanying_admin

echo '=====开始更新vue_hanying_web====='
docker pull registry.cn-shenzhen.aliyuncs.com/hyblog/vue_hanying_web

echo '=====删除docker标签为none的镜像====='
docker images | grep none | awk '{print $3}' | xargs docker rmi

echo '=====开始运行的一键部署脚本====='
sh kernStartup.sh
