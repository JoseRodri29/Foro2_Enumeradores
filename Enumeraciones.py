class Color:
    BLANCO = "Blanco"
    AZUL = "Azul"
    VERDE = "Verde"
    ROJO = "Rojo"

colores = {
    "Blanco": 0,
    "Azul": 1,
    "Verde": 2,
    "Rojo": 3
}

rotulador = Color.ROJO

print("¡Bienvenido al programa de colores!")
print("Por favor, seleccione un color:")

for color in colores:
    print(f"{color}: {colores[color]}")

seleccionValida = False
while not seleccionValida:
    opcion = input("Seleccione el color deseado: ")
    if opcion in colores:
        rotulador = colores[opcion]
        seleccionValida = True
    else:
        print("Por favor, seleccione una opción válida.")

if rotulador == colores[Color.ROJO]:
    print("Ha seleccionado el color rojo.")
elif rotulador == colores[Color.AZUL]:
    print("Ha seleccionado el color azul.")
elif rotulador == colores[Color.VERDE]:
    print("Ha seleccionado el color verde.")
elif rotulador == colores[Color.BLANCO]:
    print("Ha seleccionado el color blanco.")
else:
    print("Color indefinido.")
