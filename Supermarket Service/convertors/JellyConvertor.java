package convertors;
import food.Jelly;

public class JellyConvertor {
    public static Jelly[] jellyConvertor(String[] strings){
        Jelly[] jellies = new Jelly[strings.length];
        for(int i = 0; i < jellies.length; ++i) {

            String[] parts = strings[i].split(",");

            Jelly jelly = new Jelly(parts[0], Double.parseDouble(parts[1]), Integer.parseInt(parts[2]));

            jelly.setColor(parts[3]);

            jellies[i] = jelly;
        }
        return jellies;
    }
}
