class Node {
    int key;
    int val;
    Node prev;
    Node next;
}
class LRUCache {
    private Map<Integer, Node> myMap;
    private int capacity;
    private Node head;
    private Node tail;
    
    public LRUCache(int capacity) {
        myMap = new HashMap<>();
        this.capacity = capacity;
        
        // initialize d linked list
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = tail;
    }
    
    public int get(int key) {
        if (myMap.containsKey(key)) {
            update(key);
            // returns values;
            return myMap.get(key).val;
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if (myMap.containsKey(key)) {
            update(key);
            // updates values
            myMap.get(key).val = value;
        } else {
            if (myMap.size() == capacity) {
                myMap.remove(tail.prev.key);
                remove(tail.prev);
            }
            Node newNode = new Node();
            newNode.key = key;
            newNode.val = value;
            addFront(newNode);
            myMap.put(key, newNode);
        }
        
    }
    
    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    private void addFront(Node node) {
        head.next.prev = node;
        node.next = head.next;
        head.next = node;
        node.prev = head;
    }
    
    private void update(int key) {
        Node node = myMap.get(key);
        // puts the node to front of the list
        remove(node);
        addFront(node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
