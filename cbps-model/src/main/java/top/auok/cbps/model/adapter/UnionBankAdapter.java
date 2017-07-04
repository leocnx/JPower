package top.auok.cbps.model.adapter;

import java.beans.PropertyChangeEvent;

import top.auok.cbps.model.UnionBank;
import top.auok.cbps.model.base.BaseUnionBank;

public interface UnionBankAdapter extends UnionBank, Adapter<BaseUnionBank> {

	@Override
	default String getUBANK_ID() {
		return unwrap().getUBANK_ID();
	}

	@Override
	default void setUBANK_ID(String UBANK_ID) {
		unwrap().setUBANK_ID(UBANK_ID);
	}

	@Override
	default String getUBANK_NO() {
		return unwrap().getUBANK_NO();
	}

	@Override
	default void setUBANK_NO(String UBANK_NO) {
		unwrap().setUBANK_NO(UBANK_NO);
	}

	@Override
	default String getCTGY() {
		return unwrap().getCTGY();
	}

	@Override
	default void setCTGY(String CTGY) {
		unwrap().setCTGY(CTGY);
	}

	@Override
	default String getCLSS() {
		return unwrap().getCLSS();
	}

	@Override
	default void setCLSS(String CLSS) {
		unwrap().setCLSS(CLSS);
	}

	@Override
	default String getUBANK_CAT_ID() {
		return unwrap().getUBANK_CAT_ID();
	}

	@Override
	default void setUBANK_CAT_ID(String UBANK_CAT_ID) {
		unwrap().setUBANK_CAT_ID(UBANK_CAT_ID);
	}

	@Override
	default String getDRCT() {
		return unwrap().getDRCT();
	}

	@Override
	default void setDRCT(String DRCT) {
		unwrap().setDRCT(DRCT);
	}

	@Override
	default String getNDCD() {
		return unwrap().getNDCD();
	}

	@Override
	default void setNDCD(String NDCD) {
		unwrap().setNDCD(NDCD);
	}

	@Override
	default String getSPRR_LST() {
		return unwrap().getSPRR_LST();
	}

	@Override
	default void setSPRR_LST(String SPRR_LST) {
		unwrap().setSPRR_LST(SPRR_LST);
	}

	@Override
	default String getPBCBK() {
		return unwrap().getPBCBK();
	}

	@Override
	default void setPBCBK(String PBCBK) {
		unwrap().setPBCBK(PBCBK);
	}

	@Override
	default String getUBANK_CITY() {
		return unwrap().getUBANK_CITY();
	}

	@Override
	default void setUBANK_CITY(String UBANK_CITY) {
		unwrap().setUBANK_CITY(UBANK_CITY);
	}

	@Override
	default String getUBANK_NAME() {
		return unwrap().getUBANK_NAME();
	}

	@Override
	default void setUBANK_NAME(String UBANK_NAME) {
		unwrap().setUBANK_NAME(UBANK_NAME);
	}

	@Override
	default String getSHRT_NM() {
		return unwrap().getSHRT_NM();
	}

	@Override
	default void setSHRT_NM(String SHRT_NM) {
		unwrap().setSHRT_NM(SHRT_NM);
	}

	@Override
	default String getUBANK_ADDRESS() {
		return unwrap().getUBANK_ADDRESS();
	}

	@Override
	default void setUBANK_ADDRESS(String UBANK_ADDRESS) {
		unwrap().setUBANK_ADDRESS(UBANK_ADDRESS);
	}

	@Override
	default String getUBANK_ZIP() {
		return unwrap().getUBANK_ZIP();
	}

	@Override
	default void setUBANK_ZIP(String UBANK_ZIP) {
		unwrap().setUBANK_ZIP(UBANK_ZIP);
	}

	@Override
	default String getUBANK_TEL() {
		return unwrap().getUBANK_TEL();
	}

	@Override
	default void setUBANK_TEL(String UBANK_TEL) {
		unwrap().setUBANK_TEL(UBANK_TEL);
	}

	@Override
	default String getEMAIL() {
		return unwrap().getEMAIL();
	}

	@Override
	default void setEMAIL(String EMAIL) {
		unwrap().setEMAIL(EMAIL);
	}

	@Override
	default String getFCTV_DT() {
		return unwrap().getFCTV_DT();
	}

	@Override
	default void setFCTV_DT(String FCTV_DT) {
		unwrap().setFCTV_DT(FCTV_DT);
	}

	@Override
	default String getUPD_TIME() {
		return unwrap().getUPD_TIME();
	}

	@Override
	default void setUPD_TIME(String UPD_TIME) {
		unwrap().setUPD_TIME(UPD_TIME);
	}

	@Override
	default String getTERM_NB() {
		return unwrap().getTERM_NB();
	}

	@Override
	default void setTERM_NB(String TERM_NB) {
		unwrap().setTERM_NB(TERM_NB);
	}

	@Override
	default String getPROC_STATUS() {
		return unwrap().getPROC_STATUS();
	}

	@Override
	default void setPROC_STATUS(String PROC_STATUS) {
		unwrap().setPROC_STATUS(PROC_STATUS);
	}

	@Override
	default String getRMRK() {
		return unwrap().getRMRK();
	}

	@Override
	default void setRMRK(String RMRK) {
		unwrap().setRMRK(RMRK);
	}

	@Override
	default String getXPRY_DT() {
		return unwrap().getXPRY_DT();
	}

	@Override
	default void setXPRY_DT(String XPRY_DT) {
		unwrap().setXPRY_DT(XPRY_DT);
	}

	@Override
	default String getSTATUS() {
		return unwrap().getSTATUS();
	}

	@Override
	default void setSTATUS(String STATUS) {
		unwrap().setSTATUS(STATUS);
	}

	@Override
	default String getUBANK_LINKMAN() {
		return unwrap().getUBANK_LINKMAN();
	}

	@Override
	default void setUBANK_LINKMAN(String UBANK_LINKMAN) {
		unwrap().setUBANK_LINKMAN(UBANK_LINKMAN);
	}

	@Override
	default String getCERT_INFO_CN() {
		return unwrap().getCERT_INFO_CN();
	}

	@Override
	default void setCERT_INFO_CN(String CERT_INFO_CN) {
		unwrap().setCERT_INFO_CN(CERT_INFO_CN);
	}

	@Override
	default String getCERT_INFO_SN() {
		return unwrap().getCERT_INFO_SN();
	}

	@Override
	default void setCERT_INFO_SN(String CERT_INFO_SN) {
		unwrap().setCERT_INFO_SN(CERT_INFO_SN);
	}

	@Override
	default String getCERT_BIND_STATUS() {
		return unwrap().getCERT_BIND_STATUS();
	}

	@Override
	default void setCERT_BIND_STATUS(String CERT_BIND_STATUS) {
		unwrap().setCERT_BIND_STATUS(CERT_BIND_STATUS);
	}

	@Override
	default String getCERT_VALIDE_DATE() {
		return unwrap().getCERT_VALIDE_DATE();
	}

	@Override
	default void setCERT_VALIDE_DATE(String CERT_VALIDE_DATE) {
		unwrap().setCERT_VALIDE_DATE(CERT_VALIDE_DATE);
	}

	@Override
	default String getCERT_INVALIDE_DATE() {
		return unwrap().getCERT_INVALIDE_DATE();
	}

	@Override
	default void setCERT_INVALIDE_DATE(String CERT_INVALIDE_DATE) {
		unwrap().setCERT_INVALIDE_DATE(CERT_INVALIDE_DATE);
	}

	@Override
	default String getLAST_UPD_OPRID() {
		return unwrap().getLAST_UPD_OPRID();
	}

	@Override
	default void setLAST_UPD_OPRID(String LAST_UPD_OPRID) {
		unwrap().setLAST_UPD_OPRID(LAST_UPD_OPRID);
	}

	@Override
	default String getLAST_UPD_TXN_ID() {
		return unwrap().getLAST_UPD_TXN_ID();
	}

	@Override
	default void setLAST_UPD_TXN_ID(String LAST_UPD_TXN_ID) {
		unwrap().setLAST_UPD_TXN_ID(LAST_UPD_TXN_ID);
	}

	@Override
	default String getLAST_UPD_TS() {
		return unwrap().getLAST_UPD_TS();
	}

	@Override
	default void setLAST_UPD_TS(String LAST_UPD_TS) {
		unwrap().setLAST_UPD_TS(LAST_UPD_TS);
	}

	@Override
	default void propertyChange(PropertyChangeEvent evt) {
		// TODO
	}
}
