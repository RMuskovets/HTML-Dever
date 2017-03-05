package html.dev.main;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.BrowserType;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import html.dev.fx.FX;

import javax.swing.*;

/**
 * Created by LINKOR on 05.03.2017 in 7:58.
 * Date: 2017.03.05
 */
public class Main {
    public static void browser(String html) {
        Browser b = new Browser(BrowserType.LIGHTWEIGHT);
        b.loadHTML(html);
        BrowserView bv = new BrowserView(b);
        JFrame jfr = new JFrame("HTML View");
        jfr.add(bv);
        jfr.setSize(500, 400);
        jfr.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame jfr = new JFrame("HTML Dever");
        jfr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jfr.add(new FX());
        jfr.setVisible(true);
    }
}
