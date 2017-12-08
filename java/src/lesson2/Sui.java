package lesson2;

public class Sui {
	public static void main(String[] args){
		String str="192.168.0.1";
		String[]Ant=str.split("\\.");
		String[]Bnt=str.split("\\.",2);
		System.out.println("str的原值为:"+"["+str+"]");
	    System.out.print("全部分割的结果为: ");
	      for(String a:Ant){
	    	  System.out.print("["+a+"]");
	      }
        System.out.println();
        System.out.print("分割两次的结果为: ");
        for(String a:Bnt){
        	System.out.print("["+a+"]");
        }
        System.out.println();
  }
}
