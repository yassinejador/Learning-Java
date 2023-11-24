public class OverLoading {
    public static void main(String[] args) {
        Die de1 = new Die(1);
        Die de2 = new Die(2);
        System.out.println(de1.testFace(0));

    }

    public int OverLoading(int a, int b) {
        System.out.println("A");
        return a + b;
    }

    public String OverLoading(long a, char b) {
        System.out.println("B");
        return""+ a + b;
    }

    public int OverLoading(byte a, int b) {
        System.out.println("C");
        return a + b;
    }

    public char OverLoading(long a, short b) {
        System.out.println("D");
        return (char)( a + b);
    }
}
