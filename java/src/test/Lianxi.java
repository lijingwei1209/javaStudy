package test;

public class Lianxi {
 public static void main(String[] args){
	 for(int i=1;i<=5;i++){
		 for(int j=1;j<=5-i;j++)
			 System.out.println(" ");
	  for(int k=1;k<=2*i-1;k++)
		System.out.println('*');
		System.out.println();
		}
	
	 
	 for(int i=1;i<=4;i++){
		 System.out.println(" ");
		 for(int k=7;k>=2*i-1;k--)
			 System.out.print('*');
		 System.out.println();
		 }
	 }
 
}
