package swing_study.listner;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class MouseAdapterEx extends JFrame {

	private JPanel contentPane;

	public MouseAdapterEx() {
		initialize();
	}
	private void initialize() {
		setTitle("마우스어댑터");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(75, 65, 57, 15);
		contentPane.add(lblNewLabel);
	}

}
