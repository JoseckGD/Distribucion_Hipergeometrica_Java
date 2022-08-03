package distribucion_hipergeometrica;

/**
 *
 * @author JoseckGD
 */
public class vista extends javax.swing.JFrame {

    public vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_Calcular_ = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txt_Res = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        a = new javax.swing.JLabel();
        txt_N = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        b = new javax.swing.JLabel();
        txt_n = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        c = new javax.swing.JLabel();
        txt_K = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        d = new javax.swing.JLabel();
        txt_m = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setLocation(new java.awt.Point(400, 200));

        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Distribucion Hipergeometrica");

        jPanel2.setLayout(new java.awt.GridLayout(1, 3, 10, 0));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 55));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 55));
        jPanel2.add(jSeparator1);

        btn_Calcular_.setBackground(new java.awt.Color(0, 0, 0));
        btn_Calcular_.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        btn_Calcular_.setForeground(new java.awt.Color(255, 255, 255));
        btn_Calcular_.setText("Calcular");
        btn_Calcular_.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_Calcular_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Calcular_ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_Calcular_);

        jSeparator2.setBackground(new java.awt.Color(51, 51, 55));
        jSeparator2.setForeground(new java.awt.Color(51, 51, 55));
        jPanel2.add(jSeparator2);

        txt_Res.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        txt_Res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_Res.setText("RESULTADO");

        jPanel3.setLayout(new java.awt.GridLayout(2, 2, 20, 20));

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        a.setBackground(new java.awt.Color(0, 0, 0));
        a.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a.setText(" N: ");
        a.setToolTipText("");
        jPanel4.add(a);

        txt_N.setText("12");
        txt_N.setToolTipText("");
        jPanel4.add(txt_N);

        jPanel3.add(jPanel4);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        b.setBackground(new java.awt.Color(255, 255, 255));
        b.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        b.setForeground(new java.awt.Color(255, 255, 255));
        b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b.setText(" n: ");
        jPanel1.add(b);

        txt_n.setText("4");
        txt_n.setToolTipText("");
        jPanel1.add(txt_n);

        jPanel3.add(jPanel1);

        jPanel5.setBackground(new java.awt.Color(255, 153, 255));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        c.setBackground(new java.awt.Color(0, 0, 0));
        c.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        c.setForeground(new java.awt.Color(255, 255, 255));
        c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c.setText(" K: ");
        c.setToolTipText("");
        jPanel5.add(c);

        txt_K.setText("2");
        txt_K.setToolTipText("");
        jPanel5.add(txt_K);

        jPanel3.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 153, 102));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        d.setBackground(new java.awt.Color(0, 0, 0));
        d.setFont(new java.awt.Font("Lucida Console", 1, 18)); // NOI18N
        d.setForeground(new java.awt.Color(255, 255, 255));
        d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d.setText(" m: ");
        d.setToolTipText("");
        jPanel6.add(d);

        txt_m.setText("3");
        txt_m.setToolTipText("");
        jPanel6.add(txt_m);

        jPanel3.add(jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_Res, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_Res, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Calcular_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Calcular_ActionPerformed
        double res = 0, a=0, b=0;
        int N = Integer.parseInt(this.txt_N.getText()), n = Integer.parseInt(this.txt_n.getText());
        int K = Integer.parseInt(this.txt_K.getText()), m = Integer.parseInt(this.txt_m.getText());
        
        a = Combinacion(m,K) * Combinacion((N-m),(n-K));
        b = Combinacion(N,n);

        res = a/b;

        this.txt_Res.setText("P(X="+K+") = "+String.format("%.4f", res)+"   *100 = " + String.format("%.2f", res*100)+"%");
    }//GEN-LAST:event_btn_Calcular_ActionPerformed

    public int Combinacion(int N, int R){
        
        int  res=0;
        
        res = Factorial(N) / (Factorial(N-R) * Factorial(R));
        
        //this.txt_Res.setText("Combinacion: "+res);
        
        return res;
    }
    
    public int Factorial(int num){
        int factorial=1;
        
        for(int i = num ; i>=1; i--){
            factorial = factorial * i;
            //System.out.println(i + "* ");
        }
        return factorial;
    }
    
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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JButton btn_Calcular_;
    private javax.swing.JLabel c;
    private javax.swing.JLabel d;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txt_K;
    private javax.swing.JTextField txt_N;
    private javax.swing.JLabel txt_Res;
    private javax.swing.JTextField txt_m;
    private javax.swing.JTextField txt_n;
    // End of variables declaration//GEN-END:variables
}
