package com.syt;

public class Inital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Telphone tel1 = new CellPhone();
      Telphone tel2 = new SmartPhone();
      tel1.call();
      tel1.message();
      tel2.call();
      tel2.message();
      IPlaygame ip1 = new SmartPhone();
      ip1.playgame();
      IPlaygame ip2 = new PSp();
      ip2.playgame();
      IPlaygame ip3 = new IPlaygame(){

		@Override
		public void playgame() {
			// TODO Auto-generated method stub
			System.out.println("使用匿名内部类实现接口");
		}
    	  
      };
      ip3.playgame();
      new IPlaygame(){
    	  @Override
  		public void playgame() {
  			// TODO Auto-generated method stub
  			System.out.println("使用匿名内部类实现接口2");
  		}  
    	  
      }.playgame();
	}

}
