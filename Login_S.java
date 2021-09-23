package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_S {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_S window = new Login_S();
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
	public Login_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel userIdLbl = new JLabel("User Name");
		userIdLbl.setFont(new Font("Tahoma", Font.PLAIN, 11));
		userIdLbl.setBounds(134, 66, 60, 13);
		frame.getContentPane().add(userIdLbl);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(240, 63, 96, 19);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel passwordIdLbl = new JLabel("Password");
		passwordIdLbl.setFont(new Font("Tahoma", Font.PLAIN, 11));
		passwordIdLbl.setBounds(134, 133, 53, 13);
		frame.getContentPane().add(passwordIdLbl);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(240, 130, 96, 19);
		frame.getContentPane().add(txtPassword);
		
		JLabel lblNewLabel = new JLabel("Login Systems");
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(184, 10, 102, 19);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String password = txtPassword.getText();
				String username = txtUsername.getText();
				
				if(password.contains("king")&& username.contains("one")) {
					txtPassword.setText(null);
					txtUsername.setText(null);
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsername.setText(null);
				}
			}
		});
		btnNewButton.setForeground(SystemColor.textHighlight);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(28, 207, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnNewButton_1.setForeground(SystemColor.textHighlight);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(171, 207, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnNewButton_2.setForeground(SystemColor.textHighlight);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(323, 207, 85, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(28, 182, 380, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(28, 39, 380, 2);
		frame.getContentPane().add(separator_1);
	}
}
