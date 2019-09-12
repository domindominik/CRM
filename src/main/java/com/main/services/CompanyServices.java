package com.main.services;

import com.main.dto.CompanyDto;
import com.main.model.CompanyModel;
import com.main.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

import static com.main.mapper.CompanyMapper.toEntity;

@Service
public class CompanyServices
{
    private CompanyRepository companyRepository;

    @Autowired
    public CompanyServices(CompanyRepository companyRepository)
    {
        this.companyRepository = companyRepository;
    }

    @Transactional
    public List<CompanyModel> findAll()
    {
        return this.companyRepository.findAll();
    }

    @Transactional
    public CompanyModel findBtId(Long id)
    {
        return this.companyRepository.findById(id).get();
    }

    @Transactional
    public CompanyModel addCompany(CompanyDto companyDto)
    {
        return this.companyRepository.save(toEntity(companyDto));
    }

    @Transactional
    public void deleteById(Long id)
    {
        this.companyRepository.deleteById(id);
    }
}
