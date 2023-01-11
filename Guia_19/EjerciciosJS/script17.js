function rellenarArray(arr) {
    for(let i = 0; i < 8; i++) {
        arr[i] = parseInt(Math.random() * 100 + 1);
    }
}

function borrarElementos(arr) {
    delete arr[arr.length - 1];
    delete arr[arr.length - 2];
}

let arr1 = [];
rellenarArray(arr1);
console.log(arr1);
borrarElementos(arr1);
console.log(arr1);
