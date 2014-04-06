
package solucraft.ironchest;

import java.util.Properties;

public class Version {
    private static String major;
    private static String minor;
    private static String rev;
    private static String build;
    @SuppressWarnings("unused")
    private static String mcversion;

    public static void init(Properties properties)
    {
        if (properties != null)
        {
            major = properties.getProperty("IronChest.build.major.number");
            minor = properties.getProperty("IronChest.build.minor.number");
            rev = properties.getProperty("IronChest.build.revision.number");
            build = properties.getProperty("IronChest.build.number");
            mcversion = properties.getProperty("IronChest.build.mcversion");
        }
    }

    public static String fullVersionString()
    {
        return String.format("%s.%s.%s build %s", major, minor, rev, build);
    }
}
