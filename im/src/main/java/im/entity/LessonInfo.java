package im.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="t_lesson") 
public class LessonInfo {

	@Id
	private Long id;
	private String times;
	private String d1n;
	private String d1t;
	private String d2n;
	private String d2t;
	private String d3n;
	private String d3t;
	private String d4n;
	private String d4t;
	private String d5n;
	private String d5t;
	
	@Override
	public String toString() {
		return "LessonInfo [id=" + id + ", times=" + times + ", d1n=" + d1n + ", d1t=" + d1t + ", d2n=" + d2n + ", d2t="
				+ d2t + ", d3n=" + d3n + ", d3t=" + d3t + ", d4n=" + d4n + ", d4t=" + d4t + ", d5n=" + d5n + ", d5t="
				+ d5t + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTimes() {
		return times;
	}
	public void setTimes(String times) {
		this.times = times;
	}
	public String getD1n() {
		return d1n;
	}
	public void setD1n(String d1n) {
		this.d1n = d1n;
	}
	public String getD1t() {
		return d1t;
	}
	public void setD1t(String d1t) {
		this.d1t = d1t;
	}
	public String getD2n() {
		return d2n;
	}
	public void setD2n(String d2n) {
		this.d2n = d2n;
	}
	public String getD2t() {
		return d2t;
	}
	public void setD2t(String d2t) {
		this.d2t = d2t;
	}
	public String getD3n() {
		return d3n;
	}
	public void setD3n(String d3n) {
		this.d3n = d3n;
	}
	public String getD3t() {
		return d3t;
	}
	public void setD3t(String d3t) {
		this.d3t = d3t;
	}
	public String getD4n() {
		return d4n;
	}
	public void setD4n(String d4n) {
		this.d4n = d4n;
	}
	public String getD4t() {
		return d4t;
	}
	public void setD4t(String d4t) {
		this.d4t = d4t;
	}
	public String getD5n() {
		return d5n;
	}
	public void setD5n(String d5n) {
		this.d5n = d5n;
	}
	public String getD5t() {
		return d5t;
	}
	public void setD5t(String d5t) {
		this.d5t = d5t;
	}
	
	public LessonInfo() {
		super();
	}
	public LessonInfo(Long id, String times, String d1n, String d1t, String d2n, String d2t, String d3n, String d3t,
			String d4n, String d4t, String d5n, String d5t) {
		super();
		this.id = id;
		this.times = times;
		this.d1n = d1n;
		this.d1t = d1t;
		this.d2n = d2n;
		this.d2t = d2t;
		this.d3n = d3n;
		this.d3t = d3t;
		this.d4n = d4n;
		this.d4t = d4t;
		this.d5n = d5n;
		this.d5t = d5t;
	}
	
}
