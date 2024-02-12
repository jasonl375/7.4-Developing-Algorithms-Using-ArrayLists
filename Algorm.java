import java.util.ArrayList;
public class Algorm {
    public void removeDupCon (ArrayList<Integer> ints){
        for(int i = 0 ; i < ints.size() ; i++)
        {
            if (ints.get(i) == ints.get(i +1)){
                ints.remove(i);
            }
        }
    }
}
