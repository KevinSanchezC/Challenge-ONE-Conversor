package convers;

import javax.swing.JOptionPane;

public class Function {

	ConvertidorMonedasAPesos pesos = new ConvertidorMonedasAPesos();
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	
	public void ConvertirMonedas(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, 
    			"Seleccion")).toString();
		
		
		
		switch (opcion) {
		case "De Pesos a Dolar" :
			monedas.ConvertirPesoADolares(Minput);
			break;
		
		case "De Pesos a Euro" :
			monedas.ConvertirPesoAEuros(Minput);
			break;
			
		case "De Pesos a Libras" :
			monedas.ConvertirPesoALibras(Minput);
			break;
		
		case "De Pesos a Wones" :
			monedas.ConvertirPesoAWones(Minput);
			break;
			
		case "De Pesos a Yenes" :
			monedas.ConvertirPesoAYenes(Minput);
			break;
		case "De Dólar a Pesos":
        	pesos.ConvertirDolaresAPeso(Minput);
        	break;
        case "De Euro a Pesos":
        	pesos.ConvertirEurosAPeso(Minput);
        	break;
        case "De Libras a Pesos":
        	pesos.ConvertirLibrasAPeso(Minput);
        	break;
        case "De Yen a Pesos":
        	pesos.ConvertirYenesAPeso(Minput);
        	break;
        case "De Won Coreano a Pesos":
            pesos.ConvertirWonesAPeso(Minput);
            break;
		}
	}
	
	
	
}
