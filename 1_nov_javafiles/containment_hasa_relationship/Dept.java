package containment_hasa_relationship;

public class Dept {
	
	private int deptno;
	private String deptName;
	private int deptct;
	
	public Dept(int deptno, String deptName, int deptct) {
		super();
		this.deptno = deptno;
		this.deptName = deptName;
		this.deptct = deptct;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getDeptct() {
		return deptct;
	}

	public void setDeptct(int deptct) {
		this.deptct = deptct;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", deptName=" + deptName + ", deptct=" + deptct + "]";
	}
	
	
	

}
