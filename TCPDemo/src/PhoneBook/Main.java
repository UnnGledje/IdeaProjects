package PhoneBook;

public class Main {

    public static void main(String[] args) {

        DAO d = new DAO();
        System.out.println(d.getKompis("Oscar"));
    }
}
