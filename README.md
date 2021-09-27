Deploying Fuse to Openshift 4
===================

Tools
-------------------
* Programming Language - Java 8
* Library - Red Hat Fuse 7.9

How to Deploy
------------------

```
oc new-app registry.access.redhat.com/ubi8/openjdk-8~https://github.com/edwin/hello-world-fuse-on-ocp
```

Blog Post
------------------
```
https://edwin.baculsoft.com/2021/08/deploying-fuse-7-on-top-of-spring-boot-to-openshift-4/
```


Actuator and Prometheus
------------------
Above monitoring tools are published at a different port compared to application's. Port 8080 for Apps, and 9090 for monitoring.