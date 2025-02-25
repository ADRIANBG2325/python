import socket
import os

# Obtener la ruta a la carpeta de Documentos
documentos = os.path.expanduser("~/Documents")

# Configuración del servidor
HOST = '0.0.0.0'  # Escucha en todas las interfaces
PORT = 65432

def iniciar_servidor():
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as servidor:
        servidor.bind((HOST, PORT))
        servidor.listen(5)
        print(f"Servidor escuchando en {HOST}:{PORT}")
        
        while True:
            conn, addr = servidor.accept()
            print(f"Conexión establecida con {addr}")
            with conn:
                nombre_archivo = conn.recv(1024).decode('utf-8')
                ruta_archivo = os.path.join(documentos, nombre_archivo)
                
                with open(ruta_archivo, 'wb') as archivo:
                    print(f"Recibiendo archivo: {nombre_archivo}")
                    while True:
                        datos = conn.recv(1024)
                        if not datos:
                            break
                        archivo.write(datos)
                print(f"Archivo guardado en: {ruta_archivo}")

if __name__ == "_main_":
    iniciar_servidor()


