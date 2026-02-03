package classPrac;
import java.util.Arrays;

public class Bank {
    private bankAccount[] accounts;
    private String location;

    public Bank(bankAccount[] accounts, String location){
        this.accounts = accounts;
        this.location = location;
    }

    public Bank(){
        this.accounts = new bankAccount[0];
        this.location = "Minnesota";
    }

    public bankAccount[] getAccounts(){return accounts;}
    public String getLocation(){return location;}

    public void setLocation(String newLocation){this.location = newLocation;}

    public void addAccount(bankAccount newAcc){
        bankAccount[] newArr = Arrays.copyOf(accounts, accounts.length + 1);
        newArr[accounts.length] = newAcc;
        this.accounts = newArr;
    }

    public void deleteAccount(String accountOwner){
        int indexToRemove = -1;
        for(int i = 0; i < accounts.length; i++){
            if (accounts[i].getOwner().toLowerCase().equals(accountOwner.toLowerCase())){
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove == -1){
            System.out.println("Account owned by " + accountOwner + " not found.");
            return;
        }

        bankAccount[]newArray = new bankAccount[accounts.length-1];

        System.arraycopy(accounts,0, newArray,0, indexToRemove);
        System.arraycopy(accounts, indexToRemove + 1, newArray, indexToRemove, accounts.length - indexToRemove - 1);
        accounts = newArray;
    }

    public void seeAccounts(){
        for (bankAccount bankAccount : accounts) {
            bankAccount.display();
            System.out.println();
        }
    }
}

