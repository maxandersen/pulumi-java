// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UsageExportBucketArgs extends com.pulumi.resources.ResourceArgs {

    public static final UsageExportBucketArgs Empty = new UsageExportBucketArgs();

    /**
     * The bucket to store reports in.
     * 
     */
    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName;
    }

    /**
     * A prefix for the reports, for instance, the project name.
     * 
     */
    @Import(name="prefix")
    private @Nullable Output<String> prefix;

    public Optional<Output<String>> prefix() {
        return Optional.ofNullable(this.prefix);
    }

    /**
     * The project to set the export bucket on. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private UsageExportBucketArgs() {}

    private UsageExportBucketArgs(UsageExportBucketArgs $) {
        this.bucketName = $.bucketName;
        this.prefix = $.prefix;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UsageExportBucketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UsageExportBucketArgs $;

        public Builder() {
            $ = new UsageExportBucketArgs();
        }

        public Builder(UsageExportBucketArgs defaults) {
            $ = new UsageExportBucketArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            $.prefix = prefix;
            return this;
        }

        public Builder prefix(String prefix) {
            return prefix(Output.of(prefix));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public UsageExportBucketArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            return $;
        }
    }

}
