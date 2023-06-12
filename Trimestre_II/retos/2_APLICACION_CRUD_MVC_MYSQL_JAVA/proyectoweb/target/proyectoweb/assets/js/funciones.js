function validarlogin(){
    //definir variables
    var correo;
    var clave;
    correo = document.getElementById('email').value;
    clave = document.getElementById('password').value;
    if(correo=== null || clave === ""){
        alert('El correo y/o la clave no pueden quedar vacios');
        window.location.reload();
        return false;
    }
    else{
        return true;
    }
}
function validarCrearUsuario()
{ 
    var nombre;
    var apellido;
    var tipoDoc;
    var numDoc;
    var correo;
    var password;
    var activo;
    nombre = document.getElementById('name').value;
    apellido = document.getElementById('apellido').value;
    tipoDoc = document.getElementById('password').value;
    numDoc = document.getElementById('password').value;
    correo =  document.getElementById('email').value;
    password = document.getElementById('password').value;
    activo = document.getElementById('password').value;

    if(nombre==="" || apellido==="" || tipoDoc==="" || numDoc==="" ||  correo==="" || password==="" || activo==="")
    {
        alert('Ningún dato puede quedar vacío');
        window.location.reload();
        return false;
    }
    else{
        return true;
    }
}