import javax.swing.JOptionPane;

public class GuitIntro {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("what's your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("how old are you ?"));
        JOptionPane.showMessageDialog(null, "hello :" + name + " You are :" + age + " years old");
    }
}