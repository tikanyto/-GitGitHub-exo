import java.util.Scanner;

class Convertisseur {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double aConvertir, convertit=0;
    char reponse=' ', mode = ' ';

    System.out.println("CONVERTISSEUR DEGRÉS CELSIUS ET DEGRÉS FAHRENHEIT");
    System.out.println("-------------------------------------------------");
  
    System.out.println("Choisissez le mode de conversion : ");
    System.out.println("1 - Convertisseur Celsius - Fahrenheit");
    System.out.println("2 - Convertisseur Fahrenheit - Kelvin ");    
