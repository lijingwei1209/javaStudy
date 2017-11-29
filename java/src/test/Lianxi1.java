package test;

public class Lianxi1 {
	public static void main(String[] args){
		String str="192.168.0.1";
		String[]Ant=str.split("\\.");
		String[]Bnt=str.split("\\.",2);
		System.out.println("["+str+"]");
	    System.out.println(Ant);
        System.out.println(Bnt);
	 
}
}