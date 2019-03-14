## Scala Learning Repo :tada:

    Chapter One
    1.Config the Environment
    2.Write a hello world Object.
    
    注意事项
    1. Scala语言由一条一条的语句构成 每个语句后不用
    加分号
    2. 同一行有多条语句 最后一个语句不用加分号 其他
    语句需要加分号
    
    Scala的转义字符
    Scala的常用的转义字符
    
    Idea关联scala源代码
    查看源码 输入ctrl+b
    
    Scala的注释方式
    1.单行注释
    2.多行注释
    3.文档注释
    
    规范代码风格 多看源代码
    正确的缩进
    
    Chapter Two
    
    Scala中一切都是变量
    
    变量使用的基本步骤:
    1.声明/定义变量 scala要求变量声明时初始化
    2.使用
    
    变量声明的基本语法
    var | val 变量名[:变量类型] = 变量值
    
    注意事项
    1. 声明变量时 类型可以省略
    2. 类型确定后 就不可以修改 scala是强类型语言
    3. 在声明 定义一个变量时 可以使用 var或者val修饰
    var修饰的变量可以改变 val修饰的变量不可以改变
    4. val修饰的变量在编译后 等同于加上final 
    5. var修饰的对象引用可以改变 val修饰的则不可以改
    变 但对象的状态(值)却是可以改变的(比如自定义对象,数组
    ,集合等)
    6. 变量声明时 需要初始值
    
    +号 与java一模一样
    
    Scala的数据类型
    Scala有着与java相同的数据类型 在scala中 数据类型都是
    对象 也就是说 scala没有java中的原生类型
    
    scala数据类型分为两大类AnyVal(值类型) 和 AnyRef(引用类型)
    注意 不管是AnyVal还是AnyRef 都是对象
    
    Scala中一切都是对象
    
    Scala中数据类型分为两大类 值类型(AnyVal) 引用类型(AnyRef)
    
    都是对象
    
    scala数据类型 遵守 低精度的值类型 向高精度的值类型自动转换(隐式转换)
    
    scala中的特殊类型 Null, 只有一个实例 null 也叫 bottom class
    
    还有一个特殊的类 Nothing 用于在一个函数没有正常返回值时使用
    
    可以把抛出的返回值 返回给任何的变量 函数
    
    
    
    
    
    
    
   