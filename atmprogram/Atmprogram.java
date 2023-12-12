class Atmprogram{

    
    public void displayatm(){

    
	    System.out.println("ENTER THE PIN");
        int pin = sc.nextInt();

        System.out.println("ENTER THE AMOUNT");
        int amount = sc.nextInt();
        int one = amount % 5000;
        int two = one % 1000;
        int three= two%500;
        int four = three%100;
        int five=  four%50;
        
        
         
        
        
       

        System.out.println(amount / 5000 + " five thousand note");
     
        System.out.println(one / 1000 + "   one thousand note");
        
        System.out.println(two / 500 + "five hundred note");
       
        System.out.println(three/100+" one hundred note");
        
        System.out.println(four/50+" fifty not");
		
	}
	
}