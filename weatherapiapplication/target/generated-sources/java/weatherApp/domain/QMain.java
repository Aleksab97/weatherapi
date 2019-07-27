package weatherApp.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMain is a Querydsl query type for Main
 */
@Generated("com.querydsl.codegen.EmbeddableSerializer")
public class QMain extends BeanPath<Main> {

    private static final long serialVersionUID = -139044382L;

    public static final QMain main = new QMain("main");

    public final NumberPath<Integer> humidity = createNumber("humidity", Integer.class);

    public final NumberPath<Integer> pressure = createNumber("pressure", Integer.class);

    public final NumberPath<Double> temp = createNumber("temp", Double.class);

    public final NumberPath<Double> temp_max = createNumber("temp_max", Double.class);

    public final NumberPath<Double> temp_min = createNumber("temp_min", Double.class);

    public QMain(String variable) {
        super(Main.class, forVariable(variable));
    }

    public QMain(Path<? extends Main> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMain(PathMetadata metadata) {
        super(Main.class, metadata);
    }

}

