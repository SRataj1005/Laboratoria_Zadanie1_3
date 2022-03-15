import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) 
  {
    Scanner nowy = new Scanner(System.in);
    double a, b, wynik;
    System.out.println("Podaj a: ");
    a = nowy.nextDouble();
    System.out.println("Podaj b: ");
    b = nowy.nextDouble();
    wynik = Math.sqrt(a) + Math.sqrt(b);
    System.out.println("Wynik " + wynik);
      
    
  }
}