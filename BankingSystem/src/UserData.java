
public class UserData {
	private String uName;
	private String uEmail;
	private String uPhnNo;
	
	public UserData(String uName, String uEmail, String uPhnNo) {
		this.uName = uName;
		this.uEmail = uEmail;
		this.uPhnNo = uPhnNo;
	}

	public UserData() {
	}

	@Override
	public String toString() {
		return "UserData [uName=" + uName + ", uEmail=" + uEmail + ", uPhnNo=" + uPhnNo + "]";
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuPhnNo() {
		return uPhnNo;
	}

	public void setuPhnNo(String uPhnNo) {
		this.uPhnNo = uPhnNo;
	}
}
