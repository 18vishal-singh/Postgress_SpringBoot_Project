package paper.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "VOD")
public class VOD {

	@Id
	@Column(name = "vid_id")
	private String vid_id;

	@Column(name = "vid_length")
	private int vid_length;

	@Column(name = "title")
	private String title;

	@Column(name = "rating")
	private String rating;

	@Column(name = "description")
	private String description;

	@Column(name = "upload_date")
	private Date upload_date;

	@Column(name = "owner_id")
	private String owner_id;

	@Column(name = "vid_type")
	private String vid_type;

	@Column(name = "vid_key")
	private String vid_key;

	public VOD() {
		super();
	}

	public VOD(String vid_id, int vid_length, String title, String rating, String description, Date upload_date,
			String owner_id, String vid_type, String vid_key) {
		super();
		this.vid_id = vid_id;
		this.vid_length = vid_length;
		this.title = title;
		this.rating = rating;
		this.description = description;
		this.upload_date = upload_date;
		this.owner_id = owner_id;
		this.vid_type = vid_type;
		this.vid_key = vid_key;
	}

	@Override
	public String toString() {
		return "VOD [vid_id=" + vid_id + ", vid_length=" + vid_length + ", title=" + title + ", rating=" + rating
				+ ", description=" + description + ", upload_date=" + upload_date + ", owner_id=" + owner_id
				+ ", vid_type=" + vid_type + ", vid_key=" + vid_key + "]";
	}

	public String getVid_id() {
		return vid_id;
	}

	public void setVid_id(String vid_id) {
		this.vid_id = vid_id;
	}

	public int getVid_length() {
		return vid_length;
	}

	public void setVid_length(int vid_length) {
		this.vid_length = vid_length;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getUpload_date() {
		return upload_date;
	}

	public void setUpload_date(Date upload_date) {
		this.upload_date = upload_date;
	}

	public String getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(String owner_id) {
		this.owner_id = owner_id;
	}

	public String getVid_type() {
		return vid_type;
	}

	public void setVid_type(String vid_type) {
		this.vid_type = vid_type;
	}

	public String getVid_key() {
		return vid_key;
	}

	public void setVid_key(String vid_key) {
		this.vid_key = vid_key;
	}

}
