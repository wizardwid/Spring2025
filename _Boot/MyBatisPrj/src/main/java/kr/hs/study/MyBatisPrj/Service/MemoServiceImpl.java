package kr.hs.study.MyBatisPrj.Service;

import kr.hs.study.MyBatisPrj.DAO.MemoDAO;
import kr.hs.study.MyBatisPrj.DTO.memoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoServiceImpl implements MemoService {
    @Autowired
    private MemoDAO dao;

    @Override
    public void insert(memoDTO dto) {
        dao.insert(dto);
    }

    @Override
    public List<memoDTO> listAll() {
        return List.of();
    }

    @Override
    public void update(int idx) {

    }

    @Override
    public void delete(int idx) {

    }
}
