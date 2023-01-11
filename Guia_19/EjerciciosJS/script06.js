let num = parseInt(prompt("Ingrese un numero:"));
if(num === 0){
    alert("El numero no es impar ni par.");
} else if (num % 2 === 0) {
    alert("El numero es par.")
} else {
    alert("El numero es impar.")
}