Algoritmo TrianguloPerimetro
	Escribir 'Dame los lados: '
	Leer l1,l2,l3
	Si l1>l2 Y l1>l3 Entonces
		esValido <- l1<l2+l3
	SiNo
		Si l2>l3 Entonces
			esValido <- l2<l1+l3
		SiNo
			esValido <- l3<l2+l1
		FinSi
	FinSi
	Si esValido Entonces
		Escribir "Per�metro: ",l1+l2+l3
	SiNo
		Escribir "El tri�ngulo no es v�lido"
	FinSi
FinAlgoritmo
