package by.haa.tms;

public class SimplePrinter {

    private String separator = "*********";

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public void split(){
        System.out.println(this.separator);
    }
}
