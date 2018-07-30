# 参考 https://yq.aliyun.com/articles/47344
# 定制镜像,以一个镜像为基础，在其上进行定制,基础镜像是必须指定的.FROM就是指定基础镜像
# FROM 是必备的指令，并 且必须是第一条指令。
FROM registry.cn-hangzhou.aliyuncs.com/nibo/oracle-jdk:jdk-8u112
VOLUME /tmp
ADD pirate-eureka-0.0.1-SNAPSHOT.jar app.jar
# RUN 指令是用来执行命令行命令的。
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]

# * Dockerfile 中每一个指令都会建立一层
