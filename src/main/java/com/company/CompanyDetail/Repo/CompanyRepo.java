package com.company.CompanyDetail.Repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.company.CompanyDetail.Bean.CompanyEntity;

@Service
public interface CompanyRepo extends JpaRepository<CompanyEntity, Integer>{

    public List<CompanyEntity> findByCategory(String category);
    
    public List<CompanyEntity> findByCountry(String country);
    
 //   public List<CompanyEntity> findByCompanyname(String name);

}
