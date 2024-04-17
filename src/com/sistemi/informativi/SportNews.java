package com.sistemi.informativi;

@FunctionalInterface
public interface SportNews {
	
	public  void sayWelcome();
	
	
	public default void showBasketNews(){
		
		System.out.println("Basket News");
		
	}
	
	public static void showFootballNews() {
		
		System.out.println("Football News");
		
	}

}
