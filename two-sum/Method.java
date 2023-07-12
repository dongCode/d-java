class Method {
    static void myMethod() {
        System.out.println("i just got executed");
    }
    static void myName(char name) {
        System.out.println("my name is " + name);
    }

 
    /* 
       重载（Overloading）: 同一方法可以具有相同的名称和不同的参数
     */
    static int myAdd(int a,int b) {
        return a + b;
    }
    static double myAdd(double a,double b) {
        return a + b;
    }

    /* 递归 （ Recursion ）：方法本身调用本身  */
    public static int sum(int k) {
        if(k > 0) {
           return k + sum(k - 1);
        } else {
           return 0; 
        }
    }

    public static void main(String args[]) {
        myMethod();
        myName('d');
        /* 重载 int 返回 3 */
        System.out.println(myAdd(1,2));
        /* 重载 double 返回 3.0 */
        System.out.println(myAdd(1.0,2.0));

        /* 递归：数字大了会报 StackOverflowError */
        System.out.println(sum(10));
    }
}