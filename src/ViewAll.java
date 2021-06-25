import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewAll {

    public static String viewAdmin(){
        String s="";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from admin");
            ResultSet rs=queryStatement.executeQuery();

            while (rs.next())
            {
                s+=rs.getString(1)+"\t\t\t"+ rs.getString(2)+"\t\t\t"+
                        rs.getString(3)+"\t\t\t"+ rs.getString(4)
                        +"\t\t\t"+ rs.getString(5)+"\n\n";
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return s;
    }
    ///////////////////////////

    public static String viewRecep(){
        String s="";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from receptionist");
            ResultSet rs=queryStatement.executeQuery();

            while (rs.next())
            {
                s+=rs.getString(1)+"\t\t\t"+ rs.getString(2)+"\t\t\t"+
                        rs.getString(3)+"\t\t\t"+ rs.getString(4)
                        +"\t\t\t"+ rs.getString(5)+"\n\n";
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return s;
    }

    ///////////////////////////


    public static String viewChef(){
        String s="";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from Chef");
            ResultSet rs=queryStatement.executeQuery();

            while (rs.next())
            {
                s+=rs.getString(1)+"\t\t\t"+ rs.getString(2)+"\t\t\t"+
                        rs.getString(3)+"\t\t\t"+ rs.getString(4)
                        +"\t\t\t"+ rs.getString(5)+"\n\n";
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return s;
    }

    ///////////////////////////


    public static String viewWaiter(){
        String s="";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from Waiter");
            ResultSet rs=queryStatement.executeQuery();

            while (rs.next())
            {
                s+=rs.getString(1)+"\t\t\t"+ rs.getString(2)+"\t\t\t"+
                        rs.getString(3)+"\t\t\t"+ rs.getString(4)
                        +"\n\n";
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return s;
    }
    ///////////////////////////



    public static String viewfood(){
        String s="";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from food_items");
            ResultSet rs=queryStatement.executeQuery();

            while (rs.next())
            {
                s+=rs.getString(1)+"\t\t\t"+ rs.getString(2)+"\t\t\t"+
                        rs.getString(3)+"\n\n";
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return s;
    }
    ///////////////////////////

    public static String viewStatistics(){
        String s="";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from Statistics");
            ResultSet rs=queryStatement.executeQuery();

            while (rs.next())
            {
                s+=rs.getString(1)+"\t\t\t"+ rs.getString(2)+"\t\t\t"+
                        rs.getString(3)+"\t\t\t"+ rs.getString(4)
                        +"\n\n";
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return s;
    }
    ///////////////////////////

    public static String viewDeliman(){
        String s="";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from Delivery_Man");
            ResultSet rs=queryStatement.executeQuery();

            while (rs.next())
            {
                s+=rs.getString(1)+"\t\t\t"+ rs.getString(2)+"\t\t\t"+
                        rs.getString(3)+"\t\t\t"+ rs.getString(4)
                     +"\n\n";
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return s;
    }
    ///////////////////////////


    public static String viewDeals(){
        String s="";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from Deals");
            ResultSet rs=queryStatement.executeQuery();

            while (rs.next())
            {
                s+=rs.getString(1)+"\t\t\t"+ rs.getString(2)+"\t\t\t"+
                        rs.getString(3)+"\t\t\t"+ rs.getString(4)
                        +"\t\t\t"+ rs.getString(5)+"\n\n";
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return s;
    }
    ///////////////////////////

    public static String viewingreds(){
        String s="";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from ingredients");
            ResultSet rs=queryStatement.executeQuery();

            while (rs.next())
            {
                s+=rs.getString(1)+"\t\t\t"+ rs.getString(2)+"\n\n";
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return s;
    }
    ///////////////////////////

    public static String vieworder(){
        String s="";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from orderd");
            ResultSet rs=queryStatement.executeQuery();

            while (rs.next())
            {
                s+=rs.getString(1)+"\t\t\t"+ rs.getString(2)+"\t\t\t"+
                        rs.getString(3)+"\t\t\t"+ rs.getString(4)
                        +"\n\n";
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return s;
    }
    ///////////////////////////

    public static String viewHomedeli(){
        String s="";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from Home_Delivery");
            ResultSet rs=queryStatement.executeQuery();

            while (rs.next())
            {
                s+=rs.getString(1)+"\t\t\t"+ rs.getString(2)+"\t\t\t"+
                        rs.getString(3)+"\t\t\t"+ rs.getString(4)
                        +"\t\t\t"+ rs.getString(5)+"\n\n";
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return s;
    }
    ///////////////////////////

    public static String viewcooks(){
        String s="";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from chef_fooditems");
            ResultSet rs=queryStatement.executeQuery();

            while (rs.next())
            {
                s+=rs.getString(1)+"\t\t\t"+ rs.getString(2)+"\n\n";
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return s;
    }
    ///////////////////////////

    public static String viewdish(){
        String s="";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from fooditems_ingredients");
            ResultSet rs=queryStatement.executeQuery();

            while (rs.next())
            {
                s+=rs.getString(1)+"\t\t\t"+ rs.getString(2)+"\n\n";
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return s;
    }
    ///////////////////////////

    public static String viewFO(){
        String s="";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from fooditems_order");
            ResultSet rs=queryStatement.executeQuery();

            while (rs.next())
            {
                s+=rs.getString(1)+"\t\t\t"+ rs.getString(2)+"\n\n";
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return s;
    }
    ///////////////////////////

    public static String viewFHD(){
        String s="";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from fooditems_homeDelivery");
            ResultSet rs=queryStatement.executeQuery();

            while (rs.next())
            {
                s+=rs.getString(1)+"\t\t\t"+ rs.getString(2)+"\n\n";
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return s;
    }
    ///////////////////////////


    public static String viewfeed(){
        String s="";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from Feedback");
            ResultSet rs=queryStatement.executeQuery();

            while (rs.next())
            {
                s+=rs.getString(1)+"\t\t\t"+ rs.getString(2)+"\n\n";
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return s;
    }
    ///////////////////////////


    ///////////////////////////


    public static String viewcustomer(){
        String s="";
        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement queryStatement = connection.prepareStatement("select *" +
                    " from " +
                    "customer");
            ResultSet rs=queryStatement.executeQuery();

            while (rs.next())
            {
                s+=rs.getString(1)+"\t\t\t"+ rs.getString(2)+"\t\t\t"+
                        rs.getString(3)+"\t\t\t"+ rs.getString(4)
                        +"\t\t\t"+ rs.getString(5)+"\n\n";
            }

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return s;
    }
    ///////////////////////////
}
