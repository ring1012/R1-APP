#!/bin/bash
# curl -s https://raw.githubusercontent.com/ring1012/R1-APP/refs/heads/main/scripts.sh | bash
# 停止并删除现有容器
docker stop r1
docker rm r1

# 获取用户输入 - 路径
read -p "请输入存储路径（默认/root/r1-iot/）: " user_path
data_path=${user_path:-/root/r1-iot/}

# 获取用户输入 - 密码
read -p "请输入密码（默认123456）: " user_pw
password=${user_pw:-123456}

# 显示用户选择
echo "使用的存储路径: $data_path"
echo "使用的密码: $password"

# 运行容器
docker run --pull=always --restart=always --name="r1" -it -d \
  --network=host \
  -e password="$password" \
  -v "$data_path:/root/.r1-iot" \
  registry.cn-hangzhou.aliyuncs.com/ring1012/r1:server

echo "容器已启动..."
