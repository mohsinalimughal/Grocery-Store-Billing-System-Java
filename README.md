# 🛒 Grocery Store Billing System (Java OOP)

A streamlined, console-based billing solution engineered using **Java** and core **Object-Oriented Programming (OOP)** principles. This project demonstrates how real-world retail operations can be digitized with structured, maintainable code.

---

## 📌 Project Overview

The **Grocery Store Billing System** is designed to automate basic billing operations in small retail environments. It enables users to:

- View available inventory  
- Generate customer bills  
- Automatically update stock after purchases  

This system is intentionally lightweight, focusing on clarity, logic, and OOP implementation rather than complex UI or database integration.

---

## 🎯 Objectives

- Implement a real-world system using **Java OOP concepts**
- Reduce human error in manual billing
- Maintain and update product inventory dynamically
- Generate accurate bills with tax calculation

---

## ⚙️ Features

- 📦 Display available products  
- 🔍 Select products using ID  
- 🔢 Input purchase quantity  
- 💰 Automatic bill calculation  
- 🧾 Tax application (5%)  
- 🔄 Real-time stock updates  
- 🖨️ Receipt generation  

---

## 🧠 OOP Concepts Applied

- **Class & Object** – Structured entities like `Product` and `BillingSystem`  
- **Encapsulation** – Controlled data access using getters/setters  
- **Abstraction** – Simplified user interaction via methods  
- **Modularity** – Separate logical components for better maintainability  

---

## 🏗️ System Modules

1. **Product Module** – Handles product attributes (ID, name, price, stock)  
2. **Inventory Module** – Displays and manages available stock  
3. **Billing Module** – Calculates totals, tax, and generates receipts  
4. **User Interface Module** – Console-based interaction system  

---

## 🔄 System Flow

1. Program initializes and loads default products  
2. Displays menu options  
3. User selects action:
   - View Inventory  
   - Generate Bill  
   - Exit  
4. During billing:
   - Enter product ID  
   - Enter quantity  
   - System validates stock  
   - Updates total  
5. Final bill is generated with tax  

---

## 🛠️ Tech Stack

- **Language:** Java  
- **Paradigm:** Object-Oriented Programming  
- **IDE:** VS Code / NetBeans / IntelliJ IDEA  
- **Platform:** Console-based  

---

## 📊 Sample Output
--- Grocery Store Billing System ---

View Inventory
Generate Bill
Exit

--- Available Inventory ---
ID Name Price Stock
101 Milk 120.00 50
102 Bread 80.00 30

--- Start Billing ---
Enter Product ID: 101
Enter Quantity: 2
Added: Milk x2 = Rs 240

********** RECEIPT **********
Subtotal : Rs 240.00
Tax (5%) : Rs 12.00
Total Bill : Rs 252.00


---

## ✅ Advantages

- Simple and intuitive workflow  
- Minimizes calculation errors  
- Efficient billing process  
- Clean and maintainable codebase  
- Easily extendable architecture  

---

## ⚠️ Limitations

- No database (data is not persistent)  
- No graphical user interface  
- Basic functionality only  
- No authentication system  

---

## 🚀 Future Enhancements

- GUI integration using **Java Swing / JavaFX**  
- Database support (MySQL / Firebase)  
- User authentication system  
- Product categorization  
- Discount and offers module  
- File storage for records  

---

## 📂 Repository

🔗 https://github.com/mohsinalimughal/Grocery-Store-Billing-System-Java  

---

## 👨‍💻 Author

**Mohsin Ali Mughal**  
BSCS Student | MERN Stack Developer | Java Learner  

---

## 📜 License

This project is developed for educational purposes and is open for learning and enhancement.
