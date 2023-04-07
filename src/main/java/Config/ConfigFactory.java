package Config;

import com.MF.Converters.Frameworkconfig;
import org.aeonbits.owner.ConfigCache;

import static org.aeonbits.owner.ConfigCache.*;

public final class ConfigFactory {

    private ConfigFactory(){}


        public static Frameworkconfig getConfig() {
            return ConfigCache.getOrCreate(Frameworkconfig.class);
        }
    }

