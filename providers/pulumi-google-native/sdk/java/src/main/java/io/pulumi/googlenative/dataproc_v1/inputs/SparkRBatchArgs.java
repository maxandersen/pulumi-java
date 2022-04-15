// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A configuration for running an Apache SparkR (https://spark.apache.org/docs/latest/sparkr.html) batch workload.
 * 
 */
public final class SparkRBatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final SparkRBatchArgs Empty = new SparkRBatchArgs();

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @Import(name="archiveUris")
      private final @Nullable Output<List<String>> archiveUris;

    public Output<List<String>> archiveUris() {
        return this.archiveUris == null ? Codegen.empty() : this.archiveUris;
    }

    /**
     * Optional. The arguments to pass to the Spark driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
     * 
     */
    @Import(name="args")
      private final @Nullable Output<List<String>> args;

    public Output<List<String>> args() {
        return this.args == null ? Codegen.empty() : this.args;
    }

    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor.
     * 
     */
    @Import(name="fileUris")
      private final @Nullable Output<List<String>> fileUris;

    public Output<List<String>> fileUris() {
        return this.fileUris == null ? Codegen.empty() : this.fileUris;
    }

    /**
     * The HCFS URI of the main R file to use as the driver. Must be a .R or .r file.
     * 
     */
    @Import(name="mainRFileUri", required=true)
      private final Output<String> mainRFileUri;

    public Output<String> mainRFileUri() {
        return this.mainRFileUri;
    }

    public SparkRBatchArgs(
        @Nullable Output<List<String>> archiveUris,
        @Nullable Output<List<String>> args,
        @Nullable Output<List<String>> fileUris,
        Output<String> mainRFileUri) {
        this.archiveUris = archiveUris;
        this.args = args;
        this.fileUris = fileUris;
        this.mainRFileUri = Objects.requireNonNull(mainRFileUri, "expected parameter 'mainRFileUri' to be non-null");
    }

    private SparkRBatchArgs() {
        this.archiveUris = Codegen.empty();
        this.args = Codegen.empty();
        this.fileUris = Codegen.empty();
        this.mainRFileUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SparkRBatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> archiveUris;
        private @Nullable Output<List<String>> args;
        private @Nullable Output<List<String>> fileUris;
        private Output<String> mainRFileUri;

        public Builder() {
    	      // Empty
        }

        public Builder(SparkRBatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.mainRFileUri = defaults.mainRFileUri;
        }

        public Builder archiveUris(@Nullable Output<List<String>> archiveUris) {
            this.archiveUris = archiveUris;
            return this;
        }
        public Builder archiveUris(@Nullable List<String> archiveUris) {
            this.archiveUris = Codegen.ofNullable(archiveUris);
            return this;
        }
        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }
        public Builder args(@Nullable Output<List<String>> args) {
            this.args = args;
            return this;
        }
        public Builder args(@Nullable List<String> args) {
            this.args = Codegen.ofNullable(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder fileUris(@Nullable Output<List<String>> fileUris) {
            this.fileUris = fileUris;
            return this;
        }
        public Builder fileUris(@Nullable List<String> fileUris) {
            this.fileUris = Codegen.ofNullable(fileUris);
            return this;
        }
        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }
        public Builder mainRFileUri(Output<String> mainRFileUri) {
            this.mainRFileUri = Objects.requireNonNull(mainRFileUri);
            return this;
        }
        public Builder mainRFileUri(String mainRFileUri) {
            this.mainRFileUri = Output.of(Objects.requireNonNull(mainRFileUri));
            return this;
        }        public SparkRBatchArgs build() {
            return new SparkRBatchArgs(archiveUris, args, fileUris, mainRFileUri);
        }
    }
}
