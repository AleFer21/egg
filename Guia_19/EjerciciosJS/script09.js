var mensaje = prompt("Ingrese una frase");
var cadenafinal=[];
for (var i = 0 ; i < mensaje.length; i++) {
   var cadena = mensaje.substring(i, i+1) + " ";
    cadenafinal = [cadenafinal + cadena];
}
alert(cadenafinal);
