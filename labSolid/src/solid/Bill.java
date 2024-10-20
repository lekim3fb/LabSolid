package solid;

import java.util.Date;

//Clase Bill refactorizada
public class Bill {
 private String code; // Representa un número de 5 dígitos
 private Date date;
 private float initialAmount;
 private float totalVAT;
 private float totalDeduction;
 private float billTotal;
 private int deductionPercentage;

 private final DeductionCalculator deductionCalculator;
 private final VATCalculator vatCalculator;

 
 public Bill(DeductionCalculator deductionCalculator, VATCalculator vatCalculator) {
     this.deductionCalculator = deductionCalculator;
     this.vatCalculator = vatCalculator;
 }


 public String getCode() {
	return code;
}


public void setCode(String code) {
	this.code = code;
}


public Date getDate() {
	return date;
}


public void setDate(Date date) {
	this.date = date;
}


public float getInitialAmount() {
	return initialAmount;
}


public void setInitialAmount(float initialAmount) {
	this.initialAmount = initialAmount;
}


public int getDeductionPercentage() {
	return deductionPercentage;
}


public void setDeductionPercentage(int deductionPercentage) {
	this.deductionPercentage = deductionPercentage;
}


public DeductionCalculator getDeductionCalculator() {
	return deductionCalculator;
}


public VATCalculator getVatCalculator() {
	return vatCalculator;
}


public void setTotalVAT(float totalVAT) {
	this.totalVAT = totalVAT;
}


public void setTotalDeduction(float totalDeduction) {
	this.totalDeduction = totalDeduction;
}


public void setBillTotal(float billTotal) {
	this.billTotal = billTotal;
}


public void billTotalCalc() {
	 if (initialAmount > 35600) {
	        totalDeduction = (float) ((initialAmount * deductionPercentage + 4.5) / 100);
	    } else {
	        totalDeduction = (initialAmount * deductionPercentage) / 100;
	    }
	    totalVAT = (float) (initialAmount * 0.16);
	    billTotal = (initialAmount - totalDeduction) + totalVAT;
 }

 // Otros getters
 public float getTotalVAT() { return totalVAT; }
 public float getTotalDeduction() { return totalDeduction; }
 public float getBillTotal() { return billTotal; }
}