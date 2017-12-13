package test;

import java.util.Arrays;

public class Array {
public static void main(String[] args){
	   /**int[] scores = { 78,93,97,84,63 };
	   Arrays.sort(scores);
	   System.out.print("scores数组的升序是:");
	   for(int i=0;i< scores.length;i++){
		   System.out.print(scores[i]+"    ");
	   }*/
String[] hobbies = { "sports", "game", "movie" };
    
	// 使用Arrays类的sort()方法对数组进行排序
	Arrays.sort(hobbies);
	
   for(String hobbie:hobbies){
	   System.out.print( hobbie+"   ");
   }
}
}