
class Pixel
{
  private int nx = 0;
  private int ny = 0;

  private int px = 0;
  private int py = 0;
  public Pixel(int prx, int pry, int nex, int ney)
  {
    nx = nex;
    ny = ney;
    px = prx;
    py = pry;
  }
  
  public void setVals(int x1,int y1, int x2,int y2)
  {
    nx = x2;
    ny = y2;
    px = x1;
    py = y1;
  }
  
  
  public int getnx()
  {
	return nx;
  }

  public int getpx()
  {
	return px;
  }
  public int getny()
  {
	return ny;
  }
  public int getpy()
  {
	return py;
  }

  public String toString()
  {
	return nx + " " + ny + " " + px + " " + py;  
  }
  
}
  
