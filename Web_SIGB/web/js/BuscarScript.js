/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var catalogo = null;


function inicializarDatos(nuevosDatos) {
    catalogo = nuevosDatos;
    console.log("Datos cargados..");
}

function obtenerLista() {
        var porDato = document.getElementById("dato").value;
        console.log(porDato);
//        inicializarDatos(new ServletBusquedaDocumentos().ListaDocumentosJson(porDato));
}

function show()
        {
                var v_id = document.getElementById("dato").value; //se tiene el objeto select
        console.log(v_id);
//$("#dati").load("TextServlet",{id:v_id});
}
        

