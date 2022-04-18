// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.outputs;

import com.pulumi.azurenative.botservice.outputs.EnterpriseChannelNodeResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnterpriseChannelPropertiesResponse {
    /**
     * The nodes associated with the Enterprise Channel.
     * 
     */
    private final List<EnterpriseChannelNodeResponse> nodes;
    /**
     * The current state of the Enterprise Channel.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private EnterpriseChannelPropertiesResponse(
        @CustomType.Parameter("nodes") List<EnterpriseChannelNodeResponse> nodes,
        @CustomType.Parameter("state") @Nullable String state) {
        this.nodes = nodes;
        this.state = state;
    }

    /**
     * The nodes associated with the Enterprise Channel.
     * 
    */
    public List<EnterpriseChannelNodeResponse> nodes() {
        return this.nodes;
    }
    /**
     * The current state of the Enterprise Channel.
     * 
    */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<EnterpriseChannelNodeResponse> nodes;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodes = defaults.nodes;
    	      this.state = defaults.state;
        }

        public Builder nodes(List<EnterpriseChannelNodeResponse> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }
        public Builder nodes(EnterpriseChannelNodeResponse... nodes) {
            return nodes(List.of(nodes));
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public EnterpriseChannelPropertiesResponse build() {
            return new EnterpriseChannelPropertiesResponse(nodes, state);
        }
    }
}
