
public class calc extends javax.swing.JFrame {

    /**
     * Creates new form calc
     */
    public calc() {
        initComponents();
    }
    double n1=0,n2=0;
    String operator=null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bd = new javax.swing.JButton();
        bp = new javax.swing.JButton();
        bq = new javax.swing.JButton();
        bdiv = new javax.swing.JButton();
        bmul = new javax.swing.JButton();
        bm = new javax.swing.JButton();
        bc = new javax.swing.JButton();
        beq = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        t = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(204, 0, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setForeground(new java.awt.Color(0, 0, 51));

        jLabel1.setFont(new java.awt.Font("Shonar Bangla", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("CALCULATOR");

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 153, 153));

        b1.setBackground(new java.awt.Color(153, 0, 153));
        b1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 204));
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(153, 0, 153));
        b2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 0));
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(153, 0, 153));
        b3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        b3.setForeground(new java.awt.Color(255, 255, 0));
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(153, 0, 153));
        b4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        b4.setForeground(new java.awt.Color(255, 255, 0));
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(153, 0, 153));
        b7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        b7.setForeground(new java.awt.Color(255, 255, 0));
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(153, 0, 153));
        b5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        b5.setForeground(new java.awt.Color(255, 255, 0));
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(153, 0, 153));
        b6.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        b6.setForeground(new java.awt.Color(255, 255, 0));
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(153, 0, 153));
        b8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        b8.setForeground(new java.awt.Color(255, 255, 0));
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(153, 0, 153));
        b9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        b9.setForeground(new java.awt.Color(255, 255, 0));
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        b0.setBackground(new java.awt.Color(153, 0, 153));
        b0.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        b0.setForeground(new java.awt.Color(255, 255, 0));
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bd.setBackground(new java.awt.Color(153, 0, 153));
        bd.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        bd.setForeground(new java.awt.Color(255, 255, 0));
        bd.setText(".");
        bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdActionPerformed(evt);
            }
        });

        bp.setBackground(new java.awt.Color(255, 0, 102));
        bp.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        bp.setForeground(new java.awt.Color(255, 255, 0));
        bp.setText("+");
        bp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpActionPerformed(evt);
            }
        });

        bq.setBackground(new java.awt.Color(255, 0, 102));
        bq.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        bq.setForeground(new java.awt.Color(255, 255, 0));
        bq.setText("/");
        bq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bqActionPerformed(evt);
            }
        });

        bdiv.setBackground(new java.awt.Color(255, 0, 102));
        bdiv.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        bdiv.setForeground(new java.awt.Color(255, 255, 0));
        bdiv.setText("%");
        bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivActionPerformed(evt);
            }
        });

        bmul.setBackground(new java.awt.Color(255, 0, 102));
        bmul.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        bmul.setForeground(new java.awt.Color(255, 255, 0));
        bmul.setText("*");
        bmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmulActionPerformed(evt);
            }
        });

        bm.setBackground(new java.awt.Color(255, 0, 102));
        bm.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        bm.setForeground(new java.awt.Color(255, 255, 0));
        bm.setText("-");
        bm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmActionPerformed(evt);
            }
        });

        bc.setBackground(new java.awt.Color(0, 204, 255));
        bc.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        bc.setForeground(new java.awt.Color(51, 0, 102));
        bc.setText("C");
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });

        beq.setBackground(new java.awt.Color(0, 204, 255));
        beq.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        beq.setForeground(new java.awt.Color(102, 0, 102));
        beq.setText("=");
        beq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beqActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bd, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(bmul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bdiv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bq, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(beq, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bc, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bc)
                        .addComponent(jButton1))
                    .addComponent(beq, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bmul, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bq, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
t.setText(t.getText()+"1");


        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        t.setText(t.getText()+"9");
    }//GEN-LAST:event_b9ActionPerformed

    private void bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdActionPerformed
t.setText(t.getText()+".");        
// TODO add your handling code here:
    }//GEN-LAST:event_bdActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
t.setText(t.getText()+"2");        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
t.setText(t.getText()+"3");        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
t.setText(t.getText()+"4");        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
t.setText(t.getText()+"5");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
t.setText(t.getText()+"6");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
t.setText(t.getText()+"7");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
t.setText(t.getText()+"8");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
t.setText(t.getText()+"0");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_b0ActionPerformed

    private void bqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bqActionPerformed
n1=Double.parseDouble(t.getText());
t.setText(" ");
operator="/";
// TODO add your handling code here:
    }//GEN-LAST:event_bqActionPerformed

    private void bpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpActionPerformed
     
n1=Double.parseDouble(t.getText());
t.setText(" ");
operator="+";  
// TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_bpActionPerformed

    private void bmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmActionPerformed
        // TODO add your handling code here:
        n1=Double.parseDouble(t.getText());
t.setText(" ");
operator="-";  



        // TODO add your handling code here:
    }//GEN-LAST:event_bmActionPerformed

    private void bmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmulActionPerformed
n1=Double.parseDouble(t.getText());
t.setText(" ");
operator="*";  

// TODO add your handling code here:
    }//GEN-LAST:event_bmulActionPerformed

    private void bdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivActionPerformed
n1=Double.parseDouble(t.getText());
t.setText(" ");
operator="%";   
// TODO add your handling code here:
// TODO add your handling code here:
    }//GEN-LAST:event_bdivActionPerformed

    private void beqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beqActionPerformed
       n2=Double.parseDouble(t.getText());
        
double ans=0;
if(operator=="+"){
    ans=n1+n2;
}
if(operator=="-"){
    ans=n1-n2;
}
if(operator=="*"){
    ans=n1*n2;
}
if(operator=="/"){
    ans=n1/n2;
}
if(operator=="%"){
    ans=n1%n2;
}
t.setText(" "+ans);
operator=null;
// TODO add your handling code here:
    }//GEN-LAST:event_beqActionPerformed

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
t.setText(" ");

        // TODO add your handling code here:
    }//GEN-LAST:event_bcActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String s=t.getText();
t.setText(s.substring(0, s.length()-1));
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bc;
    private javax.swing.JButton bd;
    private javax.swing.JButton bdiv;
    private javax.swing.JButton beq;
    private javax.swing.JButton bm;
    private javax.swing.JButton bmul;
    private javax.swing.JButton bp;
    private javax.swing.JButton bq;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField t;
    // End of variables declaration//GEN-END:variables
}
