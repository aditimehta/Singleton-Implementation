import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Scenario 2
 */
public class ApplicationLogger {

	private Logger logger;
	private static final ApplicationLogger APPLICATION_LOGGER = new ApplicationLogger();

	private ApplicationLogger() {
		logger = Logger.getLogger("ApplicationLogger");
	}

	public static ApplicationLogger getInstance() {
		return APPLICATION_LOGGER;
	}

	public void infoLog(String infoLogStatement) {
		logger.log(Level.INFO, infoLogStatement);
	}
	
	public void warningLog(String warningLogStatment) {
		logger.log(Level.WARNING, warningLogStatment);
	}
	
	public void errorLogWithoutThrowable(String errorLogStatement) {
		logger.log(Level.SEVERE, errorLogStatement);
	}
	
	public void errorLogWithThrowable(String errorLogStatement,Throwable throwable) {
		logger.log(Level.SEVERE, errorLogStatement, throwable);
	}

}
