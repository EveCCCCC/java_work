// This program computes two people's body mass index (BMI) and 
// compares them. The code uses Scanner for input and parameters/returns.

import java.util.*;     // Scanner for input
public class BMI {
   public static void main(String[] args) {
      Introduction();
      Scanner console = new Scanner(System.in);
      
      double bmi1 = person(console);
      double bmi2 = person(console);
      
      report(1, bmi1);
      report(2, bmi2);
      
      System.out.println("Difference: " + Math.abs(bmi1 - bmi2));
   }

   public static void Introduction() {
      System.out.println("This program reads data for two people and ");
      System.out.println("computes their body mass index (BMI).");
      System.out.println();
   }
   
   public static double person(Scanner console) {
      System.out.println("Enter next person's information: ");
      System.out.print("height (in inches)? ");
      double height = console.nextDouble();
      System.out.print("weight (in pounds)? ");
      double weight = console.nextDouble();
      
      double bodyMass = bmi(height, weight);
      return bodyMass;
   }
   
   public static double bmi(double height, double weight) {
      return (weight * 703 / height / height);
   }
   
   public static void report(int person, double bmi) {
      System.out.println("Person " + person + " BMI = " + bmi);
      if (bmi < 18.5) {
         System.out.println("underweight");
      } else if (bmi <= 24.9) {
         System.out.println("normal");
      } else if (bmi <= 29.9) {
         System.out.println("overweight");
      } else {
         System.out.println("obese");
      }
   }
   
}