package swing_study.dlg;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

@SuppressWarnings("serial")
public class JFileChooserEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblImg;
	private JButton btnOpen;
	private JFileChooser chooser = new JFileChooser(System.getProperty("user.dir"));

	public JFileChooserEx() {
		initialize();
	}

	private void initialize() {
		setTitle("JFileChooser");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		lblImg = new JLabel("");
		contentPane.add(lblImg, BorderLayout.CENTER);

		btnOpen = new JButton("불러오기");
		btnOpen.addActionListener(this);
		contentPane.add(btnOpen, BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOpen) {
			if (e.getActionCommand().equals("불러오기")) {
				actionPerformedBtnOpen(e);
			} else {
				actionPerformedBtnSave(e);
			}
		}
	}

	private void actionPerformedBtnSave(ActionEvent e) {
		// download 폴더에 저장하기. download 폴더가 존재하지 않으면 생성 후 저장하기.
//		int res = chooser.showSaveDialog(null);
//		
//		if (res != JFileChooser.APPROVE_OPTION) {
//			JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다", "경고", JOptionPane.WARNING_MESSAGE);
//			return;
//		}
//		String imgPath = System.getProperty("user.dir") + File.separator ;
//		File imgToSave = (File) lblImg.getIcon();
//		try (FileInputStream fis = new FileInputStream(imgToSave);
//				FileOutputStream fos = new FileOutputStream(imgPath)) {
//			int data = 0;
//			while ((data = fis.read()) != -1) {
//				fos.write(data);
//			}
//		} catch (FileNotFoundException e1) {
//			e1.printStackTrace();
//		} catch (IOException e2) {
//			e2.printStackTrace();
//		}
//		
//		if (btnOpen.getText().equals("저장하기")) {
//			btnOpen.setText("불러오기");
//		}
		
		int res = chooser.showSaveDialog(null);

        if (res != JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다", "경고", JOptionPane.WARNING_MESSAGE);
            return;
        }

        ImageIcon icon = (ImageIcon) lblImg.getIcon();
        BufferedImage bi = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_RGB);
        
        Graphics2D g2 = bi.createGraphics();
        g2.drawImage(icon.getImage(), 0, 0, null);
        g2.dispose();
        
        String chooseFilePath = chooser.getSelectedFile().getPath();
        String extStr = chooseFilePath.substring(chooseFilePath.lastIndexOf(".") + 1);

        try {
            ImageIO.write(bi, extStr, new File(chooseFilePath));
            JOptionPane.showMessageDialog(null, chooseFilePath+" 에 저장되었습니다");
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        if (btnOpen.getText().equals("저장하기")) {
            btnOpen.setText("불러오기");
        }
 		
	}

	protected void actionPerformedBtnOpen(ActionEvent e) {
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"jpg & png & gif images", 
				"jpg", "png", "gif");
		chooser.setFileFilter(filter);
		
		int res = chooser.showOpenDialog(null);
		if (res != JFileChooser.APPROVE_OPTION) {
			JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다", "경고", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		String chooserFilePath = chooser.getSelectedFile().getPath();
		lblImg.setIcon(new ImageIcon(chooserFilePath));
		
		if (btnOpen.getText().equals("불러오기")) {
			btnOpen.setText("저장하기");
		}
	}
}
