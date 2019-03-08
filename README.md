# spring-cloud-fescar
spring cloud集成fescar的demo工程





## 准备工作

1. 阅读官方文档Quick Start，并成功启动fescar-server

* [传送门](https://github.com/alibaba/fescar/wiki/Quick-Start)

2. 初始化demo数据库

* 工程路径下fescar_demo.sql文件



## 测试效果

1. 修改demo工程中的配置文件

* account-service：用户账户服务，仅提供用户账户的扣减接口，端口：11111
* business-service：上层业务服务，提供下单接口，端口：11112
* order-service：订单服务，仅提供订单创建接口，端口：11113
* storage-service：库存服务，仅提供库存扣减接口，端口：11114

将这四个服务的bootstrap.yml配置文件中的dataSource修改为本机测试用的dataSource

ps.真实分布式场景会是四个不同的数据源，这里在四个工程下使用同一数据源，也能模拟四个不同数据源的效果，另外，需要注意端口占用问题。

（如果出现jar包报红，记得先将spring-cloud-fescar-config工程打包进本地仓库）

2. 分别启动四个工程
3. 开始测试

* 使用postman或其他测试工具发起http调用：执行下单操作

默认环境下：

url: http://localhost:11112/business

method: PUT

header: contentType = application/json

requestBody: 

{
	"userId":"U100001",
	"commodityCode":"C00321",
	"orderCount":2
}

* 程序设计效果

1. 在每个服务调用时均有1/10的概率会调用失败
2. 当库存不足或用户余额不足时会报业务异常

* 期望效果

1. 程序正常执行，请求成功，响应码200，查看数据库，各个表的数据一致
2. 程序执行失败，请求失败，响应码500，查看数据库，各个表的数据一致
