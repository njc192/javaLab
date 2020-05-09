
private int baseX = 55;
private int stemWidth = 10;
private int stemHeight;
private int petalLength;
private int circleDim = 15;
private int h;
class Flower
{
	public Flower(int hi, int w,int petal)
	{
		stemHeight = hi - 100;
    h = hi;
		fill(0,255,0);
		petalLength = petal;
		rect(baseX,h,stemWidth,h);
	}

	void display()
	{
		stroke(0);
		fill(0,255,0);
		rect(baseX,stemHeight,stemWidth,stemHeight);
		fill(255,0,0);
		ellipseMode(CENTER);
		ellipse(baseX + (circleDim/PI),stemHeight,circleDim,circleDim);
		fill(0,255,0);
		//right petal
		arc(baseX + circleDim -2,stemHeight-1,petalLength,10,PI + HALF_PI,TWO_PI + HALF_PI);

		//NE petal
		arc(baseX + circleDim -4,stemHeight-6,petalLength -3,
				10,PI + QUARTER_PI,TWO_PI + QUARTER_PI);
		//N petal
	        
		arc(baseX + circleDim/PI,stemHeight-8,petalLength/2 + 2,16,PI ,TWO_PI );

    //NW petal
    arc(baseX - circleDim/PI +2,stemHeight -6,petalLength -3,
        10,HALF_PI + QUARTER_PI,PI + QUARTER_PI+ HALF_PI);
		//West Petal
		arc(baseX - circleDim/PI +2,stemHeight-1,petalLength,10,HALF_PI,PI + HALF_PI);

	


	}

	int getStemHeight()
	{
		return stemHeight;
	}

  void setStemHeight(int s)
  {
    stemHeight = h - s;
  }
  
  int getX()
  {
    return baseX;
  }
  
  void setX(int x)
  {
    baseX = x;
  }
  
  

	
}
//hel
