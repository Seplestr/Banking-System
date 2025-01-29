# Banking System Application

A console-based Java application demonstrating core banking operations with proper exception handling and OOP principles.

## Features
- **Account Management**
  - Create accounts with initial balance
  - Secure balance encapsulation
  - Account number verification
- **Transaction Operations**
  - Deposit funds with validation
  - Withdraw funds with overdraft protection
  - Check current balance
- **Error Handling**
  - Invalid amount detection
  - Insufficient funds prevention
  - Input validation

## Prerequisites
- Java JDK 8 or higher
- Maven/Gradle (optional)
- IntelliJ IDEA/Microsoft VSC

## Installation

To set up and run the banking system application, follow these steps:

### Clone the Repository
First, clone the repository using the following command:

1. Clone the repository:
    - git clone https://github.com/yourusername/banking-system.git
    - cd banking-system

2. Compile the source files:
    - javac BankingSystem.java

3. Run the application:
    - java BankingSystem

## Usage
**Choose an option:**
  - Deposit
  - Withdraw
  - Check Balance
  - Exit

## Example Session
1. **Deposit ₹5000**
   - Choose option 1
   - Enter deposit amount: 5000
   - Output: Deposited: ₹5000.00

2. **Check Balance**
   - Choose option 3
   - Output: Current balance: ₹15000.00

3. **Exit**
   - Choose option 4
   - Output: Thank you for using the Banking System!
