# LlanquihueTourApp

## Evaluación Final Transversal – Semana 9
### Programación Orientada a Objetos I

Proyecto desarrollado para la **Evaluación Final Transversal (EFT) de la Semana 9** de la asignatura **Programación Orientada a Objetos I**.

El sistema **Llanquihue Tour** implementa una arquitectura modular en Java, aplicando los principios fundamentales de la Programación Orientada a Objetos, interfaces, herencia, polimorfismo, composición, colecciones dinámicas, persistencia mediante archivos TXT e interfaz gráfica desarrollada con Java Swing.

---

# Alumno

**Cristian Contreras**

## Carrera

Desarrollo de Aplicaciones

## Profesor

Eithel Klauss González Rojas

---

# Objetivos de la evaluación

- Desarrollar una aplicación modular utilizando Programación Orientada a Objetos.
- Aplicar encapsulamiento, herencia, composición y polimorfismo.
- Implementar interfaces y clases abstractas.
- Utilizar colecciones dinámicas (`ArrayList`).
- Gestionar información mediante archivos TXT.
- Implementar interfaces gráficas para el registro y consulta de información.
- Documentar el proyecto mediante JavaDoc y README.

---

# Estructura del proyecto

```text
LlanquihueTourApp
│
├── src
│   └── main
│       ├── java
│       │   └── cl
│       │       └── llanquihueTourApp
│       │           ├── model
│       │           ├── data
│       │           ├── ui
│       │           └── util
│       │
│       └── resources
│           ├── automoviles.txt
│           ├── capitanNave.txt
│           ├── conductores.txt
│           ├── embarcaciones.txt
│           ├── guias.txt
│           └── transporte.txt
│
├── pom.xml
└── README.md
```

---

# Organización del proyecto

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

Contiene los gestores encargados de la lectura, escritura y administración de la información.

Ejemplos:

- GestorEntidades
- GestorDatosGuia
- GestorDatosConductor
- GestorDatosCapitanNave
- GestorDatosAutomovil
- GestorDatosEmbarcacion

---

## ui

Contiene la interfaz gráfica y la clase principal del sistema.

Ejemplos:

- Main
- FrmFront
- FrmGuia
- FrmConductor
- FrmCapitanNave
- FrmAutomovil
- FrmEmbarcacion
- FrmMostrarEntidades

---

## util

Contiene clases de apoyo para validaciones y utilidades.

Ejemplos:

- Validator
- RoundedBorder

---

## resources

Contiene los archivos TXT utilizados para la persistencia de la información.

---

# Conceptos aplicados

- Programación Orientada a Objetos
- Encapsulamiento
- Herencia
- Composición
- Polimorfismo
- Interfaces
- Clases abstractas
- Sobrescritura de métodos (`@Override`)
- Colecciones dinámicas (`ArrayList`)
- Identificación de objetos mediante `instanceof`
- Persistencia mediante archivos TXT
- Interfaz gráfica (Java Swing)
- Validación de datos
- JavaDoc
- Manejo de excepciones

---

# Funcionalidades implementadas

- Registro de Guías.
- Registro de Conductores.
- Registro de Capitanes.
- Registro de Automóviles.
- Registro de Embarcaciones.
- Carga automática de responsables.
- Visualización de entidades registradas.
- Persistencia mediante archivos TXT.
- Gestión mediante clases Gestor.
- Validación de datos.
- Confirmación de salida de la aplicación.

---

# Ejecución

1. Abrir el proyecto en NetBeans.
2. Compilar el proyecto.
3. Ejecutar la clase **Main**.
4. Registrar las distintas entidades desde la interfaz gráfica.
5. Consultar la información registrada.
6. Verificar la persistencia mediante archivos TXT.

---

# Resultado

El sistema permite registrar y administrar distintas entidades turísticas mediante una arquitectura modular. La información se almacena utilizando archivos TXT administrados por gestores especializados, aplicando encapsulamiento, herencia, composición, polimorfismo, colecciones dinámicas e interfaces gráficas desarrolladas en Java Swing.

---

# Repositorio

Proyecto gestionado mediante **GitHub** como sistema de control de versiones.

---

# Autor

**Cristian Contreras**

**Programación Orientada a Objetos I – Evaluación Final Transversal – 2026**