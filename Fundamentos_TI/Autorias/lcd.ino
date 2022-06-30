#include <Wire.h>
#include <LiquidCrystal_I2C.h>
//Inicializa o display no endereco 0x27
LiquidCrystal_I2C lcd(0x27,16,2);
 
void setup()
{
 lcd.init();
}
 
void loop()
{
  lcd.setBacklight(HIGH);
  lcd.setCursor(0,0);
  lcd.print("vitin");
  lcd.setCursor(0,1);
  lcd.print("isadorothy");
  delay(1000);
  lcd.setBacklight(LOW);
  delay(1000);
}
