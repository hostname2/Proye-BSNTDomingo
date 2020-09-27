/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
const form = document.getElementById('form');
const nombre = document.getElementById('nombre');
const apellido = document.getElementById('apellido');
const cedula = document.getElementById('cedula');
const correo = document.getElementById('correo');
const fecha = document.getElementById('fecha-naci');
const telefono = document.getElementById('telefono');
const direccion = document.getElementById('direccion');
const contraseña = document.getElementById('contraseña');
const contraseña2 = document.getElementById('contraseña-2');

form.addEventListener('submit', (e)=>{
  e.preventDefault();

  checkInputs();
});

function checkInputs(){

  //Obtener los valores de los inputs

  const nombreValue = nombre.value.trim();
  const apellidoValue = apellido.value.trim();
  const cedulaValue = cedula.value.trim();
  const correoValue = correo.value.trim();
  const fechaValue = fecha.value.trim();
  const telefonoValue = telefono.value.trim();
  const direccionValue = direccion.value.trim();
  const contraseñaValue = contraseña.value.trim();
  const contraseña2Value = contraseña2.value.trim();


  if(nombreValue === ''){
    setErrorFor(nombre, 'El nombre no puede ser vacío');
  } else{
    setSuccessFor(nombre);
  }

  if(apellidoValue === ''){
    setErrorFor(apellido, 'El apellido no puede ser vacío');
  } else{
    setSuccessFor(apellido);
  }

  if(cedulaValue === ''){
    setErrorFor(cedula, 'La cédula no puede ser vacío');
  }  else{
    setSuccessFor(cedula);
  }

  if(correoValue === ''){
    setErrorFor(correo, 'El correo no puede ser vacío');
  } else if(!isEmail(correoValue)){
    setErrorFor(correo, 'El correo no es válido')
  } else{
    setSuccessFor(correo);
  }

  if(contraseñaValue === ''){
    setErrorFor(contraseña, 'La contraseña no puede ser vacío');
  }  else{
    setSuccessFor(contraseña);
  }

  if(contraseñaValue === ''){
    setErrorFor(contraseña, 'La contraseña no puede ser vacío');
  }  else{
    setSuccessFor(contraseña);
  }

  if(contraseña2Value === ''){
    setErrorFor(contraseña2, 'La contraseña no puede ser vacío');
  } else if(contraseñaValue !== contraseñaValue){
    setErrorFor(contraseña2, 'Las contraseñas no coinciden')
  } else{
    setSuccessFor(contraseña2);
  }

}

function setErrorFor(input, message){
  const formControl = input.parentElement; //.form-control
  const small = formControl.querySelector('small');

  //añade el mensaje de error dentro de small
  small.innerText = message;

  //añade error a la clase
  formControl.className = 'form-control error';
}

function setSuccessFor(){
  const formControl = input.parentElement;
  formControl.className = 'form-control success';
}

function isEmail(correo){
  return /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(correo);
}

