/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.waa.amazing.domain.repository.impl;

import edu.mum.waa.amazing.domain.Category;
import edu.mum.waa.amazing.domain.repository.ICategoryRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author FredsFreshDeals
 */
@Repository
public class InMemoryCategoryRepositoryImpl implements ICategoryRepository {

    private List<Category> records;
    
    public InMemoryCategoryRepositoryImpl() {
        records = new ArrayList<Category>();
        
        Category record = new Category();
        
        record.setId("1");
        record.setName("Clothing");
        record.setDesc("");
        records.add(record);
        
        record.setId("2");
        record.setName("Computers");
        record.setDesc("");
        records.add(record);
        
        record.setId("3");
        record.setName("Tools");
        record.setDesc("");
        records.add(record);
        
        record.setId("4");
        record.setName("Games");
        record.setDesc("");
        records.add(record);
    }
    
    @Override
    public List<Category> findAll() {
        return records;
    }
    
}
