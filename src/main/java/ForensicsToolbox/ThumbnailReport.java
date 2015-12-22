package ForensicsToolbox;

import org.mongodb.morphia.annotations.Embedded;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marzampoglou on 12/3/15.
 */
@Embedded
public class ThumbnailReport {
    public int NumberOfThumbnails=0;
    public List<String> ThumbnailList= new ArrayList();
}
