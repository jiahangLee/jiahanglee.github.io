#### google密码

*  lijiahangfox@gmail.com  
* 13832352036

#### :bowtie:  表情

* :smirk: :blush: :grin: 

#### git

* git init
* git remote add origin
* git add .
* git commit -m"first blood"
* git push origin master

 ## 0817

#### dva@2

* umi
* mock

:grin: 

## 0821😊 😁 

* 滚动的颜色渐变







## 0822

#### tomcat

* 运行模式
  * bio
  * nio
  * aio（nio2）
  * apr

~~~~
<!--
    <Connector port="8080" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443" />
    -->
    <!-- protocol 启用 nio模式，(tomcat8默认使用的是nio)(apr模式利用系统级异步io) -->
    <!-- minProcessors最小空闲连接线程数-->
    <!-- maxProcessors最大连接线程数-->
    <!-- acceptCount允许的最大连接数，应大于等于maxProcessors-->
    <!-- enableLookups 如果为true,requst.getRemoteHost会执行DNS查找，反向解析ip对应域名或主机名-->
    <Connector port="8080" protocol="org.apache.coyote.http11.Http11NioProtocol" 
        connectionTimeout="20000"
        redirectPort="8443

        maxThreads=“500” 
        minSpareThreads=“100” 
        maxSpareThreads=“200”
        acceptCount="200"
        enableLookups="false"       
    />
~~~~

* 部署方式

  * webapps下直接部署

  * server.xml指定路径

    * ~~~~
      <Context path="/web1" docBase="D:\web1"/>
      ~~~~

  * 通过Catalina来进行配置:进入到confCatalinalocalhost文件下，创建一个xml文件，该文件的名字就是站点的名字。编写XML的方式来进行设置。



## 0823

```
## 0823 三个问题
#### tomcat 只能访问首页‘/’,''/user'就不行;
#### react集成markdown的两种方式；
#### umi@2的升级
```
## 0827

#### 关于git

~~~~java
根据–soft –mixed –hard，会对working tree和index和HEAD进行重置:
    git reset --mixed：此为默认方式，不带任何参数的git reset，即时这种方式，它回退到某个版本，只保留源码，回退commit和index信息
    git reset --soft：回退到某个版本，只回退了commit的信息，不会恢复到index file一级。如果还要提交，直接commit即可
    git reset  --hard：彻底回退到某个版本，本地的源码也会变为上一个版本的内容，此命令 慎用！
    
*************************************************************************************
HEAD（头）
指向当前branch最顶端的一个commit，该分支上一次commit后的节点

This is an alias for the tip of the current branch, which is the most recent commit you have made to that branch.


Index（索引）
The index, 也可以被认为是staging area（暂存区）, 是一堆将在下一次commit中提交的文件，提交之后它就是 HEAD的父节点. （译注：git add添加的文件）
The index, also known as the staging area, is the set of files that will become the next commit. It is also the commit that will become HEAD’s parent.


Working Copy（工作副本）
当前工作目录下的文件，（译注：一般指，有修改，没有git add，没有git commit的文件）

This is the term for the current set of files you’re working on in your file system.


Flow（流程如下）
当你第一次checkout一个新的分支，HEAD指向该分支上最近一次commit。它和index和working copy是一样一样的。
~~~~

* $ git fetch --all $ （有必要）
* git reset --hard origin/master 
* git pull  或者直接Git checkout

![](https://raw.githubusercontent.com/jiahangLee/Img/master/_org/git.png)



## 0828

#### 三个问题及解决方案

* page问题，通过route插件可以过滤
* 404.js问题，单独升级umi（可靠猜想）
* markdown插件引入blog（无解决方案）

#### springboot项目开始

* 端口服务命令
  * netstat -ntlp
  * ps -ef|grep java
  * application.yml文件

  **书签有问题 **

## 0829

####  405

* 405 - 用来访问本页面的 HTTP 谓词不被允许（方法不被允许） 
* 一般是get和post谓词问题
* 前端跨域

## 0830

* commons-lang3 工具类
* mybatis不同于jpa，需要数据库打开自增id
* mybatis中sql-xml的几种不同规则

#### 教师列表展示解决方案

* 前端图片可以先上传，存下path 或者 和数据一块上传

* 后端直接按记录存下

* ```
  readAsDataURL
  ```

## 0831

* 跨域
* 请求格式

## 0904

* mysql 开机运行

* payload 参数的使用

* ```
  @RequestMapping
  ```

## 0905

* dva头像编辑展示问题

## 0906

* 用户登录权限问题

* **git branch -l :查看本地分支**

* **git branch -r :查看远程分支**

* **git branch -a :查看全部分支（远程的和本地的）**

## 0907

* Data too long for column 'editor' at row 1
  * 通过Navicat设置varchar（1000）
  * 设置字符集（不管用）

* 新闻列表的修改还不行

* 无状态和有状态组件

* 受控组件和不受控组件（react富文本有疑问）

* react component有三种形式

  * React.Component
    * 可以有自身的state

  * function
    * 纯函数，不受控吗

## 0910 :palm_tree:

* payload的es6用法
* render（）的执行机制
* :cat:

* 子组件调用父组件函数

  * bind（this，payload）中的this是实例化，方便在函数中使用this.bala

  * 参数参照（id,values,url）
    * url是直接从子组件的resp传过来直接更名的
    * bind（null，id）中的id排在第一位

## 0910

#### es6

* 如果箭头函数不需要参数或需要多个参数，就使用一个圆括号代表参数部分。
* 如果箭头函数的代码块部分多于一条语句，就要使用大括号将它们括起来，并且使用`return`语句返回。
* 由于大括号被解释为代码块，所以如果箭头函数直接返回一个对象，必须在对象外面加上括号，否则会报错。

## 0912

* git ``rm` `-r --cached .`
  * 清除本地失败缓存

## 0913

* rbac权限控制
  * 用户组统一所有权限
  * 权限绑定菜单或页面

## 0914

* 受控组件
  * 无法从web页面修改属性

* 非受控组件
  * 同上相反

## 0917

```js
console.log(typeof p)
```

## 0918

* login如何操作
* sqlsession

## 0919

* ```js
  //实现默认赋值
  const cookie = req.headers.cookie || ''  
  ```

## 0920

#### 登录验证

* 传统方法
  * 后端通过session维持一个回话，返回uid到客户端cookie

* token
  * jwt

## 0926

* prossion的then和catch
* 其他请求没有携带cookie（可能禁用了）

## 0927

* map.tostring与json

## 0928

##### 1. 后端设置set—cookie让前端保存token

* 后台（需要指定localhost）

  ```js
  response.setHeader("Access-Control-Allow-Origin", "http://localhost:8000");
  response.setHeader("Access-Control-Allow-Credentials", "true");
  ```

* 前端

  ```js
  fetch('a.com/api', {credentials: 'include'}).then(function(res) {
      // ...
  })
  ```

##### 2. 如何获取和打印token

* ```js
  response.headers.forEach((v,k)=>console.log(k,v))
  ```

* ```js
  sessionStorage.setItem("token",response.headers.get("token"))
  ```

##### 3. 给headers 添加 token

* 前台

```js
return request(hello2,{
  headers: {
    'Content-Type': 'application/x-www-form-urlencoded',
    Authorization: sessionStorage.getItem("token"),
  },
})
```

* 后台

  ```java
  response.setHeader("Access-Control-Expose-Headers","*");
  //设置前端接收cookie
  response.setHeader("Access-Control-Allow-Origin", "*");
  response.setHeader("Access-Control-Allow-Credentials", "true");
  ```

##### 4. ？为什么null有时报错有时不报

##### 5. react 如果fetch请求data为null，如果没有断点可能根本不会发现

