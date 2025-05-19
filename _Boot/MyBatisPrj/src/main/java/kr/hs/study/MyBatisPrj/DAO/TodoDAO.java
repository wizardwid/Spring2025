package kr.hs.study.MyBatisPrj.DAO;

import kr.hs.study.MyBatisPrj.DTO.todoDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodoDAO {
    public void insert(todoDTO dto);
}
