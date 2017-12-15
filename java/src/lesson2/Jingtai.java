package lesson2;

public class Jingtai {
  String name = "随亚涛";
  static String pinyin = "suiyatao";
   public static void main(String []args){
	   Jingtai mi = new Jingtai();
	   Jingtai ni = new Jingtai();
	   ni.show();
	     System.out.println("在静态方法中调用静态变量:"+pinyin);
	     System.out.println("在静态方法中调用非静态变量:"+mi.name);
   }
   public void show(){
	   System.out.println("在普通方法中调用静态变量:"+Jingtai.pinyin);
	   System.out.println("在普通方法中调用非静态变量:"+name);
   }
   
}
