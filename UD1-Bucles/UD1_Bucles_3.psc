Algoritmo UD1_Bucle_3
	mayorque<-0
	menorque<-0
	igualque<-0
	cont<-0
	
	mostrar "Indique la cantidad de n�meros que quieres a�adir"
	leer cant
	
	Mientras cont<cant Hacer
		mostrar "Introduzca un n�mero:"
		leer num
		
		si num>0 entonces
			mayorque<-mayorque+1
		SiNo
			si num<0 Entonces
				menorque<-menorque+1
			SiNo
				igualque<-igualque+1
			FinSi
		FinSi
		
		cont<-cont+1
	FinMientras
	
	mostrar "N�meros mayores que 0: ", mayorque
	mostrar "N�meros menores que 0: ", menorque
	mostrar "N�meros iguales que 0: ", igualque
FinAlgoritmo
