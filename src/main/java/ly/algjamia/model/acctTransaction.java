package ly.algjamia.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ACCT_TRANSACTIONS")
public class acctTransaction {
	@Id
	@Column(name = "COD_ACCT_NO")
	private Long CodAcctNO;
	
	@Column(name = "COD_TXN_SRL_NO")
	private Long CodTxnSrlNO;
	
	@Column(name = "AMT_TXN_LCY")
	private Long Amt_Txn_Lcy;
	
	@Column(name = "COD_TXN_DESC")
	private String CodTxnDEesc;
	
	@Column(name = "COD_TXN_DATE")
	private Date CodTxn_Date;
	
	@Column(name = "USER_NO")
	private Long userNo;

	public acctTransaction() {
		super();
	}

	public acctTransaction(Long codAcctNO, Long codTxnSrlNO, Long amt_Txn_Lcy, String codTxnDEesc, Date codTxn_Date,
			Long userNo) {
		super();
		CodAcctNO = codAcctNO;
		CodTxnSrlNO = codTxnSrlNO;
		Amt_Txn_Lcy = amt_Txn_Lcy;
		CodTxnDEesc = codTxnDEesc;
		CodTxn_Date = codTxn_Date;
		this.userNo = userNo;
	}

	public Long getCodAcctNO() {
		return CodAcctNO;
	}

	public void setCodAcctNO(Long codAcctNO) {
		CodAcctNO = codAcctNO;
	}

	public Long getCodTxnSrlNO() {
		return CodTxnSrlNO;
	}

	public void setCodTxnSrlNO(Long codTxnSrlNO) {
		CodTxnSrlNO = codTxnSrlNO;
	}

	public Long getAmt_Txn_Lcy() {
		return Amt_Txn_Lcy;
	}

	public void setAmt_Txn_Lcy(Long amt_Txn_Lcy) {
		Amt_Txn_Lcy = amt_Txn_Lcy;
	}

	public String getCodTxnDEesc() {
		return CodTxnDEesc;
	}

	public void setCodTxnDEesc(String codTxnDEesc) {
		CodTxnDEesc = codTxnDEesc;
	}

	public Date getCodTxn_Date() {
		return CodTxn_Date;
	}

	public void setCodTxn_Date(Date codTxn_Date) {
		CodTxn_Date = codTxn_Date;
	}

	public Long getUserNo() {
		return userNo;
	}

	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}

	
	
	
}
