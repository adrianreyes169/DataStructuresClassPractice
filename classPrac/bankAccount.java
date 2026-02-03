package classPrac;
public class bankAccount {
    private double balance;
    private String owner;
    private String bankName;
    
    public bankAccount(double balance, String owner, String bankName){
        this.balance = balance;
        this.owner = owner;
        this.bankName = bankName;
    }

    public bankAccount(){
        this.balance = 0;
        this.owner ="John Doe";
        this.bankName = "Unknown";
    }

    public double getBalance(){return this.balance;}
    public String getOwner(){return this.owner;}
    public String getBankName(){return this.bankName;}

    public void setBalance(double amount){this.balance = amount;}
    public void setOwner(String name){this.owner = name;}
    public void setBankName (String newBank){this.bankName = newBank;}

    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Cannot deposit 0 or negative numbers");
            return;
        }else{
            this.setBalance(this.getBalance() + amount);
            System.out.println("Succesful deposit of: $" + amount);
        }
    }

    public void withdraw(double amount){
        if (amount <= 0){
            System.out.println("Cannot withdraw 0 or negative numbers");
            return;
        }else if (amount > this.getBalance()) {
            System.out.println("Cannot withdraw amount greater than the one in the account");
        }else{
            this.setBalance(this.getBalance() - amount);
            System.out.println("Succesful withdrawal of: $" + amount);
        }
    }

    public void display(){
        System.out.println("Name: " + this.getOwner());
        System.out.println("Bank: " + this.getBankName());
        System.out.println("Balance: $" + this.getBalance());
    }
}
