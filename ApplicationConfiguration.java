import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Scenario 1
 */
public class ApplicationConfiguration {

	private static final String CONFIG_PATH = "config.txt";
	private static final String CONFIG_VALUE_SEPARATOR = ":";

	private static ApplicationConfiguration applicationConfiguration;
	
	private Map<String, String> configValues;
	
	private ApplicationConfiguration () {
		configValues = new HashMap<>();
		readConfigurationFile();
	}
	
	public static ApplicationConfiguration getInstance() {
		if(applicationConfiguration == null) {
			applicationConfiguration = new ApplicationConfiguration();
		}
		return applicationConfiguration;
	}
	
	public Map<String, String> getConfigValues() {
		return configValues;
	}

	private void readConfigurationFile() {
		try {
			File file = new File(CONFIG_PATH);
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			String s;
			while((s = bufferedReader.readLine()) != null) {
				String[] configValue = s.split(CONFIG_VALUE_SEPARATOR);
				configValues.put(configValue[0], configValue[1]);
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
