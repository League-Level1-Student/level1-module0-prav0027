import ddf.minim.*;
int angle = 0;
PImage pictureOfRecord;
Minim minim;
AudioPlayer song;
void setup(){
  size(600,600);
  pictureOfRecord = loadImage("Record.jpg");
  pictureOfRecord.resize(600,600);
  minim = new Minim(this);
  song = minim.loadFile("song.mp3", 512);
  
}
void draw(){
  mousePressed();

  }

void rotateImage(PImage image, int amountToRotate){
  translate(width/2, height/2);
  rotate(amountToRotate*TWO_PI/360);
  translate(-image.width/2, -image.height/2);
}
void mousePressed(){
rotateImage(pictureOfRecord, angle);
  image(pictureOfRecord, 0, 0); 
  angle+=180;
  song.play();
 }