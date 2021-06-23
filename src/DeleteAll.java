import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteAll {

    public static boolean deleteAdmin(int id) throws SQLException {
    boolean found=false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from admin where Admin_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if (found){
            String query = " delete from Admin where admin_id=?";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString (1, String.valueOf(id));
            preparedStmt.executeUpdate();
            System.out.println(id);
            return true;
        }
        else {
            return false;
        }
    }

    /////////////////////////////////


    public static boolean deletechef(int id) throws SQLException {
        boolean found=false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from chef where chef_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if (found){
            String query = " delete from chef where chef_id=?";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString (1, String.valueOf(id));
            preparedStmt.executeUpdate();
            System.out.println(id);
            return true;
        }
        else {
            return false;
        }
    }

    /////////////////////////////////

    public static boolean deleterecep(int id) throws SQLException {
        boolean found=false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from receptionist where receptionist_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if (found){
            String query = " delete from receptionist where receptionist_id=?";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString (1, String.valueOf(id));
            preparedStmt.executeUpdate();
            return true;
        }
        else {
            return false;
        }
    }

    /////////////////////////////////

    public static boolean deletewaiter(int id) throws SQLException {
        boolean found=false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from waiter where waiter_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if (found){
            String query = " delete from waiter where waiter_id=?";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString (1, String.valueOf(id));
            preparedStmt.executeUpdate();
            return true;
        }
        else {
            return false;
        }
    }

    /////////////////////////////////


    public static boolean deletedeliman(int id) throws SQLException {
        boolean found=false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from delivery_man where deliveryman_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if (found){
            String query = " delete from deliveryman where deliveryman_id =?";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString (1, String.valueOf(id));
            preparedStmt.executeUpdate();
            return true;
        }
        else {
            return false;
        }
    }

    /////////////////////////////////



    public static boolean deleteingred(int id) throws SQLException {
        boolean found=false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from ingredients where ingredient_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if (found){
            String query = " delete from ingredients where ingredient_id =?";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString (1, String.valueOf(id));
            preparedStmt.executeUpdate();
            return true;
        }
        else {
            return false;
        }
    }

    /////////////////////////////////


    public static boolean deletefood(int id) throws SQLException {
        boolean found=false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from food_item where food_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if (found){
            String query = " delete from food_items where food_id =?";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString (1, String.valueOf(id));
            preparedStmt.executeUpdate();
            return true;
        }
        else {
            return false;
        }
    }

    /////////////////////////////////


    public static boolean deletecustomer(int id) throws SQLException {
        boolean found=false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from customer where customer_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if (found){
            String query = " delete from customer where customer_id =?";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString (1, String.valueOf(id));
            preparedStmt.executeUpdate();
            return true;
        }
        else {
            return false;
        }
    }

    /////////////////////////////////

    public static boolean deletefeedback(int id) throws SQLException {
        boolean found=false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from Feedback where feedback_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if (found){
            String query = " delete from Feedback where feedback_id =?";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString (1, String.valueOf(id));
            preparedStmt.executeUpdate();
            return true;
        }
        else {
            return false;
        }
    }
    /////////////////////////////////

    public static boolean deletestats(int id) throws SQLException {
        boolean found=false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from statistics where stats_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if (found){
            String query = " delete from Statistics where stats_id =?";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString (1, String.valueOf(id));
            preparedStmt.executeUpdate();
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean deletedeals(int id) throws SQLException {
        boolean found=false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from deals where deals_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if (found){
            String query = " delete from deals where deals_id =?";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString (1, String.valueOf(id));
            preparedStmt.executeUpdate();
            return true;
        }
        else {
            return false;
        }
    }

    /////////////////////////////////


    public static boolean deleteorderd(int id) throws SQLException {
        boolean found=false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from orderd where order_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if (found){
            String query = " delete from orderd where order_id =?";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString (1, String.valueOf(id));
            preparedStmt.executeUpdate();
            return true;
        }
        else {
            return false;
        }
    }

    /////////////////////////////////


    public static boolean deletehomedeli(int id) throws SQLException {
        boolean found=false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from Home_Delivery where delivery_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if (found){
            String query = " delete from Home_Delivery where delivery_id =?";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString (1, String.valueOf(id));
            preparedStmt.executeUpdate();
            return true;
        }
        else {
            return false;
        }
    }

    /////////////////////////////////

}
