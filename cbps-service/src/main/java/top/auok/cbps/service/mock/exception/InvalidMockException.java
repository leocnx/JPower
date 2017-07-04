package top.auok.cbps.service.mock.exception;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class InvalidMockException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private InvalidMockException(ExceptionMessage.KEY exceptionMessageKey) {
		super(getString(exceptionMessageKey));
	}

	private InvalidMockException(ExceptionMessage.KEY exceptionMessageKey, Object key) {
		super(MessageFormat.format(getString(exceptionMessageKey), key));
	}

	private InvalidMockException(ExceptionMessage.KEY exceptionMessageKey, Object... arguments) {
		super(MessageFormat.format(getString(exceptionMessageKey), arguments));
	}

	private static String getString(ExceptionMessage.KEY key) {
		return ResourceBundle.getBundle(ExceptionMessage.class.getName()).getString(key.toString());
	}

	public static class Mock1Exception extends InvalidMockException {
		private static final long serialVersionUID = 1L;

		public Mock1Exception() {
			super(ExceptionMessage.KEY.MOCK_EXP_01);
		}
	}

	public static class Mock2Exception extends InvalidMockException {
		private static final long serialVersionUID = 1L;

		public Mock2Exception(String param) {
			super(ExceptionMessage.KEY.MOCK_EXP_02, param);
		}
	}

	public static class Mock3Exception extends InvalidMockException {
		private static final long serialVersionUID = 1L;

		public Mock3Exception(String param1, String param2) {
			super(ExceptionMessage.KEY.MOCK_EXP_03, param1, param2);
		}
	}
}
