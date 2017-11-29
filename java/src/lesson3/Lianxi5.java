package lesson3;
  //获取子字符串      在字符串中空格占用一个索引位置
  //语法:str.substring(int s)  ;str.substring(int s,s)
public class Lianxi5 {
   public static void main(String[] args){
	   String ant="we are students";//定义字符串ant
	   String a=ant.substring(3);   //获取字符串
	   System.out.println(a);
	   String b=ant.substring(0,3);  //对字符串进行截取
	   System.out.println(b);
	   
   }
}
