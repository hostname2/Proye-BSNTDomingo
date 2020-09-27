/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var catalogo = null;

//function inicializarDatos(nuevaLista) {
//    catalogo = nuevaLista;
//    console.log("Datos cargados...");
//    console.log(catalogo);
//}

function cargarListado() {
    var datos = new FormData();
    getJSON('ListadoDocumentos', datos, procesarRespuesta);
}

function procesarRespuesta(datos) {
    console.log(datos);
    catalogo = datos["lista-libros"];

    for (var i = 0; i < catalogo.length; i++) {
        var producto = catalogo[i];
        console.log(catalogo[i]);
        agregar(producto);
    }
}


function agregar(nuevoDoc) {
    var refTabla = document.getElementById("cuerpoTabla");
    if (refTabla && nuevoDoc) {
        var datosProducto = {
            pn_sTitulo: nuevoDoc.pn_sTitulo,
            pn_sAutor: nuevoDoc.pn_sAutor,
            pn_sIdioma: nuevoDoc.pn_sIdioma,
            pn_sFechaEdicion: nuevoDoc.pn_sFechaEdicion,
            pn_sMateria: nuevoDoc.pn_sMateria,
            pn_sISBN: nuevoDoc.pn_sISBN,
            pn_sEjemplares: nuevoDoc.pn_sEjemplares,
            pn_sNota: nuevoDoc.pn_sNota,
            pn_sTipo: nuevoDoc.pn_sTipo,
            pn_sISN: nuevoDoc.pn_sISN,
            pn_sFormatoDoc: nuevoDoc.pn_sFormatoDoc
        };
        console.log("Agregando producto: " + JSON.stringify(nuevoDoc));
        var indice = refTabla.rows.length;
        var nuevaFila = refTabla.insertRow(-1);
        var nuevaCelda;
//        ---------------------------------------------------------
        nuevaCelda = nuevaFila.insertCell(-1);
        nuevaCelda.id = "pn_sTitulo" + String(indice);
        nuevaCelda.innerText = datosProducto.pn_sTitulo;
//        ---------------------------------------------------------
        nuevaCelda = nuevaFila.insertCell(-1);
        nuevaCelda.id = "pn_sAutor" + String(indice);
        nuevaCelda.innerText = datosProducto.pn_sAutor;
//        ---------------------------------------------------------
        nuevaCelda = nuevaFila.insertCell(-1);
        nuevaCelda.id = "pn_sIdioma" + String(indice);
        nuevaCelda.innerText = datosProducto.pn_sIdioma;
//        ---------------------------------------------------------
        nuevaCelda = nuevaFila.insertCell(-1);
        nuevaCelda.id = "pn_sFechaEdicion" + String(indice);
        nuevaCelda.innerText = datosProducto.pn_sFechaEdicion;
//        ---------------------------------------------------------
        nuevaCelda = nuevaFila.insertCell(-1);
        nuevaCelda.id = "pn_sMateria" + String(indice);
        nuevaCelda.innerText = datosProducto.pn_sMateria;
//        ---------------------------------------------------------
        nuevaCelda = nuevaFila.insertCell(-1);
        nuevaCelda.id = "pn_sISBN" + String(indice);
        nuevaCelda.innerText = datosProducto.pn_sISBN;
//        ---------------------------------------------------------
        nuevaCelda = nuevaFila.insertCell(-1);
        nuevaCelda.id = "pn_sEjemplares" + String(indice);
        nuevaCelda.innerText = datosProducto.pn_sEjemplares;
//        ---------------------------------------------------------
        nuevaCelda = nuevaFila.insertCell(-1);
        nuevaCelda.id = "pn_sNota" + String(indice);
        nuevaCelda.innerText = datosProducto.pn_sNota;
//        ---------------------------------------------------------
        nuevaCelda = nuevaFila.insertCell(-1);
        nuevaCelda.id = "pn_sTipo" + String(indice);
        nuevaCelda.innerText = datosProducto.pn_sTipo;
//        ---------------------------------------------------------
        nuevaCelda = nuevaFila.insertCell(-1);
        nuevaCelda.id = "pn_sISN" + String(indice);
        nuevaCelda.innerText = datosProducto.pn_sISN;
//        ---------------------------------------------------------
        nuevaCelda = nuevaFila.insertCell(-1);
        nuevaCelda.id = "pn_sFormatoDoc" + String(indice);
        nuevaCelda.innerText = datosProducto.pn_sFormatoDoc;
    }
}


