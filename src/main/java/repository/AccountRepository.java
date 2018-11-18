package repository;


import model.Account;

import java.io.IOException;
import java.util.List;

public interface AccountRepository extends GenericRepository<Account, Long> {
    void save(Account account) throws IOException;

    void update(Account account) throws IOException;

    void delete(Long id) throws IOException;

    Account getById(Long id) throws IOException;

    List<Account> getAll() throws IOException;

}
