
package com.jinna.springit.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * @author j.nair@douglas.de
 */
@Entity
@NoArgsConstructor
@Data
public class Link extends Auditable{
    @Id
    @GeneratedValue
   private Long id;

    @NonNull
    private String title;

    @NonNull
    private String url;

    @OneToMany(mappedBy = "link")
    private List<Comment> comments= new ArrayList<>();


}
