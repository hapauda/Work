
import javax.swing.JOptionPane;


public class ja {
    public static void main(String[] args){
        String names = JOptionPane.showInputDialog("enter name boy");
        JOptionPane.showMessageDialog(null, names);

        int age = Integer.parseInt(JOptionPane.showInputDialog("enter age"));
        JOptionPane.showMessageDialog(null, age);
        double height = Double.parseDouble(JOptionPane.showInputDialog("put you height:"));
        JOptionPane.showMessageDialog(null, height);

    }
}
