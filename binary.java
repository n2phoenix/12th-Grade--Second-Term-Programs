class binary
{
    public int binarySearch(int[] a, int x, int low, int high) 
    {
        int mid = (low + high)/2;
        if (low > high)
        return -1;
        
        if (a[mid] == x) 
        return mid + 1; //Not starting from zero, start from one
        
        else if (a[mid] < x)
            return binarySearch(a, x, mid + 1, high);
        
        else // last possibility: a[mid] > x
            return binarySearch(a, x, low, mid - 1);
    }
}