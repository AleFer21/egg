let num = prompt("Ingresa un numero entero:");
while (num != 0) {
    if(num % 1 == 0) {
        num = prompt("Sigue ingresando numeros enteros:");
    } else {
        num = prompt("El numero no es entero, ingrese un numero entero:");
    }
}
alert("Saliste del programa, chau!");