package D;

public class byteCode {
    //code
    public static String noColors(String string){
        String finalString = string;
        finalString = finalString.replaceAll("\\[clear\\]","");
        finalString = finalString.replaceAll("\\[black\\]","");
        finalString = finalString.replaceAll("\\[white\\]","");
        finalString = finalString.replaceAll("\\[lightgray\\]","");
        finalString = finalString.replaceAll("\\[gray\\]","");
        finalString = finalString.replaceAll("\\[darkgray\\]","");
        finalString = finalString.replaceAll("\\[blue\\]","");
        finalString = finalString.replaceAll("\\[navy\\]","");
        finalString = finalString.replaceAll("\\[royal\\]","");
        finalString = finalString.replaceAll("\\[slate\\]","");
        finalString = finalString.replaceAll("\\[sky\\]","");
        finalString = finalString.replaceAll("\\[cyan\\]","");
        finalString = finalString.replaceAll("\\[teal\\]","");
        finalString = finalString.replaceAll("\\[green\\]","");
        finalString = finalString.replaceAll("\\[acid\\]","");
        finalString = finalString.replaceAll("\\[lime\\]","");
        finalString = finalString.replaceAll("\\[forest\\]","");
        finalString = finalString.replaceAll("\\[olive\\]","");
        finalString = finalString.replaceAll("\\[yellow\\]","");
        finalString = finalString.replaceAll("\\[gold\\]","");
        finalString = finalString.replaceAll("\\[goldenrod\\]","");
        finalString = finalString.replaceAll("\\[orange\\]","");
        finalString = finalString.replaceAll("\\[brown\\]","");
        finalString = finalString.replaceAll("\\[tan\\]","");
        finalString = finalString.replaceAll("\\[brick\\]","");
        finalString = finalString.replaceAll("\\[red\\]","");
        finalString = finalString.replaceAll("\\[scarlet\\]","");
        finalString = finalString.replaceAll("\\[coral\\]","");
        finalString = finalString.replaceAll("\\[salmon\\]","");
        finalString = finalString.replaceAll("\\[pink\\]","");
        finalString = finalString.replaceAll("\\[magenta\\]","");
        finalString = finalString.replaceAll("\\[purple\\]","");
        finalString = finalString.replaceAll("\\[violet\\]","");
        finalString = finalString.replaceAll("\\[maroon\\]","");
        finalString = finalString.replaceAll("\\[#(.*)\\]","");
        finalString = finalString.replace("[]","");
        return  finalString;}
}