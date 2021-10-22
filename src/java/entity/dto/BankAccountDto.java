/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.dto;

/**
 *
 * @author Admin
 */
public class BankAccountDto {

    public int id;
    public String bankName;
    public String bankNameShort;
    public String bankAccount;
    public String owner;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankNameShort() {
        return bankNameShort;
    }

    public void setBankNameShort(String bankNameShort) {
        this.bankNameShort = bankNameShort;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

}
