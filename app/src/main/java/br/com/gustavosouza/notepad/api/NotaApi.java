package br.com.gustavosouza.notepad.api;

import java.util.List;

import br.com.gustavosouza.notepad.model.Nota;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface NotaApi {
    @GET(value = "/nota/{titulo}")
    Call<List<Nota>> buscarNota(@Path(value = "tiulo")String nota);

    @POST(value = "/nota")
    Call<Void> salvar(@Body Nota nota);
}
