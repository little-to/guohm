package com.livinglibrary.mapper;

import com.livinglibrary.po.Forumpost;
import com.livinglibrary.po.ForumpostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForumpostMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	long countByExample(ForumpostExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	int deleteByExample(ForumpostExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	int deleteByPrimaryKey(Integer postid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	int insert(Forumpost record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	int insertSelective(Forumpost record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	List<Forumpost> selectByExampleWithBLOBs(ForumpostExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	List<Forumpost> selectByExample(ForumpostExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	Forumpost selectByPrimaryKey(Integer postid);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	int updateByExampleSelective(@Param("record") Forumpost record, @Param("example") ForumpostExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	int updateByExampleWithBLOBs(@Param("record") Forumpost record, @Param("example") ForumpostExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	int updateByExample(@Param("record") Forumpost record, @Param("example") ForumpostExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	int updateByPrimaryKeySelective(Forumpost record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	int updateByPrimaryKeyWithBLOBs(Forumpost record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table forumpost
	 * @mbg.generated  Thu May 03 08:06:12 CST 2018
	 */
	int updateByPrimaryKey(Forumpost record);
}