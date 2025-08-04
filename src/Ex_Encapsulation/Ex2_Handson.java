package Ex_Encapsulation;

public class Ex2_Handson {
    public static void main(String[] args) {
        BankAcc jaysu=new BankAcc("Jaysu",90000);
        //Get original Name
        System.out.println(jaysu.getName());
        //Get Original balance
        System.out.println(jaysu.getBalance());
        //To Update the Balance
        jaysu.setBalance(8900,true);
        //To get the updated Balance
        System.out.println(jaysu.getBalance());

    }
}
class BankAcc{
    private String Name; //Instance variable, Attributes,Fields, data variables, Property,Member variables
    private long Balance; //Instance variable

    public BankAcc(String Name, long Balance) {
        this.Balance = Balance;
        this.Name = Name;
    }
        public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getBalance() {
        return Balance;
    }

    public void setBalance(long balance, boolean isCashier) {
        if(isCashier){
        Balance = balance;}
        else{
            System.out.println("You are Not allowed to update");
        }

    }
}
