public class Main {
    public static void main(String[] args) {
        Die die1=new Die(0);
        System.out.println(die1.printNbFace());
        change(die1);
        System.out.println(die1.printNbFace());
    }
    
    static void change(Die die) {
        die=new Die(1);
        die.printNbFace();
    }
    
    
}
