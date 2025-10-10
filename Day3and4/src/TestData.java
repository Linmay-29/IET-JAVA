import java.util.Arrays;
import java.util.Date;

public class TestData {
	private int testId;
	private String testName;
	private Date testDate;
	private Question [] queArr;
	private int size;
	
	public TestData() {
		super();
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "TestData [testId=" + testId + ", testName=" + testName + ", testDate=" + testDate + ", queArr="
				+ Arrays.toString(queArr) + "]";
	}
	public TestData(int testId, String testName, Date testDate, Question[] queArr, int size) {
		super();
		this.testId = testId;
		this.testName = testName;
		this.testDate = testDate;
		this.queArr = queArr;
		this.size = size;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public Date getTestDate() {
		return testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	public Question[] getQueArr() {
		return queArr;
	}
	public void setQueArr(Question[] queArr) {
		this.queArr = queArr;
	}
}
