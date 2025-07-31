# Java 学习仓库

欢迎来到我的 **Java 学习仓库**！这里是我系统学习以及梳理 Java 语言及其生态的记录与实践。请大佬们多多指教。

---

## 目录结构说明

本仓库按照 Java 语言知识体系与实践需求，划分成若干模块，便于分类学习和查阅。整体设计兼顾理论与实战，力求帮助我理解 Java 底层原理、语言特性及生态工具。

```

java-learning/
├── README.md                  # 本说明文档
├── .gitignore                 # Git 忽略配置
├── docs/                      # 理论笔记、图示、知识总结
│   ├── java-memory-model.md   # Java 内存模型理论
│   ├── string-intern.md       # 字符串常量池相关笔记
│   └── ...
├── language-basics/           # Java 基础语法学习：变量、控制流、运算符等
│   ├── variables/             # 变量相关示例与练习
│   ├── control-flow/          # if、switch、循环等控制结构
│   └── operators/             # 算术、逻辑等运算符示例
├── oop/                      # 面向对象编程核心：封装、继承、多态
│   ├── encapsulation/         # 访问权限、封装原则示例
│   ├── inheritance/           # 继承结构与方法重写
│   └── polymorphism/          # 多态实现及应用
├── type-system/              # Java 类型系统深度学习：包装类、泛型、枚举、注解
│   ├── wrapper-types/         # 基本类型与包装类
│   ├── generics/              # 泛型使用与原理
│   ├── enums/                 # 枚举类型及常见用法
│   └── annotations/           # 注解定义与反射调用
├── exception-handling/       # 异常机制：捕获、抛出、自定义异常
│   ├── try-catch/             # 异常捕获示例
│   └── custom-exceptions/     # 自定义异常类实现
├── standard-library/         # Java 标准库核心：集合、IO/NIO、字符串、数学等
│   ├── collections/           # List、Set、Map 等集合分类详解
│   ├── string/                # 字符串相关工具与常见操作
│   ├── math/                  # Math 类常用方法示例
│   ├── io/                   # 传统文件输入输出
│   └── nio/                   # 新 IO (NIO) API
├── date-time/                # 时间日期 API（java.time 包）
│   ├── localdate/             # LocalDate 相关操作
│   └── datetime-formatting/   # 时间格式化与解析示例
├── concurrency/              # 并发编程深入：线程、锁、线程池、原子操作
│   ├── thread/                # 线程创建与生命周期
│   ├── synchronized/          # 关键字锁与同步
│   ├── executor/              # 线程池及并发工具
│   └── atomic/                # 原子类及无锁编程
├── functional/               # 函数式编程实践：Lambda、Stream、Optional
│   ├── lambda/                # Lambda 表达式示例
│   ├── stream/                # Stream API 详解
│   └── optional/              # Optional 使用方法
├── jvm-internals/            # JVM 原理及性能调优基础：类加载、内存模型、字节码、GC
│   ├── classloader/           # 类加载机制解析
│   ├── jmm/                   # Java 内存模型深入
│   ├── bytecode/              # 字节码指令分析
│   └── gc/                    # 垃圾回收机制与调优
├── tools-and-build/          # 构建与工具链：Maven、Gradle、Javadoc、打包
│   ├── maven/                 # Maven 配置与使用
│   ├── gradle/                # Gradle 入门与构建示例
│   ├── javadoc/               # Javadoc 注释规范与生成
│   └── jar/                   # JAR 包创建与管理
├── testing/                  # 单元测试与 Mock 框架
│   ├── junit/                 # JUnit5 测试案例
│   └── mockito/               # Mockito 模拟测试
├── design-patterns/          # 常用设计模式代码示例
│   ├── singleton/             # 单例模式
│   ├── observer/              # 观察者模式
│   └── strategy/              # 策略模式
├── network/                  # 网络编程基础：Socket、HTTP、URL
│   ├── socket/                # Socket 编程
│   ├── http/                  # HTTP 协议相关
│   └── url/                   # URL 操作

```

---

## 使用建议

- create_java_learning_dirs.bat 来方便自动化构建此目录；
- 每个模块我会结合理论和代码示例，按主题逐步深化学习；
- `docs/` 目录中会积累重要笔记，方便复习和面试准备；
- 通过实践案例熟悉 Java 生态，尤其并发、函数式、JVM 原理等重点内容；
- 工具链模块帮助掌握项目构建与维护；
- 单元测试和设计模式模块为后续大型项目开发打好基础；
- 网络模块为了解基础通信协议和编程。

---

欢迎 Star 和 Fork 😊！如果你有更好的建议，也欢迎提 Issue 或 Pull Request 交流。
