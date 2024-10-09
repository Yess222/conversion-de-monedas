# Conversor de Monedas

Esta es una aplicación de consola en Java que permite convertir entre diferentes monedas utilizando la API de ExchangeRate-API.

## Características

- Conversión entre Soles (PEN) y Dólares (USD)
- Conversión entre Pesos Argentinos (ARS) y Dólares (USD)
- Conversión entre Real Brasileño (BRL) y Dólares (USD)
- Guarda las conversiones realizadas en un archivo JSON

## Requisitos

- Java 11 o superior
- IntelliJ IDEA 2024.1.1
- API Key de [ExchangeRate-API](https://www.exchangerate-api.com/)

## Instalación

1. Clona el repositorio:
    ```sh
    git clone https://github.com/Yess222/conversion-de-monedas.git
    ```
2. Abre el proyecto en IntelliJ IDEA.
3. Configura la variable de entorno `api_key` con tu API Key de ExchangeRate-API.

## Uso

1. Ejecuta la clase `Main` desde tu IDE.
2. Sigue las instrucciones en la consola para seleccionar las monedas y la cantidad a convertir.
3. Las conversiones realizadas se guardarán en el archivo `conversiones.json`.

## Estructura del Proyecto

- `src/Main.java`: Punto de entrada de la aplicación.
- `src/Monedas.java`: Clase que representa una conversión de moneda.
- `src/ConsultarConversion.java`: Clase que consulta la tasa de conversión desde la API.
- `src/Conversor.java`: Clase que representa la tasa de conversión.
- `src/GenerarArchivo.java`: Clase que guarda las conversiones en un archivo JSON.

## Dependencias

- [Gson](https://github.com/google/gson): Para la serialización y deserialización de JSON.
