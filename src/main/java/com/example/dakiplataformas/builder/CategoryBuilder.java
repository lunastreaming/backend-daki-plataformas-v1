package com.example.dakiplataformas.builder;

import com.example.dakiplataformas.model.CategoryRequest;
import com.example.dakiplataformas.model.CategoryResponse;
import com.example.dakiplataformas.model.CategoryEntity;
import org.springframework.stereotype.Component;

@Component
public class CategoryBuilder {

    public CategoryResponse categoryResponse(CategoryEntity categoryEntity) {

        return CategoryResponse
                .builder()
                .id(categoryEntity.getId())
                .name(categoryEntity.getName())
                .imageUrl(categoryEntity.getImageUrl())
                .status(categoryEntity.getStatus())
                .description(categoryEntity.getDescription())
                .sortOrder(categoryEntity.getSortOrder())
                .build();
    }

    public CategoryEntity categoryRequest(CategoryRequest categoryRequest){

        return CategoryEntity
                .builder()
                .name(categoryRequest.getName())
                .status(categoryRequest.getStatus())
                .description(categoryRequest.getDescription())
                .imageUrl(categoryRequest.getImageUrl())
                .build();
    }
}
