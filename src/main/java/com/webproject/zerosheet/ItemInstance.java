package com.webproject.zerosheet;

//import java.sql.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ItemInstance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //private Date dueBackDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    private Item items;

    public static enum Status {
        ON_LOAN, AVAILABLE, IN_MAINTENANCE, SOON_AVAILABLE ;
    }

    public ItemInstance(Status status) {
        this.status = status;    
    }

    /*protected ItemInstance() {}

    public ItemInstance (String id ) {
        super();
        this.id = id;
    }

    public String getId() {
        return id;
    } 
    public void setId (String id) {
        this.id = id;
    }*/

}