package dev.ikhtiyor.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductPhotoDTO {
    private Long id;
    private String photoUrl;
    private Boolean main;
    private Double index;
}
