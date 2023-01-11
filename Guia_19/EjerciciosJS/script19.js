let arregloA = [];
for(let i = 0; i < 50; i++) {
    arregloA[i] = Math.random() * 100 + 1;
}
let arregloB = [];
for(let i = 0; i < 20; i++) {
    arregloB[i] = Math.random() * 100 + 1;
}

arregloA.sort();
let arregloAux1 = arregloA.slice(arregloA.length - 10, arregloA.length);

console.log(arregloA);
console.log(arregloB);
console.log(arregloAux);

