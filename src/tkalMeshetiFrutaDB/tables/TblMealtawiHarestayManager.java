
package tkalMeshetiFrutaDB.tables;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Types.INTEGER;
import tkalMeshetFrutaDB.ConnectionManager;
import tkalMeshetFrutaDB.NewJFrame;
import tkalMeshetiFrutaDB.beans.TblMealtawiHarestay;

public class TblMealtawiHarestayManager {
    private static Connection conn = ConnectionManager.getInstance().getConnection();
    
    public static void setNayMekinaTkalHarestay(Date selectedDate) throws SQLException{
        String sql = "select sum(ናይመኪና) as naymekina, sum(ናይትካል) as naytkal, sum(nayharestay) as nayharestay from tblmealtawiharestay where Olet = ?";
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
                NewJFrame.setNaymekina(rs.getDouble("naymekina"));       
                NewJFrame.setNaytkal(rs.getDouble("naytkal"));
                NewJFrame.setNayharestay(rs.getDouble("nayharestay"));
           }
        }catch(SQLException ex){
            String exStr = "ናይ ሓረስታይ ምምዝጋብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
        }finally{
        if(rs != null)
            rs.close();
        }        
    }   
    
   public static Double getTeklalaDmrNayHarestay(int idWana, int idBealFrki) throws SQLException{
        String sql = "select sum(nayharestay) as teklalanayharestay from tblmealtawiharestay where idWana = ? and idBealFrki = ?";
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
            stmt.setInt(1, idWana);
            stmt.setInt(2, idBealFrki);
            rs = stmt.executeQuery();
              if(rs.next()){
              double teklalaDmrHarestay = rs.getDouble("teklalanayharestay");
                  return teklalaDmrHarestay;
              }else{
                  return null;
           }
        }catch(SQLException ex){
            String exStr = "ናይ ሓረስታይ ድምር ክርከበ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }finally{
        if(rs != null)
            rs.close();
        }
        
    }
   
   public static Double getTeklalaDmr(Date startDate, Date endDate) throws SQLException{
        String sql = "select sum(ጠቕላላዋጋ) as teklalawaga from tblmealtawiharestay where olet > ? and olet <= ?";
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
            stmt.setDate(2, endDate);
            rs = stmt.executeQuery();
              if(rs.next()){
              double teklalaDmrHarestay = rs.getDouble("teklalawaga");
                  return teklalaDmrHarestay;
              }else{
                  return null;
           }
        }catch(SQLException ex){
            String exStr = "ድምር ክርከበ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }finally{
        if(rs != null)
            rs.close();
        }        
    }
   
   public static Double getTeklalaDmrNayHarOnOyanerFruta(String oaynetFruta, int idWana, int idBealFrki) throws SQLException{
        String sql = "select sum(nayharestay) as teklalanayharestay from tblmealtawiharestay where ዓይነትፍሩታ = ? and idWana = ? and idBealFrki = ?";
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
            stmt.setString(1, oaynetFruta);
            stmt.setInt(2, idWana);
            stmt.setInt(3, idBealFrki);
            rs = stmt.executeQuery();
              if(rs.next()){
              double teklalaDmrHarestay = rs.getDouble("teklalanayharestay");
                  return teklalaDmrHarestay;
              }else{
                  return null;
           }
        }catch(SQLException ex){
            String exStr = "ናይ ሓረስታይ ድምር ክርከበ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }finally{
        if(rs != null)
            rs.close();
        }        
    }
   
   public static boolean checkMealtawiRep(Date sqlDateOfFactor, int idWana, int idBealFrki) throws SQLException{
        String sql = "select nayharestay from tblmealtawiharestay where olet = ? and idWana = ? and (idbealfrki = ? || idBealFrki is null)";
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
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);               
            ){
            stmt.setDate(1, sqlDateOfFactor);            
            stmt.setInt(2, idWana);
            if(idBealFrki > 0)
                stmt.setInt(3, idBealFrki);
            else
                stmt.setNull(3, INTEGER);
            rs = stmt.executeQuery();
              if(rs.next()){
                return true;
              }else{
                  return false;
           }
        }catch(SQLException ex){            
            return false;
        }finally{
        if(rs != null)
            rs.close();
        }        
    }
   
   public static boolean checkMealtawiRepWzOutOlet(int idWana, int idBealFrki) throws SQLException{
        String sql = "select nayharestay from tblmealtawiharestay where idWana = ? and (idbealfrki = ? || idBealFrki is null)";
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
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);               
            ){
            stmt.setInt(1, idWana);
            if(idBealFrki > 0)
                stmt.setInt(2, idBealFrki);
            else
                stmt.setNull(2, INTEGER);
            rs = stmt.executeQuery();
              if(rs.next()){
                return true;
              }else{
                  return false;
           }
        }catch(SQLException ex){            
            return false;
        }finally{
        if(rs != null)
            rs.close();
        }        
    }
    
   public static Double getTeklalaDmr(Date startDate) throws SQLException{
        String sql = "select sum(ጠቕላላዋጋ) as teklalawaga from tblmealtawiharestay where olet > ?";
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
            String exStr = "መግዝኢ ድምር ክርከበ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }finally{
        if(rs != null)
            rs.close();
        }        
    }
   
    public static boolean insert(TblMealtawiHarestay mealtawiHarestayBean) throws SQLException{
        String sql = "insert into tblmealtawiharestay (Olet,ዝሓደረ,ዕያርጋብያ,ታሪፍመኪና,ዓይነትፍሩታ,ፍሩይደቂቕ,ታሪፍካብኪሎ,ብዝሒጋብያ,ሚዛንብኪሎ,ዋጋንኪሎ,"
                + "ጠቕላላዋጋ,ናይመኪና,ናይትካል,nayharestay,idwana,idbealfrki) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
                    stmt.setDate(1, mealtawiHarestayBean.getOlet());  
                    stmt.setString(2, mealtawiHarestayBean.getZhader());
                    stmt.setDouble(3, mealtawiHarestayBean.getOyarGabya());
                    stmt.setDouble(4, mealtawiHarestayBean.getTarifMekina());
                    stmt.setString(5, mealtawiHarestayBean.getOaynetFruta());
                    stmt.setString(6, mealtawiHarestayBean.getFruyDekik());
                    stmt.setDouble(7, mealtawiHarestayBean.getTarifKabKilo());    
                    stmt.setInt(8, mealtawiHarestayBean.getBzhiGabya());
                    stmt.setDouble(9, mealtawiHarestayBean.getMizanBKilo());
                    stmt.setDouble(10, mealtawiHarestayBean.getWagaNKilo());
                    stmt.setDouble(11, mealtawiHarestayBean.getTeklalaWaga());
                    stmt.setDouble(12, mealtawiHarestayBean.getNayMekina());
                    stmt.setDouble(13, mealtawiHarestayBean.getNayTkal());
                    stmt.setDouble(14, mealtawiHarestayBean.getNayHarestay());
                    stmt.setInt(15, mealtawiHarestayBean.getIdWana());
                    if(mealtawiHarestayBean.getIdBealFrki() > 0)
                        stmt.setInt(16, mealtawiHarestayBean.getIdBealFrki());
                    else
                        stmt.setNull(16, INTEGER);
                    stmt.executeUpdate();
            }catch(SQLException ex){
                String exStr = "ናይ ሓረስታይ ክምዝገብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
                String errorType = "ጌጋ";
                ConnectionManager.message(exStr, errorType);
                return false;
            }
        return true;           
    }

    public static boolean updateWana(TblMealtawiHarestay mealtawiHarestayBean) throws SQLException{
        String sql = "select * from tblmealtawiharestay where Olet = ? and ዝሓደረ = ? and ዕያርጋብያ = ? and ታሪፍመኪና = ? and ዓይነትፍሩታ = ? and ፍሩይደቂቕ = ? and ታሪፍካብኪሎ = ? "
                + " and ዋጋንኪሎ = ? and idwana = ? and idbealfrki IS NULL";
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
            stmt.setDate(1, mealtawiHarestayBean.getOlet());
            stmt.setString(2, mealtawiHarestayBean.getZhader());
            stmt.setDouble(3, mealtawiHarestayBean.getOyarGabya());
            stmt.setDouble(4, mealtawiHarestayBean.getTarifMekina());
            stmt.setString(5, mealtawiHarestayBean.getOaynetFruta());
            stmt.setString(6, mealtawiHarestayBean.getFruyDekik());
            stmt.setDouble(7, mealtawiHarestayBean.getTarifKabKilo());
            stmt.setDouble(8, mealtawiHarestayBean.getWagaNKilo());
            stmt.setInt(9, mealtawiHarestayBean.getIdWana());
            
            rs = stmt.executeQuery();
            if(rs.next()){
                rs.updateInt("ብዝሒጋብያ", rs.getInt("ብዝሒጋብያ") + mealtawiHarestayBean.getBzhiGabya());
                rs.updateDouble("ሚዛንብኪሎ", rs.getDouble("ሚዛንብኪሎ") + mealtawiHarestayBean.getMizanBKilo());
                rs.updateDouble("ጠቕላላዋጋ", rs.getDouble("ጠቕላላዋጋ") + mealtawiHarestayBean.getTeklalaWaga());
                rs.updateDouble("ናይመኪና", rs.getDouble("ናይመኪና") + mealtawiHarestayBean.getNayMekina());
                rs.updateDouble("ናይትካል", rs.getDouble("ናይትካል") + mealtawiHarestayBean.getNayTkal());
                rs.updateDouble("nayharestay", rs.getDouble("nayharestay") + mealtawiHarestayBean.getNayHarestay());
                         
                rs.updateRow();
                return true;
            }else{
                //System.err.println("failed to update");
                return false;
            }
        }catch(SQLException ex){
            String exStr = "ናይ ሓረስታይ ክመሓየሽ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }finally{
            if(rs != null) rs.close();
        }
    }
    
    public static boolean updateBealFrki(TblMealtawiHarestay mealtawiHarestayBean) throws SQLException{
        String sql = "select * from tblmealtawiharestay where Olet = ? and ዝሓደረ = ? and ዕያርጋብያ = ? and ታሪፍመኪና = ? and ዓይነትፍሩታ = ? and ፍሩይደቂቕ = ? and ታሪፍካብኪሎ = ? "
                + " and ዋጋንኪሎ = ? and idwana = ? and idbealfrki = ?";
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
            stmt.setDate(1, mealtawiHarestayBean.getOlet());
            stmt.setString(2, mealtawiHarestayBean.getZhader());
            stmt.setDouble(3, mealtawiHarestayBean.getOyarGabya());
            stmt.setDouble(4, mealtawiHarestayBean.getTarifMekina());
            stmt.setString(5, mealtawiHarestayBean.getOaynetFruta());
            stmt.setString(6, mealtawiHarestayBean.getFruyDekik());
            stmt.setDouble(7, mealtawiHarestayBean.getTarifKabKilo());
            stmt.setDouble(8, mealtawiHarestayBean.getWagaNKilo());
            stmt.setInt(9, mealtawiHarestayBean.getIdWana());
            stmt.setInt(10, mealtawiHarestayBean.getIdBealFrki());
            rs = stmt.executeQuery();
            if(rs.next()){
                rs.updateInt("ብዝሒጋብያ", rs.getInt("ብዝሒጋብያ") + mealtawiHarestayBean.getBzhiGabya());
                rs.updateDouble("ሚዛንብኪሎ", rs.getDouble("ሚዛንብኪሎ") + mealtawiHarestayBean.getMizanBKilo());
                rs.updateDouble("ጠቕላላዋጋ", rs.getDouble("ጠቕላላዋጋ") + mealtawiHarestayBean.getTeklalaWaga());
                rs.updateDouble("ናይመኪና", rs.getDouble("ናይመኪና") + mealtawiHarestayBean.getNayMekina());
                rs.updateDouble("ናይትካል", rs.getDouble("ናይትካል") + mealtawiHarestayBean.getNayTkal());
                rs.updateDouble("nayharestay", rs.getDouble("nayharestay") + mealtawiHarestayBean.getNayHarestay());
                         
                rs.updateRow();
                return true;
            }else{
                //System.err.println("failed to update");
                return false;
            }
        }catch(SQLException ex){
            String exStr = "ናይ ሓረስታይ ክመሓየሽ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }finally{
            if(rs != null) rs.close();
        }
    }
   
    public static boolean deleteWana(int idWana) throws SQLException{
        String sql = "delete from tblmealtawiharestay where idwana = ? AND idbealfrki IS NULL";
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
            stmt.setInt(1, idWana);
                   
            int affected = stmt.executeUpdate();
            if(affected == 1){
                return true;
            }else{
                return false;
          }
        }catch(SQLException ex){
            String exStr = "ስም ሓረስታይ ክድምሰስ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }
    }
    
    public static boolean deleteBealFrki(int idWana, int idBealfrki) throws SQLException{
        String sql = "delete from tblmealtawiharestay where idwana = ? AND idbealfrki = ?";
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
            stmt.setInt(1, idWana);
            stmt.setInt(2, idBealfrki);         
            int affected = stmt.executeUpdate();
            if(affected == 1){
                return true;
            }else{
                return false;
          }
        }catch(SQLException ex){
            String exStr = "ስም ሓረስታይ ክድምሰስ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }
    }
    
    public static boolean deleteMealtawiHarestayOnOlet(Date sqlDateOfToday) throws SQLException{
        String sql = "delete from tblmealtawiharestay where olet < DATE_SUB( ? , INTERVAL 2 YEAR)";
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
            String exStr = "ስም ሓረስታይ ክድምሰስ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }
    }
}



