package kr.hs.study.signUp.DTO;

import kr.hs.study.signUp.Entity.joinEntity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class joinDTO {
    private Long id;
    private String email;
    private String passwd;
    private String name;

    public static joinEntity toEntity(joinDTO dto){
        return joinEntity.builder()
                .id(dto.getId())
                .email(dto.getEmail())
                .passwd(dto.getPasswd())
                .name(dto.getName())
                .build();
    }
}
