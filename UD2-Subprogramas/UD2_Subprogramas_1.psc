SubProceso menu
	definir opc como entero
	Repetir
		mostrar " "
		Mostrar ">>>>>>>MEN�<<<<<<<"
		mostrar "1. Mostrar los n�meros del 1 al 10"
		mostrar "2. Mostrar la tabla de multiplicar del 8"
		mostrar "3. Mostrar las primeras diez potencias de 2"
		mostrar "4. Salir"
		mostrar " "
		mostrar "Elija una opci�n"
		leer opc
		Segun opc Hacer
			1:
				para i=1 hasta 10
					mostrar sin saltar i," "
				FinPara
			2:
				para i=1 hasta 10
					resultado<-i*8
					mostrar "8 * ",i," = ", resultado
				FinPara
			3:
				para i=1 hasta 10
					resultado=2^i
					mostrar "2^",i," = ",resultado
				FinPara
			4:
				mostrar "Saliendo..."
			De Otro Modo:
				mostrar "Opci�n no v�lida"
		Fin Segun
		
	Hasta Que opc=4
	
FinSubProceso

Algoritmo UD2_Subprogramas_1
	menu
FinAlgoritmo