// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.discovery.k8s.io_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.discovery.k8s.io_v1.inputs.ForZoneArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * EndpointHints provides hints describing how an endpoint should be consumed.
 * 
 */
public final class EndpointHintsArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointHintsArgs Empty = new EndpointHintsArgs();

    /**
     * forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing.
     * 
     */
    @Import(name="forZones")
      private final @Nullable Output<List<ForZoneArgs>> forZones;

    public Output<List<ForZoneArgs>> forZones() {
        return this.forZones == null ? Codegen.empty() : this.forZones;
    }

    public EndpointHintsArgs(@Nullable Output<List<ForZoneArgs>> forZones) {
        this.forZones = forZones;
    }

    private EndpointHintsArgs() {
        this.forZones = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointHintsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ForZoneArgs>> forZones;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointHintsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forZones = defaults.forZones;
        }

        public Builder forZones(@Nullable Output<List<ForZoneArgs>> forZones) {
            this.forZones = forZones;
            return this;
        }
        public Builder forZones(@Nullable List<ForZoneArgs> forZones) {
            this.forZones = Codegen.ofNullable(forZones);
            return this;
        }
        public Builder forZones(ForZoneArgs... forZones) {
            return forZones(List.of(forZones));
        }        public EndpointHintsArgs build() {
            return new EndpointHintsArgs(forZones);
        }
    }
}
