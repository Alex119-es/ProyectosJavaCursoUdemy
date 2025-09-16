#!/bin/bash

# Script para crear un nuevo proyecto Java
# Uso: ./scripts/nuevo-proyecto.sh <categoria> <nombre-proyecto>

# Colores para output
RED='\033[0;31m'
GREEN='\033[0;32m'
YELLOW='\033[1;33m'
NC='\033[0m' # No Color

# Función para mostrar ayuda
show_help() {
    echo "Uso: ./scripts/nuevo-proyecto.sh <categoria> <nombre-proyecto>"
    echo ""
    echo "Categorías disponibles:"
    echo "  fundamentos-java    - Proyectos de fundamentos básicos"
    echo "  oop-java           - Proyectos de POO"
    echo "  colecciones-java   - Proyectos sobre Collections"
    echo "  excepciones-java   - Proyectos sobre manejo de excepciones"
    echo "  archivos-java      - Proyectos sobre manejo de archivos"
    echo "  jdbc-java          - Proyectos de bases de datos"
    echo "  web-java           - Proyectos web"
    echo ""
    echo "Ejemplo:"
    echo "  ./scripts/nuevo-proyecto.sh fundamentos-java mi-calculadora"
}

# Verificar argumentos
if [ $# -ne 2 ]; then
    echo -e "${RED}Error: Se requieren exactamente 2 argumentos${NC}"
    show_help
    exit 1
fi

CATEGORIA=$1
NOMBRE_PROYECTO=$2

# Verificar que la categoría existe
if [ ! -d "projects/$CATEGORIA" ]; then
    echo -e "${RED}Error: La categoría '$CATEGORIA' no existe${NC}"
    show_help
    exit 1
fi

# Verificar que el proyecto no existe ya
if [ -d "projects/$CATEGORIA/$NOMBRE_PROYECTO" ]; then
    echo -e "${RED}Error: El proyecto '$NOMBRE_PROYECTO' ya existe en la categoría '$CATEGORIA'${NC}"
    exit 1
fi

# Crear el proyecto
echo -e "${YELLOW}Creando nuevo proyecto: $NOMBRE_PROYECTO en $CATEGORIA...${NC}"

# Copiar template
cp -r docs/templates/proyecto-template/ "projects/$CATEGORIA/$NOMBRE_PROYECTO/"

# Personalizar README
sed -i "s/Nombre del Proyecto/$NOMBRE_PROYECTO/g" "projects/$CATEGORIA/$NOMBRE_PROYECTO/README.md"
sed -i "s/proyecto-nombre/$NOMBRE_PROYECTO/g" "projects/$CATEGORIA/$NOMBRE_PROYECTO/README.md"

echo -e "${GREEN}✓ Proyecto creado exitosamente!${NC}"
echo ""
echo "Estructura creada:"
echo "projects/$CATEGORIA/$NOMBRE_PROYECTO/"
echo "├── src/main/java/com/udemy/proyecto/Main.java"
echo "├── README.md"
echo "└── notas.md"
echo ""
echo "Próximos pasos:"
echo "1. Edita projects/$CATEGORIA/$NOMBRE_PROYECTO/README.md con la descripción de tu proyecto"
echo "2. Implementa tu código en projects/$CATEGORIA/$NOMBRE_PROYECTO/src/main/java/com/udemy/proyecto/Main.java"
echo "3. Documenta tu aprendizaje en projects/$CATEGORIA/$NOMBRE_PROYECTO/notas.md"
echo "4. Compila y prueba: cd projects/$CATEGORIA/$NOMBRE_PROYECTO && javac src/main/java/com/udemy/proyecto/*.java && java -cp src/main/java com.udemy.proyecto.Main"