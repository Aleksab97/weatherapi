package weatherApp.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCity is a Querydsl query type for City
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCity extends EntityPathBase<City> {

    private static final long serialVersionUID = -139334252L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCity city = new QCity("city");

    public final QCoord coord;

    public final StringPath date = createString("date");

    public final StringPath id = createString("id");

    public final QMain main;

    public final StringPath name = createString("name");

    public final QSys sys;

    public final QWind wind;

    public QCity(String variable) {
        this(City.class, forVariable(variable), INITS);
    }

    public QCity(Path<? extends City> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCity(PathMetadata metadata, PathInits inits) {
        this(City.class, metadata, inits);
    }

    public QCity(Class<? extends City> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.coord = inits.isInitialized("coord") ? new QCoord(forProperty("coord")) : null;
        this.main = inits.isInitialized("main") ? new QMain(forProperty("main")) : null;
        this.sys = inits.isInitialized("sys") ? new QSys(forProperty("sys")) : null;
        this.wind = inits.isInitialized("wind") ? new QWind(forProperty("wind")) : null;
    }

}

