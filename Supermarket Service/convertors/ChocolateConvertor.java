package convertors;
import food.Chocolate;

public class ChocolateConvertor {
    public static Chocolate[] chocolateConvertor(String[] strings){
        Chocolate[] chocolates = new Chocolate[strings.length];
        for(int i = 0; i < chocolates.length; ++i) {

            String[] parts = strings[i].split(",");

            Chocolate chocolate = new Chocolate(parts[0], Double.parseDouble(parts[1]), Integer.parseInt(parts[2]));

            chocolate.setDarkChocolate(Boolean.parseBoolean(parts[3]));

            chocolates[i] = chocolate;
        }
        return chocolates;
    }
}
