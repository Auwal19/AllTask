public static int[] vowelCount(String s) {
    int[] counts = new int[5];
    s = s.toLowerCase();
    
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        if (ch == 'a') counts[0]++;	
        else if (ch == 'e') counts[1]++;
        else if (ch == 'i') counts[2]++;
        else if (ch == 'o') counts[3]++;
        else if (ch == 'u') counts[4]++;
    }
    
    return counts;
åßåå}