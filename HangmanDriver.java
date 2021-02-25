import java.io.Console;

class HangmanDriver{
	public static void main(String[] args){
		Console consoleIn = System.console();
		String inputIn = consoleIn.readLine("What is your name?");
		HangmanDictionary hmd = new HangmanDictionary();
		Hangman hm = new Hangman(inputIn);
		hm.setWord(hmd.getWord());
		System.out.println(hm.getPlayerName());
		System.out.println(hm.getWord());
	}

}