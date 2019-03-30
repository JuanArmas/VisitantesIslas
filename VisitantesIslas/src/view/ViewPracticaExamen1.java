package view;

import java.util.ArrayList;

import controller.ControllerPracticaExamen1;
import model.ModelPracticaExamen1;

public class ViewPracticaExamen1 {
	
	public void mostrarTabla() {		
		ModelPracticaExamen1 metodosModel = new ModelPracticaExamen1();		
		ArrayList<ArrayList<Integer>> arrayDatosVisitantesMes = metodosModel.generarListadoVisitantesIslasPorMes();
		String[] arrayIslas = ModelPracticaExamen1.islas;
		String[] arrayMeses = ModelPracticaExamen1.meses;	
		System.out.print("         ");
		for(int i= 0; i < arrayMeses.length; i++) {
			System.out.print(arrayMeses[i] + " ");	
		}
		System.out.println();
		for(int i =0; i < arrayIslas.length; i++) {
			System.out.print(arrayIslas[i] + " ");
			for(int j = 0; j < arrayDatosVisitantesMes.get(i).size(); j++) {
				System.out.print(arrayDatosVisitantesMes.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
	
	public void mostrarTablaTotaleMeses() {		
		ModelPracticaExamen1 metodosModel = new ModelPracticaExamen1();		
		ControllerPracticaExamen1 controller = new ControllerPracticaExamen1();
		ArrayList<ArrayList<Integer>> arrayDatosVisitantesMes = metodosModel.generarListadoVisitantesIslasPorMes();
		String[] arrayIslas = ModelPracticaExamen1.islas;
		String[] arrayMeses = ModelPracticaExamen1.meses;	
		int[] sumatoriaMeses = controller.sumatoriaTotalesMeses();
		System.out.print("         ");
		for(int i= 0; i < arrayMeses.length; i++) {
			System.out.print(arrayMeses[i] + " ");	
		}
		System.out.println();
		for(int i =0; i < arrayIslas.length; i++) {
			System.out.print(arrayIslas[i] + " ");
			for(int j = 0; j < arrayDatosVisitantesMes.get(i).size(); j++) {
				System.out.print(arrayDatosVisitantesMes.get(i).get(j) + " ");
			}
			System.out.println();
		}
		System.out.print("         ");
		for(int i = 0; i < sumatoriaMeses.length; i++) {
			System.out.print(sumatoriaMeses[i] + " ");
		}
	}
	
}
