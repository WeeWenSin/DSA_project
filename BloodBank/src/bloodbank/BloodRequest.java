/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class BloodRequest {
    private String requesterName;
    private String requestedBloodType;
    private int quantity;

    public BloodRequest(String requesterName, String requestedBloodType, int quantity) {
        this.requesterName = requesterName;
        this.requestedBloodType = requestedBloodType;
        this.quantity = quantity;
    }

    public String getRequesterName() {
        return requesterName;
    }

    public void setRequesterName(String requesterName) {
        this.requesterName = requesterName;
    }

    public String getRequestedBloodType() {
        return requestedBloodType;
    }

    public void setRequestedBloodType(String requestedBloodType) {
        this.requestedBloodType = requestedBloodType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Request Name='" + requesterName + '\'' +
               ", Requested Blood Type='" + requestedBloodType + '\'' +
               ", Quantity=" + quantity +
               '}';
    }
}

