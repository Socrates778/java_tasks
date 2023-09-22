import java.util.*;

public class MyDataStructure {
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean element_1 = obj.insert(7);
        boolean element_2 = obj.remove(7);

        // Print the elements in the set
        obj.print();
    }

    List<Integer> list = new LinkedList<>();
    Map<Integer, Integer> map = new HashMap<>();
    Random rnd = new Random();

    // Inserts a value to the set. Returns true if the set did not already contain the specified element.
    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }
        return false;
    }

    // Removes a value from the set. Returns true if the set contained the specified element.
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int index = map.get(val);
        swap(index, list.size() - 1);
        map.put(list.get(index), index);
        map.remove(val);
        list.remove(list.size() - 1);
        return true;
    }


    // Print the elements in the set
    public void print() {
        System.out.print("Set elements: ");
        for (int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    private void swap(int a, int b) {
        int temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }
}
