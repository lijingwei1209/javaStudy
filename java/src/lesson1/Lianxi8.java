package lesson1;

public class Lianxi8 {
  public static void main(String[] args){
	  for(int i =1;i<=100;i++){
		  System.out.println(i);
		  if(i!=6){
			  break;
		  }  //神,这个i!=6时为什么只输出1?  它不是应该是只输出结束了吗?
	  }        //当遇到i!=6时直接终止循环  当i=1是就是!=6啊!不是应该直接终止吗?
	  System.out.println("结束了");
	  
	  
  }
}
