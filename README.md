### [Spring Boot(二)：Web 综合开发][1]

1. 

---- 



### [Spring Boot(一)：入门篇][2]
1. helloworld 完成
2. est完成(@SpringBootTest 换成@ContextConfiguration，暂时不懂为什么，可能上版本更替，老的注解被新注解取缔) 
3. 开发环境的调试
*  首先添加依赖
		<dependencies>
		    <dependency>
		        <groupId>org.springframework.boot</groupId>
		        <artifactId>spring-boot-devtools</artifactId>
		        <optional>true</optional>
		    </dependency>
		</dependencies>
* 开启idea[热部署][3],动态编译和加载
* 配置application.yml
		spring:
		  devtools:
		    restart:
		      enabled: true
		      poll-interval: 3000ms
		      quiet-period: 2999ms
* 个人理解: 热部署的原理: 使用A,B两个加载器加载类,A加载不变的类,B加载变化的类. 当文件变化时,会生成一个新的加载器B,叫B1,老的加载器B会经过gc清理掉加载的类,B1会加载新的变化过的类,实现热部署.


----  

# spring-boot-practice
*引言* 为学习spring boot,在csdn上找了个高赞的博客,以他的[资料][4]参考进行有规划的学习



[1]:	http://www.ityouknow.com/springboot/2016/02/03/spring-boot-web.html
[2]:	http://www.ityouknow.com/springboot/2016/01/06/spring-boot-quick-start.html
[3]:	https://jiming.blog.csdn.net/article/details/100116858
[4]:	https://www.cnblogs.com/ityouknow/p/5662753.html