### ShardingSphere

**process**

- 采用**单库分表** + 主从复制

  单库分表进行**写**操作，其他库进行读操作

  之所以单库写，是因为分库写的场景**不多见**

- 主从复制交给**MySQL自己进行**

  在MySQL创建多个不同端口的服务器

**knowledge**

- 配置**分片策略**，是把数据分配到多个表中
