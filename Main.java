import java.sql.*;

public class Main {

    private static Connection connection;
    private static Statement stmt;
    private static PreparedStatement pstmt;

    public static void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:main.db");
            stmt = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    public static void disconnect() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void creation() {
        try {
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS states&population (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, population INTEGER);");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void tabDeleting() {
        try {
            stmt.executeUpdate("DROP TABLE IF EXISTS states&population;");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void deleting(){
        try {
            stmt.executeUpdate("DELETE FROM states&population WHERE id = 2;");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void addition1() {
        try {
            stmt.executeUpdate("INSERT INTO states&population (name, population) VALUES ('Russia', 140);");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void addition2() {
        try {
            stmt.executeUpdate("INSERT INTO states&population (name, population) VALUES ('Belarus', 9);");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void reading() {
        try {
            ResultSet resultSet = stmt.executeQuery("SELECT * FROM states&population;");
            System.out.println(resultSet.getInt(1) + resultSet.getString(2) + resultSet.getInt(3));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public static void main(String[] args) {
        System.out.println("Создать CRUD операции, 1 метод создани таблицы 2 метод для добавления записи 3 метод для получения записи 4 метод для удаления записи 5 удаление таблицы");

//        try {
//            ResultSet rs = stmt.executeQuery("SELECT * FROM States");
//            while (rs.next()){
//                System.out.print(rs.getInt(1));
//                System.out.print(rs.getString(2));
//                System.out.print(rs.getInt(3));
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
    }
}
