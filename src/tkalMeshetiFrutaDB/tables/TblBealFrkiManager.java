
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
import tkalMeshetiFrutaDB.beans.TblBealFrki;

public class TblBealFrkiManager {
    private static Connection conn = ConnectionManager.getInstance().getConnection();
    private static List<String> smBealFrki;
    private static List<Integer> idBealFrki;
    private static List<String> smOfAllBealFrki;
   private static List<Integer> idOfAllBealFrki;
   private static String strSmBealFrki;
    
    public static List<String> displayAllNames() throws SQLException{
        if(conn == null){
           String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
           ConnectionManager.message(ex, errorType);
            System.exit(0);
        }
       String sql = "select * from tblbealfrki";
        try(
                //Connection conn = DBUtil.getConnection();
                Statement stmt = (Statement) conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                ){
            smOfAllBealFrki = new ArrayList<>();            
            smOfAllBealFrki.add("");       
            idOfAllBealFrki = new ArrayList<>();
            idOfAllBealFrki.add(0);
            while(rs.next()){                  
                idOfAllBealFrki.add(rs.getInt("idbealfrki"));
                smOfAllBealFrki.add(rs.getString("sm"));
          }             
            NewJFrame.setIdOfAllBealFrki(idOfAllBealFrki);
                return smOfAllBealFrki;
        }catch(SQLException ex){
            String exStr = "ስም ሰብ ፍርቂ ክረከብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }        
     }
    
    public static List<String> displayNamesOnIdWana(int idWana) throws SQLException{
        String sql = "select * from tblbealfrki where idwana = ?";
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
            smBealFrki = new ArrayList<>();
            smBealFrki.add("ዋና ባዕሉ");
            idBealFrki = new ArrayList<>();
            idBealFrki.add(0);
            while(rs.next()){  
                idBealFrki.add(rs.getInt("idbealfrki"));
                smBealFrki.add(rs.getString("sm"));
          }        
            NewJFrame.setIdBealFrki(idBealFrki);
                    return smBealFrki;
        }catch(SQLException ex){
            String exStr = "ስም ሰብ ፍርቂ ክረከብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }finally{
        if(rs != null)
            rs.close();
        }
        
    }
    
    public static TblBealFrki getRow(int idBealFrki, int idWana) throws SQLException{
        String sql = "select * from tblbealfrki where idBealFrki = ? and idWana = ?";
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
            stmt.setInt(1, idBealFrki);
            stmt.setInt(2, idWana);
            rs = stmt.executeQuery();
              if(rs.next()){
                  
                  TblBealFrki bealFrkiBean = new TblBealFrki();
                  bealFrkiBean.setIdBealFrki(rs.getInt("idbealfrki"));
                  bealFrkiBean.setSm(rs.getString("sm"));
                  bealFrkiBean.setGenzeb(rs.getDouble("genzeb"));
                  bealFrkiBean.setIdWana(rs.getInt("idwana"));
                  
                  return bealFrkiBean;
              }else{
                  return null;
           }
        }catch(SQLException ex){
            String exStr = "ስም በዓል ፍርቂ ክረከብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }finally{
        if(rs != null)
            rs.close();
        }
        
    }
    
   public static TblBealFrki getRowOnSmNdIdWana(String sm, int idWana) throws SQLException{
        String sql = "select * from tblbealfrki where sm = ? and idWana = ?";
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
            stmt.setString(1, sm);
            stmt.setInt(2, idWana);
            rs = stmt.executeQuery();
              if(rs.next()){
                  
                  TblBealFrki bealFrkiBean = new TblBealFrki();
                  bealFrkiBean.setIdBealFrki(rs.getInt("idbealfrki"));
                  bealFrkiBean.setSm(rs.getString("sm"));
                  bealFrkiBean.setGenzeb(rs.getDouble("genzeb"));
                  bealFrkiBean.setIdWana(rs.getInt("idwana"));
                  
                  return bealFrkiBean;
              }else{
                  return null;
           }
        }catch(SQLException ex){
            String exStr = "ስም በዓል ፍርቂ ክረከብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }finally{
        if(rs != null)
            rs.close();
        }
        
    } 
    
    public static boolean insert(TblBealFrki bealFrkiBean) throws SQLException{
        String sql = "insert into tblbealfrki(sm,genzeb,idwana) values (?,?,?)";
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
                    stmt.setString(1, bealFrkiBean.getSm());    
                    stmt.setDouble(2, bealFrkiBean.getGenzeb());
                    stmt.setInt(3, bealFrkiBean.getIdWana());
                    stmt.executeUpdate();
           }catch(SQLException ex){
                String exStr = "<html>ስም በዓል ፍርቂ ክምዝገብ ኣይተኻእለን; ስም ኣቐዲሙ ተመዝጊቡ ከይህሉ ካብ ComboBealFrki ኣረጋግጽ"
                        + "<br>አንተ ደኣ ባዕሉ ኮይኑ ካልኣይ ኣይትመዝግቦ፡ ካልእ ሰብ አንተ ኮይኑ ግን መፈላለዪ ግበረሎም</br></html>";                
                String errorType = "መጠንቀቕታ";
                ConnectionManager.message(exStr, errorType);
                return false;
            }
        return true;           
    }
    
    public static boolean update(TblBealFrki bealFrkiBean) throws SQLException{
        String sql = "select * from tblbealfrki where idbealfrki = ?";
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
            stmt.setDouble(1, bealFrkiBean.getIdBealFrki());
            rs = stmt.executeQuery();
            if(rs.next()){
                rs.updateDouble("genzeb", rs.getDouble("genzeb") + bealFrkiBean.getGenzeb());
                
                rs.updateRow();
                return true;
            }else{
                //System.err.println("failed to update");
                return false;
            }
        }catch(SQLException ex){
            String exStr = "ስም በዓል ፍርቂ ክሕደስ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
                String errorType = "ጌጋ";
                ConnectionManager.message(exStr, errorType);
            return false;
        }finally{
            if(rs != null) rs.close();
        }
    }
    
    public static boolean delete(int idBealFrki) throws SQLException{
        String sql = "delete from tblbealfrki where idbealfrki = ?";
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
            stmt.setInt(1, idBealFrki);
            int affected = stmt.executeUpdate();
            if(affected == 1){
                return true;
            }else{
                return false;
          }
        }catch(SQLException ex){
            String exStr = "ስም በዓል ፍርቂ ክድምሰስ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
                String errorType = "ጌጋ";
                ConnectionManager.message(exStr, errorType);
            return false;
        }
    }    

}

