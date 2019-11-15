package com.livinglibrary.po;

import java.util.Date;

public class ModuleInfo {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column module_info.id
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column module_info.show_order
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	private Integer showOrder;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column module_info.module_name
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	private String moduleName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column module_info.add_user
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	private String addUser;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column module_info.add_time
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	private Date addTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column module_info.id
	 * @return  the value of module_info.id
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column module_info.id
	 * @param id  the value for module_info.id
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column module_info.show_order
	 * @return  the value of module_info.show_order
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public Integer getShowOrder() {
		return showOrder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column module_info.show_order
	 * @param showOrder  the value for module_info.show_order
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public void setShowOrder(Integer showOrder) {
		this.showOrder = showOrder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column module_info.module_name
	 * @return  the value of module_info.module_name
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public String getModuleName() {
		return moduleName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column module_info.module_name
	 * @param moduleName  the value for module_info.module_name
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column module_info.add_user
	 * @return  the value of module_info.add_user
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public String getAddUser() {
		return addUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column module_info.add_user
	 * @param addUser  the value for module_info.add_user
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public void setAddUser(String addUser) {
		this.addUser = addUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column module_info.add_time
	 * @return  the value of module_info.add_time
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public Date getAddTime() {
		return addTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column module_info.add_time
	 * @param addTime  the value for module_info.add_time
	 * @mbg.generated  Sat Jan 12 10:57:32 CST 2019
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
}