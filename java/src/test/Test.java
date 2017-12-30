package test;

public class Test {
	public static void testAnimalVoico(Animal c){
		c.voico();
		if(c instanceof cat){
			((cat) c).catchmouse();
		}
	}
	 public static void main(String []agrs){
		   
		   Animal a = new dog();
		   Animal b = new cat();
		   testAnimalVoico(a);
		   testAnimalVoico(b);
		   //cat a2 = new cat();//创建对象
		   cat a2 = (cat)b;//	强制转换
		   a2.catchmouse();
	   }
	}
	

