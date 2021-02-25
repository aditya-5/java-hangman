import java.io.Console;

class HangmanDriver{
	public static void main(String[] args){
		Console consoleIn = System.console();
		String inputIn = consoleIn.readLine("What is your name?");
		System.out.println(inputIn);
	} 
}