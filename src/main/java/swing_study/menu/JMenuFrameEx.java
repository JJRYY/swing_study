package swing_study.menu;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JMenuFrameEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel imgLabel;
	private JMenuItem mnLoad;
	private JMenuItem mnHide;
	private JMenuItem mnReShow;
	private JMenuItem mnExit;

	public JMenuFrameEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JMenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnScreen = new JMenu("Screen");
		menuBar.add(mnScreen);
		
		mnLoad = new JMenuItem("Load");
		mnLoad.addActionListener(this);
		mnScreen.add(mnLoad);
		
		mnHide = new JMenuItem("Hide");
		mnHide.addActionListener(this);
		mnScreen.add(mnHide);
		
		mnReShow = new JMenuItem("ReShow");
		mnReShow.addActionListener(this);
		mnScreen.add(mnReShow);
		
		JSeparator separator = new JSeparator();
		mnScreen.add(separator);
		
		mnExit = new JMenuItem("Exit");
		mnExit.addActionListener(this);
		mnScreen.add(mnExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		imgLabel = new JLabel("");
		contentPane.add(imgLabel, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mnExit) {
			actionPerformedMnExit(e);
		}
		if (e.getSource() == mnReShow) {
			actionPerformedMnReShow(e);
		}
		if (e.getSource() == mnHide) {
			actionPerformedMnHide(e);
		}
		if (e.getSource() == mnLoad) {
			actionPerformedMnLoad(e);
		}
	}
	protected void actionPerformedMnLoad(ActionEvent e) {
		String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator;
		if (imgLabel.getIcon() != null) 
			return;
		ImageIcon icon = new ImageIcon(imgPath + "1038.jpg");
		Image changeIcon = icon.getImage().getScaledInstance(imgLabel.getWidth(), imgLabel.getHeight(), Image.SCALE_SMOOTH);
		imgLabel.setIcon(new ImageIcon(changeIcon));
	}
	protected void actionPerformedMnHide(ActionEvent e) {
		if (imgLabel.getIcon() == null) 
			return;
		imgLabel.setVisible(false);
	}
	protected void actionPerformedMnReShow(ActionEvent e) {
		if (imgLabel.getIcon() == null) 
			return;
		imgLabel.setVisible(true);
	}
	protected void actionPerformedMnExit(ActionEvent e) {
		System.exit(0);
	}
}
