package Lab10.Question1;

import java.io.IOException;

public class myException extends IOException {
	public myException() {
		super("myException thrown.");
	}
	
	public myException(String message) {
		super(message);
	}
}
