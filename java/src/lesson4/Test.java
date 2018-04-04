package lesson4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class Test {
    
	public static void main(String []age)throws ParseException{
		 Date d = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String today = df.format(d);
		System.out.println(today);
		String w = "2018年11月11日 11:11:11";
		SimpleDateFormat de = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
		Date da = de.parse(w);
		System.out.println(da);
	}
}

