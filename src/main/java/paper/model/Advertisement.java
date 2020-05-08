package paper.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "advertisement")
public class Advertisement {

	@Id
	@Column(name = "adv_id")
	private String adv_id;

	@Column(name = "ap_id")
	private String ap_id;

	@Column(name = "adv_type")
	private String adv_type;

	@Column(name = "reg_id")
	private String reg_id;

	@Column(name = "ad_length")
	private int ad_length;

	public Advertisement(String adv_id, String ap_id, String adv_type, String reg_id, int ad_length) {
		super();
		this.adv_id = adv_id;
		this.ap_id = ap_id;
		this.adv_type = adv_type;
		this.reg_id = reg_id;
		this.ad_length = ad_length;
	}

	public Advertisement() {
		super();
	}

	@Override
	public String toString() {
		return "Advertisement [adv_id=" + adv_id + ", ap_id=" + ap_id + ", adv_type=" + adv_type + ", reg_id=" + reg_id
				+ ", ad_length=" + ad_length + "]";
	}

	public String getAdv_id() {
		return adv_id;
	}

	public void setAdv_id(String adv_id) {
		this.adv_id = adv_id;
	}

	public String getAp_id() {
		return ap_id;
	}

	public void setAp_id(String ap_id) {
		this.ap_id = ap_id;
	}

	public String getAdv_type() {
		return adv_type;
	}

	public void setAdv_type(String adv_type) {
		this.adv_type = adv_type;
	}

	public String getReg_id() {
		return reg_id;
	}

	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}

	public int getAd_length() {
		return ad_length;
	}

	public void setAd_length(int ad_length) {
		this.ad_length = ad_length;
	}

}
