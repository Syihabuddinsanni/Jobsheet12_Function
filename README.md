# ==𝕁𝕠𝕓𝕤𝕙𝕖𝕖𝕥𝟙𝟚==
# 𝐹𝓊𝓃𝒸𝓉𝒾𝑜𝓃

# --==𝕄𝕖𝕥𝕙𝕠𝕕==--
![Alt text](https://github.com/Syihabuddinsanni/Jobsheet12_Function/blob/master/Method.png)
# A
_Adalah Method Type_
# B
_Method Name_
# C 
_Code yang akan ditampilkan_
# D
_Memanggil Fungsi_


# Latihan 1
![Alt text](https://github.com/Syihabuddinsanni/Jobsheet12_Function/blob/master/Latihan.png)


# Latihan 2
![Alt text](https://github.com/Syihabuddinsanni/Jobsheet12_Function/blob/master/L2.png)

# Latihan 3
![Alt text](https://github.com/Syihabuddinsanni/Jobsheet12_Function/blob/master/Latihan3.png)
![Alt text](https://github.com/Syihabuddinsanni/Jobsheet12_Function/blob/master/L3A_4.png)


# Latihan 3_v2
![Alt text](https://github.com/Syihabuddinsanni/Jobsheet12_Function/blob/master/L3A1.png)
![Alt text](https://github.com/Syihabuddinsanni/Jobsheet12_Function/blob/master/L3A2.png)
![Alt text](https://github.com/Syihabuddinsanni/Jobsheet12_Function/blob/master/L3A3.png)
![Alt text](https://github.com/Syihabuddinsanni/Jobsheet12_Function/blob/master/L3A.png)
# Semua Program diatas akan berakhir seperti ini :
![Alt text](https://github.com/Syihabuddinsanni/Jobsheet12_Function/blob/master/L3A_4.png)


# Latihan 4
![Alt text](https://github.com/Syihabuddinsanni/Jobsheet12_Function/blob/master/L4.png)


# Latihan 5
![Alt text](https://github.com/Syihabuddinsanni/Jobsheet12_Function/blob/master/L5.png)

# Calculator
![Alt text](https://github.com/Syihabuddinsanni/Jobsheet12_Function/blob/master/CalculatorKu.png)

from Tkinter import *
import Pmw
root = Tk()
root.option_readfile('optionDB2')
root.title('Scrolled Text')
Pmw.initialise()

st = Pmw.ScrolledText(root, borderframe=1, labelpos=N,
		label_text='Blackmail', usehullsize=1,
		hull_width=400, hull_height=300,
		text_padx=10, text_pady=10,
		text_wrap='none', text_foreground='#000fff000', text_background='black')
#text_foreground berguna untuk mengubah warna tampilan teks, kalau text_background berfungsi mengubah warna latar belakang teks

st.importfile('blackmail.txt')
st.pack(fill=BOTH, expand=1, padx=5, pady=5)

root.mainloop()



