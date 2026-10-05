package problem2;

public class IntegerList
{
    int[] list;//values in the list
    //-------------------------------------------------------
    int currentSize = 0;
    int currentNumInt = 0;
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        currentSize = size;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------

    public void randomize()
    {
        for (int i=0; i<list.length; i++){
            list[i] = (int)(Math.random() * 100) + 1;
            currentNumInt += 1;
        }

    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<currentNumInt; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    public void increaseSize(){
        currentSize *= 2;
        int[] new_list = new int[currentSize];
        for(int i = 0 ; i < list.length ; i++){
            new_list[i] = list[i];
        }
        list = new_list;
        }

    public void addElement(int newVal){
        if(currentSize == currentNumInt){
           increaseSize();
        }
        list[currentNumInt] = newVal;
        currentNumInt ++;
    }
    public void removeFirst(int newVal){
        for(int i = 0 ; i < currentNumInt ; i ++){
            if(list[i] == newVal){
                for(int j = i ; j< currentNumInt -1; j ++){
                    list[j] = list[j+1];
                }
                currentNumInt -- ;
                break;
            }
        }
    }
    public void removeAll(int newVal){
        int occ = 0;
        for(int i = 0 ; i < currentNumInt ; i ++){
            if(list[i] == newVal){
                occ ++;
            }
        }
        for(int i = 0 ; i < occ ; i ++ ){
            removeFirst(newVal);
        }
    }

}