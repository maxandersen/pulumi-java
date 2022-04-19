// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApiOauth2PermissionScope {
    /**
     * Delegated permission description that appears in all tenant-wide admin consent experiences, intended to be read by an administrator granting the permission on behalf of all users.
     * 
     */
    private final @Nullable String adminConsentDescription;
    /**
     * Display name for the delegated permission, intended to be read by an administrator granting the permission on behalf of all users.
     * 
     */
    private final @Nullable String adminConsentDisplayName;
    /**
     * Determines if the permission scope is enabled. Defaults to `true`.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * The unique identifier of the delegated permission. Must be a valid UUID.
     * 
     */
    private final String id;
    /**
     * Whether this delegated permission should be considered safe for non-admin users to consent to on behalf of themselves, or whether an administrator should be required for consent to the permissions. Defaults to `User`. Possible values are `User` or `Admin`.
     * 
     */
    private final @Nullable String type;
    /**
     * Delegated permission description that appears in the end user consent experience, intended to be read by a user consenting on their own behalf.
     * 
     */
    private final @Nullable String userConsentDescription;
    /**
     * Display name for the delegated permission that appears in the end user consent experience.
     * 
     */
    private final @Nullable String userConsentDisplayName;
    /**
     * The value that is used for the `scp` claim in OAuth 2.0 access tokens.
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private ApplicationApiOauth2PermissionScope(
        @CustomType.Parameter("adminConsentDescription") @Nullable String adminConsentDescription,
        @CustomType.Parameter("adminConsentDisplayName") @Nullable String adminConsentDisplayName,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("userConsentDescription") @Nullable String userConsentDescription,
        @CustomType.Parameter("userConsentDisplayName") @Nullable String userConsentDisplayName,
        @CustomType.Parameter("value") @Nullable String value) {
        this.adminConsentDescription = adminConsentDescription;
        this.adminConsentDisplayName = adminConsentDisplayName;
        this.enabled = enabled;
        this.id = id;
        this.type = type;
        this.userConsentDescription = userConsentDescription;
        this.userConsentDisplayName = userConsentDisplayName;
        this.value = value;
    }

    /**
     * Delegated permission description that appears in all tenant-wide admin consent experiences, intended to be read by an administrator granting the permission on behalf of all users.
     * 
    */
    public Optional<String> adminConsentDescription() {
        return Optional.ofNullable(this.adminConsentDescription);
    }
    /**
     * Display name for the delegated permission, intended to be read by an administrator granting the permission on behalf of all users.
     * 
    */
    public Optional<String> adminConsentDisplayName() {
        return Optional.ofNullable(this.adminConsentDisplayName);
    }
    /**
     * Determines if the permission scope is enabled. Defaults to `true`.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * The unique identifier of the delegated permission. Must be a valid UUID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Whether this delegated permission should be considered safe for non-admin users to consent to on behalf of themselves, or whether an administrator should be required for consent to the permissions. Defaults to `User`. Possible values are `User` or `Admin`.
     * 
    */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * Delegated permission description that appears in the end user consent experience, intended to be read by a user consenting on their own behalf.
     * 
    */
    public Optional<String> userConsentDescription() {
        return Optional.ofNullable(this.userConsentDescription);
    }
    /**
     * Display name for the delegated permission that appears in the end user consent experience.
     * 
    */
    public Optional<String> userConsentDisplayName() {
        return Optional.ofNullable(this.userConsentDisplayName);
    }
    /**
     * The value that is used for the `scp` claim in OAuth 2.0 access tokens.
     * 
    */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApiOauth2PermissionScope defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String adminConsentDescription;
        private @Nullable String adminConsentDisplayName;
        private @Nullable Boolean enabled;
        private String id;
        private @Nullable String type;
        private @Nullable String userConsentDescription;
        private @Nullable String userConsentDisplayName;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApiOauth2PermissionScope defaults) {
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

        public Builder adminConsentDescription(@Nullable String adminConsentDescription) {
            this.adminConsentDescription = adminConsentDescription;
            return this;
        }
        public Builder adminConsentDisplayName(@Nullable String adminConsentDisplayName) {
            this.adminConsentDisplayName = adminConsentDisplayName;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder userConsentDescription(@Nullable String userConsentDescription) {
            this.userConsentDescription = userConsentDescription;
            return this;
        }
        public Builder userConsentDisplayName(@Nullable String userConsentDisplayName) {
            this.userConsentDisplayName = userConsentDisplayName;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public ApplicationApiOauth2PermissionScope build() {
            return new ApplicationApiOauth2PermissionScope(adminConsentDescription, adminConsentDisplayName, enabled, id, type, userConsentDescription, userConsentDisplayName, value);
        }
    }
}
