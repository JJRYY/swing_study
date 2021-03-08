package swing_study.component;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import swing_study.panel.Department;
import swing_study.panel.DeptPanel;
import swing_study.panel.Employee;
import swing_study.panel.TitlePanel;
import swing_study.panel.EmployeePanel;
import swing_study.panel.Title;

@SuppressWarnings("serial")
public class JTabbedPaneEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnConfirm;
	private JTabbedPane tabbedPane;
	private DeptPanel pDept;
	private TitlePanel pTitle;
	private EmployeePanel pEmp;

	public JTabbedPaneEx() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		pDept = new DeptPanel();
		tabbedPane.addTab("부서", null, pDept, "부서관리");
		
		pTitle = new TitlePanel();
		tabbedPane.addTab("직책", null, pTitle, "직책관리");
		
		pEmp = new EmployeePanel();
		tabbedPane.addTab("사원", null, pEmp, "사원관리");
		
		JPanel pSouth = new JPanel();
		contentPane.add(pSouth, BorderLayout.SOUTH);
		
		btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(this);
		pSouth.add(btnConfirm);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConfirm) {
			actionPerformedBtnConfirm(e);
		}
	}
	protected void actionPerformedBtnConfirm(ActionEvent e) {
		// 선택된 탭을 가져와서 get 메서드 호출
		Component comp = tabbedPane.getSelectedComponent();
//		System.out.println(comp);
		if (comp == pDept) {
			DeptPanel deptPanel = (DeptPanel) comp;
			Department dept = deptPanel.getDepartment();
			JOptionPane.showMessageDialog(null, dept);
		} else if (comp == pTitle) {
			TitlePanel titlePanel = (TitlePanel) comp;
			Title title = titlePanel.getTitle();
			JOptionPane.showMessageDialog(null, title);
		} else if (comp == pEmp) {
			EmployeePanel empPanel = (EmployeePanel) comp;
			Employee emp = empPanel.getEmployee();
			JOptionPane.showMessageDialog(null, emp);
		}
	}
}
