package BLW_Register;

//import java.awt.Dimension;
//import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Ephriam - ifipya
public final class homeBLW extends javax.swing.JFrame {

    private int maxMin = 0;
    private int xMouse;
    private int yMouse;
    private int getXOnScreen;
    private int getYOnScreen;
    private int countFileLines = 0;

    private DefaultTableModel model;
    private boolean deleteEnabled = false;
    private boolean editEnabled = false;
    private boolean saveEnabled = false;
    
    private boolean wiped = false;
    private boolean goAheadSave = true;
    private boolean memberExists = false;
    private boolean noUpdateChange = false;
    private boolean noRow = false;
    private boolean goOn = true;
    private boolean max = false;

    private final double widthRatio = 0.7789165446559297;
    private final double heightRatio = 0.8385416666666667;
    //private final Dimension sreenSize = Toolkit.getDefaultToolkit().getScreenSize();
    //private final int width = (int) (sreenSize.getWidth() * widthRatio);
    //private final int height = (int) (sreenSize.getHeight() * heightRatio);
    private int yearIntChoise = 1;
    
    private String tempAddress = "";
    private String titleStringChoise = "Bro";
    private String addressStringChoise = "On Campus";
    private ArrayList<String> arrayList = new ArrayList<>();  //write TO, read FROM

    public homeBLW() {

        initComponents();
        readFromFile();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        sidePanelHeader = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        titleValue = new javax.swing.JComboBox();
        dobTitle = new javax.swing.JLabel();
        addressValue = new javax.swing.JComboBox();
        addressTitle = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        cellLabel = new javax.swing.JLabel();
        yearValue = new javax.swing.JComboBox();
        yearTitle = new javax.swing.JLabel();
        roomLabel = new javax.swing.JLabel();
        programLabel = new javax.swing.JLabel();
        newResetButton = new javax.swing.JButton();
        emailValue = new javax.swing.JTextField();
        lastNameValue = new javax.swing.JTextField();
        contactValue = new javax.swing.JTextField();
        cellValue = new javax.swing.JTextField();
        programValue = new javax.swing.JTextField();
        roomValue = new javax.swing.JTextField();
        saveUpdateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        firstNameValue = new javax.swing.JTextField();
        firstNameLabel1 = new javax.swing.JLabel();
        memberID = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        roleValue = new javax.swing.JTextField();
        midTopPanel = new javax.swing.JPanel();
        searchIcon = new javax.swing.JLabel();
        searchJSeparator = new javax.swing.JSeparator();
        searchField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableList = new javax.swing.JTable();
        topPanel = new javax.swing.JPanel();
        closeXButton = new javax.swing.JLabel();
        Maximize = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        blwRegisterTopLabel = new javax.swing.JLabel();
        topPencil = new javax.swing.JLabel();
        excelLabel = new javax.swing.JLabel();
        saveLabel = new javax.swing.JLabel();
        aboutLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BLW_Register");
        setMinimumSize(new java.awt.Dimension(800, 400));
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        sidepanel.setBackground(new java.awt.Color(204, 102, 0));

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));

        sidePanelHeader.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        sidePanelHeader.setForeground(new java.awt.Color(240, 240, 240));
        sidePanelHeader.setText("LoveWorld Register");
        sidePanelHeader.setToolTipText(""); // NOI18N
        sidePanelHeader.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        firstNameLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(230, 230, 230));
        firstNameLabel.setText("First Name:");
        firstNameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titleValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        titleValue.setForeground(new java.awt.Color(51, 51, 51));
        titleValue.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bro", "Sis", "Pastor" }));
        titleValue.setBorder(null);
        titleValue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        titleValue.setEnabled(false);
        titleValue.setOpaque(false);
        titleValue.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                titleValueItemStateChanged(evt);
            }
        });
        titleValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleValueActionPerformed(evt);
            }
        });
        titleValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                titleValueKeyPressed(evt);
            }
        });

        dobTitle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dobTitle.setForeground(new java.awt.Color(230, 230, 230));
        dobTitle.setText("Role:");
        dobTitle.setToolTipText("");
        dobTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        addressValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addressValue.setForeground(new java.awt.Color(51, 51, 51));
        addressValue.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "On Campus", "Bording house", "Other" }));
        addressValue.setBorder(null);
        addressValue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addressValue.setEnabled(false);
        addressValue.setOpaque(false);
        addressValue.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                addressValueItemStateChanged(evt);
            }
        });
        addressValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressValueActionPerformed(evt);
            }
        });
        addressValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addressValueKeyPressed(evt);
            }
        });

        addressTitle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 15)); // NOI18N
        addressTitle.setForeground(new java.awt.Color(230, 230, 230));
        addressTitle.setText("Address:");
        addressTitle.setToolTipText("");
        addressTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        titleLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(230, 230, 230));
        titleLabel.setText("Title:");
        titleLabel.setToolTipText("");
        titleLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lastNameLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(230, 230, 230));
        lastNameLabel.setText("Last Name:");
        lastNameLabel.setToolTipText("");
        lastNameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        emailLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(230, 230, 230));
        emailLabel.setText("Email:");
        emailLabel.setToolTipText("");
        emailLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        contactLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        contactLabel.setForeground(new java.awt.Color(230, 230, 230));
        contactLabel.setText("Contact No.");
        contactLabel.setToolTipText("");
        contactLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cellLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cellLabel.setForeground(new java.awt.Color(230, 230, 230));
        cellLabel.setText("Cell:");
        cellLabel.setToolTipText("");
        cellLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        yearValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        yearValue.setForeground(new java.awt.Color(51, 51, 51));
        yearValue.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        yearValue.setBorder(null);
        yearValue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yearValue.setEnabled(false);
        yearValue.setOpaque(false);
        yearValue.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                yearValueItemStateChanged(evt);
            }
        });
        yearValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearValueActionPerformed(evt);
            }
        });
        yearValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yearValueKeyPressed(evt);
            }
        });

        yearTitle.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        yearTitle.setForeground(new java.awt.Color(230, 230, 230));
        yearTitle.setText("Year of Study: ");
        yearTitle.setToolTipText("");
        yearTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        roomLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        roomLabel.setForeground(new java.awt.Color(230, 230, 230));
        roomLabel.setText("Room No.");
        roomLabel.setToolTipText("");
        roomLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        programLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        programLabel.setForeground(new java.awt.Color(230, 230, 230));
        programLabel.setText("Program:");
        programLabel.setToolTipText("");
        programLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        newResetButton.setBackground(new java.awt.Color(204, 204, 204));
        newResetButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        newResetButton.setText("New");
        newResetButton.setToolTipText("Add New Member");
        newResetButton.setBorder(null);
        newResetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newResetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newResetButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                newResetButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newResetButtonMouseExited(evt);
            }
        });

        emailValue.setEditable(false);
        emailValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailValue.setForeground(new java.awt.Color(51, 51, 51));
        emailValue.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        emailValue.setMargin(new java.awt.Insets(0, 0, 0, 0));
        emailValue.setOpaque(false);
        emailValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailValueActionPerformed(evt);
            }
        });
        emailValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailValueKeyPressed(evt);
            }
        });

        lastNameValue.setEditable(false);
        lastNameValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lastNameValue.setForeground(new java.awt.Color(51, 51, 51));
        lastNameValue.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        lastNameValue.setMargin(new java.awt.Insets(0, 0, 0, 0));
        lastNameValue.setOpaque(false);
        lastNameValue.setPreferredSize(new java.awt.Dimension(2, 18));
        lastNameValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameValueActionPerformed(evt);
            }
        });
        lastNameValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lastNameValueKeyPressed(evt);
            }
        });

        contactValue.setEditable(false);
        contactValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contactValue.setForeground(new java.awt.Color(51, 51, 51));
        contactValue.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        contactValue.setMargin(new java.awt.Insets(0, 0, 0, 0));
        contactValue.setOpaque(false);
        contactValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactValueActionPerformed(evt);
            }
        });
        contactValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contactValueKeyPressed(evt);
            }
        });

        cellValue.setEditable(false);
        cellValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cellValue.setForeground(new java.awt.Color(51, 51, 51));
        cellValue.setToolTipText("Fellowship Cell Name");
        cellValue.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        cellValue.setMargin(new java.awt.Insets(0, 0, 0, 0));
        cellValue.setOpaque(false);
        cellValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellValueActionPerformed(evt);
            }
        });
        cellValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cellValueKeyPressed(evt);
            }
        });

        programValue.setEditable(false);
        programValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        programValue.setForeground(new java.awt.Color(51, 51, 51));
        programValue.setToolTipText("Program of Study");
        programValue.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        programValue.setMargin(new java.awt.Insets(0, 0, 0, 0));
        programValue.setOpaque(false);
        programValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programValueActionPerformed(evt);
            }
        });
        programValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                programValueKeyPressed(evt);
            }
        });

        roomValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        roomValue.setForeground(new java.awt.Color(51, 51, 51));
        roomValue.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        roomValue.setEnabled(false);
        roomValue.setMargin(new java.awt.Insets(0, 0, 0, 0));
        roomValue.setOpaque(false);
        roomValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomValueActionPerformed(evt);
            }
        });
        roomValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                roomValueKeyPressed(evt);
            }
        });

        saveUpdateButton.setBackground(new java.awt.Color(204, 204, 204));
        saveUpdateButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        saveUpdateButton.setText("Save");
        saveUpdateButton.setToolTipText("Save Member Details");
        saveUpdateButton.setBorder(null);
        saveUpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveUpdateButton.setEnabled(false);
        saveUpdateButton.setMaximumSize(new java.awt.Dimension(27, 15));
        saveUpdateButton.setMinimumSize(new java.awt.Dimension(27, 15));
        saveUpdateButton.setPreferredSize(new java.awt.Dimension(27, 15));
        saveUpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveUpdateButtonMouseClicked(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(204, 204, 204));
        deleteButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.setToolTipText("Delete Member");
        deleteButton.setBorder(null);
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.setEnabled(false);
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
        });
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        firstNameValue.setEditable(false);
        firstNameValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        firstNameValue.setForeground(new java.awt.Color(51, 51, 51));
        firstNameValue.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        firstNameValue.setMargin(new java.awt.Insets(0, 0, 0, 0));
        firstNameValue.setOpaque(false);
        firstNameValue.setPreferredSize(new java.awt.Dimension(2, 18));
        firstNameValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameValueActionPerformed(evt);
            }
        });
        firstNameValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                firstNameValueKeyPressed(evt);
            }
        });

        firstNameLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        firstNameLabel1.setForeground(new java.awt.Color(230, 230, 230));
        firstNameLabel1.setText("Member ID:");
        firstNameLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        memberID.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        memberID.setForeground(new java.awt.Color(230, 230, 230));
        memberID.setText("-");
        memberID.setToolTipText("Member's ID");
        memberID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        editButton.setBackground(new java.awt.Color(204, 204, 204));
        editButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/edit-black.png"))); // NOI18N
        editButton.setText("Edit");
        editButton.setToolTipText("Edit Member Details");
        editButton.setBorder(null);
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.setEnabled(false);
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editButtonMouseClicked(evt);
            }
        });

        roleValue.setEditable(false);
        roleValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        roleValue.setForeground(new java.awt.Color(51, 51, 51));
        roleValue.setToolTipText("Leadership Position");
        roleValue.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5));
        roleValue.setMargin(new java.awt.Insets(0, 0, 0, 0));
        roleValue.setOpaque(false);
        roleValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleValueActionPerformed(evt);
            }
        });
        roleValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                roleValueKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveUpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameLabel)
                            .addComponent(dobTitle)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(firstNameLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(memberID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(65, 65, 65)
                                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lastNameLabel)
                                        .addComponent(emailLabel)
                                        .addComponent(contactLabel)
                                        .addComponent(cellLabel)
                                        .addComponent(addressTitle)
                                        .addComponent(roomLabel)
                                        .addComponent(programLabel)
                                        .addComponent(yearTitle)
                                        .addComponent(titleLabel))
                                    .addGap(1, 1, 1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(titleValue, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(firstNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lastNameValue, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addComponent(emailValue, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addComponent(contactValue, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addComponent(cellValue, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addComponent(roleValue, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(addressValue, 0, 145, Short.MAX_VALUE)
                                        .addComponent(roomValue, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(programValue, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(yearValue, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sidePanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addressValue, cellValue, contactValue, emailValue, lastNameValue});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(sidePanelHeader)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstNameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(memberID)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleValue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(emailValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cellLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(cellValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roleValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressValue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roomValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(programLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(programValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearValue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(newResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(saveUpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        midTopPanel.setBackground(new java.awt.Color(255, 255, 255));
        midTopPanel.setPreferredSize(new java.awt.Dimension(0, 50));
        midTopPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                midTopPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                midTopPanelMouseExited(evt);
            }
        });

        searchIcon.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        searchIcon.setForeground(new java.awt.Color(255, 255, 255));
        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Searching.png"))); // NOI18N
        searchIcon.setToolTipText("");
        searchIcon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        searchIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        searchIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchIconMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchIconMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchIconMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchIconMouseReleased(evt);
            }
        });

        searchJSeparator.setBackground(new java.awt.Color(102, 102, 102));
        searchJSeparator.setForeground(new java.awt.Color(102, 102, 102));
        searchJSeparator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchJSeparatorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchJSeparatorMouseExited(evt);
            }
        });

        searchField.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        searchField.setForeground(new java.awt.Color(153, 153, 153));
        searchField.setText("          Search");
        searchField.setToolTipText("Search"); // NOI18N
        searchField.setBorder(null);
        searchField.setMargin(new java.awt.Insets(0, 0, 0, 0));
        searchField.setOpaque(false);
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });
        searchField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchFieldMouseClicked(evt);
            }
        });
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout midTopPanelLayout = new javax.swing.GroupLayout(midTopPanel);
        midTopPanel.setLayout(midTopPanelLayout);
        midTopPanelLayout.setHorizontalGroup(
            midTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, midTopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(midTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchJSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(midTopPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(searchIcon)))
                .addGap(18, 18, 18))
        );
        midTopPanelLayout.setVerticalGroup(
            midTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midTopPanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(midTopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchField)
                    .addComponent(searchIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addComponent(searchJSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane2.setBorder(null);

        tableList.setAutoCreateRowSorter(true);
        tableList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
        tableList.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tableList.setForeground(new java.awt.Color(51, 51, 51));
        tableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID.", "Title", "First Name", "Last Name", "Contact", "Email", "Role", "Cell", "Address", "Program", "Year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableList.setMaximumSize(new java.awt.Dimension(32767, 32767));
        tableList.setOpaque(false);
        tableList.setRowHeight(25);
        tableList.setSelectionBackground(new java.awt.Color(204, 102, 0));
        tableList.setShowHorizontalLines(false);
        tableList.setShowVerticalLines(false);
        tableList.getTableHeader().setReorderingAllowed(false);
        tableList.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tableListMouseMoved(evt);
            }
        });
        tableList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListMouseClicked(evt);
            }
        });
        tableList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableListKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tableList);
        if (tableList.getColumnModel().getColumnCount() > 0) {
            tableList.getColumnModel().getColumn(0).setMinWidth(37);
            tableList.getColumnModel().getColumn(0).setPreferredWidth(37);
            tableList.getColumnModel().getColumn(0).setMaxWidth(37);
            tableList.getColumnModel().getColumn(1).setMinWidth(50);
            tableList.getColumnModel().getColumn(1).setPreferredWidth(50);
            tableList.getColumnModel().getColumn(1).setMaxWidth(50);
            tableList.getColumnModel().getColumn(8).setMinWidth(70);
            tableList.getColumnModel().getColumn(8).setPreferredWidth(70);
            tableList.getColumnModel().getColumn(8).setMaxWidth(70);
            tableList.getColumnModel().getColumn(10).setMinWidth(50);
            tableList.getColumnModel().getColumn(10).setPreferredWidth(50);
            tableList.getColumnModel().getColumn(10).setMaxWidth(50);
        }

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(midTopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
                        .addGap(1, 1, 1))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(midTopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE))))
        );

        topPanel.setBackground(new java.awt.Color(242, 242, 242));
        topPanel.setPreferredSize(new java.awt.Dimension(192, 50));
        //Now-----------------

        /*jMenu = new javax.swing.JMenu("File");
        barItem = new javax.swing.JMenuItem("Click");
        menuBar = new javax.swing.JMenuBar();

        jMenu.add(barItem);
        menuBar.add(jMenu);
        topPanel.add(menuBar);*/

        //Then----------------
        topPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                topPanelMouseDragged(evt);
            }
        });
        topPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                topPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                topPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                topPanelMouseReleased(evt);
            }
        });

        closeXButton.setBackground(new java.awt.Color(242, 242, 242));
        closeXButton.setFont(new java.awt.Font("Eras Light ITC", 1, 15)); // NOI18N
        closeXButton.setForeground(new java.awt.Color(0, 0, 1));
        closeXButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeXButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Close Dark.png"))); // NOI18N
        closeXButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeXButton.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                closeXButtonMouseMoved(evt);
            }
        });
        closeXButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                closeXButtonFocusGained(evt);
            }
        });
        closeXButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeXButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeXButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeXButtonMouseExited(evt);
            }
        });

        Maximize.setBackground(new java.awt.Color(242, 242, 242));
        Maximize.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Maximize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Max Grey.png"))); // NOI18N
        Maximize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Maximize.setPreferredSize(new java.awt.Dimension(38, 30));
        Maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaximizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MaximizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MaximizeMouseExited(evt);
            }
        });

        Minimize.setBackground(new java.awt.Color(242, 242, 242));
        Minimize.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        Minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Mini Grey.png"))); // NOI18N
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.setIconTextGap(0);
        Minimize.setPreferredSize(new java.awt.Dimension(8, 15));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizeMouseExited(evt);
            }
        });

        blwRegisterTopLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        blwRegisterTopLabel.setForeground(new java.awt.Color(51, 51, 51));
        blwRegisterTopLabel.setText(" LoveWorld Register");
        blwRegisterTopLabel.setToolTipText("");
        blwRegisterTopLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        topPencil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        topPencil.setForeground(new java.awt.Color(255, 255, 255));
        topPencil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/edit-black - faded backG.png"))); // NOI18N
        topPencil.setToolTipText("You Are Supernatural");
        topPencil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        excelLabel.setBackground(new java.awt.Color(242, 242, 242));
        excelLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        excelLabel.setForeground(new java.awt.Color(51, 51, 51));
        excelLabel.setText("  Excel");
        excelLabel.setToolTipText("Excel Document");
        excelLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        excelLabel.setOpaque(true);
        excelLabel.setPreferredSize(new java.awt.Dimension(45, 15));
        excelLabel.setVerifyInputWhenFocusTarget(false);
        excelLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                excelLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                excelLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                excelLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                excelLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                excelLabelMouseReleased(evt);
            }
        });

        saveLabel.setBackground(new java.awt.Color(242, 242, 242));
        saveLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        saveLabel.setForeground(new java.awt.Color(51, 51, 51));
        saveLabel.setText("  Save");
        saveLabel.setToolTipText("Save");
        saveLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveLabel.setOpaque(true);
        saveLabel.setVerifyInputWhenFocusTarget(false);
        saveLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saveLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                saveLabelMouseReleased(evt);
            }
        });

        aboutLabel.setBackground(new java.awt.Color(242, 242, 242));
        aboutLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        aboutLabel.setForeground(new java.awt.Color(51, 51, 51));
        aboutLabel.setText("  About");
        aboutLabel.setToolTipText("About");
        aboutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutLabel.setOpaque(true);
        aboutLabel.setVerifyInputWhenFocusTarget(false);
        aboutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutLabelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aboutLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                aboutLabelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(blwRegisterTopLabel)
                .addGap(3, 3, 3)
                .addComponent(topPencil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Maximize, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(closeXButton))
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(excelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(saveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(aboutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(blwRegisterTopLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                        .addComponent(topPencil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(closeXButton))
                .addGap(12, 12, 12)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aboutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(Maximize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addComponent(Minimize, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
        );

        //TopPanelGradient panel = new TopPanelGradient();
        //topjPanel.add(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1064, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void titleValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleValueActionPerformed

    private void addressValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressValueActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void yearValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearValueActionPerformed

    private void emailValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailValueActionPerformed

    private void lastNameValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameValueActionPerformed

    private void contactValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactValueActionPerformed

    private void cellValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cellValueActionPerformed

    private void programValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programValueActionPerformed

    private void roomValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomValueActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void topPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topPanelMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_topPanelMouseReleased

    private void topPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topPanelMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_topPanelMousePressed

    private void topPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topPanelMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2 && maxMin == 0) {//Max
            Maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Max BB Grey.png")));
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            maxMin = 1;
            max = true;
            return;
        }

        if (evt.getClickCount() == 2 && maxMin == 1) {//Normal  
            Maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Max Grey.png")));
            this.setExtendedState(JFrame.NORMAL);
            maxMin = 0;
            max = false;
        }
    }//GEN-LAST:event_topPanelMouseClicked

    private void topPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_topPanelMouseDragged
        // TODO add your handling code here:
        getXOnScreen = evt.getXOnScreen();
        getYOnScreen = evt.getYOnScreen();
        
        

        if (getYOnScreen == 0) {//Max
            Maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Max BB Grey.png")));
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.setLocation(0, 0);
            maxMin = 1;
            max = true;
            return;
        }

        if (getYOnScreen != 0) {//Normal
            Maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Max Grey.png")));
            //this.setSize(width, height);
            this.setExtendedState(JFrame.NORMAL);
            maxMin = 0;
            max = false;
        }

        this.setLocation(getXOnScreen - xMouse, getYOnScreen - yMouse);
    }//GEN-LAST:event_topPanelMouseDragged

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void MaximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizeMouseClicked
        // TODO add your handling code here:
        if (maxMin == 0) {//Max
            Maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Max BB Grey.png")));
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.setLocation(0, 0);
            maxMin = 1;
            max = true;
            return;
        }

        if (maxMin == 1) {//Normal
            Maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Max Grey.png")));
            this.setExtendedState(JFrame.NORMAL);
            maxMin = 0;
            max = false;
        }
    }//GEN-LAST:event_MaximizeMouseClicked

    private void closeXButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeXButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeXButtonMouseClicked

    private void closeXButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_closeXButtonFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_closeXButtonFocusGained

    private void closeXButtonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeXButtonMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_closeXButtonMouseMoved

    private void tableListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListMouseClicked
        // TODO add your handling code here:
        tableMouseClick();
    }//GEN-LAST:event_tableListMouseClicked

    private void midTopPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_midTopPanelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_midTopPanelMouseEntered

    private void midTopPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_midTopPanelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_midTopPanelMouseExited

    private void MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseEntered
        // TODO add your handling code here:
        Minimize.setBackground(new java.awt.Color(63, 72, 204));
        Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Mini Blue.png")));
    }//GEN-LAST:event_MinimizeMouseEntered

    private void MinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseExited
        // TODO add your handling code here:
        Minimize.setBackground(new java.awt.Color(242, 242, 242));
        Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Mini Grey.png")));
    }//GEN-LAST:event_MinimizeMouseExited

    private void MaximizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizeMouseEntered
        // TODO add your handling code here:
        Maximize.setBackground(new java.awt.Color(63, 72, 204));

        getYOnScreen = evt.getYOnScreen();

        if (max) {//Max
            Maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Max BB Blue.png")));
           
            return;
        }

        if (max == false) {//Normal
            Maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Max Blue.png")));
        }

    }//GEN-LAST:event_MaximizeMouseEntered

    private void MaximizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizeMouseExited
        // TODO add your handling code here:
        Maximize.setBackground(new java.awt.Color(242, 242, 242));

        getYOnScreen = evt.getYOnScreen();

        if (max) {//Max
            Maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Max BB Grey.png")));
            return;
        }

        if (max == false) {//Normal
            Maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Max Grey.png")));
        }
    }//GEN-LAST:event_MaximizeMouseExited

    private void closeXButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeXButtonMouseEntered
        // TODO add your handling code here:
        
     //setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Close Dark.png")));
        closeXButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Close Light.png")));
    }//GEN-LAST:event_closeXButtonMouseEntered

    private void closeXButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeXButtonMouseExited
        // TODO add your handling code here:
        closeXButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BLW_Register/icons/icons/Close Dark.png")));
    }//GEN-LAST:event_closeXButtonMouseExited

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchFieldMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_searchFieldMouseClicked

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        // TODO add your handling code here:
        if (searchField.getText().isEmpty()) {
            searchField.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
            searchField.setForeground(new java.awt.Color(153, 153, 153));
            searchField.setText("          Search");

            for (int x = 0; x < tableList.getRowCount(); x++) {
                model.setValueAt((x + 1), x, 0);
            }
        }
    }//GEN-LAST:event_searchFieldFocusLost

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        // TODO add your handling code here:
        if (searchField.getText().contains("          Search")) {
            searchField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            searchField.setForeground(new java.awt.Color(51, 51, 51));
            searchField.setText("");
        }
    }//GEN-LAST:event_searchFieldFocusGained

    private void excelLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excelLabelMouseEntered
        // TODO add your handling code here:
        excelLabel.setBackground(new java.awt.Color(204,102,0));  //(204,102,0)
        excelLabel.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_excelLabelMouseEntered

    private void excelLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excelLabelMouseExited
        // TODO add your handling code here:
        excelLabel.setBackground(new java.awt.Color(242, 242, 242));
        excelLabel.setForeground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_excelLabelMouseExited

    private void saveLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveLabelMouseEntered
        // TODO add your handling code here:
        saveLabel.setBackground(new java.awt.Color(204,102,0));
        saveLabel.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_saveLabelMouseEntered

    private void saveLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveLabelMouseExited
        // TODO add your handling code here:
        saveLabel.setBackground(new java.awt.Color(242, 242, 242));
        saveLabel.setForeground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_saveLabelMouseExited

    private void aboutLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLabelMouseEntered
        // TODO add your handling code here:
        aboutLabel.setBackground(new java.awt.Color(204,102,0));
        aboutLabel.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_aboutLabelMouseEntered

    private void aboutLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLabelMouseExited
        // TODO add your handling code here:
        aboutLabel.setBackground(new java.awt.Color(242, 242, 242));
        aboutLabel.setForeground(new java.awt.Color(51,51,51));
    }//GEN-LAST:event_aboutLabelMouseExited

    private void searchIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchIconMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_searchIconMouseEntered

    private void searchIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchIconMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_searchIconMouseExited

    private void searchIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchIconMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchIconMouseClicked

    private void searchIconMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchIconMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchIconMousePressed

    private void searchIconMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchIconMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_searchIconMouseReleased

    private void newResetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newResetButtonMouseClicked
        // TODO add your handling code here:
        if (newResetButton.getText().equals("New")) {
            newResetButton.setText("Reset");
            newResetButton.setToolTipText("Reset Entered Details");
            sidePanelHeader.setText("   - Enter New Member -");
            
            memberID.setText((tableList.getRowCount()+1)+"");

            deleteButton.setEnabled(false);
            deleteEnabled = false;

            editButton.setEnabled(false);
            editEnabled = false;

            saveUpdateButton.setEnabled(true);
            saveEnabled = true;

            saveUpdateButton.setText("Save");
            saveUpdateButton.setToolTipText("Save New Member");

            //Enable Form Fields
            enableFields();

            blackFieldContent();

            //Reset Fields
            resetFields();

        } else if (newResetButton.getText().equals("Reset")) {
            sidePanelHeader.setText("   - Enter New Member -");

            deleteButton.setEnabled(false);
            deleteEnabled = false;

            saveUpdateButton.setEnabled(true);
            saveEnabled = true;

            editButton.setEnabled(false);
            editEnabled = false;

            //Enable Form Fields
            enableFields();

            blackFieldContent();

            //Reset Fields
            resetFields();
        }
    }//GEN-LAST:event_newResetButtonMouseClicked

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        // TODO add your handling code here:

        if (deleteEnabled) {
            deleteRow();

            editButton.setEnabled(false);
            editEnabled = false;

        }
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void firstNameValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameValueActionPerformed

    private void saveUpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveUpdateButtonMouseClicked
        // TODO add your handling code here:
        saveUpdateButton();
    }//GEN-LAST:event_saveUpdateButtonMouseClicked

    private void editButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editButtonMouseClicked
        // TODO add your handling code here:
        if (editEnabled) {

            saveUpdateButton.setToolTipText("Update Member Details");
            saveUpdateButton.setText("Update");
            saveUpdateButton.setEnabled(true);
            saveEnabled = true;

            int row = tableList.convertRowIndexToModel(tableList.getSelectedRow());
            sidePanelHeader.setText("Edit " + model.getValueAt(row, 2).toString() + "'s Details");

            deleteButton.setEnabled(false);
            deleteEnabled = false;

            //Enable Form Fields
            enableFields();

            blackFieldContent();
            //yESnO
        }
    }//GEN-LAST:event_editButtonMouseClicked

    private void saveLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveLabelMouseClicked
        // TODO add your handling code here:
        writeALLtoFile();
        JOptionPane.showMessageDialog(null, "Changes Saved", "Saved!", WIDTH, null);
    }//GEN-LAST:event_saveLabelMouseClicked

    private void saveLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveLabelMousePressed
        // TODO add your handling code here:
        saveLabel.setBackground(new java.awt.Color(242, 242, 242));
        saveLabel.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_saveLabelMousePressed

    private void saveLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveLabelMouseReleased
        // TODO add your handling code here:
        saveLabel.setBackground(new java.awt.Color(204,102,0));
        saveLabel.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_saveLabelMouseReleased

    private void aboutLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLabelMousePressed
        // TODO add your handling code here:
        aboutLabel.setBackground(new java.awt.Color(242, 242, 242));
        aboutLabel.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_aboutLabelMousePressed

    private void aboutLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLabelMouseReleased
        // TODO add your handling code here:
        aboutLabel.setBackground(new java.awt.Color(204,102,0));
        aboutLabel.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_aboutLabelMouseReleased

    private void excelLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excelLabelMousePressed
        // TODO add your handling code here:
        excelLabel.setBackground(new java.awt.Color(242, 242, 242));
        excelLabel.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_excelLabelMousePressed

    private void excelLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excelLabelMouseReleased
        // TODO add your handling code here:
        excelLabel.setBackground(new java.awt.Color(204,102,0));
        excelLabel.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_excelLabelMouseReleased

    private void addressValueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_addressValueItemStateChanged
        // TODO add your handling code here:

        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            Object addressITEM = evt.getItem();

            if (addressITEM.equals("On Campus")) {
                roomValue.setEnabled(true);
                roomValue.setEditable(true);
                addressStringChoise = "On Campus";
                roomValue.setText(tempAddress);
                wiped = false;

            } else if (addressITEM.equals("Bording house")) {
                roomValue.setEnabled(false);
                roomValue.setEditable(false);
                addressStringChoise = "Bording house";
                if (wiped == false) {
                    tempAddress = roomValue.getText();
                    roomValue.setText("");
                    wiped = true;
                }

            } else if (addressITEM.equals("Other")) {
                roomValue.setEnabled(false);
                roomValue.setEditable(false);
                addressStringChoise = "Other";
                if (wiped == false) {
                    tempAddress = roomValue.getText();
                    roomValue.setText("");
                    wiped = true;
                }
            }
        }//end BIG IF()
    }//GEN-LAST:event_addressValueItemStateChanged

    private void tableListMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_tableListMouseMoved

    private void titleValueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_titleValueItemStateChanged
        // TODO add your handling code here:

        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            Object titleITEM = evt.getItem();

            if (titleITEM.equals("Bro")) {
                titleStringChoise = "Bro";
            } else if (titleITEM.equals("Sis")) {
                titleStringChoise = "Sis";
            } else if (titleITEM.equals("Pastor")) {
                titleStringChoise = "Pastor";
            }

        }
    }//GEN-LAST:event_titleValueItemStateChanged

    private void yearValueItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_yearValueItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            Object yearITEM = evt.getItem();

            if (yearITEM.equals("1")) {
                yearIntChoise = 1;

            } else if (yearITEM.equals("2")) {
                yearIntChoise = 2;

            } else if (yearITEM.equals("3")) {
                yearIntChoise = 3;

            } else if (yearITEM.equals("4")) {
                yearIntChoise = 4;

            } else if (yearITEM.equals("5")) {
                yearIntChoise = 5;

            } else if (yearITEM.equals("6")) {
                yearIntChoise = 6;

            } else if (yearITEM.equals("7")) {
                yearIntChoise = 7;
            }

        }//end if
    }//GEN-LAST:event_yearValueItemStateChanged

    private void roleValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleValueActionPerformed

    private void newResetButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newResetButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_newResetButtonMouseEntered

    private void newResetButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newResetButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_newResetButtonMouseExited

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // TODO add your handling code here:
        search(searchField.getText());

        for (int x = 0; x < tableList.getRowCount(); x++) {
            model.setValueAt((x + 1), x, 0);
        }
    }//GEN-LAST:event_searchFieldKeyReleased

    private void excelLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excelLabelMouseClicked
        // TODO add your handling code here:
        Object u = JOptionPane.showConfirmDialog(null, "Produce Excel File on your Desktop?\nIf file already exists, it will be updated.");
        if (u.equals(1) || u.equals(2) || u.equals(-1)) {
            return;
        }
        writeToExcel();
        if (goOn) {
            JOptionPane.showMessageDialog(null, "Excel File Successfully\nCreated/Updated on your Desktop.", "Success!", WIDTH, null);
        }
    }//GEN-LAST:event_excelLabelMouseClicked

    private void searchJSeparatorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchJSeparatorMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_searchJSeparatorMouseEntered

    private void searchJSeparatorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchJSeparatorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_searchJSeparatorMouseExited

    private void aboutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLabelMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "LoveWorld Register\nv1.8.0.3\nThe LoverWorld Register - a free, "
                + "open source, Database Manager\nSolely dedicated for use by the \nBelievers' LoveWorld - CBU Campus Secretary General's Department\n"
                + "to manage the BLW Campus Ministry Membership.\n\n"
                + "Created by TechEmpire Inc.\n"
                + "Contact: techempire@gmail.com\n              : +260975-141014"
                + "", "About", WIDTH, null);
    }//GEN-LAST:event_aboutLabelMouseClicked

    private void tableListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableListKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if(key==127){
            if (deleteEnabled) {
                deleteRow();

                editButton.setEnabled(false);
                editEnabled = false;

            }
        }//end if
    }//GEN-LAST:event_tableListKeyPressed

    private void titleValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_titleValueKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if(key==10){
            saveUpdateButton();
        }
    }//GEN-LAST:event_titleValueKeyPressed

    private void firstNameValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameValueKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if(key==10){
            saveUpdateButton();
        }
    }//GEN-LAST:event_firstNameValueKeyPressed

    private void lastNameValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameValueKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if(key==10){
            saveUpdateButton();
        }
    }//GEN-LAST:event_lastNameValueKeyPressed

    private void emailValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailValueKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if(key==10){
            saveUpdateButton();
        }
    }//GEN-LAST:event_emailValueKeyPressed

    private void contactValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactValueKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if(key==10){
            saveUpdateButton();
        }
    }//GEN-LAST:event_contactValueKeyPressed

    private void cellValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cellValueKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if(key==10){
            saveUpdateButton();
        }
    }//GEN-LAST:event_cellValueKeyPressed

    private void roleValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roleValueKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if(key==10){
            saveUpdateButton();
        }
    }//GEN-LAST:event_roleValueKeyPressed

    private void addressValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressValueKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if(key==10){
            saveUpdateButton();
        }
    }//GEN-LAST:event_addressValueKeyPressed

    private void roomValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_roomValueKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if(key==10){
            saveUpdateButton();
        }
    }//GEN-LAST:event_roomValueKeyPressed

    private void programValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_programValueKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if(key==10){
            saveUpdateButton();
        }
    }//GEN-LAST:event_programValueKeyPressed

    private void yearValueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearValueKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyCode();
        
        if(key==10){
            saveUpdateButton();
        }
    }//GEN-LAST:event_yearValueKeyPressed

    
    
    
    /*********************************************END LISTENER*******************************************************/
   
    
    
  
    public void tableMouseClick(){
    
        //nEW
        int row = tableList.convertRowIndexToModel(tableList.getSelectedRow());

        //HEADER
        sidePanelHeader.setText(model.getValueAt(row, 2).toString() + "'s Details");

        //ID
        memberID.setText(model.getValueAt(row, 0).toString());

        //TITLE
        String title = (String) model.getValueAt(row, 1);
        if (title.equals("Bro")) {
            titleValue.setSelectedIndex(0);
        } else if (title.equals("Sis")) {
            titleValue.setSelectedIndex(1);
        } else if (title.equals("Pastor")) {
            titleValue.setSelectedIndex(2);
        }

        //ROLE
        roleValue.setText(model.getValueAt(row, 6).toString());

        //FIRST NAME
        firstNameValue.setText(model.getValueAt(row, 2).toString());

        //LAST NAME
        lastNameValue.setText(model.getValueAt(row, 3).toString());

        //EMAIL
        emailValue.setText(model.getValueAt(row, 5).toString());

        //CONTACT
        contactValue.setText(model.getValueAt(row, 4).toString());

        //CELL
        cellValue.setText(model.getValueAt(row, 7).toString());

        //ADDRESS
        String address = (String) model.getValueAt(row, 8);
        if (!address.equals("Bording house") && !address.equals("Other")) {
            addressValue.setSelectedIndex(0);
            roomValue.setText(model.getValueAt(row, 8).toString());
            roomValue.setEnabled(true);
            roomValue.setEditable(true);
        } else if (address.equals("Bording house")) {
            addressValue.setSelectedIndex(1);
            roomValue.setText("");
            roomValue.setEnabled(false);
            roomValue.setEditable(false);
        } else if (address.equals("Other")) {
            addressValue.setSelectedIndex(2);
            roomValue.setText("");
            roomValue.setEnabled(false);
            roomValue.setEditable(false);
        }

        //PROGRAM
        programValue.setText(model.getValueAt(row, 9).toString());

        //YEAR
        String year = ""+ model.getValueAt(row, 10);
        if (year.equals("1")) {
            yearValue.setSelectedIndex(0);
        } else if (year.equals("2")) {
            yearValue.setSelectedIndex(1);
        } else if (year.equals("3")) {
            yearValue.setSelectedIndex(2);
        } else if (year.equals("4")) {
            yearValue.setSelectedIndex(3);
        } else if (year.equals("5")) {
            yearValue.setSelectedIndex(4);
        } else if (year.equals("6")) {
            yearValue.setSelectedIndex(5);
        } else if (year.equals("7")) {
            yearValue.setSelectedIndex(6);
        } else {
            saveUpdateButton.setText("Save");
        }
        saveUpdateButton.setEnabled(false);
        saveEnabled = false;

        newResetButton.setText("New");
        newResetButton.setToolTipText("Add New Member");

        deleteButton.setEnabled(true);
        deleteEnabled = true;

        editButton.setEnabled(true);
        editEnabled = true;

        //Disable Form Fields
        faddedFieldContent();
        disableFields();
        
    }//end tableMouseClick()
    
    
   public void saveUpdateButton(){
   
        if (saveUpdateButton.getText().equals("Save") && saveEnabled) {      /*WHEN SAVING NEW*/

            //myCoDe
            testIfAlreadyExists();

            if (memberExists) {
                Object u = JOptionPane.showConfirmDialog(null, "'" + titleStringChoise + " " + firstNameValue.getText() + "' Already Exists!\n  Save Anyway?");
                if (u.equals(1) || u.equals(2) || u.equals(-1)) {
                    return;
                }
            }

            if (saveEnabled == false) {
                return;
            }

            goAheadSave = true;

            testFieldsBeforeAdd();

            if (goAheadSave == false) {
                return;
            }

            AddNewMemberViaSaveButton();

            deleteButton.setEnabled(false);
            deleteEnabled = false;

            sidePanelHeader.setText("LoveWorld Register");;

            editButton.setEnabled(false);
            editEnabled = false;
            //myCoDe

            newResetButton.setText("New");
            newResetButton.setToolTipText("Add New Member");

            String tempName = firstNameValue.getText();
            String tempTitle = titleStringChoise;

            //Reset Fields
            resetFields();
            memberID.setText("-");
            //Disable
            faddedFieldContent();
            disableFields();

            JOptionPane.showMessageDialog(null, "'" + tempTitle + " " + tempName + "' has been Added Successfully.", "Saved Successfully!", WIDTH, null);
            
            titleStringChoise = "Bro";
            addressStringChoise = "On Campus";
            yearIntChoise = 0;
            yearIntChoise = 1;

        } else if (saveUpdateButton.getText().equals("Update") && saveEnabled) {      /*WHEN UPDATING*/

            goAheadSave = true;
            testFieldsBeforeAdd();

            if (goAheadSave == false) {
                return;
            }

            noUpdateChange = false;

            updateMemberViaUpdateButton();

            if (noUpdateChange) {
                return;
            }

            deleteButton.setEnabled(false);
            deleteEnabled = false;

            sidePanelHeader.setText("LoveWorld Register");

            editButton.setEnabled(false);
            editEnabled = false;

            //sO cOLd
            saveUpdateButton.setText("Save");
            saveUpdateButton.setToolTipText("Save New Member");

            String tempName = firstNameValue.getText();
            String tempTitle = titleStringChoise;

            //Reset Fields
            resetFields();

            //Disable
            faddedFieldContent();
            disableFields();

            JOptionPane.showMessageDialog(null, "'" + tempTitle + " " + tempName + "' has been Successfully Updated.", "Update Successfull!", WIDTH, null);

            titleStringChoise = "Bro";
            addressStringChoise = "On Campus";
            yearIntChoise = 1;

        }
        saveUpdateButton.setEnabled(false);
        saveEnabled = false;
   
   }//end saveUpdateButton() 
   
    
   
   
    public void deleteRow() {

        int row = tableList.convertRowIndexToModel(tableList.getSelectedRow());

        Object u = JOptionPane.showConfirmDialog(null, "Are you sure you want to Delete '" + model.getValueAt(row, 1) + " " + model.getValueAt(row, 2) + "'?");
        if (u.equals(1) || u.equals(2) || u.equals(-1)) {
            return;
        }

        if (row >= 0) {
            Object tempName = model.getValueAt(row, 2);
            Object tempTitle = model.getValueAt(row, 1);
            model.removeRow(row);

            for (int x = 0; x < tableList.getRowCount(); x++) {
                model.setValueAt((x + 1), x, 0);
            }

            if ((int) model.getRowCount() == 0) {
                PrintWriter writer = null;
                try {
                    writer = new PrintWriter("BLW_Registry.txt"); //this guy clears the contents of the file
                    writer.print("");   //then just print an empty string into the file
                    writer.close(); //close the writter

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(homeBLW.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    writer.close();
                }
            }//end if()

            writeALLtoFile();

            resetFields();
            faddedFieldContent();
            disableFields();

            memberID.setText("-");
            sidePanelHeader.setText("LoveWorld Register");

            deleteButton.setEnabled(false);
            deleteEnabled = false;
            JOptionPane.showMessageDialog(null, "'" + tempTitle + " " + tempName + "' has been Deleted", "Deleted!", WIDTH, null);

        }
    }//end deleteRow()

    
    public void writeToExcel() {

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet ws = wb.createSheet();
        XSSFRow row = null;
        
        //load data 
        TreeMap<Object, Object[]> data = new TreeMap<>();

        //Columns
        data.put(0, new Object[]{model.getColumnName(0), model.getColumnName(1), model.getColumnName(2), model.getColumnName(3), model.getColumnName(4), model.getColumnName(5), model.getColumnName(6), model.getColumnName(7), model.getColumnName(8), model.getColumnName(9), model.getColumnName(10)});

        //getting cell values
        for (int x = 0; x < model.getRowCount(); x++) {
            int num = x;
            data.put((num + 1), new Object[]{getCellValue(x, 0), getCellValue(x, 1), getCellValue(x, 2), getCellValue(x, 3), getCellValue(x, 4), getCellValue(x, 5), getCellValue(x, 6), getCellValue(x, 7), getCellValue(x, 8), getCellValue(x, 9), getCellValue(x, 10)});
        }//end for()

        //Write to sheet
        Set<Object> ids = data.keySet();

        int rowID = 0;

        //loop through data to create rows
        int ides = 0;
        boolean firstRun = true;
        for (Object key : ids) {
            row = ws.createRow(rowID++);

            //Get data using IDs
            Object[] values = data.get(key);

            //loop and print cell content for currently created row 
            int cellID = 0;
            int xyz = 0;
            for (Object o : values) {
                XSSFCell cell = row.createCell(cellID++);
                if (xyz == 0) {
                    if (firstRun && (o.toString().equals("ID."))) {
                        cell.setCellValue(o.toString().toUpperCase());

                        //style headers
                        CellStyle style = wb.createCellStyle();
                        XSSFFont font = wb.createFont();
                        font.setBold(true);
                        font.setFontName(HSSFFont.FONT_ARIAL);
                        font.setFontHeightInPoints((short) 10.5);
                        style.setFont(font);
                        style.setAlignment(HorizontalAlignment.CENTER);
                        row.getCell(xyz).setCellStyle(style);

                    } else {
                        cell.setCellValue(ides);
                    }
                } else if (xyz == 10) {
                    if (o.toString().contains("1")) {
                        cell.setCellValue(1);
                    } else if (o.toString().contains("2")) {
                        cell.setCellValue(2);
                    } else if (o.toString().contains("3")) {
                        cell.setCellValue(3);
                    } else if (o.toString().contains("4")) {
                        cell.setCellValue(4);
                    } else if (o.toString().contains("5")) {
                        cell.setCellValue(5);
                    } else if (o.toString().contains("6")) {
                        cell.setCellValue(6);
                    } else if (o.toString().contains("7")) {
                        cell.setCellValue(7);
                    } else if (firstRun && (o.toString().equals("Year"))) {
                        cell.setCellValue(o.toString().toUpperCase());

                        //style headers
                        CellStyle style = wb.createCellStyle();
                        XSSFFont font = wb.createFont();
                        font.setBold(true);
                        font.setFontName(HSSFFont.FONT_ARIAL);
                        font.setFontHeightInPoints((short) 10.5);
                        style.setFont(font);
                        style.setAlignment(HorizontalAlignment.CENTER);
                        row.getCell(xyz).setCellStyle(style);
                    }
                } else {
                    if (firstRun && (o.toString().equals("ID.") || o.toString().equals("Year") || o.toString().equals("First Name") || o.toString().equals("Last Name") || o.toString().equals("Contact") || o.toString().equals("Email") || o.toString().equals("Role") || o.toString().equals("Cell") || o.toString().equals("Address") || o.toString().equals("Program") || o.toString().equals("Year") || o.toString().equals("Title"))) {
                        cell.setCellValue(o.toString().toUpperCase());

                        //style headers
                        CellStyle style = wb.createCellStyle();
                        XSSFFont font = wb.createFont();
                        font.setBold(true);
                        font.setFontName(HSSFFont.FONT_ARIAL);
                        font.setFontHeightInPoints((short) 10.5);
                        style.setFont(font);
                        style.setAlignment(HorizontalAlignment.CENTER);
                        row.getCell(xyz).setCellStyle(style);

                    } else {
                        cell.setCellValue(o.toString());
                    }
                }
                xyz++;

            }//end inner for()

            firstRun = false;
            ides++;
        }//end outer for()

        //auto resize columns
        for (int x = 0; x < 10; x++) {
            ws.autoSizeColumn(x);
        }

        //Wtring to excel file
        try {

            FileOutputStream fos = new FileOutputStream(new File(System.getProperty("user.home")+"/Desktop/BLW_Registry.xlsx"));
            FileReader fr = new FileReader(System.getProperty("user.home")+"/Desktop/BLW_Registry.xlsx");  //check if ContactList exits,

            //this guy clears the contents of the file
            PrintWriter writer = new PrintWriter(System.getProperty("user.home")+"/Desktop/BLW_Registry.xlsx");
            writer.print("");   //then just print an empty string into the file
            writer.close();
            

            //this one writes content to the file
            wb.write(fos);
            fos.close();

            goOn = true;

        } catch (FileNotFoundException efile) {
            System.out.println("File Not Found!");
            JOptionPane.showMessageDialog(null, "Please Close the Excel\n\n'BLW_Registry.xlsx' file", "Alert!", WIDTH, null);
            goOn = false;

        } catch (IOException eIO) {
            System.out.println("I.O Exception!!");
            JOptionPane.showMessageDialog(null, "An Excel file COULD NOT be created\n\nPlease check if Excel.exe was correcly installed", "Alert!", WIDTH, null);
            goOn = false;
        }

    }//end writeToExcel()

    public String getCellValue(int x, int y) {
        return model.getValueAt(x, y).toString();
    }

    public void removeTableRows() {

        int rows = (int) model.getRowCount();
        for (int x = 0; x < rows; x++) {
            if (rows >= 0) {
                model.removeRow(0);
            }
        }

    }//removeTableRows()

    /*SEARCHING*/
    public void search(String item) {
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tableList.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter("(?i)" + item));

        //SOETING out THE table IN the BACKGROUNG
    }//end search()

    public void readFromFile() {

        try {
            FileWriter fw = new FileWriter("BLW_Registry.txt", true); //creates ContactList file
            FileReader fr = new FileReader("BLW_Registry.txt");  //check if ContactList exits,
            BufferedReader br = new BufferedReader(fr); //then read from it
            String readLineFromFile = "";   //a string il use to read read line by line
            int xy = 1;

            while ((readLineFromFile = br.readLine()) != null) {
                if (readLineFromFile.isEmpty()) {
                    countFileLines = 0;
                    break;
                }

                String splitFileLineArray[] = readLineFromFile.split("0jDsLkInG1");

                //Sorting file content
                if (splitFileLineArray[1].equals("emptyFname")) {
                    splitFileLineArray[1] = "";
                }

                if (splitFileLineArray[2].equals("emptyLname")) {
                    splitFileLineArray[2] = "";
                }

                if (splitFileLineArray[3].equals("emptyContact")) {
                    splitFileLineArray[3] = "";
                }

                if (splitFileLineArray[4].equals("emptyEmail")) {
                    splitFileLineArray[4] = "";
                }

                if (splitFileLineArray[5].equals("emptyRole")) {
                    splitFileLineArray[5] = "";
                }

                if (splitFileLineArray[6].equals("emptyCell")) {
                    splitFileLineArray[6] = "";
                }

                if (splitFileLineArray[7].equals("emptyRoom")) {
                    splitFileLineArray[7] = "";
                }

                if (splitFileLineArray[8].equals("emptyProgram")) {
                    splitFileLineArray[8] = "";
                }

                model = (DefaultTableModel) tableList.getModel();
                model.addRow(new Object[]{xy, splitFileLineArray[0], splitFileLineArray[1], splitFileLineArray[2], splitFileLineArray[3], splitFileLineArray[4], splitFileLineArray[5], splitFileLineArray[6], splitFileLineArray[7], splitFileLineArray[8], splitFileLineArray[9]});
                xy++;
                countFileLines++;
            }//end while

            fw.close();
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found");
            JOptionPane.showMessageDialog(null, "No Content to Display.", "Alert!", WIDTH, null);

        } catch (IOException ex) {
            System.out.println("IOException");
            JOptionPane.showMessageDialog(null, "Unable to Save Changes.", "Alert!", WIDTH, null);
        }

    }//end readFromFile()

    public void writeALLtoFile() {
        int countTablerows = 0;
        if ((int) model.getRowCount() > 0) {
            countTablerows = (int) model.getRowCount();

            try {   //Wrapper try
                FileWriter fw = new FileWriter("BLW_Registry.txt", true); //creates ContactList file
                BufferedWriter bw = new BufferedWriter(fw); //writes on the file
                //Watch and Learn
                PrintWriter writer = new PrintWriter("BLW_Registry.txt"); //this guy clears the contents of the file
                writer.print("");   //then just print an empty string into the file
                writer.close(); //close the writter

                for (int y = 0; y < countTablerows; y++) {

                    String title = model.getValueAt(y, 1).toString();
                    String fname = model.getValueAt(y, 2).toString();
                    String lname = model.getValueAt(y, 3).toString();
                    String contact = model.getValueAt(y, 4).toString();
                    String email = model.getValueAt(y, 5).toString();
                    String role = model.getValueAt(y, 6).toString();
                    String cell = model.getValueAt(y, 7).toString();
                    String room = model.getValueAt(y, 8).toString();
                    String program = model.getValueAt(y, 9).toString();
                    String year = model.getValueAt(y, 10).toString();

                    //testing for content existance
                    if (fname == null || fname.isEmpty() || fname.equals("")) {
                        fname = "emptyFname";
                    }

                    if (lname == null || lname.isEmpty() || lname.equals("")) {
                        lname = "emptyLname";
                    }

                    if (contact == null || contact.isEmpty() || contact.equals("")) {
                        contact = "emptyContact";
                    }

                    if (email == null || email.isEmpty() || email.equals("")) {
                        email = "emptyEmail";
                    }

                    if (role == null || role.isEmpty() || role.equals("")) {
                        role = "emptyRole";
                    }

                    if (cell == null || cell.isEmpty() || cell.equals("")) {
                        cell = "emptyCell";
                    }

                    if (addressStringChoise.equals("")) {
                        room = "emptyRoom";
                    }

                    if (program == null || program.isEmpty() || program.equals("")) {
                        program = "emptyProgram";
                    }

                    String allFields = title + "0jDsLkInG1" + fname + "0jDsLkInG1" + lname + "0jDsLkInG1" + contact + "0jDsLkInG1" + email + "0jDsLkInG1" + role + "0jDsLkInG1" + cell + "0jDsLkInG1" + room + "0jDsLkInG1" + program + "0jDsLkInG1" + year;

                    bw.write(allFields + "\n");    //writing to the file

                }//end for()

                bw.close(); //close the writter
                fw.close(); //close the created file
            } catch (IOException ex) {
                System.out.println("File Not Found");
                JOptionPane.showMessageDialog(null, "Unable to Save Changes.", "Alert!", WIDTH, null);
            }//end Wrapper tryCatch

        }//end IF()

    }//end writeALLtoFile()

    public void AddNewMemberViaSaveButton() {

        if (addressStringChoise.equals("On Campus")) {
            addressStringChoise = roomValue.getText();
        }

        //mE
        int tabelCount = 0;
        if (countFileLines == 0) {
            tabelCount = 1;
        } else if (countFileLines > 0) {

            try {
                FileReader fr = new FileReader("BLW_Registry.txt");  //check if ContactList exits,
                BufferedReader br = new BufferedReader(fr); //then read from it
                String readLineFromFile = "";   //a string il use to read read line by line

                countFileLines = 0;
                while ((readLineFromFile = br.readLine()) != null) {
                    countFileLines++;
                }

            } catch (FileNotFoundException ex) {
                System.out.println("File Not Found");
                JOptionPane.showMessageDialog(null, "Unable to Save Changes.", "Alert!", WIDTH, null);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Unable to Save Changes.", "Alert!", WIDTH, null);
            }
            //yOu

            tabelCount = countFileLines + 1;
        }//end elseif()

        //PrOpEr CaSinG
        letterCasing(firstNameValue.getText(), lastNameValue.getText(), roleValue.getText(), cellValue.getText());

        model = (DefaultTableModel) tableList.getModel();
        model.addRow(new Object[]{tabelCount, titleStringChoise, firstNameValue.getText(), lastNameValue.getText(), contactValue.getText(), emailValue.getText(), roleValue.getText(), cellValue.getText(), addressStringChoise, programValue.getText(), yearIntChoise+""});

            for (int x = 0; x < tableList.getRowCount(); x++) {
                model.setValueAt((x + 1), x, 0);
            }
        
        writeALLtoFile();

    }//end AddViaSaveButton()

    public void updateMemberViaUpdateButton() {

        if (addressStringChoise.equals("On Campus")) {
            addressStringChoise = roomValue.getText();
        }

        int row = tableList.convertRowIndexToModel(tableList.getSelectedRow());
        model = (DefaultTableModel) tableList.getModel();

        if (titleStringChoise.equalsIgnoreCase((String) model.getValueAt(row, 1)) && firstNameValue.getText().equalsIgnoreCase((String) model.getValueAt(row, 2)) && lastNameValue.getText().equalsIgnoreCase((String) model.getValueAt(row, 3)) && contactValue.getText().equalsIgnoreCase((String) model.getValueAt(row, 4)) && emailValue.getText().equalsIgnoreCase((String) model.getValueAt(row, 5)) && roleValue.getText().equalsIgnoreCase((String) model.getValueAt(row, 6)) && cellValue.getText().equalsIgnoreCase((String) model.getValueAt(row, 7)) && addressStringChoise.equalsIgnoreCase((String) model.getValueAt(row, 8)) && programValue.getText().equalsIgnoreCase((String) model.getValueAt(row, 9)) && (yearIntChoise+"").equalsIgnoreCase((String)model.getValueAt(row, 10))) {
            noUpdateChange = true;
            JOptionPane.showMessageDialog(null, "No Changes Made.", "Alert!", WIDTH, null);
            return;
        }

        //PrOpEr CaSinG
        letterCasing(firstNameValue.getText(), lastNameValue.getText(), roleValue.getText(), cellValue.getText());

        model.setValueAt(titleStringChoise, row, 1);
        model.setValueAt(firstNameValue.getText(), row, 2);
        model.setValueAt(lastNameValue.getText(), row, 3);
        model.setValueAt(contactValue.getText(), row, 4);
        model.setValueAt(emailValue.getText(), row, 5);
        model.setValueAt(roleValue.getText(), row, 6);
        model.setValueAt(cellValue.getText(), row, 7);
        model.setValueAt(addressStringChoise, row, 8);
        model.setValueAt(programValue.getText(), row, 9);
        model.setValueAt(yearIntChoise, row, 10);

        writeALLtoFile();

    }//end updateMemberViaUpdateButton()

    public void testFieldsBeforeAdd() {

        if (firstNameValue.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter 'First Name'", "Alert!", WIDTH, null);
            goAheadSave = false;
            return;
        }

        if ((!firstNameValue.getText().contains("a") && !firstNameValue.getText().contains("b") && !firstNameValue.getText().contains("c") && !firstNameValue.getText().contains("d") && !firstNameValue.getText().contains("e") && !firstNameValue.getText().contains("f") && !firstNameValue.getText().contains("g") && !firstNameValue.getText().contains("h") && !firstNameValue.getText().contains("i") && !firstNameValue.getText().contains("j") && !firstNameValue.getText().contains("k") && !firstNameValue.getText().contains("l") && !firstNameValue.getText().contains("m") && !firstNameValue.getText().contains("n") && !firstNameValue.getText().contains("o") && !firstNameValue.getText().contains("p") && !firstNameValue.getText().contains("q") && !firstNameValue.getText().contains("r") && !firstNameValue.getText().contains("s") && !firstNameValue.getText().contains("t") && !firstNameValue.getText().contains("u") && !firstNameValue.getText().contains("v") && !firstNameValue.getText().contains("w") && !firstNameValue.getText().contains("x") && !firstNameValue.getText().contains("y") && !firstNameValue.getText().contains("z") && !firstNameValue.getText().contains("A") && !firstNameValue.getText().contains("B") && !firstNameValue.getText().contains("C") && !firstNameValue.getText().contains("D") && !firstNameValue.getText().contains("E") && !firstNameValue.getText().contains("F") && !firstNameValue.getText().contains("G") && !firstNameValue.getText().contains("H") && !firstNameValue.getText().contains("I") && !firstNameValue.getText().contains("J") && !firstNameValue.getText().contains("K") && !firstNameValue.getText().contains("L") && !firstNameValue.getText().contains("M") && !firstNameValue.getText().contains("N") && !firstNameValue.getText().contains("O") && !firstNameValue.getText().contains("P") && !firstNameValue.getText().contains("Q") && !firstNameValue.getText().contains("R") && !firstNameValue.getText().contains("S") && !firstNameValue.getText().contains("T") && !firstNameValue.getText().contains("U") && !firstNameValue.getText().contains("V") && !firstNameValue.getText().contains("W") && !firstNameValue.getText().contains("X") && !firstNameValue.getText().contains("Y") && !firstNameValue.getText().contains("Z"))) {
            JOptionPane.showMessageDialog(null, "Please Enter 'First Name'", "Alert!", WIDTH, null);
            goAheadSave = false;
            return;
        }

        if (lastNameValue.getText().isEmpty() || (!lastNameValue.getText().isEmpty() && (!lastNameValue.getText().contains("a") && !lastNameValue.getText().contains("b") && !lastNameValue.getText().contains("c") && !lastNameValue.getText().contains("d") && !lastNameValue.getText().contains("e") && !lastNameValue.getText().contains("f") && !lastNameValue.getText().contains("g") && !lastNameValue.getText().contains("h") && !lastNameValue.getText().contains("i") && !lastNameValue.getText().contains("j") && !lastNameValue.getText().contains("k") && !lastNameValue.getText().contains("l") && !lastNameValue.getText().contains("m") && !lastNameValue.getText().contains("n") && !lastNameValue.getText().contains("o") && !lastNameValue.getText().contains("p") && !lastNameValue.getText().contains("q") && !lastNameValue.getText().contains("r") && !lastNameValue.getText().contains("s") && !lastNameValue.getText().contains("t") && !lastNameValue.getText().contains("u") && !lastNameValue.getText().contains("v") && !lastNameValue.getText().contains("w") && !lastNameValue.getText().contains("x") && !lastNameValue.getText().contains("y") && !lastNameValue.getText().contains("z") && !lastNameValue.getText().contains("A") && !lastNameValue.getText().contains("B") && !lastNameValue.getText().contains("C") && !lastNameValue.getText().contains("D") && !lastNameValue.getText().contains("E") && !lastNameValue.getText().contains("F") && !lastNameValue.getText().contains("G") && !lastNameValue.getText().contains("H") && !lastNameValue.getText().contains("I") && !lastNameValue.getText().contains("J") && !lastNameValue.getText().contains("K") && !lastNameValue.getText().contains("L") && !lastNameValue.getText().contains("M") && !lastNameValue.getText().contains("N") && !lastNameValue.getText().contains("O") && !lastNameValue.getText().contains("P") && !lastNameValue.getText().contains("Q") && !lastNameValue.getText().contains("R") && !lastNameValue.getText().contains("S") && !lastNameValue.getText().contains("T") && !lastNameValue.getText().contains("U") && !lastNameValue.getText().contains("V") && !lastNameValue.getText().contains("W") && !lastNameValue.getText().contains("X") && !lastNameValue.getText().contains("Y") && !lastNameValue.getText().contains("Z")))) {
            JOptionPane.showMessageDialog(null, "Please Enter 'Last Name'", "Alert!", WIDTH, null);
            goAheadSave = false;
            return;
        }

        if (!emailValue.getText().isEmpty() && !emailValue.getText().contains("@")) {
            JOptionPane.showMessageDialog(null, "Please Enter Correct 'Email Address'", "Alert!", WIDTH, null);
            goAheadSave = false;
            return;
        }

        if ((!emailValue.getText().isEmpty() && (!emailValue.getText().contains("a") && !emailValue.getText().contains("b") && !emailValue.getText().contains("c") && !emailValue.getText().contains("d") && !emailValue.getText().contains("e") && !emailValue.getText().contains("f") && !emailValue.getText().contains("g") && !emailValue.getText().contains("h") && !emailValue.getText().contains("i") && !emailValue.getText().contains("j") && !emailValue.getText().contains("k") && !emailValue.getText().contains("l") && !emailValue.getText().contains("m") && !emailValue.getText().contains("n") && !emailValue.getText().contains("o") && !emailValue.getText().contains("p") && !emailValue.getText().contains("q") && !emailValue.getText().contains("r") && !emailValue.getText().contains("s") && !emailValue.getText().contains("t") && !emailValue.getText().contains("u") && !emailValue.getText().contains("v") && !emailValue.getText().contains("w") && !emailValue.getText().contains("x") && !emailValue.getText().contains("y") && !emailValue.getText().contains("z") && !emailValue.getText().contains("A") && !emailValue.getText().contains("B") && !emailValue.getText().contains("C") && !emailValue.getText().contains("D") && !emailValue.getText().contains("E") && !emailValue.getText().contains("F") && !emailValue.getText().contains("G") && !emailValue.getText().contains("H") && !emailValue.getText().contains("I") && !emailValue.getText().contains("J") && !emailValue.getText().contains("K") && !emailValue.getText().contains("L") && !emailValue.getText().contains("M") && !emailValue.getText().contains("N") && !emailValue.getText().contains("O") && !emailValue.getText().contains("P") && !emailValue.getText().contains("Q") && !emailValue.getText().contains("R") && !emailValue.getText().contains("S") && !emailValue.getText().contains("T") && !emailValue.getText().contains("U") && !emailValue.getText().contains("V") && !emailValue.getText().contains("W") && !emailValue.getText().contains("X") && !emailValue.getText().contains("Y") && !emailValue.getText().contains("Z")))) {
            JOptionPane.showMessageDialog(null, "Please Enter Correct 'Email Address'", "Alert!", WIDTH, null);
            goAheadSave = false;
            return;
        }

        if ((!contactValue.getText().isEmpty()) && (contactValue.getText().contains("a") || contactValue.getText().contains("b") || contactValue.getText().contains("c") || contactValue.getText().contains("d") || contactValue.getText().contains("e") || contactValue.getText().contains("f") || contactValue.getText().contains("g") || contactValue.getText().contains("h") || contactValue.getText().contains("i") || contactValue.getText().contains("j") || contactValue.getText().contains("k") || contactValue.getText().contains("l") || contactValue.getText().contains("m") || contactValue.getText().contains("n") || contactValue.getText().contains("o") || contactValue.getText().contains("p") || contactValue.getText().contains("q") || contactValue.getText().contains("r") || contactValue.getText().contains("s") || contactValue.getText().contains("t") || contactValue.getText().contains("u") || contactValue.getText().contains("v") || contactValue.getText().contains("w") || contactValue.getText().contains("x") || contactValue.getText().contains("y") || contactValue.getText().contains("z") || contactValue.getText().contains("A") || contactValue.getText().contains("B") || contactValue.getText().contains("C") || contactValue.getText().contains("D") || contactValue.getText().contains("E") || contactValue.getText().contains("F") || contactValue.getText().contains("G") || contactValue.getText().contains("H") || contactValue.getText().contains("I") || contactValue.getText().contains("J") || contactValue.getText().contains("K") || contactValue.getText().contains("L") || contactValue.getText().contains("M") || contactValue.getText().contains("N") || contactValue.getText().contains("O") || contactValue.getText().contains("P") || contactValue.getText().contains("Q") || contactValue.getText().contains("R") || contactValue.getText().contains("S") || contactValue.getText().contains("T") || contactValue.getText().contains("U") || contactValue.getText().contains("V") || contactValue.getText().contains("W") || contactValue.getText().contains("X") || contactValue.getText().contains("Y") || contactValue.getText().contains("Z"))) {
            JOptionPane.showMessageDialog(null, "Please Enter Correct 'Phone Number'", "Alert!", WIDTH, null);
            goAheadSave = false;
            return;
        }

        if ((!contactValue.getText().isEmpty()) && (!contactValue.getText().contains("0") && !contactValue.getText().contains("1") && !contactValue.getText().contains("2") && !contactValue.getText().contains("3") && !contactValue.getText().contains("4") && !contactValue.getText().contains("5") && !contactValue.getText().contains("6") && !contactValue.getText().contains("7") && !contactValue.getText().contains("8") && !contactValue.getText().contains("9"))) {
            JOptionPane.showMessageDialog(null, "Please Enter Correct 'Phone Number'", "Alert!", WIDTH, null);
            goAheadSave = false;
            return;
        }

        if ((!cellValue.getText().isEmpty() && (!cellValue.getText().contains("a") && !cellValue.getText().contains("b") && !cellValue.getText().contains("c") && !cellValue.getText().contains("d") && !cellValue.getText().contains("e") && !cellValue.getText().contains("f") && !cellValue.getText().contains("g") && !cellValue.getText().contains("h") && !cellValue.getText().contains("i") && !cellValue.getText().contains("j") && !cellValue.getText().contains("k") && !cellValue.getText().contains("l") && !cellValue.getText().contains("m") && !cellValue.getText().contains("n") && !cellValue.getText().contains("o") && !cellValue.getText().contains("p") && !cellValue.getText().contains("q") && !cellValue.getText().contains("r") && !cellValue.getText().contains("s") && !cellValue.getText().contains("t") && !cellValue.getText().contains("u") && !cellValue.getText().contains("v") && !cellValue.getText().contains("w") && !cellValue.getText().contains("x") && !cellValue.getText().contains("y") && !cellValue.getText().contains("z") && !cellValue.getText().contains("A") && !cellValue.getText().contains("B") && !cellValue.getText().contains("C") && !cellValue.getText().contains("D") && !cellValue.getText().contains("E") && !cellValue.getText().contains("F") && !cellValue.getText().contains("G") && !cellValue.getText().contains("H") && !cellValue.getText().contains("I") && !cellValue.getText().contains("J") && !cellValue.getText().contains("K") && !cellValue.getText().contains("L") && !cellValue.getText().contains("M") && !cellValue.getText().contains("N") && !cellValue.getText().contains("O") && !cellValue.getText().contains("P") && !cellValue.getText().contains("Q") && !cellValue.getText().contains("R") && !cellValue.getText().contains("S") && !cellValue.getText().contains("T") && !cellValue.getText().contains("U") && !cellValue.getText().contains("V") && !cellValue.getText().contains("W") && !cellValue.getText().contains("X") && !cellValue.getText().contains("Y") && !cellValue.getText().contains("Z")))) {
            JOptionPane.showMessageDialog(null, "Please Enter Correct 'Cell Name'", "Alert!", WIDTH, null);
            goAheadSave = false;
            return;
        }

        if ((!roleValue.getText().isEmpty() && (!roleValue.getText().contains("a") && !roleValue.getText().contains("b") && !roleValue.getText().contains("c") && !roleValue.getText().contains("d") && !roleValue.getText().contains("e") && !roleValue.getText().contains("f") && !roleValue.getText().contains("g") && !roleValue.getText().contains("h") && !roleValue.getText().contains("i") && !roleValue.getText().contains("j") && !roleValue.getText().contains("k") && !roleValue.getText().contains("l") && !roleValue.getText().contains("m") && !roleValue.getText().contains("n") && !roleValue.getText().contains("o") && !roleValue.getText().contains("p") && !roleValue.getText().contains("q") && !roleValue.getText().contains("r") && !roleValue.getText().contains("s") && !roleValue.getText().contains("t") && !roleValue.getText().contains("u") && !roleValue.getText().contains("v") && !roleValue.getText().contains("w") && !roleValue.getText().contains("x") && !roleValue.getText().contains("y") && !roleValue.getText().contains("z") && !roleValue.getText().contains("A") && !roleValue.getText().contains("B") && !roleValue.getText().contains("C") && !roleValue.getText().contains("D") && !roleValue.getText().contains("E") && !roleValue.getText().contains("F") && !roleValue.getText().contains("G") && !roleValue.getText().contains("H") && !roleValue.getText().contains("I") && !roleValue.getText().contains("J") && !roleValue.getText().contains("K") && !roleValue.getText().contains("L") && !roleValue.getText().contains("M") && !roleValue.getText().contains("N") && !roleValue.getText().contains("O") && !roleValue.getText().contains("P") && !roleValue.getText().contains("Q") && !roleValue.getText().contains("R") && !roleValue.getText().contains("S") && !roleValue.getText().contains("T") && !roleValue.getText().contains("U") && !roleValue.getText().contains("V") && !roleValue.getText().contains("W") && !roleValue.getText().contains("X") && !roleValue.getText().contains("Y") && !roleValue.getText().contains("Z")))) {
            JOptionPane.showMessageDialog(null, "Please Enter Correct 'Role'", "Alert!", WIDTH, null);
            goAheadSave = false;
            return;
        }

        if (addressStringChoise.equals("On Campus")) {
            if ((!roomValue.getText().isEmpty() && (!roomValue.getText().contains("a") && !roomValue.getText().contains("b") && !roomValue.getText().contains("c") && !roomValue.getText().contains("d") && !roomValue.getText().contains("e") && !roomValue.getText().contains("f") && !roomValue.getText().contains("g") && !roomValue.getText().contains("h") && !roomValue.getText().contains("i") && !roomValue.getText().contains("j") && !roomValue.getText().contains("k") && !roomValue.getText().contains("l") && !roomValue.getText().contains("m") && !roomValue.getText().contains("n") && !roomValue.getText().contains("o") && !roomValue.getText().contains("p") && !roomValue.getText().contains("q") && !roomValue.getText().contains("r") && !roomValue.getText().contains("s") && !roomValue.getText().contains("t") && !roomValue.getText().contains("u") && !roomValue.getText().contains("v") && !roomValue.getText().contains("w") && !roomValue.getText().contains("x") && !roomValue.getText().contains("y") && !roomValue.getText().contains("z") && !roomValue.getText().contains("A") && !roomValue.getText().contains("B") && !roomValue.getText().contains("C") && !roomValue.getText().contains("D") && !roomValue.getText().contains("E") && !roomValue.getText().contains("F") && !roomValue.getText().contains("G") && !roomValue.getText().contains("H") && !roomValue.getText().contains("I") && !roomValue.getText().contains("J") && !roomValue.getText().contains("K") && !roomValue.getText().contains("L") && !roomValue.getText().contains("M") && !roomValue.getText().contains("N") && !roomValue.getText().contains("O") && !roomValue.getText().contains("P") && !roomValue.getText().contains("Q") && !roomValue.getText().contains("R") && !roomValue.getText().contains("S") && !roomValue.getText().contains("T") && !roomValue.getText().contains("U") && !roomValue.getText().contains("V") && !roomValue.getText().contains("W") && !roomValue.getText().contains("X") && !roomValue.getText().contains("Y") && !roomValue.getText().contains("Z")))) {
                JOptionPane.showMessageDialog(null, "Please Enter Correct 'Room Number'", "Alert!", WIDTH, null);
                goAheadSave = false;
                return;
            }
        }

        if ((!programValue.getText().isEmpty() && (!programValue.getText().contains("a") && !programValue.getText().contains("b") && !programValue.getText().contains("c") && !programValue.getText().contains("d") && !programValue.getText().contains("e") && !programValue.getText().contains("f") && !programValue.getText().contains("g") && !programValue.getText().contains("h") && !programValue.getText().contains("i") && !programValue.getText().contains("j") && !programValue.getText().contains("k") && !programValue.getText().contains("l") && !programValue.getText().contains("m") && !programValue.getText().contains("n") && !programValue.getText().contains("o") && !programValue.getText().contains("p") && !programValue.getText().contains("q") && !programValue.getText().contains("r") && !programValue.getText().contains("s") && !programValue.getText().contains("t") && !programValue.getText().contains("u") && !programValue.getText().contains("v") && !programValue.getText().contains("w") && !programValue.getText().contains("x") && !programValue.getText().contains("y") && !programValue.getText().contains("z") && !programValue.getText().contains("A") && !programValue.getText().contains("B") && !programValue.getText().contains("C") && !programValue.getText().contains("D") && !programValue.getText().contains("E") && !programValue.getText().contains("F") && !programValue.getText().contains("G") && !programValue.getText().contains("H") && !programValue.getText().contains("I") && !programValue.getText().contains("J") && !programValue.getText().contains("K") && !programValue.getText().contains("L") && !programValue.getText().contains("M") && !programValue.getText().contains("N") && !programValue.getText().contains("O") && !programValue.getText().contains("P") && !programValue.getText().contains("Q") && !programValue.getText().contains("R") && !programValue.getText().contains("S") && !programValue.getText().contains("T") && !programValue.getText().contains("U") && !programValue.getText().contains("V") && !programValue.getText().contains("W") && !programValue.getText().contains("X") && !programValue.getText().contains("Y") && !programValue.getText().contains("Z")))) {
            JOptionPane.showMessageDialog(null, "Please Enter Correct 'Program Name'", "Alert!", WIDTH, null);
            goAheadSave = false;
        }

    }//end testFieldsBeforeAdd()

    public void testIfAlreadyExists() {

        memberExists = false;

        for (int x = 0; x < tableList.getRowCount(); x++) {

            Object tempTitle = model.getValueAt(x, 1);
            Object tempFirstName = model.getValueAt(x, 2);
            Object tempLastName = model.getValueAt(x, 3);

            //PrOpEr CaSinG
            String fname = firstNameValue.getText();
            String lname = lastNameValue.getText();
            duplicateLetterCasing(firstNameValue.getText(), lastNameValue.getText());

            if (tempTitle.equals(titleStringChoise) && tempFirstName.equals(firstNameValue.getText()) && tempLastName.equals(lastNameValue.getText())) {
                memberExists = true;
                firstNameValue.setText(fname);
                lastNameValue.setText(lname);
                break;
            }
            
        }//end for()

    }//end testIfAlreadyExists()

    public void enableFields() {
        //Enable Form Fields
        titleValue.setEnabled(true);
        roleValue.setEnabled(true);
        firstNameValue.setEnabled(true);
        lastNameValue.setEnabled(true);
        emailValue.setEnabled(true);
        contactValue.setEnabled(true);
        cellValue.setEnabled(true);
        roleValue.setEnabled(true);
        addressValue.setEnabled(true);
        programValue.setEnabled(true);
        yearValue.setEnabled(true);

        titleValue.setEnabled(true);
        roleValue.setEditable(true);
        firstNameValue.setEditable(true);
        lastNameValue.setEditable(true);
        emailValue.setEditable(true);
        contactValue.setEditable(true);
        cellValue.setEditable(true);
        roleValue.setEditable(true);
        addressValue.setEnabled(true);
        programValue.setEditable(true);
        yearValue.setEnabled(true);

        if (addressStringChoise.equals("On Campus")) {
            roomValue.setEnabled(true);
            roomValue.setEditable(true);
        } else {
            roomValue.setEnabled(false);
            roomValue.setEditable(false);
        }
    }

    public void faddedFieldContent() {

        roleValue.setForeground(new java.awt.Color(128, 128, 128));
        firstNameValue.setForeground(new java.awt.Color(128, 128, 128));
        lastNameValue.setForeground(new java.awt.Color(128, 128, 128));
        emailValue.setForeground(new java.awt.Color(128, 128, 128));
        contactValue.setForeground(new java.awt.Color(128, 128, 128));
        cellValue.setForeground(new java.awt.Color(128, 128, 128));
        roleValue.setForeground(new java.awt.Color(128, 128, 128));
        roomValue.setForeground(new java.awt.Color(128, 128, 128));
        programValue.setForeground(new java.awt.Color(128, 128, 128));

    }//end faddedFieldContent()

    public void blackFieldContent() {

        roleValue.setForeground(new java.awt.Color(51, 51, 51));
        firstNameValue.setForeground(new java.awt.Color(51, 51, 51));
        lastNameValue.setForeground(new java.awt.Color(51, 51, 51));
        emailValue.setForeground(new java.awt.Color(51, 51, 51));
        contactValue.setForeground(new java.awt.Color(51, 51, 51));
        cellValue.setForeground(new java.awt.Color(51, 51, 51));
        roleValue.setForeground(new java.awt.Color(51, 51, 51));
        roomValue.setForeground(new java.awt.Color(51, 51, 51));
        programValue.setForeground(new java.awt.Color(51, 51, 51));

    }//end blackFieldContent()

    public void disableFields() {

        if (addressStringChoise.equals("On Campus")) {
            roomValue.setEnabled(true);
            roomValue.setEditable(false);
        } else {
            roomValue.setEnabled(false);
            roomValue.setEditable(false);
        }

        titleValue.setEnabled(false);
        roleValue.setEditable(false);
        firstNameValue.setEditable(false);
        lastNameValue.setEditable(false);
        emailValue.setEditable(false);
        contactValue.setEditable(false);
        cellValue.setEditable(false);
        roleValue.setEditable(false);
        addressValue.setEnabled(false);
        programValue.setEditable(false);
        yearValue.setEnabled(false);
    }//end disableFields()

    public void resetFields() {
        //Reset Fields
        titleValue.setSelectedIndex(0);
        firstNameValue.setText("");
        lastNameValue.setText("");
        emailValue.setText("");
        contactValue.setText("");
        cellValue.setText("");
        roleValue.setText("");
        addressValue.setSelectedIndex(0);
        roomValue.setText("");
        programValue.setText("");
        yearValue.setSelectedIndex(0);
    }//end resetFields()

    public void duplicateLetterCasing(String firstName, String lastName) {

        /**
         * ******firstName*************************************
         */
        if (!firstName.isEmpty() && !firstName.contains(" ")) {
            String lowerCase = firstName.toLowerCase();
            char[] charArray = lowerCase.toCharArray();
            firstName = (charArray[0] + "").toUpperCase();

            for (int x = 1; x < charArray.length; x++) {
                firstName += charArray[x];
            }
            firstNameValue.setText(firstName);

        } else if (!firstName.isEmpty() && firstName.contains(" ")) {
            String splitArray[] = firstName.split(" ");

            if (splitArray.length == 0) {
                return;
            }

            firstName = "";
            int count = 0;
            boolean breaking = false;
            while (true) {
                if (breaking) {
                    break;
                }
                for (int xyz = count; xyz < splitArray.length; xyz++) {
                    if (xyz == (splitArray.length - 1)) {
                        breaking = true;
                    }
                    String splitLowerCase = splitArray[xyz].toLowerCase();
                    char[] splitCharArray = splitLowerCase.toCharArray();

                    if (splitCharArray.length != 0) {
                        splitArray[xyz] = (splitCharArray[0] + "").toUpperCase();
                    } else if (splitCharArray.length == 0) {
                        count++;
                        break;
                    }

                    for (int z = 1; z < splitCharArray.length; z++) {
                        splitArray[xyz] += splitCharArray[z];
                    }//end inner for()

                    if (xyz == (splitArray.length - 1)) {
                        firstName += splitArray[xyz];
                    } else {
                        firstName += splitArray[xyz] + " ";
                    }

                }//end outer for()
            }//end while()
            firstNameValue.setText(firstName);
        }//end else if()

        /**
         * *********lastName**********************************
         */
        if (!lastName.isEmpty() && !lastName.contains(" ")) {
            String lowerCase = lastName.toLowerCase();
            char[] charArray = lowerCase.toCharArray();
            lastName = (charArray[0] + "").toUpperCase();

            for (int x = 1; x < charArray.length; x++) {
                lastName += charArray[x];
            }
            lastNameValue.setText(lastName);

        } else if (!lastName.isEmpty() && lastName.contains(" ")) {
            String splitArray[] = lastName.split(" ");

            if (splitArray.length == 0) {
                return;
            }

            lastName = "";
            int count = 0;
            boolean breaking = false;
            while (true) {
                if (breaking) {
                    break;
                }
                for (int xyz = count; xyz < splitArray.length; xyz++) {
                    if (xyz == (splitArray.length - 1)) {
                        breaking = true;
                    }
                    String splitLowerCase = splitArray[xyz].toLowerCase();
                    char[] splitCharArray = splitLowerCase.toCharArray();

                    if (splitCharArray.length != 0) {
                        splitArray[xyz] = (splitCharArray[0] + "").toUpperCase();
                    } else if (splitCharArray.length == 0) {
                        count++;
                        break;
                    }

                    for (int z = 1; z < splitCharArray.length; z++) {
                        splitArray[xyz] += splitCharArray[z];
                    }//end inner for()

                    if (xyz == (splitArray.length - 1)) {
                        lastName += splitArray[xyz];
                    } else {
                        lastName += splitArray[xyz] + " ";
                    }

                }//end outer for()
            }//end while()
            lastNameValue.setText(lastName);
        }//end else if()

    }//end duplicateLetterCasing()

    /**
     * *************************************************************************************************************
     */
    public void letterCasing(String firstName, String lastName, String role, String cell) {

        /**
         * ******firstName*************************************
         */
        if (!firstName.isEmpty() && !firstName.contains(" ")) {
            String lowerCase = firstName.toLowerCase();
            char[] charArray = lowerCase.toCharArray();
            firstName = (charArray[0] + "").toUpperCase();

            for (int x = 1; x < charArray.length; x++) {
                firstName += charArray[x];
            }
            firstNameValue.setText(firstName);

        } else if (!firstName.isEmpty() && firstName.contains(" ")) {
            String splitArray[] = firstName.split(" ");

            if (splitArray.length == 0) {
                return;
            }

            firstName = "";
            int count = 0;
            boolean breaking = false;
            while (true) {
                if (breaking) {
                    break;
                }
                for (int xyz = count; xyz < splitArray.length; xyz++) {
                    if (xyz == (splitArray.length - 1)) {
                        breaking = true;
                    }
                    String splitLowerCase = splitArray[xyz].toLowerCase();
                    char[] splitCharArray = splitLowerCase.toCharArray();

                    if (splitCharArray.length != 0) {
                        splitArray[xyz] = (splitCharArray[0] + "").toUpperCase();
                    } else if (splitCharArray.length == 0) {
                        count++;
                        break;
                    }

                    for (int z = 1; z < splitCharArray.length; z++) {
                        splitArray[xyz] += splitCharArray[z];
                    }//end inner for()

                    if (xyz == (splitArray.length - 1)) {
                        firstName += splitArray[xyz];
                    } else {
                        firstName += splitArray[xyz] + " ";
                    }

                }//end outer for()
            }//end while()
            firstNameValue.setText(firstName);
        }//end else if()

        /**
         * *********lastName**********************************
         */
        if (!lastName.isEmpty() && !lastName.contains(" ")) {
            String lowerCase = lastName.toLowerCase();
            char[] charArray = lowerCase.toCharArray();
            lastName = (charArray[0] + "").toUpperCase();

            for (int x = 1; x < charArray.length; x++) {
                lastName += charArray[x];
            }
            lastNameValue.setText(lastName);

        } else if (!lastName.isEmpty() && lastName.contains(" ")) {
            String splitArray[] = lastName.split(" ");

            if (splitArray.length == 0) {
                return;
            }

            lastName = "";
            int count = 0;
            boolean breaking = false;
            while (true) {
                if (breaking) {
                    break;
                }
                for (int xyz = count; xyz < splitArray.length; xyz++) {
                    if (xyz == (splitArray.length - 1)) {
                        breaking = true;
                    }
                    String splitLowerCase = splitArray[xyz].toLowerCase();
                    char[] splitCharArray = splitLowerCase.toCharArray();

                    if (splitCharArray.length != 0) {
                        splitArray[xyz] = (splitCharArray[0] + "").toUpperCase();
                    } else if (splitCharArray.length == 0) {
                        count++;
                        break;
                    }

                    for (int z = 1; z < splitCharArray.length; z++) {
                        splitArray[xyz] += splitCharArray[z];
                    }//end inner for()

                    if (xyz == (splitArray.length - 1)) {
                        lastName += splitArray[xyz];
                    } else {
                        lastName += splitArray[xyz] + " ";
                    }

                }//end outer for()
            }//end while()
            lastNameValue.setText(lastName);
        }//end else if()

        /**
         * ********role***********************************
         */
        if (!role.isEmpty() && !role.contains(" ")) {
            String lowerCase = role.toLowerCase();
            char[] charArray = lowerCase.toCharArray();
            role = (charArray[0] + "").toUpperCase();

            for (int x = 1; x < charArray.length; x++) {
                role += charArray[x];
            }
            roleValue.setText(role);

        } else if (!role.isEmpty() && role.contains(" ")) {
            String splitArray[] = role.split(" ");

            if (splitArray.length == 0) {
                return;
            }

            role = "";
            int count = 0;
            boolean breaking = false;
            while (true) {
                if (breaking) {
                    break;
                }
                for (int xyz = count; xyz < splitArray.length; xyz++) {
                    if (xyz == (splitArray.length - 1)) {
                        breaking = true;
                    }
                    String splitLowerCase = splitArray[xyz].toLowerCase();
                    char[] splitCharArray = splitLowerCase.toCharArray();

                    if (splitCharArray.length != 0) {
                        splitArray[xyz] = (splitCharArray[0] + "").toUpperCase();
                    } else if (splitCharArray.length == 0) {
                        count++;
                        break;
                    }

                    for (int z = 1; z < splitCharArray.length; z++) {
                        splitArray[xyz] += splitCharArray[z];
                    }//end inner for()

                    if (xyz == (splitArray.length - 1)) {
                        role += splitArray[xyz];
                    } else {
                        role += splitArray[xyz] + " ";
                    }

                }//end outer for()
            }//end while()
            roleValue.setText(role);
        }//end else if()

        /**
         * *******cell************************************
         */
        if (!cell.isEmpty() && !cell.contains(" ")) {
            String lowerCase = cell.toLowerCase();
            char[] charArray = lowerCase.toCharArray();
            cell = (charArray[0] + "").toUpperCase();

            for (int x = 1; x < charArray.length; x++) {
                cell += charArray[x];
            }
            cellValue.setText(cell);

        } else if (!cell.isEmpty() && cell.contains(" ")) {
            String splitArray[] = cell.split(" ");

            if (splitArray.length == 0) {
                return;
            }

            cell = "";
            int count = 0;
            boolean breaking = false;
            while (true) {
                if (breaking) {
                    break;
                }
                for (int xyz = count; xyz < splitArray.length; xyz++) {
                    if (xyz == (splitArray.length - 1)) {
                        breaking = true;
                    }
                    String splitLowerCase = splitArray[xyz].toLowerCase();
                    char[] splitCharArray = splitLowerCase.toCharArray();

                    if (splitCharArray.length != 0) {
                        splitArray[xyz] = (splitCharArray[0] + "").toUpperCase();
                    } else if (splitCharArray.length == 0) {
                        count++;
                        break;
                    }

                    for (int z = 1; z < splitCharArray.length; z++) {
                        splitArray[xyz] += splitCharArray[z];
                    }//end inner for()

                    if (xyz == (splitArray.length - 1)) {
                        cell += splitArray[xyz];
                    } else {
                        cell += splitArray[xyz] + " ";
                    }

                }//end outer for()
            }//end while()
            cellValue.setText(cell);
        }//end else if()

    }//end letterCasing()

    public static void main(String jdslk[]) {
        
        //SPLASHING that DOLLL
        BLW_Splash splash = new BLW_Splash();
                splash.setVisible(true);
                
                homeBLW home = new homeBLW();
                
                    try{
                        for(int x=0;x<=100;x++){
                            Thread.sleep(10);
                            //splash.loadingPercent.setText(Integer.toString(x)+"%");
                            splash.loadingBar.setValue(x);
                            
                            if(x==10){
                                splash.loading.setText("Powering on");
                            }else if(x==20){
                                Thread.sleep(200);
                                splash.loading.setText("Setting us initial variables");
                            }else if(x==25){
                                splash.loading.setText("Loading startup divers");
                            }else if(x==40){
                                Thread.sleep(100);
                                splash.loading.setText("Loading previous changes");
                            }else if(x==50){
                                Thread.sleep(100);
                                splash.loading.setText("Loading content");
                            }else if(x==55){
                                splash.loading.setText("Loading registry tools");
                            }else if(x==70){
                                splash.loading.setText("Loading Excel divers");
                            }else if(x==75){
                                Thread.sleep(200);
                                splash.loading.setText("Loading background services");
                            }else if(x==80){
                                splash.loading.setText("Setting up Display");
                            }else if(x==90){
                                Thread.sleep(70);
                                splash.loading.setText("Setting us initial variables");
                            }else if(x==100){
                                splash.setVisible(false);
                            }
                        }//end for
                        
                    }catch(Exception e){

                    }
     

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
            java.util.logging.Logger.getLogger(homeBLW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeBLW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeBLW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeBLW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                new homeBLW().setVisible(true);
            }
        });
    }//end main()

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Maximize;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JLabel addressTitle;
    private javax.swing.JComboBox addressValue;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel blwRegisterTopLabel;
    private javax.swing.JLabel cellLabel;
    private javax.swing.JTextField cellValue;
    private javax.swing.JLabel closeXButton;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField contactValue;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel dobTitle;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailValue;
    private javax.swing.JLabel excelLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel firstNameLabel1;
    private javax.swing.JTextField firstNameValue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameValue;
    private javax.swing.JLabel memberID;
    private javax.swing.JPanel midTopPanel;
    private javax.swing.JButton newResetButton;
    private javax.swing.JLabel programLabel;
    private javax.swing.JTextField programValue;
    private javax.swing.JTextField roleValue;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JTextField roomValue;
    private javax.swing.JLabel saveLabel;
    private javax.swing.JButton saveUpdateButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JSeparator searchJSeparator;
    private javax.swing.JLabel sidePanelHeader;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JTable tableList;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox titleValue;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel topPencil;
    private javax.swing.JLabel yearTitle;
    private javax.swing.JComboBox yearValue;
    // End of variables declaration//GEN-END:variables
}
