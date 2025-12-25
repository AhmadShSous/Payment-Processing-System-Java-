# Payment-Processing-System-Java-
# Payment Processing System (Java)

##  Project Overview
This project is a **Java-based payment processing system** that demonstrates core **Object-Oriented Programming (OOP)** concepts such as:

- Inheritance
- Polymorphism
- Interfaces
- Abstract classes
- Method overriding
- Comparable & sorting

The system supports multiple payment methods:
- **Cash**
- **Check** (Cashier, Certified, Personal)
- **Credit Card**

Each payment type calculates its payable amount differently and applies its own authorization rules.

---

##  Project Structure
└── src/
├── Payable.java
├── CustomerPayment.java
├── Cash.java
├── Check.java
├── CreditCard.java
└── Driver.java


##  Class Descriptions

### 1️⃣ Payable.java (Interface)
```java
public interface Payable {
    boolean isAuthorized();
}
2️⃣ CustomerPayment.java (Abstract Class)
java
Copy code
// Abstract class for all payment types
// Implements Comparable<CustomerPayment>
3️⃣ Cash.java
java
Copy code
// Extends CustomerPayment
// Applies discount rate
4️⃣ Check.java
java
Copy code
// Extends CustomerPayment
// Implements Payable
// Types: CASHIER, CERTIFIED, PERSONAL
// Authorization rules applied
5️⃣ CreditCard.java
java
Copy code
// Extends CustomerPayment
// Implements Payable
// Authorization based on expiry date
6️⃣ Driver.java
java
Copy code
// Entry point of program
// Creates payment objects
// Verifies authorization
// Sorts payments
// Prints payment info
▶️ Program Execution Flow
Create payment objects

Authorize checks and credit cards

Add valid payments to ArrayList

Sort payments using Comparable

Display payment information

 Sample Output (Conceptual)
ini
Copy code
customerName=Rania, customerId=7777, amount=600.0 payment = 600.0
customerName=Randa, customerId=9999, amount=170.0 payment = 190.0
customerName=Ahmad, customerId=4444, amount=150.0 payment = 142.5
 Key OOP Concepts Applied
Abstraction: CustomerPayment, Payable

Inheritance: Cash, Check, CreditCard

Polymorphism: Handling different payment types in one list

Encapsulation: Private fields with getters/setters

Interfaces: Enforcing authorization behavior

Technologies Used
Java SE

Java Collections Framework

OOP principles



 Notes
Suitable for academic OOP assignments

Code is structured, readable, and extendable

Additional payment methods can be added easily


