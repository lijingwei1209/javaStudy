package com.syt;

public class SmartPhone extends Telphone implements IPlaygame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
      System.out.println("用语音打电话");
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
   System.out.println("用语音发短信");
	}

	@Override
	public void playgame() {
		// TODO Auto-generated method stub
		System.out.println("具有了玩游戏的功能");
	}

}
