package com.livinglibrary.mapper;

import com.livinglibrary.po.Boardmessage;
import com.livinglibrary.po.BoardmessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoardmessageMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table boardmessage
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	long countByExample(BoardmessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table boardmessage
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int deleteByExample(BoardmessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table boardmessage
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table boardmessage
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int insert(Boardmessage record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table boardmessage
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int insertSelective(Boardmessage record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table boardmessage
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	List<Boardmessage> selectByExample(BoardmessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table boardmessage
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	Boardmessage selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table boardmessage
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int updateByExampleSelective(@Param("record") Boardmessage record, @Param("example") BoardmessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table boardmessage
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int updateByExample(@Param("record") Boardmessage record, @Param("example") BoardmessageExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table boardmessage
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int updateByPrimaryKeySelective(Boardmessage record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table boardmessage
	 * @mbg.generated  Thu May 16 08:51:21 CST 2019
	 */
	int updateByPrimaryKey(Boardmessage record);
}