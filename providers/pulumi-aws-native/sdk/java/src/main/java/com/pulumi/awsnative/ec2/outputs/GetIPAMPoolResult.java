// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.outputs;

import com.pulumi.awsnative.ec2.enums.IPAMPoolIpamScopeType;
import com.pulumi.awsnative.ec2.enums.IPAMPoolState;
import com.pulumi.awsnative.ec2.outputs.IPAMPoolProvisionedCidr;
import com.pulumi.awsnative.ec2.outputs.IPAMPoolTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIPAMPoolResult {
    /**
     * @return The default netmask length for allocations made from this pool. This value is used when the netmask length of an allocation isn&#39;t specified.
     * 
     */
    private final @Nullable Integer allocationDefaultNetmaskLength;
    /**
     * @return The maximum allowed netmask length for allocations made from this pool.
     * 
     */
    private final @Nullable Integer allocationMaxNetmaskLength;
    /**
     * @return The minimum allowed netmask length for allocations made from this pool.
     * 
     */
    private final @Nullable Integer allocationMinNetmaskLength;
    /**
     * @return When specified, an allocation will not be allowed unless a resource has a matching set of tags.
     * 
     */
    private final @Nullable List<IPAMPoolTag> allocationResourceTags;
    /**
     * @return The Amazon Resource Name (ARN) of the IPAM Pool.
     * 
     */
    private final @Nullable String arn;
    /**
     * @return Determines what to do if IPAM discovers resources that haven&#39;t been assigned an allocation. If set to true, an allocation will be made automatically.
     * 
     */
    private final @Nullable Boolean autoImport;
    private final @Nullable String description;
    /**
     * @return The Amazon Resource Name (ARN) of the IPAM this pool is a part of.
     * 
     */
    private final @Nullable String ipamArn;
    /**
     * @return Id of the IPAM Pool.
     * 
     */
    private final @Nullable String ipamPoolId;
    /**
     * @return The Amazon Resource Name (ARN) of the scope this pool is a part of.
     * 
     */
    private final @Nullable String ipamScopeArn;
    /**
     * @return Determines whether this scope contains publicly routable space or space for a private network
     * 
     */
    private final @Nullable IPAMPoolIpamScopeType ipamScopeType;
    /**
     * @return The depth of this pool in the source pool hierarchy.
     * 
     */
    private final @Nullable Integer poolDepth;
    /**
     * @return A list of cidrs representing the address space available for allocation in this pool.
     * 
     */
    private final @Nullable List<IPAMPoolProvisionedCidr> provisionedCidrs;
    /**
     * @return The state of this pool. This can be one of the following values: &#34;create-in-progress&#34;, &#34;create-complete&#34;, &#34;modify-in-progress&#34;, &#34;modify-complete&#34;, &#34;delete-in-progress&#34;, or &#34;delete-complete&#34;
     * 
     */
    private final @Nullable IPAMPoolState state;
    /**
     * @return An explanation of how the pool arrived at it current state.
     * 
     */
    private final @Nullable String stateMessage;
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<IPAMPoolTag> tags;

    @CustomType.Constructor
    private GetIPAMPoolResult(
        @CustomType.Parameter("allocationDefaultNetmaskLength") @Nullable Integer allocationDefaultNetmaskLength,
        @CustomType.Parameter("allocationMaxNetmaskLength") @Nullable Integer allocationMaxNetmaskLength,
        @CustomType.Parameter("allocationMinNetmaskLength") @Nullable Integer allocationMinNetmaskLength,
        @CustomType.Parameter("allocationResourceTags") @Nullable List<IPAMPoolTag> allocationResourceTags,
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("autoImport") @Nullable Boolean autoImport,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("ipamArn") @Nullable String ipamArn,
        @CustomType.Parameter("ipamPoolId") @Nullable String ipamPoolId,
        @CustomType.Parameter("ipamScopeArn") @Nullable String ipamScopeArn,
        @CustomType.Parameter("ipamScopeType") @Nullable IPAMPoolIpamScopeType ipamScopeType,
        @CustomType.Parameter("poolDepth") @Nullable Integer poolDepth,
        @CustomType.Parameter("provisionedCidrs") @Nullable List<IPAMPoolProvisionedCidr> provisionedCidrs,
        @CustomType.Parameter("state") @Nullable IPAMPoolState state,
        @CustomType.Parameter("stateMessage") @Nullable String stateMessage,
        @CustomType.Parameter("tags") @Nullable List<IPAMPoolTag> tags) {
        this.allocationDefaultNetmaskLength = allocationDefaultNetmaskLength;
        this.allocationMaxNetmaskLength = allocationMaxNetmaskLength;
        this.allocationMinNetmaskLength = allocationMinNetmaskLength;
        this.allocationResourceTags = allocationResourceTags;
        this.arn = arn;
        this.autoImport = autoImport;
        this.description = description;
        this.ipamArn = ipamArn;
        this.ipamPoolId = ipamPoolId;
        this.ipamScopeArn = ipamScopeArn;
        this.ipamScopeType = ipamScopeType;
        this.poolDepth = poolDepth;
        this.provisionedCidrs = provisionedCidrs;
        this.state = state;
        this.stateMessage = stateMessage;
        this.tags = tags;
    }

    /**
     * @return The default netmask length for allocations made from this pool. This value is used when the netmask length of an allocation isn&#39;t specified.
     * 
     */
    public Optional<Integer> allocationDefaultNetmaskLength() {
        return Optional.ofNullable(this.allocationDefaultNetmaskLength);
    }
    /**
     * @return The maximum allowed netmask length for allocations made from this pool.
     * 
     */
    public Optional<Integer> allocationMaxNetmaskLength() {
        return Optional.ofNullable(this.allocationMaxNetmaskLength);
    }
    /**
     * @return The minimum allowed netmask length for allocations made from this pool.
     * 
     */
    public Optional<Integer> allocationMinNetmaskLength() {
        return Optional.ofNullable(this.allocationMinNetmaskLength);
    }
    /**
     * @return When specified, an allocation will not be allowed unless a resource has a matching set of tags.
     * 
     */
    public List<IPAMPoolTag> allocationResourceTags() {
        return this.allocationResourceTags == null ? List.of() : this.allocationResourceTags;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the IPAM Pool.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return Determines what to do if IPAM discovers resources that haven&#39;t been assigned an allocation. If set to true, an allocation will be made automatically.
     * 
     */
    public Optional<Boolean> autoImport() {
        return Optional.ofNullable(this.autoImport);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The Amazon Resource Name (ARN) of the IPAM this pool is a part of.
     * 
     */
    public Optional<String> ipamArn() {
        return Optional.ofNullable(this.ipamArn);
    }
    /**
     * @return Id of the IPAM Pool.
     * 
     */
    public Optional<String> ipamPoolId() {
        return Optional.ofNullable(this.ipamPoolId);
    }
    /**
     * @return The Amazon Resource Name (ARN) of the scope this pool is a part of.
     * 
     */
    public Optional<String> ipamScopeArn() {
        return Optional.ofNullable(this.ipamScopeArn);
    }
    /**
     * @return Determines whether this scope contains publicly routable space or space for a private network
     * 
     */
    public Optional<IPAMPoolIpamScopeType> ipamScopeType() {
        return Optional.ofNullable(this.ipamScopeType);
    }
    /**
     * @return The depth of this pool in the source pool hierarchy.
     * 
     */
    public Optional<Integer> poolDepth() {
        return Optional.ofNullable(this.poolDepth);
    }
    /**
     * @return A list of cidrs representing the address space available for allocation in this pool.
     * 
     */
    public List<IPAMPoolProvisionedCidr> provisionedCidrs() {
        return this.provisionedCidrs == null ? List.of() : this.provisionedCidrs;
    }
    /**
     * @return The state of this pool. This can be one of the following values: &#34;create-in-progress&#34;, &#34;create-complete&#34;, &#34;modify-in-progress&#34;, &#34;modify-complete&#34;, &#34;delete-in-progress&#34;, or &#34;delete-complete&#34;
     * 
     */
    public Optional<IPAMPoolState> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return An explanation of how the pool arrived at it current state.
     * 
     */
    public Optional<String> stateMessage() {
        return Optional.ofNullable(this.stateMessage);
    }
    /**
     * @return An array of key-value pairs to apply to this resource.
     * 
     */
    public List<IPAMPoolTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIPAMPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer allocationDefaultNetmaskLength;
        private @Nullable Integer allocationMaxNetmaskLength;
        private @Nullable Integer allocationMinNetmaskLength;
        private @Nullable List<IPAMPoolTag> allocationResourceTags;
        private @Nullable String arn;
        private @Nullable Boolean autoImport;
        private @Nullable String description;
        private @Nullable String ipamArn;
        private @Nullable String ipamPoolId;
        private @Nullable String ipamScopeArn;
        private @Nullable IPAMPoolIpamScopeType ipamScopeType;
        private @Nullable Integer poolDepth;
        private @Nullable List<IPAMPoolProvisionedCidr> provisionedCidrs;
        private @Nullable IPAMPoolState state;
        private @Nullable String stateMessage;
        private @Nullable List<IPAMPoolTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIPAMPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationDefaultNetmaskLength = defaults.allocationDefaultNetmaskLength;
    	      this.allocationMaxNetmaskLength = defaults.allocationMaxNetmaskLength;
    	      this.allocationMinNetmaskLength = defaults.allocationMinNetmaskLength;
    	      this.allocationResourceTags = defaults.allocationResourceTags;
    	      this.arn = defaults.arn;
    	      this.autoImport = defaults.autoImport;
    	      this.description = defaults.description;
    	      this.ipamArn = defaults.ipamArn;
    	      this.ipamPoolId = defaults.ipamPoolId;
    	      this.ipamScopeArn = defaults.ipamScopeArn;
    	      this.ipamScopeType = defaults.ipamScopeType;
    	      this.poolDepth = defaults.poolDepth;
    	      this.provisionedCidrs = defaults.provisionedCidrs;
    	      this.state = defaults.state;
    	      this.stateMessage = defaults.stateMessage;
    	      this.tags = defaults.tags;
        }

        public Builder allocationDefaultNetmaskLength(@Nullable Integer allocationDefaultNetmaskLength) {
            this.allocationDefaultNetmaskLength = allocationDefaultNetmaskLength;
            return this;
        }
        public Builder allocationMaxNetmaskLength(@Nullable Integer allocationMaxNetmaskLength) {
            this.allocationMaxNetmaskLength = allocationMaxNetmaskLength;
            return this;
        }
        public Builder allocationMinNetmaskLength(@Nullable Integer allocationMinNetmaskLength) {
            this.allocationMinNetmaskLength = allocationMinNetmaskLength;
            return this;
        }
        public Builder allocationResourceTags(@Nullable List<IPAMPoolTag> allocationResourceTags) {
            this.allocationResourceTags = allocationResourceTags;
            return this;
        }
        public Builder allocationResourceTags(IPAMPoolTag... allocationResourceTags) {
            return allocationResourceTags(List.of(allocationResourceTags));
        }
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder autoImport(@Nullable Boolean autoImport) {
            this.autoImport = autoImport;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder ipamArn(@Nullable String ipamArn) {
            this.ipamArn = ipamArn;
            return this;
        }
        public Builder ipamPoolId(@Nullable String ipamPoolId) {
            this.ipamPoolId = ipamPoolId;
            return this;
        }
        public Builder ipamScopeArn(@Nullable String ipamScopeArn) {
            this.ipamScopeArn = ipamScopeArn;
            return this;
        }
        public Builder ipamScopeType(@Nullable IPAMPoolIpamScopeType ipamScopeType) {
            this.ipamScopeType = ipamScopeType;
            return this;
        }
        public Builder poolDepth(@Nullable Integer poolDepth) {
            this.poolDepth = poolDepth;
            return this;
        }
        public Builder provisionedCidrs(@Nullable List<IPAMPoolProvisionedCidr> provisionedCidrs) {
            this.provisionedCidrs = provisionedCidrs;
            return this;
        }
        public Builder provisionedCidrs(IPAMPoolProvisionedCidr... provisionedCidrs) {
            return provisionedCidrs(List.of(provisionedCidrs));
        }
        public Builder state(@Nullable IPAMPoolState state) {
            this.state = state;
            return this;
        }
        public Builder stateMessage(@Nullable String stateMessage) {
            this.stateMessage = stateMessage;
            return this;
        }
        public Builder tags(@Nullable List<IPAMPoolTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(IPAMPoolTag... tags) {
            return tags(List.of(tags));
        }        public GetIPAMPoolResult build() {
            return new GetIPAMPoolResult(allocationDefaultNetmaskLength, allocationMaxNetmaskLength, allocationMinNetmaskLength, allocationResourceTags, arn, autoImport, description, ipamArn, ipamPoolId, ipamScopeArn, ipamScopeType, poolDepth, provisionedCidrs, state, stateMessage, tags);
        }
    }
}
