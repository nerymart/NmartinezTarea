package dal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import dol.Estudiante;

public class EstudianteDal {
	private Estudiante Estudiante;
	private String filePath;
	private String fileName;
	public EstudianteDal() {
		super();
	}
	
	public Estudiante getEstudiante() {
		return Estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		Estudiante = estudiante;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void save() {
		if(fileName.trim().length()==0) {
			fileName = Estudiante.getFirstName().trim() + Estudiante.getSurName().trim() + ".dat";
		}
		
		File file = new File(filePath + "\\" + fileName);

        ObjectOutputStream w;
		try {
			w = new ObjectOutputStream(new FileOutputStream(file));
	        w.writeObject(getEstudiante());
	        w.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}
	
	public Estudiante open() {
        try{
        	File file = new File(filePath);
            ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));
            return (Estudiante)ois.readObject();
        }
        catch(FileNotFoundException e){
        	e.printStackTrace();
        } catch (IOException | ClassNotFoundException ex) {
        	ex.printStackTrace();
        }
        return null;
	}

}
