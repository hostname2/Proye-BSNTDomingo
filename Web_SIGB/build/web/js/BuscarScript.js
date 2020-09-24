/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var catalogo = null;
var backBean = new BackBean();

function inicializarDatos(nuevosDatos) {
    catalogo = nuevosDatos;
    console.log("Datos cargados..");
}

function obtenerLista() {
    var datos = new FormData();
//    let porDato = document.getElementById("dato").value;
    let refCampo = document.getElementById("dato");
    if (refCampo) {
        let v = refCampo.value;
        console.log(v);
        if (!(typeof (v) === 'undefined' || v === null || v === "")) {
            datos.append("dato", v);
        }
    }

    getJSON('ServletBusquedaDocumentos', datos, procesarRespuesta);
//        inicializarDatos(new ServletBusquedaDocumentos().ListaDocumentosJson(porDato));
}

function procesarRespuesta() {
    console.log("se actualizari la tabla con un metodo");
}

function retornaDato() {
    let porDato = document.getElementById("dato").value;

    return porDato;
}

function show()
{
    var v_id = document.getElementById("dato").value; //se tiene el objeto select
    console.log(v_id);
//$("#dati").load("TextServlet",{id:v_id});
}

function BackBean() {
    this.dato = null;
}


