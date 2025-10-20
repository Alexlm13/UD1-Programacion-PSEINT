Algoritmo UD1_Bucles_10
	mostrar "Escriba un numero para comprobar si es primo o no"
	leer n
	
	si n<=1 Entonces
		mostrar n, " no es primo"
	SiNo
		esPrimo<-Verdadero
		
		para i<-2 hasta n-1 con paso 1 hacer
			si n%i=0 Entonces
				esPrimo<- Falso
			FinSi
		FinPara
		
		si esPrimo Entonces
			mostrar n, " es primo."
		SiNo
			mostrar n, " no es primo."
		FinSi
	FinSi
FinAlgoritmo
