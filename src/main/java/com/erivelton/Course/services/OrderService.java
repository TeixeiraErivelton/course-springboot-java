package com.erivelton.Course.services;

import com.erivelton.Course.entities.Order;
import com.erivelton.Course.entities.User;
import com.erivelton.Course.repositories.OrderRepository;
import com.erivelton.Course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
