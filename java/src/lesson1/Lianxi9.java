package lesson1;
//break就是终止的意思,也就是循环走到break就停止了
public class Lianxi9 {
 public static void main(String[] args){
	 /**
	 for(int i = 0;i<3;i++){
		 for(int j=0;j<6;j++){
			 if(j==4){  //如果i=4就结束内部循环
				 break; //只中断了内层循环,外层循环不受影响
			 }  //用加标签的方法可中断所有循环
			 System.out.println("i="+i+"j="+j);
		 }
	 }
	 */
	 Loop:for(int i = 0;i<3;i++){  //在for循环之前用标签标记
		 for(int j = 0;j<6;j++){
			 if(j==4){    //如果j等于4就结束外层循环
				 break Loop;  //跳出Loop标签标记的循环体
			 }
			 System.out.println("i="+i+"j="+j);
		 }
	 }
 }
}
