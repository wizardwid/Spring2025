package kr.hs.study.signUp.Service;

import kr.hs.study.signUp.DTO.joinDTO;
import kr.hs.study.signUp.Entity.joinEntity;
import kr.hs.study.signUp.Repository.joinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public joinDTO login(joinDTO dto) {
        // repo의 find..........메서드 호출해서 가져와서
        // optional<joinEntity> memberName에 대입

        Optional<joinEntity> name =  repo.findByName(dto.getName());
        if(name.isPresent()){
            joinEntity jo = name.get(); // optional을 벗긴다.
            if(jo.getPasswd().equals(dto.getPasswd())){
                joinDTO j = joinEntity.toDTO(jo); // j : name, passwd
                System.out.println(j);
                return j;
            }
            else{
                return null;
            }
        }
        else{
            return  null;
        }
    }

    @Override
    public joinDTO update(joinDTO dto) {
        Optional<joinEntity> id = repo.findById(dto.getId());
        joinEntity jo = id.get();

        jo.setEmail(dto.getEmail());
        jo.setPasswd(dto.getPasswd());
        jo.setName(dto.getName());

        repo.save(jo);
        return dto;
    }

    @Override
    public joinDTO selectOne(Long id) {
        Optional<joinEntity> idx = repo.findById(id);

        if (idx.isPresent()) {
            joinEntity jo = idx.get();
            return joinEntity.toDTO(jo);
        }
        else {
            return null;
        }
    }
}
