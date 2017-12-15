package test;

public class HelloWorld {
   int num1;
   int num2;
   static int num3;
   public HelloWorld(){
	   
	   num1 = 91;
	   System.out.println("通过构造方法初始化num1");
	   
   } 
   {
	   num2 = 74;
	   System.out.println("通过初始化块初始化num2");
   }
   static{   
	   num3 = 83;
	   System.out.println("通过静态初始化块初始化num3");
   }
   public static void main(String []args){
	   
	   HelloWorld hello = new HelloWorld();
	   System.out.println("num1:"+hello.num1);
	   System.out.println("num2:"+hello.num2);
	   System.out.println("num3:"+num3);
	   HelloWorld hello2 = new HelloWorld();
   }
   
}
