package Client;

public class Document {
    private String contents;
    private String path;

    public Document(String contents) {
        this.contents = contents;
    }

    public void openDoc() {
        //metodo de abertura do java de documentos - check libraries
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getContents() {
        return contents;
    }
}
