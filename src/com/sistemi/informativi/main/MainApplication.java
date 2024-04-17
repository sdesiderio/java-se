package com.sistemi.informativi.main;

import com.sistemi.informativi.SportNews;

public class MainApplication {

	public static void main(String[] args) {
		
		
		
		//override
		SportNews sportNews = () -> {
			
			System.out.println("Welcome User");
			
		};
		
		
		sportNews.sayWelcome();
		
		sportNews.showBasketNews();
		
		SportNews.showFootballNews();
		
		
		
		
		
		
		

	}

}
