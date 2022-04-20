// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.blueprint.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines how resources deployed by a blueprint assignment are locked.
 * 
 */
public final class AssignmentLockSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final AssignmentLockSettingsResponse Empty = new AssignmentLockSettingsResponse();

    /**
     * List of management operations that are excluded from blueprint locks. Up to 200 actions are permitted. If the lock mode is set to &#39;AllResourcesReadOnly&#39;, then the following actions are automatically appended to &#39;excludedActions&#39;: &#39;*{@literal /}read&#39;, &#39;Microsoft.Network/virtualNetworks/subnets/join/action&#39; and &#39;Microsoft.Authorization/locks/delete&#39;. If the lock mode is set to &#39;AllResourcesDoNotDelete&#39;, then the following actions are automatically appended to &#39;excludedActions&#39;: &#39;Microsoft.Authorization/locks/delete&#39;. Duplicate actions will get removed.
     * 
     */
    @Import(name="excludedActions")
      private final @Nullable List<String> excludedActions;

    public List<String> excludedActions() {
        return this.excludedActions == null ? List.of() : this.excludedActions;
    }

    /**
     * List of AAD principals excluded from blueprint locks. Up to 5 principals are permitted.
     * 
     */
    @Import(name="excludedPrincipals")
      private final @Nullable List<String> excludedPrincipals;

    public List<String> excludedPrincipals() {
        return this.excludedPrincipals == null ? List.of() : this.excludedPrincipals;
    }

    /**
     * Lock mode.
     * 
     */
    @Import(name="mode")
      private final @Nullable String mode;

    public Optional<String> mode() {
        return this.mode == null ? Optional.empty() : Optional.ofNullable(this.mode);
    }

    public AssignmentLockSettingsResponse(
        @Nullable List<String> excludedActions,
        @Nullable List<String> excludedPrincipals,
        @Nullable String mode) {
        this.excludedActions = excludedActions;
        this.excludedPrincipals = excludedPrincipals;
        this.mode = mode;
    }

    private AssignmentLockSettingsResponse() {
        this.excludedActions = List.of();
        this.excludedPrincipals = List.of();
        this.mode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignmentLockSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> excludedActions;
        private @Nullable List<String> excludedPrincipals;
        private @Nullable String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignmentLockSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedActions = defaults.excludedActions;
    	      this.excludedPrincipals = defaults.excludedPrincipals;
    	      this.mode = defaults.mode;
        }

        public Builder excludedActions(@Nullable List<String> excludedActions) {
            this.excludedActions = excludedActions;
            return this;
        }
        public Builder excludedActions(String... excludedActions) {
            return excludedActions(List.of(excludedActions));
        }
        public Builder excludedPrincipals(@Nullable List<String> excludedPrincipals) {
            this.excludedPrincipals = excludedPrincipals;
            return this;
        }
        public Builder excludedPrincipals(String... excludedPrincipals) {
            return excludedPrincipals(List.of(excludedPrincipals));
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }        public AssignmentLockSettingsResponse build() {
            return new AssignmentLockSettingsResponse(excludedActions, excludedPrincipals, mode);
        }
    }
}
