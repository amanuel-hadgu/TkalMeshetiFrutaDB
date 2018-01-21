
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
import tkalMeshetiFrutaDB.beans.TblGabya;

public class TblGabyaManager {
    
    private static Connection conn = ConnectionManager.getInstance().getConnection();
    private static List<String> smGabyaZeymelesu;
    private static List<String> smThjaZeytemelselom;    
    private static List<Integer> idThjaZeytemelselom;    
    private static List<Integer> idGabyaZeymelesu;    
    
    public static List<String> displayNamesNayGabyaZeymelesu() throws SQLException{       
       // String sql = "select distinct a.idshekatay, a.sm from tblshekatay a join tblgabya b on a.idShekatay = b.idShekatay where gabyatemelisu = 'እወ'";
       String sql = "select distinct a.idshekatay, a.sm from tblshekatay a join tblgabya b on a.idShekatay = b.idShekatay and gabyatemelisu = 'ነኖ'";
     
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
                Statement stmt = (Statement) conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                ){
            smGabyaZeymelesu = new ArrayList<>();
            smGabyaZeymelesu.add("");
            idGabyaZeymelesu = new ArrayList<>();
            idGabyaZeymelesu.add(0);
            while(rs.next()){  
                idGabyaZeymelesu.add(rs.getInt("idshekatay"));
                smGabyaZeymelesu.add(rs.getString("sm"));
          }             
            NewJFrame.setIdGabyaZeymelesu(idGabyaZeymelesu);
                return smGabyaZeymelesu;
        }catch(SQLException ex){
            String exStr = "ስም ጋብያ ዘይመለሱ ክርከብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }        
        
    }
    
    public static List<String> displayNamesThjaZeytemelselom() throws SQLException{       
       String sql = "select distinct a.idshekatay, a.sm from tblshekatay a join tblgabya b on a.idShekatay = b.idShekatay where gabyatemelisu = 'እወ'";
       //String sql = "select distinct a.idshekatay, a.sm from tblshekatay a join tblgabya b on a.idShekatay = b.idShekatay and gabyatemelisu = 'ነኖ'";
     
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
                Statement stmt = (Statement) conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                ){
            smThjaZeytemelselom = new ArrayList<>();
            smThjaZeytemelselom.add("");
            idThjaZeytemelselom = new ArrayList<>();
            idThjaZeytemelselom.add(0);
            while(rs.next()){  
                idThjaZeytemelselom.add(rs.getInt("idshekatay"));
                smThjaZeytemelselom.add(rs.getString("sm"));
          }             
            NewJFrame.setIdThjaZeytemelselom(idThjaZeytemelselom);
                return smThjaZeytemelselom;
        }catch(SQLException ex){
            String exStr = "ስም ትሕጃ ዘይመለሱ ክርከብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }        
        
    }
    
    public static TblGabya getGabyaTemelisuInfo(TblGabya gabyaBean) throws SQLException{
        String sql = "select * from tblgabya where idshekatay = ? and gabyatemelisu = ?";
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
            stmt.setInt(1, gabyaBean.getIdShekatay());
            stmt.setString(2, gabyaBean.getGabyaTemelisu());
            rs = stmt.executeQuery();
           int bzhiGabya = 0;
           int counter = 2;
           double tekelalaThja = 0;
           String qutsriGabya = "1. ";
             while(rs.next()){
                  qutsriGabya = qutsriGabya + rs.getString("qutsrigabya") + "\n" + counter + ". ";
                counter++;    
                  bzhiGabya++;
                  tekelalaThja = tekelalaThja + rs.getDouble("thja");
              }
             gabyaBean.setThja(tekelalaThja);
             gabyaBean.setQutsriGabya(qutsriGabya);
             gabyaBean.setIdShekatay(bzhiGabya);
              return gabyaBean;
        }catch(SQLException ex){
            String exStr = "ጋብያ ተመሊሱ ዲዩ ኣይተመልሰን ክፍለጥ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }finally{
        if(rs != null)
            rs.close();
        }
        
    }
    
    public static boolean insert(TblGabya gabyaBean) throws SQLException{
        String sql = "insert into tblgabya values (?,?,?,?,?)";
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
                    stmt.setString(1, gabyaBean.getQutsriGabya());    
                    stmt.setDouble(2, gabyaBean.getThja());
                    stmt.setDate(3, gabyaBean.getOlet());
                    stmt.setString(4, gabyaBean.getGabyaTemelisu());
                    stmt.setInt(5, gabyaBean.getIdShekatay());
                    stmt.executeUpdate();
            }catch(SQLException ex){
                String exStr = "<html>ቁጽሪ ጋብያ ኣቐዲሙ ተወሲዱ ኣይተመልሰን ዘሎ"
                        + "<br> ከም ብሓድሽ ብትኽክል መዝግብ</br></html>";                
                String errorType = "መጠንቀቕታ";
                ConnectionManager.message(exStr, errorType);
                return false;
            }
        return true;           
    }
    
    public static boolean updateNenoToEwe(String qutsriGabya) throws SQLException{
        String sql = "select * from tblgabya where qutsrigabya = ?";
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
            stmt.setString(1, qutsriGabya);
            rs = stmt.executeQuery();
            if(rs.next()){
                rs.updateString("gabyatemelisu", "እወ");
                    
                rs.updateRow();
                return true;
            }else{
                //System.err.println("failed to update");
                return false;
            }
        }catch(SQLException ex){
            String exStr = "ጋብያ ተመሊሱ ምዃኑ ምምዝጋብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }finally{
            if(rs != null) rs.close();
        }
    }
    
    public static boolean delete(String qutsriGabya) throws SQLException{
        String sql = "delete from tblgabya where qutsrigabya = ?";
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
            stmt.setString(1, qutsriGabya);
            int affected = stmt.executeUpdate();
            if(affected == 1){
                return true;
            }else{
                return false;
          }
        }catch(SQLException ex){
            String exStr = "ቁ.ጋብያ ምድምሳስ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }
    }
      public static boolean deleteonid(int idShekatay) throws SQLException{
        String sql = "delete from tblgabya where IdShekatay = ?";
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
            String exStr = "ጋብያ ተመሊሱ ዲዩ ኣይተመልሰን ክፍለጥ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }
    }

}
