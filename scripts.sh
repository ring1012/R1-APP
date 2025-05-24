#!/bin/bash
docker stop r1
docker rm r1
docker run  --pull=always  --restart=always --name="r1" -it -d --network=host -e password=123456  -v /root/r1-iot/:/root/.r1-iot registry.cn-hangzhou.aliyuncs.com/ring1012/r1:server
