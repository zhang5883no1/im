package im.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name="t_plotinfo") 
public class PlotInfo {

	@Id
	private String orderno;
	
	private String opentime;
	
	private String type;
	
	private String product;
	
	private String openprice;
	
	private String downprice;
	
	private String upprice;
	
	private String closetime;
	
	private String closeprice;
	
	private String gainprice;
	
	private String tname;
	
	private long dateTime;

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	public String getOpentime() {
		return opentime;
	}

	public void setOpentime(String opentime) {
		this.opentime = opentime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getOpenprice() {
		return openprice;
	}

	public void setOpenprice(String openprice) {
		this.openprice = openprice;
	}

	public String getDownprice() {
		return downprice;
	}

	public void setDownprice(String downprice) {
		this.downprice = downprice;
	}

	public String getUpprice() {
		return upprice;
	}

	public void setUpprice(String upprice) {
		this.upprice = upprice;
	}

	public String getClosetime() {
		return closetime;
	}

	public void setClosetime(String closetime) {
		this.closetime = closetime;
	}

	public String getCloseprice() {
		return closeprice;
	}

	public void setCloseprice(String closeprice) {
		this.closeprice = closeprice;
	}

	public String getGainprice() {
		return gainprice;
	}

	public void setGainprice(String gainprice) {
		this.gainprice = gainprice;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	

	/** 
	*  
	*  
	* @param orderno
	* @param opentime
	* @param type
	* @param position
	* @param product
	* @param openprice
	* @param downprice
	* @param upprice
	* @param closetime
	* @param closeprice
	* @param gainprice
	* @param tname
	* @param dateTime 
	*/ 
	
	public PlotInfo(String orderno, String opentime, String type, String product, String openprice,
			String downprice, String upprice, String closetime, String closeprice, String gainprice, String tname,
			long dateTime) {
		super();
		this.orderno = orderno;
		this.opentime = opentime;
		this.type = type;
		this.product = product;
		this.openprice = openprice;
		this.downprice = downprice;
		this.upprice = upprice;
		this.closetime = closetime;
		this.closeprice = closeprice;
		this.gainprice = gainprice;
		this.tname = tname;
		this.dateTime = dateTime;
	}

	public long getDateTime() {
		return dateTime;
	}

	public void setDateTime(long dateTime) {
		this.dateTime = dateTime;
	}

	/** 
	*  
	*   
	*/ 
	
	public PlotInfo() {
		super();
	}
	
}
