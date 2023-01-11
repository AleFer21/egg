function Libro(isbn, titulo, autor, nroPaginas) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.nroPaginas = nroPaginas;
}


function crearLibro() {
    let isbn = prompt("Ingrese el ISBN:");
    let titulo = prompt("Ingrese el titulo:");
    let autor = prompt("Ingrese el autor:");
    let nroPaginas = prompt("Imgrese el numero de paginas:");
    let libro = new Libro(isbn, titulo, autor, nroPaginas);

    return libro;
}

console.log(crearLibro());


