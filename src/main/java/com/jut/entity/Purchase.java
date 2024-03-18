package com.jut.entity;

public class Purchase {
	private int PurchaseId;
private int  SupplierId;
private int MedicineId;
private int Quantity;
private float Rate;
private float TotalAmount;
private float PurchaseDate;

public int getPurchaseId() {
	return PurchaseId;
}
public void setPurchaseId(int purchaseId) {
	PurchaseId = purchaseId;
}
public int getSupplierId() {
	return SupplierId;
}
public void setSupplierId(int supplierId) {
	SupplierId = supplierId;
}
public int getMedicineId() {
	return MedicineId;
}
public void setMedicineId(int medicineId) {
	MedicineId = medicineId;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
public float getRate() {
	return Rate;
}
public void setRate(float rate) {
	Rate = rate;
}
public float getTotalAmount() {
	return TotalAmount;
}
public void setTotalAmount(float totalAmount) {
	TotalAmount = totalAmount;
}
public float getPurchaseDate() {
	return PurchaseDate;
}
public void setPurchaseDate(float purchaseDate) {
	PurchaseDate = purchaseDate;
}
public Purchase() {
	super();

}
public Purchase(int purchaseId, int supplierId, int medicineId, int quantity, float rate, float totalAmount,
		float purchaseDate) {
	super();
	PurchaseId = purchaseId;
	SupplierId = supplierId;
	MedicineId = medicineId;
	Quantity = quantity;
	Rate = rate;
	TotalAmount = totalAmount;
	PurchaseDate = purchaseDate;
}

}
