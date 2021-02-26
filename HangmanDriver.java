import java.io.Console;

class HangmanDriver{
	public static void main(String[] args){
		Console consoleIn = System.console();
		String inputIn = consoleIn.readLine("What is your name?");
		HangmanDictionary hmd = new HangmanDictionary();
		Hangman hm = new Hangman(inputIn);
		hm.setWord(hmd.getWord());
		System.out.println(hm.getPlayerName());
		String inputIn2;
		do{
			while(true){
				inputIn2 = consoleIn.readLine("Type char: ");
				if(inputIn2.length()==0 || inputIn2.length()>1)
					continue;
				else
					break;
			}
			
			hm.tryChar(inputIn2.charAt(0));
			System.out.println(hm.getCurrentState());
			System.out.println(hm.getRemainingGuesses());
			System.out.println(hm.getCurrentState().equals(hm.getWord()));
		}while(hm.getRemainingGuesses()>0 && !hm.getCurrentState().equals(hm.getWord()));

		System.out.println(hm.getCurrentState());
		System.out.println(hm.getWord());

	}

}