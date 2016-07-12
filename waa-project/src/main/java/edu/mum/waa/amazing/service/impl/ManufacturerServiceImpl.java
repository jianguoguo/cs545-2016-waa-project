/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.waa.amazing.service.impl;

import edu.mum.waa.amazing.domain.Manufacturer;
import edu.mum.waa.amazing.domain.repository.IManufacturerRepository;
import edu.mum.waa.amazing.service.IManufacturerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author FredsFreshDeals
 */
@Service
public class ManufacturerServiceImpl implements IManufacturerService{
    @Autowired
    private IManufacturerRepository repo;

    @Override
    public List<Manufacturer> findAll() {
        return repo.findAll();
    }
}
