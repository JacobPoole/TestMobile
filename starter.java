/* 
 .  Author: 
    Date: 

  */  

import java.util.*;

public class starter{
   public static void main(String [] args){
       System.out.println("Please enter a word or phrase:");
       Scanner sc = new Scanner(System.in);
       String phrase = sc.nextLine();
       System.out.println();
       String newPhrase = new String("");

       for(int i = 0; i < phrase.length(); i++){
           String letter = phrase.substring(i,i+1);
          if(i % 2 == 0){
              letter = letter.toLowerCase();
          }
          else{
            letter = letter.toUpperCase();
          }
          newPhrase = newPhrase + letter;

       }

       System.out.println("Your word/phrase as sPoNgE cAsE:");
       System.out.println(newPhrase);


   }

   public static String spongeCase(String phrase){
       
    return "";
   }

}