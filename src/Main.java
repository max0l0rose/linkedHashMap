import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String[]> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, new String[]{"aaa"});
        //String sss = linkedHashMap.toString();
        linkedHashMap.put(2, new String[]{"bbbbb"});
        linkedHashMap.put(2, new String[]{"ccccccc"});

        String[] qqq = linkedHashMap.get(2);

        linkedHashMap.merge(2, new String[]{"ddd"}
                , (a, b) -> Stream.concat(Arrays.stream(a), Arrays.stream(b)).toArray(size -> new String[size])
        );


//        TreeMap; // NOT HASH
////        IdentityHashMap;
////        EnumMap;
//        ConcurrentHashMap;
//        ConcurrentLinkedHashMap;

    }
}
