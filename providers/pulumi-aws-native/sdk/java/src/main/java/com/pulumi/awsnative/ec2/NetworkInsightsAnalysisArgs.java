// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.ec2.inputs.NetworkInsightsAnalysisTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsAnalysisArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsAnalysisArgs Empty = new NetworkInsightsAnalysisArgs();

    @Import(name="filterInArns")
    private @Nullable Output<List<String>> filterInArns;

    public Optional<Output<List<String>>> filterInArns() {
        return Optional.ofNullable(this.filterInArns);
    }

    @Import(name="networkInsightsPathId", required=true)
    private Output<String> networkInsightsPathId;

    public Output<String> networkInsightsPathId() {
        return this.networkInsightsPathId;
    }

    @Import(name="tags")
    private @Nullable Output<List<NetworkInsightsAnalysisTagArgs>> tags;

    public Optional<Output<List<NetworkInsightsAnalysisTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private NetworkInsightsAnalysisArgs() {}

    private NetworkInsightsAnalysisArgs(NetworkInsightsAnalysisArgs $) {
        this.filterInArns = $.filterInArns;
        this.networkInsightsPathId = $.networkInsightsPathId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInsightsAnalysisArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInsightsAnalysisArgs $;

        public Builder() {
            $ = new NetworkInsightsAnalysisArgs();
        }

        public Builder(NetworkInsightsAnalysisArgs defaults) {
            $ = new NetworkInsightsAnalysisArgs(Objects.requireNonNull(defaults));
        }

        public Builder filterInArns(@Nullable Output<List<String>> filterInArns) {
            $.filterInArns = filterInArns;
            return this;
        }

        public Builder filterInArns(List<String> filterInArns) {
            return filterInArns(Output.of(filterInArns));
        }

        public Builder filterInArns(String... filterInArns) {
            return filterInArns(List.of(filterInArns));
        }

        public Builder networkInsightsPathId(Output<String> networkInsightsPathId) {
            $.networkInsightsPathId = networkInsightsPathId;
            return this;
        }

        public Builder networkInsightsPathId(String networkInsightsPathId) {
            return networkInsightsPathId(Output.of(networkInsightsPathId));
        }

        public Builder tags(@Nullable Output<List<NetworkInsightsAnalysisTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<NetworkInsightsAnalysisTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(NetworkInsightsAnalysisTagArgs... tags) {
            return tags(List.of(tags));
        }

        public NetworkInsightsAnalysisArgs build() {
            $.networkInsightsPathId = Objects.requireNonNull($.networkInsightsPathId, "expected parameter 'networkInsightsPathId' to be non-null");
            return $;
        }
    }

}
