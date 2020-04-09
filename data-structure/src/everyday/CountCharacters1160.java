package everyday;

/**
 * @author Heroin X
 * @date 2020/3/17 8:54
 */
public class CountCharacters1160 {
    public static void main(String[] args) {
        String[] word =new String[]{"cat","bt","hat","tree"};
        String chars = "atach";
        int i = new CountCharacters1160().countCharacters(word, chars);
        System.out.println(i);
    }

    public int countCharacters(String[] words, String chars) {
        int[] hash = new int[26];

        for(Character ch : chars.toCharArray()){
            hash[ch-'a'] += 1;
        }

        int count = 0;
        for(String str:words){
            char[] word = str.toCharArray();
            int[] map = new int[26];
            boolean flag =true;
            for(Character wo:word){
                map[wo-'a'] += 1;
                if(hash[wo-'a'] < map[wo-'a']) {
                    flag = false;
                }
            }
            count += flag ?  word.length : 0;
        }
        return count;
    }

//    public int countCharacters(String[] words, String chars) {
//        int[] hash = new int[26];
//        for(char ch : chars.toCharArray()){
//            hash[ch - 'a'] += 1;
//        }
//
//
//        int[] map = new int[26];
//        int len = 0;
//
//        for(String word : words){
//            Arrays.fill(map, 0);
//            boolean flag = true;
//            for(char ch : word.toCharArray()){
//                map[ch - 'a']++;
//                if(map[ch - 'a'] > hash[ch - 'a']) flag = false;
//            }
//            len += flag ? word.length() : 0;
//        }
//        return len;
//    }

//    public int countCharacters(String[] words, String chars) {
//        int count = 0;
//        char[] ch = chars.toCharArray();
//        HashMap<Character, Integer> hash = new HashMap<>();
//        for(int i = 0; i < ch.length; i++){
//            if(!hash.containsKey(ch[i])){
//                hash.put(ch[i],1);
//            }else{
//                hash.put(ch[i], hash.get(ch[i])+1);
//            }
//        }
//
//        for(int i = 0; i < words.length; i++){
//            HashMap<Character, Integer> tmp = new HashMap<>();
//            char[] word = words[i].toCharArray();
//            for(int j = 0; j < word.length; j++){
//                if(!hash.containsKey(ch[j])){
//                    hash.put(ch[j],1);
//                }else{
//                    hash.put(ch[j], hash.get(ch[j])+1);
//                }
//            }
//            for(int k = 0; k < word.length; k++){
//                if(tmp.get(word[i]) > hash.get(word[i])){
//                    break;
//                }
//                if(k == word.length-1){
//                    count = count + word.length;
//                }
//            }
//        }
//
//        return count;
//
//    }

//    public int countCharacters(String[] words, String chars) {
//
//        char[] ch = chars.toCharArray();
//        HashMap<Character,Integer> hash = new HashMap<>();
//
//        if(hash.containsKey(ch[0])){
//            Integer integer = hash.get(ch[0])+1;
//            hash.put()
//        }
//
//
//            int count = 0;
//        for(int i = 0; i < words.length; i++){
//            String word = words[i];
//            char[] tmp = word.toCharArray();
//            for(int j = 0; j < tmp.length; j++){
//                if(chars.contains(tmp[j])){
//                    chars.
//                    if(j == tmp.length-1){
//                        count  = count + tmp.length;
//                    }
//                }else{
//                    break;
//                }
//            }
//        }
//
//        return count;
//    }
}
