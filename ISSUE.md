# Issue 1 crear rama para la version 1
## Actualizar repositorio local
```code
    git checkout main 
Ya en 'main'
Tu rama está actualizada con 'origin/main'.
    git pull origin main
Desde https://github.com/alejandrosalazargonzalez/aplicacion-resumen-warhammer40k
 * branch            main       -> FETCH_HEAD
Ya está actualizado.
```
## Crear la nueva rama para la version 1
```code
    git checkout -b version-1
Cambiado a nueva rama 'version-1'  
    git branch 
  main
* version-1
```
## Subir la nueva rama al remoto
```code
    git push -u origin version-1
Total 0 (delta 0), reusados 0 (delta 0), pack-reusados 0
remote: 
remote: Create a pull request for 'version-1' on GitHub by visiting:
remote:      https://github.com/alejandrosalazargonzalez/aplicacion-resumen-warhammer40k/pull/new/version-1
remote: 
To https://github.com/alejandrosalazargonzalez/aplicacion-resumen-warhammer40k.git
 * [new branch]      version-1 -> version-1
Rama 'version-1' configurada para hacer seguimiento a la rama remota 'version-1' de 'origin'.
```
## Agregar cambios y hacer commit
