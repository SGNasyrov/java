import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit>{
    private ArrayList<T> listOf;
    public float weight;

    public Box(T... fr){
        listOf = new ArrayList<T>(Arrays.asList(fr));
    }

    public float getWeight(){
        return listOf.size()*listOf.get(0).getWeight();
    }

    void add(T fr) {
        listOf.add(fr);
    }

    public boolean comparator (Box toCompWith){
        return Math.abs(this.getWeight() - toCompWith.getWeight()) > 0;
    }



}

