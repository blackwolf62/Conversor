package principal;

import javax.swing.JOptionPane;

import conversorMonedas.Funcion;
import conversorTemperaturas.FuncionTemperatura;

public class Principal {
	
	public static void main(String[] args) {
		
		Funcion monedas = new Funcion();
		FuncionTemperatura temperatura = new FuncionTemperatura();
		
		while (true) {
			
			String opciones = (JOptionPane.showInputDialog(null,
					"Seleccione una opción de conversión ",
					"Menú",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] {"Conversor de Monedas", "Conversor de Temperatura"},
					"Selección"))
					.toString();
			
			switch (opciones) {
			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
				if (ValidarNumero(input)== true) {
					double Minput = Double.parseDouble(input);
					monedas.CovertirMonedas(Minput);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opción afirmativa");
						
					}else{
						JOptionPane.showMessageDialog(null, "Programa Terminado");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				
				break;
				
			case "Conversor de Temperatura":
				input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir");
				if(ValidarNumero(input) == true) {
					double Minput = Double.parseDouble(input);
					temperatura.ConvertirTemperatura(Minput);
					
					int respuesta = 0;
					respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
					if((respuesta == 0) && (ValidarNumero(input) == true)){
						
					} else {
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
			
			

			}
		}
	}
	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if(x >= 0 || x< 0);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
