package top.auok.cbps.notify.model;

import java.io.Serializable;

public class Notice implements Serializable {

	private static final long serialVersionUID = 1L;
	private String notifyUrl;
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}
}
