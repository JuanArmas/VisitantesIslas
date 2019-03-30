package main;

import java.util.ArrayList;

import controller.ControllerPracticaExamen1;
import model.ModelPracticaExamen1;
import view.ViewPracticaExamen1;

public class MainPracticaExamen1 {

	public static void main(String[] args) {
		ControllerPracticaExamen1 controller = new ControllerPracticaExamen1();
		ModelPracticaExamen1 model = new ModelPracticaExamen1();
		ViewPracticaExamen1 view = new ViewPracticaExamen1();
		
		String[] listaIslas = ModelPracticaExamen1.islas;
		
		//controller.grabarDatosVisitantes(listaIslas);
		
		//ArrayList<ArrayList<Integer>> listadoVisitantes = model.generarListadoVisitantesIslasPorMes();
		
		//view.mostrarTabla();
		
		view.mostrarTablaTotaleMeses();
		
		//int[] sumTotal = controller.sumatoriaTotalesMeses();
		
		
		
		
		
		System.out.println("Fin del programa ");
		System.exit(0);
	}

}
