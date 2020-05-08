
private int baseX = 55;
private int stemWidth = 10;
private int stemHeight = 100;
class Flower
{
	public Flower(int h, int w)
	{
		fill(0,255,0);
		rect(baseX,h,stemWidth,h);
	}

	void display()
	{
		stroke(0);
		fill(0,255,0);
		rect(baseX,height - stemHeight,stemWidth,stemHeight);
		fill(255,0,0);
		ellipse(baseX,stemHeight,15,15);



	}

	int getStemHeight()
	{
		return stemHeight;
	}

	
}
    
