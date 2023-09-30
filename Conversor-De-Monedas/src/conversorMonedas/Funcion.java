package conversorMonedas;

import javax.swing.JOptionPane;

public class Funcion {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
	public void CovertirMonedas(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null,
				"Elige la moneda a la que deseas convertir tu dinero ",
				"Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
				{		"De Pesos a Dólar",
						"De Pesos a Euro",
						"De Pesos a Libras",
						"De pesos a Yen",
						"De Pesos a Won Coreano",
						"De Dólar a Pesos",
						"De Euro a Pesos",
						"De Libra a Pesos",
						"De Yen a Pesos", 
						"De Won Coreano a Pesos"},
				"Seleccion")).toString();
		
		switch (opcion) {
		
		case "De Pesos a Dólar":
			monedas.ConvertirPesosADolares(Minput);
			
			break;
			
		case "De Pesos a Euro":
			monedas.ConvertirPesosAEuros(Minput);
			break;
			
		case "De Pesos a Libras":
			monedas.ConvertirPesosALibras(Minput);
			break;
			
		case "De pesos a Yen":
			monedas.ConvertirPesosAYen(Minput);
			break;
			
		case "De Pesos a Won Coreano":
			monedas.ConvertirPesosAWon(Minput);
			break;
			
		case "De Dólar a Pesos":
			pesos.ConvertirDolaresAPesos(Minput);
			break;
			
		case "De Euro a Pesos":
			pesos.ConvertirEurosAPesos(Minput);
			break;
			
		case "De Libra a Pesos":
			pesos.ConvertirLibrasAPesos(Minput);
			break;
			
		case "De Yen a Pesos":
			pesos.ConvertirYuanesAPesos(Minput);
			break;
			
		case "De Won Coreano a Pesos":
			pesos.ConvertirWonsAPesos(Minput);
			break;

		}
		
	}
	

}
