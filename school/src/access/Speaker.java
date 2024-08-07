package access;

public class Speaker {
	
	private int volume;
	//초기 볼륨값 설정
	Speaker(int volume){
		this.volume = volume;
	}
	//생성자를 통해서
	//=================================================================

	void volumeUp() {
		if(volume >= 100) {
			System.out.println("음량을 증가할 수 없습니다. 최대 음량 입니다");
		}else {
			volume+= 10;
			System.out.println("음량을 10 증가합니다");
		}
	}

	void volumeDown() {
		volume -= 10;
		System.out.println("음량이 10 줄었습니다");
	}
	void showVolume() {
		System.out.println("현재음량: " + volume);
	}
}
