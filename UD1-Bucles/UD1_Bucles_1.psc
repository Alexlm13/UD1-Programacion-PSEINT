Algoritmo UD1_Bucles_1
	random<-azar(100)
	i<-10
	mostrar "Escriba un n�mero del 1 al 100 e intenta adivinar el n�mero"
	Repetir
		leer num
		si num=random Entonces
			mostrar "Enhorabuena acertaste! nuestro n�mero era ",random,", en: ",10-i," intento/s"
		SiNo
			si num<random Entonces
				mostrar "El n�mero es mayor"
				i<-i-1
				mostrar "Te quedan: ",i," intento/s"
			SiNo
				mostrar "El n�mero es menor"
				i<-i-1
				mostrar "Te quedan: ",i," intento/s"
			FinSi
		FinSi
	Hasta Que num==random o i=0
	si i=0 Entonces
		mostrar "Fallaste, te quedaste sin intentos"
	FinSi
FinAlgoritmo