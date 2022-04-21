// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProjectBuildBatchConfigRestrictionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProjectBuildBatchConfigRestrictionsArgs Empty = new ProjectBuildBatchConfigRestrictionsArgs();

    /**
     * An array of strings that specify the compute types that are allowed for the batch build. See [Build environment compute types](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-compute-types.html) in the AWS CodeBuild User Guide for these values.
     * 
     */
    @Import(name="computeTypesAlloweds")
    private @Nullable Output<List<String>> computeTypesAlloweds;

    public Optional<Output<List<String>>> computeTypesAlloweds() {
        return Optional.ofNullable(this.computeTypesAlloweds);
    }

    /**
     * Specifies the maximum number of builds allowed.
     * 
     */
    @Import(name="maximumBuildsAllowed")
    private @Nullable Output<Integer> maximumBuildsAllowed;

    public Optional<Output<Integer>> maximumBuildsAllowed() {
        return Optional.ofNullable(this.maximumBuildsAllowed);
    }

    private ProjectBuildBatchConfigRestrictionsArgs() {}

    private ProjectBuildBatchConfigRestrictionsArgs(ProjectBuildBatchConfigRestrictionsArgs $) {
        this.computeTypesAlloweds = $.computeTypesAlloweds;
        this.maximumBuildsAllowed = $.maximumBuildsAllowed;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProjectBuildBatchConfigRestrictionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProjectBuildBatchConfigRestrictionsArgs $;

        public Builder() {
            $ = new ProjectBuildBatchConfigRestrictionsArgs();
        }

        public Builder(ProjectBuildBatchConfigRestrictionsArgs defaults) {
            $ = new ProjectBuildBatchConfigRestrictionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder computeTypesAlloweds(@Nullable Output<List<String>> computeTypesAlloweds) {
            $.computeTypesAlloweds = computeTypesAlloweds;
            return this;
        }

        public Builder computeTypesAlloweds(List<String> computeTypesAlloweds) {
            return computeTypesAlloweds(Output.of(computeTypesAlloweds));
        }

        public Builder computeTypesAlloweds(String... computeTypesAlloweds) {
            return computeTypesAlloweds(List.of(computeTypesAlloweds));
        }

        public Builder maximumBuildsAllowed(@Nullable Output<Integer> maximumBuildsAllowed) {
            $.maximumBuildsAllowed = maximumBuildsAllowed;
            return this;
        }

        public Builder maximumBuildsAllowed(Integer maximumBuildsAllowed) {
            return maximumBuildsAllowed(Output.of(maximumBuildsAllowed));
        }

        public ProjectBuildBatchConfigRestrictionsArgs build() {
            return $;
        }
    }

}
