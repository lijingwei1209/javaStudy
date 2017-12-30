package test;

public class Animal {
	public void voico(){
		System.out.println("动物会叫");
	}
}
 class cat extends Animal{
	 public void voico(){
		 System.out.println("喵喵喵");
	 }
	 public void catchmouse(){
		 System.out.println("我会抓老鼠!");
	 }
 }
 class dog extends Animal{
	 public void voico(){
		 System.out.println("汪汪汪");
	 }
 }
 class pig extends Animal{
	 public void voico(){
		 System.out.println("呵呵呵");
	 }
	
 }
   