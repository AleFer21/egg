var menu = `Que operacion desea realizar?\n
1. Sumar\n
2. Restar\n
3. Multiplicar\n
4. Dividir\n
5. Salir\n`;

var opcion = 0;
var op1 = 0;
var op2 = 0;

do {
    opcion = parseInt(prompt(menu));
    switch (opcion) {
        case 1:
            op1 = parseInt(prompt("Ingrese el operador 1:"));
            op2 = parseInt(prompt("Ingrese el operador 2:"));
            var suma = op1 + op2;
            alert("La suma es: " + suma);
            break;
        case 2:
            op1 = parseInt(prompt("Ingrese el operador 1:"));
            op2 = parseInt(prompt("Ingrese el operador 2:"));
            var resta = op1 - op2;
            alert("La resta es: " + resta);
            break;
        case 3:
            op1 = parseInt(prompt("Ingrese el operador 1:"));
            op2 = parseInt(prompt("Ingrese el operador 2:"));
            var multiplicacion = op1 * op2;
            alert("La multiplicacion es: " + multiplicacion);
            break;
        case 4:
            op1 = parseInt(prompt("Ingrese el operador 1:"));
            op2 = parseInt(prompt("Ingrese el operador 2:"));
            var division = op1 / op2;
            alert("La division es: " + division);
            break;
        case 5: 
            alert("Usted ha salido del programa");
            break;
    }
} while (opcion != 5);

alert("Adios");