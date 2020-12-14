package be.zelda.samples.text;

public class TextBlock {

    public static void main(String[] args) {
        String html  = """
                <html>
                    <body>
                    </body>
                </html>
                """;

        var apodData = """
                        {
                            "date": "2020-09-15",
                            "title": "Biomarker Phosphine Discovered in the Atmosphere of Venus",
                            "url": "https://apod.nasa.gov/apod/image/2009/VenusClouds_Akatzuki_960.jpg"             
                        }
                        """;
        System.out.println("TextBlock.main: " + html);
    }
}
