package com.gauravpathak.mappper;

import com.gauravpathak.dto.CategoryDto;
import com.gauravpathak.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE  =  Mappers.getMapper(CategoryMapper.class);

    @Mapping(source = "categoryId",target = "categoryId")
    CategoryDto categoryToCategoryDto(Category category);
}
