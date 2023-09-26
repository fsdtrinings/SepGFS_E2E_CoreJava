package p1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Policy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String policyName;
	private int premiumAmount;
	private int sumAssured;
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Policy(String policyName, int premiumAmount, int sumAssured) {
		super();
		this.policyName = policyName;
		this.premiumAmount = premiumAmount;
		this.sumAssured = sumAssured;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	public int getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(int sumAssured) {
		this.sumAssured = sumAssured;
	}
	@Override
	public String toString() {
		return "Policy [id=" + id + ", policyName=" + policyName + ", premiumAmount=" + premiumAmount + ", sumAssured="
				+ sumAssured + "]";
	}
	@Override
	public int hashCode() {
		return policyName.length()+17+sumAssured+id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Policy)
		{
			Policy p = (Policy) obj;
			boolean a = (p.getId()==this.getId());
			boolean b = (p.getPolicyName().equals(this.getPolicyName()));
			boolean c = (p.getPremiumAmount() == this.getPremiumAmount());
			boolean d = (p.getSumAssured() == this.sumAssured);
			return a&b&c&d;
		}
		return false;
	}
	

	
}
