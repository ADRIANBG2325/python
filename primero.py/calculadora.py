import tkinter as tk
from tkinter import messagebox
from tkinter.simpledialog import askstring
import numpy as np
import matplotlib.pyplot as plt

# Funciones para operaciones básicas
def suma_vectores():
    v1 = askstring("Suma de vectores", "Ingresa el primer vector (ejemplo: [x, y]): ")
    v2 = askstring("Suma de vectores", "Ingresa el segundo vector (ejemplo: [x, y]): ")
    try:
        v1 = np.array(eval(v1))
        v2 = np.array(eval(v2))
        resultado = np.add(v1, v2)
        messagebox.showinfo("Resultado", f"Suma: {resultado}")
        graficar_vectores(v1, v2, resultado, "Suma")
    except Exception as e:
        messagebox.showerror("Error", f"Entrada inválida: {e}")

def resta_vectores():
    v1 = askstring("Resta de vectores", "Ingresa el primer vector (ejemplo: [x, y]): ")
    v2 = askstring("Resta de vectores", "Ingresa el segundo vector (ejemplo: [x, y]): ")
    try:
        v1 = np.array(eval(v1))
        v2 = np.array(eval(v2))
        resultado = np.subtract(v1, v2)
        messagebox.showinfo("Resultado", f"Resta: {resultado}")
        graficar_vectores(v1, v2, resultado, "Resta")
    except Exception as e:
        messagebox.showerror("Error", f"Entrada inválida: {e}")

def producto_punto():
    v1 = askstring("Producto punto", "Ingresa el primer vector (ejemplo: [x, y]): ")
    v2 = askstring("Producto punto", "Ingresa el segundo vector (ejemplo: [x, y]): ")
    try:
        v1 = np.array(eval(v1))
        v2 = np.array(eval(v2))
        resultado = np.dot(v1, v2)
        messagebox.showinfo("Resultado", f"Producto punto: {resultado}")
    except Exception as e:
        messagebox.showerror("Error", f"Entrada inválida: {e}")

def producto_cruz():
    v1 = askstring("Producto cruz", "Ingresa el primer vector (ejemplo: [x, y, z]): ")
    v2 = askstring("Producto cruz", "Ingresa el segundo vector (ejemplo: [x, y, z]): ")
    try:
        v1 = np.array(eval(v1))
        v2 = np.array(eval(v2))
        resultado = np.cross(v1, v2)
        messagebox.showinfo("Resultado", f"Producto cruz: {resultado}")
    except Exception as e:
        messagebox.showerror("Error", f"Entrada inválida: {e}")

def graficar_vectores(v1, v2, resultado, operacion):
    plt.quiver(0, 0, v1[0], v1[1], angles='xy', scale_units='xy', scale=1, color='r', label='Vector 1')
    plt.quiver(0, 0, v2[0], v2[1], angles='xy', scale_units='xy', scale=1, color='b', label='Vector 2')
    plt.quiver(0, 0, resultado[0], resultado[1], angles='xy', scale_units='xy', scale=1, color='g', label=f'Resultado: {operacion}')
    plt.xlim(-10, 10)
    plt.ylim(-10, 10)
    plt.grid()
    plt.legend()
    plt.title(f'Operación: {operacion}')
    plt.show()

def graficar_parametrica():
    fx = askstring("Curva paramétrica", "Ingresa la función x(t) en términos de t (ejemplo: np.cos(t)): ")
    fy = askstring("Curva paramétrica", "Ingresa la función y(t) en términos de t (ejemplo: np.sin(t)): ")
    t_range = askstring("Rango de t", "Ingresa el rango de t (ejemplo: [0, 2*np.pi]): ")
    try:
        fx = eval(f"lambda t: {fx}")
        fy = eval(f"lambda t: {fy}")
        t_range = eval(t_range)
        t = np.linspace(*t_range, 1000)
        plt.plot(fx(t), fy(t), label="Curva paramétrica")
        plt.xlabel("x")
        plt.ylabel("y")
        plt.grid()
        plt.legend()
        plt.title("Curva paramétrica")
        plt.show()
    except Exception as e:
        messagebox.showerror("Error", f"Entrada inválida: {e}")

def salir():
    if messagebox.askyesno("Salir", "¿Estás seguro de que deseas salir?"):
        root.destroy()

# Crear la ventana principal
root = tk.Tk()
root.title("Calculadora Gráfica de Vectores y Curvas")
root.geometry("400x400")

# Crear botones para cada función
tk.Label(root, text="Selecciona una operación", font=("Arial", 16)).pack(pady=10)
tk.Button(root, text="1. Suma de vectores", command=suma_vectores, width=30).pack(pady=5)
tk.Button(root, text="2. Resta de vectores", command=resta_vectores, width=30).pack(pady=5)
tk.Button(root, text="3. Producto punto", command=producto_punto, width=30).pack(pady=5)
tk.Button(root, text="4. Producto cruz", command=producto_cruz, width=30).pack(pady=5)
tk.Button(root, text="5. Graficar curva paramétrica", command=graficar_parametrica, width=30).pack(pady=5)
tk.Button(root, text="Salir", command=salir, width=30, bg="red", fg="white").pack(pady=20)

# Ejecutar la ventana principal
root.mainloop()
