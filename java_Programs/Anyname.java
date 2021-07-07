import java.util.*;
// Java implementation to print the
// pattern of alphabets A to Z using *
class Anyname
{
	
// Below height and width variable can be used
// to create a user-defined sized alphabet's pattern

// Number of lines for the alphabet's pattern
static int height = 5;

// Number of character width in each line
static int width = (2 * height) - 1;

// Function to find the absolute value
// of a number D
static int abs(int d)
{
	return d < 0 ? -1 * d : d;
}

// Function to print the pattern of 'A'
static void printA()
{
	int n = width / 2, i, j;
	for (i = 0; i < height; i++)
	{
		for (j = 0; j <= width; j++)
		{
			if (j == n || j == (width - n)
				|| (i == height / 2 && j > n
					&& j < (width - n)))
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
		n--;
	}
}

// Function to print the pattern of 'B'
static void printB()
{
	int i, j, half = (height / 2);
	for (i = 0; i < height; i++)
	{
		System.out.printf("*");
		for (j = 0; j < width; j++)
		{
			if ((i == 0 || i == height - 1 || i == half)
				&& j < (width - 2))
				System.out.printf("*");
			else if (j == (width - 2)
					&& !(i == 0 || i == height - 1
						|| i == half))
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'C'
static void printC()
{
	int i, j;
	for (i = 0; i < height; i++)
	{
		System.out.printf("*");
		for (j = 0; j < (height - 1); j++)
		{
			if (i == 0 || i == height - 1)
				System.out.printf("*");
			else
				continue;
		}
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'D'
static void printD()
{
	int i, j;
	for (i = 0; i < height; i++)
	{
		System.out.printf("*");
		for (j = 0; j < height; j++)
		{
			if ((i == 0 || i == height - 1)
				&& j < height - 1)
				System.out.printf("*");
			else if (j == height - 1 && i != 0
					&& i != height - 1)
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'E'
static void printE()
{
	int i, j;
	for (i = 0; i < height; i++)
	{
		System.out.printf("*");
		for (j = 0; j < height; j++)
		{
			if ((i == 0 || i == height - 1)
				|| (i == height / 2
					&& j <= height / 2))
				System.out.printf("*");
			else
				continue;
		}
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'F'
static void printF()
{
	int i, j;
	for (i = 0; i < height; i++)
	{
		System.out.printf("*");
		for (j = 0; j < height; j++)
		{
			if ((i == 0) || (i == height / 2
						&& j <= height / 2))
				System.out.printf("*");
			else
				continue;
		}
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'G'
static void printG()
{
	int i, j;
	width--;
	for (i = 0; i < height; i++)
	{
		for (j = 0; j < width; j++)
		{
			if ((i == 0 || i == height - 1)
				&& (j == 0 || j == width - 1))
				System.out.printf(" ");
			else if (j == 0)
				System.out.printf("*");
			else if (i == 0 && j <= height)
				System.out.printf("*");
			else if (i == height / 2
					&& j > height / 2)
				System.out.printf("*");
			else if (i > height / 2
					&& j == width - 1)
				System.out.printf("*");
			else if (i == height - 1
					&& j < width)
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'H'
static void printH()
{
	int i, j;
	for (i = 0; i < height; i++)
	{
		System.out.printf("*");
		for (j = 0; j < height; j++)
		{
			if ((j == height - 1)
				|| (i == height / 2))
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'I'
static void printI()
{
	int i, j;
	for (i = 0; i < height; i++)
	{
		for (j = 0; j < height; j++)
		{
			if (i == 0 || i == height - 1)
				System.out.printf("*");
			else if (j == height / 2)
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'J'
static void printJ()
{
	int i, j;
	for (i = 0; i < height; i++)
	{
		for (j = 0; j < height; j++)
		{
			if (i == height - 1 && (j > 0
				&& j < height - 1))
				System.out.printf("*");
			else if ((j == height - 1
					&& i != height - 1)
					|| (i > (height / 2) - 1
					&& j == 0 && i != height - 1))
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'K'
static void printK()
{
	int i, j, half = height / 2, dummy = half;
	for (i = 0; i < height; i++)
	{
		System.out.printf("*");
		for (j = 0; j <= half; j++)
		{
			if (j == abs(dummy))
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
		dummy--;
	}
}

// Function to print the pattern of 'L'
static void printL()
{
	int i, j;
	for (i = 0; i < height; i++)
	{
		System.out.printf("*");
		for (j = 0; j <= height; j++)
		{
			if (i == height - 1)
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'M'
static void printM()
{
	int i, j, counter = 0;
	for (i = 0; i < height; i++)
	{
		System.out.printf("*");
		for (j = 0; j <= height; j++)
		{
			if (j == height)
				System.out.printf("*");
			else if (j == counter
					|| j == height - counter - 1)
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		if (counter == height / 2)
		{
			counter = -99999;
		}
		else
			counter++;
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'N'
static void printN()
{
	int i, j, counter = 0;
	for (i = 0; i < height; i++)
	{
		System.out.printf("*");
		for (j = 0; j <= height; j++)
		{
			if (j == height)
				System.out.printf("*");
			else if (j == counter)
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		counter++;
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'O'
static void printO()
{
	int i, j, space = (height / 3);
	int width = height / 2 + height / 5 + space + space;
	for (i = 0; i < height; i++)
	{
		for (j = 0; j <= width; j++)
		{
			if (j == width - abs(space)
				|| j == abs(space))
				System.out.printf("*");
			else if ((i == 0
					|| i == height - 1)
					&& j > abs(space)
					&& j < width - abs(space))
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		if (space != 0
			&& i < height / 2)
		{
			space--;
		}
		else if (i >= (height / 2 + height / 5))
			space--;
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'P'
static void printP()
{
	int i, j;
	for (i = 0; i < height; i++)
	{
		System.out.printf("*");
		for (j = 0; j < height; j++)
		{
			if ((i == 0 || i == height / 2)
				&& j < height - 1)
				System.out.printf("*");
			else if (i < height / 2
					&& j == height - 1 && i != 0)
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'Q'
static void printQ()
{
	printO();
	int i, j, d = height;
	for (i = 0; i < height / 2; i++)
	{
		for (j = 0; j <= d; j++)
		{
			if (j == d)
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
		d++;
	}
}

// Function to print the pattern of 'R'
static void printR()
{
	int i, j, half = (height / 2);
	for (i = 0; i < height; i++)
	{
		System.out.printf("*");
		for (j = 0; j < width; j++)
		{
			if ((i == 0 || i == half)
				&& j < (width - 2))
				System.out.printf("*");
			else if (j == (width - 2)
					&& !(i == 0 || i == half))
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'S'
static void printS()
{
	int i, j;
	for (i = 0; i < height; i++)
	{
		for (j = 0; j < height; j++)
		{
			if ((i == 0 || i == height / 2
				|| i == height - 1))
				System.out.printf("*");
			else if (i < height / 2
					&& j == 0)
				System.out.printf("*");
			else if (i > height / 2
					&& j == height - 1)
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'T'
static void printT()
{
	int i, j;
	for (i = 0; i < height; i++)
	{
		for (j = 0; j < height; j++)
		{
			if (i == 0)
				System.out.printf("*");
			else if (j == height / 2)
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'U'
static void printU()
{
	int i, j;
	for (i = 0; i < height; i++)
	{
		if (i != 0 && i != height - 1)
			System.out.printf("*");
		else
			System.out.printf(" ");
		for (j = 0; j < height; j++)
		{
			if (((i == height - 1)
				&& j >= 0
				&& j < height - 1))
				System.out.printf("*");
			else if (j == height - 1 && i != 0
					&& i != height - 1)
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'V'
static void printV()
{
	int i, j, counter = 0;
	for (i = 0; i < height; i++)
	{
		for (j = 0; j <= width; j++)
		{
			if (j == counter
				|| j == width - counter - 1)
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		counter++;
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'W'
static void printW()
{
	int i, j, counter = height / 2;
	for (i = 0; i < height; i++)
	{
		System.out.printf("*");
		for (j = 0; j <= height; j++)
		{
			if (j == height)
				System.out.printf("*");
			else if ((i >= height / 2)
					&& (j == counter
					|| j == height - counter - 1))
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		if (i >= height / 2)
		{
			counter++;
		}
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'X'
static void printX()
{
	int i, j, counter = 0;
	for (i = 0; i <= height; i++)
	{
		for (j = 0; j <= height; j++)
		{
			if (j == counter
				|| j == height - counter)
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		counter++;
		System.out.printf("\n");
	}
}

// Function to print the pattern of 'Y'
static void printY()
{
	int i, j, counter = 0;
	for (i = 0; i < height; i++)
	{
		for (j = 0; j <= height; j++)
		{
			if (j == counter
				|| j == height - counter
				&& i <= height / 2)
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		System.out.printf("\n");
		if (i < height / 2)
			counter++;
	}
}

// Function to print the pattern of 'Z'
static void printZ()
{
	int i, j, counter = height - 1;
	for (i = 0; i < height; i++)
	{
		for (j = 0; j < height; j++)
		{
			if (i == 0 || i == height - 1
				|| j == counter)
				System.out.printf("*");
			else
				System.out.printf(" ");
		}
		counter--;
		System.out.printf("\n");
	}
}

// Function print the pattern of the
// alphabets from A to Z
static void printPattern(char character)
{
	switch (character)
	{
	case 'A':
		printA();
		break;
	case 'B':
		printB();
		break;
	case 'C':
		printC();
		break;
	case 'D':
		printD();
		break;
	case 'E':
		printE();
		break;
	case 'F':
		printF();
		break;
	case 'G':
		printG();
		break;
	case 'H':
		printH();
		break;
	case 'I':
		printI();
		break;
	case 'J':
		printJ();
		break;
	case 'K':
		printK();
		break;
	case 'L':
		printL();
		break;
	case 'M':
		printM();
		break;
	case 'N':
		printN();
		break;
	case 'O':
		printO();
		break;
	case 'P':
		printP();
		break;
	case 'Q':
		printQ();
		break;
	case 'R':
		printR();
		break;
	case 'S':
		printS();
		break;
	case 'T':
		printT();
		break;
	case 'U':
		printU();
		break;
	case 'V':
		printV();
		break;
	case 'W':
		printW();
		break;
	case 'X':
		printX();
		break;
	case 'Y':
		printY();
		break;
	case 'Z':
		printZ();
		break;
	}
}

// Driver Code
public static void main(String[] args)
{
	
	char name = 'A';
	printPattern(name);
	
	
}
}

// This code is contributed by PrinciRaj1992
