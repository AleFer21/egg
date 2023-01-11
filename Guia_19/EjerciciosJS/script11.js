function palabraMasLarga(str) {
    let palabra = str.split(" ");
    let masLarga = "";
    for(let i = 0; i < palabra.length; i++) {
        if(palabra[i].length > masLarga.length) {
            masLarga = palabra[i];
        }
    }
    return masLarga;
}

alert(palabraMasLarga("Escuchen corran la bola, juegan para Francia pero son todos de Angola"));