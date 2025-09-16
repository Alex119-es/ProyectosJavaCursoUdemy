# Cómo Agregar Proyectos Java al Repositorio

## Estructura de Directorios

El repositorio está organizado por temas del curso de Java:

```
ProyectosJavaCursoUdemy/
├── projects/
│   ├── fundamentos-java/          # Proyectos de fundamentos básicos
│   ├── oop-java/                  # Proyectos de Programación Orientada a Objetos
│   ├── colecciones-java/          # Proyectos sobre Collections
│   ├── excepciones-java/          # Proyectos sobre manejo de excepciones
│   ├── archivos-java/             # Proyectos sobre manejo de archivos
│   ├── jdbc-java/                 # Proyectos de bases de datos con JDBC
│   └── web-java/                  # Proyectos web con Java
├── docs/
│   └── templates/                 # Plantillas para nuevos proyectos
└── README.md
```

## Pasos para Agregar un Nuevo Proyecto

### Opción 1: Usar el Script Automatizado (Recomendado)

Puedes usar el script `nuevo-proyecto.sh` para crear automáticamente la estructura:

```bash
./scripts/nuevo-proyecto.sh <categoria> <nombre-proyecto>
```

Ejemplo:
```bash
./scripts/nuevo-proyecto.sh fundamentos-java mi-calculadora
```

### Opción 2: Crear Manualmente

### 1. Elegir la Categoría Correcta
Determina en qué carpeta debería ir tu proyecto según el tema que cubre.

### 2. Crear la Estructura del Proyecto
Copia la plantilla desde `docs/templates/proyecto-template/` y renómbrala:

```bash
# Ejemplo para un proyecto de fundamentos
cp -r docs/templates/proyecto-template/ projects/fundamentos-java/mi-nuevo-proyecto/
```

### 3. Estructura Recomendada para Cada Proyecto

```
mi-proyecto/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── udemy/
│                   └── proyecto/
│                       ├── Main.java
│                       └── [otras clases].java
├── README.md
└── notas.md
```

### 4. Actualizar los Archivos del Proyecto

#### README.md
- Cambia el nombre del proyecto
- Describe qué hace el proyecto
- Lista los conceptos que se aprenden
- Incluye instrucciones para ejecutar

#### Main.java
- Actualiza el package name si es necesario
- Implementa la lógica de tu proyecto
- Agrega comentarios explicativos

#### notas.md
- Documenta los conceptos aprendidos
- Incluye código importante
- Anota problemas y soluciones

### 5. Convenciones de Nombres

- **Carpetas de proyectos**: usar kebab-case (`mi-proyecto-java`)
- **Nombres de clases**: usar PascalCase (`MiClaseJava`)
- **Variables**: usar camelCase (`miVariableJava`)
- **Packages**: usar lowercase (`com.udemy.proyecto`)

### 6. Compilar y Probar

Antes de hacer commit, asegúrate de que tu proyecto compile y ejecute correctamente:

```bash
cd projects/categoria/mi-proyecto/
javac src/main/java/com/udemy/proyecto/*.java
java -cp src/main/java com.udemy.proyecto.Main
```

## Ejemplos de Proyectos por Categoría

### fundamentos-java/
- Calculadora básica
- Conversor de temperaturas
- Juego de adivinanza de números
- Operaciones matemáticas

### oop-java/
- Sistema de gestión de empleados
- Jerarquía de formas geométricas
- Sistema bancario simple
- Catálogo de productos

### colecciones-java/
- Agenda de contactos
- Sistema de inventario
- Lista de tareas
- Análisis de datos

### excepciones-java/
- Validador de entrada de datos
- Calculadora con manejo de errores
- Lector de archivos seguro

### archivos-java/
- Lector/escritor de archivos de texto
- Procesador de CSV
- Sistema de logs

### jdbc-java/
- CRUD básico con base de datos
- Sistema de usuarios
- Reportes de base de datos

### web-java/
- Servlets básicos
- API REST simple
- Aplicación web con JSP

## Tips Adicionales

1. **Documentación**: Siempre incluye comentarios en tu código explicando la lógica compleja
2. **Consistencia**: Mantén un estilo de código consistente en todo el proyecto
3. **Testing**: Si aprendes sobre testing, incluye pruebas unitarias en una carpeta `test/`
4. **Dependencias**: Si usas librerías externas, documenta cómo obtenerlas
5. **Ejercicios**: Incluye variaciones o ejercicios adicionales en los comentarios