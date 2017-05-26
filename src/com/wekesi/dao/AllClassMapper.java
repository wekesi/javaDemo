package com.wekesi.dao;

import com.wekesi.pojo.AllClass;
import com.wekesi.pojo.AllClassExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AllClassMapper {
    int countByExample(AllClassExample example);

    int deleteByExample(AllClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AllClass record);

    int insertSelective(AllClass record);

    List<AllClass> selectByExampleWithBLOBs(AllClassExample example);

    List<AllClass> selectByExample(AllClassExample example);

    AllClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AllClass record, @Param("example") AllClassExample example);

    int updateByExampleWithBLOBs(@Param("record") AllClass record, @Param("example") AllClassExample example);

    int updateByExample(@Param("record") AllClass record, @Param("example") AllClassExample example);

    int updateByPrimaryKeySelective(AllClass record);

    int updateByPrimaryKeyWithBLOBs(AllClass record);

    int updateByPrimaryKey(AllClass record);


}