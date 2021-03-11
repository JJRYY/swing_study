package swing_study.menu;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class JPopMenuFrameEx extends JFrame {

	private JPanel contentPane;
	private JLabel imgLabel = new JLabel();

	public JPopMenuFrameEx() {
		initialize();
	}

	private void initialize() {
		setTitle("JPopMenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		contentPane.setComponentPopupMenu(createPopupMenu());
		
		contentPane.add(imgLabel, BorderLayout.SOUTH);
		imgLabel.setHorizontalAlignment(SwingConstants.CENTER);
	}

	private JPopupMenu createPopupMenu() {
		// 팝업 메뉴는 윈도우빌더로 하기가 불편
		JPopupMenu popupMenu = new JPopupMenu();

		JMenuItem mnLoad = new JMenuItem("Load");
		mnLoad.addActionListener(listener);
		popupMenu.add(mnLoad);
		
		JMenuItem mnHide = new JMenuItem("Hide");
		mnHide.addActionListener(listener);
		popupMenu.add(mnHide);
		
		JMenuItem mnReShow = new JMenuItem("ReShow");
		mnReShow.addActionListener(listener);
		popupMenu.add(mnReShow);
		
		JMenuItem mnExit = new JMenuItem("Exit");
		mnExit.addActionListener(listener);
		popupMenu.add(mnExit);

		return popupMenu;
	}

	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("Load")) {
				String imgPath = System.getProperty("user.dir") + File.separator + "images" + File.separator;

				ImageIcon icon = new ImageIcon(imgPath + "1038.jpg");
				Image changeIcon = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
				imgLabel.setIcon(new ImageIcon(changeIcon));

			} else if (e.getActionCommand().equals("Hide")) {
				imgLabel.setVisible(false);
			} else if (e.getActionCommand().equals("ReShow")) {
				imgLabel.setVisible(true);
			} else if (e.getActionCommand().equals("Exit")) {
				System.exit(0);
			}

		}

	};
}
