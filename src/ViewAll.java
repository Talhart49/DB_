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
}
