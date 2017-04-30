# frame
spring+springMVC+mybatis+maven

###### 创建一个web的maven工程
1. idea创建一个新的maven工程
2. 修改这个maven工程为web工程  修改setting -> Factes 选择加号 添加为web 即可

###### 添加忽略文件.gitignore
1. 由于window下不能创建没有名字的文件，所有要用git bash 用linux命令创建，在根目录下 vim .gitignore 编译后 :wq 保存

###### 创建一个简单的spring+mybatis+maven
1. 注意java 下的xml 如果不在pom 文件中声明的话不会编译， 加入以下配置才能编译
```xml
    <build>
        <resources>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.xml</include>
                </includes>
                <filtering>true</filtering>
            </resource>
        </resources>
    </build>
```

###### 把工程变为web工程
 1. maven的web项目默认的webroot是在src\main\webapp。如果在此目录下找不到web.xml就抛出以上的异常。
 ```
 Error assembling WAR:webxml attribute is required
 ```
 解决办法：需要在pom.xml中增加<webResources>配置，如下：
```xml
<build>    
 <finalName>simple-webapp</finalName>    
 <plugins>    
     <plugin>    
         <groupId>org.apache.maven.plugins</groupId>    
         <artifactId>maven-war-plugin</artifactId>    
         <version>2.1.1</version>    
         <configuration>    
     
               <webXml>WebContent\WEB-INF\web.xml</webXml>            
     
         </configuration>    
     </plugin>    
 </plugins>    
  </build>   
```

2. 请注意 webapp是在 src\main  不是在frame下， idea默认添加web 是在项目根目录下
  
 