package JavaPatterns;

public class Three_Digits_Mul {
	
	static int maxProduct(int []a, int n)
	{
	      
	    // if size is less than
	    // 3, no triplet exists
	    if (n < 3)
	        return -1;
	  
	    // will contain max product
	    int max_product = Integer.MIN_VALUE;
	  
	    for (int i = 0; i < n - 2; i++)
	        for (int j = i + 1; j < n - 1; j++)
	            for (int k = j + 1; k < n; k++)
	                max_product = Math.max(max_product,
	                          a[i] * a[j] * a[k]);
	  
	    return max_product;
	}
	  
	    // Driver Code
	    public static void main (String [] args)
	    {
	        int []a = { 10,10,89,90,0,100,100};
	        int n = a.length;;
	  
	        int max = maxProduct(a, n);
	  
	        if (max == -1)
	            System.out.println("No Triplet Exists");
	        else
	            System.out.println("Maximum product is " + max);
	    }
	}

