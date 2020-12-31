import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class waterCulculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					waterCulculator window = new waterCulculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public waterCulculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HOW MUCH WATER SHOULD I DRINK?");
		lblNewLabel.setBounds(95, 28, 212, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("MY WEIGHT (KG):");
		lblNewLabel_1.setBounds(49, 88, 108, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(221, 95, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("TELL ME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double num, ans;
				try {
					num= Double.parseDouble(textField.getText());
					
					ans=num*0.33;
					JOptionPane.showMessageDialog(null, "You should drink" + ans +"liters of water a day!");
				}catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please enter valid number");
				}
			}
				
				
		});
		btnNewButton.setBounds(158, 160, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
