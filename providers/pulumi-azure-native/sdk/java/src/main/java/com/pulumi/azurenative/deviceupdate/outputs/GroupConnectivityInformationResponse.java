// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.deviceupdate.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GroupConnectivityInformationResponse {
    /**
     * List of customer visible FQDNs.
     * 
     */
    private final @Nullable List<String> customerVisibleFqdns;
    /**
     * Group ID.
     * 
     */
    private final String groupId;
    /**
     * Internal FQDN.
     * 
     */
    private final String internalFqdn;
    /**
     * Member name.
     * 
     */
    private final String memberName;
    /**
     * PrivateLinkService ARM region.
     * 
     */
    private final @Nullable String privateLinkServiceArmRegion;
    /**
     * Redirect map ID.
     * 
     */
    private final @Nullable String redirectMapId;

    @CustomType.Constructor
    private GroupConnectivityInformationResponse(
        @CustomType.Parameter("customerVisibleFqdns") @Nullable List<String> customerVisibleFqdns,
        @CustomType.Parameter("groupId") String groupId,
        @CustomType.Parameter("internalFqdn") String internalFqdn,
        @CustomType.Parameter("memberName") String memberName,
        @CustomType.Parameter("privateLinkServiceArmRegion") @Nullable String privateLinkServiceArmRegion,
        @CustomType.Parameter("redirectMapId") @Nullable String redirectMapId) {
        this.customerVisibleFqdns = customerVisibleFqdns;
        this.groupId = groupId;
        this.internalFqdn = internalFqdn;
        this.memberName = memberName;
        this.privateLinkServiceArmRegion = privateLinkServiceArmRegion;
        this.redirectMapId = redirectMapId;
    }

    /**
     * List of customer visible FQDNs.
     * 
    */
    public List<String> customerVisibleFqdns() {
        return this.customerVisibleFqdns == null ? List.of() : this.customerVisibleFqdns;
    }
    /**
     * Group ID.
     * 
    */
    public String groupId() {
        return this.groupId;
    }
    /**
     * Internal FQDN.
     * 
    */
    public String internalFqdn() {
        return this.internalFqdn;
    }
    /**
     * Member name.
     * 
    */
    public String memberName() {
        return this.memberName;
    }
    /**
     * PrivateLinkService ARM region.
     * 
    */
    public Optional<String> privateLinkServiceArmRegion() {
        return Optional.ofNullable(this.privateLinkServiceArmRegion);
    }
    /**
     * Redirect map ID.
     * 
    */
    public Optional<String> redirectMapId() {
        return Optional.ofNullable(this.redirectMapId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupConnectivityInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> customerVisibleFqdns;
        private String groupId;
        private String internalFqdn;
        private String memberName;
        private @Nullable String privateLinkServiceArmRegion;
        private @Nullable String redirectMapId;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupConnectivityInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerVisibleFqdns = defaults.customerVisibleFqdns;
    	      this.groupId = defaults.groupId;
    	      this.internalFqdn = defaults.internalFqdn;
    	      this.memberName = defaults.memberName;
    	      this.privateLinkServiceArmRegion = defaults.privateLinkServiceArmRegion;
    	      this.redirectMapId = defaults.redirectMapId;
        }

        public Builder customerVisibleFqdns(@Nullable List<String> customerVisibleFqdns) {
            this.customerVisibleFqdns = customerVisibleFqdns;
            return this;
        }
        public Builder customerVisibleFqdns(String... customerVisibleFqdns) {
            return customerVisibleFqdns(List.of(customerVisibleFqdns));
        }
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        public Builder internalFqdn(String internalFqdn) {
            this.internalFqdn = Objects.requireNonNull(internalFqdn);
            return this;
        }
        public Builder memberName(String memberName) {
            this.memberName = Objects.requireNonNull(memberName);
            return this;
        }
        public Builder privateLinkServiceArmRegion(@Nullable String privateLinkServiceArmRegion) {
            this.privateLinkServiceArmRegion = privateLinkServiceArmRegion;
            return this;
        }
        public Builder redirectMapId(@Nullable String redirectMapId) {
            this.redirectMapId = redirectMapId;
            return this;
        }        public GroupConnectivityInformationResponse build() {
            return new GroupConnectivityInformationResponse(customerVisibleFqdns, groupId, internalFqdn, memberName, privateLinkServiceArmRegion, redirectMapId);
        }
    }
}
