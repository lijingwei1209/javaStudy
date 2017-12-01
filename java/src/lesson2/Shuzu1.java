package lesson2;

import java.util.Arrays;

public class Shuzu1 {
  public static void main(String[] args){
	  int[] arr={1,3,6,2,3,4,5,6,5,4,3};
	  Arrays.fill(arr,3,7,0);
	  for(int i=0;i<arr.length;i++){
		 if(arr[i]==0){
			 System.out.print("*");
		 }else{
			 System.out.print(arr[i]);
		 }
		 
	  }
	  
  }
}
