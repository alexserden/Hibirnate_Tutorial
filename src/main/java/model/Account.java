package model;

import javax.persistence.Column;

public class Account extends BaseEntity {

    @Column(name = "account")
    private String accountData;

    public Account(Long id, String accountData) {
        super(id);
        this.accountData = accountData;
    }

    public String getAccountData() {
        return accountData;
    }

    public void setAccountData(String accountData) {
        this.accountData = accountData;
    }
}
