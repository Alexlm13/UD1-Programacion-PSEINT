SubProceso mostrarMenu
		mostrar ""
		mostrar ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> MEN� <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"
		mostrar "1. Mostrar los n�meros del 1 al n�mero dado por usuario"
		mostrar "2. Mostrar la tabla de multiplicar que quiera el usuario"
		mostrar "3. Mostrar las primeras 10 potencias del n�mero que quiera el usuario"
		mostrar "4. Salir"
		mostrar "======================================================================"
		mostrar "Elija una opci�n"
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
				Mostrar "Hasta que n�mero quiere llegar?"
				leer num
				sucesion(num)
			2:
				Mostrar "De qu� n�mero quiere la tabla de multiplicar?"
				leer num
				tabla(num)
			3:
				Mostrar "De qu� n�mero te gustaria saber las 10 primeras potencias?"
				leer num
				potencia(num)
			4:
				mostrar "Saliendo..."
			De Otro Modo:
				mostrar "Opci�n no v�lida, elija de nuevo"
		Fin Segun
	hasta que opc>=1 y opc<=4
FinAlgoritmo
