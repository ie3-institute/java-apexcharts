/*
 * © 2020. TU Dortmund University,
 * Institute of Energy Systems, Energy Efficiency and Energy Economics,
 * Research group Distribution grid planning and operation
 */

package edu.ie3.vis.apex;

import com.google.gson.Gson;
import edu.ie3.vis.apex.data.PairDataSeries;
import edu.ie3.vis.apex.options.chart.*;
import edu.ie3.vis.apex.options.stroke.StrokeOptions;
import edu.ie3.vis.apex.options.title.ChartTitle;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import org.apache.commons.io.FileUtils;

/**
 * //ToDo: Class Description
 *
 * @version 0.1
 * @since 14.01.20
 */
public class ChartFactory {

  private static final String apexChartsUrl = "https://cdn.jsdelivr.net/npm/apexcharts";
  private static final String apexChartsReactUrl = "https://cdn.jsdelivr.net/npm/react-apexcharts";

  private static final String DEFAULT_TEMPLATE =
      "<!DOCTYPE html>\n"
          + "<html lang=\"en\">\n"
          + "\n"
          + "<head>\n"
          + "    <meta charset=\"UTF-8\">\n"
          + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
          + "    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n"
          + "    <title>$htmlTitle</title>\n"
          + "\n"
          + "    <script src=\"$apexChartsUrl\"></script>\n"
          + "    <script src=\"$apexChartsReactUrl\"></script>\n"
          + "\n"
          + "\n"
          + "</head>\n"
          + "<body>\n"
          + "\n"
          + "<div id=\"chart\"></div>\n"
          + "\n"
          + "<script>\n"
          + "\n"
          + "      var options = $options\n"
          + "      var chart = new ApexCharts(document.querySelector(\"#chart\"), options);\n"
          + "      chart.render();\n"
          + "\n"
          + "\n"
          + "    </script>\n"
          + "\n"
          + "\n"
          + "</body>\n"
          + "\n"
          + "</html>";

  public void createSingleValuesChart(
      ChartTitle title,
      Collection<PairDataSeries<String, Double>> series,
      ChartOptions chartOptions,
      StrokeOptions strokeOptions,
      String fileName) {
    // build the chart
    SingleValuesChart chart = new SingleValuesChart(title, series, chartOptions, strokeOptions);

    // serialize as json
    Gson g = new Gson();
    String options = g.toJson(chart).concat(";");

    // build the html string
    String htmlString = DEFAULT_TEMPLATE;
    htmlString = htmlString.replace("$options", options);
    htmlString = htmlString.replace("$apexChartsUrl", apexChartsUrl);
    htmlString = htmlString.replace("$apexChartsReactUrl", apexChartsReactUrl);
    htmlString = htmlString.replace("$htmlTitle", title.getText());

    // save as new File
    if (!fileName.endsWith(".html")) fileName = fileName + ".html";
    File newHtmlFile = new File(fileName);
    try {
      FileUtils.writeStringToFile(newHtmlFile, htmlString, StandardCharsets.UTF_8);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
