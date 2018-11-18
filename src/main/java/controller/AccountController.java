package controller;


import model.Account;
import service.AccountService;

import java.io.IOException;
import java.util.List;

public class AccountController {
    AccountService accountService;

    public AccountController() throws IOException {
        accountService = new AccountService();
    }

    public void create(Account account) throws IOException {
        accountService.save(account);
    }

    public void update(Account account) throws IOException {

        accountService.update(account);

    }

    public void delete(Long id) throws IOException {
        accountService.delete(id);
    }


    public Account getById(Long id) throws IOException {
        return accountService.getById(id);
    }


    public List<Account> getAll() throws IOException {
        return accountService.getAll();
    }

}
