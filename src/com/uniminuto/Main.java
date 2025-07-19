package com.uniminuto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese un mensaje a cifrar: ");
	        String mensaje = scanner.nextLine();

	        try {
	            String mensajeCifrado = AESCipherApp.encrypt(mensaje);
	            System.out.println("Mensaje cifrado: " + mensajeCifrado);

	            String mensajeDescifrado = AESCipherApp.decrypt(mensajeCifrado);
	            System.out.println("Mensaje descifrado: " + mensajeDescifrado);
	        } catch (Exception e) {
	            System.out.println("Error en cifrado/descifrado: " + e.getMessage());
	        }

	        scanner.close();
		
		
	}

}
