// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetComputeEnvironmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetComputeEnvironmentArgs Empty = new GetComputeEnvironmentArgs();

    /**
     * The name of the Batch Compute Environment
     * 
     */
    @Import(name="computeEnvironmentName", required=true)
    private String computeEnvironmentName;

    public String computeEnvironmentName() {
        return this.computeEnvironmentName;
    }

    /**
     * Key-value map of resource tags
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetComputeEnvironmentArgs() {}

    private GetComputeEnvironmentArgs(GetComputeEnvironmentArgs $) {
        this.computeEnvironmentName = $.computeEnvironmentName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetComputeEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetComputeEnvironmentArgs $;

        public Builder() {
            $ = new GetComputeEnvironmentArgs();
        }

        public Builder(GetComputeEnvironmentArgs defaults) {
            $ = new GetComputeEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder computeEnvironmentName(String computeEnvironmentName) {
            $.computeEnvironmentName = computeEnvironmentName;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetComputeEnvironmentArgs build() {
            $.computeEnvironmentName = Objects.requireNonNull($.computeEnvironmentName, "expected parameter 'computeEnvironmentName' to be non-null");
            return $;
        }
    }

}
