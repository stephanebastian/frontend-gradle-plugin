package org.siouan.frontendgradleplugin.test.util;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.annotation.Nonnull;

/**
 * Class providing static utilities to create Gradle settings files.
 */
public final class GradleSettingsFiles {

    private static final String SETTINGS_FILE_NAME = "settings.gradle";

    private GradleSettingsFiles() {
    }

    /**
     * Creates a settings file with the given content.
     *
     * @param projectDirectory Project directory.
     * @param subProjectNames Names of sub-projects.
     */
    public static void createSettingsFile(@Nonnull final Path projectDirectory, @Nonnull final String rootProjectName,
        @Nonnull final String... subProjectNames) throws IOException {
        final Path settingsFilePath = projectDirectory.resolve(SETTINGS_FILE_NAME);
        try (final Writer settingsFileWriter = Files.newBufferedWriter(settingsFilePath)) {
            settingsFileWriter.append("rootProject.name = '");
            settingsFileWriter.append(rootProjectName);
            settingsFileWriter.append("'\n");
            if (subProjectNames.length > 0) {
                settingsFileWriter.append("include '");
                settingsFileWriter.append(String.join("', '", subProjectNames));
                settingsFileWriter.append('\'');
            }
        }
    }
}
