package swing_study.dlg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class JOptionPaneConfirmEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JLabel lblRes;

	public JOptionPaneConfirmEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JOptionPaneConfirm");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 551, 188);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblRes = new JLabel("showConfirmDialog(parentComponent, message, title, optionType, messageType, icon)");
		lblRes.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblRes);
		
		btnNewButton = new JButton("Gotcha");
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(e);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent e) {
//		showConfirmDialog(parentComponent, message, title, optionType, messageType, icon)
//		optiontype = YES_NO_OPTION, YES_NO_CANCEL_OPTION, OK_CANCEL_OPTION
		String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator;
		ImageIcon icon = new ImageIcon(imgPath + "icon2.png");
		
		int res = JOptionPane.showConfirmDialog(
					null, 
					"계속 할 것입니까?", 
					"Confirm", 
					JOptionPane.YES_NO_CANCEL_OPTION, 
					JOptionPane.WARNING_MESSAGE, 
					icon
				);
		
		if (res == JOptionPane.YES_OPTION) {
			lblRes.setText("YES");
		} 
		if (res == JOptionPane.NO_OPTION) {
			lblRes.setText("NO");
		} 
		if (res == JOptionPane.CANCEL_OPTION) {
			lblRes.setText("CANCEL");
		} 
		if (res == -1) {
			lblRes.setText("선택안함");
		} 
		
//		System.out.println(res);
	}
}
