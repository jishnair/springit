
package com.jinna.springit.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author j.nair@douglas.de
 */
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Comment extends Auditable{

    @Id
    @GeneratedValue
    private Long id;
    private String body;

    @ManyToOne
    private Link link;

}
