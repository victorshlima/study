package com.victation.study.demo.DependecyInjection1.auto;

import org.springframework.stereotype.Component;

@Component
class Carro implements Automovel {
    @Override
    public void andar() {
        System.out.println("Carro andando...");
    }
}
