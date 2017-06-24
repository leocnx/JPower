package top.auok.cbps.model.base;

import top.auok.cbps.model.UnionBank;

public class BaseUnionBank extends BaseCbpsObject implements UnionBank {
	
	public BaseUnionBank() {
	}
	
	private String UBANK_ID;
	private String UBANK_NO;
	private String CTGY;
	private String CLSS;
	private String UBANK_CAT_ID;
	private String DRCT;
	private String NDCD;
	private String SPRR_LST;
	private String PBCBK;
	private String UBANK_CITY;
	private String UBANK_NAME;
	private String SHRT_NM;
	private String UBANK_ADDRESS;
	private String UBANK_ZIP;
	private String UBANK_TEL;
	private String EMAIL;
	private String FCTV_DT;
	private String UPD_TIME;
	private String TERM_NB;
	private String PROC_STATUS;
	private String RMRK;
	private String XPRY_DT;
	private String STATUS;
	private String UBANK_LINKMAN;
	private String CERT_INFO_CN;
	private String CERT_INFO_SN;
	private String CERT_BIND_STATUS;
	private String CERT_VALIDE_DATE;
	private String CERT_INVALIDE_DATE;
	private String LAST_UPD_OPRID;
	private String LAST_UPD_TXN_ID;
	private String LAST_UPD_TS;

//  ID
//	UBANK_NO, 
//	CTGY, 
//	CLSS, 
//	UBANK_CAT_ID, 
//	DRCT, 
//	NDCD, 
//	SPRR_LST, 
//	PBCBK, 
//	UBANK_CITY, 
//	UBANK_NAME, 
//	SHRT_NM, 
//	UBANK_ADDRESS, 
//	UBANK_ZIP, 
//	UBANK_TEL, 
//	EMAIL, 
//	FCTV_DT, 
//	UPD_TIME, 
//	TERM_NB, 
//	PROC_STATUS, 
//	RMRK, 
//	XPRY_DT, 
//	STATUS, 
//	UBANK_LINKMAN, 
//	CERT_INFO_CN, 
//	CERT_INFO_SN, 
//	CERT_BIND_STATUS, 
//	CERT_VALIDE_DATE, 
//	CERT_INVALIDE_DATE, 
//	LAST_UPD_OPRID, 
//	LAST_UPD_TXN_ID, 
//	LAST_UPD_TS
	
	@Override
	public String getUBANK_ID() {
		return UBANK_ID;
	}

	@Override
	public void setUBANK_ID(String UBANK_ID) {
		this.UBANK_ID = UBANK_ID;
	}

	@Override
	public String getUBANK_NO() {
		return UBANK_NO;
	}

	@Override
	public void setUBANK_NO(String UBANK_NO) {
		this.UBANK_NO = UBANK_NO;
	}

	@Override
	public String getCTGY() {
		return CTGY;
	}

	@Override
	public void setCTGY(String CTGY) {
		this.CTGY = CTGY;
	}

	@Override
	public String getCLSS() {
		return CLSS;
	}

	@Override
	public void setCLSS(String CLSS) {
		this.CLSS = CLSS;
	}

	@Override
	public String getUBANK_CAT_ID() {
		return UBANK_CAT_ID;
	}

	@Override
	public void setUBANK_CAT_ID(String UBANK_CAT_ID) {
		this.UBANK_CAT_ID = UBANK_CAT_ID;
	}

	@Override
	public String getDRCT() {
		return DRCT;
	}

	@Override
	public void setDRCT(String DRCT) {
		this.DRCT = DRCT;
	}

	@Override
	public String getNDCD() {
		return NDCD;
	}

	@Override
	public void setNDCD(String NDCD) {
		this.NDCD = NDCD;
	}

	@Override
	public String getSPRR_LST() {
		return SPRR_LST;
	}

	@Override
	public void setSPRR_LST(String SPRR_LST) {
		this.SPRR_LST = SPRR_LST;
	}

	@Override
	public String getPBCBK() {
		return PBCBK;
	}

	@Override
	public void setPBCBK(String PBCBK) {
		this.PBCBK = PBCBK;
	}

	@Override
	public String getUBANK_CITY() {
		return UBANK_CITY;
	}

	@Override
	public void setUBANK_CITY(String UBANK_CITY) {
		this.UBANK_CITY = UBANK_CITY;
	}

	@Override
	public String getUBANK_NAME() {
		return UBANK_NAME;
	}

	@Override
	public void setUBANK_NAME(String UBANK_NAME) {
		this.UBANK_NAME = UBANK_NAME;
	}

	@Override
	public String getSHRT_NM() {
		return SHRT_NM;
	}

	@Override
	public void setSHRT_NM(String SHRT_NM) {
		this.SHRT_NM = SHRT_NM;
	}

	@Override
	public String getUBANK_ADDRESS() {
		return UBANK_ADDRESS;
	}

	@Override
	public void setUBANK_ADDRESS(String UBANK_ADDRESS) {
		this.UBANK_ADDRESS = UBANK_ADDRESS;
	}

	@Override
	public String getUBANK_ZIP() {
		return UBANK_ZIP;
	}

	@Override
	public void setUBANK_ZIP(String UBANK_ZIP) {
		this.UBANK_ZIP = UBANK_ZIP;
	}

	@Override
	public String getUBANK_TEL() {
		return UBANK_TEL;
	}

	@Override
	public void setUBANK_TEL(String UBANK_TEL) {
		this.UBANK_TEL = UBANK_TEL;
	}

	@Override
	public String getEMAIL() {
		return EMAIL;
	}

	@Override
	public void setEMAIL(String EMAIL) {
		this.EMAIL = EMAIL;
	}

	@Override
	public String getFCTV_DT() {
		return FCTV_DT;
	}

	@Override
	public void setFCTV_DT(String FCTV_DT) {
		this.FCTV_DT = FCTV_DT;
	}

	@Override
	public String getUPD_TIME() {
		return UPD_TIME;
	}

	@Override
	public void setUPD_TIME(String UPD_TIME) {
		this.UPD_TIME = UPD_TIME;
	}

	@Override
	public String getTERM_NB() {
		return TERM_NB;
	}

	@Override
	public void setTERM_NB(String TERM_NB) {
		this.TERM_NB = TERM_NB;
	}

	@Override
	public String getPROC_STATUS() {
		return PROC_STATUS;
	}

	@Override
	public void setPROC_STATUS(String PROC_STATUS) {
		this.PROC_STATUS = PROC_STATUS;
	}

	@Override
	public String getRMRK() {
		return RMRK;
	}

	@Override
	public void setRMRK(String RMRK) {
		this.RMRK = RMRK;
	}

	@Override
	public String getXPRY_DT() {
		return XPRY_DT;
	}

	@Override
	public void setXPRY_DT(String XPRY_DT) {
		this.XPRY_DT = XPRY_DT;
	}

	@Override
	public String getSTATUS() {
		return STATUS;
	}

	@Override
	public void setSTATUS(String STATUS) {
		this.STATUS = STATUS;
	}

	@Override
	public String getUBANK_LINKMAN() {
		return UBANK_LINKMAN;
	}

	@Override
	public void setUBANK_LINKMAN(String UBANK_LINKMAN) {
		this.UBANK_LINKMAN = UBANK_LINKMAN;
	}

	@Override
	public String getCERT_INFO_CN() {
		return CERT_INFO_CN;
	}

	@Override
	public void setCERT_INFO_CN(String CERT_INFO_CN) {
		this.CERT_INFO_CN = CERT_INFO_CN;
	}

	@Override
	public String getCERT_INFO_SN() {
		return CERT_INFO_SN;
	}

	@Override
	public void setCERT_INFO_SN(String CERT_INFO_SN) {
		this.CERT_INFO_SN = CERT_INFO_SN;
	}

	@Override
	public String getCERT_BIND_STATUS() {
		return CERT_BIND_STATUS;
	}

	@Override
	public void setCERT_BIND_STATUS(String CERT_BIND_STATUS) {
		this.CERT_BIND_STATUS = CERT_BIND_STATUS;
	}

	@Override
	public String getCERT_VALIDE_DATE() {
		return CERT_VALIDE_DATE;
	}

	@Override
	public void setCERT_VALIDE_DATE(String CERT_VALIDE_DATE) {
		this.CERT_VALIDE_DATE = CERT_VALIDE_DATE;
	}

	@Override
	public String getCERT_INVALIDE_DATE() {
		return CERT_INVALIDE_DATE;
	}

	@Override
	public void setCERT_INVALIDE_DATE(String CERT_INVALIDE_DATE) {
		this.CERT_INVALIDE_DATE = CERT_INVALIDE_DATE;
	}

	@Override
	public String getLAST_UPD_OPRID() {
		return LAST_UPD_OPRID;
	}

	@Override
	public void setLAST_UPD_OPRID(String LAST_UPD_OPRID) {
		this.LAST_UPD_OPRID = LAST_UPD_OPRID;
	}

	@Override
	public String getLAST_UPD_TXN_ID() {
		return LAST_UPD_TXN_ID;
	}

	@Override
	public void setLAST_UPD_TXN_ID(String LAST_UPD_TXN_ID) {
		this.LAST_UPD_TXN_ID = LAST_UPD_TXN_ID;
	}

	@Override
	public String getLAST_UPD_TS() {
		return LAST_UPD_TS;
	}

	@Override
	public void setLAST_UPD_TS(String LAST_UPD_TS) {
		this.LAST_UPD_TS = LAST_UPD_TS;
	}

}
