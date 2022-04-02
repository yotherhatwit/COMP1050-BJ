import java.util.Scanner;

public class gamerunner {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
			Deck theDeck = new Deck(1, true);
	player me = new player("player 1");
	player Dealer = new player("Dealer");
	
	me.addCard(theDeck.dealNextCard());
	Dealer.addCard(theDeck.dealNextCard());
	me.addCard(theDeck.dealNextCard());
	Dealer.addCard(theDeck.dealNextCard());
	
	System.out.println("Cards have been dealt");
	me.printHand(true);
	Dealer.printHand(false);
	System.out.println("\n");
	
	boolean meDone = false;
	boolean DealerDone = false;
	String ans;
	
	while(!meDone || !DealerDone) {
		if(!meDone) {
			System.out.print("Hit or Stay? (H or S): ");
			ans = sc.next();
			System.out.println();
			
			if(ans.compareToIgnoreCase("H") == 0) {
				meDone = !me.addCard(theDeck.dealNextCard());
				Dealer.printHand(true);
			} else { 
				meDone = true;
			}
		}
		
		if(!DealerDone) {
			if(Dealer.getHandSum() < 17) {
				System.out.println("The dealer hits\n");
				DealerDone = !Dealer.addCard(theDeck.dealNextCard());
				Dealer.printHand(false);
			} else {
				System.out.println("The Dealer Stays\n");
				DealerDone = true;
				
			}
		} 
		System.out.println();
	}
	sc.close();
	me.printHand(true);
	Dealer.printHand(true);
	
	int mySum = me.getHandSum();
	int DealerSum = Dealer.getHandSum();
	
	if(mySum > DealerSum && mySum <= 21 || DealerSum > 21) {
		System.out.println("You win!");
	} else {
		System.out.println("Dealer Wins!");
		
	}
}
}
