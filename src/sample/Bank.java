package sample;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    public String bank_name;
    public List<Account> list_of_acc_in_bank=new ArrayList<Account>();
    public List<Client> list_of_clients=new ArrayList<Client>();

    public Bank(String bank_name) {
        this.bank_name = bank_name;
    }

    public Bank(Bank bank) {
        this.bank_name = bank.bank_name;
        this.list_of_acc_in_bank=bank.list_of_acc_in_bank;
    }

    public String getBank_name() {
        return bank_name;
    }

    public List<Account> getList_of_acc_in_bank() {
        return list_of_acc_in_bank;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public void setList_of_acc_in_bank(List<Account> list_of_acc_in_bank) {
        this.list_of_acc_in_bank = list_of_acc_in_bank;
    }

    public List<Client> getList_of_clients() {
        return list_of_clients;
    }

    public void setList_of_clients(List<Client> list_of_clients) {
        this.list_of_clients = list_of_clients;
    }

    public void add_account(Account account){
        list_of_acc_in_bank.add(account);
    }

    public void delete_accont(Account account){
        list_of_acc_in_bank.remove(account);
    }

    public void add_client(Client client){
        list_of_clients.add(client);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bank_name='" + bank_name + '\'' +
                ", list_of_acc_in_bank=" + list_of_acc_in_bank +
                ", list_of_clients=" + list_of_clients +
                '}';
    }
}
