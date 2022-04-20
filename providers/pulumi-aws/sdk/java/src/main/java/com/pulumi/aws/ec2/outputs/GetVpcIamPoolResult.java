// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetVpcIamPoolFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVpcIamPoolResult {
    /**
     * The IP protocol assigned to this pool.
     * 
     */
    private final String addressFamily;
    /**
     * A default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16.
     * 
     */
    private final Integer allocationDefaultNetmaskLength;
    /**
     * The maximum netmask length that will be required for CIDR allocations in this pool.
     * 
     */
    private final Integer allocationMaxNetmaskLength;
    /**
     * The minimum netmask length that will be required for CIDR allocations in this pool.
     * 
     */
    private final Integer allocationMinNetmaskLength;
    /**
     * Tags that are required to create resources in using this pool.
     * 
     */
    private final Map<String,String> allocationResourceTags;
    /**
     * Amazon Resource Name (ARN) of the pool
     * 
     */
    private final String arn;
    /**
     * If enabled, IPAM will continuously look for resources within the CIDR range of this pool and automatically import them as allocations into your IPAM.
     * 
     */
    private final Boolean autoImport;
    /**
     * Limits which service in AWS that the pool can be used in. &#34;ec2&#34;, for example, allows users to use space for Elastic IP addresses and VPCs.
     * 
     */
    private final String awsService;
    /**
     * A description for the IPAM pool.
     * 
     */
    private final String description;
    private final @Nullable List<GetVpcIamPoolFilter> filters;
    private final @Nullable String id;
    private final @Nullable String ipamPoolId;
    /**
     * The ID of the scope the pool belongs to.
     * 
     */
    private final String ipamScopeId;
    private final String ipamScopeType;
    /**
     * Locale is the Region where your pool is available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region.
     * 
     */
    private final String locale;
    private final Integer poolDepth;
    /**
     * Defines whether or not IPv6 pool space is publicly ∂advertisable over the internet.
     * 
     */
    private final Boolean publiclyAdvertisable;
    /**
     * The ID of the source IPAM pool.
     * 
     */
    private final String sourceIpamPoolId;
    private final String state;
    /**
     * A map of tags to assigned to the resource.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetVpcIamPoolResult(
        @CustomType.Parameter("addressFamily") String addressFamily,
        @CustomType.Parameter("allocationDefaultNetmaskLength") Integer allocationDefaultNetmaskLength,
        @CustomType.Parameter("allocationMaxNetmaskLength") Integer allocationMaxNetmaskLength,
        @CustomType.Parameter("allocationMinNetmaskLength") Integer allocationMinNetmaskLength,
        @CustomType.Parameter("allocationResourceTags") Map<String,String> allocationResourceTags,
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("autoImport") Boolean autoImport,
        @CustomType.Parameter("awsService") String awsService,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("filters") @Nullable List<GetVpcIamPoolFilter> filters,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("ipamPoolId") @Nullable String ipamPoolId,
        @CustomType.Parameter("ipamScopeId") String ipamScopeId,
        @CustomType.Parameter("ipamScopeType") String ipamScopeType,
        @CustomType.Parameter("locale") String locale,
        @CustomType.Parameter("poolDepth") Integer poolDepth,
        @CustomType.Parameter("publiclyAdvertisable") Boolean publiclyAdvertisable,
        @CustomType.Parameter("sourceIpamPoolId") String sourceIpamPoolId,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.addressFamily = addressFamily;
        this.allocationDefaultNetmaskLength = allocationDefaultNetmaskLength;
        this.allocationMaxNetmaskLength = allocationMaxNetmaskLength;
        this.allocationMinNetmaskLength = allocationMinNetmaskLength;
        this.allocationResourceTags = allocationResourceTags;
        this.arn = arn;
        this.autoImport = autoImport;
        this.awsService = awsService;
        this.description = description;
        this.filters = filters;
        this.id = id;
        this.ipamPoolId = ipamPoolId;
        this.ipamScopeId = ipamScopeId;
        this.ipamScopeType = ipamScopeType;
        this.locale = locale;
        this.poolDepth = poolDepth;
        this.publiclyAdvertisable = publiclyAdvertisable;
        this.sourceIpamPoolId = sourceIpamPoolId;
        this.state = state;
        this.tags = tags;
    }

    /**
     * The IP protocol assigned to this pool.
     * 
    */
    public String addressFamily() {
        return this.addressFamily;
    }
    /**
     * A default netmask length for allocations added to this pool. If, for example, the CIDR assigned to this pool is 10.0.0.0/8 and you enter 16 here, new allocations will default to 10.0.0.0/16.
     * 
    */
    public Integer allocationDefaultNetmaskLength() {
        return this.allocationDefaultNetmaskLength;
    }
    /**
     * The maximum netmask length that will be required for CIDR allocations in this pool.
     * 
    */
    public Integer allocationMaxNetmaskLength() {
        return this.allocationMaxNetmaskLength;
    }
    /**
     * The minimum netmask length that will be required for CIDR allocations in this pool.
     * 
    */
    public Integer allocationMinNetmaskLength() {
        return this.allocationMinNetmaskLength;
    }
    /**
     * Tags that are required to create resources in using this pool.
     * 
    */
    public Map<String,String> allocationResourceTags() {
        return this.allocationResourceTags;
    }
    /**
     * Amazon Resource Name (ARN) of the pool
     * 
    */
    public String arn() {
        return this.arn;
    }
    /**
     * If enabled, IPAM will continuously look for resources within the CIDR range of this pool and automatically import them as allocations into your IPAM.
     * 
    */
    public Boolean autoImport() {
        return this.autoImport;
    }
    /**
     * Limits which service in AWS that the pool can be used in. &#34;ec2&#34;, for example, allows users to use space for Elastic IP addresses and VPCs.
     * 
    */
    public String awsService() {
        return this.awsService;
    }
    /**
     * A description for the IPAM pool.
     * 
    */
    public String description() {
        return this.description;
    }
    public List<GetVpcIamPoolFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> ipamPoolId() {
        return Optional.ofNullable(this.ipamPoolId);
    }
    /**
     * The ID of the scope the pool belongs to.
     * 
    */
    public String ipamScopeId() {
        return this.ipamScopeId;
    }
    public String ipamScopeType() {
        return this.ipamScopeType;
    }
    /**
     * Locale is the Region where your pool is available for allocations. You can only create pools with locales that match the operating Regions of the IPAM. You can only create VPCs from a pool whose locale matches the VPC&#39;s Region.
     * 
    */
    public String locale() {
        return this.locale;
    }
    public Integer poolDepth() {
        return this.poolDepth;
    }
    /**
     * Defines whether or not IPv6 pool space is publicly ∂advertisable over the internet.
     * 
    */
    public Boolean publiclyAdvertisable() {
        return this.publiclyAdvertisable;
    }
    /**
     * The ID of the source IPAM pool.
     * 
    */
    public String sourceIpamPoolId() {
        return this.sourceIpamPoolId;
    }
    public String state() {
        return this.state;
    }
    /**
     * A map of tags to assigned to the resource.
     * 
    */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcIamPoolResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String addressFamily;
        private Integer allocationDefaultNetmaskLength;
        private Integer allocationMaxNetmaskLength;
        private Integer allocationMinNetmaskLength;
        private Map<String,String> allocationResourceTags;
        private String arn;
        private Boolean autoImport;
        private String awsService;
        private String description;
        private @Nullable List<GetVpcIamPoolFilter> filters;
        private @Nullable String id;
        private @Nullable String ipamPoolId;
        private String ipamScopeId;
        private String ipamScopeType;
        private String locale;
        private Integer poolDepth;
        private Boolean publiclyAdvertisable;
        private String sourceIpamPoolId;
        private String state;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcIamPoolResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressFamily = defaults.addressFamily;
    	      this.allocationDefaultNetmaskLength = defaults.allocationDefaultNetmaskLength;
    	      this.allocationMaxNetmaskLength = defaults.allocationMaxNetmaskLength;
    	      this.allocationMinNetmaskLength = defaults.allocationMinNetmaskLength;
    	      this.allocationResourceTags = defaults.allocationResourceTags;
    	      this.arn = defaults.arn;
    	      this.autoImport = defaults.autoImport;
    	      this.awsService = defaults.awsService;
    	      this.description = defaults.description;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ipamPoolId = defaults.ipamPoolId;
    	      this.ipamScopeId = defaults.ipamScopeId;
    	      this.ipamScopeType = defaults.ipamScopeType;
    	      this.locale = defaults.locale;
    	      this.poolDepth = defaults.poolDepth;
    	      this.publiclyAdvertisable = defaults.publiclyAdvertisable;
    	      this.sourceIpamPoolId = defaults.sourceIpamPoolId;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
        }

        public Builder addressFamily(String addressFamily) {
            this.addressFamily = Objects.requireNonNull(addressFamily);
            return this;
        }
        public Builder allocationDefaultNetmaskLength(Integer allocationDefaultNetmaskLength) {
            this.allocationDefaultNetmaskLength = Objects.requireNonNull(allocationDefaultNetmaskLength);
            return this;
        }
        public Builder allocationMaxNetmaskLength(Integer allocationMaxNetmaskLength) {
            this.allocationMaxNetmaskLength = Objects.requireNonNull(allocationMaxNetmaskLength);
            return this;
        }
        public Builder allocationMinNetmaskLength(Integer allocationMinNetmaskLength) {
            this.allocationMinNetmaskLength = Objects.requireNonNull(allocationMinNetmaskLength);
            return this;
        }
        public Builder allocationResourceTags(Map<String,String> allocationResourceTags) {
            this.allocationResourceTags = Objects.requireNonNull(allocationResourceTags);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder autoImport(Boolean autoImport) {
            this.autoImport = Objects.requireNonNull(autoImport);
            return this;
        }
        public Builder awsService(String awsService) {
            this.awsService = Objects.requireNonNull(awsService);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder filters(@Nullable List<GetVpcIamPoolFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetVpcIamPoolFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder ipamPoolId(@Nullable String ipamPoolId) {
            this.ipamPoolId = ipamPoolId;
            return this;
        }
        public Builder ipamScopeId(String ipamScopeId) {
            this.ipamScopeId = Objects.requireNonNull(ipamScopeId);
            return this;
        }
        public Builder ipamScopeType(String ipamScopeType) {
            this.ipamScopeType = Objects.requireNonNull(ipamScopeType);
            return this;
        }
        public Builder locale(String locale) {
            this.locale = Objects.requireNonNull(locale);
            return this;
        }
        public Builder poolDepth(Integer poolDepth) {
            this.poolDepth = Objects.requireNonNull(poolDepth);
            return this;
        }
        public Builder publiclyAdvertisable(Boolean publiclyAdvertisable) {
            this.publiclyAdvertisable = Objects.requireNonNull(publiclyAdvertisable);
            return this;
        }
        public Builder sourceIpamPoolId(String sourceIpamPoolId) {
            this.sourceIpamPoolId = Objects.requireNonNull(sourceIpamPoolId);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetVpcIamPoolResult build() {
            return new GetVpcIamPoolResult(addressFamily, allocationDefaultNetmaskLength, allocationMaxNetmaskLength, allocationMinNetmaskLength, allocationResourceTags, arn, autoImport, awsService, description, filters, id, ipamPoolId, ipamScopeId, ipamScopeType, locale, poolDepth, publiclyAdvertisable, sourceIpamPoolId, state, tags);
        }
    }
}
