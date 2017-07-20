package top.auok.cbps.model;

import java.util.Set;

public interface RefundBill extends CbpsObject {

	Set<Refund> getRefunds();

	void setRefunds(Set<Refund> refunds);
}
