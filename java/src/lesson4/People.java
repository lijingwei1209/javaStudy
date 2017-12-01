package lesson4;

public class People {

	static String name = "haha";//这就是类变量，也是静态变量。带static
	int age = 2;//这个是普通的成员变量
	
	public static void eat() {
		//这个类方法，带static
		System.out.println("我要吃各种食物！");
	}
	
	public void sleep() {
		//这个是普通的成员方法
		System.out.println("我要睡觉！");
	}
	
	public int work(int a, int b) {
		//这个是带返回值的方法
		return a+b;
	}
	
	
	public void sayName(){
		System.out.println("我的名字是"+this.name);
	}
	
	public static void main(String[] args) {
		People p1 = new People();//创建了p2对象
		p1.eat();
		People.eat();//对象和类同时能调用类方法。
		p1.sayName();
		int num = p1.work(3, 5);
		System.out.println("我计算的数等于"+num);
		
		People p2 = new People();//又创建了p2对象
//		People.sleep();这里保错，类不能调用成员方法了。只能它儿子来调用
		p2.sleep();
		
	}

}
