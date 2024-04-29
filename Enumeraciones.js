const colors = {
    BLANCO: "Blanco",
    AZUL: "Azul",
    VERDE: "Verde",
    ROJO: "Rojo"
};

let selectedColor = colors.ROJO;

console.log("¡Bienvenido al programa de colores!");
console.log("Por favor, seleccione un color:");

Object.keys(colors).forEach(key => {
    console.log(`${key}: ${colors[key]}`);
});

const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

readline.question("Ingrese el número del color deseado: ", (number) => {
    let colorNumber = parseInt(number);
    selectedColor = Object.keys(colors).find(key => colors[key] === colors[Object.keys(colors)[colorNumber]]);
    
    if (selectedColor) {
        console.log(`Ha seleccionado el color ${selectedColor.toLowerCase()}.`);
    } else {
        console.log("Color no válido.");
    }

    readline.close();
});
