package com.main.mapper;

import com.main.dto.TypeDto;
import com.main.model.TypeModel;

public class TypeMapper
{
    public static TypeDto toDro(TypeModel typeModel)
    {
        TypeDto typeDto = new TypeDto();
        typeDto.setName(typeModel.getName());
        return typeDto;
    }

    public static TypeModel toEntity(TypeDto typeDto)
    {
        TypeModel typeModel = new TypeModel();
        typeModel.setName(typeDto.getName());
        return typeModel;
    }
}
