package com.livinglibrary.mapper;

import com.livinglibrary.po.Guestcomment;
import com.livinglibrary.po.GuestcommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GuestcommentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guestcomment
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	long countByExample(GuestcommentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guestcomment
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int deleteByExample(GuestcommentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guestcomment
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guestcomment
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int insert(Guestcomment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guestcomment
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int insertSelective(Guestcomment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guestcomment
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	List<Guestcomment> selectByExampleWithBLOBs(GuestcommentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guestcomment
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	List<Guestcomment> selectByExample(GuestcommentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guestcomment
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	Guestcomment selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guestcomment
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Guestcomment record, @Param("example") GuestcommentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guestcomment
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int updateByExampleWithBLOBs(@Param("record") Guestcomment record, @Param("example") GuestcommentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guestcomment
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int updateByExample(@Param("record") Guestcomment record, @Param("example") GuestcommentExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guestcomment
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int updateByPrimaryKeySelective(Guestcomment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guestcomment
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int updateByPrimaryKeyWithBLOBs(Guestcomment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table guestcomment
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int updateByPrimaryKey(Guestcomment record);
}