// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for NodeLocal DNSCache
 * 
 */
public final class DnsCacheConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DnsCacheConfigArgs Empty = new DnsCacheConfigArgs();

    /**
     * Whether NodeLocal DNSCache is enabled for this cluster.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private DnsCacheConfigArgs() {}

    private DnsCacheConfigArgs(DnsCacheConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DnsCacheConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DnsCacheConfigArgs $;

        public Builder() {
            $ = new DnsCacheConfigArgs();
        }

        public Builder(DnsCacheConfigArgs defaults) {
            $ = new DnsCacheConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public DnsCacheConfigArgs build() {
            return $;
        }
    }

}
