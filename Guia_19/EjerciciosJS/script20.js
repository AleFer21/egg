let matriz = [[3], [6], [9], [12], [15]];
let vector= [];

for (let i = 0; i < matriz.length; i++) {   
    for (let j = 0; j < 1; j++) {
        vector.push(matriz[i][j]);
    }
}

for (let i = 0; i < vector.length; i++) {
    let resultado = vector[i] + 3;
    vector[i] = resultado; 
    
}

console.log(vector);