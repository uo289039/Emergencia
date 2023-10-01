package ui.Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Interfaz extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panelBotonesInicio;
	private JLabel lblIcono;
	private JPanel panelInicioOrganizador;
	private JPanel panel;
	private JButton btnRegistrarse;
	private JButton btnOrganizador;
	private JPanel panelInicioOrganizadores;
	private JPanel panelInicio;
	private JPanel panelEntradaOrganizadores;
	private JPanel panelRegistroAtletas;
	private JLabel lblCompeticiones;
	private JPanel panelTexto;
	private JLabel lblActuales;
	private JLabel lblEspacio;
	private JLabel lblEspacio2;
	private JPanel panelInfo;
	private JPanel panelCbox;
	private JPanel panelBtnRegistrarse;
	private JButton btnInscribirseCompeticion;
	private JLabel lblE3;
	private JLabel lblE2;
	private JComboBox comboBoxCompeticiones;
	private JLabel lblE1;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JButton btnVerCompeticionesRegistrado;
	private JPanel panelDatosOrganizador;
	private JPanel panelBotones;
	private JPanel panelBtn;
	private JButton btnAcceder;
	private JButton btnCancelar;
	private JPanel panelATextos;
	private JLabel lblTitulo;
	private JLabel lblA1;
	private JTextPane textPaneNombre;
	private JTextPane textPaneApellido;
	private JTextPane textPaneContrasena;
	private JTextPane textPaneContrasena2;
	private JLabel lblA2;
	private JPanel panelData;
	private JLabel lblA4;
	private JLabel lblA3;
	private JTextField textFieldNombre;
	private JTextField textFieldApellido;
	private JPasswordField passwordFieldContraseña;
	private JPasswordField passwordFieldContraseña2;
	private JPanel panelPreinscripcion;
	private JPanel panelATextosAt;
	private JLabel lblA1_1;
	private JLabel lblA2_1;
	private JTextPane textPaneNombreAt;
	private JTextPane textPaneDniAt;
	private JPanel panelDataAt;
	private JLabel lblA3_1;
	private JLabel lblA4_1;
	private JTextField textFieldNombreAt;
	private JTextField textFieldDniAt;
	private JLabel lblTituloAt;
	private JPanel panelBotonesAt;
	private JPanel panelBtnAt;
	private JButton btnPreinscribirse;
	private JButton btnCancelarAt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Interfaz.class.getResource("/img/logo.png")));
		setTitle("Competiciones y Gesti\u00F3n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 732, 508);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		contentPane.add(getPanelInicio(), "Inicio");
		contentPane.add(getPanelEntradaOrganizadores(), "name_20049447146900");
		contentPane.add(getPanelRegistroAtletas(), "name_20159092095400");
		contentPane.add(getPanelPreinscripcion(), "name_251172235319400");
		
		
		//contentPane.add(getP)
		
	}
	private JPanel getPanelBotonesInicio() {
		if (panelBotonesInicio == null) {
			panelBotonesInicio = new JPanel();
			panelBotonesInicio.setBackground(Color.WHITE);
			panelBotonesInicio.setLayout(new BorderLayout(0, 0));
			panelBotonesInicio.add(getLblIcono(), BorderLayout.WEST);
			panelBotonesInicio.add(getPanelInicioOrganizador(), BorderLayout.EAST);
		}
		return panelBotonesInicio;
	}
	private JLabel getLblIcono() {
		if (lblIcono == null) {
			lblIcono = new JLabel("MULTICOMPETICI\u00D3N");
			lblIcono.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblIcono.setIcon(new ImageIcon(Interfaz.class.getResource("/img/logo.png")));
		}
		return lblIcono;
	}
	private JPanel getPanelInicioOrganizador() {
		if (panelInicioOrganizador == null) {
			panelInicioOrganizador = new JPanel();
			panelInicioOrganizador.setBackground(Color.WHITE);
			panelInicioOrganizador.setLayout(new GridLayout(5, 2, 0, 0));
			panelInicioOrganizador.add(getLbl3());
			panelInicioOrganizador.add(getLbl1());
			panelInicioOrganizador.add(getBtnOrganizador());
			panelInicioOrganizador.add(getBtnVerCompeticionesRegistrado());
			panelInicioOrganizador.add(getLbl4());
			panelInicioOrganizador.add(getLbl2());
		}
		return panelInicioOrganizador;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getBtnRegistrarse(), BorderLayout.EAST);
		}
		return panel;
	}
	private JButton getBtnRegistrarse() {
		if (btnRegistrarse == null) {
			btnRegistrarse = new JButton("Registrarse Deportistas");
		}
		return btnRegistrarse;
	}
	private JButton getBtnOrganizador() {
		if (btnOrganizador == null) {
			btnOrganizador = new JButton("Acceso Organizadores");
			btnOrganizador.setBackground(Color.WHITE);
		}
		return btnOrganizador;
	}
	
	
	private JPanel getPanelInicio() {
		if (panelInicio == null) {
			panelInicio = new JPanel();
			panelInicio.setBackground(Color.WHITE);
			panelInicio.setLayout(new BorderLayout(0, 0));
			panelInicio.add(getPanelBotonesInicio(),BorderLayout.NORTH);
			panelInicio.add(getPanel(),BorderLayout.SOUTH);
		}
		return panelInicio;
	}
	private JPanel getPanelEntradaOrganizadores() {
		if (panelEntradaOrganizadores == null) {
			panelEntradaOrganizadores = new JPanel();
			panelEntradaOrganizadores.setBackground(Color.WHITE);
			panelEntradaOrganizadores.setLayout(new BorderLayout(0, 0));
			panelEntradaOrganizadores.add(getPanelDatosOrganizador(), BorderLayout.CENTER);
			panelEntradaOrganizadores.add(getPanelBotones(), BorderLayout.SOUTH);
		}
		return panelEntradaOrganizadores;
	}
	private JPanel getPanelRegistroAtletas() {
		if (panelRegistroAtletas == null) {
			panelRegistroAtletas = new JPanel();
			panelRegistroAtletas.setBackground(Color.WHITE);
			panelRegistroAtletas.setLayout(new BorderLayout(0, 0));
			panelRegistroAtletas.add(getLblCompeticiones(), BorderLayout.NORTH);
			panelRegistroAtletas.add(getPanelTexto(), BorderLayout.WEST);
			panelRegistroAtletas.add(getPanelInfo(), BorderLayout.CENTER);
			panelRegistroAtletas.add(getPanelBtnRegistrarse(), BorderLayout.SOUTH);
		}
		return panelRegistroAtletas;
	}
	private JLabel getLblCompeticiones() {
		if (lblCompeticiones == null) {
			lblCompeticiones = new JLabel("COMPETICIONES");
			lblCompeticiones.setIcon(new ImageIcon(Interfaz.class.getResource("/img/deportes.png")));
			lblCompeticiones.setFont(new Font("Tahoma", Font.PLAIN, 16));
		}
		return lblCompeticiones;
	}
	private JPanel getPanelTexto() {
		if (panelTexto == null) {
			panelTexto = new JPanel();
			panelTexto.setBackground(Color.WHITE);
			panelTexto.setLayout(new BorderLayout(0, 0));
			panelTexto.add(getLabel_1(), BorderLayout.CENTER);
			panelTexto.add(getLblEspacio(), BorderLayout.WEST);
			panelTexto.add(getLblEspacio2(), BorderLayout.EAST);
		}
		return panelTexto;
	}
	private JLabel getLabel_1() {
		if (lblActuales == null) {
			lblActuales = new JLabel("Competiciones Actuales:");
			lblActuales.setBackground(Color.WHITE);
		}
		return lblActuales;
	}
	private JLabel getLblEspacio() {
		if (lblEspacio == null) {
			lblEspacio = new JLabel("      ");
		}
		return lblEspacio;
	}
	private JLabel getLblEspacio2() {
		if (lblEspacio2 == null) {
			lblEspacio2 = new JLabel("        ");
		}
		return lblEspacio2;
	}
	private JPanel getPanelInfo() {
		if (panelInfo == null) {
			panelInfo = new JPanel();
			panelInfo.setBackground(Color.WHITE);
			panelInfo.setLayout(new BorderLayout(0, 0));
			panelInfo.add(getPanelCbox(), BorderLayout.CENTER);
		}
		return panelInfo;
	}
	private JPanel getPanelCbox() {
		if (panelCbox == null) {
			panelCbox = new JPanel();
			panelCbox.setBackground(Color.WHITE);
			panelCbox.setLayout(new GridLayout(7, 1, 0, 0));
			panelCbox.add(getLblE3());
			panelCbox.add(getLblE2());
			panelCbox.add(getLblE1());
			panelCbox.add(getComboBoxCompeticiones());
		}
		return panelCbox;
	}
	private JPanel getPanelBtnRegistrarse() {
		if (panelBtnRegistrarse == null) {
			panelBtnRegistrarse = new JPanel();
			panelBtnRegistrarse.setBackground(Color.WHITE);
			panelBtnRegistrarse.setLayout(new BorderLayout(0, 0));
			panelBtnRegistrarse.add(getBtnInscribirseCompeticion(), BorderLayout.EAST);
		}
		return panelBtnRegistrarse;
	}
	private JButton getBtnInscribirseCompeticion() {
		if (btnInscribirseCompeticion == null) {
			btnInscribirseCompeticion = new JButton("Inscribirse");
		}
		return btnInscribirseCompeticion;
	}
	private JLabel getLblE3() {
		if (lblE3 == null) {
			lblE3 = new JLabel("");
		}
		return lblE3;
	}
	private JLabel getLblE2() {
		if (lblE2 == null) {
			lblE2 = new JLabel("");
		}
		return lblE2;
	}
	private JComboBox getComboBoxCompeticiones() {
		if (comboBoxCompeticiones == null) {
			comboBoxCompeticiones = new JComboBox();
			comboBoxCompeticiones.setBackground(Color.WHITE);
		}
		return comboBoxCompeticiones;
	}
	private JLabel getLblE1() {
		if (lblE1 == null) {
			lblE1 = new JLabel("");
		}
		return lblE1;
	}
	private JLabel getLbl1() {
		if (lbl1 == null) {
			lbl1 = new JLabel("        ");
		}
		return lbl1;
	}
	private JLabel getLbl2() {
		if (lbl2 == null) {
			lbl2 = new JLabel("");
		}
		return lbl2;
	}
	private JLabel getLbl3() {
		if (lbl3 == null) {
			lbl3 = new JLabel("");
		}
		return lbl3;
	}
	private JLabel getLbl4() {
		if (lbl4 == null) {
			lbl4 = new JLabel(" ");
		}
		return lbl4;
	}
	private JButton getBtnVerCompeticionesRegistrado() {
		if (btnVerCompeticionesRegistrado == null) {
			btnVerCompeticionesRegistrado = new JButton("Mis Competiciones");
		}
		return btnVerCompeticionesRegistrado;
	}
	private JPanel getPanelDatosOrganizador() {
		if (panelDatosOrganizador == null) {
			panelDatosOrganizador = new JPanel();
			panelDatosOrganizador.setBackground(Color.WHITE);
			panelDatosOrganizador.setLayout(new BorderLayout(0, 0));
			panelDatosOrganizador.add(getPanelATextos(), BorderLayout.WEST);
			panelDatosOrganizador.add(getLblTitulo(), BorderLayout.NORTH);
			panelDatosOrganizador.add(getPanelData(), BorderLayout.CENTER);
		}
		return panelDatosOrganizador;
	}
	private JPanel getPanelBotones() {
		if (panelBotones == null) {
			panelBotones = new JPanel();
			panelBotones.setBackground(Color.WHITE);
			panelBotones.setLayout(new BorderLayout(0, 0));
			panelBotones.add(getPanelBtn(), BorderLayout.EAST);
		}
		return panelBotones;
	}
	private JPanel getPanelBtn() {
		if (panelBtn == null) {
			panelBtn = new JPanel();
			panelBtn.setLayout(new BorderLayout(0, 0));
			panelBtn.add(getBtnAcceder(), BorderLayout.EAST);
			panelBtn.add(getBtnCancelar(), BorderLayout.WEST);
		}
		return panelBtn;
	}
	private JButton getBtnAcceder() {
		if (btnAcceder == null) {
			btnAcceder = new JButton("Acceder");
			btnAcceder.setBackground(Color.GREEN);
		}
		return btnAcceder;
	}
	private JButton getBtnCancelar() {
		if (btnCancelar == null) {
			btnCancelar = new JButton("Cancelar");
			btnCancelar.setBackground(Color.RED);
		}
		return btnCancelar;
	}
	private JPanel getPanelATextos() {
		if (panelATextos == null) {
			panelATextos = new JPanel();
			panelATextos.setBackground(Color.WHITE);
			panelATextos.setLayout(new GridLayout(8, 1, 0, 0));
			panelATextos.add(getLblA1());
			panelATextos.add(getLabel_1_1());
			panelATextos.add(getTextPaneNombre());
			panelATextos.add(getTextPaneApellido());
			panelATextos.add(getTextPaneContrasena());
			panelATextos.add(getTextPaneContrasena2());
		}
		return panelATextos;
	}
	private JLabel getLblTitulo() {
		if (lblTitulo == null) {
			lblTitulo = new JLabel("Inicio Sesi\u00F3n Organizadores");
			lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return lblTitulo;
	}
	private JLabel getLblA1() {
		if (lblA1 == null) {
			lblA1 = new JLabel("       ");
		}
		return lblA1;
	}
	private JTextPane getTextPaneNombre() {
		if (textPaneNombre == null) {
			textPaneNombre = new JTextPane();
			textPaneNombre.setText("Introduzca su nombre:");
		}
		return textPaneNombre;
	}
	private JTextPane getTextPaneApellido() {
		if (textPaneApellido == null) {
			textPaneApellido = new JTextPane();
			textPaneApellido.setText("Introduzca su DNI:");
		}
		return textPaneApellido;
	}
	private JTextPane getTextPaneContrasena() {
		if (textPaneContrasena == null) {
			textPaneContrasena = new JTextPane();
			textPaneContrasena.setText("Introduzca su contraseña:");
		}
		return textPaneContrasena;
	}
	private JTextPane getTextPaneContrasena2() {
		if (textPaneContrasena2 == null) {
			textPaneContrasena2 = new JTextPane();
			textPaneContrasena2.setText("Introduzca su contraseña de nuevo:");
		}
		return textPaneContrasena2;
	}
	private JLabel getLabel_1_1() {
		if (lblA2 == null) {
			lblA2 = new JLabel("                ");
		}
		return lblA2;
	}
	private JPanel getPanelData() {
		if (panelData == null) {
			panelData = new JPanel();
			panelData.setBackground(Color.WHITE);
			panelData.setLayout(new GridLayout(8, 1, 0, 0));
			panelData.add(getLabel_1_3());
			panelData.add(getLabel_1_2());
			panelData.add(getTextFieldNombre());
			panelData.add(getTextFieldApellido());
			panelData.add(getPasswordFieldContraseña());
			panelData.add(getPasswordFieldContraseña2());
		}
		return panelData;
	}
	private JLabel getLabel_1_2() {
		if (lblA4 == null) {
			lblA4 = new JLabel(" ");
		}
		return lblA4;
	}
	private JLabel getLabel_1_3() {
		if (lblA3 == null) {
			lblA3 = new JLabel(" ");
		}
		return lblA3;
	}
	private JTextField getTextFieldNombre() {
		if (textFieldNombre == null) {
			textFieldNombre = new JTextField();
			textFieldNombre.setColumns(10);
		}
		return textFieldNombre;
	}
	private JTextField getTextFieldApellido() {
		if (textFieldApellido == null) {
			textFieldApellido = new JTextField();
			textFieldApellido.setColumns(10);
		}
		return textFieldApellido;
	}
	private JPasswordField getPasswordFieldContraseña() {
		if (passwordFieldContraseña == null) {
			passwordFieldContraseña = new JPasswordField();
		}
		return passwordFieldContraseña;
	}
	private JPasswordField getPasswordFieldContraseña2() {
		if (passwordFieldContraseña2 == null) {
			passwordFieldContraseña2 = new JPasswordField();
		}
		return passwordFieldContraseña2;
	}
	private JPanel getPanelPreinscripcion() {
		if (panelPreinscripcion == null) {
			panelPreinscripcion = new JPanel();
			panelPreinscripcion.setBackground(Color.WHITE);
			panelPreinscripcion.setLayout(new BorderLayout(0, 0));
			panelPreinscripcion.add(getPanelATextosAt(), BorderLayout.WEST);
			panelPreinscripcion.add(getPanelDataAt(), BorderLayout.CENTER);
			panelPreinscripcion.add(getLblTituloAt(), BorderLayout.NORTH);
			panelPreinscripcion.add(getPanelBotonesAt(), BorderLayout.SOUTH);
		}
		return panelPreinscripcion;
	}
	private JPanel getPanelATextosAt() {
		if (panelATextosAt == null) {
			panelATextosAt = new JPanel();
			panelATextosAt.setBackground(Color.WHITE);
			panelATextosAt.setLayout(new GridLayout(8, 1, 0, 0));
			panelATextosAt.add(getLblA1_1());
			panelATextosAt.add(getLblA2_1());
			panelATextosAt.add(getTextPaneNombreAt());
			panelATextosAt.add(getTextPaneDniAt());
		}
		return panelATextosAt;
	}
	private JLabel getLblA1_1() {
		if (lblA1_1 == null) {
			lblA1_1 = new JLabel("       ");
		}
		return lblA1_1;
	}
	private JLabel getLblA2_1() {
		if (lblA2_1 == null) {
			lblA2_1 = new JLabel("                ");
		}
		return lblA2_1;
	}
	private JTextPane getTextPaneNombreAt() {
		if (textPaneNombreAt == null) {
			textPaneNombreAt = new JTextPane();
			textPaneNombreAt.setText("Introduzca su nombre:");
		}
		return textPaneNombreAt;
	}
	private JTextPane getTextPaneDniAt() {
		if (textPaneDniAt == null) {
			textPaneDniAt = new JTextPane();
			textPaneDniAt.setText("Introduzca su DNI:");
		}
		return textPaneDniAt;
	}
	private JPanel getPanelDataAt() {
		if (panelDataAt == null) {
			panelDataAt = new JPanel();
			panelDataAt.setBackground(Color.WHITE);
			panelDataAt.setLayout(new GridLayout(8, 1, 0, 0));
			panelDataAt.add(getLblA3_1());
			panelDataAt.add(getLblA4_1());
			panelDataAt.add(getTextFieldNombreAt());
			panelDataAt.add(getTextFieldDniAt());
		}
		return panelDataAt;
	}
	private JLabel getLblA3_1() {
		if (lblA3_1 == null) {
			lblA3_1 = new JLabel(" ");
		}
		return lblA3_1;
	}
	private JLabel getLblA4_1() {
		if (lblA4_1 == null) {
			lblA4_1 = new JLabel(" ");
		}
		return lblA4_1;
	}
	private JTextField getTextFieldNombreAt() {
		if (textFieldNombreAt == null) {
			textFieldNombreAt = new JTextField();
			textFieldNombreAt.setColumns(10);
		}
		return textFieldNombreAt;
	}
	private JTextField getTextFieldDniAt() {
		if (textFieldDniAt == null) {
			textFieldDniAt = new JTextField();
			textFieldDniAt.setColumns(10);
		}
		return textFieldDniAt;
	}
	private JLabel getLblTituloAt() {
		if (lblTituloAt == null) {
			lblTituloAt = new JLabel("Datos Preinscripci\u00F3n");
			lblTituloAt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		}
		return lblTituloAt;
	}
	private JPanel getPanelBotonesAt() {
		if (panelBotonesAt == null) {
			panelBotonesAt = new JPanel();
			panelBotonesAt.setBackground(Color.WHITE);
			panelBotonesAt.setLayout(new BorderLayout(0, 0));
			panelBotonesAt.add(getPanelBtnAt(), BorderLayout.EAST);
		}
		return panelBotonesAt;
	}
	private JPanel getPanelBtnAt() {
		if (panelBtnAt == null) {
			panelBtnAt = new JPanel();
			panelBtnAt.setLayout(new BorderLayout(0, 0));
			panelBtnAt.add(getBtnPreinscribirse(), BorderLayout.WEST);
			panelBtnAt.add(getBtnCancelarAt(), BorderLayout.EAST);
		}
		return panelBtnAt;
	}
	private JButton getBtnPreinscribirse() {
		if (btnPreinscribirse == null) {
			btnPreinscribirse = new JButton("Preinscribirse");
			btnPreinscribirse.setBackground(Color.GREEN);
		}
		return btnPreinscribirse;
	}
	private JButton getBtnCancelarAt() {
		if (btnCancelarAt == null) {
			btnCancelarAt = new JButton("Cancelar");
			btnCancelarAt.setBackground(Color.RED);
		}
		return btnCancelarAt;
	}
}
