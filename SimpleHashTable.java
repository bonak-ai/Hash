import java.util.LinkedList;

public class SimpleHashTable {
    private LinkedList<Integer>[] table;

    public SimpleHashTable(int size) {
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void insert(int key) {
        int index = key % table.length;
        table[index].add(key);
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
        SimpleHashTable hashTable = new SimpleHashTable(10);
        hashTable.insert(12);
        hashTable.insert(22);
        hashTable.insert(32);
        hashTable.display();
    }
}
