package Bai8;

public class BankAccount {
    String accountNumber; // Số tài khoản (kiểu String).
    String accountHolder; //  Tên chủ tài khoản (kiểu String).
    double balance; // Số dư tài khoản (kiểu double).

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // deposit(double amount): Phương thức này sẽ nạp tiền vào tài khoản. Nếu số tiền nạp hợp lệ (lớn hơn 0), số dư tài khoản sẽ được tăng lên.
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
       this.balance = this.balance + amount;
        System.out.println(balance);
    }

    // withdraw(double amount): Phương thức này sẽ rút tiền từ tài khoản. Nếu số tiền rút lớn hơn số dư hiện tại, hiển thị thông báo lỗi "Số dư không đủ". Ngược lại thì tiến hành trừ tiền trong tài khoản.
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return ;
        }
        balance = balance - amount;
    }

    // transfer(BankAccount recipient, double amount): Phương thức này cho phép chuyển tiền từ tài khoản hiện tại sang tài khoản khác. Kiểm tra xem số dư của tài khoản có đủ không, nếu đủ sẽ thực hiện chuyển tiền,
    // nếu không thì hiển thị thông báo lỗi.
    public void transfer(BankAccount destination, double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return ;
        }
        balance = balance - amount;
        destination.deposit(amount);
    }

    // display(): Hiển thị thông tin tài khoản, bao gồm số tài khoản, tên chủ tài khoản và số dư hiện tại.
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("1000", "Tran", 1000);
        BankAccount bankAccount2 = new BankAccount("2000", "A", 1000);

        bankAccount1.deposit(500);

        bankAccount1.withdraw(500);
        bankAccount1.transfer(bankAccount2, 500);
        bankAccount1.display();
        bankAccount2.display();
    }

}
