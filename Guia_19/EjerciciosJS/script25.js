function getFormValores() {
    let formulario = document.forms['form1'];
    let texto = "";
    for(let elemento of formulario) {
        texto += elemento.value + '</br>';
    }

    document.getElementById('valores').innerHTML = texto;
}