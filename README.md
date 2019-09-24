# 使用pinpoint-agent进行链路监控的微服务工程示例
# 说明
1.本工程分为4个模块：注册中心（eureka）,生产者（producer），消费者（consumer），公共模块（common）<br>
2.服务之间调用采用Feign<br>
3.本工程使用Dockerfile生成docker镜像，使用docker-compose批量构建和启动docker容器<br>
4.启动本工程前需要提交构建好pinpoint容器，且每个module的thirdpartComponent包下的pinpoint-agent.zip包会一同封装进docker镜像，该zip包中需要修改pinpoint.config的profiler.collector.ip为已部署完成的ponpoint-collector的服务器IP.
