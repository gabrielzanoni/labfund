; Biblioteca
& /0000

	CHTOUI_SINGLE_AC $ =1
	CHTOUI_SINGLE_30 K /30
CHTOUI_SINGLE $ =1
	MM CHTOUI_SINGLE_AC
	- CHTOUI_SINGLE_30
	JZ CHTOUI_SINGLE_INVALID

	
; Inválido, retorna FF
CHTOUI_SINGLE_INVALID LV /FF
	RS CHTOUI_SINGLE


	CHTOUI_1 $ =1
	CHTOUI_2 $ =1

	CHTOUI_TEMP_1 $ =1
	CHTOUI_TEMP_2 $ =1
	CHTOUI_TEMP_3 $ =1
	CHTOUI_TEMP_4 $ =1
CHTOUI 
	; Faz o unpack dos 4 bytes em variaveis separadas
	LV CHTOUI_TEMP_1
	MM UNPACK_1
	LV CHTOUI_TEMP_2
	MM UNPACK_2
	LD CHTOUI_1
	SC UNPACK
	LV CHTOUI_TEMP_3
	MM UNPACK_1
	LV CHTOUI_TEMP_4
	MM UNPACK_2
	LD CHTOUI_2
	SC UNPACK

# UNPACK4