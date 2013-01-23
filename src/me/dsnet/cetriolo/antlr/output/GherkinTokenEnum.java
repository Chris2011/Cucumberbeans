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

    BACKGROUND(4, "keyword"),
    COMMENT(5, "comment"),
    DOCSTR(6,"string"),
    EXAMPLE(7,"Stepkeyword"),
    FEATURE(8, "keyword"),
    FEAT_KEY(9,"Featurekeyword"),    
    NL(10, "whitespace"),
    NUMBER(11, "Number"),
    PHOLDER(12, "Placeholder"),
    SCENARIO(13, "keyword"),
    SCEN_OUT(14, "keyword"),
    STEP_KEY(15, "Stepkeyword"),
    STRING(16, "string"),
    TAGNAME(17, "Tag"),
    T_ROW(18, "Table"),
    WORD(19, "Text"),
    WS(20, "whitespace");
    
    
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
