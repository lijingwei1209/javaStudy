package lesson1;

public class Lianxi4 { //创建类
   public static void main(String[] args){  //主方法
	   String str="河南周口";  //定义String型变量"河南周口"
	   switch(str){     //定 义switch语句中的表达式为变量str
	   case ("河南"):    //定义case语句中的常量"河南"
		   System.out.println("www.zhoukou.com"); //输出信息
	   break;
	   case ("河南周口"): //定义case语句中的常量"河南周口"
		   System.out.println("很屌的城市哦!"); //输出信息
	   break;
	   default:   //default语句
		   System.out.println("我就知道周口最好"); //输出信息
	   
	   }
	   
	   
	   
   }
}
