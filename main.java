
import java.util; 
import java.util.*;

public class main { 


public static void main (String args [])  { 


    String q1 = "\nWhat is apple in Spanish?\n" 
                + ("(a)Aguacate\n(b)Manzana\n(c)Melon\n(d)Cereza\n"); 

    String q2 = "\nWhat is the verb run in Spanish?\n" 
                + ("(a)Ir\n(b)Caminar\n(c)Duchar\n(d)Correr\n"); 


    String q3 = "\nWhat is the word sad in Spanish?\n" 
                + ("(a)Trieste\n(b)Contento\n(c)Tranquilo\n(d)Simpatico\n");
                
    String q4 = "\nWhat is the world closest to the word home in Spanish?\n" 
                + ("(a)Casa\n(b)Edificio\n(c)Hogar\n(d)Mujer\n"); 
    
    String [] qs = {q1,q2,q3,q4}; 
    String [] an = {"b","d", "a", "c"}; 

                
               
           int score = 0; 
           Scanner inputx = new Scanner(System.in); 
           for(int i = 0; i < qs.length; i++) { 
            System.out.println (qs[i]); 
            String answer = inputx.nextLine(); 
            if(answer.equalsIgnoreCase(an[i])) {score++;};
        
           } 
System.out.println ("\nYou got " + score + " out of " + (qs.length) + ("!") );


          


}
 
} 





