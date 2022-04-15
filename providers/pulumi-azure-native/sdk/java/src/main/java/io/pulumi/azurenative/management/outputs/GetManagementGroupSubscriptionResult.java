// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management.outputs;

import io.pulumi.azurenative.management.outputs.DescendantParentGroupInfoResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetManagementGroupSubscriptionResult {
    /**
     * The friendly name of the subscription.
     * 
     */
    private final @Nullable String displayName;
    /**
     * The fully qualified ID for the subscription.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000/subscriptions/0000000-0000-0000-0000-000000000001
     * 
     */
    private final String id;
    /**
     * The stringified id of the subscription. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    private final String name;
    /**
     * The ID of the parent management group.
     * 
     */
    private final @Nullable DescendantParentGroupInfoResponse parent;
    /**
     * The state of the subscription.
     * 
     */
    private final @Nullable String state;
    /**
     * The AAD Tenant ID associated with the subscription. For example, 00000000-0000-0000-0000-000000000000
     * 
     */
    private final @Nullable String tenant;
    /**
     * The type of the resource.  For example, Microsoft.Management/managementGroups/subscriptions
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetManagementGroupSubscriptionResult(
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("parent") @Nullable DescendantParentGroupInfoResponse parent,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("tenant") @Nullable String tenant,
        @CustomType.Parameter("type") String type) {
        this.displayName = displayName;
        this.id = id;
        this.name = name;
        this.parent = parent;
        this.state = state;
        this.tenant = tenant;
        this.type = type;
    }

    /**
     * The friendly name of the subscription.
     * 
    */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * The fully qualified ID for the subscription.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000/subscriptions/0000000-0000-0000-0000-000000000001
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The stringified id of the subscription. For example, 00000000-0000-0000-0000-000000000000
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The ID of the parent management group.
     * 
    */
    public Optional<DescendantParentGroupInfoResponse> parent() {
        return Optional.ofNullable(this.parent);
    }
    /**
     * The state of the subscription.
     * 
    */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * The AAD Tenant ID associated with the subscription. For example, 00000000-0000-0000-0000-000000000000
     * 
    */
    public Optional<String> tenant() {
        return Optional.ofNullable(this.tenant);
    }
    /**
     * The type of the resource.  For example, Microsoft.Management/managementGroups/subscriptions
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagementGroupSubscriptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private String id;
        private String name;
        private @Nullable DescendantParentGroupInfoResponse parent;
        private @Nullable String state;
        private @Nullable String tenant;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagementGroupSubscriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.state = defaults.state;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parent(@Nullable DescendantParentGroupInfoResponse parent) {
            this.parent = parent;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder tenant(@Nullable String tenant) {
            this.tenant = tenant;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetManagementGroupSubscriptionResult build() {
            return new GetManagementGroupSubscriptionResult(displayName, id, name, parent, state, tenant, type);
        }
    }
}
