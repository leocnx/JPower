package top.auok.cbps.schedule;

import javax.ejb.Schedule;
import javax.ejb.Singleton;

@Singleton
public class CbpsJob {

	@Schedule(minute = "*/1", hour = "*", persistent = false)
	public void mock() {
		System.out.println("==========I am cbps schedule.==========");
	}
}
