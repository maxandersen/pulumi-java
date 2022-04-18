// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns_v1beta2.inputs.RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Configures a RRSetRoutingPolicy that routes based on the geo location of the querying user.
 * 
 */
public final class RRSetRoutingPolicyGeoPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final RRSetRoutingPolicyGeoPolicyResponse Empty = new RRSetRoutingPolicyGeoPolicyResponse();

    /**
     * The primary geo routing configuration. If there are multiple items with the same location, an error is returned instead.
     * 
     */
    @Import(name="items", required=true)
      private final List<RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse> items;

    public List<RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse> items() {
        return this.items;
    }

    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    public RRSetRoutingPolicyGeoPolicyResponse(
        List<RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse> items,
        String kind) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
    }

    private RRSetRoutingPolicyGeoPolicyResponse() {
        this.items = List.of();
        this.kind = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyGeoPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse> items;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyGeoPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.kind = defaults.kind;
        }

        public Builder items(List<RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse... items) {
            return items(List.of(items));
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }        public RRSetRoutingPolicyGeoPolicyResponse build() {
            return new RRSetRoutingPolicyGeoPolicyResponse(items, kind);
        }
    }
}
