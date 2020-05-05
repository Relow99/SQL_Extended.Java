import java.sql.*;

public class ConnectionPostgresSQL {

    static public void DBconnection() throws SQLException {

        String url = "JDBC:postgresql://localhost:5432/Uumuzi";
        String userName = "postgres";
        String password = "RELOW";
        Connection connect = null;

        try {
            Class<?> aClass = Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgre", "postgress", "RELOW");
        System.out.println("Connected");

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select  * from Customer");

        while (resultSet.next()){
            System.out.println(resultSet.getString("id")+","+resultSet.getString("full_name"));

        }
    }
}