Algoritmo UD1_Bucles_1
	random<-azar(100)
	i<-10
	mostrar "Escriba un número del 1 al 100 e intenta adivinar el número"
	Repetir
		leer num
		si num=random Entonces
			mostrar "Enhorabuena acertaste! nuestro número era ",random,", en: ",10-i," intento/s"
		SiNo
			si num<random Entonces
				mostrar "El número es mayor"
				i<-i-1
				mostrar "Te quedan: ",i," intento/s"
			SiNo
				mostrar "El número es menor"
				i<-i-1
				mostrar "Te quedan: ",i," intento/s"
			FinSi
		FinSi
	Hasta Que num==random o i=0
	si i=0 Entonces
		mostrar "Fallaste, te quedaste sin intentos"
	FinSi
FinAlgoritmo