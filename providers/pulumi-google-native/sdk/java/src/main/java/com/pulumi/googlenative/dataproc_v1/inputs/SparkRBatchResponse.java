// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A configuration for running an Apache SparkR (https://spark.apache.org/docs/latest/sparkr.html) batch workload.
 * 
 */
public final class SparkRBatchResponse extends com.pulumi.resources.InvokeArgs {

    public static final SparkRBatchResponse Empty = new SparkRBatchResponse();

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @Import(name="archiveUris", required=true)
      private final List<String> archiveUris;

    public List<String> archiveUris() {
        return this.archiveUris;
    }

    /**
     * Optional. The arguments to pass to the Spark driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
     * 
     */
    @Import(name="args", required=true)
      private final List<String> args;

    public List<String> args() {
        return this.args;
    }

    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor.
     * 
     */
    @Import(name="fileUris", required=true)
      private final List<String> fileUris;

    public List<String> fileUris() {
        return this.fileUris;
    }

    /**
     * The HCFS URI of the main R file to use as the driver. Must be a .R or .r file.
     * 
     */
    @Import(name="mainRFileUri", required=true)
      private final String mainRFileUri;

    public String mainRFileUri() {
        return this.mainRFileUri;
    }

    public SparkRBatchResponse(
        List<String> archiveUris,
        List<String> args,
        List<String> fileUris,
        String mainRFileUri) {
        this.archiveUris = Objects.requireNonNull(archiveUris, "expected parameter 'archiveUris' to be non-null");
        this.args = Objects.requireNonNull(args, "expected parameter 'args' to be non-null");
        this.fileUris = Objects.requireNonNull(fileUris, "expected parameter 'fileUris' to be non-null");
        this.mainRFileUri = Objects.requireNonNull(mainRFileUri, "expected parameter 'mainRFileUri' to be non-null");
    }

    private SparkRBatchResponse() {
        this.archiveUris = List.of();
        this.args = List.of();
        this.fileUris = List.of();
        this.mainRFileUri = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkRBatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> archiveUris;
        private List<String> args;
        private List<String> fileUris;
        private String mainRFileUri;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkRBatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.mainRFileUri = defaults.mainRFileUri;
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
        public Builder mainRFileUri(String mainRFileUri) {
            this.mainRFileUri = Objects.requireNonNull(mainRFileUri);
            return this;
        }        public SparkRBatchResponse build() {
            return new SparkRBatchResponse(archiveUris, args, fileUris, mainRFileUri);
        }
    }
}
