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
}
