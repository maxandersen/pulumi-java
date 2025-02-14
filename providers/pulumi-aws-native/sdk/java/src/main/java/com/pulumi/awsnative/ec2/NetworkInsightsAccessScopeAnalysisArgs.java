// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.ec2.inputs.NetworkInsightsAccessScopeAnalysisTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsAccessScopeAnalysisArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsAccessScopeAnalysisArgs Empty = new NetworkInsightsAccessScopeAnalysisArgs();

    @Import(name="networkInsightsAccessScopeId", required=true)
    private Output<String> networkInsightsAccessScopeId;

    public Output<String> networkInsightsAccessScopeId() {
        return this.networkInsightsAccessScopeId;
    }

    @Import(name="tags")
    private @Nullable Output<List<NetworkInsightsAccessScopeAnalysisTagArgs>> tags;

    public Optional<Output<List<NetworkInsightsAccessScopeAnalysisTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private NetworkInsightsAccessScopeAnalysisArgs() {}

    private NetworkInsightsAccessScopeAnalysisArgs(NetworkInsightsAccessScopeAnalysisArgs $) {
        this.networkInsightsAccessScopeId = $.networkInsightsAccessScopeId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInsightsAccessScopeAnalysisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInsightsAccessScopeAnalysisArgs $;

        public Builder() {
            $ = new NetworkInsightsAccessScopeAnalysisArgs();
        }

        public Builder(NetworkInsightsAccessScopeAnalysisArgs defaults) {
            $ = new NetworkInsightsAccessScopeAnalysisArgs(Objects.requireNonNull(defaults));
        }

        public Builder networkInsightsAccessScopeId(Output<String> networkInsightsAccessScopeId) {
            $.networkInsightsAccessScopeId = networkInsightsAccessScopeId;
            return this;
        }

        public Builder networkInsightsAccessScopeId(String networkInsightsAccessScopeId) {
            return networkInsightsAccessScopeId(Output.of(networkInsightsAccessScopeId));
        }

        public Builder tags(@Nullable Output<List<NetworkInsightsAccessScopeAnalysisTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<NetworkInsightsAccessScopeAnalysisTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(NetworkInsightsAccessScopeAnalysisTagArgs... tags) {
            return tags(List.of(tags));
        }

        public NetworkInsightsAccessScopeAnalysisArgs build() {
            $.networkInsightsAccessScopeId = Objects.requireNonNull($.networkInsightsAccessScopeId, "expected parameter 'networkInsightsAccessScopeId' to be non-null");
            return $;
        }
    }

}
