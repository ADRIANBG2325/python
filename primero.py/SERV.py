import socket

# Configuración del servidor
HOST = '0.0.0.0'  # Escucha en todas las interfaces de red
PORT = 5000       # Puerto para la conexión

def iniciar_servidor():
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as servidor:
        servidor.bind((HOST, PORT))
        servidor.listen()
        print(f"Servidor escuchando en {HOST}:{PORT}")
        
        # Esperar conexión
        conexion, direccion = servidor.accept()
        with conexion:
            print(f"Conexión establecida con {direccion}")
            
            # Recibir nombre del archivo
            nombre_archivo = conexion.recv(1024).decode()
            print(f"Recibiendo archivo: {nombre_archivo}")
            
            # Recibir y guardar archivo
            with open(f"recibido_{nombre_archivo}", "wb") as archivo:
                while True:
                    datos = conexion.recv(1024)
                    if not datos:
                        break
                    archivo.write(datos)
            
            print(f"Archivo {nombre_archivo} recibido y guardado como recibido_{nombre_archivo}")

if __name__ == "__main__":
    iniciar_servidor()