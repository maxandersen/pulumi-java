// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecr;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PullThroughCacheRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final PullThroughCacheRuleArgs Empty = new PullThroughCacheRuleArgs();

    /**
     * The repository name prefix to use when caching images from the source registry.
     * 
     */
    @Import(name="ecrRepositoryPrefix", required=true)
    private Output<String> ecrRepositoryPrefix;

    public Output<String> ecrRepositoryPrefix() {
        return this.ecrRepositoryPrefix;
    }

    /**
     * The registry URL of the upstream public registry to use as the source.
     * 
     */
    @Import(name="upstreamRegistryUrl", required=true)
    private Output<String> upstreamRegistryUrl;

    public Output<String> upstreamRegistryUrl() {
        return this.upstreamRegistryUrl;
    }

    private PullThroughCacheRuleArgs() {}

    private PullThroughCacheRuleArgs(PullThroughCacheRuleArgs $) {
        this.ecrRepositoryPrefix = $.ecrRepositoryPrefix;
        this.upstreamRegistryUrl = $.upstreamRegistryUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PullThroughCacheRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PullThroughCacheRuleArgs $;

        public Builder() {
            $ = new PullThroughCacheRuleArgs();
        }

        public Builder(PullThroughCacheRuleArgs defaults) {
            $ = new PullThroughCacheRuleArgs(Objects.requireNonNull(defaults));
        }

        public Builder ecrRepositoryPrefix(Output<String> ecrRepositoryPrefix) {
            $.ecrRepositoryPrefix = ecrRepositoryPrefix;
            return this;
        }

        public Builder ecrRepositoryPrefix(String ecrRepositoryPrefix) {
            return ecrRepositoryPrefix(Output.of(ecrRepositoryPrefix));
        }

        public Builder upstreamRegistryUrl(Output<String> upstreamRegistryUrl) {
            $.upstreamRegistryUrl = upstreamRegistryUrl;
            return this;
        }

        public Builder upstreamRegistryUrl(String upstreamRegistryUrl) {
            return upstreamRegistryUrl(Output.of(upstreamRegistryUrl));
        }

        public PullThroughCacheRuleArgs build() {
            $.ecrRepositoryPrefix = Objects.requireNonNull($.ecrRepositoryPrefix, "expected parameter 'ecrRepositoryPrefix' to be non-null");
            $.upstreamRegistryUrl = Objects.requireNonNull($.upstreamRegistryUrl, "expected parameter 'upstreamRegistryUrl' to be non-null");
            return $;
        }
    }

}
