package com.my.javaproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quiz2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel desc1;
	private JButton next;
	public static int i = 0 ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quiz2 frame = new Quiz2();
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
	public Quiz2() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.GREEN);
		panel.setBounds(10, 10, 416, 36);
		contentPane.add(panel);
		
		JLabel Head = new JLabel("JAVA QUIZ ONLINE");
		Head.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel.add(Head);
		
		JLabel q1 = new JLabel("an object could be................");
		q1.setToolTipText("Question 1");
		q1.setFont(new Font("Tahoma", Font.BOLD, 12));
		q1.setBounds(10, 56, 416, 41);
		contentPane.add(q1);
		
		JButton option1 = new JButton("Anything");
		option1.setBorderPainted(false);
		option1.setBackground(new Color(255, 255, 255));
		JButton option2 = new JButton("Algorithm");
		option2.setBorderPainted(false);
		option2.setBackground(new Color(255, 255, 255));
		JButton option3 = new JButton("Data Container");
		option3.setBorderPainted(false);
		option3.setBackground(new Color(255, 255, 255));
		
		
		option1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quiz1 qu = new Quiz1();
				i = Quiz1.i;
				++i;
				qu.setVisible(false); 
				String result="";
                option1.setEnabled(false);
                option2.setEnabled(false);
                option3.setEnabled(false);
				result += "Question 1: Correct!\n";
				desc1.setVisible(true);
				next.setBounds(131,222,118,31);
				JOptionPane.showMessageDialog(null, result, "Quiz Result", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		option1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		option1.setBounds(125, 107, 132, 21);
		contentPane.add(option1);
		
		
		option2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result="";
                option1.setEnabled(false);
                option2.setEnabled(false);
                option3.setEnabled(false);
                desc1.setForeground(new Color(255,0,0));
				result += "Question 1: Wrong!\n";
				desc1.setVisible(true);
				next.setBounds(131,222,118,31);
				JOptionPane.showMessageDialog(null, result, "Quiz Result", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		option2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		option2.setBounds(125, 138, 132, 21);
		contentPane.add(option2);
		
		
		option3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result="";
				
                option1.setEnabled(false);
                option2.setEnabled(false);
                option3.setEnabled(false);
                desc1.setForeground(new Color(255,0,0));
				result += "Question 1: Wrong!\n";
				desc1.setVisible(true);
				next.setBounds(131,222,118,31);
				JOptionPane.showMessageDialog(null, result, "Quiz Result", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		option3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		option3.setBounds(125, 169, 132, 21);
		contentPane.add(option3);
		
		next = new JButton("Get Score");
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				FinalResult fr = new FinalResult();
				fr.setVisible(true);
			}
		});
		next.setFont(new Font("Tahoma", Font.BOLD, 15));
		next.setBackground(Color.GREEN);
		next.setBounds(131, 186, 118, 31);
		contentPane.add(next);
		
		desc1 = new JLabel("An object could be anything.");
		desc1.setVisible(false);
		desc1.setForeground(new Color(0, 255, 0));
		desc1.setBackground(new Color(255, 255, 255));
		desc1.setBounds(121, 200, 168, 13);
		contentPane.add(desc1);
	}

}
