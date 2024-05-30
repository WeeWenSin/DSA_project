/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class BloodDonor {
    private String name;
    private String bloodType;
    private String contactInfo;

    public BloodDonor(String name, String bloodType, String contactInfo) {
        this.name = name;
        this.bloodType = bloodType;
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
               ", Blood Type='" + bloodType + '\'' +
               ", Contact Info='" + contactInfo + '\'' +
               '}';
    }
}
   
