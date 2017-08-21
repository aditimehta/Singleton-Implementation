import java.util.Map;

/**
 * Scenario 1 Demo
 */
public class ApplicationConfigurationDemo {
	
	public static void main(String[] args) {
		
		ApplicationConfiguration applicationConfiguration = ApplicationConfiguration.getInstance();
		Map<String, String> configValues = applicationConfiguration.getConfigValues();
		for (Map.Entry<String, String> entry : configValues.entrySet())
		{
		    System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
