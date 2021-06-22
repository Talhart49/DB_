import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class AddAll {

    public static boolean AddAdmin(int id,String name,String cnic,String email,String password) throws SQLException {
        boolean v1=false;
        boolean v2=false;
        boolean v3=false;
        boolean v4=false;
        boolean v5=false;

        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from admin where Admin_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() == 0) {
                v1=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        int count=0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i)) ){
                count++;
            }
        }
        if (count==0 && name.length()<30){
            v2=true;
        }

        int count1=0;
        for (int i = 0; i < cnic.length(); i++) {
            if (Character.isAlphabetic(cnic.charAt(i)) ){
                count1++;
            }
        }
        if (count1==0 && cnic.length()==13){
            v3=true;
        }

        if (email.contains("@") && email.contains(".com") && email.length()<30){
            v4=true;
        }
        if (password.length()>=8 && password.length()<=30){
            v5=true;
        }



        if(v1 && v2 && v3 && v4 && v5 ){
            String query = " insert into admin "
                    + " values (?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt = connection.prepareStatement(query);
            preparedStmt.setString (1, String.valueOf(id));
            preparedStmt.setString(2,name);
            preparedStmt.setString (3,cnic );
            preparedStmt.setString(4,email);
            preparedStmt.setString (5, password);
//            System.out.println(String.valueOf(passwordfld.getPassword()));
            preparedStmt.executeUpdate();
            return true;
        }
        else {
        return false;
        }
    }



        public static boolean AddReceptionist(int id,String name,String number,String cnic,String password) throws SQLException {
        boolean v1=false;
        boolean v2=false;
        boolean v3=false;
        boolean v4=false;
        boolean v5=false;

        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from receptionist where receptionist_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() == 0) {
                v1=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        int count=0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i)) ){
                count++;
            }
        }
        if (count==0 && name.length()<30){
            v2=true;
        }


            int count2=0;
            for (int i = 0; i < number.length(); i++) {
                if (Character.isAlphabetic(number.charAt(i)) ){
                    count2++;
                }
            }
            if (count2==0 && number.length()==11){
                v3=true;
            }
            int count1=0;
            for (int i = 0; i < cnic.length(); i++) {
                if (Character.isAlphabetic(cnic.charAt(i)) ){
                    count1++;
                }
            }
            if (count1==0 && cnic.length()==13){
                v4=true;
            }

        if (password.length()>=8 && password.length()<=30){
            v5=true;
        }



        if(v1 && v2 && v3 && v4 && v5 ){
            return true;
        }
        else {
            return false;}
    }


    public static boolean AddChef(int id,String name,String number,String cnic,int experience) throws SQLException {
        boolean v1=false;
        boolean v2=false;
        boolean v3=false;
        boolean v4=false;
        boolean v5=false;

        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from Chef where Chef_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() == 0) {
                v1=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        int count=0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i)) ){
                count++;
            }
        }
        if (count==0 && name.length()<30){
            v2=true;
        }

        int count1=0;
        for (int i = 0; i < cnic.length(); i++) {
            if (Character.isAlphabetic(cnic.charAt(i)) ){
                count1++;
            }
        }
        if (count1==0 && cnic.length()==13){
            v4=true;
        }
        int count2=0;
        for (int i = 0; i < number.length(); i++) {
            if (Character.isAlphabetic(number.charAt(i)) ){
                count2++;
            }
        }
        if (count2==0 && number.length()==11){
            v3=true;
        }

        if (experience>0 && experience<15){
            v5=true;
        }



        if(v1 && v2 && v3 && v4 && v5 ){
            return true;
        }
        else {
            return false;}
    }
///////////////////////


    public static boolean AddWaiter(int id,String name,String number,String cnic) throws SQLException {
        boolean v1=false;
        boolean v2=false;
        boolean v3=false;
        boolean v4=false;


        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from Waiter where Waiter_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() == 0) {
                v1=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        int count=0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i)) ){
                count++;
            }
        }
        if (count==0 && name.length()<30){
            v2=true;
        }

        int count1=0;
        for (int i = 0; i < cnic.length(); i++) {
            if (Character.isAlphabetic(cnic.charAt(i)) ){
                count1++;
            }
        }
        if (count1==0 && cnic.length()==13){
            v4=true;
        }
        int count2=0;
        for (int i = 0; i < number.length(); i++) {
            if (Character.isAlphabetic(number.charAt(i)) ){
                count2++;
            }
        }
        if (count2==0 && number.length()==11){
            v3=true;
        }


        if(v1 && v2 && v3 && v4  ){
            return true;
        }
        else {
            return true;}
    }

    /////////////////////

    public static boolean AddDeliMan(int id,String name,String number,String cnic) throws SQLException {
        boolean v1=false;
        boolean v2=false;
        boolean v3=false;
        boolean v4=false;


        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from Delivery_Man where deliveryMan_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() == 0) {
                v1=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        int count=0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i)) ){
                count++;
            }
        }
        if (count==0 && name.length()<30){
            v2=true;
        }

        int count1=0;
        for (int i = 0; i < cnic.length(); i++) {
            if (Character.isAlphabetic(cnic.charAt(i)) ){
                count1++;
            }
        }
        if (count1==0 && cnic.length()==13){
            v4=true;
        }
        int count2=0;
        for (int i = 0; i < number.length(); i++) {
            if (Character.isAlphabetic(number.charAt(i)) ){
                count2++;
            }
        }
        if (count2==0 && number.length()==11){
            v3=true;
        }


        if(v1 && v2 && v3 && v4 ){
            return true;
        }
        else {
            return true;}
    }
/////////////////////


    public static boolean AddDeals(int dealid,String name,int price,String description,int foodid) throws SQLException {
        boolean v1=false;
        boolean v2=false;
        boolean v4=false;
        boolean v5=false;


        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from Deals where deals_id = ?");
            checkCredsQuery.setString(1, String.valueOf(dealid));
            if (checkCredsQuery.executeUpdate() == 0) {
                v1=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        int count=0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i)) ){
                count++;
            }
        }
        if (count==0 && name.length()<30){
            v2=true;
        }



        if (description.length()<500){
            v4=true;
        }

        PreparedStatement checkCredsQuery = connection.prepareStatement("select * from food_items where food_id = ?");
        checkCredsQuery.setString(1, String.valueOf(foodid));
        if (checkCredsQuery.executeUpdate() != 0) {
            v5=true;
        }



        if(v1 && v2 && v4 && v5 ){
            return true;
        }
        else {
            return true;}
    }

    ////////////////////////////

    public static boolean Addfood(int id,String name,int price) throws SQLException {
        boolean v1=false;
        boolean v2=false;




        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from food_items where food_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() == 0) {
                v1=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        int count=0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i)) ){
                count++;
            }
        }
        if (count==0 && name.length()<30){
            v2=true;
        }






        if(v1 && v2){
            return true;
        }
        else {
            return true;}
    }

    ////////////////////////////


    public static boolean Addingreds(int id,String name) throws SQLException {
        boolean v1=false;
        boolean v2=false;




        Connection connection;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from ingredients where ingredient_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() == 0) {
                v1=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        int count=0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i)) ){
                count++;
            }
        }
        if (count==0 && name.length()<30){
            v2=true;
        }






        if(v1 && v2){
            return true;
        }
        else {
            return true;}
    }

    ////////////////////////////

    public static boolean Addstats(int statid,int soldamount,int cus_satis,int foodid) throws SQLException {
        boolean v1=false;
        boolean v4=false;
        boolean v5=false;


        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from Statistics where stats_id = ?");
            checkCredsQuery.setString(1, String.valueOf(statid));
            if (checkCredsQuery.executeUpdate() == 0) {
                v1=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if(cus_satis>0 && cus_satis<=10){
            v4=true;
        }

        PreparedStatement checkCredsQuery = connection.prepareStatement("select * from food_items where food_id = ?");
        checkCredsQuery.setString(1, String.valueOf(foodid));
        if (checkCredsQuery.executeUpdate() != 0) {
            v5=true;
        }



        if(v1 && v4 && v5 ){
            return true;
        }
        else {
            return true;}
    }

    ////////////////////////////

    public static boolean AddFO(int Foodid,int orderid) throws SQLException {
        boolean v1=false;
        boolean v5=false;


        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from food_items where food_id = ?");
            checkCredsQuery.setString(1, String.valueOf(Foodid));
            if (checkCredsQuery.executeUpdate() != 0) {
                v1=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        PreparedStatement checkCredsQuery = connection.prepareStatement("select * from order where order_id = ?");
        checkCredsQuery.setString(1, String.valueOf(orderid));
        if (checkCredsQuery.executeUpdate() != 0) {
            v5=true;
        }



        if(v1  && v5 ){
            return true;
        }
        else {
            return true;}
    }

    ////////////////////////////


    public static boolean AddFHD(int Foodid,int hdid) throws SQLException {
        boolean v1=false;
        boolean v5=false;


        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from food_items where food_id = ?");
            checkCredsQuery.setString(1, String.valueOf(Foodid));
            if (checkCredsQuery.executeUpdate() != 0) {
                v1=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        PreparedStatement checkCredsQuery = connection.prepareStatement("select * from Home_Delivery where delivery_id = ?");
        checkCredsQuery.setString(1, String.valueOf(hdid));
        if (checkCredsQuery.executeUpdate() != 0) {
            v5=true;
        }



        if(v1  && v5 ){
            return true;
        }
        else {
            return true;}
    }

    ////////////////////////////

    public static boolean Addcooks(int chefid,int Foodid) throws SQLException {
        boolean v1=false;
        boolean v5=false;


        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from food_items where food_id = ?");
            checkCredsQuery.setString(1, String.valueOf(Foodid));
            if (checkCredsQuery.executeUpdate() != 0) {
                v1=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        PreparedStatement checkCredsQuery = connection.prepareStatement("select * from Chef where chef_id = ?");
        checkCredsQuery.setString(1, String.valueOf(chefid));
        if (checkCredsQuery.executeUpdate() != 0) {
            v5=true;
        }



        if(v1  && v5 ){
            return true;
        }
        else {
            return true;}
    }

    ////////////////////////////

    public static boolean Adddish(int Foodid,int ingredid) throws SQLException {
        boolean v1=false;
        boolean v5=false;


        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from food_items where food_id = ?");
            checkCredsQuery.setString(1, String.valueOf(Foodid));
            if (checkCredsQuery.executeUpdate() != 0) {
                v1=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        PreparedStatement checkCredsQuery = connection.prepareStatement("select * from ingredients where ingredient_id = ?");
        checkCredsQuery.setString(1, String.valueOf(ingredid));
        if (checkCredsQuery.executeUpdate() != 0) {
            v5=true;
        }



        if(v1  && v5 ){
            return true;
        }
        else {
            return true;}
    }

    ////////////////////////////


    public static boolean Addcustomer(int id,String name,String number,String cnic,int delimanid) throws SQLException {
        boolean v1=false;
        boolean v2=false;
        boolean v3=false;
        boolean v4=false;
        boolean v5=false;


        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from Customer where customer_id = ?");
            checkCredsQuery.setString(1, String.valueOf(id));
            if (checkCredsQuery.executeUpdate() == 0) {
                v1=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        int count=0;
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i)) ){
                count++;
            }
        }
        if (count==0 && name.length()<30){
            v2=true;
        }

        int count1=0;
        for (int i = 0; i < cnic.length(); i++) {
            if (Character.isAlphabetic(cnic.charAt(i)) ){
                count1++;
            }
        }
        if (count1==0 && cnic.length()==13){
            v4=true;
        }
        int count2=0;
        for (int i = 0; i < number.length(); i++) {
            if (Character.isAlphabetic(number.charAt(i)) ){
                count2++;
            }
        }
        if (count2==0 && cnic.length()==11){
            v3=true;
        }

        PreparedStatement checkCredsQuery = connection.prepareStatement("select * from Delivery_Man where deliveryMan_id = ?");
        checkCredsQuery.setString(1, String.valueOf(delimanid));
        if (checkCredsQuery.executeUpdate() != 0) {
            v5=true;
        }


        if(v1 && v2 && v3 && v4 && v5){
            return true;
        }
        else {
            return true;}
    }
/////////////////////



    public static boolean Addorder(int orderid,String desc,int waiterid,int delimanid) throws SQLException {
        boolean v1=false;
        boolean v2=false;
        boolean v3=false;
        boolean v4=false;



        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement( "select * from Order where order_id = ?");
            checkCredsQuery.setString(1, String.valueOf(orderid));
            if (checkCredsQuery.executeUpdate() == 0) {
                v1=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if (desc.length()<500){v2=true;}

        PreparedStatement checkCredsQuery = connection.prepareStatement("select * from Waiter where waiter_id = ?");
        checkCredsQuery.setString(1, String.valueOf(waiterid));
        if (checkCredsQuery.executeUpdate() != 0) {
            v3=true;
        }
        PreparedStatement checkCredsQuery1 = connection.prepareStatement("select * from Delivery_Man where deliveryMan_id = ?");
        checkCredsQuery1.setString(1, String.valueOf(delimanid));
        if (checkCredsQuery1.executeUpdate() != 0) {
            v4=true;
        }


        if(v1 && v2 && v3 && v4 ){
            return true;
        }
        else {
            return true;}
    }
/////////////////////


    public static boolean AddhomeDeli(int homeid,String desc,String address,int payment,int delimanid) throws SQLException {
        boolean v1=false;
        boolean v2=false;
        boolean v3=false;
        boolean v4=false;
        boolean v5=false;



        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement("select * from Home_Delivery where delivery_id = ?");
            checkCredsQuery.setString(1, String.valueOf(homeid));
            if (checkCredsQuery.executeUpdate() == 0) {
                v1=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if (desc.length()<500){v2=true;}

        if (address.length()<300){
            v3=true;
        }
        if (payment>0){
            v4=true;
        }


        PreparedStatement checkCredsQuery1 = connection.prepareStatement("select * from Delivery_Man where deliveryMan_id = ?");
        checkCredsQuery1.setString(1, String.valueOf(delimanid));
        if (checkCredsQuery1.executeUpdate() != 0) {
            v5=true;
        }


        if(v1 && v2 && v3 && v4 ){
            return true;
        }
        else {
            return true;}
    }
/////////////////////


    public static boolean Addfeedback(int feedid,int rating,String cmnt,int foodid,int customerid) throws SQLException {
        boolean v1=false;
        boolean v2=false;
        boolean v3=false;
        boolean v4=false;
        boolean v5=false;



        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "databaseproject", "databaseproject");
            PreparedStatement checkCredsQuery = connection.prepareStatement( "select * from Feedback where feedback_id = ?");
            checkCredsQuery.setString(1, String.valueOf(feedid));
            if (checkCredsQuery.executeUpdate() == 0) {
                v1=true;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        if (rating>0 && rating <10){v2=true;}
        if (cmnt.length()<300){v3=true;}

        PreparedStatement checkCredsQuery = connection.prepareStatement("select * from food_items where food_id = ?");
        checkCredsQuery.setString(1, String.valueOf(foodid));
        if (checkCredsQuery.executeUpdate() != 0) {
            v4=true;
        }
        PreparedStatement checkCredsQuery1 = connection.prepareStatement("select * from Customer where customer_id = ?");
        checkCredsQuery1.setString(1, String.valueOf(customerid));
        if (checkCredsQuery1.executeUpdate() != 0) {
            v5=true;
        }


        if(v1 && v2 && v3 && v4 && v5 ){
            return true;
        }
        else {
            return true;}
    }
/////////////////////

    public static void main(String[] args) throws SQLException {
        System.out.println(AddReceptionist(0,"Talha","03025754902","1234567890123","123456789"));
    }
}

