package oopsWeek1;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {
        kidUsers kd1 = new kidUsers(10, "Kids");
        kidUsers kd2 = new kidUsers(18, "Fiction");
        adultUsers ad1 = new adultUsers(5, "Kids");
        adultUsers ad2 = new adultUsers(23, "Fiction");

        kd1.registerAccount();
        kd2.registerAccount();
        kd1.requestBook();
        kd2.requestBook();
        ad1.registerAccount();
        ad1.registerAccount();
        ad1.requestBook();
        ad2.requestBook();

    }

}
