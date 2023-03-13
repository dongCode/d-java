import java.util.*;

class WordCount {
    public static void main(String[] args) {

        String article = "This is a sample article. It contains some words that will be counted.Test is ready?";
        
        HashMap<String, Integer> wordCount = countWords(article);

        System.out.println(wordCount);

    }

    public static HashMap<String, Integer> countWords(String article) {
        // 创建HashMap对象来记录单词出现次数

        HashMap<String, Integer> wordCount = new HashMap<>();

        // 将文章转换为小写并使用正则表达式将其拆分为单词数组
        String[] words = article.toLowerCase().split("[^a-zA-Z]+");

        // 遍历单词数组并将每个单词的计数添加到哈希表中
        for(String word : words) {

            if(!word.isEmpty()) {

                if(wordCount.containsKey(word)) {

                    int count = wordCount.get(word);

                    wordCount.put(word, count + 1);

                } else {

                    wordCount.put(word, 1);
                }
            }
        }

        return wordCount;
    }
}