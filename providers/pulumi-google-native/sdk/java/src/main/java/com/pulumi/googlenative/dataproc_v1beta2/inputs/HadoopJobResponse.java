// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.LoggingConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * A Dataproc job for running Apache Hadoop MapReduce (https://hadoop.apache.org/docs/current/hadoop-mapreduce-client/hadoop-mapreduce-client-core/MapReduceTutorial.html) jobs on Apache Hadoop YARN (https://hadoop.apache.org/docs/r2.7.1/hadoop-yarn/hadoop-yarn-site/YARN.html).
 * 
 */
public final class HadoopJobResponse extends com.pulumi.resources.InvokeArgs {

    public static final HadoopJobResponse Empty = new HadoopJobResponse();

    /**
     * Optional. HCFS URIs of archives to be extracted in the working directory of Hadoop drivers and tasks. Supported file types: .jar, .tar, .tar.gz, .tgz, or .zip.
     * 
     */
    @Import(name="archiveUris", required=true)
      private final List<String> archiveUris;

    public List<String> archiveUris() {
        return this.archiveUris;
    }

    /**
     * Optional. The arguments to pass to the driver. Do not include arguments, such as -libjars or -Dfoo=bar, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    @Import(name="args", required=true)
      private final List<String> args;

    public List<String> args() {
        return this.args;
    }

    /**
     * Optional. HCFS (Hadoop Compatible Filesystem) URIs of files to be copied to the working directory of Hadoop drivers and distributed tasks. Useful for naively parallel tasks.
     * 
     */
    @Import(name="fileUris", required=true)
      private final List<String> fileUris;

    public List<String> fileUris() {
        return this.fileUris;
    }

    /**
     * Optional. Jar file URIs to add to the CLASSPATHs of the Hadoop driver and tasks.
     * 
     */
    @Import(name="jarFileUris", required=true)
      private final List<String> jarFileUris;

    public List<String> jarFileUris() {
        return this.jarFileUris;
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig", required=true)
      private final LoggingConfigResponse loggingConfig;

    public LoggingConfigResponse loggingConfig() {
        return this.loggingConfig;
    }

    /**
     * The name of the driver&#39;s main class. The jar file containing the class must be in the default CLASSPATH or specified in jar_file_uris.
     * 
     */
    @Import(name="mainClass", required=true)
      private final String mainClass;

    public String mainClass() {
        return this.mainClass;
    }

    /**
     * The HCFS URI of the jar file containing the main class. Examples: &#39;gs://foo-bucket/analytics-binaries/extract-useful-metrics-mr.jar&#39; &#39;hdfs:/tmp/test-samples/custom-wordcount.jar&#39; &#39;file:///home/usr/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar&#39;
     * 
     */
    @Import(name="mainJarFileUri", required=true)
      private final String mainJarFileUri;

    public String mainJarFileUri() {
        return this.mainJarFileUri;
    }

    /**
     * Optional. A mapping of property names to values, used to configure Hadoop. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/hadoop/conf/*-site and classes in user code.
     * 
     */
    @Import(name="properties", required=true)
      private final Map<String,String> properties;

    public Map<String,String> properties() {
        return this.properties;
    }

    public HadoopJobResponse(
        List<String> archiveUris,
        List<String> args,
        List<String> fileUris,
        List<String> jarFileUris,
        LoggingConfigResponse loggingConfig,
        String mainClass,
        String mainJarFileUri,
        Map<String,String> properties) {
        this.archiveUris = Objects.requireNonNull(archiveUris, "expected parameter 'archiveUris' to be non-null");
        this.args = Objects.requireNonNull(args, "expected parameter 'args' to be non-null");
        this.fileUris = Objects.requireNonNull(fileUris, "expected parameter 'fileUris' to be non-null");
        this.jarFileUris = Objects.requireNonNull(jarFileUris, "expected parameter 'jarFileUris' to be non-null");
        this.loggingConfig = Objects.requireNonNull(loggingConfig, "expected parameter 'loggingConfig' to be non-null");
        this.mainClass = Objects.requireNonNull(mainClass, "expected parameter 'mainClass' to be non-null");
        this.mainJarFileUri = Objects.requireNonNull(mainJarFileUri, "expected parameter 'mainJarFileUri' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
    }

    private HadoopJobResponse() {
        this.archiveUris = List.of();
        this.args = List.of();
        this.fileUris = List.of();
        this.jarFileUris = List.of();
        this.loggingConfig = null;
        this.mainClass = null;
        this.mainJarFileUri = null;
        this.properties = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HadoopJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> archiveUris;
        private List<String> args;
        private List<String> fileUris;
        private List<String> jarFileUris;
        private LoggingConfigResponse loggingConfig;
        private String mainClass;
        private String mainJarFileUri;
        private Map<String,String> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(HadoopJobResponse defaults) {
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

        public Builder archiveUris(List<String> archiveUris) {
            this.archiveUris = Objects.requireNonNull(archiveUris);
            return this;
        }
        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }
        public Builder args(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder fileUris(List<String> fileUris) {
            this.fileUris = Objects.requireNonNull(fileUris);
            return this;
        }
        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }
        public Builder jarFileUris(List<String> jarFileUris) {
            this.jarFileUris = Objects.requireNonNull(jarFileUris);
            return this;
        }
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }
        public Builder loggingConfig(LoggingConfigResponse loggingConfig) {
            this.loggingConfig = Objects.requireNonNull(loggingConfig);
            return this;
        }
        public Builder mainClass(String mainClass) {
            this.mainClass = Objects.requireNonNull(mainClass);
            return this;
        }
        public Builder mainJarFileUri(String mainJarFileUri) {
            this.mainJarFileUri = Objects.requireNonNull(mainJarFileUri);
            return this;
        }
        public Builder properties(Map<String,String> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }        public HadoopJobResponse build() {
            return new HadoopJobResponse(archiveUris, args, fileUris, jarFileUris, loggingConfig, mainClass, mainJarFileUri, properties);
        }
    }
}
