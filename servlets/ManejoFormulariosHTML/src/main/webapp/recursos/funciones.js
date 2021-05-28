//este archivo va a tener las funciones para poder validar los campos

function validarForma(forma) {
    //validacion del usuario
    var usuario = forma.usuario;
    if(usuario.value == "" || usuario.value=="Escribir usuario"){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        
        return false;
    }
    //validacion password
    var password = forma.password;
    if(password.value == "" || password.value.length <3 ){
        alert("Debe proporcionar un password de al menos 3 caracteres");
        password.focus();
        password.select();
        
        
        return false;
    }
    
    //validar tecnologias
    var tecnologias = forma.tecnologia;
    var checkSeleccionado = false;
    
    for(var i = 0; i < tecnologias.length; i++){
        if(tecnologias[i].checked){
            checkSeleccionado = true;
        }
    }
    
    if(!checkSeleccionado){
        alert("Debe seleccionar una tecnología");
        return false;
    }
    
    //validar genero
    var generos = forma.genero;
    var radioSeleccionado = false;
    
    for(var i = 0; i< generos.length; i++) {
        if(generos[i].checked) {
            radioSeleccionado = true;
        }
    }
    
    if(!radioSeleccionado){
        alert("Debes seleccionar un genero");
        
        return false;
    }
    
    //validar ocupacion 
    var ocupacion = forma.ocupacion;
    if(ocupacion.value == ""){
        alert("Debe seleccionar una ocupación");
        
        return false;
    }
    
    //formulario es valido
    alert("Formulario valido, enviando datos al servidor");
    return true;
}
