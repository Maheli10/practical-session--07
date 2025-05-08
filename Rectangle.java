class Rectangle{
	
	private int height;
	int width;]
	
	Rectangle(){
		height=width=2;
	}
	
	Rectangle (int height,int width){
		this.height=height;
		this.width=width;
		System.out.println("Just created a recangle object with (h*w) "+height+"*"+width);
		print(width,height);
	}
	
	void get_detail(){
				System.out.println("Height and width is "+height+" , "+width);

	}
	
	void print(int width,int height){
		for(int i=0; i<height; i++){    //for rows
			
			for(int j=0; j<width; j++){    //for columns
				System.out.print("* ");
			}
			System.out.println();    //line break
		}
	}
}

class Main{
	public static void main(String [] args){
		/*
		for (int i=0; i<10; i++){
			System.out.println("Value of i is "+i);
		}
		*/
		
		Rectangle r1=new Rectangle(5,3);
		Rectangle r2=new Rectangle(3,6);
		Rectangle r3=r1;
		
		/*System.out.println("Height and width is "+r1.height+" , "+r1.width);
		System.out.println("Height and width is "+r2.height+" , "+r2.width);
		System.out.println("Height and width is "+r3.height+" , "+r3.width);
		*/
		
		
		
	}
	
}

