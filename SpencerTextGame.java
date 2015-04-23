import java.util.*;

public class STextBased{
    public static void main(String[] args){
        boolean StillPlaying=false;
        do {
        String[] ranks = {"K", "Q", "J"};
        String[] suits = {"♦", "♥", "♣", "♠"};
        int[]    value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        String[] fancyNums = {"➊", "➋", "➌", "➍", "➎", "➏", "➐", "➑", "➒"};
        
        Deck allCards = new Deck(ranks, suits, value);
            Card blankCard = new Card("X", "X", 99);
            int numBlanks = 0;
        allCards.shuffle();
        
        List<Card> curCards = new ArrayList<Card>();
        
        boolean win = false;
        

        System.out.println("Instructions\n\nPick two cards (input the numbers with spaces) that add to 11.\nYou can pick a K, Q, and a J to clear them.\n\nEnter 'exit' to quit.\n\n");
            for(int i = 0; i < 9; i++){
            Card dealt = allCards.deal();
            curCards.add(dealt);
         }   
            StillPlaying=false;
         while(allCards.size() > 0 || numBlanks < 9){
                for(int i = 0; i < curCards.size(); i++){
                 Card cur = curCards.get(i);
                 System.out.print(fancyNums[i] + " " + cur.rank() + cur.suit() + " ");
             }
             System.out.println();
            
                Scanner getNums = new Scanner(System.in);
                String numLine = getNums.nextLine();
             getNums = new Scanner(numLine);
            
                if(numLine.toLowerCase().equals("exit")){
                break;
             } else if (numLine.equalsIgnoreCase("reset")) {
                 StillPlaying=true;
                 break;
             }
            
                try{
                    int num1 = getNums.nextInt();
                    int num2 = getNums.nextInt();
                    int num3 = 0;
                
                 Card card1 = curCards.get(num1 - 1);
                 Card card2 = curCards.get(num2 - 1);
                 Card card3 = null;
                
                List<String> checkRoyal = new ArrayList<String>();
                
                if(getNums.hasNextInt()){
                    num3 = getNums.nextInt();
                    card3 = curCards.get(num3 - 1);
                    
                    checkRoyal.add(card1.rank());
                    checkRoyal.add(card2.rank());
                    checkRoyal.add(card3.rank());
                }
                
                if(checkRoyal.isEmpty()){
                    if(card1.pointValue() + card2.pointValue() == 11){
                        if(allCards.size - 1 >= 0){
                            curCards.set(num1 - 1, allCards.deal());
                        }else{
                            curCards.set(num1 - 1, blankCard);
                            numBlanks++;
                        }
                        if(allCards.size - 1 >= 0){
                            curCards.set(num2 - 1, allCards.deal());
                        }else{
                            curCards.set(num2 - 1, blankCard);
                            numBlanks++;
                        }
                        
                        System.out.println("** Right! **");
                    }else{
                        System.out.println("** Wrong move! **");
                    }
                }else if(checkRoyal.contains("K") && checkRoyal.contains("Q") && checkRoyal.contains("J")){
                        if(allCards.size - 1 >= 0){
                            curCards.set(num1 - 1, allCards.deal());
                        }else{
                            curCards.set(num1 - 1, blankCard);
                            numBlanks++;
                        }
                        if(allCards.size - 1 >= 0){
                            curCards.set(num2 - 1, allCards.deal());
                        }else{
                            curCards.set(num2 - 1, blankCard);
                            numBlanks++;
                        }
                        if(allCards.size - 1 >= 0){
                            curCards.set(num3 - 1, allCards.deal());
                        }else{
                            curCards.set(num3 - 1, blankCard);
                            numBlanks++;
                        }
                        System.out.println("** Right! **");
                }else{
                    System.out.println("** Wrong move! **");
                }
            }catch(InputMismatchException e){
                System.out.println("Enter a number!");
            }catch(NoSuchElementException e){
                System.out.println("Enter more than one number!");
            }catch(IndexOutOfBoundsException e){
                System.out.println("Enter a number from 1 - 9!");
            }
        }
        if(allCards.size() <= 0){
            win = true;
        }
        
        if(win){
            System.out.println("\nYou win!");
        }else{
            System.out.println("\nYou lose.");
        }
        System.out.println("Do you want to play a game? (type reset)");
        Scanner resetReader= new Scanner(System.in);
        String wutUwantM8= resetReader.next();
        //checking what they want to do next
        if(wutUwantM8.equalsIgnoreCase("reset")){
            StillPlaying=true;
        }else if(wutUwantM8.equalsIgnoreCase("exit")) {
            continue;
        }else{
            System.out.println("command not recognised, exiting now.");
        }



        }while(StillPlaying==true);
    }
}
