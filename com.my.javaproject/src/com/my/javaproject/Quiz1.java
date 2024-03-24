package com.my.javaproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.ComponentOrientation;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quiz1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton option1_1;
	private final JPanel panel = new JPanel();
	private JButton next;
	public static int i = 0;
	/**
	 * Launch the application.
	 */ 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz1 frame = new Quiz1();
					
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
	public Quiz1() {
		setResizable(false);
		setVisible(true);
		setName("q1");
		setFont(new Font("Noto Sans", Font.PLAIN, 12));
		setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(new Color(0, 255, 0));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(10, 10, 416, 36);
		contentPane.add(panel);
		
		JLabel Head = new JLabel("JAVA QUIZ ONLINE");
		Head.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel.add(Head);
		
		JLabel q1 = new JLabel("Java Keywords are written in lowercase as well as uppercase?");
		q1.setLabelFor(this);
		q1.setToolTipText("Question 1");
		q1.setFont(new Font("Tahoma", Font.BOLD, 12));
		q1.setBounds(10, 56, 416, 53);
		contentPane.add(q1);
		JLabel desc1 = new JLabel("Java keywords are always written in lowercase");
		desc1.setVisible(false);
		JButton option1 = new JButton("True");
		option1.setBorderPainted(false);
		option1.setBackground(new Color(255, 255, 255));
		option1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					String result = "";
                    result += "Question 1: Wrong.\n";
                    option1.setEnabled(false);
                    option1_1.setEnabled(false);
                    desc1.setForeground(new Color(255,0,0));
                    desc1.setBounds(66, 196, 268, 21);

                desc1.setVisible(true);
                next.setBounds(131,222,118,31);
                
                JOptionPane.showMessageDialog(null, result, "Quiz Result", JOptionPane.INFORMATION_MESSAGE);
                
                
			}
		});
		option1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		option1.setBounds(131, 117, 132, 21);
		contentPane.add(option1);
		
		option1_1 = new JButton("False");
		option1_1.setBorderPainted(false);
		option1_1.setBackground(new Color(255, 255, 255));
		option1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				++i;
				String result="";
                option1.setEnabled(false);
                option1_1.setEnabled(false);
				result += "Question 1: Correct!\n";
				desc1.setVisible(true);
				next.setBounds(131,222,118,31);
				JOptionPane.showMessageDialog(null, result, "Quiz Result", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		option1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		option1_1.setBounds(131, 155, 132, 21);
		contentPane.add(option1_1);
		
		
		desc1.setForeground(new Color(0, 255, 0));
		
		desc1.setBounds(66, 189, 268, 21);
		contentPane.add(desc1);
		
		next = new JButton("Next");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Quiz2 quiz2 = new Quiz2();
				quiz2.setVisible(true);
			}
		});
		next.setBackground(new Color(0, 255, 0));
		next.setFont(new Font("Tahoma", Font.BOLD, 15));
		next.setBounds(131, 186, 118, 31);
		contentPane.add(next);
	}
}
