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
