// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datadog.inputs;

import com.pulumi.azurenative.datadog.inputs.DatadogInstallMethodResponse;
import com.pulumi.azurenative.datadog.inputs.DatadogLogsAgentResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatadogHostMetadataResponse extends com.pulumi.resources.InvokeArgs {

    public static final DatadogHostMetadataResponse Empty = new DatadogHostMetadataResponse();

    /**
     * The agent version.
     * 
     */
    @Import(name="agentVersion")
      private final @Nullable String agentVersion;

    public Optional<String> agentVersion() {
        return this.agentVersion == null ? Optional.empty() : Optional.ofNullable(this.agentVersion);
    }

    @Import(name="installMethod")
      private final @Nullable DatadogInstallMethodResponse installMethod;

    public Optional<DatadogInstallMethodResponse> installMethod() {
        return this.installMethod == null ? Optional.empty() : Optional.ofNullable(this.installMethod);
    }

    @Import(name="logsAgent")
      private final @Nullable DatadogLogsAgentResponse logsAgent;

    public Optional<DatadogLogsAgentResponse> logsAgent() {
        return this.logsAgent == null ? Optional.empty() : Optional.ofNullable(this.logsAgent);
    }

    public DatadogHostMetadataResponse(
        @Nullable String agentVersion,
        @Nullable DatadogInstallMethodResponse installMethod,
        @Nullable DatadogLogsAgentResponse logsAgent) {
        this.agentVersion = agentVersion;
        this.installMethod = installMethod;
        this.logsAgent = logsAgent;
    }

    private DatadogHostMetadataResponse() {
        this.agentVersion = null;
        this.installMethod = null;
        this.logsAgent = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatadogHostMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentVersion;
        private @Nullable DatadogInstallMethodResponse installMethod;
        private @Nullable DatadogLogsAgentResponse logsAgent;

        public Builder() {
    	      // Empty
        }

        public Builder(DatadogHostMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentVersion = defaults.agentVersion;
    	      this.installMethod = defaults.installMethod;
    	      this.logsAgent = defaults.logsAgent;
        }

        public Builder agentVersion(@Nullable String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public Builder installMethod(@Nullable DatadogInstallMethodResponse installMethod) {
            this.installMethod = installMethod;
            return this;
        }
        public Builder logsAgent(@Nullable DatadogLogsAgentResponse logsAgent) {
            this.logsAgent = logsAgent;
            return this;
        }        public DatadogHostMetadataResponse build() {
            return new DatadogHostMetadataResponse(agentVersion, installMethod, logsAgent);
        }
    }
}
