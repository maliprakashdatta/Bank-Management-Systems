package BMSServices;

import BMSModel.Bank;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args)
    {
//        System.out.println("Please enter name of employee:");
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();

        System.out.println("----------Customer Registration Form-------------");
        System.out.println("Please enter ID:-");
        Scanner id1= new Scanner(System.in);
        int id = id1.nextInt();
        //System.out.println("Customer Id is:-"+id);

        System.out.println(" Enter the Firstname:-");
        Scanner fn= new Scanner(System.in);
        String Firstname= fn.nextLine();
       // System.out.println("Customer Firstname is:-"+Firstname);

        System.out.println(" Enter the   Lastname:-");
        Scanner ln= new Scanner(System.in);
        String Lastname= ln.nextLine();
        //System.out.println("Customer Lastname is:-"+Lastname);

        System.out.println(" Enter the   Gender:-");
        Scanner gender= new Scanner(System.in);
        String Gender= gender.nextLine();
        //System.out.println("Customer Gender is:-"+Gender);

        System.out.println(" Enter the   DOB:-");
        Scanner dob= new Scanner(System.in);
        long DOB= dob.nextLong();
        //System.out.println("Customer Gender is:-"+DOB);

        System.out.println(" Enter the   Address:-");
        Scanner address= new Scanner(System.in);
        String Address= address.nextLine();
        //System.out.println("Customer Address is:-"+Address);

        System.out.println(" Enter the   emaild:-");
        Scanner email= new Scanner(System.in);
        String emaild= email.nextLine();
        //System.out.println("Customer Address is:-"+emaild);

        System.out.println(" Enter the   idcard:-");
        Scanner idc= new Scanner(System.in);
        int  idcard= idc.nextInt();
        //System.out.println("Customer Address is:-"+idcard);
        System.out.println("----Customer Details-------------");
        System.out.println("Customer Id is:-"+id);
         System.out.println("Customer Firstname is:-"+Firstname);
        System.out.println("Customer Lastname is:-"+Lastname);
        System.out.println("Customer Gender is:-"+Gender);
        System.out.println("Customer DOB is:-"+DOB);
        System.out.println("Customer Address is:-"+Address);
        System.out.println("Customer EmailID is:-"+emaild);
        System.out.println("Customer IdCard is:-"+idcard);

        //System.out.println("["+"Customer Id "+id+" Customer Firstname "+Firstname+" Customer Lastname "+Lastname+" Customer Gender "+Gender+" Customer Address "+Address+" Customer emaild "+ emaild+" Customer idcard "+idcard+"]");


//        RegisterCustomer registerCustomer=new RegisterCustomer();
//        registerCustomer.getId();
//        registerCustomer.getFirstname();
//        registerCustomer.getLastname();
//        registerCustomer.getGender();
//        registerCustomer.getDOB();
//        registerCustomer.getAddress();
//        registerCustomer.getEmaild();
//        registerCustomer.getIdcard();


//        EnterAccountDetails enterAccountDetails=new EnterAccountDetails();
//        enterAccountDetails.openAccount();
//        enterAccountDetails.showAccount();
//
//        MoneyDeposit moneyDeposit=new MoneyDeposit();
//        moneyDeposit.deposit();
//
//        MoneyWithdraw moneyWithdraw=new MoneyWithdraw();
//        moneyWithdraw.withdrawal();


    }

}
