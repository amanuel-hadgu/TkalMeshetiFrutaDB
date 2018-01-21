
package tkalMeshetiFrutaDB.beans;

import java.sql.Date;

public class TblAtawiWetsaeiTkal {
    private Date olet;
    private String sm;
    private String atawiWetsaei;
    private String reason;
    private String description;
    private double genzeb;

    public Date getOlet() {
        return olet;
    }

    public void setOlet(Date olet) {
        this.olet = olet;
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    public String getAtawiWetsaei() {
        return atawiWetsaei;
    }

    public void setAtawiWetsaei(String atawiWetsaei) {
        this.atawiWetsaei = atawiWetsaei;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getGenzeb() {
        return genzeb;
    }

    public void setGenzeb(double genzeb) {
        this.genzeb = genzeb;
    }
  
    
}
