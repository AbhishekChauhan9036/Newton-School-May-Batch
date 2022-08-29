class Filter{
    String filter(String str, char ch)
    {
        String bag="";
        for(int i=0;i<str.length();i++)
        {
            if(ch!=str.charAt(i))
            {
                bag=bag+str.charAt(i);
            }
        }
        return bag;
    }
    int[] filter(int[] arr, int el)
    {
       int count=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]!=el)
           {
               count++;
           }
       }
       int ans[]=new int[count];
       int k=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]!=el)
           {
               ans[k++]=arr[i];
           }
       }
        return ans; 
    }
    char[] filter(char[] arr, int ch)
    {
       int count=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]!=ch)
           {
               count++;
           }
       }
       char ans[]=new char[count];
       int k=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]!=ch)
           {
               ans[k++]=arr[i];
           }
       }
        return ans;
    }
    String filter(String a, String b)
    {
        String arr[]=a.split(b);
        return String.join("", arr);
    }
}