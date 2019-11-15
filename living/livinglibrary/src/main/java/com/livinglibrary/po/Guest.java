package com.livinglibrary.po;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Guest {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column guest.GuestId
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	private Integer guestid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column guest.GuestName
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	private String guestname;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column guest.Address
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	private String address;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column guest.GuestType
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	private Integer guesttype;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column guest.GuestImg
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	private String guestimg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column guest.IsShow
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	private String isshow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column guest.BeginTime
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date begintime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column guest.EndTime
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date endtime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column guest.ordernum
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	private Integer ordernum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column guest.allnum
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	private Integer allnum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column guest.Summary
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	private String summary;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column guest.GuestId
	 * @return  the value of guest.GuestId
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public Integer getGuestid() {
		return guestid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column guest.GuestId
	 * @param guestid  the value for guest.GuestId
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public void setGuestid(Integer guestid) {
		this.guestid = guestid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column guest.GuestName
	 * @return  the value of guest.GuestName
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public String getGuestname() {
		return guestname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column guest.GuestName
	 * @param guestname  the value for guest.GuestName
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public void setGuestname(String guestname) {
		this.guestname = guestname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column guest.Address
	 * @return  the value of guest.Address
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column guest.Address
	 * @param address  the value for guest.Address
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column guest.GuestType
	 * @return  the value of guest.GuestType
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public Integer getGuesttype() {
		return guesttype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column guest.GuestType
	 * @param guesttype  the value for guest.GuestType
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public void setGuesttype(Integer guesttype) {
		this.guesttype = guesttype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column guest.GuestImg
	 * @return  the value of guest.GuestImg
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public String getGuestimg() {
		return guestimg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column guest.GuestImg
	 * @param guestimg  the value for guest.GuestImg
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public void setGuestimg(String guestimg) {
		this.guestimg = guestimg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column guest.IsShow
	 * @return  the value of guest.IsShow
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public String getIsshow() {
		return isshow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column guest.IsShow
	 * @param isshow  the value for guest.IsShow
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public void setIsshow(String isshow) {
		this.isshow = isshow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column guest.BeginTime
	 * @return  the value of guest.BeginTime
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public Date getBegintime() {
		return begintime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column guest.BeginTime
	 * @param begintime  the value for guest.BeginTime
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column guest.EndTime
	 * @return  the value of guest.EndTime
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public Date getEndtime() {
		return endtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column guest.EndTime
	 * @param endtime  the value for guest.EndTime
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column guest.ordernum
	 * @return  the value of guest.ordernum
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public Integer getOrdernum() {
		return ordernum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column guest.ordernum
	 * @param ordernum  the value for guest.ordernum
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public void setOrdernum(Integer ordernum) {
		this.ordernum = ordernum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column guest.allnum
	 * @return  the value of guest.allnum
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public Integer getAllnum() {
		return allnum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column guest.allnum
	 * @param allnum  the value for guest.allnum
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public void setAllnum(Integer allnum) {
		this.allnum = allnum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column guest.Summary
	 * @return  the value of guest.Summary
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column guest.Summary
	 * @param summary  the value for guest.Summary
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
}