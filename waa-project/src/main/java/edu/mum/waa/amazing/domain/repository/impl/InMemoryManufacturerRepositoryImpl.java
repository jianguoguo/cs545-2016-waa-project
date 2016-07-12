/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.waa.amazing.domain.repository.impl;

import edu.mum.waa.amazing.domain.Manufacturer;
import edu.mum.waa.amazing.domain.repository.IManufacturerRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author FredsFreshDeals
 */
@Repository
public class InMemoryManufacturerRepositoryImpl implements IManufacturerRepository {
     private List<Manufacturer> records;
    
    public InMemoryManufacturerRepositoryImpl() {
        records = new ArrayList<Manufacturer>();
        
        Manufacturer record = new Manufacturer();
        
        record.setId("1");
        record.setName("Apple");
        record.setDesc("");
        records.add(record);
        
        record.setId("2");
        record.setName("Samsung");
        record.setDesc("");
        records.add(record);
        
        record.setId("3");
        record.setName("Microsoft");
        record.setDesc("");
        records.add(record);
        
        record.setId("4");
        record.setName("Uniliver");
        record.setDesc("");
        records.add(record);
    }
    
    @Override
    public List<Manufacturer> findAll() {
        return records;
    }
}
