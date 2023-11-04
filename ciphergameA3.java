package tutorial;
import java.util.*;

public class ciphergameA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list2 = new ArrayList<String>();
		Scanner input = new Scanner(System.in); 
		Random random = new Random(); 
		Date date = new Date(); 
		long score = 1000, begin = System.currentTimeMillis(); 
		boolean countdown = true; 
		int normalModeRandom, userGameModeChoice = 0, randomParagrahPick, test = 0, count = 0;  
		String randomSentence1, randomSentence2, randomSentence3, help = "help", reset = "reset", normalMode = "Normal",
				testMode = "Test", userInput; 
		String alphabetUpper[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q","R", "S", "T", "U", "V", "W", "X", "Y", "Z" }; 
		char alphabetLower[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q','r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', }; 
		String paragraph[] = new String[6]; 

		paragraph[0] = "It was the best of times, it was the worst of times,it was the age of wisdom, it was the age of foolishness, it was the epoch of belief,"
				+ " it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair.";
		paragraph[1] = "It is a truth universally acknowledged, that a single man in possession of a good fortune, must be in want of a wife";
		paragraph[2] = "I took a deep breath and listened to the old brag of my heart. I am, I am, I am.";
		paragraph[3] = "I hadn’t planned to tell him about my decision, not yet, but we’d been talking about love, new love, and, "
				+ "though it was a radical thing to say and an even more radical thing to do,the truth had emerged from my mouth: "
				+ "I was done. I was quitting the program. Now, we were looking at each other, surprised.";
		paragraph[4] = "Before I could answer, he said, “You won’t have to move somewhere you’ll hate, somewhere without men."
				+ " Not if you don’t want to be an academic, and you don’t need to be.”";
		paragraph[5] = "Hey my name is Ganom Mbochi. i am a student of Griffith college";
		
		do {

			System.out.println("Select Mode you Like to play in " + "\n1.Normal ( type Normal )"
			+ "\n2.Test ( type Test )");
			userInput = input.next();

		} while ((!userInput.equalsIgnoreCase(normalMode)) && (!userInput.equalsIgnoreCase(testMode))); 
		if (userInput.equalsIgnoreCase(normalMode)) { 
			randomParagrahPick = random.nextInt(10);
			char char1[] = paragraph[randomParagrahPick].toCharArray(); 
			char char2[] = char1.clone();
			int randomLetterArray[] = new int[26];
			int randomLetters = 0;
			for (int i = 0; i < randomLetterArray.length; i++) {
				randomLetters = random.nextInt(26);
				randomLetterArray[i] = randomLetters; 
			}

			for (int i = 0; i < randomLetterArray.length; i++) { 
			for (int j = 0; j < i; j++) {
				if (randomLetterArray[j] == randomLetterArray[i]) {
						randomLetters = random.nextInt(26);
						randomLetterArray[i] = randomLetters;
						j = 0;
					}

				}
			}
			for (int i = 0; i < char1.length; i++) { 
				//encrypted Letters
				if (char2[i] == 'A' || char2[i] == 'a') { 
					char2[i] = alphabetLower[randomLetterArray[0]];
				} else if (char2[i] == 'B' || char2[i] == 'b') {
					char2[i] = alphabetLower[randomLetterArray[1]];
				} else if (char2[i] == 'C' || char2[i] == 'c') {
					char2[i] = alphabetLower[randomLetterArray[2]];
				} else if (char2[i] == 'D' || char2[i] == 'd') {
					char2[i] = alphabetLower[randomLetterArray[3]];
				} else if (char2[i] == 'E' || char2[i] == 'e') {
					char2[i] = alphabetLower[randomLetterArray[4]];
				} else if (char2[i] == 'F' || char2[i] == 'f') {
					char2[i] = alphabetLower[randomLetterArray[5]];
				} else if (char2[i] == 'G' || char2[i] == 'g') {
					char2[i] = alphabetLower[randomLetterArray[6]];
				} else if (char2[i] == 'H' || char2[i] == 'h') {
					char2[i] = alphabetLower[randomLetterArray[7]];
				} else if (char2[i] == 'I' || char2[i] == 'i') {
					char2[i] = alphabetLower[randomLetterArray[8]];
				} else if (char2[i] == 'G' || char2[i] == 'g') {
					char2[i] = alphabetLower[randomLetterArray[9]];
				} else if (char2[i] == 'K' || char2[i] == 'k') {
					char2[i] = alphabetLower[randomLetterArray[10]];
				} else if (char2[i] == 'L' || char2[i] == 'l') {
					char2[i] = alphabetLower[randomLetterArray[11]];
				} else if (char2[i] == 'M' || char2[i] == 'm') {
					char2[i] = alphabetLower[randomLetterArray[12]];
				} else if (char2[i] == 'N' || char2[i] == 'n') {
					char2[i] = alphabetLower[randomLetterArray[13]];
				} else if (char2[i] == 'O' || char2[i] == 'o') {
					char2[i] = alphabetLower[randomLetterArray[14]];
				} else if (char2[i] == 'P' || char2[i] == 'p') {
					char2[i] = alphabetLower[randomLetterArray[15]];
				} else if (char2[i] == 'Q' || char2[i] == 'q') {
					char2[i] = alphabetLower[randomLetterArray[16]];
				} else if (char2[i] == 'R' || char2[i] == 'r') {
					char2[i] = alphabetLower[randomLetterArray[17]];
				} else if (char2[i] == 'S' || char2[i] == 's') {
					char2[i] = alphabetLower[randomLetterArray[18]];
				} else if (char2[i] == 'T' || char2[i] == 't') {
					char2[i] = alphabetLower[randomLetterArray[19]];
				} else if (char2[i] == 'U' || char2[i] == 'u') {
					char2[i] = alphabetLower[randomLetterArray[20]];
				} else if (char2[i] == 'V' || char2[i] == 'v') {
					char2[i] = alphabetLower[randomLetterArray[21]];
				} else if (char2[i] == 'W' || char2[i] == 'w') {
					char2[i] = alphabetLower[randomLetterArray[22]];
				} else if (char2[i] == 'X' || char2[i] == 'x') {
					char2[i] = alphabetLower[randomLetterArray[23]];
				} else if (char2[i] == 'Y' || char2[i] == 'y') {
					char2[i] = alphabetLower[randomLetterArray[24]];
				} else if (char2[i] == 'Z' || char2[i] == 'z') {
					char2[i] = alphabetLower[randomLetterArray[25]];
				}

			}
			char char3[] = char1.clone();
			for (int i = 0; i < char1.length; i++) {
				char3[i] = Character.toUpperCase(char1[i]);
			}
			char char4[] = char2.clone();
			do {
	
				System.out.println("----------------------------------------------------------");
				System.out.println("SCORE ( " + score + " )");
				System.out.println("---------------------------------------------------------");
				int counter = 0;
				for (int i = 0; i < char1.length; i++) {
					int paragraphBrake = counter % 110;
					counter++;
					System.out.print(char4[i]);
					if (paragraphBrake > 80) {
						if (char2[i] == ' ' && paragraphBrake > 80) {
							System.out.println("");
							counter = 0;
						}
					}
				}
				test++;
				System.out.println("");
				userInput = input.next();
				if (countdown == true) {
					begin = System.currentTimeMillis();
				}
				long finish = System.currentTimeMillis();
				score = 1000 - ((finish - begin) / 1000);
				if (userInput.equalsIgnoreCase(reset)) { 
					for (int i = 0; i < char1.length; i++) {
						char4[i] = char2[i];
					}
				} else if (userInput.equalsIgnoreCase(help)) {
					while (count < 5) {
						randomLetters = random.nextInt(char1.length);
						char uncoded = char3[randomLetters], coded = char4[randomLetters];
						for (int i = 0; i < char1.length; i++) {
							if (char4[i] == coded) {
								char4[i] = uncoded;
							}
						}
						count++;
						System.out.println(count);
						System.out.println(randomLetters);
						System.out.println(char1.length);
						break;
					}
				} else {
					char char5[] = userInput.toCharArray();
					char inputLower = Character.toLowerCase(char5[0]);
					char inputUpper = Character.toUpperCase(char5[0]);
					char outputUpper = Character.toUpperCase(char5[1]);
					for (int i = 0; i < char1.length; i++) {

						if (char4[i] == inputLower || char4[i] == inputUpper) {
							char4[i] = outputUpper;
						}

					}

				}
				countdown = false;
			} while ((!Arrays.equals(char4, char3))); 
			System.out.println( "++++++++++++++++++++++++++++++++++");
			System.out.println("YOU WON !");
			System.out.println("SCORE ( " +score+ " )");
			System.out.println( "++++++++++++++++++++++++++++++++++");
			
		} else if ((userInput.equalsIgnoreCase(testMode))) {
			int paragraphChoice;
			do {
				System.out.println("--------------------------------------------------");
				System.out.println("MEUN");
				System.out.println(" CHOOSE A PARAGRAPH FROM 1-10 ");
				System.out.println("---------------------------------------------------");
				for (int i = 0; i < paragraph.length; i++) {
				System.out.println("[" + (i + 1) + "]" + " " + paragraph[i].substring(0, 50) + "...");
				}
				paragraphChoice = input.nextInt() - 1;
			} while (paragraphChoice > 10 || paragraphChoice < 0);

			char char1[] = paragraph[paragraphChoice].toCharArray();
			char char2[] = char1.clone();
			int randomLetterArray[] = new int[26];
			int randomLetter = 0;
			for (int i = 0; i < randomLetterArray.length; i++) {
				randomLetter = random.nextInt(26);
				randomLetterArray[i] = randomLetter; 
			}

			for (int i = 0; i < randomLetterArray.length; i++) {
				for (int j = 0; j < i; j++) {
				if (randomLetterArray[j] == randomLetterArray[i]) {
						randomLetter = random.nextInt(26);
						randomLetterArray[i] = randomLetter;
						j = 0;
					}

				}
			}
			for (int i = 0; i < char1.length; i++) {  
				//encrypted Letters
				if (char2[i] == 'A' || char2[i] == 'a') { 
					char2[i] = alphabetLower[randomLetterArray[0]];
				} else if (char2[i] == 'B' || char2[i] == 'b') {
					char2[i] = alphabetLower[randomLetterArray[1]];
				} else if (char2[i] == 'C' || char2[i] == 'c') {
					char2[i] = alphabetLower[randomLetterArray[2]];
				} else if (char2[i] == 'D' || char2[i] == 'd') {
					char2[i] = alphabetLower[randomLetterArray[3]];
				} else if (char2[i] == 'E' || char2[i] == 'e') {
					char2[i] = alphabetLower[randomLetterArray[4]];
				} else if (char2[i] == 'F' || char2[i] == 'f') {
					char2[i] = alphabetLower[randomLetterArray[5]];
				} else if (char2[i] == 'G' || char2[i] == 'g') {
					char2[i] = alphabetLower[randomLetterArray[6]];
				} else if (char2[i] == 'H' || char2[i] == 'h') {
					char2[i] = alphabetLower[randomLetterArray[7]];
				} else if (char2[i] == 'I' || char2[i] == 'i') {
					char2[i] = alphabetLower[randomLetterArray[8]];
				} else if (char2[i] == 'G' || char2[i] == 'g') {
					char2[i] = alphabetLower[randomLetterArray[9]];
				} else if (char2[i] == 'K' || char2[i] == 'k') {
					char2[i] = alphabetLower[randomLetterArray[10]];
				} else if (char2[i] == 'L' || char2[i] == 'l') {
					char2[i] = alphabetLower[randomLetterArray[11]];
				} else if (char2[i] == 'M' || char2[i] == 'm') {
					char2[i] = alphabetLower[randomLetterArray[12]];
				} else if (char2[i] == 'N' || char2[i] == 'n') {
					char2[i] = alphabetLower[randomLetterArray[13]];
				} else if (char2[i] == 'O' || char2[i] == 'o') {
					char2[i] = alphabetLower[randomLetterArray[14]];
				} else if (char2[i] == 'P' || char2[i] == 'p') {
					char2[i] = alphabetLower[randomLetterArray[15]];
				} else if (char2[i] == 'Q' || char2[i] == 'q') {
					char2[i] = alphabetLower[randomLetterArray[16]];
				} else if (char2[i] == 'R' || char2[i] == 'r') {
					char2[i] = alphabetLower[randomLetterArray[17]];
				} else if (char2[i] == 'S' || char2[i] == 's') {
					char2[i] = alphabetLower[randomLetterArray[18]];
				} else if (char2[i] == 'T' || char2[i] == 't') {
					char2[i] = alphabetLower[randomLetterArray[19]];
				} else if (char2[i] == 'U' || char2[i] == 'u') {
					char2[i] = alphabetLower[randomLetterArray[20]];
				} else if (char2[i] == 'V' || char2[i] == 'v') {
					char2[i] = alphabetLower[randomLetterArray[21]];
				} else if (char2[i] == 'W' || char2[i] == 'w') {
					char2[i] = alphabetLower[randomLetterArray[22]];
				} else if (char2[i] == 'X' || char2[i] == 'x') {
					char2[i] = alphabetLower[randomLetterArray[23]];
				} else if (char2[i] == 'Y' || char2[i] == 'y') {
					char2[i] = alphabetLower[randomLetterArray[24]];
				} else if (char2[i] == 'Z' || char2[i] == 'z') {
					char2[i] = alphabetLower[randomLetterArray[25]];
				}

			}
			char char3[] = char1.clone();
			for (int i = 0; i < char1.length; i++) {
				char3[i] = Character.toUpperCase(char1[i]);
			}
			char char4[] = char2.clone();
			do {
				System.out.println("-----------------------------------------");
				System.out.println("SCORE ( " + score + " )");
				System.out.println(char1);
				System.out.println(char2);
				//System.out.println(char3);
				//System.out.println(char4);
				System.out.println( "-----------------------------------------");
				System.out.println(paragraph[paragraphChoice]);
				System.out.println( "-----------------------------------------");
				int counter = 0;
				for (int i = 0; i < char1.length; i++) {
					int paragraphBrake = counter % 110;
					counter++;
					System.out.print(char4[i]);
					if (paragraphBrake > 80) {
						if (char2[i] == ' ' && paragraphBrake > 80) {
							System.out.println("");
							counter = 0;
						}
					}
				}
				test++;
				System.out.println("");
				userInput = input.next();
				if (countdown == true) {
					begin = System.currentTimeMillis();
				}
				long finish = System.currentTimeMillis();
				score = 1000 - ((finish - begin) / 1000);
				if (userInput.equalsIgnoreCase(reset)) { 
					for (int i = 0; i < char1.length; i++) {
						char4[i] = char2[i];
					}
				} else if (userInput.equalsIgnoreCase(help)) {
					while (count < 5) {
						randomLetter = random.nextInt(char1.length);
						char uncoded = char3[randomLetter], coded = char4[randomLetter];
						for (int i = 0; i < char1.length; i++) {
							if (char4[i] == coded) {
								char4[i] = uncoded;
							}
						}
						count++;
						System.out.println(count);
						System.out.println(randomLetter);
						System.out.println(char1.length);
						break;
					}
				} else {
					char char5[] = userInput.toCharArray();
					char inputLower = Character.toLowerCase(char5[0]);
					char inputUpper = Character.toUpperCase(char5[0]);
					char outputUpper = Character.toUpperCase(char5[1]);
					for (int i = 0; i < char1.length; i++) {

						if (char4[i] == inputLower || char4[i] == inputUpper) {
							char4[i] = outputUpper;
						}

					}

				}
				countdown = false;
			} while (!Arrays.equals(char4, char3)); 
			System.out.println(
					"+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("YOU WON !");
			System.out.println( "SCORE ( " + score + " )");
			System.out.println(
					"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}
		
		
		
		
		
	}

	
}
