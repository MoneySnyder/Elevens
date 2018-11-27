/* Program Information
 * 1-15
 * cs.evsnyder
 * Edmon Snyder
 * AP Elevens Lab
 * 11/26/2018
 */

package elevens;

// Imports
import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.map;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Hashtable;
import javax.imageio.ImageIO;
import static jdk.nashorn.internal.objects.NativeArray.map;
import static jdk.nashorn.internal.objects.NativeDebug.map;

/** Credits
 * @author cs.evsnyder
 */
public class Elevens {
    
    public static void shuffleDeck(File Deck[]){
        // Shuffle Based on a Deck of 52 Cards
        Random x = new Random();
        for(int i = 0; i < 52; i++){
            int y = i+x.nextInt(52-i);
            File temp = Deck[y];
            Deck[y] = Deck[i];
            Deck[i] = temp;
        }
    }
    
    
    public static void main(String[] args) {
        // Start Of Card Value Assignment
        Map<String, String> cd = new HashMap<String, String>();
        cd.put("2_of_clubs","2");cd.put("2_of_diamonds","2");cd.put("2_of_hearts","2");cd.put("2_of_spades","2");
        cd.put("3_of_clubs","3");cd.put("3_of_diamonds","3");cd.put("3_of_hearts","3");cd.put("3_of_spades","3");
        cd.put("4_of_clubs","4");cd.put("4_of_diamonds","4");cd.put("4_of_hearts","4");cd.put("4_of_spades","4");
        cd.put("5_of_clubs","5");cd.put("5_of_diamonds","5");cd.put("5_of_hearts","5");cd.put("5_of_spades","5");
        cd.put("6_of_clubs","6");cd.put("6_of_diamonds","6");cd.put("6_of_hearts","6");cd.put("6_of_spades","6");
        cd.put("7_of_clubs","7");cd.put("7_of_diamonds","7");cd.put("7_of_hearts","7");cd.put("7_of_spades","7");
        cd.put("8_of_clubs","8");cd.put("8_of_diamonds","8");cd.put("8_of_hearts","8");cd.put("8_of_spades","8");
        cd.put("9_of_clubs","9");cd.put("9_of_diamonds","9");cd.put("9_of_hearts","9");cd.put("9_of_spades","9");
        cd.put("10_of_clubs","10");cd.put("10_of_diamonds","10");cd.put("10_of_hearts","10");cd.put("10_of_spades","10");
        cd.put("jack_of_clubs","10");cd.put("jack_of_diamonds","10");cd.put("jack_of_hearts","10");cd.put("jack_of_spades","10");
        cd.put("queen_of_clubs","10");cd.put("queen_of_diamonds","10");cd.put("queen_of_hearts","10");cd.put("queen_of_spades","10");
        cd.put("king_of_clubs","10");cd.put("king_of_diamonds","10");cd.put("king_of_hearts","10");cd.put("king_of_spades","10");
        cd.put("ace_of_clubs","11");cd.put("ace_of_diamonds","11");cd.put("ace_of_hearts","11");cd.put("ace_of_spades","11");
        // End of Card Value Assignment
        
        File[] Deck = new File("src/cards").listFiles(); 
        shuffleDeck(Deck);
    }
    
    
}
