package stack;

import java.util.LinkedList;
import java.util.Queue;

import list.Message;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
	
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));
		
		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch(message.command) {
			case"sendMail" : 
				System.out.println(message.to + "님에게 메일을 보냅니다");
				break;
			case "sendSMS" : 
				System.out.println(message.to + "님에게 문자를 보냅니다");
				break;
			case "sendKakaotalk" : 
				System.out.println(message.to + "님에게 카톡을 보냅니다");
				break;
				
				//홍길동님 에게 메일을 보냅니다
				//신용권님 에게 문자를 보냅니다
				//홍두께님 에게 카톡을 보냅니다
			
			}
		}
	
	}
}
