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
        return dao.listAll();
    }

    @Override
    public void update(memoDTO dto) {
        dao.update(dto);
    }

    @Override
    public void delete(int idx) {
        dao.delete(idx);
    }

    @Override
    public memoDTO selectOne(int idx) {
        return dao.selectOne(idx);
    }
}
