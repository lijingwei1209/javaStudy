package test1;

public class TestString {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("hello");
		str.append(" imooc");
		str.append(520);
		System.out.println("字符串的长度为 "+str.length());
		System.out.println("插入前: "+str);
		str.insert(11, "!");
		String str2 = str.toString();
		System.out.println("插入后: "+str);
		System.out.println("插入后: "+str2);
		int a = 8;
		String str1 = a+"";
		System.out.println( str1 );

	}

}
