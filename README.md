# spring-cloud-eureka-server 服务注册中心
## 该项目是使用spring-cloud-eureka搭建的服务注册中心，
> 项目中通过配置了application-peer1.yml和application-peer2.yml两个配置文件来搭建了一个多实例的服务中心集群，增强了注册中心的高可用性。
> 默认启动使用的是application.yml配置文件启动的，
>> 可以通过mvn spring-boot:run -Dspring.profiles.active=peer1和mvn spring-boot:run -Dspring.profiles.active=peer1来启动两个服务中心

## 具体搭建流程可以参考我的blog:[springCloud的使用01-----服务的注册和发现](http://www.cnblogs.com/lifeone/p/9007296.html)
