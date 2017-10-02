package chatbotproject;

public class chatbot {

	private String userName;
	private ChatbotYonathan yonathan;
	private boolean chatting;
	
	
	public chatbot() {
		yonathan = new ChatbotYonathan();
		userName = "unknown user";
		chatting = true;
	}

	public void startTalking() {
		chatbotmain.print("Welcome to our chatbot! What is your name?");
		userName = chatbotmain.getInput();
		chatting = true;
		while(chatting) {
			chatbotmain.print("What do you want to talk about?");
			String response = chatbotmain.getInput();
			if(yonathan.isTriggered(response)) {
				chatting = false;
				yonathan.startChatting(response);
			}else {
				chatbotmain.print("I'm sorry. I don't understand.");
			}
		}
	}

}