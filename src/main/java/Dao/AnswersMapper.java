package Dao;

import Entity.Answers;

public interface AnswersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Answers record);

    int insertSelective(Answers record);

    Answers selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Answers record);

    int updateByPrimaryKey(Answers record);
}