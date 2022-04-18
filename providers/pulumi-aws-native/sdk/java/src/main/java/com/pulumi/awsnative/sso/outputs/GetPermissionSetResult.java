// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sso.outputs;

import com.pulumi.awsnative.sso.outputs.PermissionSetTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPermissionSetResult {
    /**
     * The permission set description.
     * 
     */
    private final @Nullable String description;
    /**
     * The inline policy to put in permission set.
     * 
     */
    private final @Nullable Object inlinePolicy;
    private final @Nullable List<String> managedPolicies;
    /**
     * The permission set that the policy will be attached to
     * 
     */
    private final @Nullable String permissionSetArn;
    /**
     * The relay state URL that redirect links to any service in the AWS Management Console.
     * 
     */
    private final @Nullable String relayStateType;
    /**
     * The length of time that a user can be signed in to an AWS account.
     * 
     */
    private final @Nullable String sessionDuration;
    private final @Nullable List<PermissionSetTag> tags;

    @CustomType.Constructor
    private GetPermissionSetResult(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("inlinePolicy") @Nullable Object inlinePolicy,
        @CustomType.Parameter("managedPolicies") @Nullable List<String> managedPolicies,
        @CustomType.Parameter("permissionSetArn") @Nullable String permissionSetArn,
        @CustomType.Parameter("relayStateType") @Nullable String relayStateType,
        @CustomType.Parameter("sessionDuration") @Nullable String sessionDuration,
        @CustomType.Parameter("tags") @Nullable List<PermissionSetTag> tags) {
        this.description = description;
        this.inlinePolicy = inlinePolicy;
        this.managedPolicies = managedPolicies;
        this.permissionSetArn = permissionSetArn;
        this.relayStateType = relayStateType;
        this.sessionDuration = sessionDuration;
        this.tags = tags;
    }

    /**
     * The permission set description.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The inline policy to put in permission set.
     * 
    */
    public Optional<Object> inlinePolicy() {
        return Optional.ofNullable(this.inlinePolicy);
    }
    public List<String> managedPolicies() {
        return this.managedPolicies == null ? List.of() : this.managedPolicies;
    }
    /**
     * The permission set that the policy will be attached to
     * 
    */
    public Optional<String> permissionSetArn() {
        return Optional.ofNullable(this.permissionSetArn);
    }
    /**
     * The relay state URL that redirect links to any service in the AWS Management Console.
     * 
    */
    public Optional<String> relayStateType() {
        return Optional.ofNullable(this.relayStateType);
    }
    /**
     * The length of time that a user can be signed in to an AWS account.
     * 
    */
    public Optional<String> sessionDuration() {
        return Optional.ofNullable(this.sessionDuration);
    }
    public List<PermissionSetTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionSetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Object inlinePolicy;
        private @Nullable List<String> managedPolicies;
        private @Nullable String permissionSetArn;
        private @Nullable String relayStateType;
        private @Nullable String sessionDuration;
        private @Nullable List<PermissionSetTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPermissionSetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.inlinePolicy = defaults.inlinePolicy;
    	      this.managedPolicies = defaults.managedPolicies;
    	      this.permissionSetArn = defaults.permissionSetArn;
    	      this.relayStateType = defaults.relayStateType;
    	      this.sessionDuration = defaults.sessionDuration;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder inlinePolicy(@Nullable Object inlinePolicy) {
            this.inlinePolicy = inlinePolicy;
            return this;
        }
        public Builder managedPolicies(@Nullable List<String> managedPolicies) {
            this.managedPolicies = managedPolicies;
            return this;
        }
        public Builder managedPolicies(String... managedPolicies) {
            return managedPolicies(List.of(managedPolicies));
        }
        public Builder permissionSetArn(@Nullable String permissionSetArn) {
            this.permissionSetArn = permissionSetArn;
            return this;
        }
        public Builder relayStateType(@Nullable String relayStateType) {
            this.relayStateType = relayStateType;
            return this;
        }
        public Builder sessionDuration(@Nullable String sessionDuration) {
            this.sessionDuration = sessionDuration;
            return this;
        }
        public Builder tags(@Nullable List<PermissionSetTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(PermissionSetTag... tags) {
            return tags(List.of(tags));
        }        public GetPermissionSetResult build() {
            return new GetPermissionSetResult(description, inlinePolicy, managedPolicies, permissionSetArn, relayStateType, sessionDuration, tags);
        }
    }
}
