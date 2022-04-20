// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetVpcFilter;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVpcArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcArgs Empty = new GetVpcArgs();

    /**
     * The cidr block of the desired VPC.
     * 
     */
    @Import(name="cidrBlock")
      private final @Nullable String cidrBlock;

    public Optional<String> cidrBlock() {
        return this.cidrBlock == null ? Optional.empty() : Optional.ofNullable(this.cidrBlock);
    }

    /**
     * Boolean constraint on whether the desired VPC is
     * the default VPC for the region.
     * 
     */
    @Import(name="default")
      private final @Nullable Boolean default_;

    public Optional<Boolean> default_() {
        return this.default_ == null ? Optional.empty() : Optional.ofNullable(this.default_);
    }

    /**
     * The DHCP options id of the desired VPC.
     * 
     */
    @Import(name="dhcpOptionsId")
      private final @Nullable String dhcpOptionsId;

    public Optional<String> dhcpOptionsId() {
        return this.dhcpOptionsId == null ? Optional.empty() : Optional.ofNullable(this.dhcpOptionsId);
    }

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetVpcFilter> filters;

    public List<GetVpcFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * The id of the specific VPC to retrieve.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The current state of the desired VPC.
     * Can be either `&#34;pending&#34;` or `&#34;available&#34;`.
     * 
     */
    @Import(name="state")
      private final @Nullable String state;

    public Optional<String> state() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired VPC.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetVpcArgs(
        @Nullable String cidrBlock,
        @Nullable Boolean default_,
        @Nullable String dhcpOptionsId,
        @Nullable List<GetVpcFilter> filters,
        @Nullable String id,
        @Nullable String state,
        @Nullable Map<String,String> tags) {
        this.cidrBlock = cidrBlock;
        this.default_ = default_;
        this.dhcpOptionsId = dhcpOptionsId;
        this.filters = filters;
        this.id = id;
        this.state = state;
        this.tags = tags;
    }

    private GetVpcArgs() {
        this.cidrBlock = null;
        this.default_ = null;
        this.dhcpOptionsId = null;
        this.filters = List.of();
        this.id = null;
        this.state = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cidrBlock;
        private @Nullable Boolean default_;
        private @Nullable String dhcpOptionsId;
        private @Nullable List<GetVpcFilter> filters;
        private @Nullable String id;
        private @Nullable String state;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.default_ = defaults.default_;
    	      this.dhcpOptionsId = defaults.dhcpOptionsId;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public Builder default_(@Nullable Boolean default_) {
            this.default_ = default_;
            return this;
        }
        public Builder dhcpOptionsId(@Nullable String dhcpOptionsId) {
            this.dhcpOptionsId = dhcpOptionsId;
            return this;
        }
        public Builder filters(@Nullable List<GetVpcFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetVpcFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetVpcArgs build() {
            return new GetVpcArgs(cidrBlock, default_, dhcpOptionsId, filters, id, state, tags);
        }
    }
}
