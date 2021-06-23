import java.sql.*;

public class UpdateAll {
    public static boolean updateAdmin(int id, String Email) throws SQLException {
        boolean found = false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from admin where Admin_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (found) {
            if (Email.contains("@") && Email.contains(".com") && Email.length() < 30) {

                String query = "update Admin " + " SET  email = ?" + " where admin_id = ? ";
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, Email);
                preparedStmt.setInt(2, id);
                preparedStmt.executeUpdate();

            } else {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    /////////////////////////////////


    public static boolean updaterecep(int id, String number) throws SQLException {
        boolean found = false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from receptionist where receptionist_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (found) {
            int count2 = 0;
            for (int i = 0; i < number.length(); i++) {
                if (Character.isAlphabetic(number.charAt(i))) {
                    count2++;
                }
            }
            if (count2 == 0 && number.length() == 11) {


                String query = "update receptionist " + " SET  contact_no = ?" + " where receptionist_id = ? ";
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, number);
                preparedStmt.setInt(2, id);
                preparedStmt.executeUpdate();
                return true;
            } else {
                return false;
            }
        }
        else return false;
    }

    /////////////////////////////////


    public static boolean updatedeliman(int id, String number) throws SQLException {
        boolean found = false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from Delivery_Man where deliveryMan_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (found) {
            int count2 = 0;
            for (int i = 0; i < number.length(); i++) {
                if (Character.isAlphabetic(number.charAt(i))) {
                    count2++;
                }
            }
            if (count2 == 0 && number.length() == 11) {


                String query = "update Delivery_Man " + " SET  contact_no = ?" + " where DeliveryMan_id = ? ";
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, number);
                preparedStmt.setInt(2, id);
                preparedStmt.executeUpdate();
                return true;
            } else {
                return false;
            }
        }
        else return false;
    }

    /////////////////////////////////

    public static boolean updatechef(int id, String number) throws SQLException {
        boolean found = false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from Chef where chef_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (found) {
            int count2 = 0;
            for (int i = 0; i < number.length(); i++) {
                if (Character.isAlphabetic(number.charAt(i))) {
                    count2++;
                }
            }
            if (count2 == 0 && number.length() == 11) {


                String query = "update Chef " + " SET  contact_no = ?" + " where Chef_id = ? ";
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, number);
                preparedStmt.setInt(2, id);
                preparedStmt.executeUpdate();
                return true;
            } else {
                return false;
            }
        }
        else return false;
    }

    /////////////////////////////////


    public static boolean updatewaiter(int id, String number) throws SQLException {
        boolean found = false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from waiter where waiter_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (found) {
            int count2 = 0;
            for (int i = 0; i < number.length(); i++) {
                if (Character.isAlphabetic(number.charAt(i))) {
                    count2++;
                }
            }
            if (count2 == 0 && number.length() == 11) {


                String query = "update waiter " + " SET  contact_no = ?" + " where waiter_id = ? ";
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, number);
                preparedStmt.setInt(2, id);
                preparedStmt.executeUpdate();
                return true;
            } else {
                return false;
            }
        }
        else return false;
    }

    /////////////////////////////////

    public static boolean updateingreds(int id, String name) throws SQLException {
        boolean found = false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from ingredients where ingredient_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (found) {
            int count2 = 0;
            for (int i = 0; i < name.length(); i++) {
                if (Character.isDigit(name.charAt(i))) {
                    count2++;
                }
            }
            if (count2 == 0 && name.length() < 30) {


                String query = "update ingredients " + " SET  name = ?" + " where ingredient_id = ? ";
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, name);
                preparedStmt.setInt(2, id);
                preparedStmt.executeUpdate();
                return true;
            } else {
                return false;
            }
        }
        else return false;
    }

    /////////////////////////////////


    public static boolean updatefood(int id, String name) throws SQLException {
        boolean found = false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from food_items where food_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (found) {
            int count2 = 0;
            for (int i = 0; i < name.length(); i++) {
                if (Character.isDigit(name.charAt(i))) {
                    count2++;
                }
            }
            if (count2 == 0 && name.length() < 30) {


                String query = "update food_items " + " SET  food_name = ?" + " where food_id = ? ";
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, name);
                preparedStmt.setInt(2, id);
                preparedStmt.executeUpdate();
                return true;
            } else {
                return false;
            }
        }
        else return false;
    }

    /////////////////////////////////

    public static boolean updatedeal(int id, String name) throws SQLException {
        boolean found = false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from Deals where deals_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (found) {
            int count2 = 0;
            for (int i = 0; i < name.length(); i++) {
                if (Character.isDigit(name.charAt(i))) {
                    count2++;
                }
            }
            if (count2 == 0 && name.length() < 30) {


                String query = "update Deals " + " SET  Deals_name = ?" + " where Deals_id = ? ";
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setString(1, name);
                preparedStmt.setInt(2, id);
                preparedStmt.executeUpdate();
                return true;
            } else {
                return false;
            }
        }
        else return false;
    }

    /////////////////////////////////



    public static boolean updatestats(int id, int soldamount) throws SQLException {
        boolean found = false;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from statistics where stats_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() != 0) {
                found = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        if (found) {

            if (soldamount > 0) {


                String query = "update statistics " + " SET  sold_amount = ?" + " where stats_id = ? ";
                PreparedStatement preparedStmt = connection.prepareStatement(query);
                preparedStmt.setInt(1, soldamount);
                preparedStmt.setInt(2, id);
                preparedStmt.executeUpdate();
                return true;
            } else {
                return false;
            }
        }
        else return false;
    }

    /////////////////////////////////

        public static void main (String[]args) throws SQLException {
//            updateAdmin(0, "@.com");
        }
    }


