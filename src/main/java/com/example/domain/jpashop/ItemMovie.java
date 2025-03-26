package com.example.domain.jpashop;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("MOVIE")
//@Table(name="TB_ITEM_MOVIE")
@Getter @Setter
public class ItemMovie extends Item{
    private String director;
    private String actor;
}
