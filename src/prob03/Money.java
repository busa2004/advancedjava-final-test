package prob03;

public class Money {

	

	private int amount;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}

	public Money(int amount) {
		this.amount = amount;
	}
	
	public Money add(Money money) {
		// TODO Auto-generated method stub
		return new Money(this.amount+money.amount);
	}

	public Money minus(Money money) {
		// TODO Auto-generated method stub
		return new Money(this.amount-money.amount);
	}

	public Money multiply(Money money) {
		// TODO Auto-generated method stub
		return new Money(this.amount*money.amount);
	}

	public Money devide(Money money) {
		// TODO Auto-generated method stub
		return new Money(this.amount/money.amount);
	}
    
    
}
