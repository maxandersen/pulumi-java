// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePrincipalOauth2PermissionScopeGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePrincipalOauth2PermissionScopeGetArgs Empty = new ServicePrincipalOauth2PermissionScopeGetArgs();

    /**
     * Delegated permission description that appears in all tenant-wide admin consent experiences, intended to be read by an administrator granting the permission on behalf of all users.
     * 
     */
    @Import(name="adminConsentDescription")
      private final @Nullable Output<String> adminConsentDescription;

    public Output<String> adminConsentDescription() {
        return this.adminConsentDescription == null ? Codegen.empty() : this.adminConsentDescription;
    }

    /**
     * Display name for the delegated permission, intended to be read by an administrator granting the permission on behalf of all users.
     * 
     */
    @Import(name="adminConsentDisplayName")
      private final @Nullable Output<String> adminConsentDisplayName;

    public Output<String> adminConsentDisplayName() {
        return this.adminConsentDisplayName == null ? Codegen.empty() : this.adminConsentDisplayName;
    }

    /**
     * Specifies whether the permission scope is enabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * The unique identifier of the delegated permission.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Whether this delegated permission should be considered safe for non-admin users to consent to on behalf of themselves, or whether an administrator should be required for consent to the permissions. Possible values are `User` or `Admin`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * Delegated permission description that appears in the end user consent experience, intended to be read by a user consenting on their own behalf.
     * 
     */
    @Import(name="userConsentDescription")
      private final @Nullable Output<String> userConsentDescription;

    public Output<String> userConsentDescription() {
        return this.userConsentDescription == null ? Codegen.empty() : this.userConsentDescription;
    }

    /**
     * Display name for the delegated permission that appears in the end user consent experience.
     * 
     */
    @Import(name="userConsentDisplayName")
      private final @Nullable Output<String> userConsentDisplayName;

    public Output<String> userConsentDisplayName() {
        return this.userConsentDisplayName == null ? Codegen.empty() : this.userConsentDisplayName;
    }

    /**
     * The value that is used for the `scp` claim in OAuth 2.0 access tokens.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> value() {
        return this.value == null ? Codegen.empty() : this.value;
    }

    public ServicePrincipalOauth2PermissionScopeGetArgs(
        @Nullable Output<String> adminConsentDescription,
        @Nullable Output<String> adminConsentDisplayName,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<String> id,
        @Nullable Output<String> type,
        @Nullable Output<String> userConsentDescription,
        @Nullable Output<String> userConsentDisplayName,
        @Nullable Output<String> value) {
        this.adminConsentDescription = adminConsentDescription;
        this.adminConsentDisplayName = adminConsentDisplayName;
        this.enabled = enabled;
        this.id = id;
        this.type = type;
        this.userConsentDescription = userConsentDescription;
        this.userConsentDisplayName = userConsentDisplayName;
        this.value = value;
    }

    private ServicePrincipalOauth2PermissionScopeGetArgs() {
        this.adminConsentDescription = Codegen.empty();
        this.adminConsentDisplayName = Codegen.empty();
        this.enabled = Codegen.empty();
        this.id = Codegen.empty();
        this.type = Codegen.empty();
        this.userConsentDescription = Codegen.empty();
        this.userConsentDisplayName = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalOauth2PermissionScopeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> adminConsentDescription;
        private @Nullable Output<String> adminConsentDisplayName;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<String> id;
        private @Nullable Output<String> type;
        private @Nullable Output<String> userConsentDescription;
        private @Nullable Output<String> userConsentDisplayName;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalOauth2PermissionScopeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminConsentDescription = defaults.adminConsentDescription;
    	      this.adminConsentDisplayName = defaults.adminConsentDisplayName;
    	      this.enabled = defaults.enabled;
    	      this.id = defaults.id;
    	      this.type = defaults.type;
    	      this.userConsentDescription = defaults.userConsentDescription;
    	      this.userConsentDisplayName = defaults.userConsentDisplayName;
    	      this.value = defaults.value;
        }

        public Builder adminConsentDescription(@Nullable Output<String> adminConsentDescription) {
            this.adminConsentDescription = adminConsentDescription;
            return this;
        }
        public Builder adminConsentDescription(@Nullable String adminConsentDescription) {
            this.adminConsentDescription = Codegen.ofNullable(adminConsentDescription);
            return this;
        }
        public Builder adminConsentDisplayName(@Nullable Output<String> adminConsentDisplayName) {
            this.adminConsentDisplayName = adminConsentDisplayName;
            return this;
        }
        public Builder adminConsentDisplayName(@Nullable String adminConsentDisplayName) {
            this.adminConsentDisplayName = Codegen.ofNullable(adminConsentDisplayName);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder userConsentDescription(@Nullable Output<String> userConsentDescription) {
            this.userConsentDescription = userConsentDescription;
            return this;
        }
        public Builder userConsentDescription(@Nullable String userConsentDescription) {
            this.userConsentDescription = Codegen.ofNullable(userConsentDescription);
            return this;
        }
        public Builder userConsentDisplayName(@Nullable Output<String> userConsentDisplayName) {
            this.userConsentDisplayName = userConsentDisplayName;
            return this;
        }
        public Builder userConsentDisplayName(@Nullable String userConsentDisplayName) {
            this.userConsentDisplayName = Codegen.ofNullable(userConsentDisplayName);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Codegen.ofNullable(value);
            return this;
        }        public ServicePrincipalOauth2PermissionScopeGetArgs build() {
            return new ServicePrincipalOauth2PermissionScopeGetArgs(adminConsentDescription, adminConsentDisplayName, enabled, id, type, userConsentDescription, userConsentDisplayName, value);
        }
    }
}
