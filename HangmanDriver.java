import java.io.Console;

class HangmanDriver{
	public static void main(String[] args){
		
		while (true){
			Console consoleIn = System.console();
		String inputIn = consoleIn.readLine("What is your name?");
		if(inputIn.equals("quit")){
					System.exit(0);
				}
		HangmanDictionary hmd = new HangmanDictionary();
		Hangman hm = new Hangman(inputIn);
		hm.setWord(hmd.getWord());
		System.out.println(hm.getPlayerName());
		String inputIn2;




		do{
			while(true){
				inputIn2 = consoleIn.readLine("Type char: ");
				if(inputIn2.equals("quit")){
					System.exit(0);
				}
				if(inputIn2.length()==0 || inputIn2.length()>1)
					continue;
				else
					break;
			}
			
			hm.tryChar(inputIn2.charAt(0));
			System.out.println(hm.getCurrentState());
			System.out.println(hm.getRemainingGuesses());
		}while(hm.getRemainingGuesses()>0 && !hm.getCurrentState().equals(hm.getWord()));
		String inputIn3 = consoleIn.readLine("Play again y/n :");
		if(inputIn3.equals("y")){
					continue;
				}
			else if(inputIn3.equals("n")){
					System.exit(0);
				}
	}
	}

}