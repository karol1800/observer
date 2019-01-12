package sample;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String owner_name;
    private String owner_surname;
    public long acc_number;
    public List<Card>card_assigned_to_account= new ArrayList<Card>();

    public Account(String owner_name, String owner_surname, int acc_number) {
        this.owner_name = owner_name;
        this.owner_surname = owner_surname;
        this.acc_number = acc_number;
    }

    public Account(Account account) {
        this.owner_name = account.owner_name;
        this.owner_surname = account.owner_surname;
        this.acc_number = account.acc_number;
        this.card_assigned_to_account = account.card_assigned_to_account;
    }

    public Account(){}

    public String getOwner_name() {
        return owner_name;
    }

    public String getOwner_surname() {
        return owner_surname;
    }

    public long getAcc_number() {
        return acc_number;
    }

    public List<Card> getCard_assigned_to_account() {
        return card_assigned_to_account;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public void setOwner_surname(String owner_surname) {
        this.owner_surname = owner_surname;
    }

    public void setAcc_number(long acc_number) {
        this.acc_number = acc_number;
    }

    public void setCard_assigned_to_account(List<Card> card_assigned_to_account) {
        this.card_assigned_to_account = card_assigned_to_account;
    }

    public void add_card(Card card){
        card_assigned_to_account.add(card);
    }

    public void delete_card(Card card){
        card_assigned_to_account.remove(card);
    }

    public boolean contain_card(Card card){
        return card_assigned_to_account.contains(card);
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner_name='" + owner_name + '\'' +
                ", owner_surname='" + owner_surname + '\'' +
                ", acc_number=" + acc_number +
                ", card_assigned_to_account=" + card_assigned_to_account +
                '}';
    }
}
