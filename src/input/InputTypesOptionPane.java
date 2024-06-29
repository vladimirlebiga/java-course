package input;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class InputTypesOptionPane {

    public static void main(String[] args) {

        // showInputDialog - asks user to input a value and returns what was inputted
        int x = Integer.valueOf(JOptionPane.showInputDialog("Input a number: "));
        int y = Integer.valueOf(JOptionPane.showInputDialog("Input a number: "));
        int sum = x + y;
        String result = "Sum of " + x + " and " + y + " is = " + sum;
        // showMessageDialog
        JOptionPane.showMessageDialog(new JFrame("Sum Operation"), result);
        System.exit(0);
        // + -> concatenation operator

    }

}
