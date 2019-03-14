package com.gauravpathak.mappper;

import com.gauravpathak.dto.CategoryDto;
import com.gauravpathak.entity.Category;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryMapperTest {

    public static final String NAME = "Zack";
    public static final long CATEGORY_ID = 1L;
    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Test
    public void categoryToCategoryDto() throws Exception {
        Category category = new Category();
        category.setCategoryId(CATEGORY_ID);
        category.setName(NAME);

        CategoryDto categoryDto = categoryMapper.categoryToCategoryDto(category);

        assertEquals(Long.valueOf(CATEGORY_ID),categoryDto.getCategoryId());
        assertEquals(NAME,categoryDto.getName());
    }
}