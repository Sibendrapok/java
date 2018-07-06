package Display;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.SwingWorker;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Counter_Display extends JFrame {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counter_Display window = new Counter_Display();
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
	public Counter_Display() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 414, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("botton was clicked:");
				
				 SwingWorker<Void, Integer> worker=new SwingWorker<Void,Integer>() {
                       @Override
					protected Void doInBackground() throws Exception {
						
							for (int i =0;i<=10;i++) 
							{
							    System.out.println(i);
								Thread.sleep(1000);
						    publish(i);
							}
							
							return null;
						}
					@Override				
					protected void process(List<Integer> chunks) {
					Integer value = chunks.get(chunks.size()-1);
						textField.setText(" current value"+value);
							
						}
				};
		}
				

		});
		btnNewButton.setBounds(135, 208, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Stop");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 textField.setText(null);
			}
		});
		btnNewButton_1.setBounds(135, 261, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(72, 75, 237, 33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}