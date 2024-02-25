/*
 * File name: Lab06.java
 * Date:      2014/08/26 21:39
 * Author:    @author
 */

package cz.cvut.fel.pjv;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab02 {

   public void start(String[] args) {
      Scanner scanner = new Scanner(System.in);

      boolean end = true;
      double average = 0;
      double deviation = 0;
      int num_of_line = 0;
      ArrayList <Double> int_arr_numbers = new ArrayList<>();
      int array_len;
      int max_length = 10;

      while (scanner.hasNext()){
         String number = scanner.nextLine();
         num_of_line += 1;
         if (check_if_double(number)) {
            double double_num = Double.parseDouble(number);
            int_arr_numbers.add(double_num);

            if (int_arr_numbers.size() == max_length){
               average = average_value(int_arr_numbers, max_length);
               deviation = standard_deviation(int_arr_numbers, average, max_length);
               System.out.printf("10 %.3f %.3f\n", average, deviation);
               int_arr_numbers.clear();
            }
         } else {
            System.err.println(homework(num_of_line));
         }
      }

      System.err.println("End of input detected!");

      if(int_arr_numbers.size() > 1){
         average = average_value(int_arr_numbers, int_arr_numbers.size());
         deviation = standard_deviation(int_arr_numbers, average, int_arr_numbers.size());
         System.out.printf("%2d %.3f %.3f\n", int_arr_numbers.size(), average, deviation);
      }
   }

   static private boolean check_if_double(String number){
      try{
         double if_int = Double.parseDouble(number);
      } catch (NumberFormatException not_double){
         return false;
      }
      return true;
   }

   static private double average_value(ArrayList<Double> array,int array_len){
      double sum = 0;
      double average = 0;

      for (double i : array) {
         sum += i;
         average = (double) sum / array_len;
      }
      return average;
   }

   static private double standard_deviation(ArrayList<Double> array, double average, int array_len){
      double deviation = 0;
      double sum = 0;

      for (double i : array) {
         sum += (i - average) * (i - average);
      }
      deviation = (double) Math.sqrt(sum / array_len);
      return deviation;
   }

   static private String homework(int num_of_line){
      return "A number has not been parsed from line " + num_of_line;
   }


}



