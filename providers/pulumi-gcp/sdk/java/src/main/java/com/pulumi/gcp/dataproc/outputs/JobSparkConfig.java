// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataproc.outputs.JobSparkConfigLoggingConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobSparkConfig {
    /**
     * HCFS URIs of archives to be extracted in the working directory of .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    private final @Nullable List<String> archiveUris;
    /**
     * The arguments to pass to the driver. Do not include arguments, such as -libjars or -Dfoo=bar, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    private final @Nullable List<String> args;
    /**
     * HCFS URIs of files to be copied to the working directory of Hadoop drivers and distributed tasks. Useful for naively parallel tasks.
     * 
     */
    private final @Nullable List<String> fileUris;
    /**
     * HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    private final @Nullable List<String> jarFileUris;
    private final @Nullable JobSparkConfigLoggingConfig loggingConfig;
    /**
     * The name of the driver&#39;s main class. The jar file containing the class must be in the default CLASSPATH or specified in `jar_file_uris`. Conflicts with `main_jar_file_uri`
     * 
     */
    private final @Nullable String mainClass;
    /**
     * The HCFS URI of the jar file containing the main class. Examples: &#39;gs://foo-bucket/analytics-binaries/extract-useful-metrics-mr.jar&#39; &#39;hdfs:/tmp/test-samples/custom-wordcount.jar&#39; &#39;file:///home/usr/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar&#39;. Conflicts with `main_class`
     * 
     */
    private final @Nullable String mainJarFileUri;
    /**
     * A mapping of property names to values, used to configure Spark SQL&#39;s SparkConf. Properties that conflict with values set by the Cloud Dataproc API may be overwritten.
     * 
     */
    private final @Nullable Map<String,String> properties;

    @CustomType.Constructor
    private JobSparkConfig(
        @CustomType.Parameter("archiveUris") @Nullable List<String> archiveUris,
        @CustomType.Parameter("args") @Nullable List<String> args,
        @CustomType.Parameter("fileUris") @Nullable List<String> fileUris,
        @CustomType.Parameter("jarFileUris") @Nullable List<String> jarFileUris,
        @CustomType.Parameter("loggingConfig") @Nullable JobSparkConfigLoggingConfig loggingConfig,
        @CustomType.Parameter("mainClass") @Nullable String mainClass,
        @CustomType.Parameter("mainJarFileUri") @Nullable String mainJarFileUri,
        @CustomType.Parameter("properties") @Nullable Map<String,String> properties) {
        this.archiveUris = archiveUris;
        this.args = args;
        this.fileUris = fileUris;
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.mainClass = mainClass;
        this.mainJarFileUri = mainJarFileUri;
        this.properties = properties;
    }

    /**
     * HCFS URIs of archives to be extracted in the working directory of .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
    */
    public List<String> archiveUris() {
        return this.archiveUris == null ? List.of() : this.archiveUris;
    }
    /**
     * The arguments to pass to the driver. Do not include arguments, such as -libjars or -Dfoo=bar, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
    */
    public List<String> args() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * HCFS URIs of files to be copied to the working directory of Hadoop drivers and distributed tasks. Useful for naively parallel tasks.
     * 
    */
    public List<String> fileUris() {
        return this.fileUris == null ? List.of() : this.fileUris;
    }
    /**
     * HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
    */
    public List<String> jarFileUris() {
        return this.jarFileUris == null ? List.of() : this.jarFileUris;
    }
    public Optional<JobSparkConfigLoggingConfig> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }
    /**
     * The name of the driver&#39;s main class. The jar file containing the class must be in the default CLASSPATH or specified in `jar_file_uris`. Conflicts with `main_jar_file_uri`
     * 
    */
    public Optional<String> mainClass() {
        return Optional.ofNullable(this.mainClass);
    }
    /**
     * The HCFS URI of the jar file containing the main class. Examples: &#39;gs://foo-bucket/analytics-binaries/extract-useful-metrics-mr.jar&#39; &#39;hdfs:/tmp/test-samples/custom-wordcount.jar&#39; &#39;file:///home/usr/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar&#39;. Conflicts with `main_class`
     * 
    */
    public Optional<String> mainJarFileUri() {
        return Optional.ofNullable(this.mainJarFileUri);
    }
    /**
     * A mapping of property names to values, used to configure Spark SQL&#39;s SparkConf. Properties that conflict with values set by the Cloud Dataproc API may be overwritten.
     * 
    */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSparkConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> archiveUris;
        private @Nullable List<String> args;
        private @Nullable List<String> fileUris;
        private @Nullable List<String> jarFileUris;
        private @Nullable JobSparkConfigLoggingConfig loggingConfig;
        private @Nullable String mainClass;
        private @Nullable String mainJarFileUri;
        private @Nullable Map<String,String> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSparkConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.mainClass = defaults.mainClass;
    	      this.mainJarFileUri = defaults.mainJarFileUri;
    	      this.properties = defaults.properties;
        }

        public Builder archiveUris(@Nullable List<String> archiveUris) {
            this.archiveUris = archiveUris;
            return this;
        }
        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }
        public Builder args(@Nullable List<String> args) {
            this.args = args;
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder fileUris(@Nullable List<String> fileUris) {
            this.fileUris = fileUris;
            return this;
        }
        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }
        public Builder jarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }
        public Builder loggingConfig(@Nullable JobSparkConfigLoggingConfig loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }
        public Builder mainClass(@Nullable String mainClass) {
            this.mainClass = mainClass;
            return this;
        }
        public Builder mainJarFileUri(@Nullable String mainJarFileUri) {
            this.mainJarFileUri = mainJarFileUri;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }        public JobSparkConfig build() {
            return new JobSparkConfig(archiveUris, args, fileUris, jarFileUris, loggingConfig, mainClass, mainJarFileUri, properties);
        }
    }
}
