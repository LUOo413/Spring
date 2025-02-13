package tw.demospringmvcproject.exception;

public class MySystemException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String msg;

	public MySystemException() {
	}

	public MySystemException(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
