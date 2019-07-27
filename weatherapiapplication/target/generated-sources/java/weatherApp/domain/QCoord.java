package weatherApp.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCoord is a Querydsl query type for Coord
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QCoord extends BeanPath<Coord> {

    private static final long serialVersionUID = -24220692L;

    public static final QCoord coord = new QCoord("coord");

    public final NumberPath<Integer> lat = createNumber("lat", Integer.class);

    public final NumberPath<Integer> lon = createNumber("lon", Integer.class);

    public QCoord(String variable) {
        super(Coord.class, forVariable(variable));
    }

    public QCoord(Path<? extends Coord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCoord(PathMetadata metadata) {
        super(Coord.class, metadata);
    }

}

