public class Hello {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;
    boolean e = a < b && c > d;
    boolean f = a > b || c < d;
    boolean g = !(a == b);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
  }
}
