package html.dev.fx;

import html.dev.main.Main;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.HTMLEditor;

import javax.swing.*;

/**
 * Created by LINKOR on 05.03.2017 in 7:52.
 * Date: 2017.03.05
 */
public class FX extends JFXPanel {
    public FX() {
        HTMLEditor htmle = new HTMLEditor();
        BorderPane bp = new BorderPane(htmle);
        ToolBar tb = new ToolBar();
        Button b = new Button("Open in browser"), ht = new Button("Get HTML Text");
        b.setOnAction(evt -> opinbr(htmle.getHtmlText()));
        ht.setOnAction(evt -> JOptionPane.showMessageDialog(null, "HTML Text: \n" + sss(htmle.getHtmlText())));
        tb.getItems().add(b);
        bp.setTop(tb);
        tb.getItems().add(ht);
        setScene(new Scene(bp));
    }

    private String sss(String html) {
        String[] lines = html.split(">");
        String all = "";
        for (String line : lines) all += (line + ">\n");
        return all;
    }

    private void opinbr(String html) {
        Main.browser(html);
    }
}
