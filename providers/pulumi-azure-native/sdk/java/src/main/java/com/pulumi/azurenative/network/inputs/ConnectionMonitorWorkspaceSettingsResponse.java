// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the settings for producing output into a log analytics workspace.
 * 
 */
public final class ConnectionMonitorWorkspaceSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConnectionMonitorWorkspaceSettingsResponse Empty = new ConnectionMonitorWorkspaceSettingsResponse();

    /**
     * Log analytics workspace resource ID.
     * 
     */
    @Import(name="workspaceResourceId")
      private final @Nullable String workspaceResourceId;

    public Optional<String> workspaceResourceId() {
        return this.workspaceResourceId == null ? Optional.empty() : Optional.ofNullable(this.workspaceResourceId);
    }

    public ConnectionMonitorWorkspaceSettingsResponse(@Nullable String workspaceResourceId) {
        this.workspaceResourceId = workspaceResourceId;
    }

    private ConnectionMonitorWorkspaceSettingsResponse() {
        this.workspaceResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorWorkspaceSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String workspaceResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorWorkspaceSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workspaceResourceId = defaults.workspaceResourceId;
        }

        public Builder workspaceResourceId(@Nullable String workspaceResourceId) {
            this.workspaceResourceId = workspaceResourceId;
            return this;
        }        public ConnectionMonitorWorkspaceSettingsResponse build() {
            return new ConnectionMonitorWorkspaceSettingsResponse(workspaceResourceId);
        }
    }
}
