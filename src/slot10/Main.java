package slot10;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.insertPhone("A", "123456789");
        phoneBook.insertPhone("B", "987654321");
        phoneBook.insertPhone("A", "111222333");
        phoneBook.insertPhone("C", "555444333");

        System.out.println("List of phone numbers in phone book:");
        phoneBook.sort();
        phoneBook.display();

        System.out.println("\nSearching for phone number of A:");
        PhoneNumber A = phoneBook.searchPhone("A");
        if (A != null) {
            System.out.println("Phone number of A: " + A.getPhone());
        } else {
            System.out.println("A not found in phone book.");
        }

        System.out.println("\nRemoving B from phone book:");
        phoneBook.removePhone("B");
        phoneBook.display();

        System.out.println("\nUpdating phone number of A:");
        phoneBook.updatePhone("A", "123456789", "999888777");
        phoneBook.display();
    }
}