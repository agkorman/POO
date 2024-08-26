package Guias.Guia3.Ej8;

public class CellPhoneBillTester {
    public static void main(String[] args) {
        FriendCellPhoneBill b1 = new FriendCellPhoneBill("0000", 3, 50);
        b1.addFriend("1111");
        b1.addFriend("2222");
        b1.addFriend("3333");
        b1.addFriend("4444");

        b1.registerCall("1111", 100);
        System.out.println(b1.processBill()); // .5
        b1.registerCall("2222", 100);
        System.out.println(b1.processBill()); // 1
        b1.registerCall("3333", 100);
        System.out.println(b1.processBill()); // 1.5
        b1.registerCall("4444", 100);
        System.out.println(b1.processBill()); // 1.5
        b1.registerCall("3333", 100);
        System.out.println(b1.processBill()); // 2
    }
}
