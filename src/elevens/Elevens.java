/* Program Information
 * 1-15
 * cs.evsnyder
 * Edmon Snyder
 * AP Elevens Lab
 * 11/26/2018
 */

package elevens;

// Imports
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;

/** Credits
 * @author cs.evsnyder
 */
public class Elevens {
    
    // Start Of Card Value Assignment
    Map<String,String> CardDictionary = new HashMap<String,String>();
    CardDictionary.put("2_of_clubs","2");
    CardDictionary.put()
    
    
    public static void shuffleDeck(File Deck[]){
        Random x = new Random();
        for(int i = 0; i < 52; i++){
            int y = i+x.nextInt(52-i);
            File temp = Deck[y];
            Deck[y] = Deck[i];
            Deck[i] = temp;
        }
    }
    
    public static void main(String[] args) {
        File[] Deck = new File("src/cards").listFiles(); 
        shuffleDeck(Deck);
    }
    
    
}
