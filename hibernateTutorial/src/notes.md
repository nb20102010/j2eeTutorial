# SessionFactory #
## ���������ȫ������ ##
* �����������һ�����ݿ������
* ȫ�����񣺿����ݿ������jta��
* ���ȷ�����session��û�м�ʱ�ر� 
    * windows: cmd netstat -an [oracle 1521 mysql 3306 sql server 1433]
    * linux/unix: netstat -anp top
    
# Session�ӿ� #
* ������Ҫ���ܺ������ǣ�
    * Sessionһ��ʵ�����������ݿ��һ�β�����������CRUD��ϣ�
    * Sessionʵ��ͨ��SessionFactory��ȡ��������Ҫ�ر�
    * Session���̲߳�ͬ���ģ�����ȫ�������Ҫ��֤��ͬһ�߳���ʹ�ã�������getCurrentSession() 
    * Session���Կ����ǳ־û���������������־û�������صĽӿ�
