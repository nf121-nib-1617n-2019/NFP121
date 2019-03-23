package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
          int fahrenheit = 0;
		float celsius = 0;
		 	
       try{
           
            
		for( int j =0; j<args.length;j++){ 
		    fahrenheit = Integer.parseInt(args[j]) ;
		 celsius = fahrenheitEnCelsius(fahrenheit) ;
		
		System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); 
		}
           
           
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
      double cel;
                 cel=((f-32)*5)/9;
		return ((int)cel*10)/10.0f;
     }

}
