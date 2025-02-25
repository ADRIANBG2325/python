import socket
from tkinter import Tk
from tkinter.filedialog import askopenfilename

# Configuración del cliente
PORT = 5000  # Puerto del servidor (por defecto 5000)

def seleccionar_archivo():
    """Abre una ventana para seleccionar un archivo."""
    root = Tk()
    root.withdraw()  # Oculta la ventana principal
    archivo = askopenfilename(title="Selecciona un archivo para enviar")
    return archivo

def enviar_archivo():
    # Pedir la IP del servidor al usuario
    host = input("Introduce la IP del servidor: ")
    if not host:
        print("No se ingresó una IP. Cerrando...")
        return
    
    # Seleccionar archivo
    archivo_a_enviar = seleccionar_archivo()
    if not archivo_a_enviar:
        print("No se seleccionó ningún archivo. Cerrando...")
        return

    print(f"Archivo seleccionado: {archivo_a_enviar}")
    
    # Obtener solo el nombre del archivo (sin la ruta completa)
    nombre_archivo = archivo_a_enviar.split("/")[-1]
    
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as cliente:
        cliente.connect((host, PORT))
        print(f"Conectado al servidor {host}:{PORT}")
        
        # Enviar nombre del archivo
        cliente.sendall(nombre_archivo.encode())
        
        # Enviar contenido del archivo
        with open(archivo_a_enviar, "rb") as archivo:
            while chunk := archivo.read(1024):
                cliente.sendall(chunk)
        
        print(f"Archivo {nombre_archivo} enviado al servidor")

if __name__ == "__main__":
    enviar_archivo()

