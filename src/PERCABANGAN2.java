import java.util.Scanner;

public class PERCABANGAN2 {
  public static void main(String[] args) {
    Scanner rings = new Scanner(System.in);
    String statusmember;

    System.out.print("Masukkan status member (Gold/Silver/Bronze/Reguler): ");
    statusmember = rings.nextLine();

    if (statusmember.equalsIgnoreCase("Gold")) {
      System.out.println("Diskon 20%");
    } else if (statusmember.equalsIgnoreCase("Silver")) {
      System.out.println("Diskon 15%");
    } else if (statusmember.equalsIgnoreCase("Bronze")) {
      System.out.println("Diskon 10%");
    } else {
      System.out.println("Tidak ada diskon (0%)");
    }
  }
}