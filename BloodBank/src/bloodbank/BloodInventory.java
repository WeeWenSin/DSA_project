/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class BloodInventory {
    private String bloodType;
    private int quantity;

    public BloodInventory(String bloodType, int quantity) {
        this.bloodType = bloodType;
        this.quantity = quantity;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Blood Type='" + bloodType + '\'' +
               ", Quantity=" + quantity +
               '}';
    }
}

