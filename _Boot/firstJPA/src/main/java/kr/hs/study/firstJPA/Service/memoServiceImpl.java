package kr.hs.study.firstJPA.Service;

import kr.hs.study.firstJPA.DTO.memoDTO;
import kr.hs.study.firstJPA.Entity.memoEntity;
import kr.hs.study.firstJPA.Repository.memoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class memoServiceImpl implements memoService{
    @Autowired
    private memoRepository repo;

    @Override
    public void save(memoDTO dto){
        // dto -> Entity로 변환
        memoEntity me = memoDTO.toEntity(dto);
        repo.save(me);
    }
}
