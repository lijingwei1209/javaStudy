package lesson3;

public class One {
	/***
	 * 练习流程语句。
	 * 1.定义一个数字，比如3，则打印星期三，5时打印星期五。要求使用if和switch二种方式实现。
	 * 2.打印从1到10的数字，不打印数字4。使用for，while和do-while三种方式实现。
	 */
	public static void main(String[] args) {
		printlnDay_if();
		printlnNumber_for();
	}
	
	public static void printlnDay_if() {
		int day = 1;
		if(day==1) {
			System.out.println("星期一");
		}else if(day==2) {
			//TODO 3,4,5,6,7...	
		}
	}
	
	public static void printlnDay_switch() {
		int day = 2;
		switch(day) {
			case 1:
				System.out.println("星期二");
				break;
			case 2:
				System.out.println("星期二");
				break;
			//TODO 3,4,5,6,7...	
		}
	}
	
	public static void printlnNumber_for() {
		for(int i=1; i<=10; i++) {
//			if(i!=4) {
//				System.out.println(i);
//			}
			
//			if(i==4) break; //体会break和continue的区别。
			if(i==4) continue;
			System.out.println(i);

		}
	}
	
	public static void printlnNumber_while() {}
	public static void printlnNumber_do() {}

}
