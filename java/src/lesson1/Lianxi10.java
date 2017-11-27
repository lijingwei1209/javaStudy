package lesson1;
//continue是跳过这一处的意思,循环跳过这一处接着还运行.
public class Lianxi10 {
  public static void main(String[] args){
	  for(int i=0;i<20;i++){
		  if(i%2==0){    //如果i是偶数
			continue;    //跳到下一个循环
		  }
		  System.out.println(i);//输出i的值
	  }
	  
  }
}
