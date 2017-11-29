package lesson3;
   //去除空格   语法str.trim() 返回媳妇穿副本,忽略前导空格和尾部空格
public class Lianxi6 {
  public static void main(String[] args){
	  String str="  we  are good  student     ";
	  /* 
	  String ant=str.trim();//只去除前面后最后面的空格
	  System.out.println("["+ant+"]");
	 String bug=str.replaceAll("\\s","");//用正则表达式去除所有空格
	  System.out.println("["+bug+"]");
	  */
	  System.out.println("字符串原来的长度"+str.length());
	  System.out.println("除去前后空格后字符串的长度"+str.trim().length());
  }
}
