package nextstep.subway.support.handlebar;

import com.github.jknack.handlebars.Options;
import nextstep.subway.support.version.SubwayVersionSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.allegro.tech.boot.autoconfigure.handlebars.HandlebarsHelper;
@HandlebarsHelper
public class SubwayHandlebarsHelper {
    private static final Logger logger = LoggerFactory.getLogger(SubwayHandlebarsHelper.class);

    private final SubwayVersionSupport subwayVersionSupport;

    public SubwayHandlebarsHelper(SubwayVersionSupport subwayVersionSupport) {
        this.subwayVersionSupport = subwayVersionSupport;
    }

    public String staticUrls(String path, Options options) {
        logger.debug("static url : {} , options : {}", path, options.toString());
        return String.format("/resources/%s%s", subwayVersionSupport.getVersion(), path);
    }
}
