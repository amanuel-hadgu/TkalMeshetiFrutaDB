
package tkalMeshetiFrutaDB.tables;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import tkalMeshetFrutaDB.ConnectionManager;
import tkalMeshetFrutaDB.NewJDialog;
import tkalMeshetFrutaDB.NewJFrame;
import tkalMeshetiFrutaDB.beans.TblShekatay;

public class TblShekatayManager {
     private static Connection conn = ConnectionManager.getInstance().getConnection();
    private static List<String> smShekatay;
    private static List<Integer> idShekatay;
    
    public static List<String> displayData() throws SQLException{
        if(conn == null){
           String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
           ConnectionManager.message(ex, errorType);
            //System.exit(0);
        }
       String sql = "select * from tblshekatay";
        try(
                //Connection conn = DBUtil.getConnection();
                Statement stmt = (Statement) conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                ){
            smShekatay = new ArrayList<>();
            smShekatay.add("");
            idShekatay = new ArrayList<>();
            idShekatay.add(0);
            while(rs.next()){  
                idShekatay.add(rs.getInt("idshekatay"));
                smShekatay.add(rs.getString("sm"));
          }             
            NewJFrame.setIdShekatay(idShekatay);
          NewJDialog.setIdShekatay(idShekatay);            
                return smShekatay;
        }catch(SQLException ex){
            String exStr = "ኣስማት ዓዳጎ ክረከብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }        
     }
    
    public static TblShekatay getRow(int idShekatay) throws SQLException{
        String sql = "select * from tblshekatay where idshekatay = ?";
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
            stmt.setInt(1, idShekatay);
            rs = stmt.executeQuery();
              if(rs.next()){
                  
                  TblShekatay shekatayBean = new TblShekatay();
                  shekatayBean.setIdShekatay(rs.getInt("idshekatay"));
                  shekatayBean.setSm(rs.getString("sm"));
                  shekatayBean.setGenzeb(rs.getDouble("genzeb"));
                  
                  return shekatayBean;
              }else{
                  return null;
           }
        }catch(SQLException ex){
            String exStr = "ስም ዓዳጋይ ክረከብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }finally{
        if(rs != null)
            rs.close();
        }
        
    }
    
    public static boolean insert(TblShekatay shekatayBean) throws SQLException{
        String sql = "insert into tblshekatay(sm,genzeb) values (?,?)";
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
                    stmt.setString(1, shekatayBean.getSm());    
                    stmt.setDouble(2, shekatayBean.getGenzeb());
                    stmt.executeUpdate();
            }catch(SQLException ex){
                String exStr = "<html>ስም ዓዳጋይ ክምዝገብ ኣይተኻእለን; ስም ኣቐዲሙ ተመዝጊቡ ከይህሉ ካብ ComboAdagay ኣረጋግጽ"
                        + "<br>አንተ ደኣ ባዕሉ ኮይኑ ካልኣይ ኣይትመዝግቦ፡ ካልእ ሰብ አንተ ኮይኑ ግን መፈላለዪ ግበረሎም</br></html>";                
                String errorType = "መጠንቀቕታ";
                ConnectionManager.message(exStr, errorType);
                return false;
            }finally{
        
          }
        return true;           
    }
    
    public static boolean update(TblShekatay shekatayBean) throws SQLException{
        String sql = "select * from tblshekatay where idshekatay = ?";
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
            stmt.setInt(1, shekatayBean.getIdShekatay());
            rs = stmt.executeQuery();
            if(rs.next()){    
                rs.updateDouble("genzeb", (rs.getDouble("genzeb") + shekatayBean.getGenzeb()));         
                             
                rs.updateRow();
                return true;
            }else{
                //System.err.println("failed to update");
                return false;
            }
        }catch(SQLException ex){
            String exStr = "ሕሳብ ዓዳጋይ ክመሓየሽ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }finally{
            if(rs != null) rs.close();
        }
    }
    
    public static boolean delete(int idShekatay) throws SQLException{
        String sql = "delete from tblshekatay where idshekatay = ?";
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
            String exStr = "ስም ዓዳጋይ ክድምሰስ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }
    }
}
