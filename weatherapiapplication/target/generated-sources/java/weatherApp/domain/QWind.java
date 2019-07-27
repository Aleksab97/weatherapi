package weatherApp.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QWind is a Querydsl query type for Wind
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QWind extends BeanPath<Wind> {

    private static final long serialVersionUID = -138738639L;

    public static final QWind wind = new QWind("wind");

    public final NumberPath<Double> deg = createNumber("deg", Double.class);

    public final NumberPath<Double> speed = createNumber("speed", Double.class);

    public QWind(String variable) {
        super(Wind.class, forVariable(variable));
    }

    public QWind(Path<? extends Wind> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWind(PathMetadata metadata) {
        super(Wind.class, metadata);
    }

}

