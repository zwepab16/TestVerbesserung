package gui;

import java.util.Comparator;

public class SortName implements Comparator<Wetterstation> {

    @Override
    public int compare(Wetterstation t, Wetterstation t1) {
        return t.getPlace().compareTo(t1.getPlace());
    }
    
}
