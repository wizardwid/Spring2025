package kr.hs.study.signUp.Service;

import kr.hs.study.signUp.DTO.joinDTO;
import kr.hs.study.signUp.Entity.joinEntity;
import kr.hs.study.signUp.Repository.joinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class joinServiceImpl implements joinService{
    @Autowired
    private joinRepository repo;

    @Override
    public void save(joinDTO dto){
        joinEntity jo =joinDTO.toEntity(dto);
        repo.save(jo);
    }

    @Override
    public List<joinDTO> findAll(){
        List<joinEntity> jEntity =repo.findAll();
        List<joinDTO> dtoList = new ArrayList<>();

        for(joinEntity txt : jEntity){
            joinDTO j = joinEntity.toDTO(txt);
            dtoList.add(j);
        }

        return dtoList;
    }
}
