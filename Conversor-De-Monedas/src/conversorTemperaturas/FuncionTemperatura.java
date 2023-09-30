package conversorTemperaturas;

import javax.swing.JOptionPane;

public class FuncionTemperatura {
	ConvertirTemperatura temperatura = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null,
				"Elija una opción para convertir",
				"Temperatura",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {"Grados Celsius a Grados Farenheit",
				"Grados Celsius a Kelvin",
				"Grados Farenheit a Grados Celsius",
				"Grados Farenheit a Kelvin", 
				"Kelvin a Grados Celsius", 
				"kelvin a Grados Farenheit"},
				"selección")).toString();
		
		switch (opcion) {
		case "Grados Celsius a Grados Farenheit":
			temperatura.ConvertirCelsiusAFarenheit(Minput);
			
			break;
			
		case "Grados Celsius a Kelvin":
			temperatura.ConvertirCelsiusAKelvin(Minput);
			
			break;
			
		case "Grados Farenheit a Grados Celsius":
			temperatura.ConvertirFarenheitACelsius(Minput);
			
			break;
			
		case "Grados Farenheit a Kelvin":
			temperatura.ConvertirFarenheitAKelvin(Minput);
			
			break;
			
		case "Kelvin a Grados Celsius":
			temperatura.ConvertirKelvinACelsius(Minput);
			
			break;
			
		case "kelvin a Grados Farenheit":
			temperatura.ConvertirKelvinAFarenheit(Minput);
			
			break;

		
		}
		
	}

}
