package com.sistemi.informativi.builder;

import java.util.Date;

// OUTER CLASS
public class User {

    // STRUTTURA FISSA
    private String username;

    private String password;

    // END STRUTTURA FISSA

    // BEGIN STRUTTURA OPZIONALE
    private boolean isNew;

    private Date date;
    // END STRUTTURA OPZIONALE


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isNew() {
        return isNew;
    }

    public Date getDate() {
        return date;
    }



    /*
    Implementazione di un Costruttore Custom della Outer Class
    nella cui lista dei parametri viene passata in input una reference
    di tipo INNER CLASS e nel cui corpo vengono valorizzate tutte
    la variabili di istanza al valore che è stato loro assegnato
    dall'Oggetto di tipo Inner Class
     */
    private User(UserBuilder userBuilder){

        this.username=userBuilder.username;
        this.password=userBuilder.password;
        this.isNew=userBuilder.isNew;
        this.date=userBuilder.date;

    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", isNew=" + isNew +
                ", date=" + date +
                '}';
    }

    // INNER CLASS
    public static class UserBuilder {

        // STRUTTURA FISSA
        private String username;

        private String password;

        // END STRUTTURA FISSA

        // BEGIN STRUTTURA OPZIONALE
        private boolean isNew;

        private Date date;
        // END STRUTTURA OPZIONALE

        // COSTRUTTORE ADERENTE ALLA STRUTTURA FISSA
        public UserBuilder(String username, String password){

            this.username=username;
            this.password=password;

        }
        // END COSTRUTTORE ADERENTE ALLA STRUTTURA FISSA

        // BEGIN SET PARAMETRI OPZIONALI CON TIPO DI RITORNO DI TIPO INNER CLASS
        public UserBuilder setIsNew(boolean isNew){

            //inizializzazione del valore della variabile di istanza isNew
            this.isNew=isNew;
            /*
            ritorno di una reference ad un Oggetto di tipo UserBuilder
            all'interno del quale è stata inserita la variabile isNew
            in aggiunta rispetto ad un Oggetto che contiene solo la
            struttura fissa
             */
            return this;
        }


        public UserBuilder setDate(Date date){

            this.date=date;
            return this;
        }
        // END SET PARAMETRI OPZIONALI CON TIPO DI RITORNO DI TIPO INNER CLASS


        /*
        Implementazione di un metodo che
        restituisce una reference ad un
        Oggetto di tipo Outer Class
         */
        public User build(){

            return new User(this);
        }


    }




}
