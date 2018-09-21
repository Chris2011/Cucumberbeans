package me.dsnet.cetriolo.antlr;

/**
 *
 * @author SessonaD
 */
public enum GherkinTokenEnum {
    BACKGROUND(GherkinLexer.BACKGROUND, "keyword"),
    COMMENT(GherkinLexer.COMMENT, "comment"),
    DOCSTR(GherkinLexer.DOCSTR,"string"),
    EXAMPLE(GherkinLexer.EXAMPLE,"Stepkeyword"),
    FEATURE(GherkinLexer.FEATURE, "keyword"),
    FEAT_KEY(GherkinLexer.FEAT_KEY,"Featurekeyword"),
    NL(GherkinLexer.NL, "whitespace"),
    NUMBER(GherkinLexer.NUMBER, "Number"),
    PHOLDER(GherkinLexer.PHOLDER, "Placeholder"),
    SCENARIO(GherkinLexer.SCENARIO, "keyword"),
    SCEN_OUT(GherkinLexer.SCEN_OUT, "keyword"),
    STEP_KEY(GherkinLexer.STEP_KEY, "Stepkeyword"),
    STRING(GherkinLexer.STRING, "string"),
    TAGNAME(GherkinLexer.TAGNAME, "Tag"),
    T_ROW(GherkinLexer.T_ROW, "Table"),
    WORD(GherkinLexer.WORD, "Text"),
    WS(GherkinLexer.WS, "whitespace"),
    ERR_CHAR(GherkinLexer.ERR_CHAR, "Text");

    public int id;
    public String category;

    private GherkinTokenEnum(int id, String category) {
        this.id = id;
        this.category = category;
    }

    public static GherkinTokenEnum valueOf(int id) {
        GherkinTokenEnum[] values = values();
        for (GherkinTokenEnum value : values) {
            if (value.id == id) {
                return value;
            }
        }
        throw new IllegalArgumentException("The id " + id + " is not recognized");
    }
}
