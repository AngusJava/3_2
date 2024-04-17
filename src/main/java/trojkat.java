import java.util.Scanner;

//program ktory wygeneruje kwadrat 10x10 z wybranego znaku
public class trojkat {
  public static void main(String[] args) {

    System.out.println("Podaj wielkosc: ");
    Scanner wielkosc = new Scanner(System.in);
    int wielkosc_Pobieranie = wielkosc.nextInt();

    System.out.println("Podaj z jakiego znaku ma byc zrobione ");
    Scanner znak = new Scanner(System.in);
    char znak_Pobieranie = znak.next().charAt(0);

    for (int i = 1; i <= wielkosc_Pobieranie; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(znak_Pobieranie + " ");
      }
      System.out.println();
    }
}