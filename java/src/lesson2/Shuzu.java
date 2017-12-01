package lesson2;

public class Shuzu {
	 public static void main(String[] args) {
	int[] nums = new int[] { 61, 102, 4, 28, 13, 157, 20 };
	    int max=nums[0]; //假定最大值为数组中的第一个元素
	    int min=nums[0]; //假定最小值为数组中的第一个元素
	    double sum=0;    //累加值
	    double avg=0;   //平均值
	    for(int i=0;i<nums.length;i++){//循环遍历数组中的元素
	    	if(nums[i]>max){   //如果当前值大于max,则替换max的值
	    		max=nums[i];
	    	}
	    	if(nums[i]<min){   //如果当前值小于min,则替换min的值
	    		min=nums[i];
	    	}
	    	sum=sum+nums[i];//累加求和
	    }
	    avg=sum/nums.length;//求平均值
			System.out.println("数组中的最大值：" + max);
			System.out.println("数组中的最小值：" + min);
			System.out.println("数组中的平均值：" + avg);
			 
	}
}
