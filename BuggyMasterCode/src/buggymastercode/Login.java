/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Login.java
 *
 * Created on Apr 19, 2010, 1:29:55 PM
 */

package buggymastercode;

import java.io.FileInputStream;
import java.util.Properties;
import org.jdesktop.application.Action;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jalvarez
 */
public class Login extends javax.swing.JDialog {

    /** Creates new form Login */
    public Login(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        this.getRootPane().setDefaultButton(cmdOk);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txServer = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txPwd = new javax.swing.JPasswordField();
        cmdOk = new javax.swing.JButton();
        cmdCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(buggymastercode.BuggyMasterCodeApp.class).getContext().getResourceMap(Login.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);

        txUser.setText(resourceMap.getString("txUser.text")); // NOI18N
        txUser.setName("txUser"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        txServer.setName("txServer"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        txPwd.setText(resourceMap.getString("txPwd.text")); // NOI18N
        txPwd.setName("txPwd"); // NOI18N

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(buggymastercode.BuggyMasterCodeApp.class).getContext().getActionMap(Login.class, this);
        cmdOk.setAction(actionMap.get("login")); // NOI18N
        cmdOk.setText(resourceMap.getString("cmdOk.text")); // NOI18N
        cmdOk.setName("cmdOk"); // NOI18N

        cmdCancel.setAction(actionMap.get("cancel")); // NOI18N
        cmdCancel.setText(resourceMap.getString("cmdCancel.text")); // NOI18N
        cmdCancel.setName("cmdCancel"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txPwd, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txServer, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmdOk)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdCancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txServer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCancel)
                    .addComponent(cmdOk))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean initDialog() {

        Logger logger = BuggyMasterCodeApp.getLogger();

    	logger.info("loading configuration from BuggyMasterCodeApp.properties");
    	try {
	    	Properties p = new Properties();
	        p.load(new FileInputStream("BuggyMasterCodeApp.properties"));
	        m_type = p.getProperty("db_type");
	        m_server = p.getProperty("db_server");
	        m_database = p.getProperty("db_database");
	        m_user = p.getProperty("db_user");
	        m_password = p.getProperty("db_password");
    	}
    	catch(Exception ex) {
    		logger.log(Level.WARNING, "failed loading configuration from BuggyMasterCodeApp.properties", ex);
    		return false;
    	}

        this.txUser.setText(m_user);
        this.txPwd.setText(m_password);
        this.txServer.setText(m_server);

    	logger.info("creating database objects");
    	if (!getDbObjects(m_type)) {
    		logger.log(Level.WARNING, "failed creating database objects");
    		return false;
    	}

        return true;
    }

    private boolean getDbObjects(String type) {
        if (type.equals(BuggyMasterCodeApp.C_DB_TYPE_ORACLE)) {
            BuggyMasterCodeApp.setDb(new DBOracle());
            BuggyMasterCodeApp.setDbBuggyMasterCode(new DBOracleBuggyMasterCode());
        }
        else if (type.equals(BuggyMasterCodeApp.C_DB_TYPE_H2)) {
            BuggyMasterCodeApp.setDb(new DBH2());
            BuggyMasterCodeApp.setDbBuggyMasterCode(new DBH2BuggyMasterCode());
        }
        else {
            BuggyMasterCodeApp.getLogger().log(Level.WARNING, "the database type " + type + " is not implemented yet");
            return false;
        }
        return true;
    }

    @Action
    public void login() {
    	BuggyMasterCodeApp.getLogger().info("connecting to database");
    	if (Db.db.connect(
                this.txServer.getText(),
                this.txUser.getText(),
                new String(this.txPwd.getPassword()))) {
            m_ok = true;
            this.setVisible(false);
        } else {
            G.showInfo("Connection to database " + this.txServer.getText() + " couldn't be established");
        }
    }

    @Action
    public void cancel() {
        this.setVisible(false);
    }

    public boolean getOk() {
        return m_ok;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCancel;
    private javax.swing.JButton cmdOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txPwd;
    private javax.swing.JTextField txServer;
    private javax.swing.JTextField txUser;
    // End of variables declaration//GEN-END:variables

    private boolean m_ok = false;
    String m_type = "";
    String m_server = "";
    String m_database = "";
    String m_user = "";
    String m_password = "";
}
