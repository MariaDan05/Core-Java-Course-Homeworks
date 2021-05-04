package convertors;
import food.Bread;

public class BreadConvertor {
    public static Bread[] breadConvertor(String[] strings){
        Bread[] breads = new Bread[strings.length];
        for(int i = 0; i < breads.length; ++i) {

            String[] parts = strings[i].split(",");

            Bread bread = new Bread(parts[0], Double.parseDouble(parts[1]), Integer.parseInt(parts[2]));

            bread.setType(parts[3]);

            breads[i] = bread;
        }
        return breads;
    }
}
