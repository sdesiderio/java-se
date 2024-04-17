package com.sistemi.informativi.main;

import com.sistemi.informativi.thred.ChatThread;

public class MainApplication {

	public static void main(String[] args) {
		
		// NEW
		Thread t1 = new ChatThread();
		//NEW
		Thread t2 = new ChatThread();
		//NEW
		Thread t3 = new ChatThread();
		
		//RUNNABLE
		t1.start();
		//RUNNABLE
		t2.start();
		//RUNNABLE
		t3.start();
		
		
		

	}

}
