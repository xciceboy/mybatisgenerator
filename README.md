#利用mybatis自动生成DAO,Mapping,Entity文件
##在resources目录下generatorConfig.xml文件
###第一、在generatorConfig.xml中根据本机数据库驱动的jar包存放路径，配置classPathEntry
###第二、jdbcConnection配置数据库驱动和连接字符串
###第三、要生成那些表(更改tableName和domainObjectName就可以)