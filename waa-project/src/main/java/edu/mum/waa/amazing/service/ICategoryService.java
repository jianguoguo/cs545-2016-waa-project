/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.waa.amazing.service;

import edu.mum.waa.amazing.domain.Category;
import java.util.List;

/**
 *
 * @author FredsFreshDeals
 */
public interface ICategoryService {
    List<Category> findAll();
}
