package lesson2;

public class Hello {
    public void show(){
    	final int a = 1;
    	int b = 2;
    	class Inner{
    		int c = 3;
    		public void print(){
    			System.out.println("访问外部类方法中的常量a:"+a);
    			System.out.println("访问内部类中的变量c:"+c);
    		}
    	}
    	Inner mi = new Inner();
    	mi.print();
    }
    public static void main(String []args){
    	Hello ni = new Hello();
    	ni.show();
    }
}
