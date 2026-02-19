import java.util.*;

public class Report {

    private String header;
    private String content;
    private String footer;
    private List<String> sections = new ArrayList<>();

    public void setHeader(String header) { this.header = header; }
    public void setContent(String content) { this.content = content; }
    public void setFooter(String footer) { this.footer = footer; }
    public void addSection(String section) { sections.add(section); }

    public void export() {
        System.out.println(header);
        System.out.println(content);
        sections.forEach(System.out::println);
        System.out.println(footer);
    }
}
