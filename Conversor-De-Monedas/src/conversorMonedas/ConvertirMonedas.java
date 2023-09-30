package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConvertirPesosADolares(double valor) {
		double monedaDolar = valor / 901.49;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + monedaDolar + " Dólares");
	}
	
	public void ConvertirPesosAEuros(double valor) {
		double monedaEuro = valor / 954.36;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + monedaEuro + " Euros");

}
	public void ConvertirPesosALibras(double valor) {
		double monedaLibra = valor / 1099.54;
		monedaLibra = (double) Math.round(monedaLibra *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + monedaLibra + " Libras");
	}
	
	public void ConvertirPesosAYen(double valor) {
		double monedaYen = valor / 6.04;
		monedaYen = (double) Math.round(monedaYen *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + monedaYen + " Yuanes");
	}
	
	public void ConvertirPesosAWon(double valor) {
		double monedaWom = valor / 0.67;
		monedaWom = (double) Math.round(monedaWom *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes " + monedaWom + " Wons");
	}
	
}