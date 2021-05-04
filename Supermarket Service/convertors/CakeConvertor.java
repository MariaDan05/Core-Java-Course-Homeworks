package convertors;
import food.Cake;

public class CakeConvertor {
    public static Cake[] cakeConvertor(String[] strings){
        Cake[] cakes = new Cake[strings.length];
        for(int i = 0; i < cakes.length; ++i) {

            String[] parts = strings[i].split(",");

            Cake cake = new Cake(parts[0], Double.parseDouble(parts[1]), Integer.parseInt(parts[2]));

            cake.setChocolateCake(Boolean.parseBoolean(parts[3]));

            cakes[i] = cake;
        }
        return cakes;
    }
}
