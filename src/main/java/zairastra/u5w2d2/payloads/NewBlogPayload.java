package zairastra.u5w2d2.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//il payload non continene alcun dato che non è "inserito dall'utente", o meglio generato dal server
//quindi ha perfettamente senso usare il costruttore di lombok, non bisogna escludere id o altro
@AllArgsConstructor
public class NewBlogPayload {
    private String category;
    private String title;
    //escludo la gestione dell'url dell'immagine perchè non so farla
//    private String cover;
    private String content;
    private double readingTime;

    @Override
    public String toString() {
        return
                "category='" + category + '\'' +
                        ", title='" + title + '\'' +
                        ", content='" + content + '\'' +
                        ", readingTime=" + readingTime;

    }
}
