package swing_study.component.table;

public class Score {
	private int scoreNo;
	private Student stdNo;
	private Subject subjectCode;
	private int stdScore;

	public Score() {
	}

	public Score(Student stdNo) {
		this.stdNo = stdNo;
	}

	public Score(int scoreNo, Student stdNo, Subject subjectCode, int stdScore) {
		this.scoreNo = scoreNo;
		this.stdNo = stdNo;
		this.subjectCode = subjectCode;
		this.stdScore = stdScore;
	}

	public int getScoreNo() {
		return scoreNo;
	}

	public void setScoreNo(int scoreNo) {
		this.scoreNo = scoreNo;
	}

	public Student getStdNo() {
		return stdNo;
	}

	public void setStdNo(Student stdNo) {
		this.stdNo = stdNo;
	}

	public Subject getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(Subject subjectCode) {
		this.subjectCode = subjectCode;
	}

	public int getStdScore() {
		return stdScore;
	}

	public void setStdScore(int stdScore) {
		this.stdScore = stdScore;
	}

	@Override
	public String toString() {
		return String.format("Score [scoreNo=%s, stdNo=%s, subjectCode=%s, stdScore=%s]", scoreNo, stdNo, subjectCode,
				stdScore);
	}

}
