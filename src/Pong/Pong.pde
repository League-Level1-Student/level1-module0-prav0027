import ddf.minim.*;
Minim minim;
AudioSample sound;
PImage backgroundImage;
int x_pos = 0;
int y_pos = 0;
int speed = 5;
void setup(){
  size(800,800);
  backgroundImage = loadImage ("floor.jpg");
  minim=new Minim(this);
  sound = minim.loadSample("pong.aiff", 128);
}
void draw(){
  image(backgroundImage, 0, 0);
  image(backgroundImage, 0, 0, width, height);
  fill(214,166,69);
  noStroke();
  rect(mouseX,775,100,25);
  fill(255,0,0);
  stroke(0,255,0);
  ellipse(x_pos,y_pos,100,100);
  x_pos = x_pos+speed;
  y_pos = y_pos+speed;
  if(x_pos>width){
speed = -speed;
    }
  if(x_pos<0){
  speed = -speed;
  }
  if(y_pos==height){
    sound.trigger();
  }
}