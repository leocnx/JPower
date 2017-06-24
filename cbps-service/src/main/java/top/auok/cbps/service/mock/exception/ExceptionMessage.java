package top.auok.cbps.service.mock.exception;

import java.util.ListResourceBundle;

public class ExceptionMessage extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		return contents;
	}
	
	public enum KEY {
		MOCK_EXP_01,
		MOCK_EXP_02,
		MOCK_EXP_03;
	}
	
	private static final Object[][] contents = {
			{KEY.MOCK_EXP_01.toString(), "Mock1Exception"},
			{KEY.MOCK_EXP_02.toString(), "Mock2Exception:param:{0}"},
			{KEY.MOCK_EXP_03.toString(), "Mock3Exception:param1:{0}:param2:{1}"}
	};

}
