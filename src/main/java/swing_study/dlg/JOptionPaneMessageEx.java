package swing_study.dlg;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JOptionPaneMessageEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton;

	public JOptionPaneMessageEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JOptionPaneMessage");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 562, 173);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("JOptionPane.showMessageDialog");
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("showMessageDialog");
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
//		parentComponent, message, title, messageType, icon
		String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator;
		ImageIcon icon = new ImageIcon(imgPath + "icon3.png");
		JOptionPane.showMessageDialog(
				null, 
				"조심하세요", 
				"조심", 
				JOptionPane.WARNING_MESSAGE, 
				icon);
	}
}
