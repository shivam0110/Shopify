package Logis_System;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Login_s {

	private JFrame frame;
	private JTextField User_Id;
	private JTextField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_s window = new Login_s();
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
	public Login_s() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login System");
		lblNewLabel.setBounds(191, 25, 89, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setBounds(83, 86, 65, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(83, 149, 65, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		User_Id = new JTextField();
		User_Id.setBounds(209, 83, 188, 19);
		frame.getContentPane().add(User_Id);
		User_Id.setColumns(10);
		
		Password = new JTextField();
		Password.setBackground(Color.WHITE);
		Password.setBounds(209, 146, 188, 19);
		frame.getContentPane().add(Password);
		//Password.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String UserName = User_Id.getText();
				String password = Password.getText();
				
				if(UserName.contains("") && password.contains(""))
				{
					User_Id.setText(null);
					Password.setText(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null,"Invalid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
					Password.setText(null);
					User_Id.setText(null);
				}
			}
		});
		btnLogin.setBounds(42, 202, 85, 21);
		frame.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				User_Id.setText(null);
				Password.setText(null);
			}
		});
		btnReset.setBounds(195, 202, 85, 21);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frmLoginSystem = new JFrame("Exit");
				Component frmLoginSytem = null;
			    int confirmed = JOptionPane.showConfirmDialog(null, 
			            "Are you sure you want to exit the program?", "Exit Program Message Box",
			            JOptionPane.YES_NO_OPTION);
			    
			    if(confirmed == JOptionPane.YES_OPTION)
			    {
			    	dispose();
			    }	
			}
			private void dispose() {
				System.exit(0);	
			}
		});
		btnExit.setBounds(342, 202, 85, 21);
		frame.getContentPane().add(btnExit);
	}
}
