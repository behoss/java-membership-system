public class Sort {

    private static void swap(ArrayListCustom<Subscriber> list, int i, int t) {
        Subscriber temp;

        temp = list.get(i);
        list.set(list.get(t), i);
        list.set(temp, t);
    }

    public static void normal(ArrayListCustom<Subscriber> list) {
        int t = 0;
        do {
            for (int i = 0; i < t; i++) {
                var tValue = list.get(t);
                var iValue = list.get(i);

                if (tValue.compareTo(iValue) == -1) {
                    swap(list, i, t);
                }
            }

            t++;
        } while (t != list.size());

        // Sort by member type
        // if (tValue.getMemType().compareTo(iValue.getMemType()) == 1) {
        // swap(list, i, t);
        // }
    }

    public static void advanced(ArrayListCustom<Subscriber> list) {
        sortByIsPaid(list);

        // At this point unpaid users are at top the list
        // Now sorting the two groups based on id value
        // Only swapping the users with equal value for isSubscPaid
        sortIsPaidById(list);
    }

    private static void sortByIsPaid(ArrayListCustom<Subscriber> list) {
        int t = 0;
        do {
            for (int i = 0; i < t; i++) {
                var tValue = list.get(t);
                var iValue = list.get(i);

                if (Boolean.compare(tValue.isSubscPaid(), iValue.isSubscPaid()) == -1) {
                    swap(list, i, t);
                }
            }

            t++;
        } while (t != list.size());

    }

    private static void sortIsPaidById(ArrayListCustom<Subscriber> list) {
        int t = 0;
        do {
            for (int i = 0; i < t; i++) {
                var tValue = list.get(t);
                var iValue = list.get(i);

                if (Boolean.compare(tValue.isSubscPaid(), iValue.isSubscPaid()) == 0 && tValue
                        .compareTo(iValue) == -1) {
                    swap(list, i, t);
                }
            }

            t++;
        } while (t != list.size());
    }

}