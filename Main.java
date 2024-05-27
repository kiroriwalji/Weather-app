import java.util.Scanner;
import java.util.LinkedList;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<>();

        int choice;
        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Add element");
            System.out.println("2. Delete element");
            System.out.println("3. Print list");
            System.out.println("4. Get size of the list");
            System.out.println("5. Modify list");
            System.out.println("6. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to add:");
                    int elementToAdd = scanner.nextInt();
                    linkedList.add(elementToAdd);
                    break;
                case 2:
                    System.out.println("Enter the index of the element to delete:");
                    int indexToDelete = scanner.nextInt();
                    if (indexToDelete >= 0 && indexToDelete < linkedList.size()) {
                        linkedList.remove(indexToDelete);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 3:
                    System.out.println("Current list: " + linkedList);
                    break;
                case 4:
                    System.out.println("Size of the list: " + linkedList.size());
                    break;
                case 5:
                    System.out.println("Enter the index of the element to modify:");
                    int indexToModify = scanner.nextInt();
                    if (indexToModify >= 0 && indexToModify < linkedList.size()) {
                        System.out.println("Enter the new value:");
                        int newValue = scanner.nextInt();
                        linkedList.set(indexToModify, newValue);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
