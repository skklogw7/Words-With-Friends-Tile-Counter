// Name: Kurt Schuepfer
// 12/12/2015
// A program to keep track of remaining tiles in Words With Friends. First version. 

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class WordsWithFriendsTileCounter {
   
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      String lastWord = "";
      String[] tileBank = {"a", "a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "c", "c", 
         "d", "d", "d", "d", "d", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", 
         "f", "f", "g", "g", "g", "h", "h", "h", "h", "i", "i", "i", "i", "i", "i", "i", "i", "j", 
         "k", "l", "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "o", "o", "o", "o", "o", "o", "o", "o", 
         "p", "p", "q", "r", "r", "r", "r", "r", "r", "s", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "t", 
         "u", "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z", "?", "?"};
      
      
      ArrayList<String> tileBankList = new ArrayList(Arrays.asList(tileBank));
      printTileCount(tileBankList);
      
      
      
      // Get user input and update letter bank
      while(tileBankList.size() > 1) {
         System.out.println("\n");
         System.out.println("Enter the last word played: ");
         lastWord = input.next();

         
         for (int i = 0; i < lastWord.length(); i++) {
            tileBankList.remove(lastWord.substring(i, i+1));
         }
         printTileCount(tileBankList);
      }
   }
   
   //Checks arrayList for current tile count. Then prints the results.
   
   public static void printTileCount(ArrayList<String> arrayList) {
      int aCount = 0, bCount = 0, cCount = 0, dCount = 0, eCount = 0, fCount = 0, gCount = 0,
         hCount = 0, iCount = 0, jCount = 0, kCount = 0, lCount = 0, mCount = 0, nCount = 0,
         oCount = 0, pCount = 0, qCount = 0, rCount = 0, sCount = 0, tCount = 0, uCount = 0,
         vCount = 0, wCount = 0, xCount = 0, yCount = 0, zCount = 0, blankCount = 0;
      
      for (String s : arrayList) {
         if (s.equals("a")) aCount++;
         if (s.equals("b")) bCount++;
         if (s.equals("c")) cCount++;
         if (s.equals("d")) dCount++;
         if (s.equals("e")) eCount++;
         if (s.equals("f")) fCount++;
         if (s.equals("g")) gCount++;
         if (s.equals("h")) hCount++;
         if (s.equals("i")) iCount++;
         if (s.equals("j")) jCount++;
         if (s.equals("k")) kCount++;
         if (s.equals("l")) lCount++;
         if (s.equals("m")) mCount++;
         if (s.equals("n")) nCount++;
         if (s.equals("o")) oCount++;
         if (s.equals("p")) pCount++;
         if (s.equals("q")) qCount++;
         if (s.equals("r")) rCount++;
         if (s.equals("s")) sCount++;
         if (s.equals("t")) tCount++;
         if (s.equals("u")) uCount++;
         if (s.equals("v")) vCount++;
         if (s.equals("w")) wCount++;
         if (s.equals("x")) xCount++;
         if (s.equals("y")) yCount++;
         if (s.equals("z")) zCount++;
         if (s.equals("?")) blankCount++;
      }
      
      System.out.print("A count = " + aCount + "\t");
      System.out.print("B count = " + bCount + "\t");
      System.out.println("C count = " + cCount + "\t");
      System.out.print("D count = " + dCount + "\t");
      System.out.print("E count = " + eCount + "\t");
      System.out.println("F count = " + fCount + "\t");
      System.out.print("G count = " + gCount + "\t");
      System.out.print("H count = " + hCount + "\t");
      System.out.println("I count = " + iCount + "\t");
      System.out.print("J count = " + jCount + "\t");
      System.out.print("K count = " + kCount + "\t");
      System.out.println("L count = " + lCount + "\t");
      System.out.print("M count = " + mCount + "\t");
      System.out.print("N count = " + nCount + "\t");
      System.out.println("O count = " + oCount + "\t");
      System.out.print("P count = " + pCount + "\t");
      System.out.print("Q count = " + qCount + "\t");
      System.out.println("R count = " + rCount + "\t");
      System.out.print("S count = " + sCount + "\t");
      System.out.print("T count = " + tCount + "\t");
      System.out.println("U count = " + uCount + "\t");
      System.out.print("V count = " + vCount + "\t");
      System.out.print("W count = " + wCount + "\t");
      System.out.println("X count = " + xCount + "\t");
      System.out.print("Y count = " + yCount + "\t");
      System.out.print("Z count = " + zCount + "\t");
      System.out.println("? count = " + blankCount + "\t");
      
      
      
      
   }
}




