
public class Question {
	private int qNum;
	private String que;
	private String op1;
	private String op2;
	private String op3;
	private String op4;
	private float marks;
	private String ans;
	
	public Question(int qNum, String que, String op1, String op2, String op3, String op4, float marks, String ans) {
		super();
		this.qNum = qNum;
		this.que = que;
		this.op1 = op1;
		this.op2 = op2;
		this.op3 = op3;
		this.op4 = op4;
		this.marks = marks;
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [qNum=" + qNum + ", que=" + que + ", op1=" + op1 + ", op2=" + op2 + ", op3=" + op3 + ", op4="
				+ op4 + ", marks=" + marks + ", ans=" + ans + "]";
	}

	public int getqNum() {
		return qNum;
	}

	public void setqNum(int qNum) {
		this.qNum = qNum;
	}

	public String getQue() {
		return que;
	}

	public void setQue(String que) {
		this.que = que;
	}

	public String getOp1() {
		return op1;
	}

	public void setOp1(String op1) {
		this.op1 = op1;
	}

	public String getOp2() {
		return op2;
	}

	public void setOp2(String op2) {
		this.op2 = op2;
	}

	public String getOp3() {
		return op3;
	}

	public void setOp3(String op3) {
		this.op3 = op3;
	}

	public String getOp4() {
		return op4;
	}

	public void setOp4(String op4) {
		this.op4 = op4;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}
	
	
}
