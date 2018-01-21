
package tkalMeshetiFrutaDB.tables;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import tkalMeshetFrutaDB.ConnectionManager;
import tkalMeshetiFrutaDB.beans.TblWel;

public class TblWelManager {
    
    private static Connection conn = ConnectionManager.getInstance().getConnection();
    private static List<String> oaynetFrutaList;
   
    public static boolean update(TblWel weliBean) throws SQLException{
        String sql = "select * from tblwel where oaynetfruta = ? and idbealfrki = ?";
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
            stmt.setString(1, weliBean.getOaynetFruta());          
            stmt.setInt(2, weliBean.getIdBealFrki());
            
            rs = stmt.executeQuery();
            if(rs.next()){
                rs.updateDouble("wel",  weliBean.getWel());
             
                rs.updateRow();
                return true;
            }else{
                //System.err.println("failed to update");
                return false;
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);            
            String exStr = "ወዕል ክመሓየሽ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }finally{
            if(rs != null) rs.close();
        }
    }
    
    public static TblWel getRowOnIdBealFrki(int idBealFrki) throws SQLException{
         if(conn == null){
           String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
           ConnectionManager.message(ex, errorType);
           return null;
       }
        String sql = "select * from tblwel where idbealfrki = ?";
        ResultSet rs = null;       
        try(
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);               
            ){
            stmt.setInt(1, idBealFrki);
            rs = stmt.executeQuery();
              if(rs.next()){                  
                  TblWel welBean = new TblWel();
                  welBean.setOaynetFruta(rs.getString("oaynetfruta"));
                  welBean.setWel(rs.getDouble("wel"));
                  welBean.setIdBealFrki(idBealFrki);
                  
                  return welBean;
              }else{
                  return null;
           }
        }catch(SQLException ex){
            String exStr = "ወዕል ክርከብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }finally{
        if(rs != null)
            rs.close();
        }        
    }    
    
    public static TblWel getRowOnOaynetFruta(int idBealFrki, String oaynetFruta) throws SQLException{
         if(conn == null){
           String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
           ConnectionManager.message(ex, errorType);
           return null;
       }
        String sql = "select * from tblwel where idbealfrki = ? and (oaynetfruta = 'ኩሉ ዓይነት' or oaynetfruta = ?) ";
        ResultSet rs = null;       
        try(
                //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);               
            ){
            stmt.setInt(1, idBealFrki);
            stmt.setString(2, oaynetFruta);
            rs = stmt.executeQuery();
              if(rs.next()){
                  
                  TblWel welBean = new TblWel();
                  welBean.setOaynetFruta(rs.getString("oaynetfruta"));
                  welBean.setWel(rs.getDouble("wel"));
                  welBean.setIdBealFrki(idBealFrki);
                  
                  return welBean;
              }else{
                  return null;
           }
        }catch(SQLException ex){
            String exStr = "ወዕል ክርከብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }finally{
        if(rs != null)
            rs.close();
        }        
    }
    
    public static List<String> getOaynetFrutaFromMealHarNotInWel(int idBealFrki) throws SQLException{      
    
        if(conn == null){
           String ex = "<html> EasyPHP ዘይተወልዐ ወይ ተቋሪጹ ከይከውን ኣረጋግጽ:"
                + "<br> እንተዘይተወሊዑ Start->All Programs->EasyPHP ጌርካ ወልዓዮ: </br>"
                + "<br>እንተተቋሪጹ ድማ: Right-Click EasyPHP icon from the sytem tray and choose Start </br> </html>";
            String errorType = "ጌጋ";
           ConnectionManager.message(ex, errorType);
           return null;
       }
        String sql = "select distinct ዓይነትፍሩታ from tblmealtawiharestay where idbealfrki = ? " 
            + "AND ዓይነትፍሩታ NOT IN (select distinct oaynetfruta from tblwel where idbealfrki = ?) " ;
    //  String sql = "select distinct ዓይነትፍሩታ  from tblmealtawiharestay where idbealfrki = ?";
//String sql = "select distinct a.idshekatay, a.sm from tblshekatay a join tblgabya b on a.idShekatay = b.idShekatay and gabyatemelisu = 'ነኖ'";
        ResultSet rs = null;
        try(
               //Connection conn = DBUtil.getConnection();
                PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);           
            ){
                    stmt.setInt(1, idBealFrki);    
                    stmt.setInt(2, idBealFrki);    
                    rs = stmt.executeQuery();
                 oaynetFrutaList = new ArrayList<>();   
                    oaynetFrutaList.add("");
            while(rs.next()){  
                oaynetFrutaList.add(rs.getString("ዓይነትፍሩታ"));                
          }             
               return oaynetFrutaList;
        }catch(SQLException ex){
           String exStr = "ወዕል ክርከብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return null;
        }        
    }    
    
    public static boolean insert(TblWel welBean) throws SQLException{
        String sql = "insert into tblwel (oaynetfruta, wel, idbealfrki)values (?,?,?)";
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
                    stmt.setString(1, welBean.getOaynetFruta());    
                    stmt.setDouble(2, welBean.getWel());
                    stmt.setInt(3, welBean.getIdBealFrki());
                    
                    stmt.executeUpdate();
            }catch(SQLException ex){
                String exStr = "ወዕል ክምዝገብ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
                String errorType = "ጌጋ";
                ConnectionManager.message(exStr, errorType);
                return false;
            }
        return true;           
    }
    
    public static boolean delete(int idBealFrki) throws SQLException{
        String sql = "delete from tblwel where idbealfrki = ?";
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
            String exStr = "ወዕል ክድምሰስ ኣይተኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(exStr, errorType);
            return false;
        }
    }
}
