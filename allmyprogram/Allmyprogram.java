/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allmyprogram;

import java.util.Scanner;

public class Allmyprogram {

   
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("WELLCOME MY ALL PROGRAM");
        
        System.out.println("1: FACTORIAL PROGRAM");
        System.out.println("2: CALCULATOR PROGRAM");
        System.out.println("3: FOR LOOP PROGRAM");
        System.out.println("4: DO WHILE LOOP PROGRAM");
        int main=sc.nextInt();
        
       
        switch(main){
            
            case 1:
                System.out.println("1 calcultor program");
                System.out.println("2 back");
                int a=sc.nextInt();
                char c;
                switch (a){
                    
                  
                    case 1:
                        
                        do{
                            
                        
                          int fact=1;
        System.out.println("enter the any no");
       
       
     
            
        int f = sc.nextInt();
        
        
        
        
        for (int i =1 ; i<=f ; i++) {
            
           fact=fact*i;
            
        }
        System.out.println(+fact );
      
                            System.out.println("do you want to continue");
                            System.out.println("y or n");
                            c = sc.next().charAt(0);
                            
                        }
                        while(c=='y');
                       
                }
        }
                 
  
                
                
            
                
                
        
            
            
        
       
            
            
        
        
            
        
        
        
        
        
        
        
       
    }
    
}
