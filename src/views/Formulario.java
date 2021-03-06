
package views;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

import controller.MainController;
import model.Cliente;
import model.ClientesHasLesion;
import model.Estres;
import model.Lesion;
import model.Objetivo;
import model.EstresEjercicio;

/**
*
* @author borja
*/
public class Formulario extends javax.swing.JFrame {
    

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("BroFit");
	EntityManager em = emf.createEntityManager();
 
	List<ClientesHasLesion>lesionesCliente;
	List<Lesion> listaLesiones = new ArrayList();
	private MainController mainController ; 
    private javax.swing.JTextField altura;
    private javax.swing.JTextField apellidos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton continuar;
    private javax.swing.JComboBox dias;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField edad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lesiones1;
    private javax.swing.JList lesiones2;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox objetivo;
    private javax.swing.JComboBox motivacion;
    private javax.swing.JTextField peso;
    private javax.swing.JTextField pulsaciones;
    private javax.swing.JComboBox r_aerobica;
    private javax.swing.JComboBox r_anaerobica_inf;
    private javax.swing.JComboBox r_anaerobica_sup;
    private javax.swing.JComboBox r_anaerobica_ab;
	private DefaultListModel model2 ;
	private DefaultListModel model1 ;
	private int CategoriaIMC;
	private JPanel jPanel1;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JLabel jLabel10;
	private JLabel jLabel11;
	private JLabel jLabel12;
	private JLabel jLabel13;
	private JLabel jLabel14;
	private JLabel jLabel15;
	private JLabel jLabel16;
	private JLabel jLabel7;
	private JLabel jLabel17;
	Resultado resultado;

    
    public Formulario() {
        initComponents();
		this.introducirLesiones();
		
    }
    
	
	private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        edad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        peso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        altura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        objetivo = new javax.swing.JComboBox();
        motivacion = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        pulsaciones = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lesiones1 = new javax.swing.JList();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        dias = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        r_aerobica = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        r_anaerobica_sup = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        r_anaerobica_ab = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        r_anaerobica_inf = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lesiones2 = new javax.swing.JList();
        cancelar = new javax.swing.JButton();
        continuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BroFit");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos usuario"));

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellidos");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel3.setText("Edad:");

        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });

        jLabel4.setText("DNI:");

        dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniActionPerformed(evt);
            }
        });

        jLabel6.setText("Peso");

        peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoActionPerformed(evt);
            }
        });

        jLabel7.setText("Altura");

        altura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaActionPerformed(evt);
            }
        });

        jLabel8.setText("Kg");

        jLabel9.setText("m");

        jLabel5.setText("Objetivo");

        objetivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hipertrofia","Tonificaci�n",  "P�rdida de Peso", "Mantenimiento" }));
        objetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objetivoActionPerformed(evt);
            }
        });
        jLabel17.setText("Motivacion");

        motivacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "Si" }));
        motivacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motivacionActionPerformed(evt);
            }
        });

        jLabel10.setText("Pulsaciones en reposo");

        pulsaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulsacionesActionPerformed(evt);
            }
        });

        lesiones1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(lesiones1);

        jLabel11.setText("Lesiones");

        jButton1.setText("(Grave) -->");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLesionGrave(evt);
            }
        });

        jButton2.setText("<--");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel12.setText("D�as de entrenamiento/semana");

        dias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diasActionPerformed(evt);
            }
        });
        

        jLabel13.setText("Resultado prueba aer�bica");

        r_aerobica.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muy mala","Mala","Regular","Buena" , "Muy Buena" }));
        r_aerobica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_aerobicaActionPerformed(evt);
            }
        });

        jLabel14.setText("Resultado prueba anaer�bica sup.");

        r_anaerobica_sup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muy mala","Mala","Regular","Buena" , "Muy Buena" }));
        r_anaerobica_sup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_anaerobica_supActionPerformed(evt);
            }
        });

        jLabel15.setText("Resultado prueba anaer�bica inf.");

        r_anaerobica_inf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muy mala","Mala","Regular","Buena" , "Muy Buena" }));
        r_anaerobica_inf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_anaerobica_infActionPerformed(evt);
            }
        });
        
        jLabel16.setText("Resultado prueba anaer�bica Ab.");

        r_anaerobica_ab.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Muy mala","Mala","Regular","Buena" , "Muy Buena" }));
        r_anaerobica_ab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_anaerobica_abActionPerformed(evt);
            }
        });

        jButton3.setText("(Leve) -->");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLesionLeve(evt);
            }
        });

        lesiones2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lesiones2);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(objetivo,  GroupLayout.PREFERRED_SIZE, 139,  GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel17)
                                                    .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(motivacion,  GroupLayout.PREFERRED_SIZE, 139,  GroupLayout.PREFERRED_SIZE))
                                            .addGroup( GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(peso,  GroupLayout.PREFERRED_SIZE, 44,  GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7)
                                                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(altura,  GroupLayout.PREFERRED_SIZE, 40,  GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)))
                                .addGap(62, 62, 62))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1,  GroupLayout.PREFERRED_SIZE, 180,  GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jButton2))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12,  GroupLayout.PREFERRED_SIZE, 150,  GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dias,  GroupLayout.PREFERRED_SIZE, 45,  GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                            .addComponent(edad,  GroupLayout.PREFERRED_SIZE, 44,  GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre,  GroupLayout.PREFERRED_SIZE, 206,  GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2,  GroupLayout.PREFERRED_SIZE, 224,  GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(30, 30, 30)
                            .addComponent(r_aerobica, 0,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4))
                                    .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING, false)
                                        .addComponent(apellidos,  GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                        .addComponent(dni)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(pulsaciones,  GroupLayout.PREFERRED_SIZE, 44,  GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel15)
                                .addComponent(jLabel16))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING, false)
                                .addComponent(r_anaerobica_inf,  GroupLayout.PREFERRED_SIZE, 92,  GroupLayout.PREFERRED_SIZE)
                                .addComponent(r_anaerobica_sup,  GroupLayout.PREFERRED_SIZE, 92,  GroupLayout.PREFERRED_SIZE)
                                .addComponent(r_anaerobica_ab,  GroupLayout.PREFERRED_SIZE, 92,  GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(apellidos,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dni,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(edad,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(peso,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(pulsaciones,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(altura,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(objetivo,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(r_aerobica,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(motivacion,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(r_anaerobica_sup,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(r_anaerobica_inf,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(r_anaerobica_ab,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(dias,  GroupLayout.PREFERRED_SIZE,  GroupLayout.DEFAULT_SIZE,  GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1,  GroupLayout.PREFERRED_SIZE, 109,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2,  GroupLayout.PREFERRED_SIZE, 109,  GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jButton3)
                        .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        cancelar.setText("Cancel");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        continuar.setText("OK");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });

        GroupLayout layout = new  GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap( GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(continuar)
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelar)
                .addContainerGap())
            .addComponent(jPanel1,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(new java.awt.Component[] {cancelar, continuar});

        layout.setVerticalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1,  GroupLayout.DEFAULT_SIZE,  GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(continuar))
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("usuario");

        pack();
    }

    private void r_anaerobica_infActionPerformed(java.awt.event.ActionEvent evt) {}
    private void r_anaerobica_abActionPerformed(java.awt.event.ActionEvent evt) {}
    private void r_anaerobica_supActionPerformed(java.awt.event.ActionEvent evt) {}
    private void r_aerobicaActionPerformed(java.awt.event.ActionEvent evt) {}
    private void pulsacionesActionPerformed(java.awt.event.ActionEvent evt) {}
    private void objetivoActionPerformed(java.awt.event.ActionEvent evt) {}
    private void motivacionActionPerformed(java.awt.event.ActionEvent evt){}
    private void alturaActionPerformed(java.awt.event.ActionEvent evt) {}
    private void pesoActionPerformed(java.awt.event.ActionEvent evt) {}
    private void dniActionPerformed(java.awt.event.ActionEvent evt) {}
    private void edadActionPerformed(java.awt.event.ActionEvent evt) {}
    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {}
    private void diasActionPerformed(java.awt.event.ActionEvent evt) {}
    private void coProgresoActionPerformed(java.awt.event.ActionEvent evt) {}
    
    
    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {
    	
		if(this.camposCompletos()){
			try{
				CategoriaIMC = Estres.calcularIMC(Float.valueOf(peso.getText()), Float.valueOf(altura.getText()));
			}catch(Exception e ){
				JOptionPane.showMessageDialog(this,"datos erroneos");
				return;}
			if(objetivo.getSelectedItem().equals("Hipertrofia")&& dias.getSelectedIndex()+1<3){
				JOptionPane.showMessageDialog(this,"No se pueden seleccionar menos de 3 d�as con el objetivo de Hipertrofia"+dias.getSelectedIndex());
			}
			else if(CategoriaIMC==-1){
				JOptionPane.showMessageDialog(this,"IMC MENOR DE 18.5");
			}else if(objetivo.getSelectedItem().equals("Hipertrofia")&& motivacion.getSelectedIndex()==0){
				JOptionPane.showMessageDialog(this,"Con Hipertrofia es necesario tener motivaci�n");				
			}else if((objetivo.getSelectedItem().equals("P�rdida de Peso")||objetivo.getSelectedItem().equals("Mantenimiento"))&& motivacion.getSelectedIndex()==1){
				JOptionPane.showMessageDialog(this,"Con perdida de peso o mantenimiento es necesario tener motivaci�n");								
			}
			else{
				this.ejecutarSistema();
			}
		}else{
			JOptionPane.showMessageDialog(this,"Datos incompletos");
		}

    }


	private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
    }
    
    
    public static void main(String args[]) {
      
        try {
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }
    
    
	private void removeLesion(int index,boolean derecha) {
		if(derecha){
			model1.remove(index);
		}
		else model2.remove(index);
	}

	private boolean camposCompletos() {

		boolean result = true;
		
		if(nombre.getText().isEmpty()) result=false;
		else if(apellidos.getText().isEmpty()) result=false;
		else if (edad.getText().isEmpty())result=false;
		else if (dni.getText().isEmpty())result=false;
		else if (peso.getText().isEmpty())result=false;
		else if (altura.getText().isEmpty())result=false;
		else if (pulsaciones.getText().isEmpty())result=false;
		
		return result;
	
	}

	private void ejecutarSistema() {
		
		Cliente cliente = new Cliente();
		
		if(setCliente(cliente)){
			em.getTransaction().begin();
			em.persist(cliente);
			em.flush();
			em.getTransaction().commit();
			if(this.insertarLesiones(cliente)){
				
				try{
					int index = objetivo.getSelectedIndex()+1;
					em.getTransaction().begin();
					em.persist(cliente);
					em.getTransaction().commit();
					Objetivo objetive = em.find(Objetivo.class, index);
					this.setVisible(false);
					mainController = new MainController(cliente,objetive,em).run();
					
					
					
				}catch(NullPointerException ex ) {
					ex.printStackTrace();
				}
			}
			
		}
		else{
			//TODO: fallo al introducir datos
		}
		
	}
	public  void ListarLesiones(EntityManager em){
	    listaLesiones= em.createNamedQuery("Lesion.findAll").getResultList();
	}

	private boolean insertarLesiones(Cliente cliente) {
		boolean result = true;
		try{

			if(model2.getSize() >0){cliente.setClientesHasLesiones(new ArrayList<ClientesHasLesion>());}
			for(int i =0; i<model2.getSize();i++){
				ClientesHasLesion clientesHasLesionAux = new ClientesHasLesion();
				clientesHasLesionAux.setCliente(cliente);
				
				String aux = model2.getElementAt(i).toString();
				String nombreLesion = aux.substring(0,aux.indexOf("("));
				String gravedad= aux.substring(aux.indexOf("("),aux.length());
				if(gravedad.equals("(GRAVE)")){
					clientesHasLesionAux.setGravedadLesion(ClientesHasLesion.GRAVE);
				}
				else{
					clientesHasLesionAux.setGravedadLesion(ClientesHasLesion.LEVE);
				}
				Lesion lesion = (Lesion)em.createNamedQuery("Lesion.findByName").setParameter("nombreLesion", nombreLesion.trim()).getSingleResult();
				clientesHasLesionAux.setLesion(lesion);
				/*em.getTransaction().begin();
				em.persist(clientesHasLesionAux);
				em.getTransaction().commit();*/
				cliente.addClientesHasLesione(clientesHasLesionAux);
			}
		}catch(NullPointerException ex){
			ex.printStackTrace();
			result = false;
		}
		
		return result;
	}
	
	public int buscarIDlesion(String nom){
		int result = 0;
		
		for(Lesion l : this.listaLesiones){
			if(l.getNombre()==nom){
				return l.getIdLesiones();
			}
		}
		return result;
	}
	
	

	private boolean setCliente(Cliente cliente) {
		try{
			cliente.setEdad(Integer.valueOf(edad.getText()));
			cliente.setAerobica(r_aerobica.getSelectedIndex());
			cliente.setAltura(Float.valueOf(altura.getText()));
			cliente.setPeso(Float.valueOf(peso.getText()));
			cliente.setDiasSemana(dias.getSelectedIndex()+1);
			cliente.setFr(Integer.valueOf(pulsaciones.getText()));
			cliente.setAnaerobicaA(r_anaerobica_ab.getSelectedIndex());
			cliente.setAnaerobicaI(r_anaerobica_inf.getSelectedIndex());
			cliente.setAnaerobicaS(r_anaerobica_sup.getSelectedIndex());
			cliente.setCoeficienteProgreso(Estres.getCoProgreso(CategoriaIMC,r_aerobica.getSelectedIndex()));
			cliente.setMotivacion(motivacion.getSelectedIndex());
			
		}catch(Exception ex ){
			ex.printStackTrace();
			JOptionPane.showConfirmDialog(this,"datos con formato incorrecto");
			return false;
		}
		return true;
				
	}


	private void addLesionLeve(java.awt.event.ActionEvent evt) {
        
		int index = lesiones1.getSelectedIndex();
		if(	!this.LesionSelect(model1.getElementAt(index).toString())){
			model2.add(model2.getSize(), model1.getElementAt(index).toString()+"(Leve)");
			this.removeLesion(index,true);
		}
    }

    private void addLesionGrave(java.awt.event.ActionEvent evt) {

		try{
			int index = lesiones1.getSelectedIndex();
			if(	!this.LesionSelect(model1.getElementAt(index).toString())){
				model2.add(model2.getSize(), model1.getElementAt(index).toString()+"(GRAVE)");
				this.removeLesion(index,true);
			}
		}catch(java.lang.ArrayIndexOutOfBoundsException ex){
			ex.printStackTrace();
		}
		
    }
    private void introducirLesiones() {
    	
    	model1= new DefaultListModel();
		model2 = new DefaultListModel();
    	try{
        	
    		this.ListarLesiones(em);
        	List<Lesion> listado = this.listaLesiones;
        	
        	for( Lesion lesion : listado){
        		model1.addElement(lesion.getNombre());
        	}

    	}catch(Exception ex){
    		ex.printStackTrace();
    		System.out.println("fallo en la BBDD a�adir datos falsos");
    		model1.addElement("Pubalgia");
    		model1.addElement("Sobrecarga piramidal");
    		model1.addElement("Pubalgia1");
    		model1.addElement("Pubalgia2");
    		
    	}finally{
    		lesiones2.setModel(model2);
    		lesiones1.setModel(model1);    		
    	}
		
		this.cargarDatos();

	}
	private boolean LesionSelect(String valor){
	//	boolean result = false;
		
		return model2.getSize()>0;
	//	for(int i =0 ; i<model2.getSize();i++){
			
	//		if(model2.get(i).toString().equals(valor+"(Grave)")||model2.get(i).toString().equals(valor+"(Leve)")){
	//			result=true;
	//		}
	//	}
		
	//	return result;
	}
	private void addLessionGrave(java.awt.event.ActionEvent evt){
		try{

			int index = lesiones1.getSelectedIndex();
			if(	!this.LesionSelect(model1.getElementAt(index).toString())){
				model2.add(model2.getSize(), model1.getElementAt(index).toString()+"(GRAVE)");
				this.removeLesion(index,true);
			}
		}catch( java.lang.ArrayIndexOutOfBoundsException ex){
			ex.printStackTrace();
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

		try{
			int index = lesiones2.getSelectedIndex();
			if(	!( model2.size()== 0)){
				String aux = model2.getElementAt(index).toString();
				String lesion = aux.substring(0,aux.indexOf("("));
				model1.add(model1.getSize(), lesion);
				this.removeLesion(index,false);
			}
		}catch(java.lang.ArrayIndexOutOfBoundsException ex){ex.printStackTrace();}
    }
	
	
	
	private void cargarDatos(){
		
		nombre.setText("Diego");
		apellidos.setText("Gonzalez Bahamonde");
		edad.setText("27");
		dni.setText("jasld");
		peso.setText("75");
		altura.setText("1.73");
		pulsaciones.setText("60");
		this.objetivo.setSelectedIndex(1);
		this.dias.setSelectedIndex(4);
		
	}

}
