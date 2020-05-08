package paper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "adv_publisher")
public class Publisher {
	
	@Id
	@Column(name = "ap_id")
	private String ap_id;
	
	@Column(name = "ap_name")
	private String ap_name;
	
	@Column(name = "add_id")
	private String add_id;
	
	@Column(name = "ap_email")
	private String ap_email;
	
	@Column(name = "acc_id")
	private String acc_id;

	public Publisher(String ap_id, String ap_name, String add_id, String ap_email, String acc_id) {
		super();
		this.ap_id = ap_id;
		this.ap_name = ap_name;
		this.add_id = add_id;
		this.ap_email = ap_email;
		this.acc_id = acc_id;
	}

	public Publisher() {
		super();
	}

	@Override
	public String toString() {
		return "Publisher [ap_id=" + ap_id + ", ap_name=" + ap_name + ", add_id=" + add_id + ", ap_email=" + ap_email
				+ ", acc_id=" + acc_id + "]";
	}

	public String getAp_id() {
		return ap_id;
	}

	public void setAp_id(String ap_id) {
		this.ap_id = ap_id;
	}

	public String getAp_name() {
		return ap_name;
	}

	public void setAp_name(String ap_name) {
		this.ap_name = ap_name;
	}

	public String getAdd_id() {
		return add_id;
	}

	public void setAdd_id(String add_id) {
		this.add_id = add_id;
	}

	public String getAp_email() {
		return ap_email;
	}

	public void setAp_email(String ap_email) {
		this.ap_email = ap_email;
	}

	public String getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(String acc_id) {
		this.acc_id = acc_id;
	}
	
}
