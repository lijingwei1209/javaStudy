package lesson2;

public class Dog extends Animal {
	public int age= 20;
	public void eat(){
		System.out.println("狗具有吃东西的能力! ");
	}
	public  Dog(){
		   System.out.println("Dog类执行了!");
	   }
	public void method(){
		eat();
	}
	@Override
	public String toString() {
		return "Dog [age=" + age + "]";
	}
}
	
