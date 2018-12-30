package homework4;
import java.util.Comparator;
import java.util.Objects;


/**
 * Created by user on 13.11.2018.
 */
public class comparator implements Comparator<Bus> {

    @Override
    public int compare(Bus o1, Bus o2) {
        if (SortByRoute(o1, o2)) {
            return 1;
        } else {
            if (Objects.equals(o1.getLastName(), o2.getLastName())) {
                return 0;
            } else {
                return -1;
            }

        }
    }

    private boolean SortByRoute(Bus o1, Bus o2) {
        return o2.getRoute()==(o1.getRoute());
    }


}

