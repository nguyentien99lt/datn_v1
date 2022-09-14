package datn.store.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "accounts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Accounts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	int id;
	
	@Column(name = "Username")
	String Username;
	
	@Column(name = "Password")
	String Password;
	
	@Column(name = "Fullname")
	String Fullname;
	
	@Column(name = "Email")
	String Email;
	
	@Column(name = "Photo")
	String Photo;
	
	@Column(name = "Address")
	String Address;
	
//	@Column(name = "PhoneNumber")
//	int PhoneNumber;
	
	@Column(name = "Admin")
	int Admin;
	
}
