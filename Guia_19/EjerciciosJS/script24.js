function calcular() {
    let radio = parseFloat(document.getElementById("radio").value);
    let area = Math.PI * radio**2;
    document.getElementById("area").value = area;
    let perimetro = 2 * Math.PI * radio;
    document.getElementById("perimetro").value = perimetro;
    return false;
}

window.onload = () => {
    document.getElementById("formRadio").onsubmit = calcular;
}