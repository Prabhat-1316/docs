/* ----Nested For Loop----
   Printing Working Time Table using for loop
 */

public class NestedForLoop {
    public static void main(String[] args)
    {
        for(int i=1;i<6;i++)
        {
            System.out.println("DAY "+i);
            for(int j=1;j<9;j++)
            {
                System.out.println("    On Duty   "+(j+8)+"-"+(j+9));
            }
        }
    }
    
}

/* OUTPUT
------------------------------------
  DAY 1
    On Duty   9-10
    On Duty   10-11
    On Duty   11-12
    On Duty   12-13
    On Duty   13-14
    On Duty   14-15
    On Duty   15-16
    On Duty   16-17
DAY 2
    On Duty   9-10
    On Duty   10-11
    On Duty   11-12
    On Duty   12-13
    On Duty   13-14
    On Duty   14-15
    On Duty   15-16
    On Duty   16-17
DAY 3
    On Duty   9-10
    On Duty   10-11
    On Duty   11-12
    On Duty   12-13
    On Duty   13-14
    On Duty   14-15
    On Duty   15-16
    On Duty   16-17
DAY 4
    On Duty   9-10
    On Duty   10-11
    On Duty   11-12
    On Duty   12-13
    On Duty   13-14
    On Duty   14-15
    On Duty   15-16
    On Duty   16-17
DAY 5
    On Duty   9-10
    On Duty   10-11
    On Duty   11-12
    On Duty   12-13
    On Duty   13-14
    On Duty   14-15
    On Duty   15-16
    On Duty   16-17
 ------------------------------------
 */
