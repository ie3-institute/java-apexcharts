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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * //ToDo: Class Description
 *
 * @version 0.1
 * @since 14.01.20
 */
public class ChartFactory {


  private static int i;
  private static final Logger logger = LogManager.getLogger(ChartFactory.class);

  private static final String APEX_CHARTS_URL = "https://cdn.jsdelivr.net/npm/apexcharts";
  private static final String CHARTS_TEMPLATE = "<div id=\"chart$i\"></div>";
  private String CHARTS ="";
  private static final String CREATE_CHARTS_TEMPLATE = "      var chart$i = new ApexCharts(document.querySelector(\"#chart$i\"), options$i);";
  private String OPTIONS ="";
  private static final String OPTIONS_TEMPLATE = "      var options$i = $setOptions;";
  private String CREATE_CHARTS ="";
  private static final String RENDER_CHARTS_TEMPLATE = "      chart$i.render();";
  private String RENDER_CHARTS ="";

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
          + "\n"
          + "\n"
          + "</head>\n"
          + "<body>\n"
          + "\n"
          + "$chart\n"
          + "\n"
          + "<script>\n"
          + "\n"
          + "$options\n"
          + "$createChart\n"
          + "$renderChart\n"
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
      Collection<PairDataSeries<String, Double>> series, // TODO Using array, list etc. of Collection series
      ChartOptions chartOptions,
      StrokeOptions strokeOptions,
      String fileName) {
    // build the chart

    // TODO For each Object in a Collection series - Array

    SingleValuesChart chart = new SingleValuesChart(title, series, chartOptions, strokeOptions);

    // serialize as json
    Gson g = new Gson();
    String options = g.toJson(chart).concat(";");

    // build multiple divs etc. for graphs and data

    for (i = 0; i < 4; i++) {
      CHARTS = CHARTS.concat(CHARTS_TEMPLATE.replace("$i", i + "") + "\n");
      OPTIONS = OPTIONS.concat(OPTIONS_TEMPLATE.replace("$i", i + "") + "\n");
      CREATE_CHARTS = CREATE_CHARTS.concat(CREATE_CHARTS_TEMPLATE.replace("$i", i + "") + "\n");
      RENDER_CHARTS = RENDER_CHARTS.concat(RENDER_CHARTS_TEMPLATE.replace("$i", i + "") + "\n");
    }

    // For each close

    // build the html string

    String htmlString = DEFAULT_TEMPLATE;
    htmlString = htmlString.replace("$chart", CHARTS);
    htmlString = htmlString.replace("$options", OPTIONS);
    htmlString = htmlString.replace("$createChart", CREATE_CHARTS);
    htmlString = htmlString.replace("$renderChart", RENDER_CHARTS);
    htmlString = htmlString.replace("$setOptions", options);
    htmlString = htmlString.replace("$apexChartsUrl", APEX_CHARTS_URL);
    htmlString = htmlString.replace("$htmlTitle", title.getText());

    // save as new File
    if (!fileName.endsWith(".html")) fileName = fileName + ".html";
    File newHtmlFile = new File(fileName);
    try {
      FileUtils.writeStringToFile(newHtmlFile, htmlString, StandardCharsets.UTF_8);
    } catch (IOException e) {
      logger.throwing(e);
    }
  }
}
