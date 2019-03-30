package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ModelPracticaExamen1 {

	public static String[] islas= {"GRAN CANARIA" ,"LANZAROTE","FUERTEVENTURA","TENERIFE","LA PALMA","LA GOMERA","EL HIERRO" }; 
	public static String[] meses= {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE","NOVIEMBRE","DICIEMBRE"};
	// cargar el fichero y devolver un AL<AL<Integer>> splitear los meses
		// cada fila seria una isla en el orden que viene dada por el atributo islas
		
	public ArrayList<ArrayList<Integer>> generarListadoVisitantesIslasPorMes(){
		ArrayList<ArrayList<Integer>> visitantesIslasPorMes = new ArrayList<ArrayList<Integer>>();		
		try {
			FileReader fr = new FileReader("ficheros/cantidadVisitantesPorIslas.txt");
			BufferedReader br = new BufferedReader(fr);			
			String fichero;
			while((fichero = br.readLine()) !=null) {
				String[] unaLinea = fichero.split("#");			
				ArrayList<Integer> visitantesPorMes= new ArrayList<Integer>();
				for(int i = 0; i < unaLinea.length; i++) {
					visitantesPorMes.add(Integer.parseInt(unaLinea[i]));				
				}
				//System.out.println(visitantesPorMes);
				visitantesIslasPorMes.add(visitantesPorMes);
			}			
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {			
		} catch (IOException e) {
		}	
		return visitantesIslasPorMes;
	}
		
	
}
