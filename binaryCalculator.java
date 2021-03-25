import java.util.Scanner;

public class binaryCalculator {
	static String x;
	static String y;
	
	static String onesc1;
	
	// flips the bits
    public static char flipBits(char c) 
    {
        return (c == '0') ? '1' : '0';
    }

	public static String twosCompliment(String binary) 
	{
        String twosc = "";
        String onesc = "";

        for (int i = 0 ; i < binary.length(); i++) 
        {
            onesc += flipBits(binary.charAt(i));
            //System.out.println(onesc);
        }
        
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(onesc);
 
        // reverse StringBuilder input1
        input1 = input1.reverse();
 
  
  
        
        //int number0 = Integer.parseInt(input1, 2);
        StringBuilder builder = new StringBuilder(input1);
        boolean b = false;
        for (int i = input1.length()-1 ; i > 0; i--) 
        {
            if (input1.charAt(i) == '1') 
            {
                builder.setCharAt(i, '0');
            } else 
            {
                builder.setCharAt(i, '1');
                b = true;
                break;
            }
            
        }
        if (!b)
            builder.append("1", 0, 7);

        twosc = builder.toString();
        System.out.println("Ones Compliment: " + input1);
        System.out.println("Twos Compliment: " + twosc);
        return twosc;
        
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binary = "" ;
		String oneSub = "01";
		Scanner in2 = new Scanner(System.in );
		System.out.println("decimal to binary (1) or binary to decimal (2)?");
		String input2 = in2.nextLine();
		if (input2.equals("1"))
		{
		{
			Scanner in = new Scanner(System.in );
			System.out.println("Enter a base 10 number");
			String input = in.nextLine();
			int num = Integer.parseInt(input);
			StringBuilder convr = new StringBuilder();
			System.out.println(convr);
			while(num>0) 
			{
				int r = num % 2;
				num /= 2;
				convr.append(Integer.toString(r));
			}
			x = convr.reverse().toString();
			y = convr.reverse().toString();
			System.out.println("Binary: " + x);

			twosCompliment(y);
		}
		}
		else if (input2.equals("2"))
		{
			Scanner in3 = new Scanner(System.in );
			System.out.println("Enter the twos compliment");
			String input3 = in3.nextLine();
			//String stringSum = Integer.toString();
			//System.out.println(input3);
			for (int i = 0; i < input3.length(); i++) 
	        {
				binary += flipBits(input3.charAt(i));
				//System.out.println(binary);
	        }
			int bin = Integer.parseInt(oneSub, 2);
			int binary2 = Integer.parseInt(binary, 2);
			int binaryFin = binary2 + bin;
			String binaryFin2 = Integer.toBinaryString(binaryFin);
			int sumFinal = Integer.parseInt(binaryFin2, 2);
			System.out.println("Base 10: " + sumFinal);
			
		}
		else
		{
			System.out.println("Invalid input");
		}
		
		

			
	}
		
		

	}



