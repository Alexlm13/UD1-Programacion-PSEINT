SubProceso mostrarMenu
		mostrar ""
		mostrar ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> MENÚ <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"
		mostrar "1. Mostrar los números del 1 al número dado por usuario"
		mostrar "2. Mostrar la tabla de multiplicar que quiera el usuario"
		mostrar "3. Mostrar las primeras 10 potencias del número que quiera el usuario"
		mostrar "4. Salir"
		mostrar "======================================================================"
		mostrar "Elija una opción"
FinSubProceso

SubProceso sucesion(n)
	para i=1 hasta n Hacer
		mostrar sin saltar i
	FinPara
FinSubProceso

SubProceso tabla(n)
	para i<-1 hasta 10 Hacer
		resultado<-n*i
		mostrar n, " * ", i," = ", resultado
	FinPara
FinSubProceso

SubProceso potencia(n)
	para i=1 hasta 10 Hacer
		resultado<-n^i
		mostrar n,"^",i," = ", resultado
	FinPara
FinSubProceso

Algoritmo UD2_Subprogramas_1_b
	Repetir
		mostrarMenu
		leer opc
		Segun opc Hacer
			1:
				Mostrar "Hasta que número quiere llegar?"
				leer num
				sucesion(num)
			2:
				Mostrar "De qué número quiere la tabla de multiplicar?"
				leer num
				tabla(num)
			3:
				Mostrar "De qué número te gustaria saber las 10 primeras potencias?"
				leer num
				potencia(num)
			4:
				mostrar "Saliendo..."
			De Otro Modo:
				mostrar "Opción no válida, elija de nuevo"
		Fin Segun
	hasta que opc>=1 y opc<=4
FinAlgoritmo
