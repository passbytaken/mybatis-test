package me.ele.napos.mybatis.dao;

import me.ele.napos.mybatis.annotations.SqlMapper;
import me.ele.napos.mybatis.model.EleShikigami;
import me.ele.napos.mybatis.model.EleShikigamiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@SqlMapper
public interface EleShikigamiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_shikigami
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int countByExample(EleShikigamiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_shikigami
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int deleteByExample(EleShikigamiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_shikigami
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_shikigami
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int insert(EleShikigami record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_shikigami
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int insertSelective(EleShikigami record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_shikigami
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    List<EleShikigami> selectByExample(EleShikigamiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_shikigami
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    EleShikigami selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_shikigami
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int updateByExampleSelective(@Param("record") EleShikigami record, @Param("example") EleShikigamiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_shikigami
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int updateByExample(@Param("record") EleShikigami record, @Param("example") EleShikigamiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_shikigami
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int updateByPrimaryKeySelective(EleShikigami record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ele_shikigami
     *
     * @mbggenerated Wed Apr 12 15:38:16 CST 2017
     */
    int updateByPrimaryKey(EleShikigami record);
}