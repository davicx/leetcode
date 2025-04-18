package leetcode;

import static tools.Tools.cleanSpaces;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "  the   sky is blue";

        String answer = reverseWords(s);
        System.out.println(answer);

    }


    public static String reverseWords(String s) {
        String answer = "";
        String cleanS = cleanSpaces(s);
        String[] sArray = cleanS.split(" ");


        for (int i = sArray.length - 1; i >=  0; i--) {
            System.out.println(sArray[i]);
            String currentWord = sArray[i] + " ";
            answer = answer + currentWord;
        }

        answer = answer.trim();

        return answer;

    }



}

/*
var s = "the sky is blue"
//"blue is sky the"

let answer = reverseWords(s)
console.log("answer ")
console.log(answer)

function reverseWords(s) {
    var newString = ""
    let m = s.trim();
    m = m.replace(/ +(?= )/g,'');
    let sArray = [];

    let word = "";

    for (let i = 0; i < m.length; i++) {
        if(m.charAt(i) != " ") {
            word = word + m.charAt(i);
            //console.log(word)
        } else {
            sArray.push(word);
            word = ""
        }

        //Last Word
        if(i == m.length -1) {
            sArray.push(word);
        }
    }

    //Reverse Array
    sArray = sArray.reverse()
    for (let i = 0; i < sArray.length; i++) {
        newString = newString + sArray[i] + " ";
    }

    newString = newString.trim();

    return newString;

}
 */