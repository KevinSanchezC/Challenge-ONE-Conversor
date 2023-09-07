package principal;



import javax.swing.JOptionPane;

import convers.Function;

public class Prin {

		public static void main(String[] args) {
			Function monedas = new Function();
			
			while(true) {
				String opciones = (JOptionPane.showInputDialog(null, "Seleccione", "Menu",JOptionPane.QUESTION_MESSAGE,null, new Object[] {"Conversor de Monedas"}, "Seleccion")).toString();
				 switch (opciones) {
				case "Conversor de Monedas":
					String input = JOptionPane.showInputDialog("ingresa la cantidad de dinero que desas convertir: ");
					if(ValidarNumero(input) == true) {
						double Minput = Double.parseDouble(input);
						monedas.ConvertirMonedas(Minput);
						int respuesta = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion?");
						if(JOptionPane.OK_OPTION == respuesta) {
							System.out.println("Selecciona una opcion");
						}else {
								JOptionPane.showMessageDialog(null,"Programa Terminado");
						}
					}else {
						JOptionPane.showMessageDialog(null, "Valor Invalido");
					}
					break;

				}
				
			}
		}
		
		public static boolean ValidarNumero(String input) {
			try {
				double x = Double.parseDouble(input);
				if(x >0 || x < 0);
				return true;
			} catch(NumberFormatException e) {
				return false;
			}
			
		}
	}

