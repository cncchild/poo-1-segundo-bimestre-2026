# LlanquihueTour1

## Descripción

LlanquihueTour1 es una aplicación desarrollada en Java utilizando Programación Orientada a Objetos (POO) para la gestión de tours turísticos.

El sistema permite administrar clientes, guías, conductores, transportes, tours y reservas mediante la lectura de información almacenada en archivos de texto.

## Estructura de Carpetas

```text
LlanquihueTour1
│
├── src
│   ├── model
│   │   ├── Persona.java
│   │   ├── Cliente.java
│   │   ├── Guia.java
│   │   ├── Conductor.java
│   │   ├── Transporte.java
│   │   ├── Tour.java
│   │   ├── Reserva.java
│   │   ├── Direccion.java
│   │   └── Rut.java
│   │
│   ├── data
│   │   ├── GestorDatosCliente.java
│   │   ├── GestorDatosGuia.java
│   │   ├── GestorDatosConductor.java
│   │   ├── GestorDatosTransporte.java
│   │   ├── GestorDatosTour.java
│   │   └── GestorDatosReserva.java
│   │
│   └── ui
│       └── Main.java
│
└── Resources
    ├── clientes.txt
    ├── guias.txt
    ├── conductores.txt
    ├── transportes.txt
    ├── tours.txt
    └── reservas.txt
```

## Instrucciones de Ejecución

1. Abrir el proyecto en NetBeans.
2. Verificar que la carpeta `Resources` contenga los archivos de datos.
3. Compilar el proyecto.
4. Ejecutar la clase:

```text
ui.Main
```

5. El sistema cargará la información desde los archivos TXT y mostrará los datos por consola.

## Autor

Cristian Contreras

