package com.webproject.zerosheet;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

//import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Id;

//import javax.validation.constraints.NotBlank;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
//@Document(collection = "items")
@Entity
public class Item {
    @Id
    private String id;
    //@NotBlank(message = "Item name is required")
    private String name;
    private String unit;
    private double expectedArea;
    private double unitPrice;
    private int totalQuantity;

    @Embedded
    @OneToMany(mappedBy = "items", cascade = CascadeType.ALL)
    private List<ItemInstance> instances = new ArrayList<>();

    
    /*protected Item() {
        this.instances = new ArrayList<>();
    }

    public Item(String id, String name, String unit, double unitPrice, int totalQuantity, List<ItemInstance> instances) {
        super();
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.unitPrice = unitPrice;
        this.totalQuantity = totalQuantity;
        this.instances = instances;
    }

    public String getId() {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }
    
    public String getUnit() {
        return unit;
    }
    public void setUnit (String unit) {
        this.unit = unit;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice (double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }
    public void setTotalQuantity (int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public List<ItemInstance> getInstances() {
        return instances;
    }
    public void setInstance (List<ItemInstance> instances) {
        this.instances = instances;
    }
*/
}
