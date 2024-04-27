package com.eazybytes.accounts.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDateTime;

@Getter@Setter@ToString@MappedSuperclass
public class BaseEntity {
    @Column(updatable = false)
    private LocalDateTime createdAt;
    @Column(updatable = false)
    private LocalDateTime createdBy;
    @Column(insertable = false)
    private LocalDateTime updatedBy;
    @Column(insertable = false)
    private LocalDateTime updatedAt;
}
