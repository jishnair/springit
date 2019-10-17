package com.jinna.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author j.nair@douglas.de
 */
@Entity
@Data
@NoArgsConstructor
public class Vote {
    @Id
    @GeneratedValue
    private Long id;
    private int vote;
}
