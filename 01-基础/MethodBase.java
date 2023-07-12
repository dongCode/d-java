public class MethodBase {

    static void fnHi() {
        System.out.println("hi");
    }
    
    static void fnName(String name) {
        System.out.println("my name is " + name);
    }
    
    static void myAge(String name, int age) {
        System.out.println("my name is " + name + " and my age is " + age);
    }

    static int myAdd(int a, int b) {
        return a + b;
    }

    // With method overloading, multiple methods can have the same name with different parameters
    static double myAdd(double a, double b) {
        return a + b;
    }

    static int sum(int k) {
        if(k == 1) {
            return 1;
        } else {
            return sum(k - 1) + k;
        }
    }

    public static void main(String[] args) {
        fnHi();
        fnName("Jack");
        myAge("Jack", 20);
        System.out.println(myAdd(1, 2));
        
        System.out.println(sum(3));
    }

   
    
}
