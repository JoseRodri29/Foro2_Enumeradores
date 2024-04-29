<?php

class Color {
    const BLANCO = "Blanco";
    const AZUL = "Azul";
    const VERDE = "Verde";
    const ROJO = "Rojo";
}

$colores = [
    Color::BLANCO => 0,
    Color::AZUL => 1,
    Color::VERDE => 2,
    Color::ROJO => 3
];

$rotulador = Color::ROJO;

echo "¡Bienvenido al programa de colores!\n";
echo "Por favor, seleccione un color:\n";

foreach ($colores as $color => $value) {
    echo "$color: $value\n";
}

$seleccionValida = false;
while (!$seleccionValida) {
    $opcion = readline("Seleccione el color deseado: ");
    if (array_key_exists($opcion, $colores)) {
        $rotulador = $colores[$opcion];
        $seleccionValida = true;
    } else {
        echo "Por favor, seleccione una opción válida.\n";
    }
}

switch ($rotulador) {
    case Color::ROJO:
        echo "Ha seleccionado el color rojo.\n";
        break;
    case Color::AZUL:
        echo "Ha seleccionado el color azul.\n";
        break;
    case Color::VERDE:
        echo "Ha seleccionado el color verde.\n";
        break;
    case Color::BLANCO:
        echo "Ha seleccionado el color blanco.\n";
        break;
    default:
        echo "Color indefinido.\n";
        break;
}

?>
