package com.pyramid.kailash;


public class K {

	public static void pyramid() {
		// TODO Auto-generated method stub
		
  for(int i =1;i<=5;i++) {
	  //outer
	  
		for (int j = 1; j <= 5 - i; j++) {
			System.out.print("*");
		}

		for (int k = 1; k <= i; k++) {
			System.out.print(k);
		}

		for (int l = i - 1; l >= 1; l--) {
			System.out.print(l);
		}
		System.out.println();
		
		
  }//outer
	}

}
