package lesson1;

public class Lianxi7 {   //创建类
  public static void main(String[] args){  //主方法
	   //for循环语句  语法for(表达式1;表达式2;表达式3){语句序列}
	  int sum = 0;  //声明变量,用于保存各数相加后的结果
	  for(int i=2;i<=100;i=i+2){  //第一个表达式时int i=2 不是i=2!!!
		  sum=sum+i;  //指定循环条件及循环体           也就是语句序列
	  }
		System.out.println("sum="+sum);  //相加后输出的结果
  }
}
