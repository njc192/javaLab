
int tailSize = 100;
private int initCounter = 0;

//this is java file

//send back to java file

float r  = random(255);
float g = random(255);
float b = random(255);

int next = 0;
int queue = 0;
Pixel [] pixels = new Pixel[tailSize];

private static int BACKGROUNDCOLOR = 0;


void setup()
{
size(700,700);

background(BACKGROUNDCOLOR);

fill(255,0,0);
}
void draw()
{
  next = next % tailSize;
  queue %= tailSize;

  color c = color(r,g,b);
  if(!(mouseX <= 0 || mouseY <= 0 || mouseX > width || mouseY > height))
  {
      if(initCounter < tailSize)
      {
        stroke(c);
	      strokeWeight(3);
        pixels[initCounter] = new Pixel(pmouseX,pmouseY,mouseX,mouseY);
        Pixel p = pixels[initCounter++];
        //set(pixels[initCounter].getX(),pixels[initCounter].getY(), color(255,0,0));
        line(p.getpx(),p.getpy(),p.getnx(),p.getny());
    
        println(p.toString());
      }
      else
      {

        if(random(100) <=1)
	{
		r = random(255);
		g = random(255);
		b = random(255);
	}
        Pixel q = pixels[queue++];
        stroke(0);
        strokeWeight(4);
        line(q.getpx(),q.getpy(),q.getnx(),q.getny());
    
        Pixel n = pixels[next++];
        n.setVals(pmouseX,pmouseY,mouseX,mouseY);
        stroke(c);
        strokeWeight(3);
        line(n.getpx(),n.getpy(),n.getnx(),n.getny());
      }   
      
      r += random(100) <=1 ? random(99) : random(3);
      g += random(100) <=1 ? random(99) : random(3);
      b += random(100) <=1 ? random(99) : random(3);
  }
}


//Hello
