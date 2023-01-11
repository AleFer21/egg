const PI = 3.1415;
function Circulo(radio) {
    this.radio = radio;
    this.area = function() {
        return area = PI * radio**2;
    }
    this.perimetro = function() {
        return perimetro = 2 * PI * radio;
    }
}

let circulo1 = new Circulo(4);
console.log("El area del circulo1 es: " + circulo1.area() + ", y su perimetro es: " + circulo1.perimetro());

let circulo2 = new Circulo(3);
console.log("El area del circulo2 es: " + circulo2.area ()+ ", y su perimetro es: " + circulo2.perimetro());