package tkalMeshetFrutaDB;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.CellEditorListener;
import javax.swing.event.ChangeEvent;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import tkalMeshetiFrutaDB.beans.TblGabya;
import tkalMeshetiFrutaDB.tables.TblBealFrkiManager;
import tkalMeshetiFrutaDB.tables.TblGabyaManager;
import tkalMeshetiFrutaDB.tables.TblShekatayManager;
import tkalMeshetiFrutaDB.tables.TblWanaHarestayManager;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import org.jdesktop.swingx.autocomplete.ComboBoxCellEditor;
import tkalMeshetiFrutaDB.beans.TblBealFrki;
import tkalMeshetiFrutaDB.beans.TblMealtawiHarestay;
import tkalMeshetiFrutaDB.beans.TblMealtawiShekatay;
import tkalMeshetiFrutaDB.beans.TblShekatay;
import tkalMeshetiFrutaDB.beans.TblWanaHarestay;
import tkalMeshetiFrutaDB.beans.TblWel;
import tkalMeshetiFrutaDB.beans.TblAtawiWetsaeiTkal;
import tkalMeshetiFrutaDB.tables.TblMealtawiHarestayManager;
import tkalMeshetiFrutaDB.tables.TblMealtawiShekatayManager;
import tkalMeshetiFrutaDB.tables.TblWelManager;
import tkalMeshetiFrutaDB.tables.TblAtawiWetsaeiTkalManager;

public class NewJFrame extends javax.swing.JFrame {

    NewJDialog jDialogShekatay;
    private static List<String> smWanaHarestay;
    private static List<String> smBealFrki;
    private static List<String> smtelekahi;
    private static List<String> smOfAllBealFrki;
    private static List<String> smShekatay;
    private static List<String> smGabyaZeymelesu;
    private static List<String> smThjaZeytemelselom;
    private static List<String> oaynetFrutaList;
    public static Date sqlDateOfToday;
    public static Date selectedSqlDate;
    public static Date sqlDateOfFactur;
    private static List<Integer> idWana;
    private static List<Integer> idBealFrki;
    private static List<Integer> idShekatay;
    private static List<Integer> idOfAllBealFrki;
    private static List<Integer> idGabyaZeymelesu;
    private static List<Integer> idThjaZeytemelselom;
    private static double teklalaWaga;
    private static double ztekefleWaga;
    private static double naymekina;
    private static double naytkal;
    private static double nayharestay;
    private static String zhader = "---";
    private static boolean oyarMaere;
    private static String oyarGabya;
    private static String oyarGabya1;
    private static int bzhigabya;
    private static int bzhigabyaCounter;
    private static String mizanBkilo;
    private static String wagaNKilo;
    private static String fruyDekik;
    private static String oaynetFruta;
    private static String test;
    private static Date mebegesiOlet;

    public NewJFrame() {

        try {
            smtelekahi = TblAtawiWetsaeiTkalManager.displayAllNames();
        } catch (SQLException ex) {
        }

        try {
            smBealFrki = TblBealFrkiManager.displayAllNames();
        } catch (SQLException ex) {
        }
        try {
            smWanaHarestay = TblWanaHarestayManager.displayData();
            //smWanaHarestay.
        } catch (SQLException ex) {
        }
        try {
            smShekatay = TblShekatayManager.displayData();
        } catch (SQLException ex) {
        }
        try {
            smGabyaZeymelesu = TblGabyaManager.displayNamesNayGabyaZeymelesu();
        } catch (SQLException ex) {
        }
        try {
            smThjaZeytemelselom = TblGabyaManager.displayNamesThjaZeytemelselom();
        } catch (SQLException ex) {
        }

        initComponents();

        AutoCompleteDecorator.decorate(cmbOaynetFruta);
        AutoCompleteDecorator.decorate(cmbOaynetFruta2);
        AutoCompleteDecorator.decorate(cmbOaynetFruta4);
        //AutoCompleteDecorator.decorate(cmbOaynetFruta5);
        AutoCompleteDecorator.decorate(cmbSmShekatay);
        AutoCompleteDecorator.decorate(cmbSmShekatay2);
        AutoCompleteDecorator.decorate(cmbSmShekatay3);
        AutoCompleteDecorator.decorate(cmbSmShekatay6);
        AutoCompleteDecorator.decorate(cmbSmShekatay7);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpTegemituAytegemeten = new javax.swing.ButtonGroup();
        btnGrpWanaBealFrki = new javax.swing.ButtonGroup();
        btnGrpGenzebZwesedoZetewo = new javax.swing.ButtonGroup();
        btnGrpGenzebZwesedoZetewo2 = new javax.swing.ButtonGroup();
        btnGrpGenzebZweZeteShekatay = new javax.swing.ButtonGroup();
        btnGrpZteshetZeyteshete = new javax.swing.ButtonGroup();
        btnGrpGenzebZwesedoZetewo3 = new javax.swing.ButtonGroup();
        rbtnGrpThjaTemelisuAytemelsen = new javax.swing.ButtonGroup();
        rbtnGrpWanaBealFrki = new javax.swing.ButtonGroup();
        rbtnGrpOyarMaereBebeynu = new javax.swing.ButtonGroup();
        rbtnGrpWelMaereBebeynu = new javax.swing.ButtonGroup();
        rbtnGrpWelMaereBebeynu1 = new javax.swing.ButtonGroup();
        rbtnGrpAtawiWetsae = new javax.swing.ButtonGroup();
        rbtnGrpsmWanaBealfrki = new javax.swing.ButtonGroup();
        rbtnGenzebZwededoZetewo4 = new javax.swing.ButtonGroup();
        rbtnGrptebtab = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        btnEtotFretat1 = new javax.swing.JButton();
        btnEtotFretat = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBzhiGabya = new javax.swing.JTextField();
        cmbDekikFruy = new javax.swing.JComboBox();
        txtMizanBKilo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbOaynetFruta = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtTarifMekina = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTarifKabKilo = new javax.swing.JTextField();
        txtWagaNKilo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rbtnTegemitu = new javax.swing.JRadioButton();
        rbtnAytegemeten = new javax.swing.JRadioButton();
        rbtnMaereOyar = new javax.swing.JRadioButton();
        txtOyarGabya = new javax.swing.JTextField();
        txtOyarGabya1 = new javax.swing.JTextField();
        rbtnOyarBebeynu = new javax.swing.JRadioButton();
        chkZhader = new java.awt.Checkbox();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbSmWanaHarestay = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmbSmBealFrki = new javax.swing.JComboBox();
        jxdpOlet = new org.jdesktop.swingx.JXDatePicker();
        jLabel26 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        cmbSmWanaHarestay1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmbSmBealFrki2 = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jPanel5 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cmbSmShekatay = new javax.swing.JComboBox();
        jLabel112 = new javax.swing.JLabel();
        txtGenzebLkah10 = new javax.swing.JTextField();
        txtMetenGenzeb11 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        rbtnMaereOyar1 = new javax.swing.JRadioButton();
        txtOyarGabya3 = new javax.swing.JTextField();
        rbtnOyarBebeynu1 = new javax.swing.JRadioButton();
        txtOyarGabya5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cmbOaynetFruta2 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        cmbFruyDekik2 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        txtBzhiGabya2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtMizanBKilo2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtWagaNKilo2 = new javax.swing.JTextField();
        btnShekato = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtQutsriGabya = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        btnThjaGabya = new javax.swing.JButton();
        txtThja = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtSmHarestay = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtSmAboHarestay = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtSmAboHagoHarestay = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        rbtnBealFrki = new javax.swing.JRadioButton();
        rbtnWanaBaelu = new javax.swing.JRadioButton();
        cmbSmWanaHarestay2 = new javax.swing.JComboBox();
        btnHadshHarestayMezgb = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        txtSmShekatay = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtSmAboShekatay = new javax.swing.JTextField();
        btnHadshShekatayMezgb = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        cmbSmWanaHarestay3 = new javax.swing.JComboBox();
        cmbSmBealFrki1 = new javax.swing.JComboBox();
        jLabel40 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        cmbOaynetFruta4 = new javax.swing.JComboBox();
        txtBtshitBealFrki1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        btnHadshHarestayMezgb1 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        cmbSmWanaHarestay6 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel90 = new javax.swing.JLabel();
        txtGenzebLkah4 = new javax.swing.JTextField();
        txtMetenGenzeb5 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        cmbSmBealFrki5 = new javax.swing.JComboBox();
        jButton7 = new javax.swing.JButton();
        jLabel103 = new javax.swing.JLabel();
        txtGenzebLkah9 = new javax.swing.JTextField();
        txtMetenGenzeb10 = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        cmbSmShekatay7 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel93 = new javax.swing.JLabel();
        txtGenzebLkah5 = new javax.swing.JTextField();
        txtMetenGenzeb6 = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        cmbSmShekatay3 = new javax.swing.JComboBox();
        txtQutsriGabya2 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtThja3 = new javax.swing.JTextField();
        btnThjaGabyaMewsedi = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        txtQutsriGabya3 = new javax.swing.JTextField();
        btnThjaGabyaMemlesi = new javax.swing.JButton();
        rbtnThjaTemelisu = new javax.swing.JRadioButton();
        rbtnThjaAytemelsen = new javax.swing.JRadioButton();
        jPanel24 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        cmbSmGabyaZeymelesu = new javax.swing.JComboBox();
        jLabel44 = new javax.swing.JLabel();
        txtBzhiGabya5 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAQutsriGabya = new javax.swing.JTextArea();
        jLabel43 = new javax.swing.JLabel();
        txtTeklalaThja2 = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtBzhiGabya6 = new javax.swing.JTextField();
        txtTeklalaThja = new javax.swing.JTextField();
        btnThjaTemelisu = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        cmbSmThjaZeytemelselom = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel15 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        cmbSmWanaHarestay7 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        cmbSmBealFrki6 = new javax.swing.JComboBox();
        jPanel28 = new javax.swing.JPanel();
        rbtnWelmaere = new javax.swing.JRadioButton();
        jLabel100 = new javax.swing.JLabel();
        txtWelMaereTekoynu = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        btnHsabHarestay = new javax.swing.JButton();
        rbtnWelBebeynu = new javax.swing.JRadioButton();
        jLabel102 = new javax.swing.JLabel();
        cmbOaynetFruta5 = new javax.swing.JComboBox();
        jLabel104 = new javax.swing.JLabel();
        txtWelMaereTezeykoynu = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        btnWelBebeynu = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        cmbSmWanaHarestay4 = new javax.swing.JComboBox();
        jLabel96 = new javax.swing.JLabel();
        txtGenzebLkah7 = new javax.swing.JTextField();
        txtMetenGenzeb8 = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        txtGenzebLkah6 = new javax.swing.JTextField();
        cmbSmBealFrki3 = new javax.swing.JComboBox();
        txtMetenGenzeb7 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        cmbSmTelekahi = new javax.swing.JComboBox();
        jLabel52 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        cmbSmBealFrki4 = new javax.swing.JComboBox();
        jLabel79 = new javax.swing.JLabel();
        txtGenzebLkah8 = new javax.swing.JTextField();
        txtMetenGenzeb9 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        rbtnZwesedoGenzeb7 = new javax.swing.JRadioButton();
        txtZwesedoGenzeb6 = new javax.swing.JTextField();
        rbtnZeetewoGenzeb7 = new javax.swing.JRadioButton();
        txtZeetewo5 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        txtMknayt1 = new javax.swing.JTextField();
        btnHarestayZeetwoZwesedoGen6 = new javax.swing.JButton();
        jLabel84 = new javax.swing.JLabel();
        cmbSmWanaHarestay5 = new javax.swing.JComboBox();
        jLabel78 = new javax.swing.JLabel();
        txtGenzebLkah3 = new javax.swing.JTextField();
        txtMetenGenzeb3 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        rbtnZwesedoGenzeb5 = new javax.swing.JRadioButton();
        txtZwesedoGenzeb5 = new javax.swing.JTextField();
        rbtnZeetewoGenzeb5 = new javax.swing.JRadioButton();
        txtZeetewo4 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        txtMknyat = new javax.swing.JTextField();
        btnHarestayZeetwoZwesedoGen5 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        cmbSmShekatay6 = new javax.swing.JComboBox();
        jLabel66 = new javax.swing.JLabel();
        txtGenzeLkah4 = new javax.swing.JTextField();
        txtMetenGenzeb4 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        rbtnZeetewoGenzeb2 = new javax.swing.JRadioButton();
        txtZeetewoGenzeb2 = new javax.swing.JTextField();
        rbtnZwesedoGenzeb2 = new javax.swing.JRadioButton();
        txtZwesedoGenzeb2 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        txtMknyata = new javax.swing.JTextField();
        btnHsabHarestay2 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        cmbReason = new javax.swing.JComboBox();
        jLabel51 = new javax.swing.JLabel();
        rbtnAtawi1 = new javax.swing.JRadioButton();
        rbtnWesaei1 = new javax.swing.JRadioButton();
        jPanel22 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel80 = new javax.swing.JLabel();
        cmbBzhiGabya3 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        txtOyarGabya4 = new javax.swing.JTextField();
        rbtnWesaei = new javax.swing.JRadioButton();
        rbtnAtawi = new javax.swing.JRadioButton();
        jLabel76 = new javax.swing.JLabel();
        cmbSmShekatay2 = new javax.swing.JComboBox();
        jPanel18 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        txtAtotMekina = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        txtAtotTkal = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        txtAtotHarestot = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        txtTeklalaGenzeb = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        txtZtekefleGenzeb = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        txtStartDate = new javax.swing.JTextField();
        jLabel113 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        txtEndDate = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        chkTeklalaHsab = new java.awt.Checkbox();
        jLabel88 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ትካል መሸጢ ፍሩታ");
        setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N

        jPanel9.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N

        jPanel29.setBackground(new java.awt.Color(204, 204, 204));
        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "መሸጢ እቶት", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N

        btnEtotFretat1.setBackground(new java.awt.Color(204, 204, 204));
        btnEtotFretat1.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnEtotFretat1.setText("ዓቅብ(Save)");
        btnEtotFretat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEtotFretat1ActionPerformed(evt);
            }
        });

        btnEtotFretat.setBackground(new java.awt.Color(204, 204, 204));
        btnEtotFretat.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnEtotFretat.setText("ናብ ዓዳጋይ ይሸየጥ(Save)");
        btnEtotFretat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEtotFretatActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel5.setText("ዓይነት ፍሩታ፡");

        jLabel9.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel9.setText("ሚዛን ብ ኪሎ፡");

        txtBzhiGabya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBzhiGabyaActionPerformed(evt);
            }
        });
        txtBzhiGabya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBzhiGabyaKeyTyped(evt);
            }
        });

        cmbDekikFruy.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbDekikFruy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ፍሩይ", "ማእከላይ", "ደቂቕ" }));
        cmbDekikFruy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDekikFruyActionPerformed(evt);
            }
        });

        txtMizanBKilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMizanBKiloActionPerformed(evt);
            }
        });
        txtMizanBKilo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMizanBKiloKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel7.setText("ብዝሒ ጋብያ፡");

        jLabel6.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel6.setText("ፍሩይ/ደቂቕ");

        cmbOaynetFruta.setEditable(true);
        cmbOaynetFruta.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbOaynetFruta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ኣራንሺ", "ኮሚደረ", "ፓፓዮ", "ጉዕ", "ባናና" }));
        cmbOaynetFruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOaynetFrutaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel4.setText("ታሪፍ መኪና ካብ ጋብያ፡");

        txtTarifMekina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTarifMekinaKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel8.setText("ታሪፍ ካብ ኪሎ፡");

        txtTarifKabKilo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTarifKabKiloKeyTyped(evt);
            }
        });

        txtWagaNKilo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWagaNKiloKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel10.setText("ዋጋ ን ኪሎ፡");

        btnGrpTegemituAytegemeten.add(rbtnTegemitu);
        rbtnTegemitu.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnTegemitu.setSelected(true);
        rbtnTegemitu.setText("ዋጋ ተገሚቱ");
        rbtnTegemitu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTegemituActionPerformed(evt);
            }
        });

        btnGrpTegemituAytegemeten.add(rbtnAytegemeten);
        rbtnAytegemeten.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnAytegemeten.setText("ዋጋ ኣይተገመተን");
        rbtnAytegemeten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAytegemetenActionPerformed(evt);
            }
        });

        rbtnGrpOyarMaereBebeynu.add(rbtnMaereOyar);
        rbtnMaereOyar.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnMaereOyar.setSelected(true);
        rbtnMaereOyar.setText("ዕያር ናይ ጋብያ፡");
        rbtnMaereOyar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMaereOyarActionPerformed(evt);
            }
        });

        txtOyarGabya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOyarGabyaActionPerformed(evt);
            }
        });
        txtOyarGabya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOyarGabyaKeyTyped(evt);
            }
        });

        txtOyarGabya1.setEnabled(false);
        txtOyarGabya1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOyarGabya1KeyTyped(evt);
            }
        });

        rbtnGrpOyarMaereBebeynu.add(rbtnOyarBebeynu);
        rbtnOyarBebeynu.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnOyarBebeynu.setText("ዕያር በበይኑ ምስ ዝኸውን ድምር የእቱ፡");
        rbtnOyarBebeynu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOyarBebeynuActionPerformed(evt);
            }
        });

        chkZhader.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkZhaderItemStateChanged(evt);
            }
        });
        chkZhader.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chkZhaderKeyPressed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel38.setText("ዝሓደረ");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Nyala", 3, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 0, 51));
        jLabel39.setText("ዝሽየጥ ዘሎ ፍረታት ዝሓደረ እዩ!");
        jLabel39.setVisible(false);

        jLabel1.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel1.setText("ስም ዋና ግራት፡");

        cmbSmWanaHarestay.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmWanaHarestay.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
        AutoCompleteDecorator.decorate(cmbSmWanaHarestay);
        ComboBoxCellEditor editor = new ComboBoxCellEditor(cmbSmWanaHarestay);
        CellEditorListener listener2 = new CellEditorListener() {
            @Override
            public void editingStopped(ChangeEvent e) {
                // do commit stuff
                try {
                    String smWanaStr = cmbSmWanaHarestay.getSelectedItem().toString();
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));                        
                    if (intIdWana > 0 ) {                          
                        try {
                            smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                            cmbSmBealFrki.setModel(new DefaultComboBoxModel(smBealFrki.toArray()));
                            cmbSmBealFrki.setSelectedIndex(0);
                            cmbSmBealFrki.requestFocus();
                        } catch (SQLException ex) {
                        }
                    }        
                } catch (Exception ex) {
                    String errorStr = "ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ";
                    String errorType = "ሓበሬታ";
                    ConnectionManager.message(errorStr, errorType);
                }
            }
            @Override
            public void editingCanceled(ChangeEvent e) {                        
            }
        };
        editor.addCellEditorListener(listener2);
        cmbSmWanaHarestay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmWanaHarestayActionPerformed(evt);
            }
        });
        cmbSmWanaHarestay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbSmWanaHarestayFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel2.setText("ስም በዓል ፍርቂ፡");

        cmbSmBealFrki.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmBealFrki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmBealFrkiActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel26.setText("ዕለት፡");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(btnEtotFretat1)
                                .addGap(109, 109, 109)
                                .addComponent(btnEtotFretat)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(txtBzhiGabya, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMizanBKilo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rbtnAytegemeten)
                                    .addComponent(rbtnTegemitu))
                                .addGap(34, 34, 34)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWagaNKilo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122))))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbSmWanaHarestay, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbSmBealFrki, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel29Layout.createSequentialGroup()
                                        .addGap(219, 219, 219)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbDekikFruy, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbOaynetFruta, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(203, 203, 203)))
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTarifMekina, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTarifKabKilo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 121, Short.MAX_VALUE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(rbtnOyarBebeynu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtOyarGabya1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                                .addComponent(rbtnMaereOyar)
                                .addGap(124, 124, 124)
                                .addComponent(txtOyarGabya, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(chkZhader, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel39)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jxdpOlet, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        jPanel29Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtOyarGabya, txtOyarGabya1});

        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38)
                        .addComponent(jLabel39)
                        .addComponent(jxdpOlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26))
                    .addComponent(chkZhader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbSmWanaHarestay)
                    .addComponent(jLabel2)
                    .addComponent(cmbSmBealFrki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOyarGabya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnMaereOyar))
                .addGap(8, 8, 8)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOyarGabya1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnOyarBebeynu))
                .addGap(18, 18, 18)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbOaynetFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDekikFruy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(txtTarifMekina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtTarifKabKilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBzhiGabya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(txtMizanBKilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtWagaNKilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbtnTegemitu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnAytegemeten)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEtotFretat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEtotFretat1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel29Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {chkZhader, jLabel38, jLabel39});

        jPanel29Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbOaynetFruta, jLabel5});

        jPanel29Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel7, jLabel9, rbtnTegemitu, txtBzhiGabya, txtMizanBKilo, txtWagaNKilo});

        jPanel29Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel4, jLabel8, txtTarifKabKilo, txtTarifMekina});

        jPanel29Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEtotFretat, btnEtotFretat1});

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ደዳለዊ ፋክቱር", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 14))); // NOI18N
        jPanel7.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N

        jButton8.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jButton8.setText("ፋክቱር");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        cmbSmWanaHarestay1.setEditable(true);
        cmbSmWanaHarestay1.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmWanaHarestay1.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
        AutoCompleteDecorator.decorate(cmbSmWanaHarestay1);
        ComboBoxCellEditor editor2 = new ComboBoxCellEditor(cmbSmWanaHarestay1);
        CellEditorListener listener3 = new CellEditorListener() {
            @Override
            public void editingStopped(ChangeEvent e) {
                // do commit stuff
                try {
                    String smWanaStr = cmbSmWanaHarestay1.getSelectedItem().toString();
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));                                    
                    if (intIdWana > 0) {
                        try {
                            smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                            cmbSmBealFrki2.setModel(new DefaultComboBoxModel(smBealFrki.toArray()));
                            cmbSmBealFrki2.setSelectedIndex(0);
                            cmbSmBealFrki2.requestFocus();
                        } catch (SQLException ex) {
                        }
                    }
                } catch (Exception ex) {
                    String errorStr = "<html>ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ</html>";
                    String errorType = "ሓበሬታ";
                    ConnectionManager.message(errorStr, errorType);
                }
            }
            @Override
            public void editingCanceled(ChangeEvent e) {                        
            }
        };
        editor2.addCellEditorListener(listener3);
        cmbSmWanaHarestay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmWanaHarestay1ActionPerformed(evt);
            }
        });
        cmbSmWanaHarestay1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbSmWanaHarestay1FocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel3.setText("ስም ዋና ግራት፡");

        jLabel13.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel13.setText("ስም በዓል ፍርቂ፡");

        cmbSmBealFrki2.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmBealFrki2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmBealFrki2ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel19.setText("ዕለት፡");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbSmBealFrki2, 0, 230, Short.MAX_VALUE)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbSmWanaHarestay1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButton8)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel7Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbSmBealFrki2, cmbSmWanaHarestay1});

        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbSmWanaHarestay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cmbSmBealFrki2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(562, 562, 562)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("እቶት ፍረታት ሓረስቶት", jPanel9);

        jPanel30.setBackground(new java.awt.Color(204, 204, 204));

        jLabel11.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel11.setText("ስም ዓዳጋይ፡");

        cmbSmShekatay.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmShekatay.setModel(new DefaultComboBoxModel(smShekatay.toArray()));
        cmbSmShekatay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmShekatayActionPerformed(evt);
            }
        });

        jLabel112.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel112.setText("ዘለዎ መጠን ");

        txtGenzebLkah10.setBackground(new java.awt.Color(238, 237, 237));
        txtGenzebLkah10.setEditable(false);
        txtGenzebLkah10.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtGenzebLkah10.setText("ገንዘብ/ልቃሕ");

        txtMetenGenzeb11.setEditable(false);

        jLabel111.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel111.setText("ናቕፋ እዩ።");

        rbtnGrpWelMaereBebeynu1.add(rbtnMaereOyar1);
        rbtnMaereOyar1.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnMaereOyar1.setSelected(true);
        rbtnMaereOyar1.setText("ዕያር ናይ ጋብያ፡");
        rbtnMaereOyar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMaereOyar1ActionPerformed(evt);
            }
        });

        txtOyarGabya3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOyarGabya3ActionPerformed(evt);
            }
        });
        txtOyarGabya3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOyarGabya3KeyTyped(evt);
            }
        });

        rbtnGrpWelMaereBebeynu1.add(rbtnOyarBebeynu1);
        rbtnOyarBebeynu1.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnOyarBebeynu1.setText("ዕያር በበይኑ ምስ ዝኸውን ድምር የእቱ፡");
        rbtnOyarBebeynu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOyarBebeynu1ActionPerformed(evt);
            }
        });

        txtOyarGabya5.setEnabled(false);
        txtOyarGabya5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOyarGabya5KeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel15.setText("ዓይነት ፍሩታ፡");

        cmbOaynetFruta2.setEditable(true);
        cmbOaynetFruta2.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbOaynetFruta2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ኣራንሺ", "ኮሚደረ", "ፓፓዮ", "ጉዕ", "ባናና" }));
        cmbOaynetFruta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOaynetFruta2ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel16.setText("ፍሩይ/ደቂቕ፡");

        cmbFruyDekik2.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbFruyDekik2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ፍሩይ", "ማእከላይ", "ደቂቕ" }));
        cmbFruyDekik2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFruyDekik2ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel17.setText("ብዝሒ ጋብያ፡");

        txtBzhiGabya2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBzhiGabya2ActionPerformed(evt);
            }
        });
        txtBzhiGabya2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBzhiGabya2FocusGained(evt);
            }
        });
        txtBzhiGabya2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBzhiGabya2KeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel18.setText("ሚዛን ብ ኪሎ፡");

        txtMizanBKilo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMizanBKilo2ActionPerformed(evt);
            }
        });
        txtMizanBKilo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMizanBKilo2KeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel14.setText("ዋጋ ን ኪሎ፡");

        txtWagaNKilo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtWagaNKilo2MouseExited(evt);
            }
        });
        txtWagaNKilo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWagaNKilo2ActionPerformed(evt);
            }
        });
        txtWagaNKilo2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWagaNKilo2FocusLost(evt);
            }
        });
        txtWagaNKilo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWagaNKilo2KeyTyped(evt);
            }
        });

        btnShekato.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnShekato.setText("ዓቅብ(Save)");
        btnShekato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShekatoActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ናይ ዝተወስደ ጋብያ ትሕጃ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel24.setText("ቁ.ጋብያ");

        txtQutsriGabya.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtQutsriGabya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQutsriGabyaActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel25.setText("ትሕጃ፡");

        btnThjaGabya.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnThjaGabya.setText("መዝግብ(Save)");
        btnThjaGabya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThjaGabyaActionPerformed(evt);
            }
        });

        txtThja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtThjaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQutsriGabya, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtThja, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnThjaGabya)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtQutsriGabya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(txtThja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnThjaGabya)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSmShekatay, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel112)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGenzebLkah10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMetenGenzeb11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel111))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(rbtnMaereOyar1)
                        .addGap(124, 124, 124)
                        .addComponent(txtOyarGabya3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(rbtnOyarBebeynu1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOyarGabya5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbOaynetFruta2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBzhiGabya2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbFruyDekik2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel30Layout.createSequentialGroup()
                                        .addComponent(txtMizanBKilo2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtWagaNKilo2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnShekato))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(55, 55, 55))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel112)
                        .addComponent(txtMetenGenzeb11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtGenzebLkah10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel111))
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(cmbSmShekatay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnMaereOyar1)
                    .addComponent(txtOyarGabya3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOyarGabya5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnOyarBebeynu1))
                .addGap(27, 27, 27)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cmbOaynetFruta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(cmbFruyDekik2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtBzhiGabya2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txtMizanBKilo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txtWagaNKilo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnShekato))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ናብ ዓዳጋይ መሸጢ", jPanel5);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "መመዝገቢ ሓረስታይ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel12.setText("ስም፡");

        txtSmHarestay.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel21.setText("ስም ኣቦ፡");

        txtSmAboHarestay.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel22.setText("ስም ኣቦሓጎ፡");

        txtSmAboHagoHarestay.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel23.setText("ስም ዋና፡ ");

        btnGrpWanaBealFrki.add(rbtnBealFrki);
        rbtnBealFrki.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnBealFrki.setText("በዓል ፍርቂ፡");
        rbtnBealFrki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnBealFrkiActionPerformed(evt);
            }
        });

        btnGrpWanaBealFrki.add(rbtnWanaBaelu);
        rbtnWanaBaelu.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnWanaBaelu.setSelected(true);
        rbtnWanaBaelu.setText("ባዕሉ ዋና፡");
        rbtnWanaBaelu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnWanaBaeluActionPerformed(evt);
            }
        });

        cmbSmWanaHarestay2.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmWanaHarestay2.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
        cmbSmWanaHarestay2.setEnabled(false);
        AutoCompleteDecorator.decorate(cmbSmWanaHarestay2);
        cmbSmWanaHarestay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmWanaHarestay2ActionPerformed(evt);
            }
        });

        btnHadshHarestayMezgb.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnHadshHarestayMezgb.setText("መዝግብ(Save)");
        btnHadshHarestayMezgb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHadshHarestayMezgbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnWanaBaelu)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSmHarestay, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(rbtnBealFrki)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSmAboHarestay, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSmAboHagoHarestay, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnHadshHarestayMezgb)
                                .addComponent(cmbSmWanaHarestay2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(txtSmHarestay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSmAboHarestay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSmAboHagoHarestay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(rbtnWanaBaelu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnBealFrki)
                    .addComponent(jLabel23)
                    .addComponent(cmbSmWanaHarestay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnHadshHarestayMezgb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "መመዝገቢ ዓዳጋይ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel27.setText("ስም፡");

        txtSmShekatay.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel28.setText("ስም ኣቦ፡");

        txtSmAboShekatay.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N

        btnHadshShekatayMezgb.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnHadshShekatayMezgb.setText("መዝግብ(Save)");
        btnHadshShekatayMezgb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHadshShekatayMezgbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSmShekatay, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSmAboShekatay, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnHadshShekatayMezgb)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtSmShekatay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(txtSmAboShekatay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnHadshShekatayMezgb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(204, 204, 204));
        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "መምልእን/መሐደስን ውዕል", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N

        jLabel36.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel36.setText("ስም ዋና፡ ");

        cmbSmWanaHarestay3.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmWanaHarestay3.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
        AutoCompleteDecorator.decorate(cmbSmWanaHarestay3);
        ComboBoxCellEditor editor5 = new ComboBoxCellEditor(cmbSmWanaHarestay3);
        CellEditorListener listener6 = new CellEditorListener() {
            @Override
            public void editingStopped(ChangeEvent e) {
                // do commit stuff
                try {
                    String smWanaStr = cmbSmWanaHarestay3.getSelectedItem().toString();
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));  
                    if(intIdWana > 0){
                        try {
                            smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                            cmbSmBealFrki1.setModel(new DefaultComboBoxModel(smBealFrki.toArray()));
                            cmbSmBealFrki1.setSelectedIndex(0);
                            cmbSmBealFrki1.requestFocus();
                        } catch (SQLException ex) {
                        }
                    }
                } catch (Exception ex) {
                    String errorStr = "ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ";
                    String errorType = "ሓበሬታ";
                    ConnectionManager.message(errorStr, errorType);
                }
            }
            @Override
            public void editingCanceled(ChangeEvent e) {                        
            }
        };
        editor5.addCellEditorListener(listener6);
        cmbSmWanaHarestay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmWanaHarestay3ActionPerformed(evt);
            }
        });

        cmbSmBealFrki1.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmBealFrki1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmBealFrki1ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel40.setText("ስም በዓል ፍርቂ፡ ");

        jLabel69.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel69.setText("ዓይነት ፍሩታ፡");

        cmbOaynetFruta4.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbOaynetFruta4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ኩሉ ዓይነት", "ኮሚደረ", "ኣራንሺ", "ፓፓዮ", "ባናና", "ጉዕ" }));
        cmbOaynetFruta4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOaynetFruta4ActionPerformed(evt);
            }
        });

        txtBtshitBealFrki1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBtshitBealFrki1ActionPerformed(evt);
            }
        });
        txtBtshitBealFrki1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBtshitBealFrki1KeyTyped(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel49.setText("ብጽሒት በዓል ፍርቂ(%)፡ ");

        btnHadshHarestayMezgb1.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnHadshHarestayMezgb1.setText("መዝግብ(Save)");
        btnHadshHarestayMezgb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHadshHarestayMezgb1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)
                            .addComponent(jLabel69))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbOaynetFruta4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSmWanaHarestay3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSmBealFrki1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnHadshHarestayMezgb1)
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addComponent(jLabel49)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtBtshitBealFrki1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(cmbSmWanaHarestay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(cmbSmBealFrki1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(cmbOaynetFruta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(txtBtshitBealFrki1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnHadshHarestayMezgb1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "መደምሰሲ ሓረስታይ/ዓዳጋይ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N

        jLabel89.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel89.setText("ስም ዋና ሓረስታይ፡");

        cmbSmWanaHarestay6.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmWanaHarestay6.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
        AutoCompleteDecorator.decorate(cmbSmWanaHarestay6);
        ComboBoxCellEditor editor8 = new ComboBoxCellEditor(cmbSmWanaHarestay6);
        CellEditorListener listener9 = new CellEditorListener() {
            @Override
            public void editingStopped(ChangeEvent e) {
                // do commit stuff
                try {
                    String smWanaStr = cmbSmWanaHarestay6.getSelectedItem().toString();
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));                        
                    if (intIdWana > 0 ) {                          
                        try {
                            TblWanaHarestay wanaHarestayBean = new TblWanaHarestay();
                            wanaHarestayBean = TblWanaHarestayManager.getRow(intIdWana);
                            if (wanaHarestayBean.getGenzeb() < 0) {
                                txtGenzebLkah4.setText("ልቓሕ");
                            } else {
                                txtGenzebLkah4.setText("ገንዘብ");
                            }

                            txtMetenGenzeb5.setText(wanaHarestayBean.getGenzeb() + "");
                            smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                            cmbSmBealFrki5.setModel(new DefaultComboBoxModel(smBealFrki.toArray()));
                            cmbSmBealFrki5.setSelectedIndex(0);
                            cmbSmBealFrki5.requestFocus();
                        } catch (SQLException ex) {
                        }
                    }        
                } catch (Exception ex) {
                    String errorStr = "ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ";
                    String errorType = "ሓበሬታ";
                    ConnectionManager.message(errorStr, errorType);
                }
            }
            @Override
            public void editingCanceled(ChangeEvent e) {                        
            }
        };
        editor8.addCellEditorListener(listener9);
        cmbSmWanaHarestay6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmWanaHarestay6ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jButton2.setText("ደምስስ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel90.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel90.setText("ዘለዎ መጠን ");

        txtGenzebLkah4.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtGenzebLkah4.setText("ገንዘብ/ልቃሕ");

        txtMetenGenzeb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMetenGenzeb5ActionPerformed(evt);
            }
        });

        jLabel91.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel91.setText("ናቕፋ እዩ።");

        jLabel97.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel97.setText("ስም በዓል ፍርቂ ፡");

        cmbSmBealFrki5.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmBealFrki5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmBealFrki5ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jButton7.setText("ደምስስ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel103.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel103.setText("ዘለዎ መጠን ");

        txtGenzebLkah9.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtGenzebLkah9.setText("ገንዘብ/ልቃሕ");

        txtMetenGenzeb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMetenGenzeb10ActionPerformed(evt);
            }
        });

        jLabel105.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel105.setText("ናቕፋ እዩ።");

        jLabel92.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel92.setText("ስም ዓዳጋይ፡");

        cmbSmShekatay7.setEditable(true);
        cmbSmShekatay7.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmShekatay7.setModel(new DefaultComboBoxModel(smShekatay.toArray()));
        cmbSmShekatay7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmShekatay7ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jButton1.setText("ደምስስ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel93.setText("ዘለዎ መጠን ");

        txtGenzebLkah5.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtGenzebLkah5.setText("ገንዘብ/ልቃሕ");

        jLabel94.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel94.setText("ናቕፋ እዩ።");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel97)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbSmBealFrki5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGenzebLkah4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMetenGenzeb5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel91))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSmWanaHarestay6, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton2))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel92)
                            .addComponent(jLabel103, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGenzebLkah9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(txtMetenGenzeb10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel105))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(cmbSmShekatay7, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGenzebLkah5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(txtMetenGenzeb6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel94)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(cmbSmWanaHarestay6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(txtMetenGenzeb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGenzebLkah4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97)
                    .addComponent(cmbSmBealFrki5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(txtMetenGenzeb10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGenzebLkah9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(cmbSmShekatay7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(txtMetenGenzeb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGenzebLkah5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel94))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(143, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("መመዝገቢ/መደምሰሲ ዓሚል", jPanel6);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ፎርም መውሰዲ ጋብያ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel29.setText("ስም፡");

        cmbSmShekatay3.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmShekatay3.setModel(new DefaultComboBoxModel(smShekatay.toArray()));
        cmbSmShekatay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmShekatay3ActionPerformed(evt);
            }
        });

        txtQutsriGabya2.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel33.setText("ቁ. ጋብያ");

        jLabel34.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel34.setText("ትሕጃ");

        txtThja3.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtThja3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtThja3KeyTyped(evt);
            }
        });

        btnThjaGabyaMewsedi.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnThjaGabyaMewsedi.setText("ዓቅብ(Save)");
        btnThjaGabyaMewsedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThjaGabyaMewsediActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btnThjaGabyaMewsedi))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSmShekatay3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQutsriGabya2)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtThja3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(cmbSmShekatay3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQutsriGabya2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThja3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33))
                .addGap(27, 27, 27)
                .addComponent(btnThjaGabyaMewsedi)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ፎርም መምለሲ ጋብያ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N

        jLabel37.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel37.setText("ቁ. ጋብያ");

        txtQutsriGabya3.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N

        btnThjaGabyaMemlesi.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnThjaGabyaMemlesi.setText("ዓቅብ(Save)");
        btnThjaGabyaMemlesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThjaGabyaMemlesiActionPerformed(evt);
            }
        });

        rbtnGrpThjaTemelisuAytemelsen.add(rbtnThjaTemelisu);
        rbtnThjaTemelisu.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnThjaTemelisu.setSelected(true);
        rbtnThjaTemelisu.setText("ትሕጃ ተመሊሱ");
        rbtnThjaTemelisu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnThjaTemelisuActionPerformed(evt);
            }
        });

        rbtnGrpThjaTemelisuAytemelsen.add(rbtnThjaAytemelsen);
        rbtnThjaAytemelsen.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnThjaAytemelsen.setText("ትሕጃ ኣይተመልሰን");
        rbtnThjaAytemelsen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnThjaAytemelsenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnThjaGabyaMemlesi))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnThjaAytemelsen)
                            .addComponent(rbtnThjaTemelisu)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQutsriGabya3)))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtQutsriGabya3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnThjaTemelisu)
                .addGap(14, 14, 14)
                .addComponent(rbtnThjaAytemelsen)
                .addGap(16, 16, 16)
                .addComponent(btnThjaGabyaMemlesi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(204, 204, 204));
        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ኣስማት ጋብያ ዘይመለሱ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel30.setText("ስም፡");

        cmbSmGabyaZeymelesu.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmGabyaZeymelesu.setModel(new DefaultComboBoxModel(smGabyaZeymelesu.toArray()));
        cmbSmGabyaZeymelesu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmGabyaZeymelesuActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel44.setText("ብዝሒ ጋብያ");

        txtBzhiGabya5.setEditable(false);
        txtBzhiGabya5.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel35.setText("ቁ. ጋብያታት");

        txtAQutsriGabya.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtAQutsriGabya.setRows(5);
        jScrollPane1.setViewportView(txtAQutsriGabya);

        jLabel43.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel43.setText(" ጠቕላላ ትሕጃ");

        txtTeklalaThja2.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtTeklalaThja2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeklalaThja2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSmGabyaZeymelesu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(224, 224, 224))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBzhiGabya5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTeklalaThja2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(cmbSmGabyaZeymelesu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel43)
                        .addComponent(txtTeklalaThja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel44)
                        .addComponent(txtBzhiGabya5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(204, 204, 204));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "መምለሲ ትሕጃ ንትሕጃ ዘይተመልሰሎም  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N

        jLabel47.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel47.setText("ብዝሒ ጋብያ");

        jLabel46.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel46.setText("ጠቅላላ ትሕጃ ");

        txtBzhiGabya6.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N

        txtTeklalaThja.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtTeklalaThja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeklalaThjaActionPerformed(evt);
            }
        });

        btnThjaTemelisu.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnThjaTemelisu.setText("ትሕጃ ተመሊሱ");
        btnThjaTemelisu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThjaTemelisuActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel42.setText("ስም፡");

        cmbSmThjaZeytemelselom.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmThjaZeytemelselom.setModel(new DefaultComboBoxModel(smThjaZeytemelselom.toArray()));
        cmbSmThjaZeytemelselom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmThjaZeytemelselomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSmThjaZeytemelselom, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnThjaTemelisu)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBzhiGabya6))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel25Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTeklalaThja, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbSmThjaZeytemelselom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel47)
                    .addComponent(txtBzhiGabya6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtTeklalaThja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnThjaTemelisu)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("     ናይ ጋብያ     ", jPanel8);

        jTabbedPane4.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "መዳለዊ ፋክቱር", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N
        jPanel15.setFocusTraversalPolicyProvider(true);
        jPanel15.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N

        jButton10.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jButton10.setText("ጸብጻብ");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        cmbSmWanaHarestay7.setEditable(true);
        cmbSmWanaHarestay7.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmWanaHarestay7.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
        AutoCompleteDecorator.decorate(cmbSmWanaHarestay7);
        ComboBoxCellEditor editor7 = new ComboBoxCellEditor(cmbSmWanaHarestay7);
        CellEditorListener listener8 = new CellEditorListener() {
            @Override
            public void editingStopped(ChangeEvent e) {
                // do commit stuff
                try {
                    String smWanaStr = cmbSmWanaHarestay7.getSelectedItem().toString();
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));                        
                    if (intIdWana > 0 ) {                          
                        try {
                            smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                            cmbSmBealFrki6.setModel(new DefaultComboBoxModel(smBealFrki.toArray()));
                            cmbSmBealFrki6.setSelectedIndex(0);
                            cmbSmBealFrki6.requestFocus();
                        } catch (SQLException ex) {
                        }
                    }        
                } catch (Exception ex) {
                    String errorStr = "ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ";
                    String errorType = "ሓበሬታ";
                    ConnectionManager.message(errorStr, errorType);
                }
            }
            @Override
            public void editingCanceled(ChangeEvent e) {                        
            }
        };
        editor7.addCellEditorListener(listener8);
        cmbSmWanaHarestay7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmWanaHarestay7ActionPerformed(evt);
            }
        });
        cmbSmWanaHarestay7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbSmWanaHarestay7FocusLost(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel20.setText("ስም ዋና ግራት፡");

        jLabel50.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel50.setText("ስም በዓል ፍርቂ፡");

        cmbSmBealFrki6.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmBealFrki6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmBealFrki6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbSmWanaHarestay7, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSmBealFrki6, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 31, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jButton10)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cmbSmWanaHarestay7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(cmbSmBealFrki6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addContainerGap())
        );

        jPanel28.setBackground(new java.awt.Color(204, 204, 204));
        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "መዳለዊ ሓሳብ ሓረስታይ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N

        rbtnGrpWelMaereBebeynu.add(rbtnWelmaere);
        rbtnWelmaere.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnWelmaere.setText("ናይ ኩሉ ዓይነት ፍሩታ ውዕል ማዕረ እንተኮይኑ");
        rbtnWelmaere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnWelmaereActionPerformed(evt);
            }
        });

        jLabel100.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel100.setText("ውዕል");

        txtWelMaereTekoynu.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtWelMaereTekoynu.setEnabled(false);
        txtWelMaereTekoynu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWelMaereTekoynuActionPerformed(evt);
            }
        });
        txtWelMaereTekoynu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWelMaereTekoynuKeyTyped(evt);
            }
        });

        jLabel101.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel101.setText("% ን በዓል ፍርቂ");

        btnHsabHarestay.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnHsabHarestay.setText("ዓቅብ(save)");
        btnHsabHarestay.setToolTipText(" ");
        btnHsabHarestay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHsabHarestayActionPerformed(evt);
            }
        });

        rbtnGrpWelMaereBebeynu.add(rbtnWelBebeynu);
        rbtnWelBebeynu.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnWelBebeynu.setSelected(true);
        rbtnWelBebeynu.setText("ውዕል ማዕረ እንተዘይ ኮይኑ");
        rbtnWelBebeynu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnWelBebeynuActionPerformed(evt);
            }
        });

        jLabel102.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel102.setText("ዓይነት ፍሩታ");

        cmbOaynetFruta5.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbOaynetFruta5.setToolTipText("");
        cmbOaynetFruta5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOaynetFruta5ActionPerformed(evt);
            }
        });

        jLabel104.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel104.setText("ውዕል");

        txtWelMaereTezeykoynu.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtWelMaereTezeykoynu.setEnabled(false);
        txtWelMaereTezeykoynu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWelMaereTezeykoynuActionPerformed(evt);
            }
        });
        txtWelMaereTezeykoynu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWelMaereTezeykoynuKeyTyped(evt);
            }
        });

        jLabel109.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel109.setText("% ን በዓል ፍርቂ");

        btnWelBebeynu.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnWelBebeynu.setText("ዓቅብ(save)");
        btnWelBebeynu.setToolTipText(" ");
        btnWelBebeynu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWelBebeynuActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel31.setText("ስም ዋና ግራት፡");

        cmbSmWanaHarestay4.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmWanaHarestay4.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
        AutoCompleteDecorator.decorate(cmbSmWanaHarestay4);
        ComboBoxCellEditor editor6 = new ComboBoxCellEditor(cmbSmWanaHarestay4);
        CellEditorListener listener7 = new CellEditorListener() {
            @Override
            public void editingStopped(ChangeEvent e) {
                // do commit stuff
                try {
                    String smWanaStr = cmbSmWanaHarestay4.getSelectedItem().toString();
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));                        
                    if (intIdWana > 0 ) {                          
                        try {
                            TblWanaHarestay wanaHarestayBean = new TblWanaHarestay();
                            wanaHarestayBean = TblWanaHarestayManager.getRow(intIdWana);
                            if (wanaHarestayBean.getGenzeb() < 0) {
                                txtGenzebLkah7.setText("ልቓሕ");
                            } else {
                                txtGenzebLkah7.setText("ገንዘብ");
                            }
                            txtMetenGenzeb8.setText(wanaHarestayBean.getGenzeb() + "");

                            smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                            cmbSmBealFrki3.setModel(new DefaultComboBoxModel(smBealFrki.toArray()));
                            cmbSmBealFrki3.setSelectedIndex(0);
                            cmbSmBealFrki3.requestFocus();
                        } catch (SQLException ex) {
                        }
                    }        
                } catch (Exception ex) {
                    String errorStr = "ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ";
                    String errorType = "ሓበሬታ";
                    ConnectionManager.message(errorStr, errorType);
                }
            }
            @Override
            public void editingCanceled(ChangeEvent e) {                        
            }
        };
        editor6.addCellEditorListener(listener7);
        cmbSmWanaHarestay4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmWanaHarestay4ActionPerformed(evt);
            }
        });

        jLabel96.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel96.setText("ዘለዎ መጠን ");

        txtGenzebLkah7.setEditable(false);
        txtGenzebLkah7.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtGenzebLkah7.setText("ገንዘብ/ልቃሕ");

        txtMetenGenzeb8.setEditable(false);

        jLabel108.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel108.setText("ናቕፋ እዩ።");

        jLabel45.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel45.setText("ስም በዓል ፍርቂ፡");

        jLabel95.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel95.setText("ዘለዎ መጠን ");

        txtGenzebLkah6.setEditable(false);
        txtGenzebLkah6.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtGenzebLkah6.setText("ገንዘብ/ልቃሕ");

        cmbSmBealFrki3.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmBealFrki3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmBealFrki3ActionPerformed(evt);
            }
        });

        txtMetenGenzeb7.setEditable(false);

        jLabel107.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel107.setText("ናቕፋ እዩ።");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel28Layout.createSequentialGroup()
                            .addComponent(jLabel31)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbSmWanaHarestay4, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel28Layout.createSequentialGroup()
                            .addComponent(jLabel96)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtGenzebLkah7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMetenGenzeb8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel108)))
                    .addComponent(rbtnWelmaere)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnHsabHarestay))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel100)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWelMaereTekoynu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel101)))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(btnWelBebeynu)
                                .addGap(167, 167, 167))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(rbtnWelBebeynu)
                                .addGap(98, 98, 98))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbOaynetFruta5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel104)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWelMaereTezeykoynu, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel109)))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbSmBealFrki3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addComponent(jLabel95)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGenzebLkah6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMetenGenzeb7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel107)))
                        .addContainerGap())))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(cmbSmWanaHarestay4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel96)
                            .addComponent(txtMetenGenzeb8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGenzebLkah7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel108)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(cmbSmBealFrki3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGenzebLkah6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel95)
                            .addComponent(jLabel107)
                            .addComponent(txtMetenGenzeb7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(rbtnWelmaere)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel100)
                            .addComponent(txtWelMaereTekoynu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel101))
                        .addGap(18, 18, 18)
                        .addComponent(btnHsabHarestay))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(rbtnWelBebeynu)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel102)
                            .addComponent(jLabel104)
                            .addComponent(txtWelMaereTezeykoynu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbOaynetFruta5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel109))
                        .addGap(18, 18, 18)
                        .addComponent(btnWelBebeynu)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("ሕሳብ ሓረስታይ", jPanel13);

        jPanel19.setBackground(new java.awt.Color(204, 204, 204));
        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "መራዪ ጸብጻብ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N
        jPanel19.setFocusTraversalPolicyProvider(true);
        jPanel19.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N

        jButton12.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jButton12.setText("ጸብጻብ");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        cmbSmTelekahi.setEditable(true);
        cmbSmTelekahi.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmTelekahi.setModel(new DefaultComboBoxModel(smtelekahi.toArray())
        );
        AutoCompleteDecorator.decorate(cmbSmTelekahi);
        cmbSmTelekahi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmTelekahiActionPerformed(evt);
            }
        });
        cmbSmTelekahi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbSmTelekahiFocusLost(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel52.setText("ስም ፡");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbSmTelekahi, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jButton12)
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(cmbSmTelekahi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(204, 204, 204));
        jPanel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ናይ ሓረስቶት", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N

        jLabel85.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel85.setText("ስም በዓል ፍርቂ");

        cmbSmBealFrki4.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmBealFrki4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmBealFrki4ActionPerformed(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel79.setText("ዘለዎ መጠን ");

        txtGenzebLkah8.setEditable(false);
        txtGenzebLkah8.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtGenzebLkah8.setText("ገንዘብ/ልቃሕ");

        txtMetenGenzeb9.setEditable(false);

        jLabel110.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel110.setText("ናቕፋ እዩ።");

        rbtnGenzebZwededoZetewo4.add(rbtnZwesedoGenzeb7);
        rbtnZwesedoGenzeb7.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnZwesedoGenzeb7.setSelected(true);
        rbtnZwesedoGenzeb7.setText("ዝወሰዶ ገንዘብ፡");
        rbtnZwesedoGenzeb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnZwesedoGenzeb7ActionPerformed(evt);
            }
        });

        txtZwesedoGenzeb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZwesedoGenzeb6ActionPerformed(evt);
            }
        });
        txtZwesedoGenzeb6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtZwesedoGenzeb6KeyTyped(evt);
            }
        });

        rbtnGenzebZwededoZetewo4.add(rbtnZeetewoGenzeb7);
        rbtnZeetewoGenzeb7.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnZeetewoGenzeb7.setText("ዘእተዎ ገንዘብ፡");
        rbtnZeetewoGenzeb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnZeetewoGenzeb7ActionPerformed(evt);
            }
        });

        txtZeetewo5.setEnabled(false);
        txtZeetewo5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtZeetewo5KeyTyped(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel83.setText("መኽንያት፡");

        txtMknayt1.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtMknayt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMknayt1KeyTyped(evt);
            }
        });

        btnHarestayZeetwoZwesedoGen6.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnHarestayZeetwoZwesedoGen6.setText("ዓቅብ(Save)");
        btnHarestayZeetwoZwesedoGen6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHarestayZeetwoZwesedoGen6ActionPerformed(evt);
            }
        });

        jLabel84.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel84.setText("ስም ዋና ግራት፡");

        cmbSmWanaHarestay5.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmWanaHarestay5.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
        AutoCompleteDecorator.decorate(cmbSmWanaHarestay5);
        ComboBoxCellEditor editor9 = new ComboBoxCellEditor(cmbSmWanaHarestay5);
        CellEditorListener listener10 = new CellEditorListener() {
            @Override
            public void editingStopped(ChangeEvent e) {
                // do commit stuff
                try {
                    String smWanaStr = cmbSmWanaHarestay5.getSelectedItem().toString();
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));                        
                    if (intIdWana > 0 ) {    
                        TblWanaHarestay wanaHarestayBean = new TblWanaHarestay();                
                        try {
                            wanaHarestayBean = TblWanaHarestayManager.getRow(intIdWana);
                            smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                            cmbSmBealFrki4.setModel(new DefaultComboBoxModel(smBealFrki.toArray()));
                            cmbSmBealFrki4.setSelectedIndex(0);
                            cmbSmBealFrki4.requestFocus();
                        } catch (SQLException ex) {
                        }
                        if (wanaHarestayBean.getGenzeb() < 0) {
                            txtGenzebLkah3.setText("ልቓሕ");
                        } else {
                            txtGenzebLkah3.setText("ገንዘብ");
                        }

                        txtMetenGenzeb3.setText(wanaHarestayBean.getGenzeb() + "");
                    }        
                } catch (Exception ex) {
                    String errorStr = "ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ";
                    String errorType = "ሓበሬታ";
                    ConnectionManager.message(errorStr, errorType);
                }
            }
            @Override
            public void editingCanceled(ChangeEvent e) {                        
            }
        };
        editor9.addCellEditorListener(listener10);
        cmbSmWanaHarestay5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmWanaHarestay5ActionPerformed(evt);
            }
        });

        jLabel78.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel78.setText("ዘለዎ መጠን ");

        txtGenzebLkah3.setEditable(false);
        txtGenzebLkah3.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtGenzebLkah3.setText("ገንዘብ/ልቃሕ");

        txtMetenGenzeb3.setEditable(false);

        jLabel106.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel106.setText("ናቕፋ እዩ።");

        btnGrpGenzebZwesedoZetewo3.add(rbtnZwesedoGenzeb5);
        rbtnZwesedoGenzeb5.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnZwesedoGenzeb5.setSelected(true);
        rbtnZwesedoGenzeb5.setText("ዝወሰዶ ገንዘብ፡");
        rbtnZwesedoGenzeb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnZwesedoGenzeb5ActionPerformed(evt);
            }
        });

        txtZwesedoGenzeb5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtZwesedoGenzeb5KeyTyped(evt);
            }
        });

        btnGrpGenzebZwesedoZetewo3.add(rbtnZeetewoGenzeb5);
        rbtnZeetewoGenzeb5.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnZeetewoGenzeb5.setText("ዘእተዎ ገንዘብ፡");
        rbtnZeetewoGenzeb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnZeetewoGenzeb5ActionPerformed(evt);
            }
        });

        txtZeetewo4.setEnabled(false);
        txtZeetewo4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtZeetewo4KeyTyped(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel81.setText("መኽንያት፡");

        txtMknyat.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtMknyat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMknyatKeyTyped(evt);
            }
        });

        btnHarestayZeetwoZwesedoGen5.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnHarestayZeetwoZwesedoGen5.setText("ዓቅብ(Save)");
        btnHarestayZeetwoZwesedoGen5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHarestayZeetwoZwesedoGen5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rbtnZeetewoGenzeb5)
                                .addComponent(rbtnZwesedoGenzeb5))
                            .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHarestayZeetwoZwesedoGen5)
                            .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtMknyat)
                                .addComponent(txtZwesedoGenzeb5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtZeetewo4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel26Layout.createSequentialGroup()
                            .addComponent(jLabel84)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbSmWanaHarestay5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                            .addComponent(jLabel78)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtGenzebLkah3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMetenGenzeb3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(jLabel106)
                            .addGap(10, 10, 10))))
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel26Layout.createSequentialGroup()
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rbtnZeetewoGenzeb7)
                                    .addComponent(rbtnZwesedoGenzeb7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtZwesedoGenzeb6)
                                    .addComponent(txtZeetewo5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(jLabel83)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnHarestayZeetwoZwesedoGen6)
                                    .addComponent(txtMknayt1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGenzebLkah8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMetenGenzeb9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel110))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSmBealFrki4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbSmWanaHarestay5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel84))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel78)
                            .addComponent(txtMetenGenzeb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGenzebLkah3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel106))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtZwesedoGenzeb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnZwesedoGenzeb5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtZeetewo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnZeetewoGenzeb5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMknyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHarestayZeetwoZwesedoGen5)
                            .addComponent(btnHarestayZeetwoZwesedoGen6)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbSmBealFrki4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel85))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel79)
                            .addComponent(txtMetenGenzeb9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel110)
                            .addComponent(txtGenzebLkah8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtZwesedoGenzeb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnZwesedoGenzeb7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtZeetewo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnZeetewoGenzeb7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMknayt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel83))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel26Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel110, jLabel79, txtGenzebLkah8, txtMetenGenzeb9});

        jPanel27.setBackground(new java.awt.Color(204, 204, 204));
        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ናይ ዓዳጎ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N

        jLabel58.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel58.setText("ስም ዓዳጋይ፡");

        cmbSmShekatay6.setEditable(true);
        cmbSmShekatay6.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmShekatay6.setModel(new DefaultComboBoxModel(smShekatay.toArray()));
        cmbSmShekatay6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmShekatay6ActionPerformed(evt);
            }
        });

        jLabel66.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel66.setText("ዘለዎ መጠን ");

        txtGenzeLkah4.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtGenzeLkah4.setText("ገንዘብ/ለቃሕ");
        txtGenzeLkah4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenzeLkah4ActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel67.setText("ናቕፋ እዩ።");

        btnGrpGenzebZweZeteShekatay.add(rbtnZeetewoGenzeb2);
        rbtnZeetewoGenzeb2.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnZeetewoGenzeb2.setSelected(true);
        rbtnZeetewoGenzeb2.setText("ዘእተዎ ገንዘብ፡");
        rbtnZeetewoGenzeb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnZeetewoGenzeb2ActionPerformed(evt);
            }
        });

        txtZeetewoGenzeb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZeetewoGenzeb2ActionPerformed(evt);
            }
        });
        txtZeetewoGenzeb2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtZeetewoGenzeb2KeyTyped(evt);
            }
        });

        btnGrpGenzebZweZeteShekatay.add(rbtnZwesedoGenzeb2);
        rbtnZwesedoGenzeb2.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnZwesedoGenzeb2.setText("ዝወሰዶ ገንዘብ፡");
        rbtnZwesedoGenzeb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnZwesedoGenzeb2ActionPerformed(evt);
            }
        });

        txtZwesedoGenzeb2.setEnabled(false);
        txtZwesedoGenzeb2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtZwesedoGenzeb2KeyTyped(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel82.setText("መኽንያት፡");

        txtMknyata.setEnabled(false);
        txtMknyata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMknyataActionPerformed(evt);
            }
        });
        txtMknyata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMknyataKeyTyped(evt);
            }
        });

        btnHsabHarestay2.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnHsabHarestay2.setText("ዓቅብ(Save)");
        btnHsabHarestay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHsabHarestay2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSmShekatay6, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGenzeLkah4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMetenGenzeb4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel67))
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel27Layout.createSequentialGroup()
                            .addComponent(jLabel82)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMknyata, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel27Layout.createSequentialGroup()
                                .addComponent(rbtnZwesedoGenzeb2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtZwesedoGenzeb2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel27Layout.createSequentialGroup()
                                .addComponent(rbtnZeetewoGenzeb2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtZeetewoGenzeb2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnHsabHarestay2)))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(cmbSmShekatay6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel66)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGenzeLkah4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMetenGenzeb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel67)))
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnZeetewoGenzeb2)
                    .addComponent(txtZeetewoGenzeb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnZwesedoGenzeb2)
                    .addComponent(txtZwesedoGenzeb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMknyata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82))
                .addGap(18, 18, 18)
                .addComponent(btnHsabHarestay2)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("መለቅሕን/መእተውን ገንዘብ ዓማዊል", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        jTabbedPane1.addTab("            ሕሳብ           ", jPanel2);

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ጸብጻብ ኣታዊ/ወጻኢ ትካል", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N
        jPanel16.setFocusTraversalPolicyProvider(true);
        jPanel16.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N

        jButton11.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jButton11.setText("ጸብጻብ");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        cmbReason.setEditable(true);
        cmbReason.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbReason.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "መኪና", "ናይ ትካል", "ገዛ" }));
        cmbReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbReasonActionPerformed(evt);
            }
        });
        cmbReason.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbReasonFocusLost(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel51.setText("ብ/ን ምንታይ፡");

        rbtnGrptebtab.add(rbtnAtawi1);
        rbtnAtawi1.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnAtawi1.setText("ኣታዊ");
        rbtnAtawi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAtawi1ActionPerformed(evt);
            }
        });

        rbtnGrptebtab.add(rbtnWesaei1);
        rbtnWesaei1.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnWesaei1.setSelected(true);
        rbtnWesaei1.setText("ወጻኢ");
        rbtnWesaei1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnWesaei1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(rbtnWesaei1)
                        .addGap(31, 31, 31)
                        .addComponent(rbtnAtawi1))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton11)
                            .addComponent(cmbReason, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnWesaei1)
                    .addComponent(rbtnAtawi1))
                .addGap(26, 26, 26)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel51)
                    .addComponent(cmbReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(204, 204, 204));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "መመዝገቢ ኣታዊ/ወጻኢ ትካል", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N

        jButton5.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jButton5.setText("ዓቅብ(Save)");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel80.setText("መኽንያት፡");

        cmbBzhiGabya3.setFont(new java.awt.Font("Nyala", 0, 14)); // NOI18N
        cmbBzhiGabya3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmbBzhiGabya3KeyTyped(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel77.setText("መጠን ገንዘብ");

        txtOyarGabya4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOyarGabya4ActionPerformed(evt);
            }
        });
        txtOyarGabya4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOyarGabya4KeyTyped(evt);
            }
        });

        rbtnGrpAtawiWetsae.add(rbtnWesaei);
        rbtnWesaei.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnWesaei.setSelected(true);
        rbtnWesaei.setText("ወጻኢ");
        rbtnWesaei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnWesaeiActionPerformed(evt);
            }
        });

        rbtnGrpAtawiWetsae.add(rbtnAtawi);
        rbtnAtawi.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnAtawi.setText("ኣታዊ");
        rbtnAtawi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAtawiActionPerformed(evt);
            }
        });

        jLabel76.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel76.setText("ብ/ን ምንታይ፡");

        cmbSmShekatay2.setEditable(true);
        cmbSmShekatay2.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmShekatay2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "መኪና", "ትካል", "ገዛ" }));
        cmbSmShekatay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmShekatay2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addComponent(jLabel77)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtOyarGabya4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(jButton5)))
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addComponent(jLabel80)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbBzhiGabya3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel22Layout.createSequentialGroup()
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbtnWesaei)
                                .addComponent(jLabel76))
                            .addGap(31, 31, 31)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbtnAtawi)
                                .addComponent(cmbSmShekatay2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnWesaei)
                    .addComponent(rbtnAtawi))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(cmbSmShekatay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel80)
                    .addComponent(cmbBzhiGabya3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(txtOyarGabya4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(204, 204, 204));
        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ዕለታዊ ጸብጻብ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N

        jLabel60.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel60.setText("ዕለት");

        jLabel61.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel61.setText("እቶት መኪና");

        txtAtotMekina.setEditable(false);
        txtAtotMekina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtotMekinaActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel63.setText("እቶት ትካል");

        txtAtotTkal.setEditable(false);

        jLabel62.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel62.setText("እቶት ሓረስቶት");

        txtAtotHarestot.setEditable(false);

        jLabel65.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel65.setText("ጠቅላላ መሸጢ ገንዘብ");

        txtTeklalaGenzeb.setEditable(false);

        jLabel64.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel64.setText("ዝተኸፍለ ገንዘብ");

        txtZtekefleGenzeb.setEditable(false);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addComponent(jLabel60))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(txtAtotMekina, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel18Layout.createSequentialGroup()
                                            .addComponent(jLabel62)
                                            .addGap(51, 51, 51))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                                            .addComponent(jLabel63)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addComponent(jLabel65)
                                    .addGap(16, 16, 16)))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addGap(45, 45, 45)))
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtZtekefleGenzeb, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(txtTeklalaGenzeb)
                            .addComponent(txtAtotHarestot)
                            .addComponent(txtAtotTkal))))
                .addGap(30, 30, 30))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAtotMekina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAtotTkal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAtotHarestot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTeklalaGenzeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZtekefleGenzeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel20.setBackground(new java.awt.Color(204, 204, 204));
        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ዓመታዊ/ወርሓዊ ጸብጻብ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N

        jLabel87.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel87.setText("ካብ ዕለት፡");
        jLabel87.setEnabled(false);

        txtStartDate.setEditable(false);
        txtStartDate.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        txtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartDateActionPerformed(evt);
            }
        });
        txtStartDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStartDateKeyTyped(evt);
            }
        });

        jLabel113.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel113.setText("ክሳብ ዕለት፡");
        jLabel113.setEnabled(false);

        jButton13.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jButton13.setText("ጸብጻብ");
        jButton13.setEnabled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        txtEndDate.setEditable(false);
        txtEndDate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEndDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEndDateActionPerformed(evt);
            }
        });

        jLabel114.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel114.setText("ናይ ትካል ጠቕላላ ኣታዊ ሕሳብ ክንገብር ስለ ዝኾና፡");
        jLabel114.setEnabled(false);

        jLabel115.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel115.setText("ዘይተሸጠ ፍረታት ወይ ዘይተጻፈፈ ሓሳብ ከይህሉ ኣረጋግጽ");
        jLabel115.setEnabled(false);

        chkTeklalaHsab.setFont(new java.awt.Font("Nyala", 1, 14)); // NOI18N
        chkTeklalaHsab.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkTeklalaHsabItemStateChanged(evt);
            }
        });
        chkTeklalaHsab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                chkTeklalaHsabKeyPressed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel88.setText("ሕሳብ ትካል ግበር");
        jLabel88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel88MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndDate))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jButton13))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(chkTeklalaHsab, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel88))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel114))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel115)))
                        .addGap(0, 55, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chkTeklalaHsab, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel88))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel113)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel114)
                .addGap(18, 18, 18)
                .addComponent(jLabel115)
                .addGap(57, 57, 57)
                .addComponent(jButton13)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("መመዝገብን/መርኣዩን ኣታዊ/ወጻኢ ትካል", jPanel21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static Date getSqlDateOfToday() {
        return sqlDateOfToday;
    }

    public static void setSqlDateOfToday(String strDateOfToday) {
        String subDateOfToday = strDateOfToday.substring(10, 14) + "-" + strDateOfToday.substring(4, 6) + "-" + strDateOfToday.substring(7, 9);
        try {
            NewJFrame.sqlDateOfToday = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(subDateOfToday).getTime());
        } catch (ParseException ex) {
        }
    }

    public static Date getSelectedSqlDate() {
        return selectedSqlDate;
    }

    public static void setSelectedSqlDate(String strSelectedSqlDate) {
        String subDateOfToday = strSelectedSqlDate.substring(10, 14) + "-" + strSelectedSqlDate.substring(4, 6) + "-" + strSelectedSqlDate.substring(7, 9);
        try {
            NewJFrame.selectedSqlDate = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(subDateOfToday).getTime());
        } catch (ParseException ex) {
        }
    }

    public static Date getSqlDateOfFactur() {
        return sqlDateOfFactur;
    }

    public static void setSqlDateOfFactur(String strDateOfFactur) {
        String subDateOfFactur = strDateOfFactur.substring(10, 14) + "-" + strDateOfFactur.substring(4, 6) + "-" + strDateOfFactur.substring(7, 9);
        try {
            NewJFrame.sqlDateOfFactur = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd").parse(subDateOfFactur).getTime());
        } catch (ParseException ex) {
        }
    }

    public static double getTeklalaWaga() {
        return teklalaWaga;
    }

    public static void setTeklalaWaga(double teklalaWaga) {
        NewJFrame.teklalaWaga = teklalaWaga;
    }

    public static double getZtekefleWaga() {
        return ztekefleWaga;
    }

    public static void setZtekefleWaga(double ztekefleWaga) {
        NewJFrame.ztekefleWaga = ztekefleWaga;
    }

    public static double getNaymekina() {
        return naymekina;
    }

    public static void setNaymekina(double naymekina) {
        NewJFrame.naymekina = naymekina;
    }

    public static double getNaytkal() {
        return naytkal;
    }

    public static void setNaytkal(double naytkal) {
        NewJFrame.naytkal = naytkal;
    }

    public static double getNayharestay() {
        return nayharestay;
    }

    public static void setNayharestay(double nayharestay) {
        NewJFrame.nayharestay = nayharestay;
    }

    public static String getZhader() {
        return zhader;
    }

    public static void setZhader(String zhader) {
        NewJFrame.zhader = zhader;
    }

    public static String getOyarGabya() {
        return oyarGabya;
    }

    public static void setOyarGabya(String oyarGabya) {
        NewJFrame.oyarGabya = oyarGabya;
    }

    public static String getOyarGabya1() {
        return oyarGabya1;
    }

    public static void setOyarGabya1(String oyarGabya1) {
        NewJFrame.oyarGabya1 = oyarGabya1;
    }

    public static int getBzhigabya() {
        return bzhigabya;
    }

    public static void setBzhigabya(int bzhigabya) {
        NewJFrame.bzhigabya = bzhigabya;
    }

    public static String getMizanBkilo() {
        return mizanBkilo;
    }

    public static void setMizanBkilo(String mizanBkilo) {
        NewJFrame.mizanBkilo = mizanBkilo;
    }

    public static String getWagaNKilo() {
        return wagaNKilo;
    }

    public static void setWagaNKilo(String wagaNKilo) {
        NewJFrame.wagaNKilo = wagaNKilo;
    }

    public static String getFruyDekik() {
        return fruyDekik;
    }

    public static void setFruyDekik(String fruyDekik) {
        NewJFrame.fruyDekik = fruyDekik;
    }

    public static String getOaynetFruta() {
        return oaynetFruta;
    }

    public static void setOaynetFruta(String oaynetFruta) {
        NewJFrame.oaynetFruta = oaynetFruta;
    }

    public static boolean isOyarMaere() {
        return oyarMaere;
    }

    public static void setOyarMaere(boolean oyarMaere) {
        NewJFrame.oyarMaere = oyarMaere;
    }

    static public String customFormat(String pattern, double value ) {
      DecimalFormat myFormatter = new DecimalFormat(pattern);
     String output = myFormatter.format(value);
      //System.out.println(value + "  " + pattern + "  " + output);
      return output;
   }
    
    public void checkIfKeyTypedDigit(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!((c >= 48 && c <= 57) || c == 46)) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }

    public void checkIfKeyTypedIsInteger(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!((c >= 48 && c <= 57))) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }

    public static List<Integer> getIdWana() {
        return idWana;
    }

    public static void setIdWana(List<Integer> idWana) {
        NewJFrame.idWana = idWana;
    }

    public static List<Integer> getIdBealFrki() {
        return idBealFrki;
    }

    public static void setIdBealFrki(List<Integer> idBealFrki) {
        NewJFrame.idBealFrki = idBealFrki;
    }

    public static List<Integer> getIdShekatay() {
        return idShekatay;
    }

    public static void setIdShekatay(List<Integer> idShekatay) {
        NewJFrame.idShekatay = idShekatay;
    }

    public static List<Integer> getIdOfAllBealFrki() {
        return idOfAllBealFrki;
    }

    public static void setIdOfAllBealFrki(List<Integer> idOfAllBealFrki) {
        NewJFrame.idOfAllBealFrki = idOfAllBealFrki;
    }

    public static List<Integer> getIdGabyaZeymelesu() {
        return idGabyaZeymelesu;
    }

    public static void setIdGabyaZeymelesu(List<Integer> idGabyaZeymelesu) {
        NewJFrame.idGabyaZeymelesu = idGabyaZeymelesu;
    }

    public static List<Integer> getIdThjaZeytemelselom() {
        return idThjaZeytemelselom;
    }

    public static void setIdThjaZeytemelselom(List<Integer> idThjaZeytemelselom) {
        NewJFrame.idThjaZeytemelselom = idThjaZeytemelselom;
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        JDlgMemrexiOlet jDlgMemrexiOlet = new JDlgMemrexiOlet(this, true);
        jDlgMemrexiOlet.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void rbtnZeetewoGenzeb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnZeetewoGenzeb2ActionPerformed
        // TODO add your handling code here:
        txtZeetewoGenzeb2.setEnabled(true);
        txtZwesedoGenzeb2.setEnabled(false);
        txtMknyata.setEnabled(false);

    }//GEN-LAST:event_rbtnZeetewoGenzeb2ActionPerformed


    private void txtGenzeLkah4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenzeLkah4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenzeLkah4ActionPerformed

    private void cmbSmShekatay6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmShekatay6ActionPerformed
        // TODO add your handling code here:
        try {
            TblShekatay shekatayBean = new TblShekatay();
            String smWanaS = cmbSmShekatay6.getSelectedItem().toString();
            if (!"".equals(smWanaS)) {
                int intIdShe = idShekatay.get(smShekatay.indexOf(smWanaS));
                try {
                    shekatayBean = TblShekatayManager.getRow(intIdShe);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (shekatayBean.getGenzeb() < 0) {
                    txtGenzeLkah4.setText("ልቓሕ");
                } else {
                    txtGenzeLkah4.setText("ገንዘብ");
                }
                txtMetenGenzeb4.setText(customFormat("###,###,###.##", shekatayBean.getGenzeb()));

            }
        } catch (Exception ex) {
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
        }

    }//GEN-LAST:event_cmbSmShekatay6ActionPerformed

    private void btnHsabHarestayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHsabHarestayActionPerformed
        try {
            String smWanaStr = cmbSmWanaHarestay4.getSelectedItem().toString();
            int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
            String smBealFrkiStr = cmbSmBealFrki3.getSelectedItem().toString();
            smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
            int intIdBealFrki = idBealFrki.get(smBealFrki.indexOf(smBealFrkiStr));
            double wel = Double.parseDouble(txtWelMaereTekoynu.getText().trim());
            double teklalaDmr = TblMealtawiHarestayManager.getTeklalaDmrNayHarestay(intIdWana, intIdBealFrki);
            double nayBealFrki = teklalaDmr * (wel / 100);
            double nayWana = teklalaDmr * ((100 - wel) / 100);

            TblWanaHarestay wanaBean = new TblWanaHarestay();
            wanaBean.setGenzeb(nayWana);
            wanaBean.setIdWana(intIdWana);
            TblWanaHarestayManager.update(wanaBean);

            TblBealFrki bealFrkiBean = new TblBealFrki();
            bealFrkiBean.setGenzeb(nayBealFrki);
            bealFrkiBean.setIdWana(intIdWana);
            bealFrkiBean.setIdBealFrki(intIdBealFrki);
            TblBealFrkiManager.update(bealFrkiBean);

            TblWel welBean = new TblWel();
            welBean.setIdBealFrki(intIdBealFrki);
            welBean.setOaynetFruta("ኩሉ ዓይነት");
            welBean.setWel(wel);

            TblWelManager.insert(welBean);

            wanaBean = TblWanaHarestayManager.getRow(intIdWana);
            if (wanaBean.getGenzeb() < 0) {
                txtGenzebLkah7.setText("ልቓሕ");
            } else {
                txtGenzebLkah7.setText("ገንዘብ");
            }
            txtMetenGenzeb8.setText(wanaBean.getGenzeb() + "");

            bealFrkiBean = TblBealFrkiManager.getRow(intIdBealFrki, intIdWana);
            if (bealFrkiBean.getGenzeb() < 0) {
                txtGenzebLkah6.setText("ልቓሕ");
            } else {
                txtGenzebLkah6.setText("ገንዘብ");
            }
            //txtNayHabarGenzeb.setText(TblMealtawiHarestayManager.getTeklalaDmrNayHarestay(intIdWana, intIdBealFrki) + "");
            txtMetenGenzeb7.setText(bealFrkiBean.getGenzeb() + "");
             txtWelMaereTekoynu.setText("");
             txtWelMaereTezeykoynu.setText("");
            rbtnWelBebeynu.setEnabled(false);
            rbtnWelmaere.setEnabled(false);
            txtWelMaereTekoynu.setEnabled(false);
            txtWelMaereTezeykoynu.setEnabled(false);
            cmbOaynetFruta5.setEnabled(false);
            btnWelBebeynu.setEnabled(false);
            btnHsabHarestay.setEnabled(false);
        } catch (Exception ex) {
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
        }
    }//GEN-LAST:event_btnHsabHarestayActionPerformed

    private void btnThjaTemelisuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThjaTemelisuActionPerformed
        boolean b = true;
        TblGabya gabyaBean = new TblGabya();
        String smWanaStr = cmbSmThjaZeytemelselom.getSelectedItem().toString();
        if (!"".equals(smWanaStr)) {
            int intIdWana = idShekatay.get(smShekatay.indexOf(smWanaStr));
            gabyaBean.setIdShekatay(intIdWana);
        }
        try {
            b = TblGabyaManager.deleteonid(gabyaBean.getIdShekatay());
            smThjaZeytemelselom = TblGabyaManager.displayNamesThjaZeytemelselom();
            cmbSmThjaZeytemelselom.setModel(new DefaultComboBoxModel(smThjaZeytemelselom.toArray()));
            if (b) {
                String exStr = "ትሕጃ ተመሊሱ ኣሎ።";
                String errorType = "";
                ConnectionManager.message(exStr, errorType);

            }
            txtBzhiGabya6.setText("");
            txtTeklalaThja.setText("");
            txtBzhiGabya6.requestFocus();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_btnThjaTemelisuActionPerformed

    private void btnThjaGabyaMemlesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThjaGabyaMemlesiActionPerformed

        boolean b = true;
        TblGabya gabyaBean = new TblGabya();
        gabyaBean.setQutsriGabya(txtQutsriGabya3.getText().trim());
        if (rbtnThjaTemelisu.isSelected()) {
            try {
                b = TblGabyaManager.delete(gabyaBean.getQutsriGabya());
                smGabyaZeymelesu = TblGabyaManager.displayNamesNayGabyaZeymelesu();
                cmbSmGabyaZeymelesu.setModel(new DefaultComboBoxModel(smGabyaZeymelesu.toArray()));
                smThjaZeytemelselom = TblGabyaManager.displayNamesThjaZeytemelselom();
                cmbSmThjaZeytemelselom.setModel(new DefaultComboBoxModel(smThjaZeytemelselom.toArray()));
                if (b) {
                    String exStr = "ጋብያ ቁጽሪ \"" + txtQutsriGabya3.getText().trim() + "\" ምስ ትሕጅኡ ተመሊሱ ኣሎ።";
                    String errorType = "";
                    ConnectionManager.message(exStr, errorType);
                    txtQutsriGabya3.setText("");
                    txtQutsriGabya3.requestFocus();
                }
            } catch (SQLException ex) {
            }
        } else {
            try {
                b = TblGabyaManager.updateNenoToEwe(gabyaBean.getQutsriGabya());
                smGabyaZeymelesu = TblGabyaManager.displayNamesNayGabyaZeymelesu();
                cmbSmGabyaZeymelesu.setModel(new DefaultComboBoxModel(smGabyaZeymelesu.toArray()));
                smThjaZeytemelselom = TblGabyaManager.displayNamesThjaZeytemelselom();
                cmbSmThjaZeytemelselom.setModel(new DefaultComboBoxModel(smThjaZeytemelselom.toArray()));
                if (b) {
                    String exStr = "ጋብያ ቁጽሪ \"" + txtQutsriGabya3.getText().trim() + "\" ትሕጅኡ ኣይተመልሰን።";
                    String errorType = "መጠንቀቕት";
                    ConnectionManager.message(exStr, errorType);
                    txtQutsriGabya3.setText("");
                    txtQutsriGabya3.requestFocus();
                }
            } catch (SQLException ex) {
            }
        }
        if (!b) {
            String exStr = "ቁጽሪ ጋብያ ብትኽክል መዝግብ";
            String errorType = "መጠንቀቕታ";
            ConnectionManager.message(exStr, errorType);
            // txtQutsriGabya3.setText(null);
            txtQutsriGabya3.setText("");
            txtQutsriGabya3.requestFocus();

        }

    }//GEN-LAST:event_btnThjaGabyaMemlesiActionPerformed

    private void txtTeklalaThja2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeklalaThja2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeklalaThja2ActionPerformed

    private void rbtnBealFrkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnBealFrkiActionPerformed
        cmbSmWanaHarestay2.setEnabled(true);

    }//GEN-LAST:event_rbtnBealFrkiActionPerformed

    private void cmbSmShekatayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmShekatayActionPerformed
        // TODO add your handling code here:
        try {
            TblShekatay shekatayBean = new TblShekatay();
            String smWanaS = cmbSmShekatay.getSelectedItem().toString();
            if (!"".equals(smWanaS)) {
                int intIdShe = idShekatay.get(smShekatay.indexOf(smWanaS));
                try {
                    shekatayBean = TblShekatayManager.getRow(intIdShe);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (shekatayBean.getGenzeb() < 0) {
                    txtGenzebLkah10.setText("ልቓሕ");
                } else {
                    txtGenzebLkah10.setText("ገንዘብ");
                }
                txtMetenGenzeb11.setText( customFormat("###,###,###.##", shekatayBean.getGenzeb()));
            }
        } catch (Exception ex) {
//            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
//                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
//            String errorType = "ጌጋ";
//            ConnectionManager.message(errorStr, errorType);
        }

    }//GEN-LAST:event_cmbSmShekatayActionPerformed

    private void cmbFruyDekik2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFruyDekik2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFruyDekik2ActionPerformed

    private void cmbOaynetFruta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOaynetFruta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOaynetFruta2ActionPerformed

    private void rbtnTegemituActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTegemituActionPerformed
        txtWagaNKilo.setEnabled(true);
        txtWagaNKilo.requestFocus();
        txtWagaNKilo.selectAll();
        btnEtotFretat.setEnabled(true);
    }//GEN-LAST:event_rbtnTegemituActionPerformed

    private void cmbDekikFruyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDekikFruyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDekikFruyActionPerformed

    private void cmbOaynetFrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOaynetFrutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOaynetFrutaActionPerformed

    private void cmbSmShekatay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmShekatay2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSmShekatay2ActionPerformed

    private void btnEtotFretatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEtotFretatActionPerformed
        try {

            TblAtawiWetsaeiTkal atawiwetsaebean = new TblAtawiWetsaeiTkal();
            TblMealtawiHarestay mealtawiHarestayBean = new TblMealtawiHarestay();
            mealtawiHarestayBean.setOlet(sqlDateOfToday);
            mealtawiHarestayBean.setZhader(NewJFrame.getZhader());
            double oyarGabya = 0;
            if (rbtnMaereOyar.isSelected()) {
                oyarGabya = Double.parseDouble(txtOyarGabya.getText());
                mealtawiHarestayBean.setOyarGabya(oyarGabya);
            } else {
                oyarGabya = (Double.parseDouble(txtOyarGabya1.getText().trim()) / Double.parseDouble(txtBzhiGabya.getText().trim()));
                mealtawiHarestayBean.setOyarGabya(oyarGabya);
            }
            mealtawiHarestayBean.setTarifMekina(Double.parseDouble(txtTarifMekina.getText()));
            mealtawiHarestayBean.setOaynetFruta(cmbOaynetFruta.getSelectedItem().toString().trim());
            mealtawiHarestayBean.setFruyDekik(cmbDekikFruy.getSelectedItem().toString().trim());
            mealtawiHarestayBean.setTarifKabKilo(Double.parseDouble(txtTarifKabKilo.getText()));
            mealtawiHarestayBean.setBzhiGabya(Integer.parseInt(txtBzhiGabya.getText()));
            mealtawiHarestayBean.setMizanBKilo(Double.parseDouble(txtMizanBKilo.getText()));
            double mizan = (Double.parseDouble(txtMizanBKilo.getText()) - (Integer.parseInt(txtBzhiGabya.getText()) * oyarGabya));
            double teklalaWaga = mizan * Double.parseDouble(txtWagaNKilo.getText());
            double nayMekina = Double.parseDouble(txtTarifMekina.getText()) * Integer.parseInt(txtBzhiGabya.getText());
            double nayTkal = Double.parseDouble(txtTarifKabKilo.getText()) * mizan;
            mealtawiHarestayBean.setWagaNKilo(Double.parseDouble(txtWagaNKilo.getText()));
            mealtawiHarestayBean.setTeklalaWaga(teklalaWaga);
            mealtawiHarestayBean.setNayMekina(nayMekina);
            mealtawiHarestayBean.setNayTkal(nayTkal);
            mealtawiHarestayBean.setNayHarestay(teklalaWaga - (nayTkal + nayMekina));

            atawiwetsaebean.setOlet(sqlDateOfToday);
            atawiwetsaebean.setAtawiWetsaei("ኣታዊ");

            try {
//            String smWanaStr = cmbSmWanaHarestay.getSelectedItem().toString().trim();
//            int smWanaIndex = smWanaHarestay.indexOf(smWanaStr);
                String smWanaStr = cmbSmWanaHarestay.getSelectedItem().toString();
                int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
                //JOptionPane.showMessageDialog(null, intIdWana + smWanaStr);
                if (intIdWana > 0) {
                    mealtawiHarestayBean.setIdWana(intIdWana);

                    String smBealFrkiStr = cmbSmBealFrki.getSelectedItem().toString().trim();
                    if (!"ዋና ባዕሉ".equals(smBealFrkiStr)) {
                        smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                        int intIdBealFrki = idBealFrki.get(smBealFrki.indexOf(smBealFrkiStr));
                        // JOptionPane.showMessageDialog(null, intIdBealFrki);
                        // check for wel    
                        TblWel welBean = new TblWel();
                        try {
                            welBean = TblWelManager.getRowOnOaynetFruta(intIdBealFrki, cmbOaynetFruta.getSelectedItem().toString().trim());
                            if (welBean != null) {
                                //JOptionPane.showMessageDialog(null, "yess wel");
                                double wel = welBean.getWel();
                                double forBealFrki = (wel / 100) * mealtawiHarestayBean.getNayHarestay();
                                double forWana = ((100 - wel) / 100) * mealtawiHarestayBean.getNayHarestay();
                                TblBealFrki bealFrkiBean = new TblBealFrki();
                                bealFrkiBean.setIdBealFrki(intIdBealFrki);
                                bealFrkiBean.setGenzeb(forBealFrki);
                                TblBealFrkiManager.update(bealFrkiBean);

                                TblWanaHarestay wanaHarestayBean = new TblWanaHarestay();
                                wanaHarestayBean.setIdWana(intIdWana);
                                wanaHarestayBean.setGenzeb(forWana);
                                TblWanaHarestayManager.update(wanaHarestayBean);
                            }
                        } catch (SQLException ex) {
                        }
                        mealtawiHarestayBean.setIdBealFrki(intIdBealFrki);
                        try {
                            boolean b = false;
                            b = TblMealtawiHarestayManager.updateBealFrki(mealtawiHarestayBean);
                            if (!b) {
                                TblMealtawiHarestayManager.insert(mealtawiHarestayBean);
                            }
                        } catch (SQLException ex) {
                            String exStr = "ናይ በዓል ፍርቂ ክምዝገብ ኣይትኻእለን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
                            String errorType = "ጌጋ";
                            ConnectionManager.message(exStr, errorType);
                        }
                    } else {
                        mealtawiHarestayBean.setIdBealFrki(0);
                        try {
                            boolean b = false;
                            b = TblMealtawiHarestayManager.updateWana(mealtawiHarestayBean);
                            if (!b) {
                                TblMealtawiHarestayManager.insert(mealtawiHarestayBean);
                            }
                            TblWanaHarestay wanaHarestayBean = new TblWanaHarestay();
                            wanaHarestayBean.setIdWana(intIdWana);
                            wanaHarestayBean.setGenzeb(mealtawiHarestayBean.getNayHarestay());
                            TblWanaHarestayManager.update(wanaHarestayBean);
                        } catch (SQLException ex) {
                            String errorStr = "ናይ ዋና ግራት ክምዝገብ ኣይተኻእን፡ ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
                            String errorType = "ጌጋ";
                            ConnectionManager.message(errorStr, errorType);
                        }
                    }//End of if(!= "ዋና ባዕሉ") else

                    atawiwetsaebean.setReason("መኪና");
                    atawiwetsaebean.setGenzeb(nayMekina);

                    try {
                        boolean b = false;
                        b = TblAtawiWetsaeiTkalManager.updateAta(atawiwetsaebean);
                        if (!b) {
                            TblAtawiWetsaeiTkalManager.insert(atawiwetsaebean);
                        }
                    } catch (SQLException ex) {
                    }

                    atawiwetsaebean.setReason("ናይ ትካል");
                    atawiwetsaebean.setGenzeb(nayTkal);

                    try {
                        boolean b = false;
                        b = TblAtawiWetsaeiTkalManager.updateAta(atawiwetsaebean);
                        if (!b) {
                            TblAtawiWetsaeiTkalManager.insert(atawiwetsaebean);
                        }
                    } catch (SQLException ex) {
                    }

                }//End of if(intIdIndex > 0)

            } catch (Exception ex) {
                String errorStr = "<html>ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ</html>";
                String errorType = "ሓበሬታ";
                ConnectionManager.message(errorStr, errorType);

            }

            if (rbtnMaereOyar.isSelected()) {
                NewJFrame.setOyarGabya((Double.parseDouble(txtOyarGabya.getText()) - 1) + "");
                NewJFrame.setOyarMaere(true);
            } else {
                NewJFrame.setOyarGabya1((Double.parseDouble(txtOyarGabya1.getText()) - Integer.parseInt(txtBzhiGabya.getText().toString())) + "");
                NewJFrame.setOyarMaere(false);
            }
            NewJFrame.setMizanBkilo(txtMizanBKilo.getText().toString());
            NewJFrame.setBzhigabya(Integer.parseInt(txtBzhiGabya.getText().toString()));
            NewJFrame.setWagaNKilo(txtWagaNKilo.getText().toString());
            NewJFrame.setOaynetFruta(cmbOaynetFruta.getSelectedItem().toString());
            NewJFrame.setFruyDekik(cmbDekikFruy.getSelectedItem().toString());

            jDialogShekatay = new NewJDialog(this, true);
            jDialogShekatay.setLocationRelativeTo(this);
            jDialogShekatay.setVisible(true);
            smGabyaZeymelesu = TblGabyaManager.displayNamesNayGabyaZeymelesu();
            cmbSmGabyaZeymelesu.setModel(new DefaultComboBoxModel(smGabyaZeymelesu.toArray()));
            txtBzhiGabya.setText(null);
            txtMizanBKilo.setText(null);
            txtWagaNKilo.setText(null);
            txtBzhiGabya.requestFocus();
        } catch (Exception ex) {
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
        }

    }//GEN-LAST:event_btnEtotFretatActionPerformed

//    public void checkTextValues(Container container) {
//        Component[] components = container.getComponents();
//        for (Component component : components) {
//            if (component instanceof JTextField) {
////                String name = component.getName();
////                JOptionPane.showMessageDialog(null, "Hi, again");
//                //component = new JTextField();
//
//                JOptionPane.showMessageDialog(null, component.getName());
//            }
//            //component.setEnabled(enable);
//            if (component instanceof Container) {
//                checkTextValues((Container) component);
//            }
//        }
//    }

    private void btnEtotFretat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEtotFretat1ActionPerformed

        try {
            TblAtawiWetsaeiTkal atawiwetsaebean = new TblAtawiWetsaeiTkal();
            TblMealtawiHarestay mealtawiHarestayBean = new TblMealtawiHarestay();
            mealtawiHarestayBean.setOlet(sqlDateOfToday);
            mealtawiHarestayBean.setZhader(NewJFrame.getZhader());
            double oyarGabya = 0;
            if (rbtnMaereOyar.isSelected()) {
                oyarGabya = Double.parseDouble(txtOyarGabya.getText());
                mealtawiHarestayBean.setOyarGabya(oyarGabya);
            } else {
                oyarGabya = Double.parseDouble(txtOyarGabya1.getText().trim()) / Double.parseDouble(txtBzhiGabya.getText().trim());
                mealtawiHarestayBean.setOyarGabya(oyarGabya);
            }
            mealtawiHarestayBean.setTarifMekina(Double.parseDouble(txtTarifMekina.getText()));
            mealtawiHarestayBean.setOaynetFruta(cmbOaynetFruta.getSelectedItem().toString().trim());
            mealtawiHarestayBean.setFruyDekik(cmbDekikFruy.getSelectedItem().toString().trim());
            mealtawiHarestayBean.setTarifKabKilo(Double.parseDouble(txtTarifKabKilo.getText()));
            mealtawiHarestayBean.setBzhiGabya(Integer.parseInt(txtBzhiGabya.getText()));
            mealtawiHarestayBean.setMizanBKilo(Double.parseDouble(txtMizanBKilo.getText()));
            double nayMekina = 0;
            double nayTkal = 0;
            if (rbtnTegemitu.isSelected()) {
                double mizan = (Double.parseDouble(txtMizanBKilo.getText()) - (Integer.parseInt(txtBzhiGabya.getText()) * oyarGabya));
                double teklalaWaga = mizan * Double.parseDouble(txtWagaNKilo.getText());
                nayMekina = Double.parseDouble(txtTarifMekina.getText()) * Integer.parseInt(txtBzhiGabya.getText());
                nayTkal = Double.parseDouble(txtTarifKabKilo.getText()) * mizan;
                mealtawiHarestayBean.setWagaNKilo(Double.parseDouble(txtWagaNKilo.getText()));
                mealtawiHarestayBean.setTeklalaWaga(teklalaWaga);
                mealtawiHarestayBean.setNayMekina(nayMekina);
                mealtawiHarestayBean.setNayTkal(nayTkal);
                mealtawiHarestayBean.setNayHarestay(teklalaWaga - (nayTkal + nayMekina));
            } else {
                mealtawiHarestayBean.setWagaNKilo(0);
                mealtawiHarestayBean.setTeklalaWaga(0);
                mealtawiHarestayBean.setNayMekina(0);
                mealtawiHarestayBean.setNayTkal(0);
                mealtawiHarestayBean.setNayHarestay(0);
            }

            atawiwetsaebean.setOlet(sqlDateOfToday);
            atawiwetsaebean.setAtawiWetsaei("ኣታዊ");

            try {
//            String smWanaStr = cmbSmWanaHarestay.getSelectedItem().toString().trim();
//            int smWanaIndex = smWanaHarestay.indexOf(smWanaStr);
                String smWanaStr = cmbSmWanaHarestay.getSelectedItem().toString();
                int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
                //JOptionPane.showMessageDialog(null, intIdWana + smWanaStr);
                if (intIdWana > 0) {
                    mealtawiHarestayBean.setIdWana(intIdWana);
                    String smBealFrkiStr = cmbSmBealFrki.getSelectedItem().toString().trim();
                    if (!"ዋና ባዕሉ".equals(smBealFrkiStr)) {
                        smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                        int intIdBealFrki = idBealFrki.get(smBealFrki.indexOf(smBealFrkiStr));
                        // JOptionPane.showMessageDialog(null, intIdBealFrki);
                        // check for wel    
                        TblWel welBean = new TblWel();
                        try {
                            welBean = TblWelManager.getRowOnOaynetFruta(intIdBealFrki, cmbOaynetFruta.getSelectedItem().toString().trim());
                            if (welBean != null) {
                                //JOptionPane.showMessageDialog(null, "yess wel");
                                double wel = welBean.getWel();
                                double forBealFrki = (wel / 100) * mealtawiHarestayBean.getNayHarestay();
                                double forWana = ((100 - wel) / 100) * mealtawiHarestayBean.getNayHarestay();
                                TblBealFrki bealFrkiBean = new TblBealFrki();
                                bealFrkiBean.setIdBealFrki(intIdBealFrki);
                                bealFrkiBean.setGenzeb(forBealFrki);
                                TblBealFrkiManager.update(bealFrkiBean);

                                TblWanaHarestay wanaHarestayBean = new TblWanaHarestay();
                                wanaHarestayBean.setIdWana(intIdWana);
                                wanaHarestayBean.setGenzeb(forWana);
                                TblWanaHarestayManager.update(wanaHarestayBean);
                            }
                        } catch (SQLException ex) {
                        }
                        mealtawiHarestayBean.setIdBealFrki(intIdBealFrki);
                        try {
                            boolean b = false;
                            b = TblMealtawiHarestayManager.updateBealFrki(mealtawiHarestayBean);
                            if (!b) {
                                TblMealtawiHarestayManager.insert(mealtawiHarestayBean);
                            }
                        } catch (SQLException ex) {
                            String errorStr = "ናይ ሓረስታይት ምምሕያሽ ኣይተኻእለን፡ ኮኔክሽ ጸገም ከይህሉ ኣረግጽ";
                            String errorType = "ጌጋ";
                            ConnectionManager.message(errorStr, errorType);
                        }
                    } else {
                        mealtawiHarestayBean.setIdBealFrki(0);
                        try {
                            boolean b = false;
                            b = TblMealtawiHarestayManager.updateWana(mealtawiHarestayBean);
                            if (!b) {
                                TblMealtawiHarestayManager.insert(mealtawiHarestayBean);
                            }
                            TblWanaHarestay wanaHarestayBean = new TblWanaHarestay();
                            wanaHarestayBean.setIdWana(intIdWana);
                            wanaHarestayBean.setGenzeb(mealtawiHarestayBean.getNayHarestay());
                            TblWanaHarestayManager.update(wanaHarestayBean);
                        } catch (SQLException ex) {
                            String errorStr = "ሓበሬታ ዋና ሓረስታይ ክምዝገብ ኣይተኻእለን፡ ኮኔክሽ ጸገም ከይህሉ ኣረግጽ";
                            String errorType = "ጌጋ";
                            ConnectionManager.message(errorStr, errorType);
                        }
                        //   ,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,..............................................................................................................................................................          
                    }// End of if(!="ዋና ባዕሉ") else

                    atawiwetsaebean.setReason("መኪና");
                    atawiwetsaebean.setGenzeb(nayMekina);

                    try {
                        boolean b = false;
                        b = TblAtawiWetsaeiTkalManager.updateAta(atawiwetsaebean);
                        if (!b) {
                            TblAtawiWetsaeiTkalManager.insert(atawiwetsaebean);
                        }
                    } catch (SQLException ex) {
                    }

                    atawiwetsaebean.setReason("ናይ ትካል");
                    atawiwetsaebean.setGenzeb(nayTkal);

                    try {
                        boolean b = false;
                        b = TblAtawiWetsaeiTkalManager.updateAta(atawiwetsaebean);
                        if (!b) {
                            TblAtawiWetsaeiTkalManager.insert(atawiwetsaebean);
                        }
                    } catch (SQLException ex) {
                    }

                }// End of if(indIdIndex > 0)

            } catch (Exception ex) {
                String errorStr = "<html>ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ</html>";
                String errorType = "ሓበሬታ";
                ConnectionManager.message(errorStr, errorType);

            }
            txtBzhiGabya.setText(null);
            txtMizanBKilo.setText(null);
            txtWagaNKilo.setText(null);
            txtBzhiGabya.requestFocus();

        } catch (Exception ex) {
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
        }

    }//GEN-LAST:event_btnEtotFretat1ActionPerformed

    private void cmbSmWanaHarestayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmWanaHarestayActionPerformed
        // TODO add your handling code here
        if ((evt.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
            try {
                String smWanaStr = cmbSmWanaHarestay.getSelectedItem().toString();
                if (!"".equals(smWanaStr)) {
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
                    try {
                        smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                        cmbSmBealFrki.setModel(new DefaultComboBoxModel(smBealFrki.toArray()));
                        cmbSmBealFrki.setSelectedIndex(0);
                        cmbSmBealFrki.requestFocus();
                    } catch (SQLException ex) {
                    }
                }

            } catch (Exception ex) {
//                String errorStr = "ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ";
//                String errorType = "ሓበሬታ";
//                ConnectionManager.message(errorStr, errorType);
            }
        }
    }//GEN-LAST:event_cmbSmWanaHarestayActionPerformed

    private void txtWelMaereTezeykoynuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWelMaereTezeykoynuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWelMaereTezeykoynuActionPerformed

    private void txtWelMaereTekoynuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWelMaereTekoynuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWelMaereTekoynuActionPerformed

    private void cmbOaynetFruta5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOaynetFruta5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOaynetFruta5ActionPerformed

    private void jxdpOletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jxdpOletActionPerformed
        if (jxdpOlet.getDate() == null) {
            String errorStr = "ዕለት ብ ትኽክል ምረጽ";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);

        } else {

            String strDateOfToday = jxdpOlet.getEditor().getText();
            NewJFrame.setSelectedSqlDate(strDateOfToday);
            try {
                TblMealtawiShekatayManager.setTeklalaNdZtekefleWaga(selectedSqlDate);
                txtTeklalaGenzeb.setText(customFormat("###,###,###.##",NewJFrame.getTeklalaWaga()));
                txtZtekefleGenzeb.setText(customFormat("###,###,###.##",NewJFrame.getZtekefleWaga()));
                TblMealtawiHarestayManager.setNayMekinaTkalHarestay(selectedSqlDate);
                txtAtotHarestot.setText(customFormat("###,###,###.##",NewJFrame.getNayharestay()));
                txtAtotMekina.setText(customFormat("###,###,###.##",NewJFrame.getNaymekina()));
                txtAtotTkal.setText(customFormat("###,###,###.##",NewJFrame.getNaytkal()) + "");
            } catch (SQLException ex) {
                String errorStr = "ዕለታዊ ናይ ሓረስትይን ናይ ሸቃጣይን ክርከብ ኣይተኻእለን፡";
                String errorType = "ጌጋ";
                ConnectionManager.message(errorStr, errorType);
            }

        }
    }//GEN-LAST:event_jxdpOletActionPerformed

    private void cmbSmWanaHarestay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmWanaHarestay2ActionPerformed

    }//GEN-LAST:event_cmbSmWanaHarestay2ActionPerformed

    private void cmbSmGabyaZeymelesuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmGabyaZeymelesuActionPerformed
        // TODO add your handling code here:
        try {
            String strSmShekatay = cmbSmGabyaZeymelesu.getSelectedItem().toString();

            //JOptionPane.showMessageDialog(null, idGabyaZeymelesu.get(smGabyaZeymelesu.indexOf(strSmShekatay)));
            TblGabya gabyaBean = new TblGabya();
            gabyaBean.setIdShekatay(idGabyaZeymelesu.get(smGabyaZeymelesu.indexOf(strSmShekatay)));
            gabyaBean.setGabyaTemelisu("ነኖ");
            try {
                gabyaBean = TblGabyaManager.getGabyaTemelisuInfo(gabyaBean);
            } catch (SQLException ex) {
            }
            txtAQutsriGabya.setText(gabyaBean.getQutsriGabya());
            txtBzhiGabya5.setText(gabyaBean.getIdShekatay() + "");
            txtTeklalaThja2.setText(gabyaBean.getThja() + "");
        } catch (Exception ex) {
//            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
//                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
//            String errorType = "ጌጋ";
//            ConnectionManager.message(errorStr, errorType);
        }
    }//GEN-LAST:event_cmbSmGabyaZeymelesuActionPerformed

    private void cmbSmThjaZeytemelselomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmThjaZeytemelselomActionPerformed
        try {
            String strSmThjaZeytemelselom = cmbSmThjaZeytemelselom.getSelectedItem().toString();

            // JOptionPane.showMessageDialog(null, idThjaZeytemelselom.get(smThjaZeytemelselom.indexOf(strSmThjaZeytemelselom)));
            TblGabya gabyaBean = new TblGabya();
            gabyaBean.setIdShekatay(idThjaZeytemelselom.get(smThjaZeytemelselom.indexOf(strSmThjaZeytemelselom)));
            gabyaBean.setGabyaTemelisu("እወ");
            try {
                gabyaBean = TblGabyaManager.getGabyaTemelisuInfo(gabyaBean);
            } catch (SQLException ex) {
            }
            txtBzhiGabya6.setText(gabyaBean.getIdShekatay() + "");
            txtTeklalaThja.setText(gabyaBean.getThja() + "");
        } catch (Exception ex) {
//            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
//                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
//            String errorType = "ጌጋ";
//            ConnectionManager.message(errorStr, errorType);
        }
    }//GEN-LAST:event_cmbSmThjaZeytemelselomActionPerformed

    private void txtOyarGabyaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOyarGabyaKeyTyped
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtOyarGabyaKeyTyped

    private void txtOyarGabya1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOyarGabya1KeyTyped
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtOyarGabya1KeyTyped

    private void txtBzhiGabyaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBzhiGabyaKeyTyped
        checkIfKeyTypedIsInteger(evt);
    }//GEN-LAST:event_txtBzhiGabyaKeyTyped

    private void txtTarifMekinaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTarifMekinaKeyTyped
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtTarifMekinaKeyTyped

    private void txtMizanBKiloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMizanBKiloKeyTyped
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtMizanBKiloKeyTyped

    private void txtWagaNKiloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWagaNKiloKeyTyped
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtWagaNKiloKeyTyped

    private void txtTarifKabKiloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTarifKabKiloKeyTyped
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtTarifKabKiloKeyTyped

    private void cmbSmBealFrkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmBealFrkiActionPerformed

    }//GEN-LAST:event_cmbSmBealFrkiActionPerformed

    private void rbtnAytegemetenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAytegemetenActionPerformed
        txtWagaNKilo.setText("0");
        txtWagaNKilo.setEnabled(false);
        btnEtotFretat.setEnabled(false);
    }//GEN-LAST:event_rbtnAytegemetenActionPerformed

    private void rbtnWanaBaeluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnWanaBaeluActionPerformed
        cmbSmWanaHarestay2.setEnabled(false);
        cmbSmWanaHarestay2.setSelectedIndex(0);
    }//GEN-LAST:event_rbtnWanaBaeluActionPerformed

    private void btnHadshHarestayMezgbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHadshHarestayMezgbActionPerformed
        if (!"".equals(txtSmHarestay.getText().trim()) && !"".equals(txtSmAboHarestay.getText().trim())) {

            try {
                String sm = txtSmHarestay.getText().trim() + " " + txtSmAboHarestay.getText().trim() + " " + txtSmAboHagoHarestay.getText().trim();
                if (rbtnWanaBaelu.isSelected()) {
                    TblWanaHarestay wanaHarestayBean = new TblWanaHarestay();
                    wanaHarestayBean.setSm(sm);
                    wanaHarestayBean.setGenzeb(0);
                    try {
                        TblWanaHarestayManager.insert(wanaHarestayBean);
                        txtSmAboHagoHarestay.setText(null);
                        txtSmAboHarestay.setText(null);
                        txtSmHarestay.setText(null);
                        txtSmHarestay.requestFocus();
                        rbtnWanaBaelu.setSelected(true);
                        cmbSmWanaHarestay2.setSelectedIndex(0);
                        cmbSmWanaHarestay2.setEnabled(false);
                    } catch (SQLException ex) {
                        String errorStr = "ስም ዋና ሓረስታይ ምምዝጋብ ኣይተኻእለን; ተመዝጊቡ ከይህሉ ኣረጋግጽ";
                        String errorType = "ሓበሬታ";
                        ConnectionManager.message(errorStr, errorType);
                    }
                    try {
                        smWanaHarestay = TblWanaHarestayManager.displayData();
                        cmbSmWanaHarestay.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
                        cmbSmWanaHarestay2.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
                        cmbSmWanaHarestay4.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
                        cmbSmWanaHarestay5.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
                        cmbSmWanaHarestay6.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
                        cmbSmWanaHarestay3.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));

                    } catch (SQLException ex) {
                        String errorStr = "ሓበሬታ ዋና ሓረስታይ ክርከብ ኣይተካእለን";
                        String errorType = "ሓበሬታ";
                        ConnectionManager.message(errorStr, errorType);
                    }

                } else {
                    TblBealFrki bealFrkiBean = new TblBealFrki();
                    bealFrkiBean.setSm(sm);
                    bealFrkiBean.setGenzeb(0);
                    String strSmWana = cmbSmWanaHarestay2.getSelectedItem().toString();
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(strSmWana));
                    if (intIdWana > 0) {
                        bealFrkiBean.setIdWana(intIdWana);
                        try {
                            TblBealFrki bealFrkiBean1 = new TblBealFrki();
                            bealFrkiBean1 = TblBealFrkiManager.getRowOnSmNdIdWana(sm, intIdWana);
                            if (bealFrkiBean1 == null) {
                                boolean b = TblBealFrkiManager.insert(bealFrkiBean);
                                txtSmAboHagoHarestay.setText(null);
                                txtSmAboHarestay.setText(null);
                                txtSmHarestay.setText(null);
                                txtSmHarestay.requestFocus();
                                rbtnWanaBaelu.setSelected(true);
                                cmbSmWanaHarestay2.setSelectedIndex(0);
                                cmbSmWanaHarestay2.setEnabled(false);
                            } else {
                                String errorStr = "ስም በዓል ፍርቂ ሓረስታይ ክምዝገብ ኣይተካእለን; ተመዝጊቡ ከይህሉ ኣረጋግጽ";
                                String errorType = "ሓበሬታ";
                                ConnectionManager.message(errorStr, errorType);
                            }
                        } catch (SQLException ex) {
                            String errorStr = "ስም በዓል ፍርቂ ሓረስታይ ክምዝገብ ኣይተካእለን; ተመዝጊቡ ከይህሉ ኣረጋግጽ";
                            String errorType = "ሓበሬታ";
                            ConnectionManager.message(errorStr, errorType);
                        }
                    }

                }

            } catch (Exception ex) {
                String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                        + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
                String errorType = "ጌጋ";
                ConnectionManager.message(errorStr, errorType);
            }
        } else {
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
            txtSmHarestay.requestFocus();
            txtSmHarestay.selectAll();
        }

    }//GEN-LAST:event_btnHadshHarestayMezgbActionPerformed

    private void btnHadshShekatayMezgbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHadshShekatayMezgbActionPerformed
        if (!"".equals(txtSmShekatay.getText().trim()) && !"".equals(txtSmAboShekatay.getText().trim())) {
            TblShekatay shekataybean = new TblShekatay();
            shekataybean.setSm(txtSmShekatay.getText().trim() + " " + txtSmAboShekatay.getText().trim());
            try {
                TblShekatayManager.insert(shekataybean);
                smShekatay = TblShekatayManager.displayData();
                cmbSmShekatay.setModel(new DefaultComboBoxModel(smShekatay.toArray()));
                cmbSmShekatay2.setModel(new DefaultComboBoxModel(smShekatay.toArray()));
                cmbSmShekatay3.setModel(new DefaultComboBoxModel(smShekatay.toArray()));
                cmbSmShekatay6.setModel(new DefaultComboBoxModel(smShekatay.toArray()));
                cmbSmShekatay7.setModel(new DefaultComboBoxModel(smShekatay.toArray()));
                txtSmShekatay.setText("");
                txtSmAboShekatay.setText("");
                txtSmShekatay.requestFocus();

            } catch (SQLException ex) {
                txtSmShekatay.setText("");
                txtSmAboShekatay.setText("");
                txtSmShekatay.requestFocus();
            }
        } else {
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
            txtSmShekatay.setText("");
            txtSmAboShekatay.setText("");
            txtSmShekatay.requestFocus();
        }
    }//GEN-LAST:event_btnHadshShekatayMezgbActionPerformed

    private void btnThjaGabyaMewsediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThjaGabyaMewsediActionPerformed
        if (!txtQutsriGabya2.getText().equals("")) {
            try {
                boolean b = true;
                TblGabya gabyaBean = new TblGabya();

                gabyaBean.setOlet(sqlDateOfToday);
                gabyaBean.setQutsriGabya(txtQutsriGabya2.getText().trim());
                gabyaBean.setThja(Double.parseDouble(txtThja3.getText().trim()));
                gabyaBean.setGabyaTemelisu("ነኖ");
                String strSmShekatay = cmbSmShekatay3.getSelectedItem().toString();
                if (!strSmShekatay.equals("")) {
                    int smShekatayIndex = smShekatay.indexOf(strSmShekatay);
                    if (smShekatayIndex > 0) {
                        gabyaBean.setIdShekatay(idShekatay.get(smShekatayIndex));
                        try {
                            b = TblGabyaManager.insert(gabyaBean);
                            smGabyaZeymelesu = TblGabyaManager.displayNamesNayGabyaZeymelesu();
                            cmbSmGabyaZeymelesu.setModel(new DefaultComboBoxModel(smGabyaZeymelesu.toArray()));
                            txtQutsriGabya2.setText("");
                            txtQutsriGabya2.requestFocus();
                        } catch (SQLException ex) {
                            String errorStr = "ቁ.ጋብይ ኣቐዲማ ምስ ዝተወስደ ተምዝጊባ ስለ ዘላ፡ ተመሊሳ ተኾይና ኣቐዲምካ ናብ መምለሲ ፎርም ኬድካ ደምስሳ";
                            String errorType = "ሓበሬታ";
                            ConnectionManager.message(errorStr, errorType);
                            txtQutsriGabya2.setText("");
                            txtQutsriGabya2.requestFocus();
                        }
                    } else {
                        String errorStr = "ስም ዓዳጋይ ኣይተመዝገበን፡ ፈለማ ኣመዝግቦ";
                        String errorType = "ሓበሬታ";
                        ConnectionManager.message(errorStr, errorType);

                    }
                    if (!b) {
                        String errorStr = "ቁ.ጋብይ ኣቐዲማ ምስ ዝተወስደ ተምዝጊባ ስለ ዘላ፡ ተመሊሳ ተኾይና ኣቐዲምካ ናብ መምለሲ ፎርም ኬድካ ደምስሳ";
                        String errorType = "ሓበሬታ";
                        ConnectionManager.message(errorStr, errorType);
                        txtQutsriGabya2.setText("");
                        txtQutsriGabya2.requestFocus();
                    }
                }
                txtQutsriGabya2.setText(null);
            } catch (Exception ex) {
                String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                        + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
                String errorType = "ጌጋ";
                ConnectionManager.message(errorStr, errorType);
                txtQutsriGabya2.setText(null);
            }
        } else {
            String errorStr = "ቁጽሪ ጋብያ ብትኽክል ምላአ";
            String errorType = "ሓበሬታ";
            ConnectionManager.message(errorStr, errorType);

        }

    }//GEN-LAST:event_btnThjaGabyaMewsediActionPerformed

    private void cmbSmShekatay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmShekatay3ActionPerformed
//        String strSmShekatay = cmbSmShekatay3.getSelectedItem().toString();
//        JOptionPane.showMessageDialog(null, idShekatay.get(smShekatay.indexOf(strSmShekatay)));
    }//GEN-LAST:event_cmbSmShekatay3ActionPerformed

    private void cmbSmWanaHarestay4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmWanaHarestay4ActionPerformed
        if ((evt.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
            try {
                String smWanaStr = cmbSmWanaHarestay4.getSelectedItem().toString();
                if (!"".equals(smWanaStr)) {
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
                    try {
                        TblWanaHarestay wanaHarestayBean = new TblWanaHarestay();
                        wanaHarestayBean = TblWanaHarestayManager.getRow(intIdWana);
                        if (wanaHarestayBean.getGenzeb() < 0) {
                            txtGenzebLkah7.setText("ልቓሕ");
                        } else {
                            txtGenzebLkah7.setText("ገንዘብ");
                        }
                        txtMetenGenzeb8.setText( customFormat("###,###,###.##", wanaHarestayBean.getGenzeb()));

                        smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                        cmbSmBealFrki3.setModel(new DefaultComboBoxModel(smBealFrki.toArray()));
                        cmbSmBealFrki3.setSelectedIndex(0);
                        cmbSmBealFrki3.requestFocus();
                    } catch (SQLException ex) {
                    }
                }
            } catch (Exception ex) {
//                String errorStr = "ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ";
//                String errorType = "ሓበሬታ";
//                ConnectionManager.message(errorStr, errorType);
            }
        }
    }//GEN-LAST:event_cmbSmWanaHarestay4ActionPerformed

    private void txtThja3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtThja3KeyTyped
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtThja3KeyTyped

    private void btnShekatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShekatoActionPerformed
        // TODO add your handling code here:
        if (bzhigabyaCounter < Integer.parseInt(txtBzhiGabya2.getText())) {

            String errorStr = "<html>ተወሲዱ ዘሎ ብዝሒ ጋብያ " + txtBzhiGabya2.getText() + " እዩ፥ ትሕጃ ተመዝጊብዎ ዘሎ ግን " + bzhigabyaCounter + " እዩ።</html>";
            String errorType = "ሓበሬታ";
            ConnectionManager.message(errorStr, errorType);
            //   txtQutsriGabya.selectAll();
            // txtQutsriGabya.requestFocus();
        }
        try {
            TblMealtawiShekatay mealtawishekataybean = new TblMealtawiShekatay();

            String smShekatayStr = cmbSmShekatay.getSelectedItem().toString();
            int smShekatayIndex = smShekatay.indexOf(smShekatayStr);
            if (smShekatayIndex > 0) {
                int intIdShekatay = idShekatay.get(smShekatayIndex);
                mealtawishekataybean.setIdShekatay(intIdShekatay);
                double oyargabya = 0;
                mealtawishekataybean.setOlet(sqlDateOfToday);
                if (rbtnMaereOyar1.isSelected()) {
                    oyargabya = Double.parseDouble(txtOyarGabya3.getText());
                    mealtawishekataybean.setOyarGabya(oyargabya);
                } else {
                    oyargabya = Double.parseDouble(txtOyarGabya5.getText()) / Integer.parseInt(txtBzhiGabya2.getText());
                    mealtawishekataybean.setOyarGabya(oyargabya);
                }
                mealtawishekataybean.setOaynetFruta(cmbOaynetFruta2.getSelectedItem().toString());
                mealtawishekataybean.setFruyDekik(cmbFruyDekik2.getSelectedItem().toString());
                mealtawishekataybean.setBzhiGabya(Integer.parseInt(txtBzhiGabya2.getText()));
                mealtawishekataybean.setMizanBKilo(Double.parseDouble(txtMizanBKilo2.getText()));
                mealtawishekataybean.setWagaNKilo(Double.parseDouble(txtWagaNKilo2.getText()));
                double mizan = (Double.parseDouble(txtMizanBKilo2.getText()) - (Integer.parseInt(txtBzhiGabya2.getText()) * oyargabya));
                double teklalaWaga = mizan * Double.parseDouble(txtWagaNKilo2.getText());
                mealtawishekataybean.setTeklalaWaga(teklalaWaga);

                NewJFrame.setTeklalaWaga(teklalaWaga);
                JDlgZtekefleWagaMemezgebi jdlgZtekeObj = new JDlgZtekefleWagaMemezgebi(this, true);
                jdlgZtekeObj.setLocationRelativeTo(this);
                jdlgZtekeObj.setVisible(true);

                mealtawishekataybean.setZtekefleWaga(NewJFrame.getZtekefleWaga());

                TblShekatay shekatayBean = new TblShekatay();
                shekatayBean.setIdShekatay(intIdShekatay);
                shekatayBean.setGenzeb(NewJFrame.getZtekefleWaga() - teklalaWaga);

                try {
                    boolean b = false;
                    b = TblMealtawiShekatayManager.update(mealtawishekataybean);
                    if (!b) {
                        TblMealtawiShekatayManager.insert(mealtawishekataybean);
                    }
                    TblShekatayManager.update(shekatayBean);

                    //  TblShekatay shekatayBean = new TblShekatay();
                    String smWanaS = cmbSmShekatay.getSelectedItem().toString();
                    if (!"".equals(smWanaS)) {
                        int intIdShe = idShekatay.get(smShekatay.indexOf(smWanaS));
                        try {
                            shekatayBean = TblShekatayManager.getRow(intIdShe);
                        } catch (SQLException ex) {
                        }
                        if (shekatayBean.getGenzeb() < 0) {
                            txtGenzebLkah10.setText("ልቓሕ");
                        } else {
                            txtGenzebLkah10.setText("ገንዘብ");
                        }
                        txtMetenGenzeb11.setText(shekatayBean.getGenzeb() + "");

                    }
                    txtBzhiGabya2.setText(null);
                    txtMizanBKilo2.setText(null);
                    txtWagaNKilo2.setText(null);
                    txtBzhiGabya2.requestFocus();
                    bzhigabyaCounter = 0;
                } catch (SQLException ex) {
                    String errorStr = "ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
                    String errorType = "ጌጋ";
                    ConnectionManager.message(errorStr, errorType);
                }
            } else {
                String errorStr = "<html>ስም ዓዳጋይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ</html>";
                String errorType = "ሓበሬታ";
                ConnectionManager.message(errorStr, errorType);
            }

        } catch (Exception ex) {
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
        }

    }//GEN-LAST:event_btnShekatoActionPerformed

    private void txtWagaNKilo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWagaNKilo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWagaNKilo2ActionPerformed

    private void btnThjaGabyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThjaGabyaActionPerformed

        // TODO add your handling code here:
        TblGabya gabyaBean = new TblGabya();
        try {
            gabyaBean.setOlet(sqlDateOfToday);
            gabyaBean.setQutsriGabya(txtQutsriGabya.getText().trim());
            gabyaBean.setThja(Double.parseDouble(txtThja.getText()));
            gabyaBean.setGabyaTemelisu("ነኖ");

            String smShekatayStr = cmbSmShekatay.getSelectedItem().toString();
            int smShekatayIndex = smShekatay.indexOf(smShekatayStr);
            if (smShekatayIndex > 0) {
                gabyaBean.setIdShekatay(idShekatay.get(smShekatayIndex));
            } else {
                String errorStr = "<html>ስም ዓዳጋይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ</html>";
                JLabel warning = new JLabel();
                warning.setSize(300, 100);
                warning.setFont(new Font("Nyala", Font.PLAIN, 16));
                warning.setText(errorStr);
                JOptionPane.showMessageDialog(null, warning, "መልእኽቲ", JOptionPane.INFORMATION_MESSAGE);
            }
            try {
                boolean b = TblGabyaManager.insert(gabyaBean);
                smGabyaZeymelesu = TblGabyaManager.displayNamesNayGabyaZeymelesu();
                cmbSmGabyaZeymelesu.setModel(new DefaultComboBoxModel(smGabyaZeymelesu.toArray()));

                if (b) {
                    bzhigabyaCounter++;
                }
            } catch (SQLException ex) {
                String errorStr = "ሓበሬታ ጋብያ ክምዝገብ ኣይተኻእለን፡ ኮኔክሽ ጸገም ከይህሉ ኣረግጽ";
                String errorType = "ጌጋ";
                ConnectionManager.message(errorStr, errorType);
            }
            txtQutsriGabya.setText(null);
            txtQutsriGabya.requestFocus();
        } catch (Exception ex) {
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
        }


    }//GEN-LAST:event_btnThjaGabyaActionPerformed

    private void cmbSmWanaHarestay5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmWanaHarestay5ActionPerformed
        if ((evt.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
            try {
                TblWanaHarestay wanaHarestayBean = new TblWanaHarestay();
                String smWanaS = cmbSmWanaHarestay5.getSelectedItem().toString();
                if (!"".equals(smWanaS)) {
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaS));
                    try {
                        wanaHarestayBean = TblWanaHarestayManager.getRow(intIdWana);
                        smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                        cmbSmBealFrki4.setModel(new DefaultComboBoxModel(smBealFrki.toArray()));
                        cmbSmBealFrki4.setSelectedIndex(0);
                        cmbSmBealFrki4.requestFocus();
                    } catch (SQLException ex) {
                    }
                    if (wanaHarestayBean.getGenzeb() < 0) {
                        txtGenzebLkah3.setText("ልቓሕ");
                    } else {
                        txtGenzebLkah3.setText("ገንዘብ");
                    }

                    txtMetenGenzeb3.setText(customFormat("###,###,###.##",wanaHarestayBean.getGenzeb()) );
                }
            } catch (Exception ex) {
//                String errorStr = "<html>ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ</html>";
//                String errorType = "ሓበሬታ";
//                ConnectionManager.message(errorStr, errorType);
            }
        }
    }//GEN-LAST:event_cmbSmWanaHarestay5ActionPerformed

    private void rbtnZwesedoGenzeb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnZwesedoGenzeb5ActionPerformed
        // TODO add your handling code here:
        txtZwesedoGenzeb5.setEnabled(true);
        txtMknyat.setEnabled(true);
        txtZeetewo4.setEnabled(false);
    }//GEN-LAST:event_rbtnZwesedoGenzeb5ActionPerformed

    private void rbtnZeetewoGenzeb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnZeetewoGenzeb5ActionPerformed
        // TODO add your handling code here:
        txtZwesedoGenzeb5.setEnabled(false);
        txtMknyat.setEnabled(false);
        txtZeetewo4.setEnabled(true);

    }//GEN-LAST:event_rbtnZeetewoGenzeb5ActionPerformed

    private void cmbSmBealFrki3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmBealFrki3ActionPerformed
        try {
            String smBealFrkiStr = cmbSmBealFrki3.getSelectedItem().toString();
            if (!"ዋና ባዕሉ".equals(smBealFrkiStr)) {
                String smWanaStr = cmbSmWanaHarestay4.getSelectedItem().toString();
                int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
                smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                int intIdBealFrki = idBealFrki.get(smBealFrki.indexOf(smBealFrkiStr));
                //JOptionPane.showMessageDialog(null, intIdWana + "  " + intIdBealFrki);
                try {
                    TblBealFrki bealFrkiBean = new TblBealFrki();
                    bealFrkiBean = TblBealFrkiManager.getRow(intIdBealFrki, intIdWana);
                    if (bealFrkiBean.getGenzeb() < 0) {
                        txtGenzebLkah6.setText("ልቓሕ");
                    } else {
                        txtGenzebLkah6.setText("ገንዘብ");
                    }

                    //txtNayHabarGenzeb.setText(TblMealtawiHarestayManager.getTeklalaDmrNayHarestay(intIdWana, intIdBealFrki) + "");
                    txtMetenGenzeb7.setText(customFormat("###,###,###.##", bealFrkiBean.getGenzeb()));
                    TblWel welBean = new TblWel();
                    TblWel welBean2 = new TblWel();
                    welBean = TblWelManager.getRowOnOaynetFruta(intIdBealFrki, "ኩሉ ዓይነት");
                    welBean2 = TblWelManager.getRowOnIdBealFrki(intIdBealFrki);
                    oaynetFrutaList = TblWelManager.getOaynetFrutaFromMealHarNotInWel(intIdBealFrki);
                    if (welBean != null || oaynetFrutaList.size() < 2) {

                        rbtnWelBebeynu.setEnabled(false);
                        rbtnWelmaere.setEnabled(false);
                        txtWelMaereTekoynu.setEnabled(false);
                        txtWelMaereTezeykoynu.setEnabled(false);
                        cmbOaynetFruta5.setEnabled(false);
                        btnWelBebeynu.setEnabled(false);
                        btnHsabHarestay.setEnabled(false);
                    } else {

                        cmbOaynetFruta5.setModel(new DefaultComboBoxModel(oaynetFrutaList.toArray()));
                        rbtnWelBebeynu.setEnabled(true);
                        rbtnWelBebeynu.setSelected(true);
                        if (welBean2 != null) {
                            rbtnWelmaere.setEnabled(false);
                        } else {
                            rbtnWelmaere.setEnabled(true);
                        }
//                        txtWelMaereTekoynu.setEnabled(true);
                        txtWelMaereTezeykoynu.setEnabled(true);
                        cmbOaynetFruta5.setEnabled(true);
                        btnWelBebeynu.setEnabled(true);
//                        btnHsabHarestay.setEnabled(true);
                    }

                } catch (SQLException ex) {
                }
            } else {
                txtMetenGenzeb7.setText(txtMetenGenzeb8.getText());
                rbtnWelBebeynu.setEnabled(false);
                rbtnWelmaere.setEnabled(false);
                txtWelMaereTekoynu.setEnabled(false);
                txtWelMaereTezeykoynu.setEnabled(false);
                cmbOaynetFruta5.setEnabled(false);
                btnWelBebeynu.setEnabled(false);
                btnHsabHarestay.setEnabled(false);
            }
        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, ex);
//            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
//                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
//            String errorType = "ጌጋ";
//            ConnectionManager.message(errorStr, errorType);
        }
    }//GEN-LAST:event_cmbSmBealFrki3ActionPerformed

    private void txtMknyatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMknyatKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMknyatKeyTyped

    private void txtMknyataKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMknyataKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMknyataKeyTyped

    private void txtWagaNKilo2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtWagaNKilo2MouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_txtWagaNKilo2MouseExited

    private void chkZhaderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chkZhaderKeyPressed

    }//GEN-LAST:event_chkZhaderKeyPressed

    private void rbtnMaereOyarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMaereOyarActionPerformed
        txtOyarGabya1.setText(null);
        txtOyarGabya1.setEnabled(false);
        txtOyarGabya.setEnabled(true);
        txtOyarGabya.requestFocus();

    }//GEN-LAST:event_rbtnMaereOyarActionPerformed

    private void rbtnOyarBebeynuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOyarBebeynuActionPerformed
        txtOyarGabya.setText(null);
        txtOyarGabya.setEnabled(false);
        txtOyarGabya1.setEnabled(true);
        txtOyarGabya1.requestFocus();

    }//GEN-LAST:event_rbtnOyarBebeynuActionPerformed

    private void btnWelBebeynuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWelBebeynuActionPerformed
        try {
            String smWanaStr = cmbSmWanaHarestay4.getSelectedItem().toString();
            int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
            String smBealFrkiStr = cmbSmBealFrki3.getSelectedItem().toString();
            smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
            int intIdBealFrki = idBealFrki.get(smBealFrki.indexOf(smBealFrkiStr));
            String oaynetFruta = cmbOaynetFruta5.getSelectedItem().toString();
            if (!"".equals(oaynetFruta)) {
                double wel = Double.parseDouble(txtWelMaereTezeykoynu.getText().trim());
                double teklalaDmr = TblMealtawiHarestayManager.getTeklalaDmrNayHarOnOyanerFruta(oaynetFruta, intIdWana, intIdBealFrki);
                double nayBealFrki = teklalaDmr * (wel / 100);
                double nayWana = teklalaDmr * ((100 - wel) / 100);

                TblWanaHarestay wanaBean = new TblWanaHarestay();
                wanaBean.setGenzeb(nayWana);
                wanaBean.setIdWana(intIdWana);
                TblWanaHarestayManager.update(wanaBean);

                TblBealFrki bealFrkiBean = new TblBealFrki();
                bealFrkiBean.setGenzeb(nayBealFrki);
                bealFrkiBean.setIdWana(intIdWana);
                bealFrkiBean.setIdBealFrki(intIdBealFrki);
                TblBealFrkiManager.update(bealFrkiBean);

                TblWel welBean = new TblWel();
                welBean.setIdBealFrki(intIdBealFrki);
                welBean.setOaynetFruta(oaynetFruta);
                welBean.setWel(wel);
                TblWelManager.insert(welBean);

                oaynetFrutaList.remove(oaynetFruta);
                cmbOaynetFruta5.setModel(new DefaultComboBoxModel(oaynetFrutaList.toArray()));

                wanaBean = TblWanaHarestayManager.getRow(intIdWana);
                if (wanaBean.getGenzeb() < 0) {
                    txtGenzebLkah7.setText("ልቓሕ");
                } else {
                    txtGenzebLkah7.setText("ገንዘብ");
                }
                txtMetenGenzeb8.setText(wanaBean.getGenzeb() + "");

                bealFrkiBean = TblBealFrkiManager.getRow(intIdBealFrki, intIdWana);
                if (bealFrkiBean.getGenzeb() < 0) {
                    txtGenzebLkah6.setText("ልቓሕ");
                } else {
                    txtGenzebLkah6.setText("ገንዘብ");
                }
                //txtNayHabarGenzeb.setText(TblMealtawiHarestayManager.getTeklalaDmrNayHarestay(intIdWana, intIdBealFrki) + "");
                txtMetenGenzeb7.setText(bealFrkiBean.getGenzeb() + "");
                if (cmbOaynetFruta5.getItemCount() < 2) {
                    txtWelMaereTekoynu.setText("");
                    txtWelMaereTezeykoynu.setText("");

                    rbtnWelBebeynu.setEnabled(false);
                    rbtnWelmaere.setEnabled(false);
                    txtWelMaereTekoynu.setEnabled(false);
                    txtWelMaereTezeykoynu.setEnabled(false);
                    cmbOaynetFruta5.setEnabled(false);
                    btnWelBebeynu.setEnabled(false);
                    btnHsabHarestay.setEnabled(false);
                }
            } else {
                String errorStr = "ዓይነት ፍሩታ ብትኽክል ምረጽ";
                String errorType = "ሓበሬታ";
                ConnectionManager.message(errorStr, errorType);
            }
        } catch (Exception ex) {
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
        }
    }//GEN-LAST:event_btnWelBebeynuActionPerformed

    private void rbtnWelBebeynuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnWelBebeynuActionPerformed
        // TODO add your handling code here:
         txtWelMaereTekoynu.setText("");
         btnHsabHarestay.setEnabled(false);
        txtWelMaereTekoynu.setEnabled(false);
        cmbOaynetFruta5.setEnabled(true);
        txtWelMaereTezeykoynu.setEnabled(true);
        btnWelBebeynu.setEnabled(true);
    }//GEN-LAST:event_rbtnWelBebeynuActionPerformed

    private void rbtnWelmaereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnWelmaereActionPerformed
         txtWelMaereTezeykoynu.setText("");
        cmbOaynetFruta5.setEnabled(false);
        txtWelMaereTezeykoynu.setEnabled(false);
        btnWelBebeynu.setEnabled(false);
        txtWelMaereTekoynu.setEnabled(true);
        btnHsabHarestay.setEnabled(true);
    }//GEN-LAST:event_rbtnWelmaereActionPerformed

    private void rbtnMaereOyar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMaereOyar1ActionPerformed
        // TODO add your handling code here:
        txtOyarGabya5.setText(null);
        txtOyarGabya5.setEnabled(false);
        txtOyarGabya3.setEnabled(true);
        txtOyarGabya3.requestFocus();
    }//GEN-LAST:event_rbtnMaereOyar1ActionPerformed

    private void rbtnOyarBebeynu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnOyarBebeynu1ActionPerformed
        // TODO add your handling code here:
        txtOyarGabya3.setText(null);
        txtOyarGabya3.setEnabled(false);
        txtOyarGabya5.setEnabled(true);
        txtOyarGabya5.requestFocus();
    }//GEN-LAST:event_rbtnOyarBebeynu1ActionPerformed

    private void txtOyarGabya3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOyarGabya3KeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtOyarGabya3KeyTyped

    private void txtOyarGabya5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOyarGabya5KeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtOyarGabya5KeyTyped

    private void txtWagaNKilo2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWagaNKilo2FocusLost

    }//GEN-LAST:event_txtWagaNKilo2FocusLost

    private void txtMizanBKilo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMizanBKilo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMizanBKilo2ActionPerformed

    private void txtMizanBKiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMizanBKiloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMizanBKiloActionPerformed

    private void rbtnZwesedoGenzeb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnZwesedoGenzeb2ActionPerformed
        // TODO add your handling code here:
        txtZeetewoGenzeb2.setEnabled(false);
        txtZwesedoGenzeb2.setEnabled(true);
        txtMknyata.setEnabled(true);

    }//GEN-LAST:event_rbtnZwesedoGenzeb2ActionPerformed

    private void txtMknyataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMknyataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMknyataActionPerformed

    private void txtZeetewoGenzeb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZeetewoGenzeb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZeetewoGenzeb2ActionPerformed

    private void cmbSmBealFrki4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmBealFrki4ActionPerformed

        // TODO add your handling code here:
        String smBealFrkiStr = cmbSmBealFrki4.getSelectedItem().toString();
        if (!"ዋና ባዕሉ".equals(smBealFrkiStr)) {
            rbtnZwesedoGenzeb7.setEnabled(true);
            rbtnZeetewoGenzeb7.setEnabled(true);
            rbtnZwesedoGenzeb7.setSelected(true);
            txtZwesedoGenzeb6.setEnabled(true);
            txtMknayt1.setEnabled(true);
            btnHarestayZeetwoZwesedoGen6.setEnabled(true);

            String smWanaStr = cmbSmWanaHarestay5.getSelectedItem().toString();
            int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
            try {
                smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
            } catch (SQLException ex) {
            }
            int intIdBealFrki = idBealFrki.get(smBealFrki.indexOf(smBealFrkiStr));
            
            TblBealFrki bealFrkiBean = new TblBealFrki();
            try {
                bealFrkiBean = TblBealFrkiManager.getRow(intIdBealFrki, intIdWana);
            } catch (SQLException ex) {
                Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (bealFrkiBean.getGenzeb() < 0) {
                txtGenzebLkah8.setText("ልቓሕ");
            } else {
                txtGenzebLkah8.setText("ገንዘብ");
            }

            //txtNayHabarGenzeb.setText(TblMealtawiHarestayManager.getTeklalaDmrNayHarestay(intIdWana, intIdBealFrki) + "");
            txtMetenGenzeb9.setText(customFormat("###,###,###.##",bealFrkiBean.getGenzeb()) );
        } else {
            txtZwesedoGenzeb6.setText(null);
            txtMknayt1.setText(null);
            txtZeetewo5.setText(null);
            rbtnZwesedoGenzeb7.setEnabled(false);
            rbtnZeetewoGenzeb7.setEnabled(false);
            txtZwesedoGenzeb6.setEnabled(false);
            txtZeetewo5.setEnabled(false);

            txtMknayt1.setEnabled(false);
            btnHarestayZeetwoZwesedoGen6.setEnabled(false);

        }


    }//GEN-LAST:event_cmbSmBealFrki4ActionPerformed

    private void rbtnAtawiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAtawiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnAtawiActionPerformed

    private void rbtnWesaeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnWesaeiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnWesaeiActionPerformed

    private void btnHsabHarestay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHsabHarestay2ActionPerformed
        // TODO add your handling code here: TblAtawiWetsaeiTkal zeytesheteBean = new TblAtawiWetsaeiTkal();
        try {
            TblShekatay shekatayBean = new TblShekatay();
            TblAtawiWetsaeiTkal atawiWetsaeiBean = new TblAtawiWetsaeiTkal();
            String smShekatayStr = cmbSmShekatay6.getSelectedItem().toString();
            if (!"".equals(smShekatayStr)) {
                int smShekatayIndex = smShekatay.indexOf(smShekatayStr);
                if (smShekatayIndex > 0) {
                    int intIdShekatay = idShekatay.get(smShekatay.indexOf(smShekatayStr));

                    if (rbtnZeetewoGenzeb2.isSelected()) {
                        shekatayBean.setGenzeb(Double.parseDouble(txtZeetewoGenzeb2.getText()));
                        atawiWetsaeiBean.setAtawiWetsaei("ዝኣተወ");
                        atawiWetsaeiBean.setReason("");
                        atawiWetsaeiBean.setGenzeb(Double.parseDouble(txtZeetewoGenzeb2.getText()));
                    } else {
                        shekatayBean.setGenzeb(-Double.parseDouble(txtZwesedoGenzeb2.getText()));
                        atawiWetsaeiBean.setAtawiWetsaei("ልቓሕ");
                        atawiWetsaeiBean.setReason("");
                        atawiWetsaeiBean.setGenzeb(Double.parseDouble(txtZwesedoGenzeb2.getText()));
                    }
                    shekatayBean.setIdShekatay(intIdShekatay);

                    atawiWetsaeiBean.setOlet(sqlDateOfToday);
                    atawiWetsaeiBean.setSm(smShekatayStr);
                    atawiWetsaeiBean.setDescription(txtMknyata.getText().trim());

                    try {
                        TblShekatayManager.update(shekatayBean);

                        boolean b = false;
                        b = TblAtawiWetsaeiTkalManager.updateAta(atawiWetsaeiBean);
                        if (!b) {
                            TblAtawiWetsaeiTkalManager.insert(atawiWetsaeiBean);
                            try {
                                smtelekahi = TblAtawiWetsaeiTkalManager.displayAllNames();
                            } catch (SQLException ex) {
                            }
                            cmbSmTelekahi.setModel(new DefaultComboBoxModel(smtelekahi.toArray()));
                        }

                        shekatayBean = TblShekatayManager.getRow(intIdShekatay);

                        if (shekatayBean.getGenzeb() < 0) {
                            txtGenzeLkah4.setText("ልቓሕ");
                        } else {
                            txtGenzeLkah4.setText("ገንዘብ");
                        }

                        txtMetenGenzeb4.setText(customFormat("###,###,###.##", shekatayBean.getGenzeb()));
                        txtZeetewoGenzeb2.setText(null);
                        txtZwesedoGenzeb2.setText(null);
                        txtMknyata.setText(null);
                        txtZwesedoGenzeb5.setFocusable(true);

                    } catch (SQLException ex) {
                        String errorStr = "ኮኔክሽ ጸገም ከይህሉ ኣረግጽ";
                        String errorType = "ጌጋ";
                        ConnectionManager.message(errorStr, errorType);
                    }

                } else {
                    String errorStr = "ስም ኣቐድሚካ ኣመዝግቦ";
                    String errorType = "ሓበሬታ";
                    ConnectionManager.message(errorStr, errorType);
                }
            }//End of if (!"".equals(smShekatayStr))
        } catch (Exception ex) {
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
        }


    }//GEN-LAST:event_btnHsabHarestay2ActionPerformed

    private void txtOyarGabyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOyarGabyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOyarGabyaActionPerformed

    private void txtBzhiGabyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBzhiGabyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBzhiGabyaActionPerformed

    private void cmbSmWanaHarestay6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmWanaHarestay6ActionPerformed
        if ((evt.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
            try {
                String smWanaStr = cmbSmWanaHarestay6.getSelectedItem().toString();
                smWanaHarestay = TblWanaHarestayManager.displayData();
                if (!"".equals(smWanaStr)) {
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
                    try {
                        TblWanaHarestay wanaHarestayBean = new TblWanaHarestay();
                        wanaHarestayBean = TblWanaHarestayManager.getRow(intIdWana);
                        if (wanaHarestayBean.getGenzeb() < 0) {
                            txtGenzebLkah4.setText("ልቓሕ");
                        } else {
                            txtGenzebLkah4.setText("ገንዘብ");
                        }
                        //txtMetenGenzeb5.setText(wanaHarestayBean.getGenzeb() + "");
                        txtMetenGenzeb5.setText(customFormat("###,###,###.##",wanaHarestayBean.getGenzeb()) );
                        smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                        cmbSmBealFrki5.setModel(new DefaultComboBoxModel(smBealFrki.toArray()));
                        cmbSmBealFrki5.setSelectedIndex(0);
                        cmbSmBealFrki5.requestFocus();
                    } catch (SQLException ex) {
                    }
                }
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_cmbSmWanaHarestay6ActionPerformed

    private void txtMetenGenzeb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMetenGenzeb5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMetenGenzeb5ActionPerformed

    private void cmbSmShekatay7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmShekatay7ActionPerformed
        // TODO add your handling code here:
        if ((evt.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
            try {

                TblShekatay shekatayBean = new TblShekatay();
                String smWanaS = cmbSmShekatay7.getSelectedItem().toString();
                if (!"".equals(smWanaS)) {
                    smShekatay = TblShekatayManager.displayData();
                    int intIdShe = idShekatay.get(smShekatay.indexOf(smWanaS));
                    try {
                        shekatayBean = TblShekatayManager.getRow(intIdShe);
                    } catch (SQLException ex) {
                    }
                    if (shekatayBean.getGenzeb() < 0) {
                        txtGenzebLkah5.setText("ልቓሕ");
                    } else {
                        txtGenzebLkah5.setText("ገንዘብ");
                    }
                    txtMetenGenzeb6.setText(customFormat("###,###,###.##",shekatayBean.getGenzeb())  );
                }

            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_cmbSmShekatay7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            TblAtawiWetsaeiTkal atawiWetsaeiBean = new TblAtawiWetsaeiTkal();
            atawiWetsaeiBean.setOlet(sqlDateOfToday);
            //  atawiWetsaeiBean.setSm("ናይ ትካል");
            atawiWetsaeiBean.setReason(cmbSmShekatay2.getSelectedItem().toString());
            if (rbtnWesaei.isSelected()) {
                atawiWetsaeiBean.setAtawiWetsaei("ወጻኢ");
                atawiWetsaeiBean.setGenzeb( -(Double.parseDouble(txtOyarGabya4.getText())));
            } else {
                atawiWetsaeiBean.setAtawiWetsaei("ኣታዊ");
                atawiWetsaeiBean.setGenzeb((Double.parseDouble(txtOyarGabya4.getText())));
            }
            atawiWetsaeiBean.setDescription(cmbBzhiGabya3.getText().trim());
            

            try {
                TblAtawiWetsaeiTkalManager.insert(atawiWetsaeiBean);
                txtOyarGabya4.setText("");
                cmbBzhiGabya3.setText("");
            } catch (SQLException ex) {
            }
        } catch (Exception ex) {
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtOyarGabya3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOyarGabya3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOyarGabya3ActionPerformed

    private void txtOyarGabya4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOyarGabya4KeyTyped
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtOyarGabya4KeyTyped

    private void chkZhaderItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkZhaderItemStateChanged
        if (chkZhader.getState()) {
            setZhader("ዝሓደረ");
            jLabel39.setVisible(true);
        } else {
            setZhader("---");
            jLabel39.setVisible(false);
        }
    }//GEN-LAST:event_chkZhaderItemStateChanged

    private void btnHarestayZeetwoZwesedoGen5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHarestayZeetwoZwesedoGen5ActionPerformed
        // TODO add your handling code here:
        try {
            TblWanaHarestay wanaHarestayBean = new TblWanaHarestay();
            TblAtawiWetsaeiTkal atawiWetsaeiBean = new TblAtawiWetsaeiTkal();
            String smWanaStr = cmbSmWanaHarestay5.getSelectedItem().toString();
            if (!"".equals(smWanaStr)) {
                int smWanaIndex = smWanaHarestay.indexOf(smWanaStr);
                if (smWanaIndex > 0) {
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
                    if (rbtnZwesedoGenzeb5.isSelected()) {
                        wanaHarestayBean.setGenzeb(-Double.parseDouble(txtZwesedoGenzeb5.getText()));
                        atawiWetsaeiBean.setAtawiWetsaei("ልቓሕ");
                        atawiWetsaeiBean.setReason("");
                        atawiWetsaeiBean.setGenzeb(Double.parseDouble(txtZwesedoGenzeb5.getText()));
                    } else {
                        wanaHarestayBean.setGenzeb(Double.parseDouble(txtZeetewo4.getText()));
                        atawiWetsaeiBean.setAtawiWetsaei("ዝኣተወ");
                        atawiWetsaeiBean.setReason("");
                        atawiWetsaeiBean.setGenzeb(Double.parseDouble(txtZeetewo4.getText()));
                    }
                    wanaHarestayBean.setIdWana(intIdWana);

                    atawiWetsaeiBean.setOlet(sqlDateOfToday);
                    atawiWetsaeiBean.setSm(smWanaStr);
                    atawiWetsaeiBean.setDescription(txtMknyat.getText().trim());

                    try {
                        TblWanaHarestayManager.update(wanaHarestayBean);

                        boolean b = false;
                        b = TblAtawiWetsaeiTkalManager.updateAta(atawiWetsaeiBean);
                        if (!b) {
                            TblAtawiWetsaeiTkalManager.insert(atawiWetsaeiBean);
                            try {
                                smtelekahi = TblAtawiWetsaeiTkalManager.displayAllNames();
                            } catch (SQLException ex) {
                            }
                            cmbSmTelekahi.setModel(new DefaultComboBoxModel(smtelekahi.toArray()));
                        }

                        wanaHarestayBean = TblWanaHarestayManager.getRow(intIdWana);

                        if (wanaHarestayBean.getGenzeb() < 0) {
                            txtGenzebLkah3.setText("ልቓሕ");
                        } else {
                            txtGenzebLkah3.setText("ገንዘብ");
                        }

                        txtMetenGenzeb3.setText(customFormat("###,###,###.##",wanaHarestayBean.getGenzeb()));
                        txtZwesedoGenzeb5.setText(null);
                        txtZeetewo4.setText(null);
                        txtMknyat.setText(null);
                        txtZwesedoGenzeb5.setFocusable(true);

                    } catch (SQLException ex) {
                        String errorStr = "ኮኔክሽ ጸገም ከይህሉ ኣረግጽ";
                        String errorType = "ጌጋ";
                        ConnectionManager.message(errorStr, errorType);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "register first");
                    String errorStr = "ስም ኣቐድሚካ ኣመዝግቦ";
                    String errorType = "ሓበሬታ";
                    ConnectionManager.message(errorStr, errorType);
                }
            }//End of if(!= "" smWanaStr)
        } catch (Exception ex) {
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
        }
    }//GEN-LAST:event_btnHarestayZeetwoZwesedoGen5ActionPerformed

    private void txtMizanBKilo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMizanBKilo2KeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtMizanBKilo2KeyTyped

    private void txtWagaNKilo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWagaNKilo2KeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtWagaNKilo2KeyTyped

    private void txtBzhiGabya2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBzhiGabya2KeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedIsInteger(evt);
    }//GEN-LAST:event_txtBzhiGabya2KeyTyped

    private void txtZwesedoGenzeb5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZwesedoGenzeb5KeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtZwesedoGenzeb5KeyTyped

    private void txtZeetewo4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZeetewo4KeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtZeetewo4KeyTyped

    private void txtZeetewoGenzeb2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZeetewoGenzeb2KeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtZeetewoGenzeb2KeyTyped

    private void txtZwesedoGenzeb2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZwesedoGenzeb2KeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtZwesedoGenzeb2KeyTyped

    private void txtWelMaereTekoynuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWelMaereTekoynuKeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtWelMaereTekoynuKeyTyped

    private void txtWelMaereTezeykoynuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWelMaereTezeykoynuKeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtWelMaereTezeykoynuKeyTyped

    private void txtOyarGabya4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOyarGabya4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOyarGabya4ActionPerformed

    private void cmbBzhiGabya3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmbBzhiGabya3KeyTyped

    }//GEN-LAST:event_cmbBzhiGabya3KeyTyped

    private void rbtnThjaTemelisuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnThjaTemelisuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnThjaTemelisuActionPerformed

    private void rbtnThjaAytemelsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnThjaAytemelsenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnThjaAytemelsenActionPerformed

    private void cmbSmWanaHarestay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmWanaHarestay3ActionPerformed
        // TODO add your handling code here:
        if ((evt.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
            try {
                String smWanaStr = cmbSmWanaHarestay3.getSelectedItem().toString();
                if (!"".equals(smWanaStr)) {
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
                    try {
                        smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                        cmbSmBealFrki1.setModel(new DefaultComboBoxModel(smBealFrki.toArray()));
                        cmbSmBealFrki1.setSelectedIndex(0);
                        cmbSmBealFrki1.requestFocus();
                    } catch (SQLException ex) {
                    }
                }
            } catch (Exception ex) {
//                String errorStr = "ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ";
//                String errorType = "ሓበሬታ";
//                ConnectionManager.message(errorStr, errorType);
            }
        }
    }//GEN-LAST:event_cmbSmWanaHarestay3ActionPerformed

    private void cmbSmBealFrki1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmBealFrki1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSmBealFrki1ActionPerformed

    private void txtBtshitBealFrki1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBtshitBealFrki1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBtshitBealFrki1ActionPerformed

    private void txtBtshitBealFrki1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBtshitBealFrki1KeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtBtshitBealFrki1KeyTyped

    private void btnHadshHarestayMezgb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHadshHarestayMezgb1ActionPerformed
        if (!"".equals(txtBtshitBealFrki1.getText().trim())) {
            TblWel welBean = new TblWel();
            try {
                String smWanaStr = cmbSmWanaHarestay3.getSelectedItem().toString();
                if (!"".equals(smWanaStr)) {
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
                    if (intIdWana > 0) {
                        try {
                            smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                            String smBealFrkiStr = cmbSmBealFrki1.getSelectedItem().toString().trim();
                            if (!"".equals(smBealFrkiStr) && !"ዋና ባዕሉ".equals(smBealFrkiStr)) {
                                int intIdBealFrki = idBealFrki.get(smBealFrki.indexOf(smBealFrkiStr));
                                String oaynetFruta = cmbOaynetFruta4.getSelectedItem().toString().trim();
                                welBean.setIdBealFrki(intIdBealFrki);
                                welBean.setWel(Double.parseDouble(txtBtshitBealFrki1.getText().trim()));
                                welBean.setOaynetFruta(oaynetFruta);
                                if ("ኩሉ ዓይነት".equals(oaynetFruta)) {
                                    try {
                                        TblWelManager.delete(intIdBealFrki);
                                        TblWelManager.insert(welBean);
                                        txtBtshitBealFrki1.setText("");
                                    } catch (SQLException ex) {
                                    }
                                } else {
                                    TblWel welBean1 = new TblWel();
                                    try {
                                        welBean1 = TblWelManager.getRowOnOaynetFruta(intIdBealFrki, "ኩሉ ዓይነት");
                                        if (welBean1 != null) {                                            
                                            TblWelManager.delete(intIdBealFrki);
                                        }
                                        boolean b = true;
                                        b = TblWelManager.update(welBean);
                                        if (!b) {
                                            TblWelManager.insert(welBean);
                                        }
                                        txtBtshitBealFrki1.setText("");
                                    } catch (SQLException ex) {
                                    }
                                }

                            } else {
                                String errorStr = "ስም በዓል ፍርቂ ምረጽ";
                                String errorType = "ጌጋ";
                                ConnectionManager.message(errorStr, errorType);
                                cmbSmBealFrki1.requestFocus();
                            }
                        } catch (SQLException ex) {
                        }
                    }
                }
            } catch (Exception ex) {
                String errorStr = "ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ";
                String errorType = "ሓበሬታ";
                ConnectionManager.message(errorStr, errorType);
            }
        } else {
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
        }

    }//GEN-LAST:event_btnHadshHarestayMezgb1ActionPerformed

    private void txtZwesedoGenzeb6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZwesedoGenzeb6KeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtZwesedoGenzeb6KeyTyped

    private void rbtnZwesedoGenzeb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnZwesedoGenzeb7ActionPerformed
        // TODO add your handling code here:
        txtZwesedoGenzeb6.setEnabled(true);
        txtMknayt1.setEnabled(true);
        txtZeetewo5.setEnabled(false);
        txtZeetewo5.setText(null);
    }//GEN-LAST:event_rbtnZwesedoGenzeb7ActionPerformed

    private void rbtnZeetewoGenzeb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnZeetewoGenzeb7ActionPerformed
        txtZwesedoGenzeb6.setEnabled(false);
        txtMknayt1.setEnabled(false);
        txtZeetewo5.setEnabled(true);
        txtZwesedoGenzeb6.setText(null);
        txtMknayt1.setText(null);
    }//GEN-LAST:event_rbtnZeetewoGenzeb7ActionPerformed

    private void txtZeetewo5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZeetewo5KeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtZeetewo5KeyTyped

    private void txtMknayt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMknayt1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMknayt1KeyTyped

    private void btnHarestayZeetwoZwesedoGen6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHarestayZeetwoZwesedoGen6ActionPerformed
        // TODO add your handling code here:

        try {
            TblBealFrki bealFrkiBean = new TblBealFrki();
            TblAtawiWetsaeiTkal atawiWetsaeiBean = new TblAtawiWetsaeiTkal();
            String smWanaStr = cmbSmWanaHarestay5.getSelectedItem().toString();
            int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
            if (intIdWana > 0) {
                try {
                    String smBealFrkiStr = cmbSmBealFrki4.getSelectedItem().toString();
                    if (!"".equals(smBealFrkiStr) && !"ዋና ባዕሉ".equals(smBealFrkiStr)) {
                        smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                        int smBealFrkiIndex = smBealFrki.indexOf(smBealFrkiStr);
                        if (smBealFrkiIndex > 0) {
                            int intIdBealFrki = idBealFrki.get(smBealFrki.indexOf(smBealFrkiStr));
                            //  int intIdBealFrki = idBealFrki.get(smBealFrkiIndex);
                            if (rbtnZwesedoGenzeb7.isSelected()) {
                                bealFrkiBean.setGenzeb(-Double.parseDouble(txtZwesedoGenzeb6.getText()));
                                atawiWetsaeiBean.setAtawiWetsaei("ልቓሕ");
                                atawiWetsaeiBean.setReason("");
                                atawiWetsaeiBean.setGenzeb(Double.parseDouble(txtZwesedoGenzeb6.getText()));
                            } else {
                                bealFrkiBean.setGenzeb(Double.parseDouble(txtZeetewo5.getText()));
                                atawiWetsaeiBean.setAtawiWetsaei("ዝእተወ");
                                atawiWetsaeiBean.setReason("");
                                atawiWetsaeiBean.setGenzeb(Double.parseDouble(txtZeetewo5.getText()));
                            }

                            atawiWetsaeiBean.setOlet(sqlDateOfToday);
                            atawiWetsaeiBean.setSm(smBealFrkiStr);
                            atawiWetsaeiBean.setDescription(txtMknayt1.getText().trim());

                            bealFrkiBean.setIdBealFrki(intIdBealFrki);
                            try {
                                TblBealFrkiManager.update(bealFrkiBean);

                                boolean b = false;
                                b = TblAtawiWetsaeiTkalManager.updateAta(atawiWetsaeiBean);
                                if (!b) {
                                    TblAtawiWetsaeiTkalManager.insert(atawiWetsaeiBean);
                                    try {
                                        smtelekahi = TblAtawiWetsaeiTkalManager.displayAllNames();
                                    } catch (SQLException ex) {
                                    }
                                    cmbSmTelekahi.setModel(new DefaultComboBoxModel(smtelekahi.toArray()));
                                }

                                bealFrkiBean = TblBealFrkiManager.getRow(intIdBealFrki, intIdWana);
                                double genzeb = 0;
                                if (bealFrkiBean.getGenzeb() < 0) {
                                    txtGenzebLkah8.setText("ልቓሕ");
                                    genzeb = - (bealFrkiBean.getGenzeb());
                                } else {                                    
                                    txtGenzebLkah8.setText("ገንዘብ");
                                    genzeb = (bealFrkiBean.getGenzeb());
                                }

                                txtMetenGenzeb9.setText(customFormat("###,###,###.##",genzeb));
                                txtZwesedoGenzeb6.setText(null);
                                txtZeetewo5.setText(null);
                                txtMknayt1.setText(null);

                            } catch (SQLException ex) {
                                String errorStr = "ኮኔክሽ ጸገም ከይህሉ ኣረግጽ";
                                String errorType = "ጌጋ";
                                ConnectionManager.message(errorStr, errorType);
                            }
                        } else {
                            String errorStr = "ስም በዓል ፍርቂ ኣተመዝገበን፡ ቀዲምካ ኣመዝግቦ";
                            String errorType = "ሓበሬታ";
                            ConnectionManager.message(errorStr, errorType);
                        }
                    }//End of if(!"".equals(smBealFrki))
                } catch (Exception ex) {
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
        }
    }//GEN-LAST:event_btnHarestayZeetwoZwesedoGen6ActionPerformed

    private void txtZwesedoGenzeb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZwesedoGenzeb6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZwesedoGenzeb6ActionPerformed

    private void cmbSmBealFrki5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmBealFrki5ActionPerformed
        // TODO add your handling code here:
        try {
            String smBealFrkiStr = cmbSmBealFrki5.getSelectedItem().toString();
            if (!"ዋና ባዕሉ".equals(smBealFrkiStr)) {
                String smWanaStr = cmbSmWanaHarestay6.getSelectedItem().toString();
                int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
                smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                int intIdBealFrki = idBealFrki.get(smBealFrki.indexOf(smBealFrkiStr));
                try {
                    TblBealFrki bealFrkiBean = new TblBealFrki();
                    bealFrkiBean = TblBealFrkiManager.getRow(intIdBealFrki, intIdWana);
                    if (bealFrkiBean.getGenzeb() < 0) {
                        txtGenzebLkah9.setText("ልቓሕ");
                    } else {
                        txtGenzebLkah9.setText("ገንዘብ");
                    }

                    txtMetenGenzeb10.setText(customFormat("###,###,###.##",bealFrkiBean.getGenzeb()) );

                } catch (SQLException ex) {
                }
            }
        } catch (Exception ex) {
//            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
//                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
//            String errorType = "ጌጋ";
//            ConnectionManager.message(errorStr, errorType);
        }
    }//GEN-LAST:event_cmbSmBealFrki5ActionPerformed

    private void txtMetenGenzeb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMetenGenzeb10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMetenGenzeb10ActionPerformed

    private void cmbSmWanaHarestayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbSmWanaHarestayFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSmWanaHarestayFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String smWanaStr = cmbSmWanaHarestay6.getSelectedItem().toString();
            if (!"".equals(smWanaStr)) {
                int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
                try {
                    TblWanaHarestay wanaHarestayBean = new TblWanaHarestay();
                    wanaHarestayBean = TblWanaHarestayManager.getRow(intIdWana);
                    smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                    if (wanaHarestayBean.getGenzeb() > -1 && wanaHarestayBean.getGenzeb() < 1) {
                        // smBealFrki == null                       
                        if (cmbSmBealFrki5.getItemCount() < 2) {
                            TblMealtawiHarestayManager.deleteWana(intIdWana);
                            TblWanaHarestayManager.delete(intIdWana);
                            smWanaHarestay = TblWanaHarestayManager.displayData();
                            cmbSmWanaHarestay.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
                            cmbSmWanaHarestay2.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
                            cmbSmWanaHarestay3.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
                            cmbSmWanaHarestay4.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
                            cmbSmWanaHarestay5.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
//                            cmbSmWanaHarestay6.setModel(new DefaultComboBoxModel(smWanaHarestay.toArray()));
                            cmbSmWanaHarestay6.removeItem(smWanaStr);

                        } else {
                            String errorStr = "ቕድም ሰብ ፍርቂ ደምስስ";
                            String errorType = "ሓበሬታ";
                            ConnectionManager.message(errorStr, errorType);
                            cmbSmBealFrki5.requestFocus();
                        }
                    } else {
                        String errorStr = "ዋና ሓረስታይ፥ ሕሳብ ስለ ዘለዎ ክድምሰስ ኣይከኣልን እዩ።";
                        String errorType = "መጠንቀቕታ";
                        ConnectionManager.message(errorStr, errorType);
                    }
                } catch (SQLException ex) {
                }
            }
        } catch (Exception ex) {
            String errorStr = "<html>ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ</html>";
            String errorType = "ሓበሬታ";
            ConnectionManager.message(errorStr, errorType);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        try {
            String smBealFrkiStr = cmbSmBealFrki5.getSelectedItem().toString();
            if (!"ዋና ባዕሉ".equals(smBealFrkiStr)) {
                String smWanaStr = cmbSmWanaHarestay6.getSelectedItem().toString();
                int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));                
                smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                int intIdBealFrki = idBealFrki.get(smBealFrki.indexOf(smBealFrkiStr));
                try {
                    TblBealFrki bealFrkiBean = new TblBealFrki();
                    bealFrkiBean = TblBealFrkiManager.getRow(intIdBealFrki, intIdWana);
                    if (bealFrkiBean.getGenzeb() > -1 && bealFrkiBean.getGenzeb() < 1 ) {
                        txtMetenGenzeb10.setText(bealFrkiBean.getGenzeb() + "");
                        TblWelManager.delete(intIdBealFrki);
                        TblMealtawiHarestayManager.deleteBealFrki(intIdWana, intIdBealFrki);
                        TblBealFrkiManager.delete(intIdBealFrki);
                        //cmbSmBealFrki5.setSelectedIndex(0);
                        cmbSmWanaHarestay6.setSelectedIndex(1);
                    } else {
                        String errorStr = "በዓል ፍርቂ፥ ሕሳብ ስለ ዘለዎ ክድምሰስ ኣይከኣልን እዩ።";
                        String errorType = "መጠንቀቕታ";
                        ConnectionManager.message(errorStr, errorType);
                    }

                } catch (SQLException ex) {
                }

            }
        } catch (Exception ex) {
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try {
            smShekatay = TblShekatayManager.displayData();
            String smShekatayStr = cmbSmShekatay7.getSelectedItem().toString();
            if (!"".equals(smShekatayStr)) {
                int intIdShekatay = idShekatay.get(smShekatay.indexOf(smShekatayStr));
                try {
                    TblShekatay shekatayBean = new TblShekatay();
                    shekatayBean = TblShekatayManager.getRow(intIdShekatay);
                    if (shekatayBean.getGenzeb() > -1 &&  shekatayBean.getGenzeb() < 1) {

                        TblGabyaManager.deleteonid(intIdShekatay);
                        TblMealtawiShekatayManager.deleteOnIdShekatay(intIdShekatay);
                        TblShekatayManager.delete(intIdShekatay);
                        smShekatay = TblShekatayManager.displayData();
                        cmbSmShekatay.setModel(new DefaultComboBoxModel(smShekatay.toArray()));
                        cmbSmShekatay2.setModel(new DefaultComboBoxModel(smShekatay.toArray()));
                        cmbSmShekatay3.setModel(new DefaultComboBoxModel(smShekatay.toArray()));
                        cmbSmShekatay6.setModel(new DefaultComboBoxModel(smShekatay.toArray()));

                        //cmbSmShekatay7.setModel(new DefaultComboBoxModel(smShekatay.toArray()));
                        cmbSmShekatay7.removeItem(smShekatayStr);

                    } else {
                        String errorStr = "በዓል ፍርቂ፥ ሕሳብ ስለ ዘለዎ ክድምሰስ ኣይከኣልን እዩ።";
                        String errorType = "መጠንቀቕታ";
                        ConnectionManager.message(errorStr, errorType);
                    }

                } catch (SQLException ex) {
                }

            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        try {
            if (jXDatePicker1.getDate() == null) {
                String errorStr = "ዕለት ብትኽክል ምረጽ";
                String errorType = "ጌጋ";
                ConnectionManager.message(errorStr, errorType);
                jXDatePicker1.requestFocus();
            } else {
                String strDateOfFactur = jXDatePicker1.getEditor().getText();
                NewJFrame.setSqlDateOfFactur(strDateOfFactur);

                try {

                    String smWanaStr = cmbSmWanaHarestay1.getSelectedItem().toString();
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
//                JOptionPane.showMessageDialog(null, intIdWana + smWanaStr);
                    if (intIdWana > 0) {
                        // mealtawiHarestayBean.setIdWana(intIdWana);  

                        String smBealFrkiStr = cmbSmBealFrki2.getSelectedItem().toString().trim();
                        if (!"ዋና ባዕሉ".equals(smBealFrkiStr)) {
                            smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                            int intIdBealFrki = idBealFrki.get(smBealFrki.indexOf(smBealFrkiStr));
//                        JOptionPane.showMessageDialog(null, intIdBealFrki);
                            boolean a = false;
                            try {
                                a = TblMealtawiHarestayManager.checkMealtawiRep(sqlDateOfFactur, intIdWana, intIdBealFrki);
                            } catch (SQLException ex) {
                            }
                            if (a) {
                                try {
                                    JasperDesign jd = JRXmlLoader.load("C:\\Users\\mhreteab\\Documents\\data\\TkalMeshetiFrutaDB\\dist\\reports\\mealtawiBealFrkiReport.jrxml");
                                    String sql = "SELECT *, tblbealfrki.sm as sm2  FROM `tblmealtawiharestay` tblmealtawiharestay \n"
                                            + "INNER JOIN `tblwanaharestay` tblwanaharestay ON tblwanaharestay.`IdWana` = tblmealtawiharestay.`IdWana`\n"
                                            + "INNER JOIN `tblbealfrki` tblbealfrki ON tblbealfrki.`idbealfrki` = tblmealtawiharestay.`idbealfrki` "
                                            + "WHERE tblmealtawiharestay.Olet = '" + sqlDateOfFactur + "' AND tblmealtawiharestay.IdWana = "
                                            + intIdWana + " AND tblmealtawiharestay.IdBealFrki = " + intIdBealFrki;
                                    JRDesignQuery newQuery = new JRDesignQuery();
                                    newQuery.setText(sql);
                                    jd.setQuery(newQuery);
                                    JasperReport jr = JasperCompileManager.compileReport(jd);
                                    JasperPrint jp = JasperFillManager.fillReport(jr, null, ConnectionManager.getInstance().getConnection());
                                    JasperViewer.viewReport(jp, false);

                                } catch (JRException ex) {
                                    JOptionPane.showMessageDialog(null, ex);
                                }
                            } else {
                                String errorStr = "ኣብዚ ዕለት እዚ ኣየእተወን";
                                String errorType = "ሓበሬታ";
                                ConnectionManager.message(errorStr, errorType);
                            }
                            //mealtawiHarestayBean.setIdBealFrki(intIdBealFrki);

                        } else {
                            // mealtawiHarestayBean.setIdBealFrki(0);
                            boolean b = false;
                            try {
                                b = TblMealtawiHarestayManager.checkMealtawiRep(sqlDateOfFactur, intIdWana, 0);
                            } catch (SQLException ex) {
                            }
                            if (b) {
                                try {
                                    JasperDesign jd = JRXmlLoader.load("C:\\Users\\mhreteab\\Documents\\data\\TkalMeshetiFrutaDB\\dist\\reports\\mealtawiWanaReport.jrxml");
                                    String sql = "SELECT * FROM `tblmealtawiharestay` tblmealtawiharestay \n"
                                            + "INNER JOIN `tblwanaharestay` tblwanaharestay ON tblwanaharestay.`IdWana` = tblmealtawiharestay.`IdWana` "
                                            + "WHERE tblmealtawiharestay.Olet = '" + sqlDateOfFactur + "' AND tblmealtawiharestay.IdWana = "
                                            + intIdWana + " AND tblmealtawiharestay.IdBealFrki IS NULL";
                                    //      where olet = '" + sqlDateOfFactur + "' and idwana = " + intIdWana + " and idbealfrki is null
                                    //String sql = "select * from tblmealtawiharestay where olet = '" + sqlDateOfFactur + "' and idwana = " + intIdWana + " and idbealfrki IS NULL ";
                                    JRDesignQuery newQuery = new JRDesignQuery();
                                    newQuery.setText(sql);
                                    jd.setQuery(newQuery);
                                    JasperReport jr = JasperCompileManager.compileReport(jd);
                                    JasperPrint jp = JasperFillManager.fillReport(jr, null, ConnectionManager.getInstance().getConnection());
                                    JasperViewer.viewReport(jp, false);

                                } catch (JRException ex) {
                                    JOptionPane.showMessageDialog(null, ex);
                                }
                            } else {
                                String errorStr = "ኣብዚ ዕለት እዚ ኣየእተወን";
                                String errorType = "ሓበሬታ";
                                ConnectionManager.message(errorStr, errorType);
                            }
                        }
                    }

                } catch (Exception ex) {
                    String errorStr = "<html>ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ</html>";
                    String errorType = "ሓበሬታ";
                    ConnectionManager.message(errorStr, errorType);
                }
            }
        } catch (Exception ex) {
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void cmbSmWanaHarestay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmWanaHarestay1ActionPerformed
        if ((evt.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
            try {
                String smWanaStr = cmbSmWanaHarestay1.getSelectedItem().toString();
                if (!"".equals(smWanaStr)) {
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
                    try {
                        smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                        cmbSmBealFrki2.setModel(new DefaultComboBoxModel(smBealFrki.toArray()));
                        cmbSmBealFrki2.setSelectedIndex(0);
                        cmbSmBealFrki2.requestFocus();
                    } catch (SQLException ex) {
                    }
                }
            } catch (Exception ex) {
                String errorStr = "<html>ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ</html>";
                String errorType = "ሓበሬታ";
                ConnectionManager.message(errorStr, errorType);
            }
        }
    }//GEN-LAST:event_cmbSmWanaHarestay1ActionPerformed

    private void cmbSmWanaHarestay1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbSmWanaHarestay1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSmWanaHarestay1FocusLost

    private void cmbSmBealFrki2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmBealFrki2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSmBealFrki2ActionPerformed

    private void txtQutsriGabyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQutsriGabyaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtQutsriGabyaActionPerformed

    private void txtBzhiGabya2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBzhiGabya2ActionPerformed

    }//GEN-LAST:event_txtBzhiGabya2ActionPerformed

    private void txtBzhiGabya2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBzhiGabya2FocusGained
        // TODO add your handling code here:
//        txtQutsriGabya.setEnabled(true);
    }//GEN-LAST:event_txtBzhiGabya2FocusGained

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {

            try {
                String smWanaStr = cmbSmWanaHarestay7.getSelectedItem().toString();
                int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
                //JOptionPane.showMessageDialog(null, intIdWana + smWanaStr);
                if (intIdWana > 0) {
                    // mealtawiHarestayBean.setIdWana(intIdWana);  
                    String smBealFrkiStr = cmbSmBealFrki6.getSelectedItem().toString().trim();
                    if (!"ዋና ባዕሉ".equals(smBealFrkiStr)) {
                        smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                        int intIdBealFrki = idBealFrki.get(smBealFrki.indexOf(smBealFrkiStr));
                        //      JOptionPane.showMessageDialog(null, intIdBealFrki);
                        boolean c = false;
                        try {
                            c = TblMealtawiHarestayManager.checkMealtawiRepWzOutOlet(intIdWana, intIdBealFrki);
                        } catch (SQLException ex) {
                        }
                        if (c) {
                            try {
                                JasperDesign jd = JRXmlLoader.load("C:\\Users\\mhreteab\\Documents\\data\\TkalMeshetiFrutaDB\\dist\\reports\\mealtawiBealFrkiReport.jrxml");
                                String sql = "SELECT *, tblbealfrki.sm as sm2  FROM `tblmealtawiharestay` tblmealtawiharestay \n"
                                        + "INNER JOIN `tblwanaharestay` tblwanaharestay ON tblwanaharestay.`IdWana` = tblmealtawiharestay.`IdWana`\n"
                                        + "INNER JOIN `tblbealfrki` tblbealfrki ON tblbealfrki.`idbealfrki` = tblmealtawiharestay.`idbealfrki` "
                                        + "WHERE tblmealtawiharestay.IdWana = " + intIdWana + " AND tblmealtawiharestay.IdBealFrki = " + intIdBealFrki;
                                JRDesignQuery newQuery = new JRDesignQuery();
                                newQuery.setText(sql);
                                jd.setQuery(newQuery);
                                JasperReport jr = JasperCompileManager.compileReport(jd);
                                JasperPrint jp = JasperFillManager.fillReport(jr, null, ConnectionManager.getInstance().getConnection());
                                JasperViewer.viewReport(jp, false);
                            } catch (JRException ex) {
                                JOptionPane.showMessageDialog(null, ex);
                            }
                        } else {
                            String errorStr = "እቶት የብሉን";
                            String errorType = "ሓበሬታ";
                            ConnectionManager.message(errorStr, errorType);
                        }
                        //mealtawiHarestayBean.setIdBealFrki(intIdBealFrki);

                    } else {
                        // mealtawiHarestayBean.setIdBealFrki(0);
                        boolean d = false;
                        try {
                            d = TblMealtawiHarestayManager.checkMealtawiRepWzOutOlet(intIdWana, 0);
                        } catch (SQLException ex) {
                        }
                        if (d) {
                            try {
                                JasperDesign jd = JRXmlLoader.load("C:\\Users\\mhreteab\\Documents\\data\\TkalMeshetiFrutaDB\\dist\\reports\\mealtawiWanaReport.jrxml");
                                String sql = "SELECT * FROM `tblmealtawiharestay` tblmealtawiharestay \n"
                                        + "INNER JOIN `tblwanaharestay` tblwanaharestay ON tblwanaharestay.`IdWana` = tblmealtawiharestay.`IdWana` "
                                        + "WHERE tblmealtawiharestay.IdWana = " + intIdWana + " AND tblmealtawiharestay.IdBealFrki IS NULL";
                                //      where olet = '" + sqlDateOfFactur + "' and idwana = " + intIdWana + " and idbealfrki is null
                                //String sql = "select * from tblmealtawiharestay where olet = '" + sqlDateOfFactur + "' and idwana = " + intIdWana + " and idbealfrki IS NULL ";
                                JRDesignQuery newQuery = new JRDesignQuery();
                                newQuery.setText(sql);
                                jd.setQuery(newQuery);
                                JasperReport jr = JasperCompileManager.compileReport(jd);
                                JasperPrint jp = JasperFillManager.fillReport(jr, null, ConnectionManager.getInstance().getConnection());
                                JasperViewer.viewReport(jp, false);

                            } catch (JRException ex) {
                                JOptionPane.showMessageDialog(null, ex);
                            }
                        } else {
                            String errorStr = "እቶት የብሉን";
                            String errorType = "ሓበሬታ";
                            ConnectionManager.message(errorStr, errorType);
                        }
                    }
                }

            } catch (Exception ex) {
                String errorStr = "<html>ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ</html>";
                String errorType = "ሓበሬታ";
                ConnectionManager.message(errorStr, errorType);
            }

        } catch (Exception ex) {
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void cmbSmWanaHarestay7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmWanaHarestay7ActionPerformed
        if ((evt.getModifiers() & InputEvent.BUTTON1_MASK) != 0) {
            try {
                String smWanaStr = cmbSmWanaHarestay7.getSelectedItem().toString();
                if (!"".equals(smWanaStr)) {
                    int intIdWana = idWana.get(smWanaHarestay.indexOf(smWanaStr));
                    try {
                        smBealFrki = TblBealFrkiManager.displayNamesOnIdWana(intIdWana);
                        cmbSmBealFrki6.setModel(new DefaultComboBoxModel(smBealFrki.toArray()));
                        cmbSmBealFrki6.setSelectedIndex(0);
                        cmbSmBealFrki6.requestFocus();
                    } catch (SQLException ex) {
                    }
                }
            } catch (Exception ex) {
//                String errorStr = "<html>ስም ዋና ሓረስታይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ</html>";
//                String errorType = "ሓበሬታ";
//                ConnectionManager.message(errorStr, errorType);
            }
        }
    }//GEN-LAST:event_cmbSmWanaHarestay7ActionPerformed

    private void cmbSmWanaHarestay7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbSmWanaHarestay7FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSmWanaHarestay7FocusLost

    private void cmbSmBealFrki6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmBealFrki6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSmBealFrki6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {

            String reasonStr = cmbReason.getSelectedItem().toString();
            String atawiWetsai = "";
            if (rbtnWesaei1.isSelected()) {
                atawiWetsai = "ወጻኢ";
            } else {
                atawiWetsai = "ኣታዊ";
            }
            boolean e = false;
            try {
                e = TblAtawiWetsaeiTkalManager.checkAtawiWetsaei(reasonStr, atawiWetsai);
            } catch (SQLException ex) {
            }
            if (e) {
                try {
                    JasperDesign jd = JRXmlLoader.load("C:\\Users\\mhreteab\\Documents\\data\\TkalMeshetiFrutaDB\\dist\\reports\\atawiWetsaeiTkal.jrxml");
                    String sql = "select Olet, atawiwetsaei, reason, description, genzeb from tblatawiwetsaei where atawiwetsaei = '" + atawiWetsai + "' and reason = '" + reasonStr + "'";
                    JRDesignQuery newQuery = new JRDesignQuery();
                    newQuery.setText(sql);
                    jd.setQuery(newQuery);
                    JasperReport jr = JasperCompileManager.compileReport(jd);
                    JasperPrint jp = JasperFillManager.fillReport(jr, null, ConnectionManager.getInstance().getConnection());
                    JasperViewer.viewReport(jp, false);

                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            } else {
                String errorStr = "ጸብጻብ የለን";
                String errorType = "ሓበሬታ";
                ConnectionManager.message(errorStr, errorType);
            }
        } catch (Exception ex) {
            String errorStr = "<html>ስም ዓዳጋይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ</html>";
            String errorType = "ሓበሬታ";
            ConnectionManager.message(errorStr, errorType);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void cmbReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbReasonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbReasonActionPerformed

    private void cmbReasonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbReasonFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbReasonFocusLost

    private void rbtnAtawi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAtawi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnAtawi1ActionPerformed

    private void rbtnWesaei1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnWesaei1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnWesaei1ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try {
            String smShekatay = cmbSmTelekahi.getSelectedItem().toString();
            boolean g = false;
            try {
                g = TblAtawiWetsaeiTkalManager.checkAtawiWetsaeiOnSm(smShekatay);
            } catch (SQLException ex) {
            }
            if (g) {
                try {
                    JasperDesign jd = JRXmlLoader.load("C:\\Users\\mhreteab\\Documents\\data\\TkalMeshetiFrutaDB\\dist\\reports\\atawiWetsaeiHarestay.jrxml");
                    String sql = "select olet, sm, atawiwetsaei, description, genzeb from tblatawiwetsaei where sm = '" + smShekatay + "'";
                    JRDesignQuery newQuery = new JRDesignQuery();
                    newQuery.setText(sql);
                    jd.setQuery(newQuery);
                    JasperReport jr = JasperCompileManager.compileReport(jd);
                    JasperPrint jp = JasperFillManager.fillReport(jr, null, ConnectionManager.getInstance().getConnection());
                    JasperViewer.viewReport(jp, false);

                } catch (JRException ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }
            } else {
                String errorStr = "ጸብጻብ የለን";
                String errorType = "ሓበሬታ";
                ConnectionManager.message(errorStr, errorType);
            }
        } catch (Exception ex) {
            String errorStr = "<html>ስም ዓዳጋይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ</html>";
            String errorType = "ሓበሬታ";
            ConnectionManager.message(errorStr, errorType);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void cmbSmTelekahiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmTelekahiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSmTelekahiActionPerformed

    private void cmbSmTelekahiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbSmTelekahiFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSmTelekahiFocusLost

    private void txtThjaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtThjaKeyTyped
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtThjaKeyTyped

    private void txtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateActionPerformed

    private void txtStartDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStartDateKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateKeyTyped

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        //Date startDate = Tblata  
        try {
            double dmrTkal = TblAtawiWetsaeiTkalManager.getTeklalaDmrTkal(mebegesiOlet);
            double dmrHarestay = TblMealtawiHarestayManager.getTeklalaDmr(mebegesiOlet);
            double dmrShekatay = TblMealtawiShekatayManager.getTeklalaDmr(mebegesiOlet);
            double tkalNet = dmrTkal + (dmrShekatay - dmrHarestay);
            JLabel warning = new JLabel();
            warning.setSize(300, 100);
            warning.setFont(new Font("Nyala", Font.PLAIN, 16));
            warning.setText("ካብ ዕለት: \"" + txtStartDate.getText() + "\" ክሳብ ዕለት: \"" + txtEndDate.getText() + "'\" ዘሎ መጠን ኣታዊ ትካል " +  customFormat("###,###,###.##", tkalNet ) + " ናቕፋ እዩ።");
            JOptionPane.showMessageDialog(null, warning, "", JOptionPane.PLAIN_MESSAGE);
            TblAtawiWetsaeiTkalManager.updateMebegesiOlet(NewJFrame.getSqlDateOfToday());
        } catch (SQLException ex) {
        }

    }//GEN-LAST:event_jButton13ActionPerformed

    private void txtEndDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEndDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEndDateActionPerformed

    private void chkTeklalaHsabItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkTeklalaHsabItemStateChanged
        // TODO add your handling code here:
        if (chkTeklalaHsab.getState()) {
            jLabel87.setEnabled(true);
            jLabel113.setEnabled(true);
            jLabel114.setEnabled(true);
            jLabel115.setEnabled(true);
            jButton13.setEnabled(true);
            txtStartDate.setEnabled(true);
            txtEndDate.setEnabled(true);

            try {
                mebegesiOlet = TblAtawiWetsaeiTkalManager.getMebegesiOlet();
                txtStartDate.setText(mebegesiOlet.toString());
                txtEndDate.setText(NewJFrame.getSqlDateOfToday().toString());
            } catch (SQLException ex) {
            }

        } else {
            jLabel87.setEnabled(false);
            jLabel113.setEnabled(false);
            jLabel114.setEnabled(false);
            jLabel115.setEnabled(false);
            jButton13.setEnabled(false);
            txtStartDate.setEnabled(false);
            txtEndDate.setEnabled(false);
            txtStartDate.setText("");
            txtEndDate.setText("");
        }
    }//GEN-LAST:event_chkTeklalaHsabItemStateChanged

    private void chkTeklalaHsabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chkTeklalaHsabKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkTeklalaHsabKeyPressed

    private void cmbOaynetFruta4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOaynetFruta4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOaynetFruta4ActionPerformed

    private void txtTeklalaThjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeklalaThjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeklalaThjaActionPerformed

    private void txtAtotMekinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtotMekinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtotMekinaActionPerformed

    private void jLabel88MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel88MouseClicked
        if(chkTeklalaHsab.getState()){
            chkTeklalaHsab.setState(false);
            jLabel87.setEnabled(false);
            jLabel113.setEnabled(false);
            jLabel114.setEnabled(false);
            jLabel115.setEnabled(false);
            jButton13.setEnabled(false);
            txtStartDate.setEnabled(false);
            txtEndDate.setEnabled(false);
            txtStartDate.setText("");
            txtEndDate.setText("");
        }
        else{
            chkTeklalaHsab.setState(true);
            jLabel87.setEnabled(true);
            jLabel113.setEnabled(true);
            jLabel114.setEnabled(true);
            jLabel115.setEnabled(true);
            jButton13.setEnabled(true);
            txtStartDate.setEnabled(true);
            txtEndDate.setEnabled(true);

            try {
                mebegesiOlet = TblAtawiWetsaeiTkalManager.getMebegesiOlet();
                txtStartDate.setText(mebegesiOlet.toString());
                txtEndDate.setText(NewJFrame.getSqlDateOfToday().toString());
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_jLabel88MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        // TODO add your handling code here:
        if (chkZhader.getState()) {
            chkZhader.setState(false);
            setZhader("---");
            jLabel39.setVisible(false);            
        } else {
            chkZhader.setState(true);
            setZhader("ዝሓደረ");
            jLabel39.setVisible(true);
        }
    }//GEN-LAST:event_jLabel38MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and displayNamesOnIdWana the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEtotFretat;
    private javax.swing.JButton btnEtotFretat1;
    private javax.swing.ButtonGroup btnGrpGenzebZweZeteShekatay;
    private javax.swing.ButtonGroup btnGrpGenzebZwesedoZetewo;
    private javax.swing.ButtonGroup btnGrpGenzebZwesedoZetewo2;
    private javax.swing.ButtonGroup btnGrpGenzebZwesedoZetewo3;
    private javax.swing.ButtonGroup btnGrpTegemituAytegemeten;
    private javax.swing.ButtonGroup btnGrpWanaBealFrki;
    private javax.swing.ButtonGroup btnGrpZteshetZeyteshete;
    private javax.swing.JButton btnHadshHarestayMezgb;
    private javax.swing.JButton btnHadshHarestayMezgb1;
    private javax.swing.JButton btnHadshShekatayMezgb;
    private javax.swing.JButton btnHarestayZeetwoZwesedoGen5;
    private javax.swing.JButton btnHarestayZeetwoZwesedoGen6;
    private javax.swing.JButton btnHsabHarestay;
    private javax.swing.JButton btnHsabHarestay2;
    private javax.swing.JButton btnShekato;
    private javax.swing.JButton btnThjaGabya;
    private javax.swing.JButton btnThjaGabyaMemlesi;
    private javax.swing.JButton btnThjaGabyaMewsedi;
    private javax.swing.JButton btnThjaTemelisu;
    private javax.swing.JButton btnWelBebeynu;
    private java.awt.Checkbox chkTeklalaHsab;
    private java.awt.Checkbox chkZhader;
    private javax.swing.JTextField cmbBzhiGabya3;
    private javax.swing.JComboBox cmbDekikFruy;
    private javax.swing.JComboBox cmbFruyDekik2;
    private javax.swing.JComboBox cmbOaynetFruta;
    private javax.swing.JComboBox cmbOaynetFruta2;
    private javax.swing.JComboBox cmbOaynetFruta4;
    private javax.swing.JComboBox cmbOaynetFruta5;
    private javax.swing.JComboBox cmbReason;
    private javax.swing.JComboBox cmbSmBealFrki;
    private javax.swing.JComboBox cmbSmBealFrki1;
    private javax.swing.JComboBox cmbSmBealFrki2;
    private javax.swing.JComboBox cmbSmBealFrki3;
    private javax.swing.JComboBox cmbSmBealFrki4;
    private javax.swing.JComboBox cmbSmBealFrki5;
    private javax.swing.JComboBox cmbSmBealFrki6;
    private javax.swing.JComboBox cmbSmGabyaZeymelesu;
    private javax.swing.JComboBox cmbSmShekatay;
    private javax.swing.JComboBox cmbSmShekatay2;
    private javax.swing.JComboBox cmbSmShekatay3;
    private javax.swing.JComboBox cmbSmShekatay6;
    private javax.swing.JComboBox cmbSmShekatay7;
    private javax.swing.JComboBox cmbSmTelekahi;
    private javax.swing.JComboBox cmbSmThjaZeytemelselom;
    private javax.swing.JComboBox cmbSmWanaHarestay;
    private javax.swing.JComboBox cmbSmWanaHarestay1;
    private javax.swing.JComboBox cmbSmWanaHarestay2;
    private javax.swing.JComboBox cmbSmWanaHarestay3;
    private javax.swing.JComboBox cmbSmWanaHarestay4;
    private javax.swing.JComboBox cmbSmWanaHarestay5;
    private javax.swing.JComboBox cmbSmWanaHarestay6;
    private javax.swing.JComboBox cmbSmWanaHarestay7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jxdpOlet;
    private javax.swing.JRadioButton rbtnAtawi;
    private javax.swing.JRadioButton rbtnAtawi1;
    private javax.swing.JRadioButton rbtnAytegemeten;
    private javax.swing.JRadioButton rbtnBealFrki;
    private javax.swing.ButtonGroup rbtnGenzebZwededoZetewo4;
    private javax.swing.ButtonGroup rbtnGrpAtawiWetsae;
    private javax.swing.ButtonGroup rbtnGrpOyarMaereBebeynu;
    private javax.swing.ButtonGroup rbtnGrpThjaTemelisuAytemelsen;
    private javax.swing.ButtonGroup rbtnGrpWanaBealFrki;
    private javax.swing.ButtonGroup rbtnGrpWelMaereBebeynu;
    private javax.swing.ButtonGroup rbtnGrpWelMaereBebeynu1;
    private javax.swing.ButtonGroup rbtnGrpsmWanaBealfrki;
    private javax.swing.ButtonGroup rbtnGrptebtab;
    private javax.swing.JRadioButton rbtnMaereOyar;
    private javax.swing.JRadioButton rbtnMaereOyar1;
    private javax.swing.JRadioButton rbtnOyarBebeynu;
    private javax.swing.JRadioButton rbtnOyarBebeynu1;
    private javax.swing.JRadioButton rbtnTegemitu;
    private javax.swing.JRadioButton rbtnThjaAytemelsen;
    private javax.swing.JRadioButton rbtnThjaTemelisu;
    private javax.swing.JRadioButton rbtnWanaBaelu;
    private javax.swing.JRadioButton rbtnWelBebeynu;
    private javax.swing.JRadioButton rbtnWelmaere;
    private javax.swing.JRadioButton rbtnWesaei;
    private javax.swing.JRadioButton rbtnWesaei1;
    private javax.swing.JRadioButton rbtnZeetewoGenzeb2;
    private javax.swing.JRadioButton rbtnZeetewoGenzeb5;
    private javax.swing.JRadioButton rbtnZeetewoGenzeb7;
    private javax.swing.JRadioButton rbtnZwesedoGenzeb2;
    private javax.swing.JRadioButton rbtnZwesedoGenzeb5;
    private javax.swing.JRadioButton rbtnZwesedoGenzeb7;
    private javax.swing.JTextArea txtAQutsriGabya;
    private javax.swing.JTextField txtAtotHarestot;
    private javax.swing.JTextField txtAtotMekina;
    private javax.swing.JTextField txtAtotTkal;
    private javax.swing.JTextField txtBtshitBealFrki1;
    private javax.swing.JTextField txtBzhiGabya;
    private javax.swing.JTextField txtBzhiGabya2;
    private javax.swing.JTextField txtBzhiGabya5;
    private javax.swing.JTextField txtBzhiGabya6;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtGenzeLkah4;
    private javax.swing.JTextField txtGenzebLkah10;
    private javax.swing.JTextField txtGenzebLkah3;
    private javax.swing.JTextField txtGenzebLkah4;
    private javax.swing.JTextField txtGenzebLkah5;
    private javax.swing.JTextField txtGenzebLkah6;
    private javax.swing.JTextField txtGenzebLkah7;
    private javax.swing.JTextField txtGenzebLkah8;
    private javax.swing.JTextField txtGenzebLkah9;
    private javax.swing.JTextField txtMetenGenzeb10;
    private javax.swing.JTextField txtMetenGenzeb11;
    private javax.swing.JTextField txtMetenGenzeb3;
    private javax.swing.JTextField txtMetenGenzeb4;
    private javax.swing.JTextField txtMetenGenzeb5;
    private javax.swing.JTextField txtMetenGenzeb6;
    private javax.swing.JTextField txtMetenGenzeb7;
    private javax.swing.JTextField txtMetenGenzeb8;
    private javax.swing.JTextField txtMetenGenzeb9;
    private javax.swing.JTextField txtMizanBKilo;
    private javax.swing.JTextField txtMizanBKilo2;
    private javax.swing.JTextField txtMknayt1;
    private javax.swing.JTextField txtMknyat;
    private javax.swing.JTextField txtMknyata;
    private javax.swing.JTextField txtOyarGabya;
    private javax.swing.JTextField txtOyarGabya1;
    private javax.swing.JTextField txtOyarGabya3;
    private javax.swing.JTextField txtOyarGabya4;
    private javax.swing.JTextField txtOyarGabya5;
    private javax.swing.JTextField txtQutsriGabya;
    private javax.swing.JTextField txtQutsriGabya2;
    private javax.swing.JTextField txtQutsriGabya3;
    private javax.swing.JTextField txtSmAboHagoHarestay;
    private javax.swing.JTextField txtSmAboHarestay;
    private javax.swing.JTextField txtSmAboShekatay;
    private javax.swing.JTextField txtSmHarestay;
    private javax.swing.JTextField txtSmShekatay;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTarifKabKilo;
    private javax.swing.JTextField txtTarifMekina;
    private javax.swing.JTextField txtTeklalaGenzeb;
    private javax.swing.JTextField txtTeklalaThja;
    private javax.swing.JTextField txtTeklalaThja2;
    private javax.swing.JTextField txtThja;
    private javax.swing.JTextField txtThja3;
    private javax.swing.JTextField txtWagaNKilo;
    private javax.swing.JTextField txtWagaNKilo2;
    private javax.swing.JTextField txtWelMaereTekoynu;
    private javax.swing.JTextField txtWelMaereTezeykoynu;
    private javax.swing.JTextField txtZeetewo4;
    private javax.swing.JTextField txtZeetewo5;
    private javax.swing.JTextField txtZeetewoGenzeb2;
    private javax.swing.JTextField txtZtekefleGenzeb;
    private javax.swing.JTextField txtZwesedoGenzeb2;
    private javax.swing.JTextField txtZwesedoGenzeb5;
    private javax.swing.JTextField txtZwesedoGenzeb6;
    // End of variables declaration//GEN-END:variables

}
