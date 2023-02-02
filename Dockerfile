FROM java:8

LABEL base-image="java:8" \
      purpose="Hello World Fuse Dockerfile"

MAINTAINER Muhammad Edwin < edwin at redhat dot com >

# set working directory at /deployments
WORKDIR /deployments

# copy my jar file
COPY target/*.jar app.jar

# gives uid
USER 185

EXPOSE 8080

# run it
CMD ["java", "-jar","app.jar"]