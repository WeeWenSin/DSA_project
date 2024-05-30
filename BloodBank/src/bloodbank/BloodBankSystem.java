/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author User
 */
public class BloodBankSystem {
    public static void main(String[] args) {
        LinkedList<BloodDonor> donorList = new LinkedList<>();
        LinkedList<BloodInventory> bloodInventory = new LinkedList<>();
        LinkedList<BloodRequest> bloodRequestList = new LinkedList<>();

            donorList.add(new BloodDonor("Ali", "A+", "123-4567890"));
        donorList.add(new BloodDonor("Chin", "O-", "098-7654321"));

        bloodInventory.add(new BloodInventory("A+", 10));
        bloodInventory.add(new BloodInventory("O-", 5));

        bloodRequestList.add(new BloodRequest("Hospital A", "A+", 3));
        bloodRequestList.add(new BloodRequest("Hospital B", "O-", 2));

        // Print lists
        System.out.println("Donor List:");
        donorList.printList();

        System.out.println("\nBlood Inventory:");
        bloodInventory.printList();

        System.out.println("\nBlood Request List:");
        bloodRequestList.printList();
    }
}