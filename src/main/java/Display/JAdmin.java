/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Display;

import Clases.Conexion;
import Clases.Producto;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JOptionPane;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HENRYTO
 */
public class JAdmin extends javax.swing.JFrame {

    /**
     * Creates new form JAdmin
     */
    public JAdmin() {
        initComponents();
        SetDate();
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        cargarTablaProductos();
        String[] columnas = {"ID", "Nombre Producto", "Descripcion Producto", "Cantidad", "Precio"};
        // modelo de la tabla con los nombres de las columnas
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        tblProductos.setModel(modelo);

        // Ancho de las columnas
        tblProductos.getColumnModel().getColumn(0).setPreferredWidth(50); // ID
        tblProductos.getColumnModel().getColumn(1).setPreferredWidth(150); // Nombre Producto
        tblProductos.getColumnModel().getColumn(1).setPreferredWidth(150); // Descripcion Producto
        tblProductos.getColumnModel().getColumn(2).setPreferredWidth(80); // Cantidad
        tblProductos.getColumnModel().getColumn(3).setPreferredWidth(80); // Precio
        Dimension displayProductos = Toolkit.getDefaultToolkit().getScreenSize();
        int height = displayProductos.height;
        int width = displayProductos.width;
        setLocation((width - getWidth()) / 2, (height - getHeight()) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundAdmin = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btn_users = new javax.swing.JButton();
        appName = new javax.swing.JLabel();
        btn_AgregarProductos = new javax.swing.JButton();
        btn_ModificarProductos = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_Actualizar = new javax.swing.JButton();
        btn_Buscar = new javax.swing.JButton();
        btn_Imprimir = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        Jheader2 = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtDescripcion = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jMessage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackgroundAdmin.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(153, 153, 255));
        Menu.setForeground(new java.awt.Color(204, 204, 255));
        Menu.setPreferredSize(new java.awt.Dimension(270, 634));

        btn_users.setBackground(new java.awt.Color(102, 102, 255));
        btn_users.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_users.setForeground(new java.awt.Color(255, 255, 255));
        btn_users.setText("Usuarios");
        btn_users.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_users.setBorderPainted(false);
        btn_users.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_users.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_users.setIconTextGap(13);
        btn_users.setInheritsPopupMenu(true);
        btn_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usersActionPerformed(evt);
            }
        });

        appName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        appName.setForeground(new java.awt.Color(255, 255, 255));
        appName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName.setText("Inventory X");

        btn_AgregarProductos.setBackground(new java.awt.Color(102, 102, 255));
        btn_AgregarProductos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_AgregarProductos.setForeground(new java.awt.Color(255, 255, 255));
        btn_AgregarProductos.setText("Agregar Productos");
        btn_AgregarProductos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_AgregarProductos.setBorderPainted(false);
        btn_AgregarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_AgregarProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_AgregarProductos.setIconTextGap(13);
        btn_AgregarProductos.setInheritsPopupMenu(true);
        btn_AgregarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarProductosActionPerformed(evt);
            }
        });

        btn_ModificarProductos.setBackground(new java.awt.Color(102, 102, 255));
        btn_ModificarProductos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_ModificarProductos.setForeground(new java.awt.Color(255, 255, 255));
        btn_ModificarProductos.setText("Modificar Productos");
        btn_ModificarProductos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_ModificarProductos.setBorderPainted(false);
        btn_ModificarProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_ModificarProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_ModificarProductos.setIconTextGap(13);
        btn_ModificarProductos.setInheritsPopupMenu(true);
        btn_ModificarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarProductosActionPerformed(evt);
            }
        });

        btn_Eliminar.setBackground(new java.awt.Color(102, 102, 255));
        btn_Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Eliminar.setText("Eliminar Producto");
        btn_Eliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_Eliminar.setBorderPainted(false);
        btn_Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Eliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Eliminar.setIconTextGap(13);
        btn_Eliminar.setInheritsPopupMenu(true);
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu de Opciones");

        btn_Actualizar.setBackground(new java.awt.Color(102, 102, 255));
        btn_Actualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Actualizar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_Actualizar.setBorderPainted(false);
        btn_Actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Actualizar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Actualizar.setIconTextGap(13);
        btn_Actualizar.setInheritsPopupMenu(true);
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        btn_Buscar.setBackground(new java.awt.Color(102, 102, 255));
        btn_Buscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Buscar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Buscar.setText("Buscar");
        btn_Buscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_Buscar.setBorderPainted(false);
        btn_Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Buscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Buscar.setIconTextGap(13);
        btn_Buscar.setInheritsPopupMenu(true);
        btn_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BuscarActionPerformed(evt);
            }
        });

        btn_Imprimir.setBackground(new java.awt.Color(102, 102, 255));
        btn_Imprimir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Imprimir.setForeground(new java.awt.Color(255, 255, 255));
        btn_Imprimir.setText("Imprimir");
        btn_Imprimir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_Imprimir.setBorderPainted(false);
        btn_Imprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Imprimir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Imprimir.setIconTextGap(13);
        btn_Imprimir.setInheritsPopupMenu(true);
        btn_Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_users, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ModificarProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Actualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_AgregarProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btn_users, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btn_AgregarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_ModificarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        BackgroundAdmin.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 646));

        Header.setBackground(new java.awt.Color(153, 153, 255));
        Header.setPreferredSize(new java.awt.Dimension(744, 150));

        Jheader2.setBackground(new java.awt.Color(255, 255, 255));
        Jheader2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Jheader2.setForeground(new java.awt.Color(255, 255, 255));
        Jheader2.setText("Control de Inventario");

        dateText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateText.setForeground(new java.awt.Color(255, 255, 255));
        dateText.setText("Hoy es {dayname} {day} de {monh} de {year}");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jheader2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(333, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Jheader2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        BackgroundAdmin.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 52, 820, 80));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcion "));
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        txtId.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));

        txtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio"));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        BackgroundAdmin.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 820, 210));

        jMessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMessage.setText("Haciendo tu vida más sencilla ");
        BackgroundAdmin.add(jMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 0, 246, 46));

        tblProductos.setBackground(new java.awt.Color(204, 204, 255));
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        BackgroundAdmin.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 820, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usersActionPerformed
        JUsuarios jUsuarios = new JUsuarios();
        jUsuarios.setVisible(true);
    }//GEN-LAST:event_btn_usersActionPerformed

    private void btn_AgregarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarProductosActionPerformed
 Producto producto = new Producto(Integer.parseInt(txtId.getText()), txtNombre.getText(), txtDescripcion.getText(), Integer.parseInt(txtCantidad.getText()), Double.parseDouble(txtPrecio.getText()));
producto.setId(Integer.parseInt(txtId.getText()));
producto.setNombre(txtNombre.getText());
producto.setDescripcion(txtDescripcion.getText());
producto.setCantidad(Integer.parseInt(txtCantidad.getText()));
producto.setPrecio(Double.parseDouble(txtPrecio.getText()));

try {
    Connection connection = Conexion.getConexion();
    
    // Verificar si el ID del producto ya existe
    PreparedStatement psVerificar = connection.prepareStatement("SELECT COUNT(*) FROM Productos WHERE id = ?");
    psVerificar.setInt(1, producto.getId());
    ResultSet rsVerificar = psVerificar.executeQuery();
    rsVerificar.next();
    int count = rsVerificar.getInt(1);
    
    if (count > 0) {
        JOptionPane.showMessageDialog(null, "El ID del producto ya existe, por favor, elija otro ID.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Salir del método
    }
    
    // Insertar el nuevo producto si el ID no existe
    PreparedStatement ps = connection.prepareStatement("INSERT INTO Productos(id, nombre, descripcion, cantidad, precio) VALUES(?, ?, ?, ?, ?)");
    ps.setInt(1, producto.getId());
    ps.setString(2, producto.getNombre());
    ps.setString(3, producto.getDescripcion());
    ps.setInt(4, producto.getCantidad());
    ps.setDouble(5, producto.getPrecio());
    ps.executeUpdate();
    
    JOptionPane.showMessageDialog(null, "Registro de Productos", "Registro guardado existosamente", JOptionPane.PLAIN_MESSAGE);
    limpiarCampos();
    cargarTablaProductos();
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, e.toString());
}


    }//GEN-LAST:event_btn_AgregarProductosActionPerformed

    private void cargarTablaProductos() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblProductos.getModel();
        modeloTabla.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;

        try {
            Connection connection = Conexion.getConexion();
            ps = connection.prepareStatement("SELECT id, nombre, descripcion, cantidad, precio FROM Productos");
            rs = ps.executeQuery();

            while (rs.next()) {
                Object[] fila = new Object[5];
                fila[0] = rs.getInt("id");
                fila[1] = rs.getString("nombre");
                fila[2] = rs.getString("descripcion");
                fila[3] = rs.getInt("cantidad");
                fila[4] = rs.getDouble("precio");
                modeloTabla.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }

    private void limpiarCampos() {
        txtId.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
    }

    private void btn_ModificarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarProductosActionPerformed
        int id = Integer.parseInt(txtId.getText());
        String nombre = txtNombre.getText();
        String descripcion = txtDescripcion.getText();
        int cantidad = Integer.parseInt(txtCantidad.getText());
        double precio = Double.parseDouble(txtPrecio.getText());

        try {
            Connection connection = Conexion.getConexion();
            PreparedStatement ps = connection.prepareStatement("UPDATE Productos SET nombre=?, descripcion=?, cantidad=?, precio=? WHERE id=?");
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setInt(3, cantidad);
            ps.setDouble(4, precio);
            ps.setInt(5, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro de Productos", "Registro modificado existosamente", JOptionPane.PLAIN_MESSAGE);
            limpiarCampos();
            cargarTablaProductos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btn_ModificarProductosActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int id = Integer.parseInt(txtId.getText());

        try {
            Connection connection = Conexion.getConexion();
            PreparedStatement ps = connection.prepareStatement("DELETE FROM Productos WHERE id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro de Productos", "Registro eliminado existosamente", JOptionPane.PLAIN_MESSAGE);
            limpiarCampos();
            cargarTablaProductos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
try {
    int row = tblProductos.getSelectedRow();
    int id = Integer.parseInt(tblProductos.getValueAt(row, 0).toString());
    
    // Verificar si el ID del producto ya existe
    PreparedStatement psVerificar = Conexion.getConexion().prepareStatement("SELECT COUNT(*) FROM Productos WHERE id = ?");
    psVerificar.setInt(1, id);
    ResultSet rsVerificar = psVerificar.executeQuery();
    rsVerificar.next();
    int count = rsVerificar.getInt(1);
    
    if (count == 0) {
        JOptionPane.showMessageDialog(null, "El ID del producto no existe.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Salir del método
    }
    
    // Obtener los detalles del producto si existe
    PreparedStatement ps;
    ResultSet rs;
    Connection connection = Conexion.getConexion();
    ps = connection.prepareStatement("SELECT id, nombre, descripcion, cantidad, precio FROM Productos WHERE id = ?");
    ps.setInt(1, id);
    rs = ps.executeQuery();
    while (rs.next()) {
        txtId.setText(String.valueOf(id));
        txtNombre.setText(rs.getString("nombre"));
        txtDescripcion.setText(rs.getString("descripcion"));
        txtCantidad.setText(rs.getString("cantidad"));
        txtPrecio.setText(rs.getString("precio"));
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, e.toString());


       }
    }//GEN-LAST:event_tblProductosMouseClicked

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed

            cargarTablaProductos();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void btn_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BuscarActionPerformed
    // Verificar si se ingresó un ID válido
    if (txtId.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID de producto.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }  
// Obtener el ID del producto a buscar
    int idProductoABuscar = Integer.parseInt(txtId.getText());

    try {
        Connection connection = Conexion.getConexion();
        
        // Consulta para buscar el producto por ID
        PreparedStatement ps = connection.prepareStatement("SELECT id, nombre, descripcion, cantidad, precio FROM Productos WHERE id = ?");
        ps.setInt(1, idProductoABuscar);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            // Si se encuentra el producto, mostrar sus detalles en los campos de texto
            txtId.setText(String.valueOf(rs.getInt("id")));
            txtNombre.setText(rs.getString("nombre"));
            txtDescripcion.setText(rs.getString("descripcion"));
            txtCantidad.setText(String.valueOf(rs.getInt("cantidad")));
            txtPrecio.setText(String.valueOf(rs.getDouble("precio")));
            
            // Limpiar la tabla
            DefaultTableModel model = (DefaultTableModel) tblProductos.getModel();
            model.setRowCount(0);
            
            // Agregar el producto encontrado a la tabla
            Object[] rowData = {rs.getInt("id"), rs.getString("nombre"), rs.getString("descripcion"), rs.getInt("cantidad"), rs.getDouble("precio")};
            model.addRow(rowData);
        } else {
            // Si no se encuentra el producto, mostrar un mensaje de error
            JOptionPane.showMessageDialog(null, "No existen productos con ese ID.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e.toString());
    }



        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BuscarActionPerformed

    private void btn_ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ImprimirActionPerformed
      try {
        Connection connection = Conexion.getConexion();
        
        // Consulta para obtener todos los datos de la tabla de la base de datos
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Productos");
        ResultSet rs = ps.executeQuery();
        
        // Crear un documento PDF
        Document document = new Document();
 
        PdfWriter.getInstance(document, new FileOutputStream("tabla_productos.pdf"));
        document.open();
        
        // Agregar un título al documento
        document.add(new Paragraph("Tabla de Productos"));

        // Crear una tabla PDF
        PdfPTable table = new PdfPTable(5); // Número de columnas
        
        // Agregar encabezados de columnas
        table.addCell("ID");
        table.addCell("Nombre");
        table.addCell("Descripción");
        table.addCell("Cantidad");
        table.addCell("Precio");
        
        // Agregar filas de la tabla desde la base de datos
        while (rs.next()) {
            table.addCell(String.valueOf(rs.getInt("id")));
            table.addCell(rs.getString("nombre"));
            table.addCell(rs.getString("descripcion"));
            table.addCell(String.valueOf(rs.getInt("cantidad")));
            table.addCell(String.valueOf(rs.getDouble("precio")));
        }
        
        // Agregar la tabla al documento
        document.add(table);
        
        // Cerrar el documento
        document.close();
        
        JOptionPane.showMessageDialog(null, "Documento PDF creado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException | DocumentException | FileNotFoundException e) {
        JOptionPane.showMessageDialog(null, "Error al generar el documento PDF: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(JAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JAdmin().setVisible(true);
            }
        });
    }

    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundAdmin;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Jheader2;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel appName;
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_AgregarProductos;
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Imprimir;
    private javax.swing.JButton btn_ModificarProductos;
    private javax.swing.JButton btn_users;
    private javax.swing.JLabel dateText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}