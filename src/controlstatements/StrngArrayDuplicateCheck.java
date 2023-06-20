package controlstatements;

public class StrngArrayDuplicateCheck {

	public static void main(String[] args) {
		String[] names= {"Anoop","Antony","Anusha","Anoop","Anusha","Antony","Anoop","Nevah"};
		String[] dup= new String[5];
		int c=0,k=0;
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1,f=0;j<names.length;j++)
			{
				if(names[i]==names[j])
				{
					for(int l=0;l<k;l++)
					{
						if(dup[l]==names[i])
							f=1;
							break;
					}
					if(f==0)
					{
					dup[k]=names[i];
					k++;
					break;
					}
				}
						
			}
		}
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<names.length;j++)
			{
				if(dup[i]==names[j])
				{
					c++;
				}
						
			}
			System.out.println(dup[i]+"="+c);
			c=0;
		}

	}
}
