import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl  implements AtmOperationInterf{
    ATM atm = new ATM();
    Map<Double,String> ministmt=new HashMap<>();
    @Override
    public void viewBlance() {
        System.out.println("Available Balance is : " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount%500==0) {
            if (withdrawAmount <= atm.getBalance()) {
                ministmt.put(withdrawAmount, " Amount withdrawn");
                System.out.println("Collect the Cash" + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBlance();
            } else {
                System.out.println("Insufficient Balance !!");
            }
        }
        else {
            System.out.println("Please enter the amount of multiple of 500 ");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount," Amount deposited");
        System.out.println(depositAmount+" Deposited Successfully");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBlance();
    }

    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double,String> m:ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }

    }
}
