/*
<Proj4.java>
 * < Preston Rottinghaus / Section: 02B/ Day: Thursday/ Time: 3:30-5:20pm>
 * "EXTRA CEDIT INCLUDED"
 * <The program is designed to play a simplified version of 5 card poker.
 *  first it takes input of user name and password if password is wrong 3 times it exits the program.
 *  If password is true it prints welcome statement then shuffles and deals cards.
 *  The program prints 5 random gernated cards and compares them to the possible hands and prints out hand. 
 *  Finally asks the player to play again . >
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class Proj4 {

	public static void main(String[] args) {
		 final String YOURLASTNAME = "Rottinghaus";
		 final String YOURWID = "851034353";
		 final String PASSWORD = "CIS200$Fall23";
		 String userName;
		 String userIn;
		 String passIn;
		 char cont = 'Y';
		 int ctr = 0;
		 Scanner s = new Scanner(System.in);
		 Random rand = new Random();
		 String userFirst = YOURLASTNAME;
		
		 if(userFirst.length() >= 4) {
			 userFirst = YOURLASTNAME.substring(0,4);
		 }
		 else if(userFirst.length() == 3) {
			userFirst = userFirst + "z";
		 }
		 else if(userFirst.length() == 2) {
			userFirst = userFirst + "zz";
		 }
		 else if(userFirst.length() ==1 ) {
			userFirst = userFirst + "zzz";
		 }
		 
		  // creates user name from YOURLASTNAME and YOURWID
		 StringBuilder sb = new StringBuilder();
		 sb.append(userFirst);
		 sb.append(YOURWID.substring(5));
		 userName = sb.toString();
		 //prints generated username and convers to lowecase
		 System.out.println("Username generated: " + userName);
			//userName = userName.toLowerCase();
		// checks for matching password and username
		do  {
			++ctr;
			System.out.println();
			if(ctr==1) {
			// intakes username and converts to lowercase and password 
			System.out.print("Please enter your Username: ");
			userIn = s.nextLine();
			userIn = userIn.toLowerCase();
			System.out.print("Please enter your Password: ");
			passIn = s.nextLine();
			}
			else {
				System.out.print("Please re-enter your Username: ");
				userIn = s.nextLine();
				userIn = userIn.toLowerCase();
				System.out.print("Please re-enter your Password: ");
				passIn = s.nextLine();
			}
			
			//testing override
			userIn = "Rott4353";
			passIn = "CIS200$Fall23";
			if(userIn.equals(userName)&& passIn.equals(PASSWORD)) {
				
				ctr =3;
				System.out.println("**Welcome to the 2023 Las Vegas Poker Festival!**");
				System.out.println("  (Application developed by <Preston Rottinghaus>)");
				do {cont ='p';
					
					System.out.println();
					System.out.println("Shuffling cards...");
					System.out.println("Dealing the cards...");
					System.out.println("Here are your five cards...");
					String []handValue = new String[5];
					String []handSuit = new String[5];
					
					
					
					
					int[]value2 = new int[5];
					int[]suit2 = new int[5];
					int []value = new int[5];
					int []suit = new int[5];
					for(int i =0; i<5;++i){
					suit[i] = rand.nextInt(4)+1;
					value[i] = rand.nextInt(12)+3;
					suit2[i] = rand.nextInt(4)+1;
					value2[i] = rand.nextInt(12)+3;
					
					}
					Arrays.sort(value);
					for(int x = 0; x<value.length;++x) {
						for(int j =1+x; j<value.length;++j) {
							while((value[x] == value[j])&&(suit[x] == suit[j])){
								suit[x] = rand.nextInt(4)+1;
								value[x] = rand.nextInt(12)+3;
								
							}
						}
					
						}
					Arrays.sort(value2);
					for(int x = 0; x<value.length;++x) {
						for(int j =x+1; j<value.length;++j) {
							while((value2[x] == value2[j])&&(suit2[x] == suit2[j])&& x!=j){
								suit2[x] = rand.nextInt(4)+1;
								value2[x] = rand.nextInt(12)+3;
							}
						}
					
						}
						
						
					// Royal Flush
					//int[] value = {10, 12, 14, 13, 11};
					//int[] suit = {1,1,1,1,1};
					// Straight Flush
					//int[] value = {9, 7, 8, 6, 5};
					//int[] suit = {1,1,1,1,1};
					// 4 of kind
					//int[] value = {9, 7, 9, 9, 9};
					//int[] suit = {1,1,3,4,2};
					// Full House
					//int[] value = {9, 7, 9, 7, 9};
					//int[] suit = {1,2,3,4,2};
					// Flush
					//int[] value = {9, 10, 8, 6, 5};
					//int[] suit = {1,1,1,1,1};
					// Straight
					//int[] value = {9, 7, 8, 6, 5};
					//int[] suit = {1,2,4,3,1};
					// 3 of kind
					//int[] value = {9, 7, 9, 2, 9};
					//int[] suit = {1,2,3,4,2};
					// Two Pair
					//int[] value = {9, 7, 9, 2, 7};
					//int[] suit = {1,2,3,4,1};
					// One Pair
					//int[] value = {9, 7, 8, 2, 7};
					//int[] suit = {1,2,3,4,1};
					// High Card (Ace)
					//int[] value = {9, 7, 8, 14, 11};
					//int[] suit = {1,2,3,4,1};

					Arrays.sort(value);
					Arrays.sort(value2);
					for(int i = 0;i<5;++i) {
					switch(value[i]) {
					case(2):
						handValue[i] = "2";
					break;
					case(3):
						handValue[i] = "3";
					break;
					case(4):
						handValue[i] = "4";
					break;
					case(5):
						handValue[i] = "5";
					break;
					case(6):
						handValue[i] = "6";
					break;
					case(7):
						handValue[i] = "7";
					break;
					case(8):
						handValue[i] = "8";
					break;
					case(9):
						handValue[i] = "9";
					break;
					case(10):
						handValue[i] = "10";
					break;
					case(11):
						handValue[i] = "Jack";
					break;
					case(12):
						handValue[i] = "Queen";
					break;
					case(13):
						handValue[i] = "King";
					break;
					case(14):
						handValue[i] = "Ace";
					break;
					
					}
					switch(suit[i]){
					case(1):
						handSuit[i] = "Spades"; 
					break;
					case(2):
						handSuit[i] = "Clubs";
					break;
					case(3):
						handSuit[i] = "Hearts";
					break;
					case(4):
						handSuit[i] = "Diamonds";
					break;
					}
					
					System.out.println("\t" +  handValue[i] + " of " + handSuit[i]);
					}
					System.out.println();
					double valSum = 0;
					boolean flush = ((suit[0] == suit[1])&&(suit[1] == suit[2])&&(suit[2] == suit[3]) && (suit[3] == suit[4]));
					for(int i = 0; i<5; ++i) {
						 valSum = valSum + value[i];
					}	
					boolean straight = ((0== (valSum % 5))&&((value[0]+ 1 == value[1])&&(value[1]+ 1 == value[2])&&(value[2] + 1 == value[3])&&(value[3]+ 1 ==value[4])||(value[4]==14) && (value[1] == 2)&&(value[2] == 3)&&(value[3]==4)&&(value[4]==5)));
					int score1 = 0;
					int score2 = 0;	
					int pair1ctr = 0;
					int  pairctr = 0;
					for(int x = 0; x< value.length;++x) {
						for(int j =x +1; j< value.length ; ++j) {
							if((value[x] == value[j])){
								++pair1ctr;
							}
						}
					
						}
						
					// check for royal flush
						if(valSum == 60 && (flush) ) {
							System.out.println("You were dealt a Royal Flush");
							score1 = 21;
						}
						// check for straight flush
						else if((straight) && (flush)) {
							System.out.println("You were dealt a Straight Flush");
							score1 = 20;
						}
						
						
						// check for 4 of a kind with 0,1,2,3 
						else if((value[0] == value[1])&&(value[1] == value[2])&&(value[2] == value[3])) {
								System.out.println("You were dealt 4 of a kind");
								score1 = 19;
								}// check for 4 of a kind with 0,1,3,4
						else if((value[4] == value[0])&&(value[0] == value[1])&&(value[1] == value[2])) {
								System.out.println("You were dealt 4 of a kind");
								score1 = 19;
								}// check for 4 of a kind with 0,1,2,3
						else if((value[3] == value[4])&&(value[4] == value[0])&&(value[0] == value[1])) {
								System.out.println("You were dealt 4 of a kind");
								score1 = 19;
							}//check 4 of a kind 2,3,4,0
						else if((value[3] == value[2])&&(value[4] == value[2])&&(value[3] == value[0])) {
							System.out.println("You were dealt 4 of a kind");
							score1 = 19;
							}
						else if((value[1] == value[2])&&(value[2] == value[3])&&(value[3] == value[4])) {
							System.out.println("You were dealt 4 of a kind");
							score1 = 19;
							}
						
						// check for full house  0,1,2 and 3,4
							else if((value[0] == value[1])&&(value[1] == value[2])&&(value[3] == value[4])) {
								System.out.println("You were dealt a Full House");
								score1 = 18;
							}// check for full house  0,1,3 and 2,4
							else if((value[0] == value[1])&&(value[1] == value[3])&&(value[2] == value[4])) {
								System.out.println("You were dealt a Full House");
								score1 =18;
							}// check for full house  0,1,4 and 2,3
							else if((value[0] == value[1])&&(value[1] == value[4])&&(value[2] == value[3])) {
								System.out.println("You were dealt a Full House");
								score1 =18;
							}// check for full house  0,3,2 and 1,4
							else if((value[3] == value[2])&&(value[0] == value[2])&&(value[1] == value[4])) {
								System.out.println("You were dealt a Full House");
								score1 =18;
							}// check for full house  1,3,2 and 0,4
							else if((value[3] == value[2])&&(value[1] == value[3])&&(value[0] == value[4])) {
								System.out.println("You were dealt a Full House");
								score1 =18;
							}// check for full house  2,3,4 and 1,0
							else if((value[3] == value[2])&&(value[2] == value[4])&&(value[1] == value[0])) {
								System.out.println("You were dealt a Full House");
								score1 =18;
							}// check for full house  2,0,4 and 1,3
							else if((value[0] == value[2])&&(value[2] == value[4])&&(value[1] == value[3])) {
								System.out.println("You were dealt a Full House");
								score1 =18;
							}
							else if((value[0] == value[3])&&(value[3] == value[4])&&(value[2] == value[1])) {
								System.out.println("You were dealt 4 of a kind");
								score1 =18;
							}
							else if((value[2] == value[1])&&(value[4] == value[1])&&(value[0] == value[3])){
								System.out.println("You were dealt a Full House");
								score1 =18;
							}// check for full house  0,2,3 1,4
							else if((value[1] == value[3])&&(value[3] == value[4])&&(value[2] == value[0])) {
								System.out.println("You were dealt a Full House");
								score1 =18;
							}
						
						
						
						
						//check for flush
							else if(flush) {
								System.out.println("You were dealt a Flush");
								score1 =17;
							}//check for straight
							else if(straight) {
								System.out.println("You were dealt a Straight");
								score1 =16;
								}
						
						
						
						// check for 3 of a kind
							else if((value[0] == value[1])&&(value[1] == value[2])) {
								System.out.println("You were dealt 3 of a kind");
								score1 =15;
							}// check for 3 of a kind
							else if((value[0] == value[1])&&(value[1] == value[3])) {
								System.out.println("You were dealt 3 of a kind");
								score1 =15;
							}// check for 3 of a kind
							else if((value[0] == value[1])&&(value[1] == value[4])) {
								System.out.println("You were dealt 3 of a kind");
								score1 =15;
							}else if((value[3] == value[2])&&(value[0] == value[2])) {
								System.out.println("You were dealt 3 of a kind");
								score1 =15;
							}// check for 3 of a kind
							else if((value[3] == value[2])&&(value[1] == value[3])) {
								System.out.println("You were dealt 3 of a kind");
								score1 =15;
							}// check for 3 of a kind
							else if((value[3] == value[2])&&(value[2] == value[4])) {
								System.out.println("You were dealt 3 of a kind");
								score1 =15;
							}// check for 3 of a kind
							else if((value[0] == value[2])&&(value[0] == value[4])) {
								System.out.println("You were dealt 3 of a kind");
								score1 =15;
							}// check for 3 of a kind
							else if((value[1] == value[2])&&(value[2] == value[4])) {
								System.out.println("You were dealt 3 of a kind");
								score1 =15;
							}
							else if((value[1] == value[3])&&(value[4] == value[1])){
								System.out.println("You were dealt 3 of a kind");
								score1 =15;
							}// check for 3 of a kind
							else if((value[0] == value[3])&&(value[0] == value[4])) {
								System.out.println("You were dealt 3 of a kind");
								score1 =15;
							}
							else if(pair1ctr == 2) {
								System.out.println("You were dealt 2 pairs");
								score1 = 14;
							}
							else if(pair1ctr == 1) {
								System.out.println("You were dealt a pair");
								score1 = 13;
							}
					// find high card
						else {
							int highCard = value[0];
							for(int i =1; i<5;++i) {
									if(value[i]>highCard) {
										highCard = value[i];
									}
							}
							String out;
						switch(highCard) {
						case(2):
							out = "2";
						System.out.println("High card is a/an " + out);
						score1 =0;
						break;
						case(3):
							out = "3";
						System.out.println("High card is a/an " + out);
							score1 = 1;
						break;
						case(4):
							out = "4";
						System.out.println("High card is a/an " + out);
						score1 = 2;
						break;
						case(5):
							out = "5";
						System.out.println("High card is a/an " + out);
						score1 = 3;
						break;
						case(6):
							out = "6";
						System.out.println("High card is a/an " + out);
						score1 = 4;
						break;
						case(7):
							out = "7";
						System.out.println("High card is a/an " + out);
						score1 = 5;
						break;
						case(8):
							out = "8";
						System.out.println("High card is a/an " + out);
						score1 = 6;
						break;
						case(9):
							out = "9";
						System.out.println("High card is a/an " + out);
						score1 = 7;
						break;
						case(10):
							out = "10";
						System.out.println("High card is a/an " + out);
						score1 = 8;
						break;
						case(11):
							out = "Jack";
						System.out.println("High card is a/an " + out);
						score1 = 9;
						break;
						case(12):
							out = "Queen";
						System.out.println("High card is a/an " + out);
						score1 = 10;
						break;
						case(13):
							out = "King";
						System.out.println("High card is a/an " + out);
						score1 = 11;
						break;
						case(14):
							out = "Ace";
						System.out.println("High card is a/an " + out);
						score1 = 12;
						break;
						
						}
						}
					System.out.println();
					
					for(int x = 0; x<value2.length;++x) {
						for(int j =x+1; j<value2.length;++j) {
							if((value2[x] == value2[j])){
								++pairctr;
							}
						}
					
						}
						for(int i = 0;i<5;++i) {
						switch(value2[i]) {
						case(2):
							handValue[i] = "2";
						break;
						case(3):
							handValue[i] = "3";
						break;
						case(4):
							handValue[i] = "4";
						break;
						case(5):
							handValue[i] = "5";
						break;
						case(6):
							handValue[i] = "6";
						break;
						case(7):
							handValue[i] = "7";
						break;
						case(8):
							handValue[i] = "8";
						break;
						case(9):
							handValue[i] = "9";
						break;
						case(10):
							handValue[i] = "10";
						break;
						case(11):
							handValue[i] = "Jack";
						break;
						case(12):
							handValue[i] = "Queen";
						break;
						case(13):
							handValue[i] = "King";
						break;
						case(14):
							handValue[i] = "Ace";
						break;
						
						}
						switch(suit2[i]){
						case(1):
							handSuit[i] = "Spades"; 
						break;
						case(2):
							handSuit[i] = "Clubs";
						break;
						case(3):
							handSuit[i] = "Hearts";
						break;
						case(4):
							handSuit[i] = "Diamonds";
						break;
						}
						
						System.out.println("\t" +  handValue[i] + " of " + handSuit[i]);
						}
						System.out.println();
						valSum = 0;
						flush = ((suit2[0] == suit2[1])&&(suit2[1] == suit2[2])&&(suit2[2] == suit2[3]) && (suit2[3] == suit2[4]));
						for(int i = 0; i<5; ++i) {
							 valSum = valSum + value2[i];
						}	
						 straight = ((0== (valSum % 5))&&((value2[0]+ 1 == value2[1])&&(value2[1]+ 1 == value2[2])&&(value2[2] + 1 == value2[3])&&(value2[3]+ 1 ==value2[4])||(value2[4]==14) && (value2[1] == 2)&&(value2[2] == 3)&&(value2[3]==4)&&(value2[4]==5)));
							
								
							
						// check for royal flush
						if(valSum == 60 && (flush) ) {
							System.out.println("You were dealt a Royal Flush");
							score2 = 21;
						}
						// check for straight flush
						else if((straight) && (flush)) {
							System.out.println("You were dealt a Straight Flush");
							score2 = 20;
						}
						
						
						// check for 4 of a kind with 0,1,2,3 
						else if((value2[0] == value2[1])&&(value2[1] == value2[2])&&(value2[2] == value2[3])) {
								System.out.println("You were dealt 4 of a kind");
								score2 = 19;
								}// check for 4 of a kind with 0,1,3,4
						else if((value2[4] == value2[0])&&(value2[0] == value2[1])&&(value2[1] == value2[2])) {
								System.out.println("You were dealt 4 of a kind");
								score2 = 19;
								}// check for 4 of a kind with 0,1,2,3
						else if((value2[3] == value2[4])&&(value2[4] == value2[0])&&(value2[0] == value2[1])) {
								System.out.println("You were dealt 4 of a kind");
								score2 = 19;
								}//check 4 of a kind 2,3,4,0
						else if((value2[3] == value2[2])&&(value2[4] == value2[2])&&(value2[3] == value2[0])) {
								System.out.println("You were dealt 4 of a kind");
								score2 = 19;
								}
						else if((value2[1] == value2[2])&&(value2[2] == value2[3])&&(value2[3] == value2[4])) {
								System.out.println("You were dealt 4 of a kind");
								score2 = 19;
								}
						
								// check for full house  0,1,2 and 3,4
							else if((value2[0] == value2[1])&&(value2[1] == value2[2])&&(value2[3] == value2[4])) {
								System.out.println("You were dealt a Full House");
								score2 = 18;
								}// check for full house  0,1,3 and 2,4
							else if((value2[0] == value2[1])&&(value2[1] == value2[3])&&(value2[2] == value2[4])) {
								System.out.println("You were dealt a Full House");
								score2 =18;
								}// check for full house  0,1,4 and 2,3
							else if((value2[0] == value2[1])&&(value2[1] == value2[4])&&(value2[2] == value2[3])) {
								System.out.println("You were dealt a Full House");
								score2 =18;
								}// check for full house  0,3,2 and 1,4
							else if((value2[3] == value2[2])&&(value2[0] == value2[2])&&(value2[1] == value2[4])) {
								System.out.println("You were dealt a Full House");
								score2 =18;
								}// check for full house  1,3,2 and 0,4
							else if((value2[3] == value2[2])&&(value2[1] == value2[3])&&(value2[0] == value2[4])) {
								System.out.println("You were dealt a Full House");
								score2 =18;
								}// check for full house  2,3,4 and 1,0
							else if((value2[3] == value2[2])&&(value2[2] == value2[4])&&(value2[1] == value2[0])) {
								System.out.println("You were dealt a Full House");
								score2 =18;
								}// check for full house  2,0,4 and 1,3
							else if((value2[0] == value2[2])&&(value2[2] == value2[4])&&(value2[1] == value2[3])) {
								System.out.println("You were dealt a Full House");
								score2 =18;
								}
							else if((value2[0] == value2[3])&&(value2[3] == value2[4])&&(value2[2] == value2[1])) {
								System.out.println("You were dealt 4 of a kind");
								score2 =18;
								}
							else if((value2[2] == value2[1])&&(value2[4] == value2[1])&&(value2[0] == value2[3])){
								System.out.println("You were dealt a Full House");
								score2 =18;
								}// check for full house  0,2,3 1,4
							else if((value2[1] == value2[3])&&(value2[3] == value2[4])&&(value2[2] == value2[0])) {
								System.out.println("You were dealt a Full House");
								score2 =18;
								}
						
						
						
						
						//check for flush
							else if(flush) {
								System.out.println("You were dealt a Flush");
								score2 =17;
								}//check for straight
							else if(straight) {
								System.out.println("You were dealt a Straight");	
								score2 =16;
								}
								// check for 3 of a kind
							else if((value2[0] == value2[1])&&(value2[1] == value2[2])) {
								System.out.println("You were dealt 3 of a kind");
								score2 =15;
								}// check for 3 of a kind
							else if((value2[0] == value2[1])&&(value2[1] == value2[3])) {
								System.out.println("You were dealt 3 of a kind");
								score2 =15;
								}// check for 3 of a kind
							else if((value2[0] == value2[1])&&(value2[1] == value2[4])) {
								System.out.println("You were dealt 3 of a kind");
								score2 =15;
							}
							else if((value2[3] == value2[2])&&(value2[0] == value2[2])) {
								System.out.println("You were dealt 3 of a kind");
								score2 =15;
								}// check for 3 of a kind
							else if((value2[3] == value2[2])&&(value2[1] == value2[3])) {
								System.out.println("You were dealt 3 of a kind");
								score2 =15;
								}// check for 3 of a kind
							else if((value2[3] == value2[2])&&(value2[2] == value2[4])) {
								System.out.println("You were dealt 3 of a kind");
								score2 =15;
								}// check for 3 of a kind
							else if((value2[0] == value2[2])&&(value2[0] == value2[4])) {
								System.out.println("You were dealt 3 of a kind");
								score2 =15;
								}// check for 3 of a kind
							else if((value2[1] == value2[2])&&(value2[2] == value2[4])) {
								System.out.println("You were dealt 3 of a kind");
								score2 =15;
								}
							else if((value2[1] == value2[3])&&(value2[4] == value2[1])){
								System.out.println("You were dealt 3 of a kind");
								score2 =15;
								}// check for 3 of a kind
							else if((value2[0] == value2[3])&&(value2[0] == value2[4])) {
								System.out.println("You were dealt 3 of a kind");
								score2 =15;
								}
							else if(pairctr == 2) {
								System.out.println("You were dealt 2 pairs");
								score2 = 14;
								}
							else if(pairctr == 1) {
								System.out.println("You were dealt a pair");
								score2 = 13;
								}
							// find high card
						else {
							int highCard2 = value2[0];
							for(int i =1; i<5;++i) {
									if(value2[i]>highCard2) {
										highCard2 = value2[i];
									}
							}
						
							String out2;
						switch(highCard2) {
						case(2):
							out2 = "2";
						System.out.println("High card is a/an " + out2);
						score2 =0;
						break;
						case(3):
							out2 = "3";
						System.out.println("High card is a/an " + out2);
							score2 = 1;
						break;
						case(4):
							out2 = "4";
						System.out.println("High card is a/an " + out2);
						score2 = 2;
						break;
						case(5):
							out2 = "5";
						System.out.println("High card is a/an " + out2);
						score2 = 3;
						break;
						case(6):
							out2 = "6";
						System.out.println("High card is a/an " + out2);
						score2 = 4;
						break;
						case(7):
							out2 = "7";
						System.out.println("High card is a/an " + out2);
						score2 = 5;
						break;
						case(8):
							out2 = "8";
						System.out.println("High card is a/an " + out2);
						score2 = 6;
						break;
						case(9):
							out2 = "9";
						System.out.println("High card is a/an " + out2);
						score2 = 7;
						break;
						case(10):
							out2 = "10";
						System.out.println("High card is a/an " + out2);
						score2 = 8;
						break;
						case(11):
							out2 = "Jack";
						System.out.println("High card is a/an " + out2);
						score2 = 9;
						break;
						case(12):
							out2 = "Queen";
						System.out.println("High card is a/an " + out2);
						score2 = 10;
						break;
						case(13):
							out2 = "King";
						System.out.println("High card is a/an " + out2);
						score2 = 11;
						break;
						case(14):
							out2 = "Ace";
						System.out.println("High card is a/an " + out2);
						score2 = 12;
						break;
						
						}
						}
						if(score1 > score2) {
							System.out.println("Player 1 wins");
						}
						else if( score1 < score2 ){
							System.out.println("Player 2 wins");
						}
						else {
							System.out.println("Draw no winner");
						}
						
						
					while((cont != 'Y')&&(cont != 'N')) {
						System.out.print("Play Again(Y or N)? ");
						String in = s.next().toUpperCase();
						cont = in.charAt(0);
							if((cont != 'Y')&&(cont != 'N')){
						System.out.println("Please enter a 'Y' or 'N' only");
							}
							else {}
					}
						
				}while(cont == 'Y');
			
	}// end if
			else if(ctr == 3) {
				System.out.println("Invalid Username and/or Password enterd 3 times...Exiting");
			}
			else {
				
				System.out.println("User and/or Password is/are invalid");
			}

}while(ctr != 3);// end while
		s.close();
	}//ends main
}// end class
