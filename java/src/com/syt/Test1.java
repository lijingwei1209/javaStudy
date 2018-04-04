package com.syt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) throws ParseException{
		//定义一个长度为10的数组
		int[] nums = {1,2,3,4,5,6,7,8,9,0};
		//通过循环给数组赋值
		for(int i=1;i<nums.length;i++){
			//产生10以内的随机数
			int b = (int)(Math.random()*10);
			//为元素赋值
			  nums[i]=b;
		}
		for(int v :nums)//for(循环变量类型 循环变量名称 :要被遍历的对象(数组))
			{
			System.out.print(nums[v]+" ");
			
		}
		System.out.println(" ");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		Date date = new Date();
		
		System.out.println(sdf1.format(date));
		String s1 = "imooc";
		String s2 = new String("imooc");
        if(s1==s2){
        	System.out.println("是相等的");
        }else{
        	System.out.println("不是相等的");
        }
        if(s1.equals(s2)){
        	System.out.println("相等");
        }
	}

}
