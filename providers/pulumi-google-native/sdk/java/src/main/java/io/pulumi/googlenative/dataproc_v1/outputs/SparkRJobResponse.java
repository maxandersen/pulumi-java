// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1.outputs.LoggingConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class SparkRJobResponse {
    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    private final List<String> archiveUris;
    /**
     * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    private final List<String> args;
    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    private final List<String> fileUris;
    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    private final LoggingConfigResponse loggingConfig;
    /**
     * The HCFS URI of the main R file to use as the driver. Must be a .R file.
     * 
     */
    private final String mainRFileUri;
    /**
     * Optional. A mapping of property names to values, used to configure SparkR. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
     * 
     */
    private final Map<String,String> properties;

    @OutputCustomType.Constructor
    private SparkRJobResponse(
        @OutputCustomType.Parameter("archiveUris") List<String> archiveUris,
        @OutputCustomType.Parameter("args") List<String> args,
        @OutputCustomType.Parameter("fileUris") List<String> fileUris,
        @OutputCustomType.Parameter("loggingConfig") LoggingConfigResponse loggingConfig,
        @OutputCustomType.Parameter("mainRFileUri") String mainRFileUri,
        @OutputCustomType.Parameter("properties") Map<String,String> properties) {
        this.archiveUris = archiveUris;
        this.args = args;
        this.fileUris = fileUris;
        this.loggingConfig = loggingConfig;
        this.mainRFileUri = mainRFileUri;
        this.properties = properties;
    }

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
    */
    public List<String> getArchiveUris() {
        return this.archiveUris;
    }
    /**
     * Optional. The arguments to pass to the driver. Do not include arguments, such as --conf, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
    */
    public List<String> getArgs() {
        return this.args;
    }
    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
    */
    public List<String> getFileUris() {
        return this.fileUris;
    }
    /**
     * Optional. The runtime log config for job execution.
     * 
    */
    public LoggingConfigResponse getLoggingConfig() {
        return this.loggingConfig;
    }
    /**
     * The HCFS URI of the main R file to use as the driver. Must be a .R file.
     * 
    */
    public String getMainRFileUri() {
        return this.mainRFileUri;
    }
    /**
     * Optional. A mapping of property names to values, used to configure SparkR. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
     * 
    */
    public Map<String,String> getProperties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkRJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> archiveUris;
        private List<String> args;
        private List<String> fileUris;
        private LoggingConfigResponse loggingConfig;
        private String mainRFileUri;
        private Map<String,String> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkRJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.mainRFileUri = defaults.mainRFileUri;
    	      this.properties = defaults.properties;
        }

        public Builder setArchiveUris(List<String> archiveUris) {
            this.archiveUris = Objects.requireNonNull(archiveUris);
            return this;
        }

        public Builder setArgs(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder setFileUris(List<String> fileUris) {
            this.fileUris = Objects.requireNonNull(fileUris);
            return this;
        }

        public Builder setLoggingConfig(LoggingConfigResponse loggingConfig) {
            this.loggingConfig = Objects.requireNonNull(loggingConfig);
            return this;
        }

        public Builder setMainRFileUri(String mainRFileUri) {
            this.mainRFileUri = Objects.requireNonNull(mainRFileUri);
            return this;
        }

        public Builder setProperties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public SparkRJobResponse build() {
            return new SparkRJobResponse(archiveUris, args, fileUris, loggingConfig, mainRFileUri, properties);
        }
    }
}
