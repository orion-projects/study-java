package org.example.spring.transaction;
/**
 * 事务的4个特性
 * 1、原子性
 * 2、持久性
 * 3、隔离性
 * 4、一致性
 */

/**
 * 数据并发的问题
 * 1、脏读
 *    A事务读取B事务尚未提交的数据并在此基础上操作，而B事务执行回滚，则A读取到的数据就是脏读。
 * 2、不可重复读
 *    A事务读取B事务已经提交的更改数据。
 * 3、幻像读
 *    A事务读取B事务提交的新增数据。
 * 4、第一类丢失更新
 *    A事务撤销时把已经提交的B事务的更新数据覆盖。
 * 5、第二类丢失更新
 *    A事务覆盖B事务已经提交的数据，造成B事务操作丢失。
 */

/**
 * 事务隔离级别
 *      隔离级别         脏读     不可重复读     幻像读    第一类丢失更新     第二类丢失更新
 *  read uncommitted   允许        允许        允许        不允许             允许
 *   read committed   不允许       允许        允许        不允许             允许
 *  repeatable read   不允许      不允许        允许       不允许            不允许
 *   serializable     不允许      不允许       不允许       不允许            不允许
 */

/**
 * Spring事务
 *    PlatformTransactionManager根据TransactionDefinition提供的事务属性配置信息创建事务并用TransactionStatus描述激活事务的状态。
 * 1、TransactionDefinition
 *    定义Spring兼容的事务属性。
 * a、事务隔离
 * b、事务传播
 * c、事务超时
 * d、只读状态
 * 2、TransactionStatus
 *    代表一个事务的具体运行状态。
 * 3、PlatformTransactionManager
 *    管理事务。
 */

/**
 * Spring的事务管理器实现类
 * 1、{@link JpaTra}
 */