/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.waa.amazing.service.impl;

import edu.mum.waa.amazing.domain.Category;
import edu.mum.waa.amazing.domain.repository.ICategoryRepository;
import edu.mum.waa.amazing.service.ICategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author FredsFreshDeals
 */
@Service
public class CategoryServiceImpl implements ICategoryService {
    
    @Autowired
    private ICategoryRepository repo;

    @Override
    public List<Category> findAll() {
        return repo.findAll();
    }
    
}
