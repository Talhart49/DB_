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
                System.out.println("1");
                found=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if (found){
            System.out.println("2");
            if (Email.contains("@") && Email.contains(".com") && Email.length()<30){
                System.out.println("3");
                String query = "update Admin SET email = ? where admin_id = ?";
                System.out.println("4");
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                System.out.println("5");

                preparedStmt.setString (1, Email);
                preparedStmt.setInt (2, id);
                System.out.println("6");
                preparedStmt.executeQuery();
                System.out.println("7");
                System.out.println(id);
            }
            else {
                return false;
            }

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

