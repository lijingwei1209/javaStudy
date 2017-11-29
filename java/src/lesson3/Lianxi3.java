package lesson3;
  //练习字符串查找                "s"表示字符串中的s位置    String类要加"" 
  //语法str.indexOf(String s)首次出现位置;  str.lastIndexOf(String s)最后一次出现位置
public class Lianxi3 {
	//寻找最后一个字符串的位置是index的i要大写
  public static void main(String[] args){
	  /*String ant="we are students";
	    int shu=ant.indexOf("a");//查找第一次a出现的位置
	    int shu1=ant.lastIndexOf("e");//查找最后一次e出现的位置
	    System.out.println(shu);
	    System.out.println(shu1);
	    */
	  String bug="welcome to china";
	  int a=bug.indexOf("");
	  int b=bug.lastIndexOf("");
	  int c=bug.length();
	  System.out.println("空字符在字符串bug中的首次索引位置是:"+a);
	  System.out.println("空字符在字符串bug中的最后一次索引位置是:"+b);
	  System.out.println("字符串bug的长度是:"+c);
	  
  }
}
