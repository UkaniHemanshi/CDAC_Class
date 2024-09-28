package day_5;

public class TransactionLimitExceededException extends Exception 
{
	public TransactionLimitExceededException(String message) {
		super(message);
	}
}
