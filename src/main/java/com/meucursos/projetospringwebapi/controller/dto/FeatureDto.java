package com.meucursos.projetospringwebapi.controller.dto;

import com.meucursos.projetospringwebapi.domain.model.Feature;
import com.meucursos.projetospringwebapi.domain.model.News;

public record FeatureDto(Long id, String icon, String description) {

    public FeatureDto(Feature dtoFeature) {
        this(dtoFeature.getId(), dtoFeature.getIcon(), dtoFeature.getDescription());
    }

    public Feature toDtoFeature() {
        Feature dtoFeature = new Feature();
        dtoFeature.setId(this.id);
        dtoFeature.setIcon(this.icon);
        dtoFeature.setDescription(this.description);
        return dtoFeature;
    }
}