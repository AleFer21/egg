function Persona(nombre, edad, sexo, peso, altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
}

let persona1 = new Persona("Alejandra", 29, 'M', 58, 1.60);
let persona2 = new Persona("Juan Perez", 55, 'H', 91, 1.80);
console.log(persona1);
console.log(persona2);