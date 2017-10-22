import java.util.Random;
import java.util.Scanner;
public class kniffelGame {

    public static Integer doesWant;
    
    public static Integer wuerfel1Player = 0; 
    public static Integer wuerfel2Player = 0; 
    public static Integer wuerfel3Player = 0; 
    public static Integer wuerfel4Player = 0; 
    public static Integer wuerfel5Player = 0; 
    public static Integer wuerfel6Player = 0; 
    public static Integer wuerfel1Computer = 0; 
    public static Integer wuerfel2Computer = 0; 
    public static Integer wuerfel3Computer = 0; 
    public static Integer wuerfel4Computer = 0; 
    public static Integer wuerfel5Computer = 0; 
    public static Integer wuerfel6Computer = 0; 
    public static Integer ende = 0;
    
    public static void main (String[] args) throws Exception {
	
	System.out.println("***6er-Game***\n");
	
	System.out.println("Bitte wähle aus was du tun möchtest:");
	System.out.println("[1] 6er-Game spielen");
	System.out.println("[2] Spielregeln lesen");
	Scanner wantsToDo  = new Scanner(System.in);
	
	try {
	    
	doesWant = wantsToDo.nextInt();
	
    } catch (Exception e) { 
	
	main(null);
	
    }
	if (doesWant.equals(1)) {
	    
	    kniffelSpielen();
	    
	} else if (doesWant.equals(2)) {
	    
	    regelnLesen();
	    
	} else {
	    
	    main(null);
	    
	}
	
	
    }
    
    public static void kniffelSpielen() throws Exception {
	
	clearAll();
	
	System.out.println("Willkommen bei 6er-Game!\n");
	System.out.println("Wenn du bereit bist,");
	promptEnterKey();
	clearAll();
	
	System.out.println("Das Spiel beginnt!");
	Thread.sleep(1000);
	clearAll();
	
	// deklaration
	
	int sechsenInsgPlayer = 0;
	int sechsenDieseRundePlayer = 0;
	int sechsenInsgComputer = 0;
	int sechsenDieseRundeComputer = 0;
	int zuegePlayer = 0;
	int zuegeComputer = 0;

	do {
	    
	    
	    sechsenDieseRundePlayer = 0;
	    sechsenDieseRundeComputer = 0;
	    
	    // Anfang Player Block

	System.out.println("Du bist an der Reihe!\n");
	Thread.sleep(500);
	promptWuerfelKey();
	System.out.println("Du würfelst gerade...\n");
	
	Random rand = new Random();
	
	

	// wuerfel1Player = rand.nextInt(6) + 1;
	long t = System.currentTimeMillis();
	long end = t+2000;
	Integer running = 1;
	Integer endless = 0;
	System.out.print("1. Würfel: ");
	
	
	
	
	do {
	System.out.print("1");
	
	
	
	if (System.currentTimeMillis() > end) {
	    
	    running = 0;
	    if (running == 0) {
		    wuerfel1Player = 1;
		    break;
	    }
	} 
	Thread.sleep(rand.nextInt(139) + 1);
	
	System.out.print("\b2");
	
	
	
	if (System.currentTimeMillis() > end) {
	    
	    running = 0;
	    if (running == 0) {
		    wuerfel1Player = 2;
		    break;
	    }
	}
	    Thread.sleep(rand.nextInt(139) + 1);
	
	System.out.print("\b3");
	
	
	
	if (System.currentTimeMillis() > end) {
	    
	    
	    running = 0;
	    if (running == 0) {
		    wuerfel1Player = 3;
		    break;
	    }
	}
	    Thread.sleep(rand.nextInt(139) + 1);
	
	System.out.print("\b4");
	
	
	
	if (System.currentTimeMillis() > end) {
	    
	    running = 0;
	    if (running == 0) {
		    wuerfel1Player = 4;
		    break;
	    }
	}
	    Thread.sleep(rand.nextInt(239) + 1);
	
	System.out.print("\b5");
	
	
	
	if (System.currentTimeMillis() > end) {
	    
	    running = 0;
	    if (running == 0) {
		    wuerfel1Player = 5;
		    break;
	    }
	}
	    Thread.sleep(rand.nextInt(259) + 1);
	
	System.out.print("\b6");
	
	
	
	if (System.currentTimeMillis() > end) {
	    
	    running = 0;
	    if (running == 0) {
		    wuerfel1Player = 6;
		    break;
	    }
	}
	    Thread.sleep(rand.nextInt(389) + 1);
	    System.out.print("\b");
	} while (running != 0);
	
	
	
	// ENDE Würfel 1
	
	
	
	
	System.out.print("\b");
	System.out.print(wuerfel1Player);
	System.out.println("");
	
	if (wuerfel1Player == 6) {
	    sechsenInsgPlayer++;
	    sechsenDieseRundePlayer++;
	} else {
	    
	}
	Thread.sleep(1200);

	
	//wuerfel2Player = rand.nextInt(6) + 1;
	System.out.print("2. Würfel: ");
	running = 1;
	
	
	
	
	long t2 = System.currentTimeMillis();
	long end2 = t2+2000;
	
	
	
	
	
	do {
		System.out.print("1");
		
		
		
		if (System.currentTimeMillis() > end2) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel2Player = 1;
			    break;
		    }
		} 
		Thread.sleep(rand.nextInt(139) + 1);
		
		System.out.print("\b2");
		
		
		
		if (System.currentTimeMillis() > end2) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel2Player = 2;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(139) + 1);
		
		System.out.print("\b3");
		
		
		
		if (System.currentTimeMillis() > end2) {
		    
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel2Player = 3;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(139) + 1);
		
		System.out.print("\b4");
		
		
		
		if (System.currentTimeMillis() > end2) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel2Player = 4;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(239) + 1);
		
		System.out.print("\b5");
		
		
		
		if (System.currentTimeMillis() > end2) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel2Player = 5;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(259) + 1);
		
		System.out.print("\b6");
		
		
		
		if (System.currentTimeMillis() > end2) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel2Player = 6;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(389) + 1);
		    System.out.print("\b");
		} while (running != 0);
	
	
	
	
	
	
	
	
	
	System.out.print("\b");
	System.out.print(wuerfel2Player);
	System.out.println("");
	
	if (wuerfel2Player == 6) {
	    sechsenInsgPlayer++;
	    sechsenDieseRundePlayer++;
	} else {
	    
	}

	
	//wuerfel3Player = rand.nextInt(6) + 1;
	System.out.print("3. Würfel: ");
	running = 1;
	
	
	long t3 = System.currentTimeMillis();
	long end3 = t3+2000;
	
	
	
	do {
		System.out.print("1");
		
		
		
		if (System.currentTimeMillis() > end3) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel3Player = 1;
			    break;
		    }
		} 
		Thread.sleep(rand.nextInt(139) + 1);
		
		System.out.print("\b2");
		
		
		
		if (System.currentTimeMillis() > end3) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel3Player = 2;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(139) + 1);
		
		System.out.print("\b3");
		
		
		
		if (System.currentTimeMillis() > end3) {
		    
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel3Player = 3;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(139) + 1);
		
		System.out.print("\b4");
		
		
		
		if (System.currentTimeMillis() > end3) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel3Player = 4;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(239) + 1);
		
		System.out.print("\b5");
		
		
		
		if (System.currentTimeMillis() > end3) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel3Player = 5;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(259) + 1);
		
		System.out.print("\b6");
		
		
		
		if (System.currentTimeMillis() > end3) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel3Player = 6;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(389) + 1);
		    System.out.print("\b");
		} while (running != 0);
	
	
	
	System.out.print("\b");
	
	System.out.print(wuerfel3Player);
	System.out.println("");
	
	if (wuerfel3Player == 6) {
	    sechsenInsgPlayer++;
	    sechsenDieseRundePlayer++;
	} else {
	    
	}

	
	//wuerfel4Player = rand.nextInt(6) + 1;
	System.out.print("4. Würfel: ");
	running = 1;
	
	
	long t4 = System.currentTimeMillis();
	long end4 = t4+2000;
	
	do {
		System.out.print("1");
		
		
		
		if (System.currentTimeMillis() > end4) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel4Player = 1;
			    break;
		    }
		} 
		Thread.sleep(rand.nextInt(139) + 1);
		
		System.out.print("\b2");
		
		
		
		if (System.currentTimeMillis() > end4) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel4Player = 2;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(139) + 1);
		
		System.out.print("\b3");
		
		
		
		if (System.currentTimeMillis() > end4) {
		    
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel4Player = 3;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(139) + 1);
		
		System.out.print("\b4");
		
		
		
		if (System.currentTimeMillis() > end4) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel4Player = 4;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(239) + 1);
		
		System.out.print("\b5");
		
		
		
		if (System.currentTimeMillis() > end4) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel4Player = 5;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(259) + 1);
		
		System.out.print("\b6");
	
		
		
		if (System.currentTimeMillis() > end4) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel4Player = 6;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(389) + 1);
		    System.out.print("\b");
		} while (running != 0);
	
	
	
	
	System.out.print("\b");
	System.out.print(wuerfel4Player);
	System.out.println("");
	
	if (wuerfel4Player == 6) {
	    sechsenInsgPlayer++;
	    sechsenDieseRundePlayer++;
	} else {
	    
	}

	
	//wuerfel5Player = rand.nextInt(6) + 1;
	System.out.print("5. Würfel: ");
	running = 1;
	
	
	long t5 = System.currentTimeMillis();
	long end5 = t5+2000;
	
	do {
		System.out.print("1");
		
		
		
		if (System.currentTimeMillis() > end5) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel5Player = 1;
			    break;
		    }
		} 
		Thread.sleep(rand.nextInt(139) + 1);
		
		System.out.print("\b2");
		
		
		
		if (System.currentTimeMillis() > end5) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel5Player = 2;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(139) + 1);
		
		System.out.print("\b3");
		
		
		
		if (System.currentTimeMillis() > end5) {
		    
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel5Player = 3;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(139) + 1);
		
		System.out.print("\b4");
		
		
		
		if (System.currentTimeMillis() > end5) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel5Player = 4;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(239) + 1);
		
		System.out.print("\b5");
		
		
		
		if (System.currentTimeMillis() > end5) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel5Player = 5;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(259) + 1);
		
		System.out.print("\b6");
		
		
		
		if (System.currentTimeMillis() > end5) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel5Player = 6;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(389) + 1);
		    System.out.print("\b");
		} while (running != 0);
	
	
	
	System.out.print("\b");
	System.out.print(wuerfel5Player);
	System.out.println("");
	
	if (wuerfel5Player == 6) {
	    sechsenInsgPlayer++;
	    sechsenDieseRundePlayer++;
	} else {
	    
	}

	
	//wuerfel6Player = rand.nextInt(6) + 1;
	System.out.print("6. Würfel: ");
	running = 1;
	
	long t6 = System.currentTimeMillis();
	long end6 = t6+2000;
	
	do {
		System.out.print("1");
		
		
		
		if (System.currentTimeMillis() > end6) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel6Player = 1;
			    break;
		    }
		} 
		Thread.sleep(rand.nextInt(139) + 1);
		
		System.out.print("\b2");
		
		
		
		if (System.currentTimeMillis() > end6) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel6Player = 2;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(139) + 1);
		
		System.out.print("\b3");
		
		
		
		if (System.currentTimeMillis() > end6) {
		    
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel6Player = 3;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(139) + 1);
		
		System.out.print("\b4");
		
		
		
		if (System.currentTimeMillis() > end6) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel6Player = 4;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(239) + 1);
		
		System.out.print("\b5");
		
		
		
		if (System.currentTimeMillis() > end6) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel6Player = 5;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(259) + 1);
		
		System.out.print("\b6");
		
		
		
		if (System.currentTimeMillis() > end6) {
		    
		    running = 0;
		    if (running == 0) {
			    wuerfel6Player = 6;
			    break;
		    }
		}
		    Thread.sleep(rand.nextInt(389) + 1);
		    System.out.print("\b");
		} while (running != 0);
	
	
	
	System.out.print("\b");
	System.out.print(wuerfel6Player);
	System.out.println("");
	
	if (wuerfel6Player == 6) {
	    sechsenInsgPlayer++;
	    sechsenDieseRundePlayer++;
	} else {
	    
	}
	
	System.out.println("Du hast diese Runde " + sechsenDieseRundePlayer + " Sechs(en) gewürfelt!\n\nUm zu Gewinnen brauchst du also noch: " + (6 - sechsenInsgPlayer) + " Sechs(en)!");
	
	zuegePlayer++;
	if (sechsenInsgPlayer >= 6) {
	    
	    ende = 1;
	    clearAll();
	    System.out.println("Du hast das Spiel mit " + zuegeComputer + " Runde(n) gewonnen!\nHerzlichen Glückwunsch!");
	    promptEnterKey();
	    Thread.sleep(1000);
	    newGameQuestion();
	} else {
	    
	}
	
	promptEnterKey();
	// Ende Player Block

	System.out.println("Der Computer ist an der Reihe!\n");
	// Start Computer Block
	
	Thread.sleep(1500);
	System.out.println("Der Computer würfelt gerade...\n");
	

	wuerfel1Computer = rand.nextInt(6) + 1;
	System.out.print("1. Würfel: ");
	Thread.sleep(1200);
	System.out.print(wuerfel1Computer);
	System.out.println("");
	
	if (wuerfel1Computer == 6) {
	    sechsenInsgComputer++;
	    sechsenDieseRundeComputer++;
	} else {
	    
	}
	

	
	wuerfel2Computer = rand.nextInt(6) + 1;
	System.out.print("2. Würfel: ");
	Thread.sleep(1200);
	System.out.print(wuerfel2Computer);
	System.out.println("");
	
	if (wuerfel2Computer == 6) {
	    sechsenInsgComputer++;
	    sechsenDieseRundeComputer++;
	} else {
	    
	}

	
	wuerfel3Computer = rand.nextInt(6) + 1;
	System.out.print("3. Würfel: ");
	Thread.sleep(1200);
	System.out.print(wuerfel3Computer);
	System.out.println("");
	
	if (wuerfel3Computer == 6) {
	    sechsenInsgComputer++;
	    sechsenDieseRundeComputer++;
	} else {
	    
	}

	
	wuerfel4Computer = rand.nextInt(6) + 1;
	System.out.print("4. Würfel: ");
	Thread.sleep(1200);
	System.out.print(wuerfel4Computer);
	System.out.println("");
	
	if (wuerfel4Computer == 6) {
	    sechsenInsgComputer++;
	    sechsenDieseRundeComputer++;
	} else {
	    
	}

	
	wuerfel5Computer = rand.nextInt(6) + 1;
	System.out.print("5. Würfel: ");
	Thread.sleep(1200);
	System.out.print(wuerfel5Computer);
	System.out.println("");
	
	
	if (wuerfel5Computer == 6) {
	    sechsenInsgComputer++;
	    sechsenDieseRundeComputer++;
	} else {
	    
	}

	
	wuerfel6Computer = rand.nextInt(6) + 1;
	System.out.print("6. Würfel: ");
	Thread.sleep(1200);
	System.out.print(wuerfel6Computer);
	System.out.println("");
	
	if (wuerfel6Computer == 6) {
	    sechsenInsgComputer++;
	    sechsenDieseRundeComputer++;
	} else {
	    
	}
	
	System.out.println("Der Computer hat " + sechsenDieseRundeComputer + " Sechs(en) gewürfelt!\n\nUm zu Gewinnen braucht der Computer also noch: " + (6 - sechsenInsgComputer) + " Sechs(en)!");

	
	zuegeComputer++;
	
	
	if (sechsenInsgComputer >= 6) {
	    
	    ende = 1;
	    clearAll();
	    System.out.println("Der Computer hat das Spiel nach " + zuegeComputer + " Runde(n) gewonnen!");
	    promptEnterKey();
	    Thread.sleep(1000);
	    newGameQuestion();
	    
	} else {
	    
	}
	
	} while (ende == 0);
	
	Thread.sleep(2000);
	newGameQuestion();
	
    }

    
    public static void regelnLesen() throws Exception {
	
	clearAll();
	
	System.out.println("REGELN:\n\n");
	System.out.println("> Das Ziel des Spieles ist es schneller als der Gegner (Der Computer),\ninsgesamt 6 mal eine Sechs gewürfelt zu haben.\n\n");
	promptEnterKey();
	main(null);
	
	
    }
    
    
    public static void clearAll() {
	
	System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	
    }
    
    
    public static void promptEnterKey() {
	
	System.out.println("> Drücke [ENTER] um fortzufahren.\n");
	Scanner scanner = new Scanner(System.in);
	scanner.nextLine();
	
    }
    
    public static void promptWuerfelKey() {
	
	System.out.println("> Drücke [ENTER] um zu Würfeln.\n");
	Scanner scanner = new Scanner(System.in);
	scanner.nextLine();
	
    } 
    
    
    public static void newGameQuestion() throws Exception {
	
	Integer nextStep = 0;
	
	System.out.println("Was möchtest du als nächstes tun?\n");
	System.out.println("[1] Zurück zum Hauptmenü\n[2] Neues Spiel starten");
	Scanner nextStepQuestion = new Scanner(System.in);
	try {
	    nextStep = nextStepQuestion.nextInt();
	} catch (Exception e){
	    
	  newGameQuestion();
	    
	}
	
	if (nextStep == 1) {
	    
	    main(null);
	    
	    
	} else if (nextStep == 2) {
	    
	    
	} else {
	    
	    newGameQuestion(); 
	    
	}
	
    }
    
    
}
