package kr.hs.study.MyBatisPrj.DAO;

import kr.hs.study.MyBatisPrj.DTO.memoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemoDAO {
    // crud : 삽입 / 조회 / 수정 / 삭제

    // 1. insert
    public void insert(memoDTO dto);

    // 2. select 리턴타입 : ArrayList
    public List<memoDTO> listAll();

    // 3. update
    public void update(memoDTO dto);

    // 4. delete
    public void delete(memoDTO dto);

    public memoDTO selectOne(int idx);
}
