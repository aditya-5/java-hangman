
class Hangman{
	private String playerName;
	private String wordToGuess;

	public static void main(String[] args){
		
	} 

	Hangman(String a){
		setPlayerName(a);
	}

	public String getPlayerName(){
		return this.playerName;
	}

	public String getWord(){
		return this.wordToGuess;
	}

	public void setPlayerName(String playerName){
		this.playerName = playerName;
	}

	public void setWord(String wordToGuess){
		this.wordToGuess = wordToGuess;
	}
}