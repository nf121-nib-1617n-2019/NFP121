


package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius {

	/**
	 * le point d'entr�e de cette application, dont le commentaire est �
	 * compl�ter
	 * 
	 * @param args
	 *            ...
	 */
	public static void main(String[] args) {
		// pour tous les param�tres de la ligne de commande
		int fahrenheit = 0;
		float celsius = 0;
		 	
		
		
		 
		for( int j =0; j<args.length;j++){ 
		    fahrenheit = Integer.parseInt(args[j]) ;
		 celsius = fahrenheitEnCelsius(fahrenheit) ;
		
		System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); 
		}
		
		
																				
	}

	/**
	 * la m�thode � compl�ter.
	 * 
	 * @param f
	 *            la valeur en degr� Fahrenheit
	 * @return la conversion en degr� Celsius
	 */
	public static float fahrenheitEnCelsius(int f) {
                 double cel;
                 cel=((f-32)*5)/9;
		return ((int)cel*10)/10.0f;
		 
	}

}
