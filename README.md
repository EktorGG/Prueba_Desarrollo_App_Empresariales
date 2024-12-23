PruebaWeatherLatam

Descripción del Proyecto:

PruebaWeatherLatam es una aplicación Android que implementa la configuración de productFlavors para definir diferentes entornos de desarrollo. Cada flavor de la aplicación (dev, qa y prod) presenta un color de fondo distinto para diferenciar visualmente los entornos. Además, la app está configurada para integrar Firebase Crashlytics, lo que permite registrar logs de eventos para el seguimiento de errores en cada entorno.

Características Principales

Product Flavors:

dev: Entorno de desarrollo, con fondo blanco.

qa: Entorno de pruebas, con fondo naranjo.

prod: Entorno de producción, con fondo negro.

Firebase Crashlytics: Registra eventos y custom keys específicos del entorno.

Requisitos del Entorno

SDK:

Compile SDK: 35

Target SDK: 35

Min SDK: 34

Herramientas:

Android Studio

Gradle DSL: Groovy

Dependencias:

Firebase Crashlytics

AndroidX Core, AppCompat, Material

Instrucciones de Instalación y Uso

1. Instalación de la Aplicación

Descarga los APKs disponibles en la carpeta de distribución /release de cada entorno (app-dev-debug.apk, app-qa-debug.apk, app-prod-release.apk).

Instala el APK correspondiente al flavor deseado en tu dispositivo Android.

2. Uso de la Aplicación

Al iniciar, la aplicación muestra un color de fondo diferente según el flavor seleccionado.

Se envía un log de prueba a Firebase Crashlytics para verificar la integración.

Instrucciones para Compilar

1. Configurar el Entorno

Asegúrate de tener Android Studio actualizado.

Abre el proyecto en Android Studio.

2. Generar APKs

Ve a Build > Select Build Variant y selecciona el flavor deseado (dev, qa, prod).

Ve a Build > Generate Signed Bundle / APK.

Selecciona APK, elige la configuración de firma correspondiente y genera el APK.

3. Configurar el Keystore

Si deseas generar nuevos APKs firmados, configura la sección signingConfigs en el archivo build.gradle y proporciona el keystore correspondiente.

Archivos Principales

MainActivity.kt: Contiene la lógica para configurar el fondo y enviar eventos a Crashlytics.

activity_main.xml: Diseño principal de la aplicación.

build.gradle (Project): Configuración global del proyecto.

build.gradle (App): Configuración específica del módulo, incluyendo flavors y dependencias.

google-services.json: Archivo de configuración para Firebase.

**Las contraseñas de cada entorno están visibles en el archivo build.gradle (app)**

Nota: Los archivos .jks deben ubicarse en una carpeta accesible y configurarse en el archivo build.gradle según sea necesario.
