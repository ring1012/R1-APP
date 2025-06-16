#!/bin/sh
# curl -s https://raw.githubusercontent.com/ring1012/R1-APP/refs/heads/main/scripts.sh | bash
# 停止并删除现有容器（如果存在）
docker stop r1 >/dev/null 2>&1
docker rm r1 >/dev/null 2>&1

# 获取存储路径（默认 /root/r1-iot/）
echo -n "请输入存储路径（默认 /root/r1-iot/）: "
read user_path
data_path="${user_path:-/root/r1-iot/}"

# 获取密码（默认 123456）
echo -n "请输入密码（默认 123456）: "
read user_pw
password="${user_pw:-123456}"

# 显示用户选择
echo ""
echo "=== 配置确认 ==="
echo "存储路径: $data_path"
echo "密码    : $password"
echo "================="
echo ""

# 运行容器
echo "正在启动容器..."
docker run \
  --pull=always \
  --restart=always \
  --name="r1" \
  -it -d \
  --network=host \
  -e password="$password" \
  -v "$data_path:/root/.r1-iot" \
  registry.cn-hangzhou.aliyuncs.com/ring1012/r1:server

# 检查是否运行成功
if docker ps --filter "name=r1" --format "{{.Names}}" | grep -q "r1"; then
  echo "✅ 容器已成功启动！"
else
  echo "❌ 容器启动失败，请检查日志！"
fi
