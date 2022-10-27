import datastructures.CustomHashMap;

public class Main {

    public static void main(String[] args) {

        CustomHashMap<Integer, Integer> map = new CustomHashMap<>();
        map.put(12, 12);
        map.put(13, 13);
        map.put(14, 13);
        map.print();
        map.remove(15);
        map.remove(14);
        map.print();
    }


}