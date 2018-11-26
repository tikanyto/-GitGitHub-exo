import java.util.Scanner;

class Convertisseur {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double aConvertir, convertit=0;
    char reponse=' ', mode = ' ';

          do{//tant que reponse n'est pas O ou N
        mode = ' ';
        System.out.println("Choisissez le mode de conversion : ");
        System.out.println("1 - Convertisseur Celsius - Fahrenheit");
        System.out.println("2 - Convertisseur Fahrenheit - Celsius ");
        mode = sc.nextLine().charAt(0);
       
        if(mode != '1' && mode != '2')
          System.out.println("Mode inconnu, veuillez réitérer votre choix.");

      }while (mode != '1' && mode != '2');


