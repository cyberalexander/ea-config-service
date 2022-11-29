FROM openjdk:17-alpine
RUN apk update && apk upgrade && apk add netcat-openbsd && apk add curl
RUN mkdir -p /usr/local/ea-config-service
RUN echo $JAVA_HOME
ADD  @project.build.finalName@.jar /usr/local/ea-config-service/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh