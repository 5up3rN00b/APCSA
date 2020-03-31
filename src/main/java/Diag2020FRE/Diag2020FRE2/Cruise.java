package Diag2020FRE.Diag2020FRE2;

public class Cruise {
    private int signups;
    private int price;

    public Cruise(int s, int p) {
        signups = s;
        price = p;
    }

    public int getSignups() {
        return signups;
    }

    public void setPrice(int p) {
        price = p;
    }

    public void checkResponse(String resp) {
        if (resp.indexOf("cruise") != -1) {
            signups++;
        }
    }

    public int calculateRevenue() {
        if (signups >= 200 && signups <= 300) {
            return signups * (price - 350);
        } else if (signups > 300) {
            return signups * (price - 500);
        } else {
            return signups * price;
        }
    }
}
