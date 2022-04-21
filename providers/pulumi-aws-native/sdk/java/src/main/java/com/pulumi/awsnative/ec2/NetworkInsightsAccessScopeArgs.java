// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2;

import com.pulumi.awsnative.ec2.inputs.NetworkInsightsAccessScopeAccessScopePathRequestArgs;
import com.pulumi.awsnative.ec2.inputs.NetworkInsightsAccessScopeTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NetworkInsightsAccessScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsAccessScopeArgs Empty = new NetworkInsightsAccessScopeArgs();

    @Import(name="excludePaths")
    private @Nullable Output<List<NetworkInsightsAccessScopeAccessScopePathRequestArgs>> excludePaths;

    public Optional<Output<List<NetworkInsightsAccessScopeAccessScopePathRequestArgs>>> excludePaths() {
        return Optional.ofNullable(this.excludePaths);
    }

    @Import(name="matchPaths")
    private @Nullable Output<List<NetworkInsightsAccessScopeAccessScopePathRequestArgs>> matchPaths;

    public Optional<Output<List<NetworkInsightsAccessScopeAccessScopePathRequestArgs>>> matchPaths() {
        return Optional.ofNullable(this.matchPaths);
    }

    @Import(name="tags")
    private @Nullable Output<List<NetworkInsightsAccessScopeTagArgs>> tags;

    public Optional<Output<List<NetworkInsightsAccessScopeTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private NetworkInsightsAccessScopeArgs() {}

    private NetworkInsightsAccessScopeArgs(NetworkInsightsAccessScopeArgs $) {
        this.excludePaths = $.excludePaths;
        this.matchPaths = $.matchPaths;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NetworkInsightsAccessScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NetworkInsightsAccessScopeArgs $;

        public Builder() {
            $ = new NetworkInsightsAccessScopeArgs();
        }

        public Builder(NetworkInsightsAccessScopeArgs defaults) {
            $ = new NetworkInsightsAccessScopeArgs(Objects.requireNonNull(defaults));
        }

        public Builder excludePaths(@Nullable Output<List<NetworkInsightsAccessScopeAccessScopePathRequestArgs>> excludePaths) {
            $.excludePaths = excludePaths;
            return this;
        }

        public Builder excludePaths(List<NetworkInsightsAccessScopeAccessScopePathRequestArgs> excludePaths) {
            return excludePaths(Output.of(excludePaths));
        }

        public Builder excludePaths(NetworkInsightsAccessScopeAccessScopePathRequestArgs... excludePaths) {
            return excludePaths(List.of(excludePaths));
        }

        public Builder matchPaths(@Nullable Output<List<NetworkInsightsAccessScopeAccessScopePathRequestArgs>> matchPaths) {
            $.matchPaths = matchPaths;
            return this;
        }

        public Builder matchPaths(List<NetworkInsightsAccessScopeAccessScopePathRequestArgs> matchPaths) {
            return matchPaths(Output.of(matchPaths));
        }

        public Builder matchPaths(NetworkInsightsAccessScopeAccessScopePathRequestArgs... matchPaths) {
            return matchPaths(List.of(matchPaths));
        }

        public Builder tags(@Nullable Output<List<NetworkInsightsAccessScopeTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<NetworkInsightsAccessScopeTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(NetworkInsightsAccessScopeTagArgs... tags) {
            return tags(List.of(tags));
        }

        public NetworkInsightsAccessScopeArgs build() {
            return $;
        }
    }

}
