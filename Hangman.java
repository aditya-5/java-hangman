import java.io.Console;

class Hangman{
	private String playerName;

	public static void main(String[] args){
		Console consoleIn = System.console();
		Hangman hm = new Hangman();
		String inputIn = consoleIn.readLine("What is your name?");
		hm.setPlayerName(inputIn);
		System.out.println(hm.getPlayerName());
	} 

	public String getPlayerName(){
		return this.playerName;
	}

	public void setPlayerName(String playerName){
		this.playerName = playerName;
	}
}