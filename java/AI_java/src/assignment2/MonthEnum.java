package assignment2;

public enum MonthEnum 
{
	JAN(01),FEB(02),MAR(03),APR(04),MAY(05),JUNE(06),JULY(07),AUG(8),SEP(9),OCT(10),NOV(11),DEC(12);
	
	int m_value;
	
	private MonthEnum(int m_value)
	{
		this.m_value = m_value;
	}
	
	public int get_m_value()
	{
		return m_value;
	}
}
