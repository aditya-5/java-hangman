import java.io.Console;

class HangmanDriver{
	public static void main(String[] args){
		Console consoleIn = System.console();
		String inputIn = consoleIn.readLine("What is your name?");
		HangmanDictionary hmd = new HangmanDictionary();
		Hangman hm = new Hangman(inputIn);
		hm.setWord(hmd.getWord());
		System.out.println(hm.getPlayerName());
		hm.tryChar('e');
		hm.tryChar('1');
		hm.tryChar('s');
		hm.tryChar('a');
		hm.tryChar('a');
		hm.tryChar('b');
		hm.tryChar('c');
		hm.tryChar('d');
		hm.tryChar('f');
		hm.tryChar('s');
		hm.tryChar('h');
		hm.tryChar('i');
		hm.tryChar('j');
		hm.tryChar('k');
		hm.tryChar('l');
		hm.tryChar('m');

		System.out.println(hm.getCurrentState());
	}

}