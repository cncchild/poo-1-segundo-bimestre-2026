# 🚐 Llanquihue Tour App

## 📌 Nombre del proyecto
Llanquihue Tour App

---

## 📖 Descripción del sistema

Llanquihue Tour App es una aplicación desarrollada en Java que simula la gestión de una agencia de turismo ubicada en la Región de Los Lagos.

El sistema permite cargar información desde archivos externos (.txt), transformarlos en objetos y gestionarlos mediante estructuras dinámicas como ArrayList.

La aplicación muestra información de guías turísticos, clientes, transportes, tours y reservas, además de aplicar filtros como tours en oferta y guías destacados.

El objetivo del proyecto es practicar programación orientada a objetos, modularidad, lectura de archivos y uso de colecciones en Java.

---

## 📦 Paquetes utilizados y clases implementadas

### 📁 model
Contiene las entidades del sistema:
- Cliente
- Guia
- Tour
- Transporte
- Reserva

---

### 📁 data
Encargado de la lectura de archivos y carga de datos:
- GestorDatosCliente
- GestorDatosGuia
- GestorDatosTour
- GestorDatosTransporte
- GestorDatosReserva

---

### 📁 ui
Contiene la clase principal de ejecución:
- Main

---

### 📁 util
Clases auxiliares del sistema:
- Constants (rutas de archivos)

---

## ▶️ Instrucciones para ejecutar el programa

1. Abrir el proyecto en NetBeans o IntelliJ IDEA.
2. Asegurarse de que los archivos `.txt` estén en la ruta correcta definida en `Constants`.
3. Ejecutar la clase principal:

