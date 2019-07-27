package weatherApp.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSys is a Querydsl query type for Sys
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QSys extends BeanPath<Sys> {

    private static final long serialVersionUID = -1944141436L;

    public static final QSys sys = new QSys("sys");

    public final StringPath country = createString("country");

    public final NumberPath<Long> sunrise = createNumber("sunrise", Long.class);

    public final NumberPath<Long> sunset = createNumber("sunset", Long.class);

    public QSys(String variable) {
        super(Sys.class, forVariable(variable));
    }

    public QSys(Path<? extends Sys> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSys(PathMetadata metadata) {
        super(Sys.class, metadata);
    }

}

