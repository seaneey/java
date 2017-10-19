package playground;
import java.util.Scanner;
import java.util.Random;
public class playground {
    public static Integer difficulty;
    
    public static void main(String[] args) throws Exception {
	
	System.out.println("*** Zahlenraten ***");
	
	Thread.sleep(500);
	
	System.out.println("\nBitte wähle deine bevorzugte Schwierigkeitsstufe: \n");
	System.out.println("[1] Leicht | 10 Versuche");
	System.out.println("[2] Mittel | 5 Versuche");
	System.out.println("[3] Schwer | 3 Versuche");
	System.out.print("Schwierigkeitsstufe: ");
	Scanner diff = new Scanner(System.in);
	try {
	difficulty = diff.nextInt();
	}catch (Exception e) {
	    
	   System.out.println("\nWir konnten deine Wahl nicht ermitteln - hast du dich vetippt?\n");
	   	Thread.sleep(1000);
	   main(null);
	}
	if (difficulty == 1) {
	    
	   System.out.println("Okay, wir werden die Schwierigkeit auf \"Leicht\" stellen!"); 
	   ingameLeicht(); 
	   
	} else if (difficulty == 2) {
	    
	    System.out.println("Okay, wir werden die Schwierigkeit auf \"Mittel\" stellen!");
	    ingameMittel();
	    
	} else if (difficulty == 3) {
	    
	    System.out.println("Okay, wir werden die Schwierigkeit auf \"Schwer\" stellen!");
	    ingameSchwer();
	    
	} else {
	    
	System.out.println("\nWir konnten deine Wahl nicht ermitteln - hast du dich vertippt?\n"); 
		Thread.sleep(1000);
	    
	}
	
	
	
    }
    
    public static void clearAll() {
	
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	
    }
    
    
     
    
    
    public static void ingameLeicht() throws Exception {
	
	clearAll();
	System.out.println("Ich habe mir eine Zahl zwischen 1 und 100 überlegt.\n");
	
	Integer versuche = 10;
	Random rand = new Random();

	int  n = rand.nextInt(99) + 1;
	
	do {
	    System.out.print("An welche Zahl denkst du? Versuche verbleibend: " + versuche + "\n");
	    
	    Scanner zahlSaid = new Scanner(System.in);
	    Integer zahl = zahlSaid.nextInt();
	    
	    if (zahl == n) {
		
		System.out.println("\nSuper, du hast die richtige Zahl erraten! Die Zahl war: " + n + "\n");
		newGameQuestion();
		
		
	    } else if (zahl >= n) {
		
		System.out.println("\nOh, es scheint als wäre meine Zahl kleiner als deine!\n");
		versuche--;
	    } else if (zahl <= n) {
		
		System.out.println("\nOh, es scheint als wäre meine Zahl größer als deine!\n");
		versuche--;
	    }    
	    
	} while (versuche != 0);
	
	System.out.println("\nDeine Versuche sind leider aufgebraucht!\nDie zu erratende Zahl wäre " + n + " gewesen!");
	
	Thread.sleep(4000);
	newGameQuestion();
	
    }
    
    public static void ingameMittel() throws Exception {
	
	clearAll();
	System.out.println("Ich habe mir eine Zahl zwischen 1 und 100 überlegt.\n");
	
	Integer versuche = 5;
	Random rand = new Random();

	int  n = rand.nextInt(69) + 1;
	
	do {
	    System.out.print("An welche Zahl denkst du? Versuche verbleibend: " + versuche + "\n");
	    
	    Scanner zahlSaid = new Scanner(System.in);
	    Integer zahl = zahlSaid.nextInt();
	    
	    if (zahl == n) {
		
		System.out.println("\nSuper, du hast die richtige Zahl erraten! Die Zahl war: " + n + "\n");
		newGameQuestion();
		
		
	    } else if (zahl >= n) {
		
		System.out.println("\nOh, es scheint als wäre meine Zahl kleiner als deine!\n");
		versuche--;
	    } else if (zahl <= n) {
		
		System.out.println("\nOh, es scheint als wäre meine Zahl größer als deine!\n");
		versuche--;
	    }    
	    
	} while (versuche != 0);
	
	System.out.println("\nDeine Versuche sind leider aufgebraucht!\nDie zu erratende Zahl wäre " + n + " gewesen!");
	
	Thread.sleep(4000);
	newGameQuestion();
    }
    
    public static void ingameSchwer() throws Exception {
	
	clearAll();
	System.out.println("Ich habe mir eine Zahl zwischen 1 und 10 überlegt.\n");
	
	Integer versuche = 3;
	Random rand = new Random();

	int  n = rand.nextInt(9) + 1;
	
	do {
	    System.out.print("An welche Zahl denkst du? Versuche verbleibend: " + versuche + "\n");
	    
	    Scanner zahlSaid = new Scanner(System.in);
	    Integer zahl = zahlSaid.nextInt();
	    
	    if (zahl == n) {
		
		System.out.println("\nSuper, du hast die richtige Zahl erraten! Die Zahl war: " + n + "\n");
		newGameQuestion();
		
		
	    } else if (zahl >= n) {
		
		System.out.println("\nOh, es scheint als wäre meine Zahl kleiner als deine!\n");
		versuche--;
	    } else if (zahl <= n) {
		
		System.out.println("\nOh, es scheint als wäre meine Zahl größer als deine!\n");
		versuche--;
	    }    
	    
	} while (versuche != 0);
	
	System.out.println("\nDeine Versuche sind leider aufgebraucht!\nDie zu erratende Zahl wäre " + n + " gewesen!");
	Thread.sleep(4000);
	newGameQuestion();
    }
    
    public static void newGameQuestion() throws Exception {
	
	
	System.out.println("Möchtest du ein neues Spiel starten? [Ja/Nein]");
	Scanner newG = new Scanner(System.in);
	String newGame = newG.nextLine();
	
	if (newGame.equalsIgnoreCase("ja")) {
	    clearAll();
	    main(null);
	    
	} else if (newGame.equalsIgnoreCase("nein")) {
	    
	    clearAll();
	    System.out.println("Bis zum nächsten mal!");
	    System.exit(0);
	    
	} else {
	    
	    newGameQuestion();
	    
	}
 }

}
