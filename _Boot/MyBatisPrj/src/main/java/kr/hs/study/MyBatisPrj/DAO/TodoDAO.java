package kr.hs.study.MyBatisPrj.DAO;

import kr.hs.study.MyBatisPrj.DTO.todoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoDAO {
    public void insert(todoDTO dto);

    public List<todoDTO> listAll();

    public void update(todoDTO dto);

    public todoDTO selectOne(int idx);

    public String selectPw(int idx);

    public void delete(int idx);
}
