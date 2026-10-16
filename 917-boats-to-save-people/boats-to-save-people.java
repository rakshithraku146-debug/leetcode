class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int rigth = people.length - 1;
        int boats = 0;
        while (left <= rigth){
            if(people[left]  + people[rigth] <= limit){
                left++;
            }
            rigth--;
            boats++;
        }
        return boats;
    }
}