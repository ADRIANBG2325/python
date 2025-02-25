import socket
import threading

# Configuración del servidor
HOST = '127.0.0.1'  # Dirección IP del servidor
PORT = 65432         # Puerto para la conexión

# Función para manejar la recepción de archivos en el servidor
def recibir_archivo(conexion, direccion):
    print(f"Conexión establecida con {direccion}")

    # Recibir el nombre del archivo
    nombre_archivo = conexion.recv(1024).decode()
    print(f"Recibiendo archivo: {nombre_archivo}")

    # Recibir el archivo
    with open(f"recibido_{nombre_archivo}", "wb") as archivo:
        while True:
            datos = conexion.recv(1024)
            if not datos:
                break
            archivo.write(datos)

    print(f"Archivo {nombre_archivo} recibido correctamente.")

    # Enviar un archivo de vuelta
    archivo_a_enviar = "archivo_para_cliente.txt"
    print(f"Enviando archivo: {archivo_a_enviar}")
    conexion.send(archivo_a_enviar.encode())

    with open(archivo_a_enviar, "rb") as archivo:
        while chunk := archivo.read(1024):
            conexion.send(chunk)

    print("Archivo enviado correctamente.")

    conexion.close()

# Función del servidor
def servidor():
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
        s.bind((HOST, PORT))
        s.listen()
        print(f"Servidor escuchando en {HOST}:{PORT}")

        while True:
            conexion, direccion = s.accept()
            threading.Thread(target=recibir_archivo, args=(conexion, direccion)).start()

# Función del cliente
def cliente():
    with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
        s.connect((HOST, PORT))

        # Enviar un archivo al servidor
        archivo_a_enviar = "archivo_para_servidor.txt"
        print(f"Enviando archivo: {archivo_a_enviar}")
        s.send(archivo_a_enviar.encode())

        with open(archivo_a_enviar, "rb") as archivo:
            while chunk := archivo.read(1024):
                s.send(chunk)

        print("Archivo enviado correctamente.")

        # Recibir un archivo del servidor
        nombre_archivo = s.recv(1024).decode()
        print(f"Recibiendo archivo: {nombre_archivo}")

        with open(f"recibido_{nombre_archivo}", "wb") as archivo:
            while True:
                datos = s.recv(1024)
                if not datos:
                    break
                archivo.write(datos)

        print(f"Archivo {nombre_archivo} recibido correctamente.")

# Ejecutar servidor o cliente según necesidad
if __name__ == "__main__":
    print("1. Servidor\n2. Cliente")
    opcion = input("Selecciona una opción: ")

    if opcion == "1":
        servidor()
    elif opcion == "2":
        cliente()
    else:
        print("Opción no válida.")
1