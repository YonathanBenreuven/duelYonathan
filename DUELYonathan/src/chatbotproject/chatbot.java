package chatbotproject;

public class chatbot {
	private String username;
	private Topic yonathan;
	private boolean chatting;
	public Chatbot() {
		yonathan = new ChatbotYonathan();
		username = "unkown user";
		chatting = true;
	}
	public void startTalking() {
		chatbotmain.print("welcome to our chatbot! what is your name?");
		username = chatbotmain.getInput();
		while(chatting) {
			chatbotmain.print("what do you want to talk about");
			String response = chatbotmain.getInput();
			if(yonathan.isTriggered(response)) {
				yonathan.startChatting();
			}else {
				chatbotmain.print("im sorry i dont understand");
			}
		}
	}
}
