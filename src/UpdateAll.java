import java.sql.*;

public class UpdateAll {
    public static boolean updateAdmin(int id,String Email) throws SQLException {
        boolean found=false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from admin where Admin_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found=true; } }
        catch (Exception e)
        { System.out.println(e); }
        if (found){
            if (Email.contains("@") && Email.contains(".com") && Email.length()<30){
                String query = "update Admin SET email = ? where admin_id = ?";
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString (1, Email);
                preparedStmt.setInt (2, id);
                preparedStmt.executeUpdate();
                System.out.println(id); }
            else { return false; }
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) throws SQLException {
        updateAdmin(0,"@.com");
    }
    }

