package lesson2;

public class Dog extends Animal {
	public static void main(String[] args){
	Dog dog = new Dog();
	    dog.age = 5;
        dog.eat();
        
}
	public void eat(){//方法重写
		   System.out.println("年龄:"+age+"狗有吃东西的能力!");
	   }
}