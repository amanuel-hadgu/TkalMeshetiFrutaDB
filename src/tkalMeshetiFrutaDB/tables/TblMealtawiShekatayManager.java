
package tkalMeshetiFrutaDB.tables;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import tkalMeshetFrutaDB.ConnectionManager;
import tkalMeshetFrutaDB.NewJFrame;
import tkalMeshetiFrutaDB.beans.TblMealtawiShekatay;

public class TblMealtawiShekatayManager {
    private static Connection conn = ConnectionManager.getInstance().getConnection();
    
//    public static Double getTeklalaDmr(Date startDate, Date endDate) throws SQLException{
//        String sql = "select sum(teklalawaga) as teklalawaga from tblmealtawishekatay where olet > ? and olet <= ?";
//        ResultSet rs = null;
//        if(conn == null){
//           String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
//                + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
//                + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
//            String errorType = "ጌጋ";
//           ConnectionManager.message(ex, errorType);
//           return null;
//       }
//        try(
//                //Connection conn = DBUtil.getConnection();
//                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);               
//            ){
//            stmt.setDate(1, startDate);
//            stmt.setDate(2, endDate);
//            rs = stmt.executeQuery();
//              if(rs.next()){
//              double teklalaDmrHarestay = rs.getDouble("teklalawaga");
//                  return teklalaDmrHarestay;
//              }else{
//                  return null;
//           }
//        }catch(SQLException ex){
//            String exStr = "ድምር ክርከበ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
//            String errorType = "ጌጋ";
//            ConnectionManager.message(exStr, errorType);
//            return null;
//        }finally{
//        if(rs != null)
//            rs.close();
//        }        
//    }
    
    public static Double getTeklalaDmr(Date startDate) throws SQLException{
        String sql = "select sum(teklalawaga) as teklalawaga from tblmealtawishekatay where olet > ?";
        ResultSet rs = null;
        if(conn == null){
           String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
           ConnectionManager.message(ex, errorType);
           return null;
       }
        try(
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);               
            ){
            stmt.setDate(1, startDate);
            
            rs = stmt.executeQuery();
              if(rs.next()){
              double teklalaDmr = rs.getDouble("teklalawaga");
                  return teklalaDmr;
              }else{
                  return null;
           }
        }catch(SQLException ex){
            String exStr = "መሸጢ ድምር ክርከበ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }finally{
        if(rs != null)
            rs.close();
        }        
    }
    
    public static void setTeklalaNdZtekefleWaga(Date selectedDate) throws SQLException{
        String sql = "select sum(teklalawaga) as teklalawaga, sum(ztekeflewaga) as ztekeflewaga from tblmealtawishekatay where olet = ?";
        ResultSet rs = null;
        if(conn == null){
           String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
           ConnectionManager.message(ex, errorType);
       }
        try(
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);               
            ){
            stmt.setDate(1, selectedDate);
            rs = stmt.executeQuery();
              if(rs.next()){
                NewJFrame.setTeklalaWaga(rs.getDouble("teklalawaga"));       
                NewJFrame.setZtekefleWaga(rs.getDouble("ztekeflewaga"));
           }
        }catch(SQLException ex){
            String exStr = "ናይ ዓዳጋይ ዝተኸፍለ ዋጋ ክምዝገብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
        }finally{
        if(rs != null)
            rs.close();
        }        
    }   
    
    public static boolean insert(TblMealtawiShekatay mealtawiShekatayBean) throws SQLException{
        String sql = "insert into tblmealtawishekatay (olet,oaynetfruta,fruydekik,bzhigabya,oyargabya,mizan,wagankilo,teklalawaga,ztekeflewaga,IdShekatay) values (?,?,?,?,?,?,?,?,?,?)";
      if(conn == null){
           String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
           ConnectionManager.message(ex, errorType);
           return false;
       }  
        try(
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);               
            ){
                    stmt.setDate(1, mealtawiShekatayBean.getOlet());    
                    stmt.setString(2, mealtawiShekatayBean.getOaynetFruta());
                    stmt.setString(3, mealtawiShekatayBean.getFruyDekik());
                    stmt.setInt(4, mealtawiShekatayBean.getBzhiGabya());
                    stmt.setDouble(5, mealtawiShekatayBean.getOyarGabya());    
                    stmt.setDouble(6, mealtawiShekatayBean.getMizanBKilo());
                    stmt.setDouble(7, mealtawiShekatayBean.getWagaNKilo());
                    stmt.setDouble(8, mealtawiShekatayBean.getTeklalaWaga());
                    stmt.setDouble(9, mealtawiShekatayBean.getZtekefleWaga());
                    stmt.setInt(10, mealtawiShekatayBean.getIdShekatay());
                    
                    stmt.executeUpdate();
            }catch(SQLException ex){
                String exStr = "ናይ ዓዳጋይ ክምዝገብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
                String errorType = "ጌጋ";
                ConnectionManager.message(exStr, errorType);
                return false;
            }
        return true;           
    }
    
    
    public static boolean update(TblMealtawiShekatay mealtawiShekatayBean) throws SQLException{
        String sql = "select * from tblMealtawiShekatay where olet = ? and oyargabya = ?  and oaynetfruta = ? and fruydekik = ?  and wagankilo = ?  and IdShekatay = ?";
                
        ResultSet rs = null;
        if(conn == null){
           String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
           ConnectionManager.message(ex, errorType);
           return false;
       }
        try(
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(
                   sql,
                   ResultSet.TYPE_SCROLL_INSENSITIVE,
                   ResultSet.CONCUR_UPDATABLE);
                ){
           // stmt.setString(1, zoneBean.getZoneName());          
            stmt.setDate(1, mealtawiShekatayBean.getOlet());            
            stmt.setDouble(2, mealtawiShekatayBean.getOyarGabya());            
            stmt.setString(3, mealtawiShekatayBean.getOaynetFruta());
            stmt.setString(4, mealtawiShekatayBean.getFruyDekik());            
            stmt.setDouble(5, mealtawiShekatayBean.getWagaNKilo());            
            stmt.setInt(6, mealtawiShekatayBean.getIdShekatay());
            
            rs = stmt.executeQuery();
            if(rs.next()){
                rs.updateInt("bzhigabya", rs.getInt("bzhigabya") + mealtawiShekatayBean.getBzhiGabya());
                rs.updateDouble("mizan", rs.getDouble("mizan") + mealtawiShekatayBean.getMizanBKilo());
                rs.updateDouble("ztekefleWaga", rs.getDouble("ztekefleWaga") + mealtawiShekatayBean.getZtekefleWaga());
                rs.updateDouble("teklalawaga", rs.getDouble("teklalawaga") + mealtawiShekatayBean.getTeklalaWaga());
                                     
                rs.updateRow();
                return true;
            }else{
                //System.err.println("failed to update");
                return false;
            }
        }catch(SQLException ex){
           String exStr = "ናይ ዓዳጋይ ክመሓየሽ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }finally{
            if(rs != null) rs.close();
        }
    }
      
    public static boolean delete(Date sqlDateOfToday) throws SQLException{
        String sql = "delete from tblmealtawishekatay where olet = ?";
        if(conn == null){
           String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
           ConnectionManager.message(ex, errorType);
           return false;
       }
        try(
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                ){
            stmt.setDate(1, sqlDateOfToday);
            int affected = stmt.executeUpdate();
            if(affected == 1){
                return true;
            }else{
                return false;
          }
        }catch(SQLException ex){
            String exStr = "ናይ ዓዳጋይ ክድምሰስ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }
    }
    
    public static boolean deleteOnIdShekatay(int idShekatay) throws SQLException{
        String sql = "delete from tblmealtawishekatay where idshekatay = ?";
        if(conn == null){
           String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
           ConnectionManager.message(ex, errorType);
           return false;
       }
        try(
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                ){
            stmt.setInt(1, idShekatay);
            int affected = stmt.executeUpdate();
            if(affected == 1){
                return true;
            }else{
                return false;
          }
        }catch(SQLException ex){
            String exStr = "ናይ ዓዳጋይ ክድምሰስ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }
    }
    
    public static boolean deleteMealtawiShekatayOnOlet(Date sqlDateOfToday) throws SQLException{
        String sql = "delete from tblmealtawishekatay where olet < DATE_SUB( ? , INTERVAL 2 YEAR)";
        if(conn == null){
           String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
           ConnectionManager.message(ex, errorType);
           return false;
       }
        try(
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
                ){
            stmt.setDate(1, sqlDateOfToday);
                   
            int affected = stmt.executeUpdate();
            if(affected == 1){
                return true;
            }else{
                return false;
          }
        }catch(SQLException ex){
            String exStr = "ስም ዓዳጋይ ክድምሰስ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }
    }
}
