package me.ele.napos.mybatis.dao;

import me.ele.napos.mybatis.annotations.SqlMapper;
import me.ele.napos.mybatis.model.EleKeeper;
import me.ele.napos.mybatis.model.EleKeeperExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@SqlMapper
public interface EleKeeperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_keeper
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int countByExample(EleKeeperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_keeper
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int deleteByExample(EleKeeperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_keeper
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_keeper
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int insert(EleKeeper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_keeper
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int insertSelective(EleKeeper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_keeper
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    List<EleKeeper> selectByExample(EleKeeperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_keeper
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    EleKeeper selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_keeper
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int updateByExampleSelective(@Param("record") EleKeeper record, @Param("example") EleKeeperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_keeper
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int updateByExample(@Param("record") EleKeeper record, @Param("example") EleKeeperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_keeper
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int updateByPrimaryKeySelective(EleKeeper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_keeper
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int updateByPrimaryKey(EleKeeper record);
}