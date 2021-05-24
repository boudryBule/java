//tipo de dato string
var nombre = "Carlos";
console.log(nombre);

//las variables de javascript son dinámicas
nombre = 10;
console.log(typeof nombre); //con typeof podemos ver el tipo de dato

//tipo de dato numerico
var numero = 1000;
console.log(numero);

//tipo de dato object

var objeto = {
    nombre : "Juan",
    apellido : "Perez", 
    telefono : "20202022"
}

console.log(typeof objeto);

//tipo de dato boolean (se les conoce como bandera)

var bandera = true;

console.log(typeof bandera);


//tipo de fato function

function miFuncion(){}

console.log(typeof miFuncion);

//tipo Symbol

var simbolo = Symbol("mi simbolo"); //crear un valor unico de una variable

console.log(typeof simbolo);


//Tipo clase es una funcción

class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

console.log(typeof Persona);


//tipo  undefined

var x;
console.log(x); //al no ponerle ningún valor, la trata como undefined

x = undefined;

console.log(x);
//null = ausencia de valor

var y  = null;

console.log(y);