package day_9;

import static java.lang.Thread.currentThread;

public class WithdrawJob implements Runnable {
    Account acc = new Account(10000);
    // Creating an object of Account, setting initial balance to 1000
    public void withdraw(int amount){ // synchronized thread makes sure that only one thread can withdraw at a time
        if(acc.getBalance() >= amount){ // checks if balance is enough
            System.out.println(currentThread().getName() + "  is ready to withdraw");
            System.out.println(currentThread().getName() + "  is sleeping");
            try{
                Thread.sleep(2000); // waits for 2 seconds
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(currentThread().getName() + " wakes up");
            acc.withdraw(amount);
            System.out.println(currentThread().getName()+" withdraw successfully");
            System.out.println("Balance: "+acc.getBalance());
        }
        else
            System.out.println(currentThread().getName() + " doesn't have enough balance");
    }

    @Override
    public void run(){
        for (int i=0; i<3; i++){
            withdraw(2000);
        }
    }


}
