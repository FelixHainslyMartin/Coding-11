/*desimal => binary
72 = 1001000
72:2=36 sisa 0 angka selanjutny
36:2=18 sisa 0
18:2=9 sisa 0
9:2=4 sisa 1
4:2=2 sisa 0
2:2= 1 => (angka depan) sisa 0
1000100 bin = 72 desimal 
1x64 0x32 0x16 1x8 0x4 0x2 0x1
64+8=72

desimal => oktal
35=43
35:8=4 sisa 3
371 desimal =563
371:8=46 sisa 3
46:8=5 sisa 6
desimal=>hexadesimal
10=a,11=b,12=c,13=d,14=e,15=f
1583 desimal = 6 2 F Hexadesimal
1583:16=98 sisa 15 (karena sisa 15 maka 15 diganti dengan f menurut aturan hexadesimal)
98:16=6 sisa 2
245 desimal= F 5 hex
245:16=15 sisa 5
254 desimal= F E hex
254:16=15 sisa 14 
123 hex = 291 desimal
1x16=16+2
18x16=288+3

bin => octal
(Cara penghitungannya per 3 angka dari awal sampai akhir) :
3 3 / 3 3 3 dst => 110011111 = 110 011 dan 111 : 
110011111 bin = 637 octal
110=6 1x4 1x2 0x1=4+2=6
011=3 0x4 1x2 1x1=2+1=3
111=7 1x4 1x2 1x1=7
octal => bin
375 octal = 011111101 bin
3=011
7=111
5=101
(Note : Kalau misal hanya terdapat 4 atau 5 angka yang dimana bukan kelipatan 3, cara hitungnya dengan mudah yaitu tambahain saja 0 didepannya misal 1011 => berarti 001 dan 011) => (Begitupun dengan bin => hexadesimal yang dimana kalau bukan kelipatan 4 tinggal ditambahin saja dengan angka 0 didepan angka binary nya)

bin => hexadesimal
(Cara penghitungannya per 4 angka dari awal sampai akhir) :
4 4 / 4 4 4 dst => 10010101 = 1001 dan 0101 :
10010101 bin = 95 hex
1001=9
0101=5
hexadesimal => bin
7f hex= 01111111 bin
7=0111
f(15)=1111

octal => Hexadesimal
35 octal to Hex = ?
011101 bin
0001 = 1
1101 = (8 x 1) + (4 x 1) + (0 x 2) + (1 x 1) = 8 + 4 + 0 + 1 = 13 = D

721 octal to Hex = ?
111010001
0001 = 1
1101 = 13 = D
0001 = 1
1D1

Hexadesimal => binary
AEF9 :
A = 1010
E = 1110
F = 1111
9 = 0101
*/