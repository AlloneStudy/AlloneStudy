//数值与表达式部分: 等同于调用一个对象的方法,Groovy运算符都是对象某方法的重载
def dataCeshi= 5+3 
println(dataCeshi)
def dataCeshi1 = 5.plus(3)
println(dataCeshi1)

//自增运算
def x=10
def y= ++x
println(y)
def x1=10;
def y1= x1.next()
println(y1)

//字符串与表达式
def intstr = 33
println('He want $intstr')
println("He want $intstr")
println("He want \$intstr")
//三个单引号字符串可以使多行文本，并保留文本格式
def aMultilineString = '''line one
line two
line three'''
println(aMultilineString)

//字符串包含的各种取值操作
def greeting = 'Hello world'
println(greeting[4])
println(greeting[-1])
println(greeting[1..2])
println(greeting[1..<3])
println(greeting[4..2])
println(greeting[4,1,6])


//闭包
//闭包是可以用作函数参数和方法参数的代码块”。其实Groovy的闭包更象是一个“代码块”或者方法指针，
//代码在某处被定义然后在其后的调用处执行。隐含变量，支持自由变量，支持currying:将拥有多个参数的函数Currying化为拥有单一参数的函数形式

//1.闭包中可以包含代码逻辑，闭包中最后一行语句，表示该闭包的返回值，不论该语句是否冠名return关键字 
def a = 'coffee'
def c = {
  def b = 'tea'
  a + ' and ' + b //a refers to the variable a outside the closure,
                  //and is remembered by the closure
}
println(c.call())

//有参数的闭包
 def printSum = { a, b -> print a+b }
 println( printSum( 5, 7 ))

//java和Groovy对结合遍历,使用闭包的对比

//java形式遍历数组
def acoll = ["Groovy", "Java", "Ruby"]       
for(Iterator iter = acoll.iterator(); iter.hasNext();){
 println iter.next()
}

//Groovy闭包形式进行遍历
def acoll = ["Groovy", "Java", "Ruby"]
        
acoll.each{
 println it
}



