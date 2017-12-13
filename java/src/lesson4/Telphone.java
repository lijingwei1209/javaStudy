package lesson4;

public class Telphone {
	
	float scores;
	float cpu;
	float mem;
	public static void main(String[] args){
		Telphone phone = new Telphone();
	    Telphone phone1 = new Telphone(1.0f,2.0f,3.0f); 

	}
    public Telphone(){//通过无参的构造方法构造对象
    	System.out.println("无参的构造方法执行了!");
    }
  //通过有参的构造方法构造对象
    public Telphone(float newScores,float newCpu,float newMem){
    	if(newScores<4.0f){
    		System.out.println("您输入的数字有误,自定赋值4.0");
    		scores=4.0f;
    	}else{
    		scores = newScores;
    	}
    	
    	cpu = newCpu;
    	mem = newMem;
    	System.out.println("有参的构造方法执行了!"+"newScores:"+scores+"newCpu:"+cpu+"newMem"+mem);
    }
    
    
       }