package service;

import model.Account;
import repository.AccountRepository;

import java.io.IOException;
import java.util.List;

public class AccountService {
    AccountRepository accountRepository;

    public AccountService() throws IOException {
       // accountRepository = new JavaIOAccountRepositoryImpl();
    }

    public void save(Account account) throws IOException {
        accountRepository.save(account);
    }

    public void update(Account account) throws IOException {

        accountRepository.update(account);

    }

    public void delete(Long id) throws IOException {
        accountRepository.delete(id);
    }


    public Account getById(Long id) throws IOException {
        return accountRepository.getById(id);
    }


    public List<Account> getAll() throws IOException {
        return accountRepository.getAll();
    }
}
