package Calcu;

import java.util.Scanner;

public class word_score {
    
    public static void main(String[] args){
        System.out.print("word_score=");

        try(Scanner scan = new Scanner(System.in)){
            String word = scan.next();
            int lenword=word.length();

            int vowel = 0;

            for(int i=0;i<lenword;i++){
                char ch=word.charAt(i); // convert string to char
                
                ch=Character.toLowerCase(ch);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowel++;
                }
            int score=2*lenword;
            if(lenword>4 && vowel >= (lenword-vowel)) {
                score = 2 * score;
            }
            System.out.println("Score: " + score);
        }
    }
}}