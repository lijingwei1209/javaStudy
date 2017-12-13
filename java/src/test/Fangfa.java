package test;

public class Fangfa {
	public void print() { //public访问修饰符,void返回值类型,print方法名
		System.out.println("Hello World");
	}
    
public static void main(String[] args){//String[] args是参数列表
        
        //在 main 方法中调用 print 方法
        Fangfa test=new Fangfa();
        test.print();
}
}