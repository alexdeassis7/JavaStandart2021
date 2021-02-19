package com.educacionit.streams;

import java.io.IOException;
import java.nio.file.*;

public class FilesEjemplos {

	public static void main(String[] args) {
//		System.out.println("Creamos Directorio");
//		crearDirectorio();
		System.out.println("copiamos un archivo de propiedades");
//		copyFile();
		System.out.println("Bakapeando ando");
//		moverArchivos();
		System.out.println("Borrando ando ");
		borrarArchivo();

	}

	public static void crearDirectorio() {
		Path path = Paths.get("datos");

		try {
			Path nuevoDirectorio = Files.createDirectories(path);
		} catch (FileAlreadyExistsException e) {
			System.out.println("el directorio ya existe!");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copyFile() {
		Path sourcePath = Paths.get("login.properties");
		Path destinoPath = Paths.get("Login-copia.properties");

		try {
			Files.copy(sourcePath, destinoPath);
//			Files.copy(sourcePath, destinoPath ,StandardCopyOption.REPLACE_EXISTING);
		} catch (FileAlreadyExistsException e) {
			System.out.println("El archiv que estas por copiar ya existe en el destino");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void moverArchivos() {
		Path sourcePath = Paths.get("Login-copia.properties");
		Path destinoPath = Paths.get("datos/loggin-movidooo.properties");
		try {
			Files.move(sourcePath, destinoPath, StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void borrarArchivo() {
		Path path = Paths.get("login.properties");
	
		try {
			Files.delete(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
