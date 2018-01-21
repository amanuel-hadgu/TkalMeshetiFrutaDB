package tkalMeshetFrutaDB;

import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static tkalMeshetFrutaDB.NewJFrame.sqlDateOfToday;
import tkalMeshetiFrutaDB.beans.TblGabya;
import tkalMeshetiFrutaDB.beans.TblMealtawiShekatay;
import tkalMeshetiFrutaDB.beans.TblShekatay;
import tkalMeshetiFrutaDB.tables.TblGabyaManager;
import tkalMeshetiFrutaDB.tables.TblMealtawiShekatayManager;
import tkalMeshetiFrutaDB.tables.TblShekatayManager;

public class NewJDialog extends javax.swing.JDialog {

    private static List<String> smShekatay;
    private static List<Integer> idShekatay;
    private static int bzhigabyaCounter;

    public NewJDialog(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        try {
            smShekatay = TblShekatayManager.displayData();
        } catch (SQLException ex) {
        }

        initComponents();
    }

    public static List<Integer> getIdShekatay() {
        return idShekatay;
    }

    public static void setIdShekatay(List<Integer> idShekatay) {
        NewJDialog.idShekatay = idShekatay;
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

    NewJDialog() {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpOyar = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnShekatayOaqb = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtBzhiGabya = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtMizanBKilo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtWagaNKilo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cmbOaynetFruta = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        cmbFruyDekik = new javax.swing.JComboBox();
        txtOyarGabya1 = new javax.swing.JTextField();
        txtOyarGabya = new javax.swing.JTextField();
        rbtnOyarBebeynu = new javax.swing.JRadioButton();
        rbtnMaereOyar = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        cmbSmShekatay = new javax.swing.JComboBox();
        jLabel112 = new javax.swing.JLabel();
        txtGenzebLkah10 = new javax.swing.JTextField();
        txtMetenGenzeb11 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        btnCallMemezgebiO = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        txtQutsriGabya = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtThja = new javax.swing.JTextField();
        btnThjaOaqb = new javax.swing.JButton();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel5FocusGained(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnShekatayOaqb.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnShekatayOaqb.setText("ዓቅብ(Save)");
        btnShekatayOaqb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShekatayOaqbActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel17.setText("ብዝሒ ጋብያ፡");

        txtBzhiGabya.setText(NewJFrame.getBzhigabya() + "");
        txtBzhiGabya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBzhiGabyaActionPerformed(evt);
            }
        });
        txtBzhiGabya.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBzhiGabyaFocusGained(evt);
            }
        });
        txtBzhiGabya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBzhiGabyaKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel18.setText("ሚዛን ብ ኪሎ፡");

        txtMizanBKilo.setText(NewJFrame.getMizanBkilo());
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

        jLabel14.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel14.setText("ዋጋ ን ኪሎ፡");

        txtWagaNKilo.setText(NewJFrame.getWagaNKilo());
        txtWagaNKilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWagaNKiloActionPerformed(evt);
            }
        });
        txtWagaNKilo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtWagaNKiloFocusGained(evt);
            }
        });
        txtWagaNKilo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWagaNKiloKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel15.setText("ዓይነት ፍሩታ፡");

        cmbOaynetFruta.setEditable(true);
        cmbOaynetFruta.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbOaynetFruta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ኣራንሺ", "ኮሚደረ", "ፓፓዮ", "ጉዕ", "ባናና" }));
        cmbOaynetFruta.setSelectedItem(NewJFrame.getOaynetFruta());
        cmbOaynetFruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOaynetFrutaActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel16.setText("ፍሩይ/ማእከላይ/ደቂቕ፡");

        cmbFruyDekik.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbFruyDekik.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ፍሩይ", "ማእከላይ", "ደቂቕ" }));
        cmbFruyDekik.setSelectedItem(NewJFrame.getFruyDekik());
        cmbFruyDekik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFruyDekikActionPerformed(evt);
            }
        });

        txtOyarGabya1.setText(NewJFrame.isOyarMaere() ? null : NewJFrame.getOyarGabya1());
        txtOyarGabya1.setEnabled(NewJFrame.isOyarMaere() ? false : true);
        txtOyarGabya1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOyarGabya1KeyTyped(evt);
            }
        });

        txtOyarGabya.setText(NewJFrame.isOyarMaere() ? NewJFrame.getOyarGabya() : null);
        txtOyarGabya.setEnabled(NewJFrame.isOyarMaere() ? true : false);
        txtOyarGabya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOyarGabyaKeyTyped(evt);
            }
        });

        btnGrpOyar.add(rbtnOyarBebeynu);
        rbtnOyarBebeynu.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnOyarBebeynu.setSelected(NewJFrame.isOyarMaere() ? false : true);
        rbtnOyarBebeynu.setText("ዕያር በበይኑ ምስ ዝኸውን ድምር የእቱ፡");
        rbtnOyarBebeynu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnOyarBebeynuActionPerformed(evt);
            }
        });

        btnGrpOyar.add(rbtnMaereOyar);
        rbtnMaereOyar.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        rbtnMaereOyar.setSelected(NewJFrame.isOyarMaere() ? true : false);
        rbtnMaereOyar.setText("ዕያር ናይ ጋብያ፡");
        rbtnMaereOyar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMaereOyarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel11.setText("ስም ዓዳጋይ፡");

        cmbSmShekatay.setEditable(true);
        cmbSmShekatay.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        cmbSmShekatay.setModel(new DefaultComboBoxModel(smShekatay.toArray()));
        cmbSmShekatay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSmShekatayActionPerformed(evt);
            }
        });

        jLabel112.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel112.setText("ዘለዎ መጠን ");

        txtGenzebLkah10.setEditable(false);
        txtGenzebLkah10.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        txtGenzebLkah10.setText("ገንዘብ/ልቃሕ");

        txtMetenGenzeb11.setEditable(false);

        jLabel111.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel111.setText("ናቕፋ እዩ።");

        btnCallMemezgebiO.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnCallMemezgebiO.setText("ሓድሽ ዝምዝገብ ዓዳጋይ");
        btnCallMemezgebiO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCallMemezgebiOActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ናይ ዝተወስደ ጋብያ ትሕጃ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nyala", 0, 16))); // NOI18N

        jLabel24.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel24.setText("ቁ.ጋብያ");

        txtQutsriGabya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQutsriGabyaActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        jLabel25.setText("ትሕጃ፡");

        txtThja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThjaActionPerformed(evt);
            }
        });
        txtThja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtThjaKeyTyped(evt);
            }
        });

        btnThjaOaqb.setFont(new java.awt.Font("Nyala", 0, 16)); // NOI18N
        btnThjaOaqb.setText("ዓቅብ(Save)");
        btnThjaOaqb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThjaOaqbActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThjaOaqb)
                .addGap(111, 111, 111))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtQutsriGabya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(txtThja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnThjaOaqb)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnMaereOyar)
                        .addGap(122, 122, 122)
                        .addComponent(txtOyarGabya, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSmShekatay, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel112)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGenzebLkah10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMetenGenzeb11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnOyarBebeynu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOyarGabya1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbOaynetFruta, 0, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBzhiGabya, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbFruyDekik, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnShekatayOaqb)
                                    .addComponent(txtMizanBKilo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(53, 53, 53)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWagaNKilo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel111)
                        .addGap(109, 109, 109)
                        .addComponent(btnCallMemezgebiO)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cmbSmShekatay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel112)
                    .addComponent(txtMetenGenzeb11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGenzebLkah10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel111)
                    .addComponent(btnCallMemezgebiO))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnMaereOyar)
                    .addComponent(txtOyarGabya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOyarGabya1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnOyarBebeynu))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cmbOaynetFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(cmbFruyDekik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtBzhiGabya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(txtMizanBKilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txtWagaNKilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114)
                        .addComponent(btnShekatayOaqb))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOaynetFrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOaynetFrutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOaynetFrutaActionPerformed

    private void cmbFruyDekikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFruyDekikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFruyDekikActionPerformed

    private void cmbSmShekatayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSmShekatayActionPerformed
       try{
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
            txtMetenGenzeb11.setText(shekatayBean.getGenzeb() + "");

        }
        } catch (Exception ex) {
                String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                        + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
                String errorType = "ጌጋ";
                ConnectionManager.message(errorStr, errorType);
            }
    }//GEN-LAST:event_cmbSmShekatayActionPerformed

    private void btnShekatayOaqbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShekatayOaqbActionPerformed
        // TODO add your handling code here
        if (bzhigabyaCounter < Integer.parseInt(txtBzhiGabya.getText())) {
            
            
            String errorStr = "<html>ተወሲዱ ዘሎ ብዝሒ ጋብያ " + txtBzhiGabya.getText() + " እዩ፥ ትሕጃ ተመዝጊብዎ ዘሎ ግን " + bzhigabyaCounter + " እዩ።</html>";
            String errorType = "ሓበሬታ";
            ConnectionManager.message(errorStr, errorType);
           // txtQutsriGabya.selectAll();
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
                    if (rbtnMaereOyar.isSelected()) {
                        oyargabya = Double.parseDouble(txtOyarGabya.getText());
                        mealtawishekataybean.setOyarGabya(oyargabya);
                    } else {
                        oyargabya = Double.parseDouble(txtOyarGabya1.getText()) / Integer.parseInt(txtBzhiGabya.getText());
                        mealtawishekataybean.setOyarGabya(oyargabya);
                    }
                    mealtawishekataybean.setOaynetFruta(cmbOaynetFruta.getSelectedItem().toString());
                    mealtawishekataybean.setFruyDekik(cmbFruyDekik.getSelectedItem().toString());
                    mealtawishekataybean.setBzhiGabya(Integer.parseInt(txtBzhiGabya.getText()));
                    mealtawishekataybean.setMizanBKilo(Double.parseDouble(txtMizanBKilo.getText()));
                    mealtawishekataybean.setWagaNKilo(Double.parseDouble(txtWagaNKilo.getText()));
                    double mizan = (Double.parseDouble(txtMizanBKilo.getText()) - (Integer.parseInt(txtBzhiGabya.getText()) * oyargabya));
                    double teklalaWaga = mizan * Double.parseDouble(txtWagaNKilo.getText());
                    mealtawishekataybean.setTeklalaWaga(teklalaWaga);
                    
                     NewJFrame.setTeklalaWaga(teklalaWaga);
                    JDlgZtekefleWagaMemezgebi jdlgZtekeObj = new JDlgZtekefleWagaMemezgebi(null, true);
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

                        //   TblShekatay shekatayBean = new TblShekatay();
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
                            txtMetenGenzeb11.setText(shekatayBean.getGenzeb() + "");

                        }

                        txtBzhiGabya.setText(null);
                        txtMizanBKilo.setText(null);
                        txtWagaNKilo.setText(null);
                        txtBzhiGabya.requestFocus();
                        bzhigabyaCounter = 0;
                          dispose();
                    } catch (SQLException ex) {
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
        
    }//GEN-LAST:event_btnShekatayOaqbActionPerformed

    private void btnCallMemezgebiOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCallMemezgebiOActionPerformed
        JdlgMemezgebiOdagay jDlgMemezgebiOdagay = new JdlgMemezgebiOdagay(null, true);
        jDlgMemezgebiOdagay.setLocationRelativeTo(this);
        jDlgMemezgebiOdagay.setVisible(true);
        try {
            smShekatay = TblShekatayManager.displayData();
            cmbSmShekatay.setModel(new DefaultComboBoxModel(smShekatay.toArray()));
        } catch (SQLException ex) {
        }
        
    }//GEN-LAST:event_btnCallMemezgebiOActionPerformed

    private void txtWagaNKiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWagaNKiloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWagaNKiloActionPerformed

    private void txtMizanBKiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMizanBKiloActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtMizanBKiloActionPerformed

    private void btnThjaOaqbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThjaOaqbActionPerformed
        // TODO add your handling code here:
        TblGabya gabyaBean = new TblGabya();
               
        try {
            gabyaBean.setOlet(sqlDateOfToday);
            gabyaBean.setQutsriGabya(txtQutsriGabya.getText().trim());
            gabyaBean.setThja(Double.parseDouble(txtThja.getText()));
            gabyaBean.setGabyaTemelisu("ነኖ");

            String smShekatayStr = cmbSmShekatay.getSelectedItem().toString();
            int smShekatayIndex = smShekatay.indexOf(smShekatayStr);
            if (smShekatayIndex < 1) {
                 String errorStr = "<html>ስም ዓዳጋይ ኣይተመዝገበን ኣቐዲምካ ኣመዝግቦ</html>";
                String errorType = "ሓበሬታ";
                ConnectionManager.message(errorStr, errorType);
            
                } else {
                gabyaBean.setIdShekatay(idShekatay.get(smShekatayIndex));
           
            try {
                boolean b = TblGabyaManager.insert(gabyaBean);
                
                if (b) {
                    bzhigabyaCounter++;
                }
                txtQutsriGabya.requestFocus();
                txtQutsriGabya.setText("");
            
            } catch (SQLException ex) {
                String errorStr = "ኮኔክሽን ጸገም ከይህሉ ኣረጋግጽ";
                String errorType = "ጌጋ";
                ConnectionManager.message(errorStr, errorType);
            }
            }
        } catch (Exception ex) {
            String errorStr = "<html>ክምልኡ ዝግብኦም ፊልድታት ብግቡእ ኣይተምልኡን:"
                    + "<br>           ስለዚ ብግብእ ምልኣዮም: </br> </html>";
            String errorType = "ጌጋ";
            ConnectionManager.message(errorStr, errorType);
        }
        
    }//GEN-LAST:event_btnThjaOaqbActionPerformed

    private void txtBzhiGabyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBzhiGabyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBzhiGabyaActionPerformed

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

    private void txtOyarGabya1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOyarGabya1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOyarGabya1KeyTyped

    private void txtQutsriGabyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQutsriGabyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQutsriGabyaActionPerformed

    private void jPanel5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel5FocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel5FocusGained

    private void txtOyarGabyaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOyarGabyaKeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtOyarGabyaKeyTyped

    private void txtWagaNKiloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWagaNKiloKeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtWagaNKiloKeyTyped

    private void txtBzhiGabyaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBzhiGabyaKeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedIsInteger(evt);
    }//GEN-LAST:event_txtBzhiGabyaKeyTyped

    private void txtMizanBKiloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMizanBKiloKeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtMizanBKiloKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sa = JOptionPane.showInputDialog("sample");
        if (sa == null) {
            JOptionPane.showMessageDialog(null, "null");
        }
        double s = Double.parseDouble(sa) + 10;
        JOptionPane.showMessageDialog(null, s + "");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtThjaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtThjaKeyTyped
        // TODO add your handling code here:
        checkIfKeyTypedDigit(evt);
    }//GEN-LAST:event_txtThjaKeyTyped

    private void txtThjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThjaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThjaActionPerformed

    private void txtWagaNKiloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWagaNKiloFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_txtWagaNKiloFocusGained

    private void txtBzhiGabyaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBzhiGabyaFocusGained
        // TODO add your handling code here:
      //  txtQutsriGabya.setEnabled(true);
    }//GEN-LAST:event_txtBzhiGabyaFocusGained

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
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    NewJDialog dialog = new NewJDialog(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(NewJDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCallMemezgebiO;
    private javax.swing.ButtonGroup btnGrpOyar;
    private javax.swing.JButton btnShekatayOaqb;
    private javax.swing.JButton btnThjaOaqb;
    private javax.swing.JComboBox cmbFruyDekik;
    private javax.swing.JComboBox cmbOaynetFruta;
    private javax.swing.JComboBox cmbSmShekatay;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton rbtnMaereOyar;
    private javax.swing.JRadioButton rbtnOyarBebeynu;
    private javax.swing.JTextField txtBzhiGabya;
    private javax.swing.JTextField txtGenzebLkah10;
    private javax.swing.JTextField txtMetenGenzeb11;
    private javax.swing.JTextField txtMizanBKilo;
    private javax.swing.JTextField txtOyarGabya;
    private javax.swing.JTextField txtOyarGabya1;
    private javax.swing.JTextField txtQutsriGabya;
    private javax.swing.JTextField txtThja;
    private javax.swing.JTextField txtWagaNKilo;
    // End of variables declaration//GEN-END:variables

}
