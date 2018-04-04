package project;

public class Inital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /**Anaimal obj1 = new Anaimal();
    Anaimal obj2 = new Dog();
    Dog obj3 = (Dog)new Anaimal();*/
	Dog dog = new Dog();
    Anaimal anaimal = dog;
    Dog dog2 = (Dog)anaimal;
    if(anaimal instanceof Cat){
    Cat cat =(Cat)anaimal;
    }else{
    	System.out.println("无法进行强制类型转换!");
    }
	}
}
