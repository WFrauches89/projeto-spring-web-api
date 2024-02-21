package com.meucursos.projetospringwebapi.controller.dto;

import com.meucursos.projetospringwebapi.domain.model.News;

public record NewsDto(Long id, String icon, String description) {

    public NewsDto(News dtoNews) {
        this(dtoNews.getId(), dtoNews.getIcon(), dtoNews.getDescription());
    }

    public News toDtoNews() {
        News dtoNews = new News();
        dtoNews.setId(this.id);
        dtoNews.setIcon(this.icon);
        dtoNews.setDescription(this.description);
        return dtoNews;
    }
}
