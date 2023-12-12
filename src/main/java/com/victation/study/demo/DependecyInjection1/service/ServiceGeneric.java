package com.victation.study.demo.DependecyInjection1.service;


import com.victation.study.demo.DependecyInjection1.auto.Automovel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceGeneric {

    private final List<Automovel> automoveis;

    @Autowired
    public ServiceGeneric(List<Automovel> automoveis) {
        this.automoveis = automoveis;
    }

    public void andarComTodos() {
        for (Automovel automovel : automoveis) {
            automovel.andar();
        }
    }




}
