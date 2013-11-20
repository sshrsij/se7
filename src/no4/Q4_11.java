package no4;

 class Q4_11 {

	public static void main(String[] args) {
		String[] cards ={"spade","heart","club","diamond"};
		for(String card:cards){
			switch (card) {
			case "spade":
			case "club":
				System.out.println("The color of the card is Black.");
				break;
			case "heart":
			case "diamond":
				System.out.println("The color of the card is Red.");
				break;
			}
		}
	}
}
