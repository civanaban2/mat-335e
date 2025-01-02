package Lab07;

public class DifNumbers
{
	public static void main(String[] args)
	{
		int[] array = {1,2,4,5,3,1,6,4,2};
		System.out.printf("Output is: %d\n", findDifNumbersInArray(array));

		int[] array2 = {};
		System.out.printf("Output is: %d\n", findDifNumbersInArray(array2));

		int[] array3 = {1,1,1,1,1};
		System.out.printf("Output is: %d\n", findDifNumbersInArray(array3));

		int[] array4 = {1,2,3,4};
		System.out.printf("Output is: %d\n", findDifNumbersInArray(array4));

		int[] array5 = {1,2,3,4,5,1,2,3,4,5};
		System.out.printf("Output is: %d\n", findDifNumbersInArray(array5));
	}
	
	public static int findDifNumbersInArray(int[] array) {
		int	count = 1;
		int	idx = 1;
		int	j = 0;

		//Eger array bos ise 0 farklı karakter vardir.
		if (array.length == 0)
			return 0;

		//Arrayi index index sona kadar geziyoruz
		while(idx < array.length)
		{
			//Karakterin daha once olup olmadıgını kontrol etmek icin onceki indexlere bakmaliyiz
			while (j < idx)
			{
				//Onceki indexlerde sayı mevcutsa sonraki indexteki sayiyi kontrol etmek icin devam ediyoruz
				if (array[j] == array[idx])
				{
					j = 0;
					break;
				}
				//Onceki indexlerin kontrolunu mevcut yerimize gelene kadar kontrol ediyoruz, mevcut indeximize gelince durmamiz gerekiyor.
				j++;
				if (j == idx)
					count++;
			}
			j = 0;
			idx++;
		}		
		return count;
	}
}
