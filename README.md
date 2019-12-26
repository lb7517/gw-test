## springcloud gateway 网关测试项目

#### 1. 此项目包含gateway网关的实现，网关中过滤器的使用；ribbon负载均衡的实现(包含HealthExamination类的健康检查)；hystrix熔断的实现(即映射到的服务没有响应，会直接响应异常返回)；

#### 2. gateway网关实现有以下两种方式:
-  application.yml 配置
+  RouteLocatorConfig 通过类实现