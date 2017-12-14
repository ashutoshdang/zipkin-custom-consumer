#
# Dockerfile for zipkin-custom-consumer
#

FROM java:8

MAINTAINER Michael Ji

# Install netcat
RUN apt-get update && apt-get install -y netcat

VOLUME /tmp

WORKDIR /zipkin-custom-consumer

ADD target/zipkin-custom-consumer.jar zipkin-custom-consumer.jar

RUN bash -c 'touch /zipkin-custom-consumer.jar'

EXPOSE 10100
CMD ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-jar", "zipkin-custom-consumer.jar"]