package day1.day12;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	Long id;
	
	@Column(length=255)
	String fullName;
	
	@Column(length=255, unique=true)
	String email;
	
	@Column(precision=10)
	BigDecimal balance;
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	public Long getId() {
		return id;
	}
	
	public BigDecimal getBalance() {
		return balance;
	}

}
