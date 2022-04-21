// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A configuration for running an Apache SparkR (https://spark.apache.org/docs/latest/sparkr.html) batch workload.
 * 
 */
public final class SparkRBatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final SparkRBatchArgs Empty = new SparkRBatchArgs();

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @Import(name="archiveUris")
    private @Nullable Output<List<String>> archiveUris;

    public Optional<Output<List<String>>> archiveUris() {
        return Optional.ofNullable(this.archiveUris);
    }

    /**
     * Optional. The arguments to pass to the Spark driver. Do not include arguments that can be set as batch properties, such as --conf, since a collision can occur that causes an incorrect batch submission.
     * 
     */
    @Import(name="args")
    private @Nullable Output<List<String>> args;

    public Optional<Output<List<String>>> args() {
        return Optional.ofNullable(this.args);
    }

    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor.
     * 
     */
    @Import(name="fileUris")
    private @Nullable Output<List<String>> fileUris;

    public Optional<Output<List<String>>> fileUris() {
        return Optional.ofNullable(this.fileUris);
    }

    /**
     * The HCFS URI of the main R file to use as the driver. Must be a .R or .r file.
     * 
     */
    @Import(name="mainRFileUri", required=true)
    private Output<String> mainRFileUri;

    public Output<String> mainRFileUri() {
        return this.mainRFileUri;
    }

    private SparkRBatchArgs() {}

    private SparkRBatchArgs(SparkRBatchArgs $) {
        this.archiveUris = $.archiveUris;
        this.args = $.args;
        this.fileUris = $.fileUris;
        this.mainRFileUri = $.mainRFileUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SparkRBatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SparkRBatchArgs $;

        public Builder() {
            $ = new SparkRBatchArgs();
        }

        public Builder(SparkRBatchArgs defaults) {
            $ = new SparkRBatchArgs(Objects.requireNonNull(defaults));
        }

        public Builder archiveUris(@Nullable Output<List<String>> archiveUris) {
            $.archiveUris = archiveUris;
            return this;
        }

        public Builder archiveUris(List<String> archiveUris) {
            return archiveUris(Output.of(archiveUris));
        }

        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }

        public Builder args(@Nullable Output<List<String>> args) {
            $.args = args;
            return this;
        }

        public Builder args(List<String> args) {
            return args(Output.of(args));
        }

        public Builder args(String... args) {
            return args(List.of(args));
        }

        public Builder fileUris(@Nullable Output<List<String>> fileUris) {
            $.fileUris = fileUris;
            return this;
        }

        public Builder fileUris(List<String> fileUris) {
            return fileUris(Output.of(fileUris));
        }

        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }

        public Builder mainRFileUri(Output<String> mainRFileUri) {
            $.mainRFileUri = mainRFileUri;
            return this;
        }

        public Builder mainRFileUri(String mainRFileUri) {
            return mainRFileUri(Output.of(mainRFileUri));
        }

        public SparkRBatchArgs build() {
            $.mainRFileUri = Objects.requireNonNull($.mainRFileUri, "expected parameter 'mainRFileUri' to be non-null");
            return $;
        }
    }

}
