package com.koreait.rest_2024_05.article.entity;

import com.koreait.rest_2024_05.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
public class Article extends BaseEntity {
  private Long memberId;
  private String title;
  private String content;


}




