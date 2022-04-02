
public class Card {
	
private Suit mysuit;
private int mynumber;
public Card(Suit aSuit, int aNumber) {
	this.mysuit = aSuit;
	if (aNumber >= 1 && aNumber <= 13) {
	this.mynumber = aNumber;	
	} else {
		System.err.print(aNumber + "is  not a valid card number");
		System.exit(1);
	}
}
public int getNumber() {
	return mynumber;
}

public String toString() {
	
	String numstr = "Error";
	
	switch(this.mynumber) {
	
	case 2:
		numstr = "two";
		break;
	case 3:
		numstr = "three";
		break;
	case 4:
		numstr = "four";
		break;
	case 5:
		numstr = "five";
		break;
	case 6:
		numstr = "six";
		break;
	case 7:
		numstr = "seven";
		break;
	case 8:
		numstr = "eight";
		break;
	case 9:
		numstr = "nine";
		break;
	case 10:
		numstr = "ten";
		break;
	case 11:
		numstr = "Jack";
		break;
	case 12:
		numstr = "Queen";
		break;
	case 13:
		numstr = "King";
		break;
	case 1:
		numstr = "ace";
		break;
		
	}
return numstr + "of" + mysuit.toString();
		
		
	
}
}
