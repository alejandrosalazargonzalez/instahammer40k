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
```code
    git add .
    git commit -m "Inicio de la versión 1 del proyecto"
[version-1 574cf72] Inicio de la versión 1 del proyecto
 1 file changed, 21 insertions(+), 1 deletion(-)
```
## Confirmar que la rama fue creada y está en el repositorio remoto
```code
    git branch -r
  origin/HEAD -> origin/main
  origin/main
  origin/version-1
```
## Verifica que todos los cambios están subidos al remoto. Realiza la mezcla y sube los cambios a la rama princial
```code
    git checkout main 
Cambiado a rama 'main'
Tu rama está actualizada con 'origin/main'.
    git merge version-1 
Actualizando 1816d3a..e026bc3
Fast-forward
 ISSUE.md | 36 +++++++++++++++++++++++++++++++++++-
 1 file changed, 35 insertions(+), 1 deletion(-)
    git push origin main 
Enumerando objetos: 5, listo.
Contando objetos: 100% (5/5), listo.
Compresión delta usando hasta 4 hilos
Comprimiendo objetos: 100% (3/3), listo.
Escribiendo objetos: 100% (3/3), 641 bytes | 641.00 KiB/s, listo.
Total 3 (delta 1), reusados 0 (delta 0), pack-reusados 0
remote: Resolving deltas: 100% (1/1), completed with 1 local object.
To https://github.com/alejandrosalazargonzalez/aplicacion-resumen-warhammer40k.git
   1816d3a..e026bc3  main -> main
```