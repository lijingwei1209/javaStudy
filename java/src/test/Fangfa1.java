package test;

import java.util.Arrays;

public class Fangfa1 {
	
	public static void main(String[] args) {
        int[] scores = {89,-23,64,91,119,52,73};//定义一个数组
        System.out.println("考试成绩的前三名成绩为:");
        Fangfa1 hello=new Fangfa1(); //创建对象,对象名为hello
        hello.showTop3(scores);//调用方法,传入成绩数组
    }
	public void showTop3(int[] scores){
		Arrays.sort(scores); //使用Arrays对数组排序
		int num=0;//保存有效成绩的数量
	
		for(int i=scores.length-1;i>=0;i--){//倒叙遍历数组中的每一个元素
			if(scores[i]<0||scores[i]>100){//判断成绩的有效性
				continue;//如果成绩无效则跳出本次循环,成绩无效
			}
			num++;//有效成绩加1
			if(num>3){//判断有效成绩的数量
				break;//如果有效的成绩大于3,则结束循环,只输出成绩的前三名
			}
			 
			System.out.println(scores[i]);//依次输出前三名成绩
		}
		
	}
	
}
