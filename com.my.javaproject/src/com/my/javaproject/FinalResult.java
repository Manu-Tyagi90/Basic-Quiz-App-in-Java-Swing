package com.my.javaproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class FinalResult extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static int i = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() { 
				try {
					FinalResult frame = new FinalResult();
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
	public FinalResult() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 39, 416, 214);
		panel.setBackground(new Color(0, 255, 0));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel boilerplate = new JLabel("Congratulations,\r\n You Get ");
		boilerplate.setBounds(59, 5, 298, 32);
		boilerplate.setFont(new Font("Tahoma", Font.PLAIN, 26));
		boilerplate.setHorizontalTextPosition(SwingConstants.CENTER);
		boilerplate.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(boilerplate);
		
		i = Quiz2.i;
		
		
		JLabel finalscore = new JLabel("");
		finalscore.setFont(new Font("Tahoma", Font.BOLD, 30));
		finalscore.setText(i+"/2");
		finalscore.setBounds(168, 76, 71, 46);
		panel.add(finalscore);
		
		JLabel qfr = new JLabel("Quiz Final Result");
		qfr.setBounds(127, 10, 166, 19);
		qfr.setFont(new Font("Tahoma", Font.PLAIN, 21));
		contentPane.add(qfr);
	}

}
