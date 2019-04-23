# SessionFactory #

## 本地事务和全局事务 ##

* 本地事务：针对一个数据库的事务
* 全局事务：跨数据库的事务（jta）
* 如何确定你的session有没有及时关闭 
    * windows: cmd netstat -an [oracle 1521 mysql 3306 sql server 1433]
    * linux/unix: netstat -anp top
    
# Session接口 #

* 它的主要功能和作用是：
    * Session一个实例代表与数据库的一次操作（可以是CRUD组合）
    * Session实例通过SessionFactory获取，用完需要关闭
    * Session是线程不同步的（不安全），因此要保证在同一线程中使用，可以用getCurrentSession() 
    * Session可以看作是持久化管理器，它是与持久化操作相关的接口

## get() vs load() ##

* 如果查询不到数据，get()会返回null，但是不会报错，load则报错**OjbectNotFoundException**
* 使用get()去查询数据，会立即向DB发出查询请求（select ...），如果使用load查询数据，即使查询到对象，返回的是一个代理对象。如果后面没有使用查询结果，它不会真的向数据库发出select，当程序员使用查询结果的时候才真的发出select，这个现象我们称为懒加载（lazy）。  
* 通过修改配置文件，可以取消懒加载
* 如何选择使用哪个：如果你确定DB中有这个对象就用load()，不确定就用get()，这样效率高

# hibernate缓存 #


