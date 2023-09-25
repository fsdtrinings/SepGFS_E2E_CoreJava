package p2;

public class InvalidSalaryException extends RuntimeException {

	String errorMsg;

	public InvalidSalaryException(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	
}
