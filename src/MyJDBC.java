import java.sql.*;

public class MyJDBC {
    public static void main(String[] args){

        try{
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/sql_invoicing", "root", "okcsonic");

            Statement statement = connection.createStatement();

            ResultSet set = statement.executeQuery("SELECT * FROM clients");

            while(set.next()){
                System.out.println(set.getString("name"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
