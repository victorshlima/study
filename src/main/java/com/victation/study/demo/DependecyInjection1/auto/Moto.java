package com.victation.study.demo.DependecyInjection1.auto;

import org.springframework.stereotype.Component;

@Component
class Moto implements Automovel {
    @Override
    public void andar() {
        System.out.println("Moto andando...");
    }
}
