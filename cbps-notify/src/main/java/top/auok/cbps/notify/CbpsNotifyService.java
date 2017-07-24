package top.auok.cbps.notify;

import javax.ejb.Asynchronous;
import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.enterprise.event.Observes;
import javax.enterprise.event.TransactionPhase;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import top.auok.cbps.notify.model.Notice;

@Startup
@Singleton
@LocalBean
public class CbpsNotifyService {

	@Lock(LockType.READ)
	@Asynchronous
	public void notify(@Observes(during = TransactionPhase.AFTER_COMPLETION) Notice notice) {
		Client client = ClientBuilder.newClient();

		UriBuilder builder = UriBuilder.fromUri(notice.getNotifyUrl());
		// UriBuilder builder =
		// UriBuilder.fromUri(notice.getNotifyUrl()).queryParam("param",
		// notice.getContent());

		Response result = client.target(builder).request(MediaType.TEXT_PLAIN).get();
		System.out.println("=========Receive notify result:" + result.getHeaders().toString());
	}
}
