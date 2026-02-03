package classPrac;

public class Hello{
    public static void main(String[] args) {
        // bankAccount b1 = new bankAccount(300, "Adrian Reyes", "Bank of America");
        // bankAccount b2 = new bankAccount(10.4, "Carlos Reyes", "Banco Popular");
        // bankAccount b3 = new bankAccount(100000, "Alondra Ruiz", "Chase");
        // bankAccount b4 = new bankAccount(600, "Norman Gonzalez", "Wells Fargo");
        
        // bankAccount[] accounts = {b1,b2,b3,b4};

        // Bank bank1 = new Bank(accounts, "San Juan, Puerto Rico");

        // bankAccount b5 = new bankAccount();
        
        // bank1.addAccount(b5);
        // bank1.deleteAccount("Norman Gonzalez");
        // bank1.seeAccounts();

        circle c1 =  new circle(2);

        System.out.println(c1.getDiameter());
        System.out.println(c1.getRadius());

        System.out.println(c1.area());
        System.out.println(c1.perimeter());

        c1.setRadius(4);
        System.out.println(c1.getRadius());
        System.out.println(c1.getDiameter());
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}