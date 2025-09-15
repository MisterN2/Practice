class BankAccount {
    private String owner;   // ім'я власника
    private double balance; // баланс


    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }


    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to " + owner);
    }


    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from " + owner);
        } else {
            System.out.println("Not enough money!");
        }
    }


    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "owner='" + owner + '\'' +
                ", balance=" + balance +
                '}';
    }
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Mike", 500);
        bankAccount.deposit(10);
        bankAccount.withdraw(10);
        System.out.println(bankAccount);

    }
}