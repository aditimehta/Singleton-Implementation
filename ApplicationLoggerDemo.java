
/**
 * Scenario 2 Demo
 */
public class ApplicationLoggerDemo {

	public static void main(String[] args) {
		ApplicationLogger applicationLogger = ApplicationLogger.getInstance();
		applicationLogger.infoLog("Hello");
		applicationLogger.warningLog("Warning Log");
		applicationLogger.errorLogWithoutThrowable("Error log without throwable");
		applicationLogger.errorLogWithThrowable("Error Log with throwable", new Throwable());
	}
	
}
