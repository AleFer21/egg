function Persona(nombre, edad, sexo, peso, altura) {
    this.nombre = nombre;
    this.edad = edad;
    this.sexo = sexo;
    this.peso = peso;
    this.altura = altura;
}

let personaArray = (persona) => Object.values(persona);

let persona = new Persona("Juan Perez", 25, 'H', 80, 1.75);

console.log(personaArray(persona));