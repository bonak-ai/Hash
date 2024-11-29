import java.util.LinkedList;

public class SimpleHashTableSearch {
    private LinkedList<Integer>[] table;


    public SimpleHashTableSearch(int size) {
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void insert(int key) {
        int index = key % table.length;
        table[index].add(key);
    }

    public int search(int key) {
        int index = key % table.length;
        if (table[index].contains(key)) {
            return index;
        }
        return -1;
    }

    public void display() {
        for (int i = 0; i < table.length; i++) {
            System.out.print("Index " + i + ": ");
            for (int key : table[i]) {
                System.out.print(key + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SimpleHashTableSearch hashTable = new SimpleHashTableSearch(10);
        hashTable.insert(12);
        hashTable.insert(22);
        hashTable.insert(32);

        hashTable.display();

        System.out.println("Search for 22: " + (hashTable.search(22) != -1 ? "Found at index " + hashTable.search(22) : "Not Found"));
        System.out.println("Search for 42: " + (hashTable.search(42) != -1 ? "Found at index " + hashTable.search(42) : "Not Found"));
    }
}
