package top.auok.cbps.web.service.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class SysConfig {

	// private static final String JBOSS_SERVER_DATA_DIR_PROPERTY_NAME =
	// "jboss.server.data.dir";
	private static final String JBOSS_SERVER_CONFIG_PROPERTY_NAME = "jboss.server.config.dir";
	private static final String PROPERTIES_CONFIG_FILE_NAME = "jpower.properties";
	private static Properties properties;

	public static String SYS_NAME;

	@PostConstruct
	@SuppressWarnings("static-access")
	void onSystemStartup() {
		properties = new Properties();
		try (FileInputStream fileInputStream = new FileInputStream(
				System.getProperty(JBOSS_SERVER_CONFIG_PROPERTY_NAME) + File.separator + PROPERTIES_CONFIG_FILE_NAME)) {
			properties.load(fileInputStream);
			this.SYS_NAME = properties.getProperty("SYS_NAME").trim();
			System.out.println("==========SYS_NAME:" + this.SYS_NAME + "==========");
		} catch (IOException e) {
			throw new CBPSLoadConfigFileException(e);
		}
	}

	private static class CBPSLoadConfigFileException extends RuntimeException {
		private static final long serialVersionUID = 1L;

		CBPSLoadConfigFileException(Throwable cause) {
			super(cause);
		}
	}
}
