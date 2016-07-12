/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.waa.amazing.domain.repository;

import edu.mum.waa.amazing.domain.Manufacturer;
import java.util.List;

/**
 *
 * @author FredsFreshDeals
 */
public interface IManufacturerRepository {
    List<Manufacturer> findAll();
}
