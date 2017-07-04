package top.auok.cbps.persistence.orm.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import top.auok.cbps.model.adapter.UnionBankAdapter;
import top.auok.cbps.model.base.BaseUnionBank;
import top.auok.cbps.persistence.orm.adapter.PersistentBaseAdapter;

@Entity
@Table(name = "UNIONBANKS")
public class PersistentUnionBank extends PersistentBaseAdapter<BaseUnionBank> implements UnionBankAdapter {

	public PersistentUnionBank(BaseUnionBank delegate) {
		super(delegate);
	}

	PersistentUnionBank() {
		super(new BaseUnionBank());
	}

	@Override
	public String getUBANK_ID() {
		return UnionBankAdapter.super.getUBANK_ID();
	}

	@Override
	public String getUBANK_NO() {
		return UnionBankAdapter.super.getUBANK_NO();
	}

	@Override
	public String getCTGY() {
		return UnionBankAdapter.super.getCTGY();
	}

	@Override
	public String getCLSS() {
		return UnionBankAdapter.super.getCLSS();
	}

	@Override
	public String getUBANK_CAT_ID() {
		return UnionBankAdapter.super.getUBANK_CAT_ID();
	}

	@Override
	public String getDRCT() {
		return UnionBankAdapter.super.getDRCT();
	}

	@Override
	public String getNDCD() {
		return UnionBankAdapter.super.getNDCD();
	}

	@Override
	public String getSPRR_LST() {
		return UnionBankAdapter.super.getSPRR_LST();
	}

	@Override
	public String getPBCBK() {
		return UnionBankAdapter.super.getPBCBK();
	}

	@Override
	public String getUBANK_CITY() {
		return UnionBankAdapter.super.getUBANK_CITY();
	}

	@Override
	public String getUBANK_NAME() {
		return UnionBankAdapter.super.getUBANK_NAME();
	}

	@Override
	public String getSHRT_NM() {
		return UnionBankAdapter.super.getSHRT_NM();
	}

	@Override
	public String getUBANK_ADDRESS() {
		return UnionBankAdapter.super.getUBANK_ADDRESS();
	}

	@Override
	public String getUBANK_ZIP() {
		return UnionBankAdapter.super.getUBANK_ZIP();
	}

	@Override
	public String getUBANK_TEL() {
		return UnionBankAdapter.super.getUBANK_TEL();
	}

	@Override
	public String getEMAIL() {
		return UnionBankAdapter.super.getEMAIL();
	}

	@Override
	public String getFCTV_DT() {
		return UnionBankAdapter.super.getFCTV_DT();
	}

	@Override
	public String getUPD_TIME() {
		return UnionBankAdapter.super.getUPD_TIME();
	}

	@Override
	public String getTERM_NB() {
		return UnionBankAdapter.super.getTERM_NB();
	}

	@Override
	public String getPROC_STATUS() {
		return UnionBankAdapter.super.getPROC_STATUS();
	}

	@Override
	public String getRMRK() {
		return UnionBankAdapter.super.getRMRK();
	}

	@Override
	public String getXPRY_DT() {
		return UnionBankAdapter.super.getXPRY_DT();
	}

	@Override
	public String getSTATUS() {
		return UnionBankAdapter.super.getSTATUS();
	}

	@Override
	public String getUBANK_LINKMAN() {
		return UnionBankAdapter.super.getUBANK_LINKMAN();
	}

	@Override
	public String getCERT_INFO_CN() {
		return UnionBankAdapter.super.getCERT_INFO_CN();
	}

	@Override
	public String getCERT_INFO_SN() {
		return UnionBankAdapter.super.getCERT_INFO_SN();
	}

	@Override
	public String getCERT_BIND_STATUS() {
		return UnionBankAdapter.super.getCERT_BIND_STATUS();
	}

	@Override
	public String getCERT_VALIDE_DATE() {
		return UnionBankAdapter.super.getCERT_VALIDE_DATE();
	}

	@Override
	public String getCERT_INVALIDE_DATE() {
		return UnionBankAdapter.super.getCERT_INVALIDE_DATE();
	}

	@Override
	public String getLAST_UPD_OPRID() {
		return UnionBankAdapter.super.getLAST_UPD_OPRID();
	}

	@Override
	public String getLAST_UPD_TXN_ID() {
		return UnionBankAdapter.super.getLAST_UPD_TXN_ID();
	}

	@Override
	public String getLAST_UPD_TS() {
		return UnionBankAdapter.super.getLAST_UPD_TS();
	}
}
