import java.util.Scanner; //για να μπορώ να φτιάξω το αντικέιμενο


public class Main {
	
	public static void main(String[ ] args) {
		
		//φτιάχνω το αντικείμενο για να αλληλεπιδρώ με την κονσόλα
		Scanner in = new Scanner(System. in) ;
		
		//αρικοποιώ τιμές
		String bestName = "";
		double bestPrice = 1;
		int bestScore = 0;
		
		boolean more = true; 
		while(more) {
			
			//διαβάζω τις τιμές
			System.out.println("Product name: ");
			String name = in.nextLine();
			System.out.println("Product Price: ");
			double price = in.nextDouble();
			System.out.println("Product Sore: ");
			int score = in.nextInt();
			
			if(score/price > bestScore/bestPrice) {
				bestName = name;
				bestPrice = price;
				bestScore = score;
				
				
			}
			
			
			System.out.println("More Products? 1:YES, 2:NO");
			int answer = in.nextInt();
			if(answer != 1)
				more = false; 
			in.nextLine();
		}
		System.out.println("Best Name: " + bestName);
		System.out.println("Best Price: " + bestPrice);
		System.out.println("Best Score: " + bestScore);
		
	}

}
