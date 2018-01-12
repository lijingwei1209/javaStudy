package test1;

public class Trycattest {

	public static void main(String[] args) {
		Trycattest tct = new Trycattest();
		int result = tct.test();
        System.out.println("test()方法,执行完毕!返回值为:"+result);
        int result2 = tct.test2();
        System.out.println("我想大声告诉你,test2执行完毕了!!");
	}
	/** 
	 * divider(除数)
	 * result(结果)
	 * try-catch捕获while循环
	 * 每次循环,divider减一,result=result+100/divider
	 * 如果:捕获异常,打印输出"抛出异常了",返回-1
	 * 否则:返回result
	 */
	public int test(){
		int divider = 10;
		int result = 100;
		try{
			while(divider>-1){
				divider--;
				result = result+100/divider;	
			}
			return result;
			 
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("循环抛出异常了!!!");
			return -1;
		}
	}
	/** 
	 * divider(除数)
	 * result(结果)
	 * try-catch捕获while循环
	 * 每次循环,divider减一,result=result+100/divider
	 * 如果:捕获异常,打印输出"抛出异常了",返回result=999;
	 * 否则:返回result
	 * finally:打印输出"这是finally!!!哈哈哈!!!",同事打印输出result的值
	 */
	public int test2(){
		int divider = 10;
		int result = 100;
		try{
			while(divider>-1){
				divider--;
				result = result+100/divider;	
			}
			return result;
			 
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("循环抛出异常了!!!");
			return result=999;
		}finally{
			System.out.println("这是finally!哈哈哈哈!!");
			System.out.println("我是finally,我的值是:"+result);
		}
	}

}
