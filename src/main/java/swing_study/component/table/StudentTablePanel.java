package swing_study.component.table;

import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class StudentTablePanel extends AbstractCustomTablePanel<Student> {

	@Override
	protected void setAlignAndWidth() {
		// 컬럼별 내용 정렬
		setTableCellAlign(SwingConstants.CENTER, 0, 1, 2, 3);

		// 컬럼별 너비 조정
		setTableCellWidth(100, 250, 100, 100);

	}

	@Override
	public Object[] toArray(Student t) {
		return new Object[] {
				t.getStdNo(),
				t.getStdName(),
				t.getStdGrade(),
				t.getBanCode().getBanCode()
		};
	}

	@Override
	public String[] getColumnNames() {
		return new String[] {"학번", "학생명", "학년", "반"};
	}

}
