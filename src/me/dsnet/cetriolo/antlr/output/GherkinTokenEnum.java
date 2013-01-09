/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.dsnet.cetriolo.antlr.output;

/**
 *
 * @author SessonaD
 */
public enum GherkinTokenEnum {

    COMMENT(4, "comment"),
    DOCSTR(5,"string"),
    EXAMPLE(6,"Stepkeyword"),
    FEATURE(7, "keyword"),
    FEAT_KEY(8,"Featurekeyword"),    
    NL(9, "whitespace"),
    NUMBER(10, "Number"),
    PHOLDER(11, "Placeholder"),
    SCENARIO(12, "keyword"),
    SCEN_OUT(13, "keyword"),
    STEP_KEY(14, "Stepkeyword"),
    STRING(15, "string"),
    TAGNAME(16, "Tag"),
    T_ROW(17, "Table"),
    WORD(18, "Text"),
    WS(19, "whitespace");
    
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
