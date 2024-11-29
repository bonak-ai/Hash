public class BasicHashFunction {
    public static int hashFunction(String key, int tableSize) {
        int hash = 0;
        for (char c : key.toCharArray()) {
            hash += c;
        }
        return hash % tableSize;
    }

    public static void main(String[] args) {
        System.out.println("Hash value of 'data': " + hashFunction("data", 10));
        System.out.println("Hash value of 'structure': " + hashFunction("structure", 10));
    }
}
