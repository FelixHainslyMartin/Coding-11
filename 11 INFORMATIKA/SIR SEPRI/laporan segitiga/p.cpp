#include<iostream>
using namespace std;
int main(){
    int sisi1,sisi2,sisi3;

    cin>>sisi1;
    cin>>sisi2;
    cin>>sisi3;

    if(sisi1 == sisi3 && sisi1 != sisi2 && sisi3 != sisi2){
        cout<<"Segitiga Sama kaki";
    }
    else if (sisi1 == sisi2 && sisi2 == sisi3 && sisi3 == sisi1){
    cout<<"Segitiga sama sisi";
    }

    else if (sisi1*sisi1 + sisi2*sisi2 == sisi3*sisi3){
    cout<<"Segitiga siku siku";
    }
    
    else{
        cout<<"Segitiga Sembarang";
    }
    return 0;
}

// Pengujian :
// Pada pengujian kali ini, ketika kita memasukkan angka 3,3,3 akan menghasilkan hasil berupa segitga sama sisi
// Pada pengujian kali ini, ketika kita memasukkan angka 3,2,3 akan menghasilkan hasil berupa segitga sama kaki
// Pada pengujian kali ini, ketika kita memasukkan angka 3,4,5 akan menghasilkan hasil berupa segitga siku siku
// Pada pengujian kali ini, ketika kita memasukkan angka 2,3,5 akan menghasilkan hasil berupa segitga sembarang
