package test;

public class Hello {
  public static String cheer(String hello, int number) {
    return hello + number;
  }

  public static void main(String[] args) {
    System.out.println(cheer("Hello rest of Tiptop! ", 10));
  }
}
