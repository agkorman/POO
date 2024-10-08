package Guias.Guia3.Ej8_CellPhoneBill;

import Guias.Guia4.Ej9_CellPhoneBillExceptions.TooManyFriendsException;
import Guias.Guia4.Ej9_CellPhoneBillExceptions.FriendNotFoundException;
import Guias.Guia4.Ej9_CellPhoneBillExceptions.FriendAlreadyExistsException;


public class FriendCellPhoneBill extends CellPhoneBill{

    private String[] friends;
    private int maxFriends;
    int friendIndex;
    private double discount;

    public FriendCellPhoneBill(String number, int maxFriends, double discount) {
        super(number);
        this.friends = new String[maxFriends];
        this.maxFriends = maxFriends;
        this.discount = discount;
    }

    public void setDiscount(double discount) {
        if (discount >= 0 && discount <= 100) {
            this.discount = discount;
        }
    }

    public void addFriend(String number) throws FriendAlreadyExistsException,
            TooManyFriendsException{
        if (friendIndex == maxFriends) {
            throw new TooManyFriendsException(number);
        }
        if (isFriend(number)) {
            throw new FriendAlreadyExistsException(number);
        }
        friends[friendIndex++] = number;
    }

    public void removeFriend(String number) throws FriendNotFoundException{
        boolean found = false;
        for (int i = 0; i < friendIndex && !found; i++) {
            if (friends[i].compareTo(number) == 0) {
                friends[i] = friends[--friendIndex];
                found = true;
            }
        }
        if (!found) {
            throw new FriendNotFoundException(number);
        }
    }

    private boolean isFriend(String number) {
        for (int i = 0; i < friendIndex; i++) {
            if (friends[i].compareTo(number) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double processBill() {
        double bill = 0;
        for (int i = 0; i < callsIndex; i++) {
            bill += calls[i].getCost() * (isFriend(calls[i].getTo()) ? (1 - discount/100.0) : 1);
        }
        return bill;
    }
}
