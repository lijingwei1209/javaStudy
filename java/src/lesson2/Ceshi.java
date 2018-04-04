package lesson2;

public class Ceshi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Animal dog = new Dog();
    Dog dog1 = new Dog();
    if(dog.equals(dog1)){
    	System.out.println("两个对象是相等的");
    }else{
    	System.out.println("两个对象是不相等的!!!");
    }
	}

}
