利用mybatis自动生成DAO,Mapping,Entity文件
===
在resources目录下generatorConfig.xml文件<br/>
第一、~~在generatorConfig.xml中根据本机数据库驱动的jar包存放路径，配置classPathEntry,~~在maven中配置的就不用配置了<br/>
第二、jdbcConnection配置数据库驱动和连接字符串<br/>
第三、要生成那些表(更改tableName和domainObjectName就可以)<br/>