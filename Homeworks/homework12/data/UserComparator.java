package data;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.getFio().compareTo(o2.getFio());
    }
}
