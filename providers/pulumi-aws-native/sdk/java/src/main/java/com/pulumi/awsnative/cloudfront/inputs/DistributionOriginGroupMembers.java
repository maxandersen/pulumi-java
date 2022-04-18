// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.awsnative.cloudfront.inputs.DistributionOriginGroupMember;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class DistributionOriginGroupMembers extends com.pulumi.resources.InvokeArgs {

    public static final DistributionOriginGroupMembers Empty = new DistributionOriginGroupMembers();

    @Import(name="items", required=true)
      private final List<DistributionOriginGroupMember> items;

    public List<DistributionOriginGroupMember> items() {
        return this.items;
    }

    @Import(name="quantity", required=true)
      private final Integer quantity;

    public Integer quantity() {
        return this.quantity;
    }

    public DistributionOriginGroupMembers(
        List<DistributionOriginGroupMember> items,
        Integer quantity) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.quantity = Objects.requireNonNull(quantity, "expected parameter 'quantity' to be non-null");
    }

    private DistributionOriginGroupMembers() {
        this.items = List.of();
        this.quantity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroupMembers defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<DistributionOriginGroupMember> items;
        private Integer quantity;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionOriginGroupMembers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.quantity = defaults.quantity;
        }

        public Builder items(List<DistributionOriginGroupMember> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(DistributionOriginGroupMember... items) {
            return items(List.of(items));
        }
        public Builder quantity(Integer quantity) {
            this.quantity = Objects.requireNonNull(quantity);
            return this;
        }        public DistributionOriginGroupMembers build() {
            return new DistributionOriginGroupMembers(items, quantity);
        }
    }
}
