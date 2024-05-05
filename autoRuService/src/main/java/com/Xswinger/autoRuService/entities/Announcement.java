package com.Xswinger.autoRuService.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Announcement {
    
    @Id
    private Long id;

    @Column
    private Long modelId;

    @Column
    private Integer price;

    @Column
    private boolean relevance;

}