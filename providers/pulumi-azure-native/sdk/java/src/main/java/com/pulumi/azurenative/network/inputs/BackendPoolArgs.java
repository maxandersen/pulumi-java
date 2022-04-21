// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.BackendArgs;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A backend pool is a collection of backends that can be routed to.
 * 
 */
public final class BackendPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendPoolArgs Empty = new BackendPoolArgs();

    /**
     * The set of backends for this pool
     * 
     */
    @Import(name="backends")
    private @Nullable Output<List<BackendArgs>> backends;

    public Optional<Output<List<BackendArgs>>> backends() {
        return Optional.ofNullable(this.backends);
    }

    /**
     * L7 health probe settings for a backend pool
     * 
     */
    @Import(name="healthProbeSettings")
    private @Nullable Output<SubResourceArgs> healthProbeSettings;

    public Optional<Output<SubResourceArgs>> healthProbeSettings() {
        return Optional.ofNullable(this.healthProbeSettings);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Load balancing settings for a backend pool
     * 
     */
    @Import(name="loadBalancingSettings")
    private @Nullable Output<SubResourceArgs> loadBalancingSettings;

    public Optional<Output<SubResourceArgs>> loadBalancingSettings() {
        return Optional.ofNullable(this.loadBalancingSettings);
    }

    /**
     * Resource name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private BackendPoolArgs() {}

    private BackendPoolArgs(BackendPoolArgs $) {
        this.backends = $.backends;
        this.healthProbeSettings = $.healthProbeSettings;
        this.id = $.id;
        this.loadBalancingSettings = $.loadBalancingSettings;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendPoolArgs $;

        public Builder() {
            $ = new BackendPoolArgs();
        }

        public Builder(BackendPoolArgs defaults) {
            $ = new BackendPoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder backends(@Nullable Output<List<BackendArgs>> backends) {
            $.backends = backends;
            return this;
        }

        public Builder backends(List<BackendArgs> backends) {
            return backends(Output.of(backends));
        }

        public Builder backends(BackendArgs... backends) {
            return backends(List.of(backends));
        }

        public Builder healthProbeSettings(@Nullable Output<SubResourceArgs> healthProbeSettings) {
            $.healthProbeSettings = healthProbeSettings;
            return this;
        }

        public Builder healthProbeSettings(SubResourceArgs healthProbeSettings) {
            return healthProbeSettings(Output.of(healthProbeSettings));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder loadBalancingSettings(@Nullable Output<SubResourceArgs> loadBalancingSettings) {
            $.loadBalancingSettings = loadBalancingSettings;
            return this;
        }

        public Builder loadBalancingSettings(SubResourceArgs loadBalancingSettings) {
            return loadBalancingSettings(Output.of(loadBalancingSettings));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public BackendPoolArgs build() {
            return $;
        }
    }

}
