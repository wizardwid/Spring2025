package kr.hs.study.firstJPA.Entity;

import jakarta.persistence.*;
import kr.hs.study.firstJPA.DTO.memoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="memoJpa")
public class memoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 20, unique = true)
    private String title;
    @Column
    private String content;

    // Entity -> DTO로 변환
    public static memoDTO toDTO(memoEntity ent){
        return memoDTO.builder()
                .id(ent.getId())
                .title(ent.getTitle())
                .content(ent.getContent())
                .build();
    }
}
