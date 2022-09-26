package bll;

import java.util.Scanner;

import dal.EstudianteDal;
import ui.EstudianteForm;

public class Application {
	private Scanner scan;
	public Application() {
		 scan = new Scanner(System.in);
	}
	public void displayOptions() {
		System.out.println("Gestionar estudiante");
		System.out.println("1. Agregar");
		System.out.println("2. Mostrar");
		System.out.println("3. Volver");
		
	}

	public void show() {
		short option = 0;
		boolean salir = false;
		
		
		while(!salir) {
			System.out.println();
			displayOptions();
			System.out.println();
			option = scan.nextShort();
			switch (option) {
				case 1:
					save();
					break;
				case 2:
					open();
					break;
				case 3:
					salir = true;
					break;
				default:
					System.out.println("Error.");
					break;
			
		}
			
			}
		
		
	}
	public void save() {
		EstudianteForm pf = new EstudianteForm(scan);
		EstudianteDal pd = new EstudianteDal();
	
		pd.setEstudiante(pf.catchPerson());
		
		System.out.println("Por favor indica la ruta para guardar archivo: ");
		String filePath = scan.next();
		System.out.println("Por favor indica el nombre del archivo: ");
		String fileName = scan.next();
		
		pd.setFilePath(filePath);
		pd.setFileName(fileName);
		pd.save();
	}
	
	public void open() {
	
			
		System.out.println("Por favor indica la ruta del archivo a abrir");
		String filePath = scan.next();
		EstudianteDal pd = new EstudianteDal();
		pd.setFilePath(filePath);
		EstudianteForm pf = new EstudianteForm(pd.open());
		pf.showPerson();
		
	}


}
