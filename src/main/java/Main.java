import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/first_db_61", "postgres", "root");
        //Statement statement = connection.createStatement();
        //boolean result = statement.execute("SELECT * FROM telephone");
        //System.out.println(result);
        //PreparedStatement statement = connection.prepareStatement("SELECT * FROM telephone WHERE id<?");
        //statement.setInt(1,10);
        //ResultSet resultSet = statement.executeQuery();
        //ArrayList<Telephone> list = new ArrayList<>();
        //while (resultSet.next()){
        //    Telephone telephone = new Telephone();
        //   telephone.setId(resultSet.getInt("id"));
        //    telephone.setModel(resultSet.getString("model"));
        //    telephone.setColor(resultSet.getString("color"));
        //    list.add(telephone);
        //}
        //System.out.println(list);
        PreparedStatement statement = connection.prepareStatement("INSERT INTO telephone (model, color) VALUES (?,?)");
        statement.setString(1, "horizont");
        statement.setString(2, "green");
        int count = statement.executeUpdate();
        System.out.println(count);
        connection.close();
    }
}
