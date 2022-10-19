import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String[]> lMap = new LinkedHashMap<>();
        lMap.put(1, new String[]{"aaa"});
        //String sss = linkedHashMap.toString();
        lMap.put(2, new String[]{"bbbbb"});
        lMap.put(2, new String[]{"ccccccc"});

        String[] qqq = lMap.get(2);

        lMap.merge(2, new String[]{"ddd"}
                , (a, b) -> Stream.concat(Arrays.stream(a), Arrays.stream(b)).toArray(size -> new String[size])
        );


//        TreeMap; // NOT HASH
////        IdentityHashMap;
////        EnumMap;
//        ConcurrentHashMap;
//        ConcurrentLinkedHashMap;

        int q = 1;

    }
}
