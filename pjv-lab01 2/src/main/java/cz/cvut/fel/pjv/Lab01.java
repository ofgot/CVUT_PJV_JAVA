package cz.cvut.fel.pjv;

import java.util.Scanner;

public class Lab01 {

   public void start(String[] args) {

   }

   public void homework(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Vyber operaci (1-soucet, 2-rozdil, 3-soucin, 4-podil):");
      int chooseOperation = scanner.nextInt();
      if(chooseOperation < 1 || chooseOperation > 4){
         System.out.print("Chybna volba!");
      } else {
         switch (chooseOperation){
            case 1:
               System.out.print("Zadej scitanec: ");
               float firstSummand = scanner.nextFloat();
               System.out.print("Zadej scitanec: ");
               float secondSummand = scanner.nextFloat();
               System.out.print("Zadej pocet desetinnych mist: ");
               int number1 = scanner.nextInt();
               if (number1 < 0){
                  System.out.println("Chyba - musi byt zadane kladne cislo!");
                  break;
               } else {
                  float result1 = firstSummand + secondSummand;
                  System.out.printf("%." + number1 + "f + %." + number1 + "f = %." + number1 + "f", firstSummand, secondSummand, result1);
                  break;
               }
            case 2:
               System.out.print("Zadej mensenec: ");
               float firstMinuend = scanner.nextFloat();
               System.out.print("Zadej mensitel: ");
               float secondSubtrahend = scanner.nextFloat();
               System.out.print("Zadej pocet desetinnych mist: ");
               int number2 = scanner.nextInt();
               if (number2 < 0){
                  System.out.println("Chyba - musi byt zadane kladne cislo!");
                  break;
               } else {
                  float result1 = firstMinuend - secondSubtrahend;
                  System.out.printf("%." + number2 + "f - %." + number2 + "f = %." + number2 + "f", firstMinuend, secondSubtrahend, result1);
                  break;
               }
            case 3:
               System.out.print("Zadej cinitel: ");
               float firstMultiplikator = scanner.nextFloat();
               System.out.print("Zadej cinitel: ");
               float secondMultiplikand = scanner.nextFloat();
               System.out.print("Zadej pocet desetinnych mist: ");
               int number3 = scanner.nextInt();
               if (number3 < 0){
                  System.out.println("Chyba - musi byt zadane kladne cislo!");
                  break;
               } else {
                  float result1 = firstMultiplikator * secondMultiplikand;
                  System.out.printf("%." + number3 + "f * %." + number3 + "f = %." + number3 + "f", firstMultiplikator, secondMultiplikand, result1);
                  break;
               }
            case 4:
               System.out.print("Zadej delenec: ");
               float firstDivident = scanner.nextFloat();
               System.out.print("Zadej delitel: ");
               float secondDivisor = scanner.nextFloat();
               if (secondDivisor == 0){
                  System.out.println("Pokus o deleni nulou!");
                  break;
               } else {
                  System.out.print("Zadej pocet desetinnych mist: ");
                  int number4 = scanner.nextInt();
                  if (number4 < 0){
                     System.out.println("Chyba - musi byt zadane kladne cislo!");
                     break;
                  } else {
                     float result1 = firstDivident / secondDivisor;
                     System.out.printf("%." + number4 + "f / %." + number4 + "f = %." + number4 + "f", firstDivident, secondDivisor, result1);
                     break;
                  }
               }
         }
      }
   }
}


