class SecondObject {
    /* attributes */
    int b = 2;
    /* 调用多个类 */ 
    public static void main(String args[]) {
        Object a = new Object();
        SecondObject b = new SecondObject();
        /* change attribute b value */
        b.b = 25;
        System.out.println(a.a);
        System.out.println(b.b);

    }
}