/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mum.waa.amazing.domain;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author FredsFreshDeals
 */
public class ShippingAddress extends Address {
    private String name;
    
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private LocalDate shippingDate;
    
    private Address shippingAddress;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the shippingDate
     */
    public LocalDate getShippingDate() {
        return shippingDate;
    }

    /**
     * @param shippingDate the shippingDate to set
     */
    public void setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
    }

    /**
     * @return the shippingAddress
     */
    public Address getShippingAddress() {
        return shippingAddress;
    }

    /**
     * @param shippingAddress the shippingAddress to set
     */
    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

}
