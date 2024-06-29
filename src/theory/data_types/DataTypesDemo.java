package theory.data_types;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DataTypesDemo {

   // psvm
   public static void main(String[] args) {
       // sout
       System.out.println("Hello :) ");
       String abc = JOptionPane.showInputDialog(new JFrame("Window"), "Input your word:");
       System.out.println(abc);

       int x = 10;

       if(x == 5) {
           System.out.println("A");
       }


   }

}
