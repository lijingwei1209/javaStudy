package lesson1;

public class Lianxi5 {   //创建类
  public static void main(String[] srgs){  //主方法
 /**while语句也称条件判断语句,它的循环方式为利用一个条件来控制是否要继续反复执行这个语句
	  //语法  while(条件表达式){执行语句}
	  //当条件表达式的返回值为真时,则执行{}中的语句,为假时,退出循环。
	  //每一种语法都要先赋值
	   */
	  int x = 1;  //定义int型变量x,并赋给初值
	  int sum = 0;//定义变量用于保存相加后的结果
	  while (x<=10){ 
		  sum = sum+x;  //while循环语句,当变量满足条件表达式时执行循环体语句
		  x++;
	  }
	  System.out.println("sum="+sum);
  }
}
