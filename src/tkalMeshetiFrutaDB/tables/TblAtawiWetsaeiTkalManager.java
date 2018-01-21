package tkalMeshetiFrutaDB.tables;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Types.VARCHAR;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import tkalMeshetFrutaDB.ConnectionManager;
import tkalMeshetiFrutaDB.beans.TblAtawiWetsaeiTkal;

public class TblAtawiWetsaeiTkalManager {

    private static Connection conn = ConnectionManager.getInstance().getConnection();
    private static List<String> smtelekahi;

    public static boolean insert(TblAtawiWetsaeiTkal atawiWetsaeiBean) throws SQLException {

        String sql = "insert into tblatawiwetsaei (olet,sm,atawiwetsaei,reason,description,genzeb) values (?,?,?,?,?,?)";
        if (conn == null) {
            String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                    + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                    + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(ex, errorType);
            return false;
        }
        try (
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);) {
            stmt.setDate(1, atawiWetsaeiBean.getOlet());
            if (!"".equals(atawiWetsaeiBean.getSm())) {
                stmt.setString(2, atawiWetsaeiBean.getSm());
            } else {
                stmt.setNull(2, VARCHAR);
            }
            stmt.setString(3, atawiWetsaeiBean.getAtawiWetsaei());
            if (!"".equals(atawiWetsaeiBean.getReason())) {
                stmt.setString(4, atawiWetsaeiBean.getReason());
            } else {
                stmt.setNull(4, VARCHAR);
            }
            if (!"".equals(atawiWetsaeiBean.getDescription())) {
                stmt.setString(5, atawiWetsaeiBean.getDescription());
            } else {
                stmt.setNull(5, VARCHAR);
            }
            stmt.setDouble(6, atawiWetsaeiBean.getGenzeb());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            String exStr = "ዕለታዊ ኣታዊ/ወጻኢ ምምዝጋብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }
        return true;
    }

    public static boolean updateAta(TblAtawiWetsaeiTkal atawiWetsaeiBean) throws SQLException {
        String sql = "select * from tblatawiwetsaei where olet = ? and atawiwetsaei = ? and reason = ?";
        ResultSet rs = null;
        if (conn == null) {
            String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                    + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                    + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(ex, errorType);
            return false;
        }
        try (
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);) {
                    // stmt.setString(1, zoneBean.getZoneName());          
                    stmt.setDate(1, atawiWetsaeiBean.getOlet());
                    stmt.setString(2, atawiWetsaeiBean.getAtawiWetsaei());
                    if (!"".equals(atawiWetsaeiBean.getReason())) {
                        stmt.setString(3, atawiWetsaeiBean.getReason());
                    } else {
                        stmt.setNull(3, VARCHAR);
                    }

                    rs = stmt.executeQuery();
                    if (rs.next()) {
                        rs.updateDouble("Genzeb", (double) (rs.getDouble("genzeb") + atawiWetsaeiBean.getGenzeb()));

                        rs.updateRow();
                        return true;
                    } else {
                        //System.err.println("failed to update");
                        return false;
                    }
                } catch (SQLException ex) {
                    String exStr = "ዕለታዊ ኣታዊ/ወጻኢ ምሕዳስ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
                    String errorType = "ጌጋ";
                    ConnectionManager.message(exStr, errorType);
                    return false;
                } finally {
                    if (rs != null) {
                        rs.close();
                    }
                }
    }

    public static boolean updateMebegesiOlet(Date sqlDateOfToday) throws SQLException {
        String sql = "select * from tblatawiwetsaei where atawiwetsaei = 'መበገሲ ዕለት'";
        ResultSet rs = null;
        if (conn == null) {
            String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                    + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                    + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(ex, errorType);
            return false;
        }
        try (
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);) {

                    rs = stmt.executeQuery();
                    if (rs.next()) {
                        rs.updateDate("Olet", sqlDateOfToday);

                        rs.updateRow();
                        return true;
                    } else {
                        //System.err.println("failed to update");
                        return false;
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                    String exStr = "ዕለታዊ ኣታዊ/ወጻኢ ምሕዳስ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
                    String errorType = "ጌጋ";
                    ConnectionManager.message(exStr, errorType);
                    return false;
                } finally {
                    if (rs != null) {
                        rs.close();
                    }
                }
    }

    public static boolean updateMebegesiOletonOlet(Date sqlDateOfToday) throws SQLException {

        String sql = "select * from tblatawiwetsaei where atawiwetsaei = 'መበገሲ ዕለት' and olet < DATE_SUB( ? , INTERVAL 2 YEAR)";
        ResultSet rs = null;
        if (conn == null) {
            String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                    + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                    + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(ex, errorType);
            return false;
        }
        try (
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(
                        sql,
                        ResultSet.TYPE_SCROLL_INSENSITIVE,
                        ResultSet.CONCUR_UPDATABLE);) {
                    // stmt.setString(1, zoneBean.getZoneName());          
                    stmt.setDate(1, sqlDateOfToday);

                    rs = stmt.executeQuery();
                    if (rs.next()) {
                        rs.updateDate("Olet", sqlDateOfToday);

                        rs.updateRow();
                        return true;
                    } else {
                        //System.err.println("failed to update");
                        return false;
                    }
                } catch (SQLException ex) {
                    String exStr = "ዕለታዊ ኣታዊ/ወጻኢ ምሕዳስ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
                    String errorType = "ጌጋ";
                    ConnectionManager.message(exStr, errorType);
                    return false;
                } finally {
                    if (rs != null) {
                        rs.close();
                    }
                }
    }

    public static Date getMebegesiOlet() throws SQLException {
        String sql = "select olet from tblatawiwetsaei where atawiwetsaei =  'መበገሲ ዕለት'";
        ResultSet rs = null;
        if (conn == null) {
            String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                    + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                    + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(ex, errorType);
            return null;
        }
        try (
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);) {

            rs = stmt.executeQuery();
            if (rs.next()) {
                Date mebegesiOlet = rs.getDate("olet");
                return mebegesiOlet;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            String exStr = "መበገሲ ዕለት ክርከበ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
    }

    public static Double getTeklalaDmrTkal(Date startDate) throws SQLException {
        String sql = "select sum(genzeb) as teklalaDmrTkal from tblatawiwetsaei where atawiwetsaei =  'ኣታዊ' || atawiwetsaei =  'ወጻኢ' and olet > ?";
        ResultSet rs = null;
        if (conn == null) {
            String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                    + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                    + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(ex, errorType);
            return null;
        }
        try (
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);) {
            stmt.setDate(1, startDate);

            rs = stmt.executeQuery();
            if (rs.next()) {
                double teklalaDmrTkal = rs.getDouble("teklalaDmrTkal");
                return teklalaDmrTkal;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            String exStr = "ጠቕላላ ድምር ክርከበ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
    }

    public static boolean checkAtawiWetsaei(String reason, String atawiWetsaei) throws SQLException {
        String sql = "select sm from tblatawiwetsaei where reason = ? and atawiwetsaei = ?";
        ResultSet rs = null;
        if (conn == null) {
            String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                    + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                    + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(ex, errorType);
            return false;
        }
        try (
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);) {
            stmt.setString(1, reason);
            stmt.setString(2, atawiWetsaei);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            String exStr = "ጠቕላላ ድምር ክርከበ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
    }

    public static boolean checkAtawiWetsaeiOnSm(String sm) throws SQLException {
        String sql = "select sm from tblatawiwetsaei where sm = ?";
        ResultSet rs = null;
        if (conn == null) {
            String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                    + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                    + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(ex, errorType);
            return false;
        }
        try (
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);) {
            stmt.setString(1, sm);

            rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            String exStr = "ጠቕላላ ድምር ክርከበ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        } finally {
            if (rs != null) {
                rs.close();
            }
        }
    }

    public static boolean delete(Date ዕለት, String ስም) throws SQLException {
        String sql = "delete from tblatawiwetsaei where olet= ? AND sm = ?";
        if (conn == null) {
            String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                    + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                    + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(ex, errorType);
            return false;
        }
        try (
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);) {
            stmt.setDate(1, ዕለት);
            stmt.setString(2, ስም);
            // stmt.setInt(3, idBealfrki);         
            int affected = stmt.executeUpdate();
            if (affected == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            String exStr = "ዕለታዊ ኣታዊ/ወጻኢ ምድምሳስ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }
    }

    public static boolean deleteAtawiWetsaeiOnOlet(Date sqlDateOfToday) throws SQLException {
        String sql = "delete from tblatawiwetsaei where olet < DATE_SUB( ? , INTERVAL 2 YEAR)";
        if (conn == null) {
            String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                    + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                    + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(ex, errorType);
            return false;
        }
        try (
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);) {
            stmt.setDate(1, sqlDateOfToday);

            int affected = stmt.executeUpdate();
            if (affected == 1) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            String exStr = "ስም ዓዳጋይ ክድምሰስ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }
    }

    public static List<String> displayAllNames() throws SQLException {
        if (conn == null) {
            String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                    + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                    + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(ex, errorType);
            System.exit(0);
        }
        String sql = "select distinct sm from tblatawiwetsaei where sm IS NOT NULL";
        try (
                //Connection conn = DBUtil.getConnection();
                Statement stmt = (Statement) conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);) {
            smtelekahi = new ArrayList<>();
            smtelekahi.add("");

            while (rs.next()) {

                smtelekahi.add(rs.getString("sm"));
            }
            return smtelekahi;
        } catch (SQLException ex) {
            String exStr = "ስም ሰብ ፍርቂ ክረከብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }
    }

}
