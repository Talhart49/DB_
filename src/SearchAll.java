import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchAll {

    public static String searchAdmin(String id) {
        String s = "";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from admin where admin_id=?");
            queryStatement.setString(1, id);
            ResultSet rs = queryStatement.executeQuery();

            while (rs.next()) {
                s += rs.getString(1) + "\t" + rs.getString(2) + "\t" +
                        rs.getString(3) + "\t" + rs.getString(4) +"\t" + rs.getString(5) + "\n\n";
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }


    //////////////////////////////////

    public static String searchrecep(String id) {
        String s = "";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from Receptionist where receptionist_id=?");
            queryStatement.setString(1, id);
            ResultSet rs = queryStatement.executeQuery();

            while (rs.next()) {
                s += rs.getString(1) + "\t" + rs.getString(2) + "\t" +
                        rs.getString(3) + "\t" + rs.getString(4) +"\t" + rs.getString(5) + "\n\n";
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }


    //////////////////////////////////

    public static String searchWaiter(String id) {
        String s = "";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from Waiter where Waiter_id=?");
            queryStatement.setString(1, id);
            ResultSet rs = queryStatement.executeQuery();

            while (rs.next()) {
                s += rs.getString(1) + "\t" + rs.getString(2) + "\t" +
                        rs.getString(3) + "\t" + rs.getString(4)  + "\n\n";
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }


    //////////////////////////////////

    public static String searchDeliman(String id) {
        String s = "";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from Delivery_Man where DeliveryMan_id=?");
            queryStatement.setString(1, id);
            ResultSet rs = queryStatement.executeQuery();

            while (rs.next()) {
                s += rs.getString(1) + "\t" + rs.getString(2) + "\t" +
                        rs.getString(3) + "\t" + rs.getString(4) + "\n\n";
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }


    //////////////////////////////////

    public static String searchChef(String id) {
        String s = "";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from Chef where chef_id=?");
            queryStatement.setString(1, id);
            ResultSet rs = queryStatement.executeQuery();

            while (rs.next()) {
                s += rs.getString(1) + "\t" + rs.getString(2) + "\t" +
                        rs.getString(3) + "\t" + rs.getString(4) +"\t" + rs.getString(5) + "\n\n";
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }


    //////////////////////////////////

    public static String searchDeals(String id) {
        String s = "";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from Deals where Deals_id=?");
            queryStatement.setString(1, id);
            ResultSet rs = queryStatement.executeQuery();

            while (rs.next()) {
                s += rs.getString(1) + "\t" + rs.getString(2) + "\t" +
                        rs.getString(3) + "\t" + rs.getString(4) +"\t" + rs.getString(5) + "\n\n";
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }


    //////////////////////////////////

    public static String searchstats(String id) {
        String s = "";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from statistics where stats_id=?");
            queryStatement.setString(1, id);
            ResultSet rs = queryStatement.executeQuery();

            while (rs.next()) {
                s += rs.getString(1) + "\t" + rs.getString(2) + "\t" +
                        rs.getString(3) + "\t" + rs.getString(4) + "\n\n";
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }


    //////////////////////////////////

    public static String searchfood(String id) {
        String s = "";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from food_items where food_id=?");
            queryStatement.setString(1, id);
            ResultSet rs = queryStatement.executeQuery();

            while (rs.next()) {
                s += rs.getString(1) + "\t" + rs.getString(2) + "\t" +
                        rs.getString(3) + "\n\n";
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }


    //////////////////////////////////

    public static String searchingred(String id) {
        String s = "";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from ingredients where ingredient_id=?");
            queryStatement.setString(1, id);
            ResultSet rs = queryStatement.executeQuery();

            while (rs.next()) {
                s += rs.getString(1) + "\t" + rs.getString(2) +
                        "\n\n";
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }


    //////////////////////////////////


}

