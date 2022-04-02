package ly.algjamia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CH_ACCT_MAST")
public class chAcctMast {

	@Column(name = "COD_BRN")
	private  String codbrn;
	
	@Id
	@Column(name = "COD_ASST_NO")
	private  Long codAcctNo;
	
	@Column(name = "CUST_ID")
	private  long CustId;
	
	@Column(name = "COD_ACCT_TITLE")
	private  String codAcctTitle;
	
	@Column(name = "COD_ACCT_STAT")
	private  int codAcctStat;
	
	@Column(name = "BAL_AVALIBLE")
	private  Double balAvailable;

	public chAcctMast() {
		super();
	}

	public chAcctMast(String codbrn, Long codAcctNo, long custId, String codAcctTitle, int codAcctStat,
			Double balAvailable) {
		super();
		this.codbrn = codbrn;
		this.codAcctNo = codAcctNo;
		CustId = custId;
		this.codAcctTitle = codAcctTitle;
		this.codAcctStat = codAcctStat;
		this.balAvailable = balAvailable;
	}

	public String getCodbrn() {
		return codbrn;
	}

	public void setCodbrn(String codbrn) {
		this.codbrn = codbrn;
	}

	public Long getCodAcctNo() {
		return codAcctNo;
	}

	public void setCodAcctNo(Long codAcctNo) {
		this.codAcctNo = codAcctNo;
	}

	public long getCustId() {
		return CustId;
	}

	public void setCustId(long custId) {
		CustId = custId;
	}

	public String getCodAcctTitle() {
		return codAcctTitle;
	}

	public void setCodAcctTitle(String codAcctTitle) {
		this.codAcctTitle = codAcctTitle;
	}

	public int getCodAcctStat() {
		return codAcctStat;
	}

	public void setCodAcctStat(int codAcctStat) {
		this.codAcctStat = codAcctStat;
	}

	public Double getBalAvailable() {
		return balAvailable;
	}

	public void setBalAvailable(Double balAvailable) {
		this.balAvailable = balAvailable;
	}

	
	
	
	
	
	
	

}
