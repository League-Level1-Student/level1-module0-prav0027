int score = 0;
int ellipse_y=0;
int randomNumber = (int) random(width);
int x = mouseX;
int y = mouseY;
void setup(){
  size(600,600);
  background(144,130,165);
}

void draw(){
  background(144,130,165);
  rect(mouseX, 500, 100, 100);
  fill(104,222,245);
  stroke(104,222,245);
  ellipse(300,ellipse_y,10,30);
  ellipse_y=ellipse_y+10;
  if(ellipse_y>600){
   ellipse_y = 0; 
  }
}

void checkCatch(int x){
 if(x>mouseX && x< mouseX +100){
 score++;
 }
 else if(score>0){
   score--;
 }
 println("Your score is now: "+score);
  fill(0,0,0);
  textSize(16);
  text("Score: "+score, 20,20);
}