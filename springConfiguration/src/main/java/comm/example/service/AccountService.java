package comm.example.service;

import java.util.List;

import comm.example.bean.Account;

public interface AccountService {

	public Account createAccount(Account account);
	public List<Account> getAllAccountDetails();
	public Account findByAccountNumber(String accountNumber);
	public List<Account> findByAmount(int amount);
	public void deleteById(String accountNumber);


}
