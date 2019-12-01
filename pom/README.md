# springDeepMind 
深入spring源码解析和学习


## aop

### aop 术语

#### advice 通知
advice 定义了切面是什么以及何时使用，when+what效果

例如：spring 切面对应5种类型通知：
1. Before
2. After
3. After-returning 在方法成功执行之后调用
4. After-throwing 在方法抛出异常后调用
5. Around

#### join point 连接点
在应用执行过程中，能够插入切面的一个点，可以理解为**where**.目前spring aop 只支持 到方法级别，
可以理解为join point 就是方法执行时候

#### pointcut 切点
切点是对连接点的一个表达式，通过匹配表达式实现区域性的面，可以理解为切点就是将符合表达式（express）的连接点连接起来

#### aspect 切面
切面是通知（advice）和切点（pointcut）的结合，即是他们结合的统称，可以理解为when,where,how串联效果

#### 目标对象 target
即aop 的切入目标类

#### 高级术语
*. 引入(introduction):特殊增强，为目标类**动态添加属性或者方法**.

*. 织入(Weaving): 是将advice添加到目标类具体连接点上的**过程**。目前aop有三种织入过程：
1. 编译器织入，需要特殊的 java编译器
2. 类装载期织入，需要特殊的类装载器
3. 动态代理织入，在运行期为目标添加增强生成子类的方式

>Spring 采用动态代理织入, AspectJ采用编译器织入和类装载器织入

#### AOP实现者
1. AspectJ (2005年 AspectJ和AspectWerkz 合并)
2. JBoss AOP
3. Spring AOP


### aop 实现

#### 接口实现

#### xml实现

#### 注解实现




