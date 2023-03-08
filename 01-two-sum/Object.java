class Object {
    int a = 1;
    /* 
        如果主类不与文件名相同会报错Error：  找不到或无法加载主类 
     */
    public static void main(String args[]) {
        Object b = new Object();
        System.out.println(b.a);
    }
}