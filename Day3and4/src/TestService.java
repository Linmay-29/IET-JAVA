import java.text.SimpleDateFormat;
import java.util.*;
public class TestService {
	static TestData[] tArr;
	static int tcnt;
	static userAnswers[] uAnswer;
	static int ucnt;
	static {
		ucnt =0;
		tcnt = 0;
		tArr = new TestData [10];
		uAnswer = new userAnswers[10];
	}
	public static boolean acceptQue() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter test no. :");
		int testNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter test name");
		String testName = sc.nextLine();
		System.out.println("Enter test date (dd/mm/yyyy)");
		String tDate = sc.nextLine();
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		Date td = null;
		try {
			td = sd.parse(tDate);
		}catch (Exception e) {
			e.toString();
		}
		
		String choice;
		int qcnt = 0;
		Question[] qList = new Question[10];
		do {
			
			System.out.println("Enter que no. :");
			int queNo = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter que :");
			String que = sc.nextLine();
			
			System.out.println("Enter option 1");
			String op1 = sc.nextLine();
			
			System.out.println("Enter option 2");
			String op2 = sc.nextLine();
			
			System.out.println("Enter option 3");
			String op3 = sc.nextLine();
			
			System.out.println("Enter option 4");
			String op4 = sc.nextLine();
			
			System.out.println("Enter Ans");
			String ans = sc.nextLine();
			
			System.out.println("Enter question mark");
			float mark = sc.nextFloat();
			
			qList[qcnt] = new Question(queNo, que, op1, op2, op3, op4, mark, ans);
			qcnt++;
			
			System.out.println("Do you want to add (y/n)");
			choice = sc.next();
		}while(!choice.equals("n"));
		if(tcnt<tArr.length) {
			tArr[tcnt] = new TestData(testNo,testName,td,qList,qcnt);
			tcnt++;
			return true;
		}
		return false;
	}
	public static void displayAll() {
		for(TestData t:tArr) {
			if(t!=null) {
				System.out.println(t);
			}
			else
				break;
		}
	}
	private static String totalMarks(int tid) {
		int sum =0;
		TestData t= tArr[tid-1];
		for(int i=0;i<t.getQueArr().length;i++) {
			if(t.getQueArr()[i]!=null) {
				sum += t.getQueArr()[i].getMarks();
			}else {
				break;
			} 
		}
		return Integer.toString(sum);
	}
	public static boolean userTestById(int tid) {
		for(TestData t:tArr) {
			if(t!=null) {
				if(t.getTestId() == tid) {
					return true;
				}
			}else {
				return false;
			}
		}
		return false;
	}
	public static void displayTestResult(int tid) {
		System.out.println("------------------------------------------------------");
		if(tid <= uAnswer.length && userTestById(tid)) {
			System.out.println("Test Name : "+tArr[tid-1].getTestName());
			System.out.println("Total Marks obtained : "+uAnswer[tid-1].getTotalMarks()+"/"+totalMarks(tid));
		}else {
			System.out.println("Test Not Found : Enter valid test id");
		}
		System.out.println("------------------------------------------------------");
	}
	private static boolean acceptUserAns(TestData t) {
		if(ucnt < uAnswer.length) {
			Scanner sc = new Scanner(System.in);
			boolean ans[] = new boolean[t.getQueArr().length];
			int qn[] = new int[t.getQueArr().length];
			float sum = 0;
			for(int i=0;i<t.getQueArr().length;i++) {
				if(t.getQueArr()[i] != null) {
					System.out.println("Question : "+t.getQueArr()[i].getQue() + " ?");
					System.out.println("Question Marks : "+t.getQueArr()[i].getMarks());
					System.out.println("Opetion 1 : "+t.getQueArr()[i].getOp1());
					System.out.println("Opetion 2 : "+t.getQueArr()[i].getOp2());
					System.out.println("Opetion 3 : "+t.getQueArr()[i].getOp3());
					System.out.println("Opetion 4 : "+t.getQueArr()[i].getOp4());
					
					System.out.print("Enter Ans : ");
					String userAns = sc.nextLine();
					qn[i]=t.getQueArr()[i].getqNum();
					if(t.getQueArr()[i].getAns().equals(userAns)) {
						sum += t.getQueArr()[i].getMarks();
						ans[i] = true;
					}else {
						ans[i] = false;
					}
				}else {
					break;
				}
				System.out.println("--------------------------------------------------------");
			}
			userAnswers u = new userAnswers(t.getTestId(),qn,ans,sum);
			uAnswer[ucnt] = u;
			ucnt++;
			return true;
		}
		return false;
	}
	public static boolean userTest(int tid) {
		for(TestData t:tArr) {
			if(t!=null && !(tid < ucnt+1)) {
				if(t.getTestId() == tid) {
					return acceptUserAns(t);
				}
			}else
				break;
		}
		return false;
	}
	
}