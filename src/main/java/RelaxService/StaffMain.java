package RelaxService;

import java.sql.*;
import java.time.LocalDate;

public class StaffMain {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/first_db_61", "postgres", "root");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO staff (name, date_of_birth, address, contact_number, date_of_employment, position, salary) VALUES (?,?,?,?,?,?,?)");
        statement.setString(1,"Кузьменко Екатерина");
        statement.setString(2, String.valueOf(LocalDate.of(1992, 6,5)));
        statement.setString(3, "Н.Тесла 6 - 14");
        statement.setString(4, "80299876565");
        statement.setString(5, String.valueOf(LocalDate.of(2023, 1,18)));
        statement.setString(6, "косметолог");
        statement.setInt(7, 1300);
        statement.executeUpdate();
        connection.close();
    }
}
