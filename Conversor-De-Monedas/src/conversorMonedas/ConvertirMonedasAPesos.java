package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	
	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 901.49;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes CLP " + monedaDolar + " Pesos Chilenos");
		
		
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 954.36;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes CLP " + monedaEuro + " Pesos Chilenos");
		
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 1099.54;
		monedaLibra = (double) Math.round(monedaLibra *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes CLP " + monedaLibra + " Pesos Chilenos");
		
	}
	
	public void ConvertirYuanesAPesos(double valor) {
		double monedaYen = valor * 6.04;
		monedaYen = (double) Math.round(monedaYen *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes CLP " + monedaYen + " Pesos Chilenos");
		
	}
	
	public void ConvertirWonsAPesos(double valor) {
		double monedaWon = valor * 0.67;
		monedaWon = (double) Math.round(monedaWon *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes CLP " + monedaWon + " Pesos Chilenos");
		
	}

}
