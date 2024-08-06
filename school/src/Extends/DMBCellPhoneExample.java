package Extends;

public class DMBCellPhoneExample {
	public static void main(String[] args) {
		
		DMBCellPhone dmbCellPhone = new DMBCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 수민인데요");
		dmbCellPhone.sendVoice("네 무슨일이시죠?");
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOff(); 
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		
	}
}
