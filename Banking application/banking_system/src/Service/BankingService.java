//Program to define an interface to provide Banking services
package Service;

import java.util.Collection;
import java.util.List;

import entities.Account;
import entities.Beneficiary;
import entities.customer;
import entities.Transaction;

public interface BankingService {
  void addCustomer(customer customer);
  void addAccount(Account account);
  void addTransaction(Transaction transaction);
  void addBeneficiary(Beneficiary beneficiary);

  customer findCustomerById(int id);
  Account findAccountById(int id);
  Transaction findTransactionById(int id);
  Beneficiary findBeneficiaryById(int id);

  Collection<Account> getAllAccounts();
  Collection<customer> getAllCustomers();
  Collection<Transaction> getAllTransactions();
  Collection<Beneficiary> getAllBeneficiaries();
  
  List<Account> getAccountsByCustomerId(int customerId);
  List<Transaction> getTransactionsByAccountId(int accountId);
  List<Beneficiary> getBeneficiariesByCustomerId(int customerId);
}
