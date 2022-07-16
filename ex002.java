import java.util.Scanner;

/*
 * Найти расстояние между точками
 */

public class ex002 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.printf("x0 = ");
    int x0 = sc.nextInt();
    System.out.printf("x1 = ");
    int x1 = sc.nextInt();
    double d = Math.abs(x1 - x0);
    System.out.println(d);
    sc.close();
  }
}