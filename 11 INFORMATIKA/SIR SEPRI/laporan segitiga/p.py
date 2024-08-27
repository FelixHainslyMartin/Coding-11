user_input_1 = int(input("Masukkan sisi pertama : "))
user_input_2 = int(input("Masukkan sisi kedua : "))
user_input_3 = int(input("Masukkan sisi ketiga : "))

if((user_input_1**2 + user_input_2**2 == user_input_3**2)):
    print("Segitiga siku-siku")
elif((user_input_1 == user_input_2) and (user_input_2 == user_input_3) and (user_input_3 == user_input_1)):
    print("Segitiga sama sisi")
elif(user_input_1 == user_input_3 and user_input_1 != user_input_2 and user_input_3!=user_input_2):
    print("Segitiga sama kaki")
else:
    print("Segitiga sembarang")