package com.embarkx.firstjobapp.company;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    Boolean updateCompany(Company company, Long id);
    void createCompany(Company company);
    boolean deleteCompanyById(Long id);
    Company getCompanyById(Long id);
}
