//Program to implement banking services
package Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import entities.Account;
import entities.Beneficiary;
import entities.customer;
import entities.Transaction;


public class BankingServiceImple implements BankingService {

	private Map<Integer, customer> customers = new HashMap<>();
	private Map<Integer, Account> accounts = new HashMap<>();
	private Map<Integer, Transaction> transactions = new HashMap<>();
	private Map<Integer, Beneficiary> beneficiaries = new HashMap<>();

	@Override
	public void addCustomer(customer customer) {
		// add Customer to customers map, Key - customerID
	}

	@Override
	public void addAccount(Account account) {
		// add Account to accounts map, Key - accountID
	}

	@Override
	public void addTransaction(Transaction transaction) {
		// add transaction to transactions map, key - transactionID
		// and based on transaction type(deposit or withdraw)update the account balance

	}

	@Override
	public void addBeneficiary(Beneficiary beneficiary) {
		// add beneficiary to beneficiaries map, key - beneficiaryID
	}

	@Override
	public customer findCustomerById(int id) {
		return customers.get(id);
	}

	@Override
	public Account findAccountById(int id) {
		return accounts.get(id);
	}

	@Override
	public Transaction findTransactionById(int id) {
		return transactions.get(id);
	}

	@Override
	public Beneficiary findBeneficiaryById(int id) {
		return beneficiaries.get(id);
	}

	@Override
	public List<Account> getAccountsByCustomerId(int customerId) {

		List<Account> result = new ArrayList<>();
		// retrieve accounts from accounts map of given customerID and add into result
		return result;
	}

	@Override
	public List<Transaction> getTransactionsByAccountId(int accountId) {
		List<Transaction> result = new ArrayList<>();
		// retrieve transactions from transactions map of given accountID and add into result
		return result;
	}

	@Override
	public List<Beneficiary> getBeneficiariesByCustomerId(int customerId) {
		List<Beneficiary> result = new ArrayList<>();
		// retrieve beneficiaries from beneficiaries map of given customerID and add into result
		return result;
	}

	@Override
	public Collection<Account> getAllAccounts() {

		return accounts.values();
	}

	@Override
	public Collection<customer> getAllCustomers() {
		return customers.values();
	}

	@Override
	public Collection<Transaction> getAllTransactions() {

		return transactions.values();
	}

	@Override
	public Collection<Beneficiary> getAllBeneficiaries() {

		return beneficiaries.values();
	}
}
