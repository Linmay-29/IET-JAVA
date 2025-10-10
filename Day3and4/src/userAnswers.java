import java.util.Arrays;

public class userAnswers {
	private int testId;
	private int qNo[];
	private boolean qAns[];
	private float totalMarks;
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public int[] getqNo() {
		return qNo;
	}
	public void setqNo(int[] qNo) {
		this.qNo = qNo;
	}
	public boolean[] getqAns() {
		return qAns;
	}
	public void setqAns(boolean[] qAns) {
		this.qAns = qAns;
	}
	public float getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(float totalMarks) {
		this.totalMarks = totalMarks;
	}
	@Override
	public String toString() {
		return "userAnswers [testId=" + testId + ", qNo=" + Arrays.toString(qNo) + ", qAns=" + Arrays.toString(qAns)
				+ ", totalMarks=" + totalMarks + "]";
	}
	public userAnswers() {
		super();
	}
	public userAnswers(int testId, int[] qNo, boolean[] qAns, float totalMarks) {
		super();
		this.testId = testId;
		this.qNo = qNo;
		this.qAns = qAns;
		this.totalMarks = totalMarks;
	}
}
