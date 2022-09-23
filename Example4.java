package Encapsulation;

public class Example4 {

    public static void main(String[] args) {
        Example3 obj = new Example3();
        obj.setAcc_no(101202303);
        obj.setName("ABC DEF");
        obj.setEmail("a@b.com");
        obj.setAmount(60000);

        System.out.println(obj.getAcc_no() + " " + obj.getName() + " " + obj.getEmail() + " " + obj.getAmount());
    }
}
