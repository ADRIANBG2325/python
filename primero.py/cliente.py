import socket

# Configuración del servidor
servidor_ip = '0.0.0.0'  # Escuchar en todas las interfaces
puerto = 12346

# Crear el socket del servidor
servidor_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
servidor_socket.bind((servidor_ip, puerto))
servidor_socket.listen(1)
print(f"Escuchando en {servidor_ip}:{puerto}...")

# Aceptar la conexión del cliente
conexion, direccion_cliente = servidor_socket.accept()
print(f"Conexión establecida con {direccion_cliente}")

# Recibir el nombre del archivo
nombre_archivo = conexion.recv(1024).decode()
print(f"Recibiendo el archivo: {nombre_archivo}")

# Guardar el archivo recibido
with open(nombre_archivo, 'wb') as archivo:
    while True:
        datos = conexion.recv(1024)
        if not datos:
            break
        archivo.write(datos)
    print(f"Archivo recibido y guardado como {nombre_archivo}")

# Cerrar la conexión
conexion.close()
servidor_socket.close()
