let limite = parseInt(prompt("Ingrese un valor limite:"));
let suma = 0;
do {
    let i = parseInt(prompt("Ingrese numeros aleatorios:"));
    suma = suma + i;
} while (suma <= limite);
alert("Se ha superado el limite.")