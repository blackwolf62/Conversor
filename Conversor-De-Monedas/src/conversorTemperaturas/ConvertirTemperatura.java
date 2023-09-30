package conversorTemperaturas;


import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	
	public double ConvertirCelsiusAFarenheit(double valor) {
		double farenheit = valor * 1.8 + 32;
		farenheit = (double) Math.round(farenheit *100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados Celsius son " +farenheit+ " Grados Farenheit");
		return farenheit;
	}
	
	public double ConvertirCelsiusAKelvin(double valor) {
		double kelvin = valor + 273.15;
		kelvin = (double) Math.round(kelvin *100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados Celsius son " +kelvin+ " Kelvin");
		return kelvin;
	}
	
	public double ConvertirFarenheitACelsius(double valor) {
		double celsius = (valor - 32)/ 1.8;
		celsius = (double) Math.round(celsius *100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " +celsius+ " Grados Celsius");
		return celsius;
	}
	
	public double ConvertirFarenheitAKelvin(double valor) {
		double fKelvin = 5/9 * (valor - 32) + 273.15;
		fKelvin = (double) Math.round(fKelvin *100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " Grados Farenheit son " +fKelvin+ " Kelvin");
		return fKelvin;
	}
	
	public double ConvertirKelvinACelsius(double valor) {
		double kCelsius = valor - 273.15;
		kCelsius = (double) Math.round(kCelsius *100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kCelsius+ " Grados Celcius");
		return kCelsius;
	}
	
	public double ConvertirKelvinAFarenheit(double valor) {
		double kFarenheit = 1.8  * (valor - 273.15) + 32;
		kFarenheit = (double) Math.round(kFarenheit *100d)/100;
		JOptionPane.showMessageDialog(null, +valor+ " Kelvin son " +kFarenheit+ " Grados Farenheit");
		return kFarenheit;
	}

}
