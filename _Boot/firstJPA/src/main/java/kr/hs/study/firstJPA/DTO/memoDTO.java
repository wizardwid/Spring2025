package kr.hs.study.firstJPA.DTO;

import kr.hs.study.firstJPA.Entity.memoEntity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class memoDTO {
    private Long id;
    private String title;
    private String content;

    // DTO -> Entity로 변환
    public static memoEntity toEntity(memoDTO dto){
        return memoEntity.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .content(dto.getContent())
                .build();
    }
}
