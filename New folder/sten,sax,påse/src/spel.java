import java.util.Scanner;

public class spel {

	public static void main(String[]args) {
		
		int dator;
		int spelare;
		String choice[] = {"Sten", "Sax", "p�se"};
		
		dator = (int) Math.random() *3;
//sten=0, sax=1, p�se=2
		System.out.println("spel");
		System.out.print("skriv in 0 f�r sten, 1 f�r sax eller 2 f�r p�se");
		Scanner in = new Scanner(System.in);
		spelare = in.nextInt();
		System.out.println("Du valde: "+choice[spelare]);
		System.out.println("Datorn valde: "+choice[dator]);
		in.close();
		if ((spelare == 0) && (dator == 1)||
			(spelare == 1 && dator == 2)||
			(spelare == 2 && dator == 0))
		  System.out.println("Du vann!");
		  else if (dator == spelare)
			  System.out.println("Oavgjort!");
		  else
			  System.out.println("Du f�rlorade!");
	}
}
