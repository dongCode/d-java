public class Loop {
    public static void main(String[] args) {
        int i = 1;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println(i);
        
        do {
            System.out.println(i);
            i++;
        } while (i < 10);

        for (int b = 1; b < 5; b++) {
            System.out.println(b);
        }

        String[] arr = { "aa", "bb", "cc" };
        for (String s : arr) {
            System.out.println(s);
        }

    }
}
