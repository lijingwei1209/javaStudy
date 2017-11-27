package lesson1;

public class Lianxi1 {          //创建类
  public static void main(String[] args){  //主方法
	  int math =95;    //声明int型局部变量,并赋值给初值95
	  int english =56; //声明int型局部变量,并赋值给初值56
	  if (math > 60){  //使用if语句判断math是否大于60
		  System.out.println("数学及格了");  //条件成立时输出的信息
		  }else{
		  System.out.println("数学没有及格");//条件不成立时输出的信息
		  }
	  if (english > 60){ //使用if语句判断英语是否大于60
		  System.out.println("英语及格了");  //条件成立时输出的信息
	  }else{
		  System.out.println("英语不及格");  //条件不成立时输出的信息
	  }
	  
  }
}
