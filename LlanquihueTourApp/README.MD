# LlanquihueTourApp
## Actividad Sumativa 3 – Semana 8
### Programación Orientada a Objetos I

Proyecto desarrollado para la Actividad Sumativa 3 de la Semana 8 de la asignatura **Programación Orientada a Objetos I**.

En esta versión se amplía el sistema **Llanquihue Tour**, incorporando interfaces, polimorfismo, colecciones genéricas, validación de tipos mediante `instanceof` e interacción mediante una interfaz gráfica básica (GUI).

---

## Alumno

**Cristian Contreras**

## Carrera

Desarrollo de Aplicaciones

## Profesor

Eithel Klauss González Rojas

---

# Objetivos de la actividad

- Implementar una interfaz común para las entidades del sistema.
- Aplicar herencia y polimorfismo.
- Utilizar colecciones genéricas (`ArrayList`).
- Identificar objetos mediante `instanceof`.
- Desarrollar una interfaz gráfica para el ingreso y visualización de información.
- Mantener una estructura modular y organizada.

---

# Estructura del proyecto

```
LlanquihueTourApp
│
├── src
│   └── main
│       └── java
│           └── cl
│               └── llanquihueTourApp
│                   ├── model
│                   ├── data
│                   ├── ui
│                   └── util
│
├── pom.xml
└── README.md
```

---

# Paquetes

## model

Contiene las entidades principales del sistema.

Ejemplos:

- Persona
- Guia
- Conductor
- CapitanNave
- Transporte
- Automovil
- Embarcacion
- ServicioTuristico
- PaseoLacustre
- RutaGastronomica
- ExcursionCultural
- Registrable

---

## data

Contiene las clases encargadas de administrar las colecciones del sistema.

Ejemplo:

- GestorEntidades

---

## ui

Contiene la interfaz gráfica y la clase principal.

Ejemplos:

- Main
- FrmFront

---

## util

Contiene clases de apoyo.

Ejemplos:

- Validator

---

# Conceptos aplicados

- Programación Orientada a Objetos
- Interfaces
- Clases abstractas
- Herencia
- Polimorfismo
- Sobrescritura de métodos (@Override)
- Encapsulamiento
- Composición
- Colecciones ArrayList
- instanceof
- Interfaz gráfica (GUI)
- JavaDoc

---

# Funcionalidades implementadas

- Registro de distintas entidades del sistema.
- Interfaz común mediante `Registrable`.
- Uso de `mostrarResumen()`.
- Almacenamiento en `ArrayList<Registrable>`.
- Diferenciación de objetos mediante `instanceof`.
- Ingreso de datos desde una interfaz gráfica.
- Visualización de la información desde la GUI.

---

# Ejecución

1. Abrir el proyecto en NetBeans o IntelliJ IDEA.
2. Compilar el proyecto.
3. Ejecutar la clase **Main**.
4. Ingresar entidades desde la interfaz gráfica.
5. Visualizar la información generada por el sistema.

---

# Resultado

El sistema permite crear diferentes tipos de entidades, almacenarlas en una colección dinámica, identificarlas mediante `instanceof` y mostrar su información utilizando polimorfismo a través del método `mostrarResumen()`.

---

# Autor

**Cristian Contreras**

Programación Orientada a Objetos I – 2026