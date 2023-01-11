let valores = [true, 5, false, "hola", "adios", 2];

if(valores[3].length > valores[4].length) {
    alert(valores[3] + " es la palabra mas larga.");
} else {
    alert(valores[4] + " es la palabra mas larga.");
}

let logica1 = valores[0] && valores[0];
alert(logica1);
let logica2 = valores[0] && valores[2];
alert(logica2);
let logica3 = valores[0] || valores[2];
alert(logica3);
let logica4 = valores[2] || valores[2];
alert(logica4);

let suma = valores[1] + valores[5];
alert(suma);
let resta = valores[1] - valores[5];
alert(resta);
let multiplicacion = valores[1] * valores[5];
alert(multiplicacion);
let division = valores[1] / valores[5];
alert(division);
let exponenciacion = valores[1] ** valores[5];
alert(exponenciacion);

