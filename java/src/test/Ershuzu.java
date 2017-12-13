package test;

public class Ershuzu {
	public static void main(String[] args){
		int[][] num=new int[3][];//定义一个三行的二维数组
		num[0]=new int[2];//为第一行分配两列
		num[1]=new int[3];//为第二行分配三列
		num[2]=new int[4];//为第三行分配四列
		num[0][0]=1;//第一行第一列赋值为1
		num[1][1]=2;//第二行第二列赋值为2
		num[2][2]=3;//第三行第四列赋值为3
		System.out.print(num[0][0]);
		System.out.println(num[0][1]);
		System.out.print(num[1][0]);
		System.out.print(num[1][1]);
		System.out.println(num[1][2]);
		System.out.print(num[2][0]);
		System.out.print(num[2][1]);
		System.out.print(num[2][2]);
		System.out.println(num[2][3]);
  
}
}