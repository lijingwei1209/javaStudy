package lesson2;

public class Lei {
	float scores;
	float cpu;
	float mem;
	int bug;
	void call(){ 
		int bug = 1;
		System.out.println("bug:"+bug);
		System.out.println("cpu:"+cpu+"scores:"+scores+"mem:"+mem+"  Lei有打电话的功能!");
	}
	void sendmessage(){
		int bug = 102;
		System.out.println("bug:"+bug);
		System.out.println("Lei有发短信的功能!");
	}
	
	public static void main(String[] args){
		 Lei phone = new Lei();
		    
	        phone.call();
            phone.sendmessage();
            phone.cpu = 2.0f;
	        phone.mem = 5.0f;
	        phone.scores = 3.0f;
       
	
	}	
}