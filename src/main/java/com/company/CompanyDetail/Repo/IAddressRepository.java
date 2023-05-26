package com.company.CompanyDetail.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.CompanyDetail.Bean.Address;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Integer>{

}
