package com.sistemi.informativi.thred;

/*
 * La Classe che contiene la risorsa condivisa
 * alla quale verrà garantito l'accesso concorrente
 * dei Thread da parte del Thread Monitor deve essere
 * figlia dell'API Thread
 */
public class ChatThread extends Thread{
	
	/*
	 * La risorsa condivisa deve essere
	 * rappresentata dall'Override del metodo
	 * run firmato nell'Interfaccia Runnable
	 * padre della Classe Thread
	 */
	public void run() {
		
		// cycle interval
		try {
			synchronized(ChatThread.class) {
			Thread.sleep(5000);
			System.out.println("Thread Name " + Thread.currentThread().getName());
			System.out.println("Hello " + Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
