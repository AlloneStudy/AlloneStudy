//��ֵ����ʽ����: ��ͬ�ڵ���һ������ķ���,Groovy��������Ƕ���ĳ����������
def dataCeshi= 5+3 
println(dataCeshi)
def dataCeshi1 = 5.plus(3)
println(dataCeshi1)

//��������
def x=10
def y= ++x
println(y)
def x1=10;
def y1= x1.next()
println(y1)

//�ַ�������ʽ
def intstr = 33
println('He want $intstr')
println("He want $intstr")
println("He want \$intstr")
//�����������ַ�������ʹ�����ı����������ı���ʽ
def aMultilineString = '''line one
line two
line three'''
println(aMultilineString)

//�ַ��������ĸ���ȡֵ����
def greeting = 'Hello world'
println(greeting[4])
println(greeting[-1])
println(greeting[1..2])
println(greeting[1..<3])
println(greeting[4..2])
println(greeting[4,1,6])


//�հ�
//�հ��ǿ����������������ͷ��������Ĵ���顱����ʵGroovy�ıհ�������һ��������顱���߷���ָ�룬
//������ĳ��������Ȼ�������ĵ��ô�ִ�С�����������֧�����ɱ�����֧��currying:��ӵ�ж�������ĺ���Currying��Ϊӵ�е�һ�����ĺ�����ʽ

//1.�հ��п��԰��������߼����հ������һ����䣬��ʾ�ñհ��ķ���ֵ�����۸�����Ƿ����return�ؼ��� 
def a = 'coffee'
def c = {
  def b = 'tea'
  a + ' and ' + b //a refers to the variable a outside the closure,
                  //and is remembered by the closure
}
println(c.call())

//�в����ıհ�
 def printSum = { a, b -> print a+b }
 println( printSum( 5, 7 ))

//java��Groovy�Խ�ϱ���,ʹ�ñհ��ĶԱ�

//java��ʽ��������
def acoll = ["Groovy", "Java", "Ruby"]       
for(Iterator iter = acoll.iterator(); iter.hasNext();){
 println iter.next()
}

//Groovy�հ���ʽ���б���
def acoll = ["Groovy", "Java", "Ruby"]
        
acoll.each{
 println it
}



