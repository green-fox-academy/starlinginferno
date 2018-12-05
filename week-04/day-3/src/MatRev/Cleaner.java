package MatRev;

import java.util.List;

public class Cleaner {
    public void clean(List<Cleanable> items) {
        for (Cleanable item : items) {
            item.clean();
        }
    }
}
