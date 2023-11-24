public class triangle {
    public static void main(String[] args) {
        int times = 5;
        int space = times;
        int k = 1;
        String s = "";
        for (int i = 0; i < times; i++) {
            s = " ".repeat(space);
            System.out.print(s);
            s = "*".repeat(k);
            System.out.print(s);
            System.out.println();
            k = k + 2;
            space = space - 1;
        }
    }
}