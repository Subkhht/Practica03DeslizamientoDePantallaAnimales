package com.dam.android

class Animal (animal: String, alimentacion: String, reproduccion: String, tipo_alim: String, vivip_o_ovip: String){
    var animal: String
    var alimentacion: String
    var reproduccion:String
    var tipo_alim:String
    var vivip_o_ovip: String
    init {
        this.animal = animal
        this.alimentacion = alimentacion
        this.reproduccion = reproduccion
        this.tipo_alim = tipo_alim
        this.vivip_o_ovip = vivip_o_ovip
    }
}