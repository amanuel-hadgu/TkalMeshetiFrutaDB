
package tkalMeshetiFrutaDB.tables;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tkalMeshetFrutaDB.ConnectionManager;
import tkalMeshetFrutaDB.NewJFrame;
import tkalMeshetiFrutaDB.beans.TblWanaHarestay;

public class TblWanaHarestayManager {
    private static Connection conn = ConnectionManager.getInstance().getConnection();
    private static List<String> smWanaHarestay;
    private static List<Integer> idWana;
    
    public static List<String> displayData() throws SQLException{
        if(conn == null){
           String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
           ConnectionManager.message(ex, errorType);
            System.exit(0);
        }
       String sql = "select * from tblwanaharestay";
        try(
                //Connection conn = DBUtil.getConnection();
                Statement stmt = (Statement) conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                ){
            smWanaHarestay = new ArrayList<>();
            idWana = new ArrayList<>();
            smWanaHarestay.add("");
            idWana.add(0);
            while(rs.next()){            
               idWana.add(rs.getInt("idwana"));
                smWanaHarestay.add(rs.getString("sm"));
          }     
            NewJFrame.setIdWana(idWana);
                return smWanaHarestay;
        }catch(SQLException ex){
            String exStr = "ኣስማት ዋናታት ግራውቲ ክረከብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }        
     }
    
    public static TblWanaHarestay getRow(int idWana) throws SQLException{
        String sql = "select * from tblwanaharestay where idwana = ?";
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
            rs = stmt.executeQuery();
              if(rs.next()){
                  
                  TblWanaHarestay wanaHarestayBean = new TblWanaHarestay();
                  wanaHarestayBean.setSm(rs.getString("sm"));
                  wanaHarestayBean.setGenzeb(rs.getDouble("genzeb"));
                  
                  return wanaHarestayBean;
              }else{
                  return null;
           }
        }catch(SQLException ex){
            String exStr = "ስም ዋና ግራት ክረከብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }finally{
        if(rs != null)
            rs.close();
        }
        
    }
    
    public static boolean insert(TblWanaHarestay wanaHarestayBean) throws SQLException{
        String sql = "insert into tblwanaharestay(sm,genzeb) values (?,?)";
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
                    stmt.setString(1, wanaHarestayBean.getSm());    
                    stmt.setDouble(2, wanaHarestayBean.getGenzeb());
                    stmt.executeUpdate();
            }catch(SQLException ex){
                String exStr = "<html>ስም ዋና ግራት ክምዝገብ ኣይተኻእለን; ስም ኣቐዲሙ ተመዝጊቡ ከይህሉ ካብ ComboWana ኣረጋግጽ"
                        + "<br>አንተ ደኣ ባዕሉ ኮይኑ ካልኣይ ኣይትመዝግቦ፡ ካልእ ሰብ አንተ ኮይኑ ግን መፈላለዪ ግበረሎም</br></html>";                
                String errorType = "መጠንቀቕታ";
                ConnectionManager.message(exStr, errorType);
                return false;
            }finally{
        
          }
        return true;           
    }
    
    public static boolean update(TblWanaHarestay wanaHarestayBean) throws SQLException{
        String sql = "select * from tblwanaharestay where idwana = ?";
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
            stmt.setDouble(1, wanaHarestayBean.getIdWana());
            rs = stmt.executeQuery();
            if(rs.next()){
                rs.updateDouble("genzeb", rs.getDouble("genzeb") + wanaHarestayBean.getGenzeb());
                
                rs.updateRow();
                return true;
            }else{
                //System.err.println("failed to update");
                return false;
            }
        }catch(SQLException ex){
            String exStr = "ሕሳብ ዋና ግራት ክመሓየሽ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }finally{
            if(rs != null) rs.close();
        }
    }
    
    public static boolean delete(int idWana) throws SQLException{
        String sql = "delete from tblwanaharestay where idwana = ?";
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
            String exStr = "ስም ዋና ግራት ክድምሰስ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }
    }
    
}
