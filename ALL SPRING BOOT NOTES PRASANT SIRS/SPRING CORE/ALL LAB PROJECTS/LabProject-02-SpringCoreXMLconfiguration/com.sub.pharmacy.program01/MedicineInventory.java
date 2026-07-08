package com.sub.pharmacy.program01;

import java.util.Map;

public class MedicineInventory {
           private String pharmacyName;
           private Map<String,Integer> medicineStock;
           
           
		   
		   public void setPharmacyName(String pharmacyName) {
			   this.pharmacyName = pharmacyName;
		   }
		  
		   public void setMedicineStock(Map<String, Integer> medicineStock) {
			   this.medicineStock = medicineStock;
		   }
           
		   public void displayInventory() {

		        System.out.println("========== ONLINE PHARMACY ==========");
		        System.out.println("Pharmacy Name : " + pharmacyName);

		        System.out.println("\nAvailable Medicines:");

		        for (Map.Entry<String, Integer> entry : medicineStock.entrySet()) {
		            System.out.println(entry.getKey() + " -> " + entry.getValue());
		        }

		        System.out.println("\nTotal Medicines : " + medicineStock.size());
		    }
           
}
