package view;
import javax.swing.JOptionPane;

import controller.modulos;
public class main {
	public static void main (String args[]) {
		modulos mod = new modulos();
		int x ;
        x= Integer.parseInt(JOptionPane.showInputDialog("Descubra a quantidade de digitos de "));
        System.out.println("Há " +  mod.digitos(x) + " digitos." );
	}

}
