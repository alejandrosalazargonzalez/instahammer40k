El propósito de esta tarea es que el alumno defina y describa el diagrama de casos de uso de su proyecto. Esta documentación debe incluirse en el archivo README.md del proyecto y servirá como base para el desarrollo futuro.

1. Crea una nuevo issus en el proyecto, y agregalo al proyecto.

2. Crear una Nueva Rama

Crea una nueva rama en tu repositorio de Git llamada version-v2 siguiendo estos pasos:
```code
git fetch
git pull origin main
git checkout -b version-v3
```
3. Definir Actores y Casos de Uso

* Identifica los actores y casos de Uso en la información que se encuentra actualmente dentro del README.md.
* Crea una carpeta llamada images.
* Utiliza el programa diagrmas.app para crear la imagen en formato png, con el nombre casos-uso-app.
* Realiza la especificación de los actores y casos de uso siguiendo el formato descrito en clase en el fichero README.md.

4. Realiza la subida de la rama
```code
git add .
git commit -m "Se realiza la definición y especificación de los casos de uso #3"
git push
git checkout main
git merge version-v3
git push
```

>[!IMPORTANT] 
>3es el número del issu donde se especifica lo que hay que realizar.

5. Realiza el informe en el issu espefificado de lo que has realizado indicando la salida de los comandos aplicacios, y las espeplicaciones que consideres necesarias.
