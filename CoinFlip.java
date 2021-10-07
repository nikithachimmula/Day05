package coinflip;

class CoinFlip {

	public static void main(String[] args) {
		int heads=0;
		int tails=1;
		int Chances=20;
		int flipCheck=(int) Math.floor(Math.random()*10)%2;
		for (int i = 1; i<=Chances; i++) {
		if(flipCheck==heads)
		{
			System.out.println("heads");
			
		}
		else
		{
			
			System.out.println("tails");
		}
	}
}
}