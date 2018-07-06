 package Calculators;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JTextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;


public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	double value1;
	double value2;
	double results;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 387, 481);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(50, 34, 253, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String btn= textField.getText()+btnNewButton.getText();
				textField.setText(btn);
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(50, 132, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn= textField.getText()+button.getText();
				textField.setText(btn);
			}
		});
		button.setForeground(Color.RED);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(214, 132, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("8");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn= textField.getText()+button_1.getText();
				textField.setText(btn);
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(135, 132, 89, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("5");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn= textField.getText()+button_2.getText();
				textField.setText(btn);
			}
		});
		button_2.setForeground(Color.RED);
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setBounds(135, 189, 89, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn= textField.getText()+button_3.getText();
				textField.setText(btn);
			}
		});
		button_3.setForeground(Color.RED);
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setBounds(50, 189, 89, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("3");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn= textField.getText()+button_4.getText();
				textField.setText(btn);
			}
		});
		button_4.setForeground(Color.RED);
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setBounds(50, 242, 89, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn= textField.getText()+button_5.getText();
				textField.setText(btn);
			
			}
		});
		button_5.setForeground(Color.RED);
		button_5.setBackground(Color.LIGHT_GRAY);
		button_5.setBounds(214, 189, 89, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("2");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn= textField.getText()+button_6.getText();
				textField.setText(btn);
			}
		});
		button_6.setForeground(Color.RED);
		button_6.setBackground(Color.LIGHT_GRAY);
		button_6.setBounds(135, 242, 89, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("0");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn= textField.getText()+button_7.getText();
				textField.setText(btn);
			}
		});
		button_7.setForeground(Color.RED);
		button_7.setBackground(Color.LIGHT_GRAY);
		button_7.setBounds(50, 287, 89, 23);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("1");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btn= textField.getText()+button_8.getText();
				textField.setText(btn);
			}
		});
		button_8.setForeground(Color.RED);
		button_8.setBackground(Color.LIGHT_GRAY);
		button_8.setBounds(214, 242, 89, 23);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("+");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				value1 =Double.parseDouble(textField.getText());
				textField.setText(" ");
				operations="+";
			}
		});
		button_9.setForeground(Color.RED);
		button_9.setBackground(Color.LIGHT_GRAY);
		button_9.setBounds(135, 287, 89, 23);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 =Double.parseDouble(textField.getText());
				textField.setText(" ");
				operations="-";
				
			}
		});
		button_10.setForeground(Color.RED);
		button_10.setBackground(Color.LIGHT_GRAY);
		button_10.setBounds(214, 287, 89, 23);
		contentPane.add(button_10);
		
		JButton btnNewButton_1 = new JButton("/");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 =Double.parseDouble(textField.getText());
				textField.setText(" ");
				operations="/";
			}
		});
		btnNewButton_1.setBounds(50, 388, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton button_11 = new JButton("=");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2 =Double.parseDouble(textField.getText());
				textField.setText(" ");
				if(operations=="+") {
					results=value1 + value2;
				answer = String.format("%.2f", results);
				textField.setText(answer);
				}
				else if(operations=="*") {
					results=value1 * value2;
				answer = String.format("%.2f", results);
				textField.setText(answer);
				}
				else if(operations=="-") {
					results=value1 - value2;
				answer = String.format("%.2f", results);
				textField.setText(answer);
				}
				else if(operations=="/") {
					results=value1 / value2;
				answer = String.format("%.2f", results);
				textField.setText(answer);
				}
			}
		});
		button_11.setBounds(214, 336, 89, 23);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("*");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 =Double.parseDouble(textField.getText());
				textField.setText(" ");
				operations="*";
			}
		});
		button_12.setBounds(135, 336, 89, 23);
		contentPane.add(button_12);
		
		JButton btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_2.setBounds(141, 388, 162, 23);
		contentPane.add(btnNewButton_2);
		
		JButton button_13 = new JButton(".");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1 =Double.parseDouble(textField.getText());
				textField.setText(" ");
			}
		});
		button_13.setBounds(50, 336, 89, 23);
		contentPane.add(button_13);
		
		JLabel lblNewLabel = new JLabel("By Sibendra Pokhrel");
		lblNewLabel.setFont(new Font("Verdana", Font.ITALIC, 11));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(50, 91, 253, 23);
		contentPane.add(lblNewLabel);
		
	}
}
