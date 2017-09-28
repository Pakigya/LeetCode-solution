class Solution {
    public List<String> readBinaryWatch(int num) {
        List < String > result = new ArrayList <String>();
        for( int h = 0; h < 12; h++) {
            for( int m = 0; m < 60; m++) {
                if( Integer.bitCount(m + ( h << 6)) == num)
                    result.add(String.format("%d:%02d", h , m) );
            }
        }
        return result;
    }
}
