
public class Second {
    int a = 2;
    // 必须通过对象调用
    public int sum1(int k) {
        return k + 1;
    }
    // 不需要通过对象调用
    static int sum2(int k) {
        return k + 2;
    }
   
   public static void main(String[] args) {
       Test a = new Test();
       a.a = 4;
       Second b = new Second();
       b.a = 10;
       System.out.println(a.a);
       System.out.println(b.a);

       System.out.println(b.sum1(3));

       System.out.println(sum2(3));
       
   }
}
