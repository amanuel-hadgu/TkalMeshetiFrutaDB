package tkalMeshetFrutaDB;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ConnectionManager {

    private static ConnectionManager instance = null;

    private static final String USERNAME = "tkalmeshetifruta";
    private static final String PASSWORD = "tkalpassword";
    private static final String M_CONN_STRING = "jdbc:mysql://localhost:3306/tkalmeshetifrutadb?characterEncoding=UTF-8";
    private static final String S_CONN_STRING = "jdbc:mysql://localhost:3306/tkalmeshetifrutadb?characterEncoding=UTF-8";
    private final String H_CONN_STRING = "jdbc:hsqldb:data/explorecalifornia";

    private Connection conn = null;

    private DBType dbType = DBType.MYSQL;

    private ConnectionManager() {
    }

    public static ConnectionManager getInstance() {
        if (instance == null) {
            instance = new ConnectionManager();
        }
        return instance;
    }

    public void setDBType(DBType dbType) {
        this.dbType = dbType;
    }

    private boolean openConnection() {
        try {
            switch (dbType) {

                case MYSQL:
                    conn = DriverManager.getConnection(M_CONN_STRING, USERNAME, PASSWORD);
                    return true;

                case HSQLDB:
                    conn = DriverManager.getConnection(H_CONN_STRING, USERNAME, PASSWORD);
                    return true;
                case SQLSERVER:
                    conn = DriverManager.getConnection(S_CONN_STRING, USERNAME, PASSWORD);
                    return true;
                default:
                    return false;
            }
        } catch (SQLException e) {

            return false;
        }
    }

    public Connection getConnection() {
        if (conn == null) {
            if (openConnection()) {
                //System.out.println("Connection opened");                      
                return conn;
            } else {
                return null;
            }
        }
        return conn;
    }

    public void close() {
        // System.out.println("Closing connection");
        try {
            conn.close();
            conn = null;
        } catch (Exception e) {
        }
    }

//    public static void connectionError() {
//        String errorStr = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
//                + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
//                + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
//        JLabel warning = new JLabel();
//        warning.setSize(300, 100);
//        warning.setFont(new Font("Nyala", Font.PLAIN, 16));
//        warning.setText(errorStr);
//        JOptionPane.showMessageDialog(null, warning, "ኮኔክሽ ጸገም", JOptionPane.ERROR_MESSAGE);
//    }
//
//    public static void melekti() {
//        String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
//                + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
//        JLabel warning = new JLabel();
//        warning.setSize(300, 100);
//        warning.setFont(new Font("Nyala", Font.PLAIN, 16));
//        warning.setText(errorStr);
//        JOptionPane.showMessageDialog(null, warning, "መልእኽቲ", JOptionPane.ERROR_MESSAGE);
//    }
//
//    public static void sqlException(String ex) {
//        JLabel warning = new JLabel();
//        warning.setSize(300, 100);
//        warning.setFont(new Font("Nyala", Font.PLAIN, 16));
//        warning.setText(ex);
//        JOptionPane.showMessageDialog(null, warning, "", JOptionPane.ERROR_MESSAGE);
//
//    }
    public static void message(String ex, String errorType) {
        JLabel warning = new JLabel();
        warning.setSize(300, 100);
        warning.setFont(new Font("Nyala", Font.PLAIN, 16));
        warning.setText(ex);
        if ("መጠንቀቕታ".equals(errorType)) {
            JOptionPane.showMessageDialog(null, warning, errorType, JOptionPane.WARNING_MESSAGE);
        }
        if ("ሓበሬታ".equals(errorType)) {
            JOptionPane.showMessageDialog(null, warning, errorType, JOptionPane.INFORMATION_MESSAGE);
        }
        if ("ጌጋ".equals(errorType)) {
            JOptionPane.showMessageDialog(null, warning, errorType, JOptionPane.ERROR_MESSAGE);
        }
        if ("".equals(errorType)) {
            JOptionPane.showMessageDialog(null, warning, errorType, JOptionPane.PLAIN_MESSAGE);
        }

    }

//    public static void informationDialog(String ex) {
//        JLabel warning = new JLabel();
//        warning.setSize(300, 100);
//        warning.setFont(new Font("Nyala", Font.PLAIN, 16));
//        warning.setText(ex);
//        JOptionPane.showMessageDialog(null, warning, "", JOptionPane.ERROR_MESSAGE);
//
//    }
//
//    public static void zeytemezgebeSmMeheberi(String ex) {
//        JLabel warning = new JLabel();
//        warning.setSize(300, 100);
//        warning.setFont(new Font("Nyala", Font.PLAIN, 16));
//        warning.setText(ex);
//        JOptionPane.showMessageDialog(null, warning, "", JOptionPane.ERROR_MESSAGE);
//
//    }
}
