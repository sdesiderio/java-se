package com.sistemi.informativi.strategy;

public class Context {

    private final Strategy strategy;

    /*
    Il Costruttore di Context sarà
    invocato dall'Applicazione Invocante
    passando in input un Oggetto specifico
    richiesto che sarà interpretato in maniera
    corretta dalla variabile strategy di tipo
    Interfaccia Padre che assumerà la forma
    del figlio richiesto
     */
    public Context(Strategy strategy){

        this.strategy=strategy;

    }

    public String executeStrategy(){

        return strategy.getProtocol();

    }


}
