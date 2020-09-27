
function validarPasswd(contrasena, contrasena2, form) {

    var p1 = document.getElementById(contrasena).value;
    var p2 = document.getElementById(contrasena2).value;
    var espacios = false;
    var cont = 0;

    // Este bucle recorre la cadena para comprobar
    // que no todo son espacios
    while (!espacios && (cont < p1.length)) {
        if (p1.charAt(cont) == " ")
            espacios = true;
        cont++;
    }

//    if (espacios) {
//        alert("La contraseña no puede contener espacios en blanco");
//        document.getElementById(myForm).reset();
//        return false;
//    }
//
//    if (p1.length == 0 || p2.length == 0) {
//        alert("Los campos de la password no pueden quedar vacios");
//        document.getElementById(myForm).reset();
//        return false;
//    }

    if (p1 != p2) {
        alert("Las passwords deben de coincidir");
        document.getElementById(contrasena).value = "";
        document.getElementById(contrasena2).value = "";
//        return false;
    
    } else {
        alert("Todo esta correcto");
        return true;
    }
}
    