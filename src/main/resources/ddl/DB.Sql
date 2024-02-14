CREATE SCHEMA MEDICALMANAGEMENT;
CREATE TABLE MEDICALMANAGEMENT.Supplier (
 SupplierId INT PRIMARY KEY,
 SupplierName VARCHAR(255),
 ContactNumber VARCHAR(15),
 Address VARCHAR(255)
);

CREATE TABLE MEDICALMANAGEMENT.Medicine (
 MedicineId INT PRIMARY KEY,
 MedicineName VARCHAR(255),
 Rate DECIMAL(10, 2),
 Manufacturer VARCHAR(255),
 ExpiryDate DATE
);

CREATE TABLE MEDICALMANAGEMENT.Purchase (
 PurchaseId INT PRIMARY KEY,
 SupplierId INT,
 MedicineId INT,
 Quantity INT,
 Rate DECIMAL(10, 2),
 TotalAmount DECIMAL(10, 2),
 PurchaseDate DATETIME,
 FOREIGN KEY (SupplierId) REFERENCES Supplier(SupplierId),
 FOREIGN KEY (MedicineId) REFERENCES Medicine(MedicineId)
);

CREATE TABLE MEDICALMANAGEMENT.Stock (
 MedicineId INT PRIMARY KEY,
 Quantity INT,
 FOREIGN KEY (MedicineId) REFERENCES Medicine(MedicineId)
);

CREATE TABLE MEDICALMANAGEMENT.Customer (
 CustomerId INT PRIMARY KEY,
 CustomerName VARCHAR(255),
 ContactNumber VARCHAR(15)
);

CREATE TABLE MEDICALMANAGEMENT.Sale (
 SaleId INT PRIMARY KEY,
 CustomerId INT,
 MedicineId INT,
 Quantity INT,
 Rate DECIMAL(10, 2),
 TotalAmount DECIMAL(10, 2),
 SaleDate DATETIME,
 FOREIGN KEY (CustomerId) REFERENCES Customer(CustomerId),
 FOREIGN KEY (MedicineId) REFERENCES Medicine(MedicineId)
);
