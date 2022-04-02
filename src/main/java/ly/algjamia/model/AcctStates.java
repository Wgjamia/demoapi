package ly.algjamia.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ACCT_STATES")
public class AcctStates {
	@Id
	@Column(name = "COD_ACCT_NO")
	private int codAcctNo;
	
	@Column(name = "COD_ACCT_STAT")
	private long codAcctStat;
	
	@Column(name = "OD_CHG_DATE")
	@Temporal(TemporalType.DATE)
	private Date codChgDate;
	
	
	@Column(name = "USER_NO")
	private Long UserNo;
	public AcctStates() {
		super();
	}
	public AcctStates(int codAcctNo, long codAcctStat, Date codChgDate, Long userNo) {
		super();
		this.codAcctNo = codAcctNo;
		this.codAcctStat = codAcctStat;
		this.codChgDate = codChgDate;
		UserNo = userNo;
	}
	public int getCodAcctNo() {
		return codAcctNo;
	}
	public void setCodAcctNo(int codAcctNo) {
		this.codAcctNo = codAcctNo;
	}
	public long getCodAcctStat() {
		return codAcctStat;
	}
	public void setCodAcctStat(long codAcctStat) {
		this.codAcctStat = codAcctStat;
	}
	public Date getCodChgDate() {
		return codChgDate;
	}
	public void setCodChgDate(Date codChgDate) {
		this.codChgDate = codChgDate;
	}
	public Long getUserNo() {
		return UserNo;
	}
	public void setUserNo(Long userNo) {
		UserNo = userNo;
	}
	
	
	
	

}
