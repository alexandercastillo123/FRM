package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class frm09 extends JFrame {
	private static final long serialVersionUID = 1L;
	JTextField txtcifras, txttotalsuma;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm09 frame = new frm09();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public frm09() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 300, 250);
		setLayout(null);
		setLocationRelativeTo(null);

		JLabel lblcifras = new JLabel("N° de 4 cifras");
		lblcifras.setBounds(50, 50, 80, 30);
		getContentPane().add(lblcifras);

		JLabel lbltotalsuma = new JLabel("Suma de cifras");
		lbltotalsuma.setBounds(50, 90, 80, 30);
		getContentPane().add(lbltotalsuma);

		txtcifras = new JTextField();
		txtcifras.setBounds(130, 50, 60, 30);
		txtcifras.setHorizontalAlignment(SwingConstants.RIGHT);
		txtcifras.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txtcifras);
		
		txttotalsuma = new JTextField();
		txttotalsuma.setBounds(130, 90, 60, 30);
		txttotalsuma.setFocusable(false);
		txttotalsuma.setHorizontalAlignment(SwingConstants.RIGHT);
		txttotalsuma.setMargin(new Insets(5, 5, 5, 5));
		getContentPane().add(txttotalsuma);

		JButton btnCalcular = new JButton("Suma");
		btnCalcular.setBounds(100, 150, 100, 30);
		btnCalcular.setMnemonic('a');
		getContentPane().add(btnCalcular);	
		
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				btnCalcular_actionPerformed();
			}
		});
	}

	protected void btnCalcular_actionPerformed() {
		int digitos = Integer.parseInt(txtcifras.getText());
		
		double totalsuma = + digitos;

		DecimalFormat df = new DecimalFormat("###");
		txttotalsuma.setText( df.format(totalsuma));

	} 
}