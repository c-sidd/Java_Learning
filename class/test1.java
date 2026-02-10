class test {
  public int a =10;
  private int b = 20;
  protected int c =30;

  int d =10;

    void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }

}


public class test1 {
    public static void test1(String[] args) {
     test dhk = new test();
     dhk.show();

    }
}