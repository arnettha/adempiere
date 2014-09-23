/**
 * 
 */
package org.wtc.util;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import org.compiere.model.MBPartner;
import org.compiere.model.MEmployeeType;
import org.compiere.model.MLeaveType;
import org.compiere.model.Query;
import org.compiere.util.Env;


/**
 * @author phani
 *
 */
public class WTCLPLLeaveType extends AbstractLeaveType {
// Kindly do not delete below line as it is being used for svn version maintenance
public static final String svnRevision =  "$Id: WTCLPLLeaveType.java 1009 2012-02-09 09:16:13Z suman $";

	/**
	 * @param leaveTypeCode
	 */
	public WTCLPLLeaveType(String leaveTypeCode) {
		super(leaveTypeCode);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.wtc.util.LeaveType#allowedCombinedLeaves()
	 */
	public MLeaveType[] allowedCombinedLeaves() {
		// TODO Auto-generated method stub
		List<MLeaveType> types = new Query(Env.getCtx(),MLeaveType.Table_Name,"1=1",trxName).setOnlyActiveRecords(true).list();
		MLeaveType[] typearray=new MLeaveType[types.size()];
		  types.toArray(typearray);
		  return typearray;
	}

	/* (non-Javadoc)
	 * @see org.wtc.util.LeaveType#getEligibleEmployeeType()
	 */
	public MEmployeeType[] getEligibleEmployeeType() {
		
		return LeaveTypeManager.getEmployeeTypeForLeaveType(getLeaveTypeId());
	}

	

	/* (non-Javadoc)
	 * @see org.wtc.util.LeaveType#monthlyEarnedLeaves(int, int)
	 */
	public int monthlyEarnedLeaves(int year, int month) {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see org.wtc.util.LeaveType#yearCarryForward(org.compiere.model.MEmployee)
	 */
	public BigDecimal yearCarryForward(MBPartner employee,Timestamp date) {

		return LeaveTypeManager.getCreditLeavesForYear(leaveType, employee, date);
	}

	public BigDecimal monthCarryForward(MBPartner employee, Timestamp date) {
		
		return LeaveTypeManager.getCreditLeavesForMonth(leaveType,employee,date);
	}

	@Override
	public boolean canLeavesForwardedToNextYear() {
		
		return leaveType.isleaves_forward_tonextyear();
	}

	@Override
	public BigDecimal maximumLeavesForwardedToNextYear() {

		return leaveType.getmax_leaves_toforward();
	}
	
	public BigDecimal quarterCarryForward(MBPartner employee, Timestamp date) {
		
		return LeaveTypeManager.getCreditLeavesForQuarter(leaveType,employee,date);
	}
	

}