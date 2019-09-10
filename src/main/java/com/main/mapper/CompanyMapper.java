package com.main.mapper;

import com.main.dto.CompanyDto;
import com.main.model.CompanyModel;

public class CompanyMapper
{
    public static CompanyDto toDto(CompanyModel companyModel)
    {
        CompanyDto companyDto = new CompanyDto();
        companyDto.setName(companyModel.getName());
        companyDto.setType(companyModel.getType());
        companyDto.setNip(companyModel.getNip());
        companyDto.setRegon(companyModel.getRegon());
        companyDto.setKrs(companyModel.getKrs());
        companyDto.setCity(companyModel.getCity());
        companyDto.setStreet(companyModel.getStreet());
        companyDto.setNumber(companyModel.getNumber());
        companyDto.setPostcode(companyModel.getPostcode());
        companyDto.setContactPersonName(companyModel.getContactPersonName());
        companyDto.setContactPersonSurname(companyModel.getContactPersonSurname());
        companyDto.setPhoneNumber(companyModel.getPhoneNumber());
        companyDto.setContactPersonName2(companyModel.getContactPersonName2());
        companyDto.setContactPersonSurname(companyModel.getContactPersonSurname2());
        companyDto.setPhoneNumber2(companyModel.getPhoneNumber2());
        return companyDto;
    }

    public static CompanyModel toEntity(CompanyDto companyDto)
    {
        CompanyModel companyModel = new CompanyModel();
        companyModel.setName(companyDto.getName());
        companyModel.setType(companyDto.getType());
        companyModel.setNip(companyDto.getNip());
        companyModel.setRegon(companyDto.getRegon());
        companyModel.setKrs(companyDto.getKrs());
        companyModel.setRegion(companyDto.getRegion());
        companyModel.setCity(companyDto.getCity());
        companyModel.setStreet(companyDto.getStreet());
        companyModel.setNumber(companyDto.getNumber());
        companyModel.setPostcode(companyDto.getPostcode());
        companyModel.setContactPersonName(companyDto.getContactPersonName());
        companyModel.setContactPersonSurname(companyDto.getContactPersonSurname());
        companyModel.setPhoneNumber(companyDto.getPhoneNumber());
        companyModel.setContactPersonName2(companyDto.getContactPersonName2());
        companyModel.setContactPersonSurname2(companyDto.getContactPersonSurname2());
        companyModel.setPhoneNumber2(companyDto.getPhoneNumber2());
        return companyModel;
    }
}
