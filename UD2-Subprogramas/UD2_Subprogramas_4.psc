Funcion convertirMoneda(cantidad,moneda)
	Segun Minusculas(moneda) hacer
		"dolares":
			euros<-cantidad*0.86
		"libras":
			euros<-cantidad*1.15
		"yenes":
			euros<-cantidad*0.0057
		De Otro Modo:
			Mostrar "Moneda no válida"
			euros<-0
	FinSegun
	
	mostrar euros
FinFuncion

Algoritmo UD2_Subprogramas_4
	mostrar "Introduzca una cantidad a intercambiar"
	leer cantidad
	
	mostrar "Introduzca la moneda que quiera transferir a euros (dolares, libras o yenes)"
	leer moneda
	
	convertirMoneda(cantidad, moneda)
	
FinAlgoritmo
