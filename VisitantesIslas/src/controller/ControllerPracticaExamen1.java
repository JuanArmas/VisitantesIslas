package controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import model.ModelPracticaExamen1;

public class ControllerPracticaExamen1 {
	// la funcion que devuelva un array normal con numeros aleatorios,
	// dandole un rango de numeros y la cantidad (max, min, cantidadNumeros)
	
	public int[]  generarNumAleatorio(int min, int max, int cantidadNumeros) {
		int[] arrayNumAleatorios = new int[cantidadNumeros];
		Random rnd = new Random();
		for (int i = 0; i < cantidadNumeros; i++) {
			arrayNumAleatorios[i] = min + rnd.nextInt(max - min + 1);
		}
		return arrayNumAleatorios;
	}
	
	// se necesita grabar las estadisticas de cada isla en un fichero txt
	// generar un metodo que grabe la cantidad de visitantes de cada una de las islas en los 12 meses
	
	public void grabarDatosVisitantes(String[] nombreIslas){	
		try {
			FileWriter fw = new FileWriter("ficheros/cantidadVisitantesPorIslas.txt");
			BufferedWriter bw = new BufferedWriter(fw);					
			String lineaVisitantesUnaIsla = "";			
			for(int i = 0; i < nombreIslas.length; i++) {
				int[] numerosAleatorios = generarNumAleatorio(5,25,12);
				for(int j = 0; j < numerosAleatorios.length; j++) {
						int unNumeroAleatorio = numerosAleatorios[j];
						lineaVisitantesUnaIsla = lineaVisitantesUnaIsla + (unNumeroAleatorio + "#");
				}	
				bw.write(lineaVisitantesUnaIsla + "\n");
				lineaVisitantesUnaIsla = "";
			}			
			bw.close();
			fw.close();
		} catch (IOException e) {		
		}	
	}
	
	public int[] sumatoriaTotalesMeses() {
		int[] total = new int[12];
		ModelPracticaExamen1 model = new ModelPracticaExamen1();
		ArrayList<ArrayList<Integer>> listadoVisitantesMes = model.generarListadoVisitantesIslasPorMes();		
		for(int i = 0; i < listadoVisitantesMes.size(); i++) {
			for(int j = 0; j < listadoVisitantesMes.get(i).size(); j++) {
				 Integer unDato = listadoVisitantesMes.get(i).get(j);
				 total[j] += unDato;
			}			
		}
		return total;		
	}
	// para hacer sumatoria de filas solo habria que cambiar el indice a total -> [i]
	
	
	
	
	
	
	
	
}
