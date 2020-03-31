package Diag2020FRE.Diag2020FRE2;

public class Diag2020FRE2_Driver {
    public static void main(String[] args) {
        Cruise cr = new Cruise(78, 4000);

        cr.setPrice(5000);
        cr.checkResponse("world cruise");
        System.out.println(cr.getSignups());
        cr.checkResponse("ship trip");
        System.out.println(cr.getSignups());

        cr = new Cruise(200, 2000);
        System.out.println(cr.calculateRevenue());
        cr = new Cruise(397, 6000);
        System.out.println(cr.calculateRevenue());
    }
}
