

#include <Servo.h> //Librería para los servomotores 



//Entradas/Salidas Digitales
int LED2=2; //PIN DE SALIDA LED
int LED3=3; //PIN DE SALIDA LED
int LED4=4; //PIN DE SALIDA LED
//ultrasonidos
const int Ultra1_RXPin = 5;
const int Ultra1_TXPin = 6;
const int Ultra2_RXPin = 7;
const int Ultra2_TXPin = 8;
const int Ultra3_RXPin = 11;
const int Ultra3_TXPin = 10;
char estado;// Variable lectura dato serial
Servo SerBarra;



void setup() {      //Configuracion de los pin como entrada o salida 
Serial.begin(9600);
SerBarra.attach(9); //puerto al que esta conectado el SerBarra
pinMode(LED2,OUTPUT);
pinMode(LED3,OUTPUT);
pinMode(LED4,OUTPUT);

pinMode(Ultra1_TXPin, OUTPUT);
pinMode(Ultra2_TXPin, OUTPUT);
pinMode(Ultra3_TXPin, OUTPUT);
pinMode(Ultra1_RXPin, INPUT);
pinMode(Ultra2_RXPin, INPUT);
pinMode(Ultra3_RXPin, INPUT);

// coloca todos los pines normalmente Apagado
digitalWrite(LED2, LOW); 
digitalWrite(LED3, LOW);
digitalWrite(LED4, LOW);
SerBarra.write(0);    

}

void loop ()  //Configuracion de los valores del LDR
{
//INICION CAPTURA DE DATOS DE ENTRADA DE JAVA HACIA ARDUINO
//recibe las escuchas que viene de la aplicación Java
 if(Serial.available() > 0){//Detecta si hay alguna entrada por serial
    // estado = Serial.read();
    estado = Serial.read();// interpreta la entrada por serial como un número entero.
    //Serial.println(estado); //imprime por consola, este solo sirve para informar que es lo que recibe

  //permite abrir la puerta 
  if(estado == '1'){
    for(int pos=0;pos<=90;pos+=2){//se crea un ciclo que permita variar la velocidad de 90° a 180° del servo motor
    SerBarra.write(pos);
    //Serial.println(pos);
    delay(30);
    }
  }
   //permite cerrar la puerta
   if(estado == '2'){
   for(int pos=89;pos>=0;pos-=2){//se crea un ciclo que permita variar la velocidad 180° a 90° del servo motor
   SerBarra.write(pos);
   //Serial.println(pos);
   delay(30);
   }
  }
}

//prende luz PARQUEADERO 1
if(estado == 'a'){
 digitalWrite(LED2,HIGH);  
}
//apaga luz PARQUEADERO 1
if(estado == 'b'){
digitalWrite(LED2,LOW);  
}
//prende luz PARQUEADERO 2
if(estado == 'c'){
 digitalWrite(LED3,HIGH);  
}
//apaga luz PARQUEADERO 2
if(estado == 'd'){
digitalWrite(LED3,LOW);  
}
//prende luz PARQUEADERO 3
if(estado == 'e'){
 digitalWrite(LED4,HIGH);  
 }
//apaga luz PARQUEADERO 3
if(estado == 'f'){
digitalWrite(LED4,LOW);  
}
//prende todas de los PARQUEADEROs
if(estado == 'g'){
digitalWrite(LED2,HIGH);
digitalWrite(LED3,HIGH);
digitalWrite(LED4,HIGH);  
 }
//apaga todas las de los PARQUEADEROs
if(estado == 'f'){
digitalWrite(LED2,LOW);  
digitalWrite(LED3,LOW);    
digitalWrite(LED4,LOW);  
}

//FIN CAPTURA DE DATO JAVA-ARDUINO

 //INICIO DATOS DE SALIDA DE ARDUINO HACIA JAVA 
  int cm1 = pingUltrasonido1(Ultra1_TXPin, Ultra1_RXPin);
  // Serial.print("Distancia: ");
   Serial.println(cm1);//dato que se le envia a Java
   delay(100);

   int cm2 = pingUltrasonido2(Ultra2_TXPin, Ultra2_RXPin);
  // Serial.print("Distancia: ");
   Serial.println(cm2);//dato que se le envia a Java
   delay(100);

   int cm3 = pingUltrasonido3(Ultra3_TXPin, Ultra3_RXPin);
  // Serial.print("Distancia: ");
   Serial.println(cm3);//dato que se le envia a Java
   delay(100);
  
  if(cm1<10){
  digitalWrite(LED2, HIGH);
  }

  
  else if(cm1>11){
  digitalWrite(LED2, LOW);
  } 
  
  if(cm2<10){
  digitalWrite(LED3, HIGH);
  }
  
  else if(cm2>11){
  digitalWrite(LED3, LOW);
  } 
  
  if(cm3<10){
  digitalWrite(LED4, HIGH);
  }
  
  else if(cm3>11){
  digitalWrite(LED4, LOW);
  }
}

int pingUltrasonido1(int TXPin, int RXPin) {
   long duration, distanceCm;
   
   digitalWrite(Ultra1_TXPin, LOW);  //para generar un pulso limpio ponemos a LOW 4us
   delayMicroseconds(4);
   digitalWrite(Ultra1_TXPin, HIGH);  //generamos Transmisíon (disparo) de 10us
   delayMicroseconds(10);
   digitalWrite(Ultra1_TXPin, LOW);
   duration = pulseIn(Ultra1_RXPin, HIGH);  //medimos el tiempo entre pulsos, en microsegundos
   distanceCm = duration * 10 / 292/ 2;   //convertimos a distancia, en cm
   return distanceCm;
}

int pingUltrasonido2(int TXPin, int RXPin) {
   long duration, distanceCm;
   
   digitalWrite(Ultra2_TXPin, LOW);  //para generar un pulso limpio ponemos a LOW 4us
   delayMicroseconds(4);
   digitalWrite(Ultra2_TXPin, HIGH);  //generamos Transmisíon (disparo) de 10us
   delayMicroseconds(10);
   digitalWrite(Ultra2_TXPin, LOW);
   duration = pulseIn(Ultra2_RXPin, HIGH);  //medimos el tiempo entre pulsos, en microsegundos
   distanceCm = duration * 10 / 292/ 2;   //convertimos a distancia, en cm
   return distanceCm;
}

int pingUltrasonido3(int TXPin, int RXPin) {
   long duration, distanceCm;
   
   digitalWrite(Ultra3_TXPin, LOW);  //para generar un pulso limpio ponemos a LOW 4us
   delayMicroseconds(4);
   digitalWrite(Ultra3_TXPin, HIGH);  //generamos Transmisíon (disparo) de 10us
   delayMicroseconds(10);
   digitalWrite(Ultra3_TXPin, LOW);
   duration = pulseIn(Ultra3_RXPin, HIGH);  //medimos el tiempo entre pulsos, en microsegundos
   distanceCm = duration * 10 / 292/ 2;   //convertimos a distancia, en cm
   return distanceCm;
}
