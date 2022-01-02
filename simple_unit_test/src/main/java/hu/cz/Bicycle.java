package hu.cz;

public class Bicycle {

    DbConnection dbConn;

    public Bicycle(DbConnection dbConn) {
        this.dbConn = dbConn;
    }

    public Integer sum(String user, String pass, int a, int b, int c) {
        boolean check = dbConn.checkUserPass(user, pass);
        if (check) {
            return a + b + c;
        }
        return null;
    }
}
