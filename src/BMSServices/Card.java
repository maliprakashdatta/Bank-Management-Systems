package BMSServices;

import BMSModel.Bank;

// id, cardNo, Account, Customer, expiry, cvv, type
public abstract class Card extends BankMain implements Bank
{
    int cid;
    int cardNo;
    int AccountNo;
    String Customer_Name;
    int cvv;
    String Cardtype;

    public void setId(int id) {
        this.cid = cid;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public void setAccountNo(int accountNo) {
        AccountNo = accountNo;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public void setCardtype(String cardtype) {
        Cardtype = cardtype;
    }

    public int getCid() {
        return cid;
    }

    public int getCardNo() {
        return cardNo;
    }

    public int getAccountNo() {
        return AccountNo;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public int getCvv() {
        return cvv;
    }

    public String getCardtype() {
        return Cardtype;
    }

}
