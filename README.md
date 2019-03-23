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
    
    整数类型:
    
    Byte   8位 
    Short  16位
    Int    32位
    Long   64位
    
    Scala整型 字面量 默认Int 声明Long 字面量后面需要
    加 L
    
    浮点类型
    
    Float 4字节
    Double 8字节
    
    scala的浮点常量默认为Doubble 声明为Float常量 需加f
    
    字符类型
    
    可以表示为单个字符 字符类型是Char 16位无符号Unicode字符
    
    两个字节 
    
    boolean 只有true false
    
    占1个字节
    
    Unit类型 Null类型 Nothing
    
    Unit表示无值 和其他语言中的void相同 用于不返回
    任何结果的方法
    
    Null 只有一个实例 null
    
    Nothing 在scala的最底端 是其他任何类型的子类型
    当一个函数确定没有正常的返回值 可以用nothing指定
    返回类型
    
    值类型转换
    
    隐式转换 精度小的类型转换为精度大的类型
    
    强制类型转换
    自动类型转换的逆向过程 将大容量的数据类型转换
    为容量小的数据类型 使用时要加上强制转换 但可能
    造成精度降低或溢出
    
    强制符号只针对最近的操作有效 往往会使用小括号提升
    优先级
    
    值类型和字符串的转换
    
    标识符和命名规范
    
    首字符为字母 后续字符为任意的字母和数字 美元符号 可以
    跟下划线
    
    数字不可以开头
    
    首字符为操作符(+-*/) 后续的字符也要跟操作符 最少一个
    
    操作符不能在标识符的中间和最后
    
    用反引号包住的任意字符 即使是关键字也可以
    
    Chapter Three
    
    运算符 
    
    算数运算符
     
    关系运算符 返回布尔型
    
    scala没有三元运算符
    
    键盘输入语句
    
    流程控制 顺序 分支 循环
    
    scala先定义变量 在使用变量
    
    Scala的for循环 - for推导式
    
    for(i <-1 to 3) {
        
    }
    
    i表示循环的变量 , <- to 是关键字
    i将会从1到3进行循环
    
    for(i <- 1 until 3) {
        
    }
    
    这种方式 不包括3
    
    循环守卫
    
    for(i <- 1 to 3 if i != 2) {
        print(i)
    }
    
    保护式为true 进入循环体的内部 为false则跳过 类似于continue
    
    
    
    
    
    