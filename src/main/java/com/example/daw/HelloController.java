package com.example.daw;

import com.example.daw.model.Root;
import com.google.gson.Gson;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.apache.http.HttpRequest;

import java.io.IOException;
import java.net.URI;

public class HelloController {

    @FXML
    Label labelresponse;
    @FXML
    Button btn;
    @FXML
    TextField nip;
    @FXML
    Label labelinfo;

    String nipbuffor;

    public void onClick(ActionEvent actionEvent) {
    }

    @FXML
    public void initialize() {
        labelresponse.setText("Wprowadz Nip");
    }

    public void onMClick(MouseEvent mouseEvent) throws IOException, InterruptedException {
        if (mouseEvent.getSource() instanceof Button) {
            labelresponse.setText("Sprawdz");
            nipbuffor = nip.getText();
            // String nip = "5260250274";
            String data = "?date=2021-12-05";

            String url = "https://wl-api.mf.gov.pl/api/search/nip/" + nipbuffor + data;

            /*HttpClient client =
            HttpRequest request = HttpRequest.newBuilder()
                    .GET().header("accept", "application/json").uri(URI.create(url)).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String responseString = response.body();
            try {
                Gson gson = new Gson();

                Root root = gson.fromJson(responseString, Root.class);
                System.out.println(root.getResult().getSubject().getNip());
                if (responseString.contains("\"statusVat\":\"Czynny\"")) ;
                {
                    labelresponse.setText("statusVat : Czynny ");
                    labelinfo.setText(root.getResult().getSubject().getName() + "\n  " + root.getResult().getSubject().getWorkingAddress());
                    System.out.println("statusVat : Czynny");
                }
            } catch (Exception e) {
                System.out.println(e.toString());
            }*/
        }
    }
}