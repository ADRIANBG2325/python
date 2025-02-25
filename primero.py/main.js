const formulario =document.getElementById("formulario");
const email= document.getElementById("email");
const password= document.getElementById("password")
const confir_password= document.getElementById("confirm_password")



const users = [
    {
      email:"adrianbg@gmail.com",
      password: "123"
    },{

        email:"yare@book.com",
        password:"libros"
    },
]
const manejo_Formulario=(evento)=>{
    evento.preventDefault();
    const mail= email.value.trim();
    const passwordd=password.value;
    const passwordConfirm=confir_password.value;
    
    const mensaje=passwordd=== passwordConfirm?
    "contraseñas iguales":
    "las contraseñas no coinciden";
    alert(mensaje);
     let userConforimed=users.find((usr)=>usr.email ===mail && usr.password
===passwordd && passwordd===passwordConfirm);

if(userConforimed){
    alert("Usuario logueado");

}else {
    alert("las credenciales son incorrectas");
}

}
formulario.addEventListener("submit",manejo_Formulario);


document.addEventListener("DOMContentLoaded", function () {
    document.querySelectorAll(".toggle-password").forEach(button => {
        button.addEventListener("click", function () {
            let input = this.previousElementSibling; // Selecciona el input antes del icono 👁
            if (input.type === "password") {
                input.type = "text"; // Muestra la contraseña
                this.textContent = "🙈"; // Cambia el icono
            } else {
                input.type = "password"; // Oculta la contraseña
                this.textContent = "👁"; // Restaura el icono
            }
        });
    });
});