package io.pivotal.pulse.InterfaceAdapters;

import org.apache.commons.io.IOUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProjectTemplateTest {


    @Test
    public void testTemplate() throws Exception {
        String fileAsString = IOUtils.toString(ProjectTemplateTest.class.getResourceAsStream("/templates/project/new.html"));
        Document html = Jsoup.parse(fileAsString);

        Element inputName = html.select("input[name=name][type=text]").first();
        Element inputProjectCode = html.select("input[name=project_code][type=text]").first();

        assertNotNull(inputName);
        assertNotNull(inputProjectCode);
    }
}
