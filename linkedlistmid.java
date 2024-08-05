import java.util.LinkedList;

class linkedlistmid {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);

        // Print the linked list
        System.out.println("Linked List: " + list);

        // Find the middle element
        int middleElement = findMiddle(list);
        System.out.println("Middle Element: " + middleElement);
    }

    public static int findMiddle(LinkedList<Integer> list) {
        int slowIndex = 0;
        int fastIndex = 0;

        // Traverse the list
        while (fastIndex < list.size() && fastIndex + 1 < list.size()) {
            slowIndex++;         
            fastIndex += 2;       
        }    
        return list.get(slowIndex);
    }
}
