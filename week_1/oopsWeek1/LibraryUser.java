package oopsWeek1;

public interface LibraryUser {
    void registerAccount();

    void requestBook();
}

class kidUsers implements LibraryUser {
    int age;
    String bookType;

    kidUsers(int age, String bookType) {
        this.bookType = bookType;
        this.age = age;
    }

    @Override

    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override

    public void requestBook() {
        if (bookType.equals("Kids")) {
            System.out.println("Book Issued successfully, please return the book \n" +
                    "within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

class adultUsers implements LibraryUser {
    int age;
    String bookType;

    adultUsers(int age, String bookType) {
        this.bookType = bookType;
        this.age = age;
    }

    @Override

    public void registerAccount() {
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override

    public void requestBook() {
        if (bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book \n" +
                    "within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only Adult books");
        }
    }
}
