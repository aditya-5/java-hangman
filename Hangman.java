
class Hangman{
	private String playerName;
	private String wordToGuess;
	private char[] guesses = new char[20];
	final int MAX_GUESSES = 20;
	private int x = 0;
	public static void main(String[] args){
		
	} 

	Hangman(String a){
		setPlayerName(a);
	}

	public String getCurrentState(){
		char[] xy = new char[this.wordToGuess.length()];
		char [] h =this.guesses;

		char ch;
		for(int i=0;i<=this.wordToGuess.length()-1; i++){
			ch = wordToGuess.charAt(i);
			for(int j=0;j<=h.length-1;j++){
				if(ch==h[j]){
				xy[i]= h[j];
				}
			}
			
		} 
		for(int i=0;i<=xy.length-1;i++){
			if(xy[i]=='\0'){
				xy[i]='-';
			}
		}

		String b = new String(xy);

		return b;   		 
	}

	public char[] getGuesses(){
		return this.guesses;
	}


	public int getRemainingGuesses(){
		return MAX_GUESSES - this.guesses.length;
	}

	public boolean tryChar(char a){
		String v = this.wordToGuess;
		boolean occur = true;
		for(int i=0;i<=this.guesses.length-1;i++){
			if(a==this.guesses[i]){
				occur = false;
				break;
			}
		}
		if(occur){
			guesses[this.x]= a;
			this.x+=1;
		}

			
		int y = 0;

		for(int i=0;i<=v.length()-1;i++){
			if(v.charAt(i)==a)
					y+=1;
			
		}

		if(y>0)
			return true;
		else
			return false;
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